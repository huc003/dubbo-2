package com.alibaba.dubbo.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ken.lj on 2017/7/31.
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        com.alibaba.dubbo.container.Main.main(args);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/provider.xml"});
//        context.start();
//
//        System.in.read(); // 按任意键退出
    }

}
