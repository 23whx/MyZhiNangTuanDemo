package org.lxh.myzngt.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.lxh.myzngt.dao.IUserDAO;
import org.lxh.myzngt.vo.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class IUserDAOImpl extends HibernateDaoSupport implements IUserDAO {

	public void register(User user) throws Exception {
		super.getSession().save(user);
	}

	public User queryByUserid(String userid) throws Exception {
		User user = null;
		String hql = "FROM User AS u WHERE u.userid=?";
		Query q = super.getSession().createQuery(hql);
		q.setString(0, userid);
		List all = q.list();
		if (all.size() > 0) {
			user = (User) all.get(0);
		}
		return user;
	}

	public boolean isExists(String userid, String userques, String userans)
			throws Exception {
		boolean flag = false;
		String hql = "FROM User AS u WHERE u.userid=? AND u.userques=? AND u.userans=?";
		Query q = super.getSession().createQuery(hql);
		q.setString(0, userid);
		q.setString(1, userques);
		q.setString(2, userans);
		List all = q.list();
		if (all.size() > 0) {
			flag = true;
		}
		return flag;
	}

	public boolean login(User user) throws Exception {
		boolean flag = false;
		String hql = "FROM User AS u WHERE u.userid=? AND u.userpwd=?";
		Query q = super.getSession().createQuery(hql);
		q.setString(0, user.getUserid());
		q.setString(1, user.getUserpwd());
		List all = q.list();
		if (all.size() > 0) {
			flag = true;
			User t = (User) all.get(0);
			user.setGrade(t.getGrade());
		}
		return flag;
	}

	public void updateUserpwd(String userid, String userpwd) throws Exception {
		String hql = "UPDATE User SET userpwd=? WHERE userid=?";
		Query q = super.getSession().createQuery(hql);
		q.setString(0, userpwd);
		q.setString(1, userid);
		q.executeUpdate();
	}

	public void addIntegral(String userid, int itergral) throws Exception {
		String hql = "FROM User AS u WHERE u.userid=?";
		Query q = super.getSession().createQuery(hql);
		q.setString(0, userid);
		User user = (User) q.list().get(0);
		user.setIntegral(user.getIntegral() + itergral);
		user.setGrade(org.lxh.myzngt.util.IntegralGrade.getInstance().getGrade(
				user.getIntegral()));
		hql = "UPDATE User SET integral=?,grade=? WHERE userid=?";
		q = super.getSession().createQuery(hql);
		q.setInteger(0, user.getIntegral());
		q.setInteger(1, user.getGrade());
		q.setString(2, userid);
		q.executeUpdate();
	}

	public void update(User user) throws Exception {
		String hql = "UPDATE User SET userpwd=?,userques=?,userans=?,usermail=?,integral=?,grade=?,sex=?,realname=? where userid=?";
		Query q = super.getSession().createQuery(hql);
		q.setString(0, user.getUserpwd());
		q.setString(1, user.getUserques());
		q.setString(2, user.getUserans());
		q.setString(3, user.getUsermail());
		q.setInteger(4, user.getIntegral());
		q.setInteger(5, user.getGrade());
		q.setString(6, user.getSex());
		q.setString(7, user.getRealname());
		q.setString(8, user.getUserid());
		q.executeUpdate();
	}

	public void delete(String userid) throws Exception {
		String hql = "DELETE FROM User WHERE userid=?";
		Query q = super.getSession().createQuery(hql);
		q.setString(0, userid);
		q.executeUpdate();
	}

	public List queryAll(int currentPage, int lineSize) throws Exception {
		List all = null;
		String hql = "FROM User AS u";
		Query q = super.getSession().createQuery(hql);
		q.setFirstResult((currentPage - 1) * lineSize);
		q.setMaxResults(lineSize);
		all = q.list();
		return all;
	}

	public int getAllCount() throws Exception {
		int count = 0;
		String hql = "SELECT COUNT(u.id) FROM User AS u";
		Query q = super.getSession().createQuery(hql);
		count = (Integer) q.list().get(0);
		return count;
	}

	public void updateIntegral(String userid, int integral) throws Exception {
		String hql = "UPDATE User SET integral=?,grade=? WHERE userid=?";
		Query q = super.getSession().createQuery(hql);
		q.setInteger(0, integral);
		q.setInteger(1, org.lxh.myzngt.util.IntegralGrade.getInstance()
				.getGrade(integral));
		q.setString(2, userid);
		q.executeUpdate();
	}

}
