package com.study.studyspringboot;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ===================
 * User ：TT
 * Date ：2018/2/8
 * Time ：1:50
 * ===================
 */

public class TestJava {
/*    public static void main(String[] args){
        Long time = System.nanoTime();
        System.out.println(time);
    }*/

    @Test
    public void GetInetAddress(){
        InetAddress ia = null;
        try {
            ia = InetAddress.getLocalHost();
            String ip = ia.getHostAddress();
            System.out.println(ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
