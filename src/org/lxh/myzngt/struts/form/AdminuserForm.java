/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package org.lxh.myzngt.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * MyEclipse Struts Creation date: 07-03-2007
 * 
 * XDoclet definition:
 * 
 * @struts.form name="adminuserForm"
 */
public class AdminuserForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** userid property */
	private String userid;

	/** integral property */
	private String integral;

	private int type;

	// 1：表示验证积分

	/*
	 * Generated Methods
	 */

	/**
	 * Method validate
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (type == 1) {
			if (this.integral == null || "".equals(this.integral)) {
				errors.add("integral", new ActionMessage("user.integral.null"));
			} else {
				if (!this.integral.matches("\\d*")) {
					errors.add("integral", new ActionMessage(
							"user.integral.error"));
				}
			}
			if (this.userid == null || "".equals(this.userid)) {
				errors.add("userid", new ActionMessage("user.userid.null"));
			}
		}
		return errors;
	}

	/**
	 * Method reset
	 * 
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/**
	 * Returns the userid.
	 * 
	 * @return String
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * Set the userid.
	 * 
	 * @param userid
	 *            The userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * Returns the integral.
	 * 
	 * @return String
	 */
	public String getIntegral() {
		return integral;
	}

	/**
	 * Set the integral.
	 * 
	 * @param integral
	 *            The integral to set
	 */
	public void setIntegral(String integral) {
		this.integral = integral;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}