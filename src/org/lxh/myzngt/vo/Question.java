package org.lxh.myzngt.vo;

import java.util.Date;
import java.util.Set;

public class Question {
	private int qid ;
	private String title ;
	private String content ;
	private int itemid ;
	private int subid ;
	private String userid ;
	private String grade ;
	private int offerscore ;
	private int status ;
	private Date questiontime ;
	private int clickcount ;
	private int acceptflag ;
	private int commenflag ;
	
	private Set answers ;
	
	public int getAcceptflag() {
		return acceptflag;
	}
	public void setAcceptflag(int acceptflag) {
		this.acceptflag = acceptflag;
	}
	public int getClickcount() {
		return clickcount;
	}
	public void setClickcount(int clickcount) {
		this.clickcount = clickcount;
	}
	public int getCommenflag() {
		return commenflag;
	}
	public void setCommenflag(int commenflag) {
		this.commenflag = commenflag;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getOfferscore() {
		return offerscore;
	}
	public void setOfferscore(int offerscore) {
		this.offerscore = offerscore;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public Date getQuestiontime() {
		return questiontime;
	}
	public void setQuestiontime(Date questiontime) {
		this.questiontime = questiontime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Set getAnswers() {
		return answers;
	}
	public void setAnswers(Set answers) {
		this.answers = answers;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
