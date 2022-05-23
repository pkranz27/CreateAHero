package com.MakeAHero.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Profession {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "profession_id")
	private Long id;
	
	private String name;
	
	private String description;
	
	private String image;
	
	private Integer might;
	
	private Integer intellegence;
}
