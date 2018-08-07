package org.lxh.myzngt.dao;

import java.util.List;

import org.lxh.myzngt.vo.Answer;

public interface IAnswerDAO {
	// �ش�����
	public void insert(Answer answer) throws Exception ;
	// ȡ���û����˵Ļش��¼
	public List queryByUserid(String userid,int currentPage,int lineSize) throws Exception ;
	// ȡ���û����˻ش��¼������
	public int getByUseridCount(String userid) throws Exception ;
	// ����״̬
	public void updateStatus(int aid, int status) throws Exception ;
}
