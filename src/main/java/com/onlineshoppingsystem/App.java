package com.onlineshoppingsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages= {"com.onlineshoppingsystem"})
@RestController
@MapperScan("com.onlineshoppingsystem.dao")
public class App 
{
	@RequestMapping("/")
	public String home() {		
		return "online shopping system";
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);
    }
}
