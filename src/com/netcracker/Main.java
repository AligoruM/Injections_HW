package com.netcracker;

import com.netcracker.devices.Computer;
import com.netcracker.devices.Laptop;
import com.netcracker.devices.Server;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //task11();
        //task12();
        //task21();
        //task22();
        //task3();
        //task4();
        task5();
    }

    static void task11(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-CI.xml");
        letsGoTask1(context);
    }
    static void task12(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-SI.xml");
        letsGoTask1(context);
    }

    static void task21(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-server-CI.xml");
        letsGoTask2(context);
    }
    static void task22(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-server-SI.xml");
        letsGoTask2(context);
    }

    static void task3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-parent.xml");
        Laptop laptop = (Laptop)context.getBean("laptop");
        System.out.println(laptop);
    }

    static void task4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-SPeL.xml");
        Computer computer = (Computer)context.getBean("someConfigurableComputer");
        System.out.println(computer);
    }

    static void task5(){

    }

    static void letsGoTask1(ApplicationContext context){
        Computer superPuper = (Computer)context.getBean("gamingPC");
        Computer slabiyPC = (Computer)context.getBean("pcInUniversity");

        System.out.println(superPuper);
        System.out.println(slabiyPC);
        System.out.println();
        System.out.println(superPuper.getCpu());
        System.out.println(slabiyPC.getCpu());
        System.out.println();
        System.out.println(superPuper.getMemoryGB());
        System.out.println(slabiyPC.getMemoryGB());
        System.out.println();
        superPuper.getCpu().showBlueScreenOfDeath();
        slabiyPC.getCpu().showBlueScreenOfDeath();
    }

    static void letsGoTask2(ApplicationContext context){
        Server serverList = (Server)context.getBean("serverList");
        Server serverSet = (Server)context.getBean("serverSet");
        Server serverMap = (Server)context.getBean("serverMap");
        System.out.println(serverList.toStringList());
        System.out.println(serverSet.toStringSet());
        System.out.println(serverMap.toStringMap());
    }
}




































