package com.example.Movie.booking;

import com.example.Movie.booking.controller.TheaterController;
import com.example.Movie.booking.model.Theater;
import com.example.Movie.booking.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = TheaterController.class))
public class MoviebookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviebookingApplication.class, args);
	}

}