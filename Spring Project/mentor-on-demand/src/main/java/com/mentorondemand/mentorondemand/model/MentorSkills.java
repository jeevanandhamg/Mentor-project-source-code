package com.mentorondemand.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mentor_skills")
public class MentorSkills {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToOne
	@JoinColumn(name="mentor_id")
	private Mentor mid;
	
	@ManyToOne
	@JoinColumn(name="technology_id")
	private Technologies tid;
	
	@Column(name = "self_rating")
	private String selfRating;
	
	@Column(name = "year_of_experience")
	private String yearOfExperience;
	
	@Column(name = "trainings_delivered")
	private String trainingsDelivered;
	
	@Column(name = "facilities_offered")
	private String facilitiesOffered;

	public MentorSkills() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MentorSkills(long id, Mentor mid, Technologies tid, String selfRating, String yearOfExperience,
			String trainingsDelivered, String facilitiesOffered) {
		super();
		this.id = id;
		this.mid = mid;
		this.tid = tid;
		this.selfRating = selfRating;
		this.yearOfExperience = yearOfExperience;
		this.trainingsDelivered = trainingsDelivered;
		this.facilitiesOffered = facilitiesOffered;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Mentor getMid() {
		return mid;
	}

	public void setMid(Mentor mid) {
		this.mid = mid;
	}

	public Technologies getTid() {
		return tid;
	}

	public void setTid(Technologies tid) {
		this.tid = tid;
	}

	public String getSelfRating() {
		return selfRating;
	}

	public void setSelfRating(String selfRating) {
		this.selfRating = selfRating;
	}

	public String getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(String yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public String getTrainingsDelivered() {
		return trainingsDelivered;
	}

	public void setTrainingsDelivered(String trainingsDelivered) {
		this.trainingsDelivered = trainingsDelivered;
	}

	public String getFacilitiesOffered() {
		return facilitiesOffered;
	}

	public void setFacilitiesOffered(String facilitiesOffered) {
		this.facilitiesOffered = facilitiesOffered;
	}

	@Override
	public String toString() {
		return "MentorSkills [id=" + id + ", mid=" + mid + ", tid=" + tid + ", selfRating=" + selfRating
				+ ", yearOfExperience=" + yearOfExperience + ", trainingsDelivered=" + trainingsDelivered
				+ ", facilitiesOffered=" + facilitiesOffered + "]";
	}
}
