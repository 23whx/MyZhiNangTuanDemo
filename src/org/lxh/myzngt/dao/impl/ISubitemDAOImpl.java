package org.lxh.myzngt.dao.impl;

import org.hibernate.Query;
import org.lxh.myzngt.dao.ISubitemDAO;
import org.lxh.myzngt.vo.Subitem;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ISubitemDAOImpl extends HibernateDaoSupport implements ISubitemDAO {

	public void delete(int subid) throws Exception {
		String hql = "DELETE FROM Subitem WHERE subid=?";
		Query q = super.getSession().createQuery(hql);
		q.setInteger(0, subid);
		q.executeUpdate();

	}

	public void insert(Subitem subitem) throws Exception {
		super.getSession().save(subitem);
	}

	public void update(Subitem subitem) throws Exception {
		String hql = "UPDATE Subitem SET subname=?,subcode=? WHERE subid=?";
		Query q = super.getSession().createQuery(hql);
		q.setString(0, subitem.getSubname());
		q.setInteger(1, subitem.getSubcode());
		q.setInteger(2, subitem.getSubid());
		q.executeUpdate();
	}

}
