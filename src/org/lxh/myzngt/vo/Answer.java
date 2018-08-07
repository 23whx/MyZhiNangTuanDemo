package org.lxh.myzngt.vo;

import java.util.Date;

public class Answer {
	private int aid ;
	private String quesans ;
	private String userid ;
	private String grade ;
	private Date anstime ;
	private int status ;
	private int qid ;
	
	private Question question ;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public Date getAnstime() {
		return anstime;
	}
	public void setAnstime(Date anstime) {
		this.anstime = anstime;
	}

	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuesans() {
		return quesans;
	}
	public void setQuesans(String quesans) {
		this.quesans = quesans;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
