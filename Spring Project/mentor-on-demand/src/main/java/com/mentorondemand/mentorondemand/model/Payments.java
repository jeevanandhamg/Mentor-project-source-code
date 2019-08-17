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
@Table(name = "payments")
public class Payments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="mentor_id")
	private Mentor mid;
	
	@ManyToOne
	@JoinColumn(name="training_id")
	private Trainings trainingId;
	
	@Column(name = "txn_type")
	private String TxnType;
	
	@Column(name = "amount")
	private String amount;
	
	@Column(name = "datetime")
	private String dateTime;
	
	@Column(name = "remarks")
	private String remarks;

	public Payments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payments(long id, Mentor mid, Trainings trainingId, String txnType, String amount, String dateTime,
			String remarks) {
		super();
		this.id = id;
		this.mid = mid;
		this.trainingId = trainingId;
		TxnType = txnType;
		this.amount = amount;
		this.dateTime = dateTime;
		this.remarks = remarks;
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

	public Trainings getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(Trainings trainingId) {
		this.trainingId = trainingId;
	}

	public String getTxnType() {
		return TxnType;
	}

	public void setTxnType(String txnType) {
		TxnType = txnType;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "Payments [id=" + id + ", mid=" + mid + ", trainingId=" + trainingId + ", TxnType=" + TxnType
				+ ", amount=" + amount + ", dateTime=" + dateTime + ", remarks=" + remarks + "]";
	}
	
}
