package com.hz.webscraper;

/**
 * @author ashok
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.hz.webscraper"})
public class WebScraperApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebScraperApplication.class, args);
	}

}
