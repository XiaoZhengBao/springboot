package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
/**
 * springboot 启动类
 */
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
