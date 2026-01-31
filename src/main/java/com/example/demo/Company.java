package com.example.demo;

import java.io.Serializable;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@SuppressWarnings("serial")
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Company implements Serializable{

	@NotNull(message = "ID is required")
	Integer id;

	@NotNull(message = "Company name is required")
	String company;

	String address;

}
