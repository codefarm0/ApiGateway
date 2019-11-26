package com.gl.docportaldrivergateway;

import com.gl.docportaldrivergateway.filter.Prefilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class DocportaldriverGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocportaldriverGatewayApplication.class, args);
	}

	/*@Bean
	public Prefilter prefilter(){
		return new Prefilter();
	}*/
}
