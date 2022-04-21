package com.misc;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.misc.dto.DBConfig;

@SpringBootApplication
public class MiscTopicsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiscTopicsDemoApplication.class, args);
		
	}
		@Bean
		@Profile(value = "test")
		public DBConfig getDBConfig() {
			DBConfig dbconfig = new DBConfig("jdbc:odbc://localhost:3306/testdb", "testuser");
			return dbconfig;
		}
	

}
