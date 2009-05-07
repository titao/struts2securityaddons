/* Created by Nick Coblentz
 * For more information, see http://code.google.com/p/struts2securityaddons/
 */
package com.nickcoblentz.struts2.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.StrutsStatics;

/*
     * This class can be extended by other struts actions.
 */

public class BaseAction extends ActionSupport implements Serializable {
    private static final long serialVersionUID = 2095420014308409079L;    
   
    /* In the execute() method of your Strust 2 action,
     * this method can be called to ensure a POST request
     * was used.  For example:
     * public String execute() {
     *      if(isPostRequest()) {
     *          //do some stuff
     *          return SUCCESS;
     *      }
     *      return ERROR;
     */

    public boolean isPostRequest() {
		HttpServletRequest req = (HttpServletRequest) ActionContext.getContext().get(StrutsStatics.HTTP_REQUEST);
		if(req!=null && req.getMethod().equalsIgnoreCase("post"))
			return true;
		return false;
	}


}
