package com.nineleaps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.nineleaps.config.GithubProperties;
//
@SpringBootApplication
@EnableConfigurationProperties(GithubProperties.class)
public class IssuesDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssuesDashboardApplication.class, args);
	}

}
