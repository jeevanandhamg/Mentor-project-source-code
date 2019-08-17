package com.mentorondemand.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Technologies")
public class Technologies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "TOC")
	private String TOC;
	
	@Column(name = "duration")
	private String duration;
	
	@Column(name = "prerequites")
	private String preRequites;

	public Technologies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Technologies(long id, String name, String tOC, String duration, String preRequites) {
		super();
		this.id = id;
		this.name = name;
		TOC = tOC;
		this.duration = duration;
		this.preRequites = preRequites;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTOC() {
		return TOC;
	}

	public void setTOC(String tOC) {
		TOC = tOC;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getPreRequites() {
		return preRequites;
	}

	public void setPreRequites(String preRequites) {
		this.preRequites = preRequites;
	}

	@Override
	public String toString() {
		return "Technologies [id=" + id + ", name=" + name + ", TOC=" + TOC + ", duration=" + duration
				+ ", preRequites=" + preRequites + "]";
	}
	
	
}
