package kz.iitu.atm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@SpringBootApplication
public class AtmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtmApplication.class, args);

//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//        ATM atm = context.getBean("atm", ATM.class);
//        atm.run();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        ATM atm = context.getBean("atm", ATM.class);
        System.out.println(atm);

        List<Account> accountList = context.getBean("accountList", List.class);
        System.out.println("accountList = " + accountList);

    }

}
