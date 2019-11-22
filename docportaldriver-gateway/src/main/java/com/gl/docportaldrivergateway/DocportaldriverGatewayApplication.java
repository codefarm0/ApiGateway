package com.gl.docportaldrivergateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class DocportaldriverGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocportaldriverGatewayApplication.class, args);
	}

}
