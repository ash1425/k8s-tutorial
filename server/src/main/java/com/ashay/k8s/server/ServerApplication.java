package com.ashay.k8s.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping("/server")
@Slf4j
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

    @GetMapping
    public String get() throws UnknownHostException {
        String port = Optional.ofNullable(System.getenv("SERVER_PORT")).orElse("8080");
        log.info("Request received");
        return String.format("I am running at %s:%s", InetAddress.getLocalHost().getHostAddress(), port);
    }
}
