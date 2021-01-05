package cn.chenyang.research.tomcat.tomcatresearch;

import java.io.Serializable;

/**
 * @Package: cn.chenyang.research.tomcat.tomcatresearch
 * @Author: chenyang
 * @Date: 2021/1/4
 * @Version: 1.0
 */
public class Pair<K extends Serializable & Comparable,V> {

    private Pair() {
    }

    private K key;

    private V value;

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

