package org.lxh.myzngt.dao;

import java.util.List;

import org.lxh.myzngt.vo.Answer;

public interface IAnswerDAO {
	// 回答问题
	public void insert(Answer answer) throws Exception ;
	// 取得用户个人的回答记录
	public List queryByUserid(String userid,int currentPage,int lineSize) throws Exception ;
	// 取得用户个人回答记录的数量
	public int getByUseridCount(String userid) throws Exception ;
	// 更新状态
	public void updateStatus(int aid, int status) throws Exception ;
}
