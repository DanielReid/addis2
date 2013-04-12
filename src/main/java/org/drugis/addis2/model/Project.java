package org.drugis.addis2.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;

@Entity
public @Data class Project {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id;
	@ManyToOne public User owner;
	@Column public String shortName;
	@Column public String description;
	@Column public String objective;
	@Column @CreatedDate public Date createdAt;
	@Column public Date updatedAt;
	@ManyToOne(cascade = CascadeType.ALL) public Population population;
}
