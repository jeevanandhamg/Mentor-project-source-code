package com.mentorondemand.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "trainings")
public class Trainings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User uid;
	
	@ManyToOne
	@JoinColumn(name="mentor_id")
	private Mentor mid;
	
	@ManyToOne
	@JoinColumn(name="technology_id")
	private Technologies tid;
	
	@Column(name = "start_date")
	private String startDate;
	
	@Column(name = "end_date")
	private String endDate;
	
	@Column(name = "amount_received")
	private String amountReceived;

	public Trainings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trainings(long id, User uid, Mentor mid, Technologies tid, String startDate, String endDate,
			String amountReceived) {
		super();
		this.id = id;
		this.uid = uid;
		this.mid = mid;
		this.tid = tid;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amountReceived = amountReceived;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUid() {
		return uid;
	}

	public void setUid(User uid) {
		this.uid = uid;
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

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getAmountReceived() {
		return amountReceived;
	}

	public void setAmountReceived(String amountReceived) {
		this.amountReceived = amountReceived;
	}

	@Override
	public String toString() {
		return "Trainings [id=" + id + ", uid=" + uid + ", mid=" + mid + ", tid=" + tid + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", amountReceived=" + amountReceived + "]";
	}
}
