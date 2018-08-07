package org.lxh.myzngt.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.lxh.myzngt.dao.IQuestionDAO;
import org.lxh.myzngt.vo.Question;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class IQuestionDAOImpl extends HibernateDaoSupport implements
		IQuestionDAO {

	public void insert(Question question) throws Exception {
		super.getSession().save(question);
	}

	public List queryByCommemflag(int commenflag, int currentPage, int lineSize)
			throws Exception {
		List all = null;
		String hql = "FROM Question AS q WHERE q.commenflag=? ORDER BY q.questiontime desc";
		Query q = super.getSession().createQuery(hql);
		q.setInteger(0, commenflag);
		q.setFirstResult((currentPage - 1) * lineSize);
		q.setMaxResults(lineSize);
		all = q.list();
		return all;
	}

	public List queryByStatus(int status, int currentPage, int lineSize)
			throws Exception {
		List all = null;
		String hql = "FROM Question AS q WHERE q.status=? ORDER BY q.questiontime desc";
		Query q = super.getSession().createQuery(hql);
		q.setInteger(0, status);
		q.setFirstResult((currentPage - 1) * lineSize);
		q.setMaxResults(lineSize);
		all = q.list();
		return all;
	}

	public Question queryById(int qid) throws Exception {
		Question que = null;
		String hql = "FROM Question AS q WHERE q.qid=?";
		Query q = super.getSession().createQuery(hql);
		q.setInteger(0, qid);
		List all = q.list();
		if (all.size() > 0) {
			que = (Question) all.get(0);
		}
		return que;
	}

	public void updateClickcount(int qid) throws Exception {
		String hql = "UPDATE Question SET clickcount=clickcount+1 WHERE qid=?";
		Query q = super.getSession().createQuery(hql);
		q.setInteger(0, qid);
		q.executeUpdate();
	}

	public List queryByItem(int itemid, int currentPage, int lineSize)
			throws Exception {
		List all = null;
		String hql = "FROM Question AS q WHERE q.itemid=?";
		Query q = super.getSession().createQuery(hql);
		q.setInteger(0, itemid);
		q.setFirstResult((currentPage - 1) * lineSize);
		q.setMaxResults(lineSize);
		all = q.list();
		return all;
	}

	public List queryByLike(String cond, int currentPage, int lineSize)
			throws Exception {
		List all = null;
		String hql = "FROM Question AS q WHERE q.title LIKE ? OR q.content LIKE ?";
		Query q = super.getSession().createQuery(hql);
		q.setString(0, "%" + cond + "%");
		q.setString(1, "%" + cond + "%");
		q.setFirstResult((currentPage - 1) * lineSize);
		q.setMaxResults(lineSize);
		all = q.list();
		return all;
	}

	public List queryBySub(int subid, int currentPage, int lineSize)
			throws Exception {
		List all = null;
		String hql = "FROM Question AS q WHERE q.subid=?";
		Query q = super.getSession().createQuery(hql);
		q.setInteger(0, subid);
		q.setFirstResult((currentPage - 1) * lineSize);
		q.setMaxResults(lineSize);
		all = q.list();
		return all;
	}

	public int getByCommenCount(int commen) throws Exception {
		int count = 0;
		String hql = "SELECT COUNT(q.qid) FROM Question AS q WHERE q.commenflag=?";
		Query q = super.getSession().createQuery(hql);
		q.setInteger(0, commen);
		List all = q.list();
		count = (Integer) all.get(0);
		return count;
	}

	public int getByItemCount(int itemid) throws Exception {
		int count = 0;
		String hql = "SELECT COUNT(q.qid) FROM Question AS q WHERE q.itemid=?";
		Query q = super.getSession().createQuery(hql);
		q.setInteger(0, itemid);
		List all = q.list();
		count = (Integer) all.get(0);
		return count;
	}

	public int getByLikeCount(String cond) throws Exception {
		int count = 0;
		String hql = "SELECT COUNT(q.qid) FROM Question AS q WHERE q.title LIKE ? OR q.content LIKE ?";
		Query q = super.getSession().createQuery(hql);
		q.setString(0, "%" + cond + "%");
		q.setString(1, "%" + cond + "%");
		List all = q.list();
		count = (Integer) all.get(0);
		return count;
	}

	public int getByStatusCount(int status) throws Exception {
		int count = 0;
		String hql = "SELECT COUNT(q.qid) FROM Question AS q WHERE q.status=?";
		Query q = super.getSession().createQuery(hql);
		q.setInteger(0, status);
		List all = q.list();
		count = (Integer) all.get(0);
		return count;
	}

	public int getBySubCount(int subid) throws Exception {
		int count = 0;
		String hql = "SELECT COUNT(q.qid) FROM Question AS q WHERE q.subid=?";
		Query q = super.getSession().createQuery(hql);
		q.setInteger(0, subid);
		List all = q.list();
		count = (Integer) all.get(0);
		return count;
	}

	public int getByUseridCount(String userid) throws Exception {
		int count = 0;
		String hql = "SELECT COUNT(q.qid) FROM Question AS q WHERE q.userid=?";
		Query q = super.getSession().createQuery(hql);
		q.setString(0, userid);
		List all = q.list();
		count = (Integer) all.get(0);
		return count;
	}

	public List queryByUserId(String userid, int currentPage, int lineSize)
			throws Exception {
		List all = null;
		String hql = "From Question AS q WHERE q.userid=? ";
		Query q = super.getSession().createQuery(hql);
		q.setString(0, userid);
		q.setFirstResult((currentPage - 1) * lineSize);
		q.setMaxResults(lineSize);
		all = q.list();
		return all;
	}

	public int getByUserAnswer(String userid) throws Exception {
		int count = 0;
		String hql = "SELECT COUNT(q.qid) FROM Question AS q WHERE q.qid IN (SELECT a.qid FROM Answer AS a WHERE a.userid=?)";
		Query q = super.getSession().createQuery(hql);
		q.setString(0, userid);
		List all = q.list();
		count = (Integer) all.get(0);
		return count;
	}

	public List queryByUserAnswer(String userid, int currentPage, int lineSize) {
		List all = null;
		String hql = "From Question AS q WHERE q.qid IN (SELECT a.qid FROM Answer AS a WHERE a.userid=?)";
		Query q = super.getSession().createQuery(hql);
		q.setString(0, userid);
		q.setFirstResult((currentPage - 1) * lineSize);
		q.setMaxResults(lineSize);
		all = q.list();
		return all;
	}

	public int getByAccept(String userid, int status) throws Exception {
		int count = 0;
		String hql = "SELECT COUNT(q.qid) FROM Question AS q WHERE q.qid IN (SELECT a.qid FROM Answer AS a WHERE a.userid=? AND status=?)";
		Query q = super.getSession().createQuery(hql);
		q.setString(0, userid);
		q.setInteger(1, status);
		List all = q.list();
		count = (Integer) all.get(0);
		return count;
	}

	public List queryByAccept(String userid, int status, int currentPage,
			int lineSize) throws Exception {
		List all = null;
		String hql = "From Question AS q WHERE q.qid IN (SELECT a.qid FROM Answer AS a WHERE a.userid=? AND status=?)";
		Query q = super.getSession().createQuery(hql);
		q.setString(0, userid);
		q.setInteger(1, status);
		q.setFirstResult((currentPage - 1) * lineSize);
		q.setMaxResults(lineSize);
		all = q.list();
		return all;
	}

	public void updateAccept(int qid, int accept) throws Exception {
		String hql = "UPDATE Question SET acceptflag=? WHERE qid=?";
		Query q = super.getSession().createQuery(hql);
		q.setInteger(0, accept);
		q.setInteger(1, qid);
		q.executeUpdate();
	}

	public void updateStatus(int qid, int status) throws Exception {
		String hql = "UPDATE Question SET status=? WHERE qid=?";
		Query q = super.getSession().createQuery(hql);
		q.setInteger(0, status);
		q.setInteger(1, qid);
		q.executeUpdate();

	}

	public void updateCommen(int qid, int commen) throws Exception {
		String hql = "UPDATE Question SET commenflag=? WHERE qid=?";
		Query q = super.getSession().createQuery(hql);
		q.setInteger(0, commen);
		q.setInteger(1, qid);
		q.executeUpdate();
	}

	public void delete(int qid) throws Exception {
		String hql = "DELETE FROM Question WHERE qid=?";
		Query q = super.getSession().createQuery(hql);
		q.setInteger(0, qid);
		q.executeUpdate();
	}

	public int getAllCount() throws Exception {
		int count = 0;
		String hql = "SELECT COUNT(q.qid) FROM Question AS q";
		Query q = super.getSession().createQuery(hql);
		count = (Integer) q.list().get(0);
		return count;
	}

	public List queryAll(int currentPage, int lineSize) throws Exception {
		List all = null;
		String hql = "FROM Question AS q";
		Query q = super.getSession().createQuery(hql);
		q.setFirstResult((currentPage - 1) * lineSize);
		q.setMaxResults(lineSize);
		all = q.list() ;
		return all;
	}

}
