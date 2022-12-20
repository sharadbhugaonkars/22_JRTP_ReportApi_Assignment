package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="planholder_tab")
public class PlanHolder {
	
	@Id
	private Integer custId;
	
	private String name;
	
	private String gen;
	
	private String email;
	
	private Integer mobnum;
	
    private String planName;
	
	private String planStatus;
	

}
