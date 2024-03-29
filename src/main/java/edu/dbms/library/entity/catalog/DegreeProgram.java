package edu.dbms.library.entity.catalog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.dbms.library.entity.AbsEntity;

@Entity
@Table(name="degree_program")
public class DegreeProgram extends AbsEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	@ManyToOne
	private Classification classification;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Classification getClassfication() {
		return classification;
	}

	public void setClassfication(Classification classfication) {
		this.classification = classfication;
	}
	
	
}
