package org.lxh.myzngt.dao;

import java.util.List;

import org.lxh.myzngt.vo.Item;

public interface IItemDAO {
	// �õ�ȫ������Ŀ
	public List queryAll() throws Exception;

	// ɾ����Ŀ
	public void delete(int itemid) throws Exception;

	// ������Ŀ
	public void update(Item item) throws Exception;

	// ����ĿID��ѯ
	public Item queryById(int itemid) throws Exception;
	
	// ��������Ŀ
	public void insert(Item item) throws Exception ;
}
