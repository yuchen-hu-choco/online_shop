package onlineShop;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import onlineShop.log.PaymentAction;

public class Application {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("payment.xml"); // container
        PaymentAction paymentAction = (PaymentAction) container.getBean("paymentAction");
        paymentAction.pay(new BigDecimal(2)); 
     }
}
