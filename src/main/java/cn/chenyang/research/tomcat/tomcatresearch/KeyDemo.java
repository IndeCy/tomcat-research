package cn.chenyang.research.tomcat.tomcatresearch;

import java.io.Serializable;

/**
 * @Package: cn.chenyang.research.tomcat.tomcatresearch
 * @Author: chenyang
 * @Date: 2021/1/4
 * @Version: 1.0
 */
public class KeyDemo implements Comparable<KeyDemo>,Serializable {

    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public int compareTo(KeyDemo o) {
        return this.val - o.getVal();
    }
}
