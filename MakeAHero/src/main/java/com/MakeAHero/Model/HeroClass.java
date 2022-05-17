package com.MakeAHero.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class HeroClass {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "heroclass_id")
	private Long id;
	
	private String name;
	
	private String description;
	
	private String image;
	
	private Integer might;
	
	private Integer intellegence;
}
