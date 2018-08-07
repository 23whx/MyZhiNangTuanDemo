package org.lxh.myzngt.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.lxh.myzngt.dao.IItemDAO;
import org.lxh.myzngt.vo.Item;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class IItemDAOImpl extends HibernateDaoSupport implements IItemDAO {

	public List queryAll() throws Exception {
		String hql = "FROM Item AS i";
		List all = super.getSession().createQuery(hql).list();
		return all;
	}

	public void delete(int itemid) throws Exception {
		String hql = "DELETE FROM Item WHERE itemid=?";
		Query q = super.getSession().createQuery(hql);
		q.setInteger(0, itemid);
		q.executeUpdate();
	}

	public void insert(Item item) throws Exception {
		super.getSession().save(item);
	}

	public Item queryById(int itemid) throws Exception {
		Item item = null;
		String hql = "FROM Item AS i WHERE i.itemid=?";
		Query q = super.getSession().createQuery(hql);
		q.setInteger(0, itemid);
		List all = q.list();
		if (all.size() > 0) {
			item = (Item) all.get(0);
		}
		return item;
	}

	public void update(Item item) throws Exception {
		String hql = "UPDATE Item SET itemname=?,itemcode=? WHERE itemid=?" ;
		Query q = super.getSession().createQuery(hql) ;
		q.setString(0, item.getItemname()) ;
		q.setInteger(1, item.getItemcode()) ;
		q.setInteger(2, item.getItemid()) ;
		q.executeUpdate() ;
	}

}
