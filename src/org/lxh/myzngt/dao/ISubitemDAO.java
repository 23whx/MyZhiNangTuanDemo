package org.lxh.myzngt.dao;

import org.lxh.myzngt.vo.Subitem;

public interface ISubitemDAO {
	// ɾ����Ŀ
	public void delete(int subid) throws Exception;

	// ������Ŀ
	public void update(Subitem subitem) throws Exception;

	// ��������Ŀ
	public void insert(Subitem subitem) throws Exception;
}
