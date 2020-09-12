package onlineShop.log;

import org.springframework.stereotype.Component;

@Component
public class ServerLogger implements Logger {
    public void log(String info) {
        System.out.println("server log = " + info);
    }
}
