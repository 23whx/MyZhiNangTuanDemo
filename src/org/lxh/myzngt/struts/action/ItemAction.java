/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package org.lxh.myzngt.struts.action;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.lxh.myzngt.dao.IItemDAO;
import org.lxh.myzngt.struts.form.ItemForm;
import org.lxh.myzngt.vo.Item;
import org.lxh.myzngt.vo.Subitem;

/**
 * MyEclipse Struts Creation date: 07-01-2007
 * 
 * XDoclet definition:
 * 
 * @struts.action path="/item" name="itemForm" input="/form/item.jsp"
 *                parameter="status" scope="request" validate="true"
 */
public class ItemAction extends DispatchAction {
	private IItemDAO iitemdao;

	/*
	 * Generated Methods
	 */

	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward selectall(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		List all = null;
		try {
			all = this.iitemdao.queryAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("all", all);
		return mapping.findForward("question");
	}

	public ActionForward aa(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		ItemForm itemForm = (ItemForm) form;

		return null;
	}

	public IItemDAO getIitemdao() {
		return iitemdao;
	}

	public void setIitemdao(IItemDAO iitemdao) {
		this.iitemdao = iitemdao;
	}
}