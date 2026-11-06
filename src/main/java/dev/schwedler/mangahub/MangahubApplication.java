package dev.schwedler.mangahub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MangahubApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangahubApplication.class, args);
    }

}
