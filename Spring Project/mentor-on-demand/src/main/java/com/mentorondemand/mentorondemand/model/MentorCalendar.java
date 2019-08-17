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
@Table(name = "mentor_calendar")
public class MentorCalendar {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="mentor_id")
	private Mentor mid;
	
	@Column(name = "start_time")
	private String startTime;
	
	@Column(name = "end_time")
	private String endTime;
	
	@Column(name = "start_date")
	private String startDate;
	
	@Column(name = "end_date")
	private String endDate;

	public MentorCalendar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MentorCalendar(long id, Mentor mid, String startTime, String endTime, String startDate, String endDate) {
		super();
		this.id = id;
		this.mid = mid;
		this.startTime = startTime;
		this.endTime = endTime;
		this.startDate = startDate;
		this.endDate = endDate;
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

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
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

	@Override
	public String toString() {
		return "MentorCalendar [id=" + id + ", mid=" + mid + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
}
