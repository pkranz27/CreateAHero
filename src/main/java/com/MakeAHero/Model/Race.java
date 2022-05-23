package com.MakeAHero.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Race {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "race_id")
	private Long id;
	
	private String name;
	
	private String description;
	
	private String image;

	private Integer might;
	
	private Integer intellegence;
}
