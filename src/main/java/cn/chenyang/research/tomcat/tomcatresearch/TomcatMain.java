package cn.chenyang.research.tomcat.tomcatresearch;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.apache.coyote.http11.Http11NioProtocol;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Package: cn.chenyang.research.tomcat.tomcatresearch
 * @Author: chenyang
 * @Date: 2020/12/29
 * @Version: 1.0
 */
public class TomcatMain {

    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        String basedir = "/Users/lastcy/tomcat-root";
        //根路径 用来存放文件
        tomcat.setBaseDir(basedir);
        //区分应用的资源路径
        tomcat.addContext("/demo",basedir);
        //将servlet绑定到哪个应用，需要与应用的资源路径保持一致
        tomcat.addServlet("/demo", "default", new HttpServlet() {
            @Override
            protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
                ServletOutputStream outputStream = resp.getOutputStream();
                PrintWriter printWriter = new PrintWriter(outputStream,true);
                printWriter.printf("get success");
                System.out.println("get method");
            }
            //添加当前servlet的资源路径
        }).addMapping("/test");
        //指定协议
        Http11NioProtocol http11NioProtocol = new Http11NioProtocol();
        Connector connector = new Connector(http11NioProtocol);
        //设置端口
        connector.setPort(8080);
        //设置连接器
        tomcat.setConnector(connector);

        tomcat.start();
    }
}
