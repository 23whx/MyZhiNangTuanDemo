package org.lxh.myzngt.dao;

import java.util.List;

import org.lxh.myzngt.vo.Item;

public interface IItemDAO {
	// 得到全部的栏目
	public List queryAll() throws Exception;

	// 删除栏目
	public void delete(int itemid) throws Exception;

	// 更新栏目
	public void update(Item item) throws Exception;

	// 按栏目ID查询
	public Item queryById(int itemid) throws Exception;
	
	// 增加新栏目
	public void insert(Item item) throws Exception ;
}
