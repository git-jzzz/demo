
package com.example.demo;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * @author: jz
 * @Date: 2020/11/6 14:03
 * @Description:
 */
public class ThreadTest {
    public static void main(String[] args) throws Exception {
        System.out.println(new HelloThree("蒋征").call());
        new HelloOne().start();
        new HelloTwo().run();
    }
}

class HelloOne extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 3650; i++) {
                //每隔一天  输入hello一次  持续10年
                System.out.println("Hello World!" + new Date());
                Thread.sleep(1000 * 60 * 60 * 24);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class HelloTwo implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 3650*24*60*6 ; i++) {
                //每隔10s  输入hello一次  持续10年
                System.out.println("hello" + new Date());
                Thread.sleep(1000*10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class HelloThree implements Callable<String>{
    private String name;

    public HelloThree(String name){
        this.name=name;
    }


    @Override
    public String call() throws Exception {
        return name+"------你好ya"+new Date();
    }
}
