package org.lxh.myzngt.dao;

import java.util.List;

import org.lxh.myzngt.vo.Question;

public interface IQuestionDAO {
	// ����Item����ȫ������������
	public int getByItemCount(int itemid) throws Exception;

	// ����itemid����ȫ������������
	public int getBySubCount(int subid) throws Exception;

	// �����Ƽ�����ȫ������������
	public int getByCommenCount(int commen) throws Exception;

	// ����״̬����ȫ������������
	public int getByStatusCount(int status) throws Exception;

	// ����ģ����ѯ����ȫ������������
	public int getByLikeCount(String cond) throws Exception;

	// ��������
	public void insert(Question question) throws Exception;

	// �����Ƽ�����
	// 1���Ƽ�
	// 0�����Ƽ�
	public List queryByCommemflag(int commenflag, int currentPage, int lineSize)
			throws Exception;

	// �����װ��������
	// 1��δ���
	// 2���ѽ��
	// 3���������
	public List queryByStatus(int status, int currentPage, int lineSize)
			throws Exception;

	// ����IDȡ������
	public Question queryById(int qid) throws Exception;

	// �޸��������
	public void updateClickcount(int qid) throws Exception;

	// ��һ����Ŀ����
	public List queryByItem(int itemid, int currentPage, int lineSize)
			throws Exception;

	// ��������Ŀ����
	public List queryBySub(int subid, int currentPage, int lineSize)
			throws Exception;

	// ģ����ѯ
	public List queryByLike(String cond, int currentPage, int lineSize)
			throws Exception;

	// �г�һ���û������ȫ������
	public List queryByUserId(String userid, int currentPage, int lineSize)
			throws Exception;

	// ���һ���û����������
	public int getByUseridCount(String userid) throws Exception;

	// �г��û��ش��������
	public List queryByUserAnswer(String userid, int currentPage, int lineSize);

	// �г��û��ش�������������
	public int getByUserAnswer(String userid) throws Exception;

	// �г�һ���û������ɵ�����
	public List queryByAccept(String userid, int status, int currentPage,
			int lineSize) throws Exception;

	// �г�һ���û����������������
	public int getByAccept(String userid, int status) throws Exception;

	// ���Ƿ��Ѳ��ɹ�
	public void updateAccept(int qid, int accept) throws Exception;

	// ���ô�״̬�������⡢δ������ѽ��
	public void updateStatus(int qid, int status) throws Exception;

	// ɾ������
	public void delete(int qid) throws Exception;

	// �г�ȫ������

	public List queryAll(int currentPage, int lineSize) throws Exception;

	// �õ�ȫ�������ݴ�С
	public int getAllCount() throws Exception;
	
	// �����Ƽ�����
	public void updateCommen(int qid,int commen) throws Exception ;
}
