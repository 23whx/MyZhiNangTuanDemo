package org.lxh.myzngt.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.lxh.myzngt.dao.IAnswerDAO;
import org.lxh.myzngt.vo.Answer;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class IAnswerDAOImpl extends HibernateDaoSupport implements IAnswerDAO {

	public void insert(Answer answer) throws Exception {
		super.getSession().save(answer);
	}

	public int getByUseridCount(String userid) throws Exception {
		int count = 0;
		String hql = "FROM Answer AS a WHERE a.userid=?";
		Query q = super.getSession().createQuery(hql);
		q.setString(1, userid);
		count = (Integer) q.list().get(0);
		return count;
	}

	public List queryByUserid(String userid, int currentPage, int lineSize)
			throws Exception {
		String hql = "FROM Answer AS a WHERE a.userid=?";
		Query q = super.getSession().createQuery(hql);
		q.setString(1, userid);
		q.setFirstResult((currentPage - 1) * lineSize);
		q.setMaxResults(lineSize);
		List all = q.list();
		return all;
	}

	public void updateStatus(int aid, int status) throws Exception {
		String hql = "UPDATE Answer SET status=? WHERE aid=?";
		Query q = super.getSession().createQuery(hql);
		q.setInteger(0, status);
		q.setInteger(1, aid);
		q.executeUpdate();
	}
}
