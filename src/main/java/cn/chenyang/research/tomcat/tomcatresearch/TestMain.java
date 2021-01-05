package cn.chenyang.research.tomcat.tomcatresearch;

import java.io.Serializable;

/**
 * @Package: cn.chenyang.research.tomcat.tomcatresearch
 * @Author: chenyang
 * @Date: 2021/1/4
 * @Version: 1.0
 */
public class TestMain {

    public static void main(String[] args) {
        KeyDemo keyDemo = new KeyDemo();
        Pair<? extends Comparable, Object> objectPair = new Pair<>(keyDemo,new Object());
        Pair<? extends Serializable, Object> objectPair2 = new Pair<>(keyDemo,new Object());

    }
}
