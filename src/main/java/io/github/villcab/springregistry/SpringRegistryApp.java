package io.github.villcab.springregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringRegistryApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringRegistryApp.class, args);
    }
}
