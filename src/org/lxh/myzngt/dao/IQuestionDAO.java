package org.lxh.myzngt.dao;

import java.util.List;

import org.lxh.myzngt.vo.Question;

public interface IQuestionDAO {
	// 根据Item查找全部的问题数量
	public int getByItemCount(int itemid) throws Exception;

	// 根据itemid查找全部的问题数量
	public int getBySubCount(int subid) throws Exception;

	// 根据推荐查找全部的问题数量
	public int getByCommenCount(int commen) throws Exception;

	// 根据状态查找全部的问题数量
	public int getByStatusCount(int status) throws Exception;

	// 根据模糊查询查找全部的问题数量
	public int getByLikeCount(String cond) throws Exception;

	// 增加问题
	public void insert(Question question) throws Exception;

	// 查找推荐问题
	// 1：推荐
	// 0：不推荐
	public List queryByCommemflag(int commenflag, int currentPage, int lineSize)
			throws Exception;

	// 按解决装查找问题
	// 1：未解决
	// 2：已解决
	// 3：无满意答案
	public List queryByStatus(int status, int currentPage, int lineSize)
			throws Exception;

	// 根据ID取出内容
	public Question queryById(int qid) throws Exception;

	// 修改浏览次数
	public void updateClickcount(int qid) throws Exception;

	// 按一级栏目检索
	public List queryByItem(int itemid, int currentPage, int lineSize)
			throws Exception;

	// 按二级栏目检索
	public List queryBySub(int subid, int currentPage, int lineSize)
			throws Exception;

	// 模糊查询
	public List queryByLike(String cond, int currentPage, int lineSize)
			throws Exception;

	// 列出一个用户提出的全部问题
	public List queryByUserId(String userid, int currentPage, int lineSize)
			throws Exception;

	// 求出一个用户问题的数量
	public int getByUseridCount(String userid) throws Exception;

	// 列出用户回答过的问题
	public List queryByUserAnswer(String userid, int currentPage, int lineSize);

	// 列出用户回答过的问题的数量
	public int getByUserAnswer(String userid) throws Exception;

	// 列出一个用户被采纳的问题
	public List queryByAccept(String userid, int status, int currentPage,
			int lineSize) throws Exception;

	// 列出一个用户被采纳问题的数量
	public int getByAccept(String userid, int status) throws Exception;

	// 答案是否已采纳够
	public void updateAccept(int qid, int accept) throws Exception;

	// 设置答案状态：不满意、未解决、已解决
	public void updateStatus(int qid, int status) throws Exception;

	// 删除问题
	public void delete(int qid) throws Exception;

	// 列出全部数据

	public List queryAll(int currentPage, int lineSize) throws Exception;

	// 得到全部的数据大小
	public int getAllCount() throws Exception;
	
	// 设置推荐问题
	public void updateCommen(int qid,int commen) throws Exception ;
}
