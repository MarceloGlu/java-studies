package app.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import app.core.beans.Car;

@Configuration
@ComponentScan // scan classes in base package
public class Config {
	
	private static int c = 101;
	
	@Bean("numberedCar")
	@Scope("prototype")
	public Car numberedCar() {
		return  null;
	}
	

}
