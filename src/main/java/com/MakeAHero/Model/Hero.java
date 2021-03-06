package com.MakeAHero.Model;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Hero {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "hero_id")
	private Long id;
	
	
	
	@Length(min = 3, message = "Your first name must have at least 3 characters")
    @NotEmpty(message = "Please provide a first name")
	private String firstname;
	@Length(min = 3, message = "Your last name must have at least 3 characters")
    @NotEmpty(message = "Please provide a last name")
	private String lastName;
	
	
	private Integer level = 0;
	
	
	@NotEmpty(message = "Please provide a Biography")
	private String biography;
	
	private Integer age= 0;
	
	private Integer skillPoints;
	
	private Integer might=0;
	
	private Integer intellegence = 0;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "race_id", referencedColumnName = "race_id")
	private Race race;
	
	
	@ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "profession_id", referencedColumnName = "profession_id")
	private Profession profession;
	
	@ElementCollection
	private List<Item> inventory;
	
		



	
	@CreationTimestamp
	private Date createdAt;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id")
	public User user;
	
}
