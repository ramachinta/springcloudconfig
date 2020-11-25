package com.micro.limit.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@ConfigurationProperties("limit-service")
@Setter@Getter@NoArgsConstructor@AllArgsConstructor
public class Configuration {
	private int min;
	private int max;
}
