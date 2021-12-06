package com.test.skoleni;

import com.test.skoleni.service.ItemService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(Main.class);

        // alt + enter
        ItemService itemService = applicationContext.getBean(ItemService.class);
        // sout ENTER
        System.out.println(itemService.getCount());
    }

}
