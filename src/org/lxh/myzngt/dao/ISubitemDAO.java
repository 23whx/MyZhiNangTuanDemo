package org.lxh.myzngt.dao;

import org.lxh.myzngt.vo.Subitem;

public interface ISubitemDAO {
	// 删除栏目
	public void delete(int subid) throws Exception;

	// 更新栏目
	public void update(Subitem subitem) throws Exception;

	// 增加新栏目
	public void insert(Subitem subitem) throws Exception;
}
