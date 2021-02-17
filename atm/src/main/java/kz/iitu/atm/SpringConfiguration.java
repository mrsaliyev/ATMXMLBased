package kz.iitu.atm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("kz.iitu.atm")
@PropertySource("application.properties")
public class SpringConfiguration {

    @Bean
    public List<Account> accountList() {
        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account(123, "Madiyar", 5555, 25000));
        accountList.add(new Account(456, "Aslan", 6666, 20000));
        accountList.add(new Account(789, "Sherkhan", 7777, 10000));
        accountList.add(new Account(321, "Daulet", 4444, 12000));

        return accountList;
    }
}
