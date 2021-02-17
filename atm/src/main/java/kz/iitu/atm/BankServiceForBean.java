package kz.iitu.atm;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bankService")
public class BankServiceForBean {
    String url;
    String user;
    String password;

    public BankServiceForBean(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public BankServiceForBean() {

    }

    @PostConstruct
    public void init(){
        openConnection();
    }

    @PreDestroy
    public void destroy(){
        closeConnection();
    }

    public void openConnection(){
        System.out.println("We opened connection!");
    }

    public void closeConnection(){
        System.out.println("We closed connection");
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
