/* Created by Nick Coblentz
 * For more information, see http://code.google.com/p/struts2securityaddons/
 */

package com.nickcoblentz.struts2.interceptors;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;
import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.io.Serializable;

public class RequireSSLInterceptor extends AbstractInterceptor implements Serializable {

    private static final long serialVersionUID = -8249496647441518140L;

	final static String SSLRequiredResult = "ssl_required";

    @Override
	public String intercept(ActionInvocation invocation) throws Exception {

		final ActionContext context = invocation.getInvocationContext();
		final HttpServletRequest request = (HttpServletRequest) context.get(StrutsStatics.HTTP_REQUEST);

		if(request.isSecure()) {
			return invocation.invoke();
		}
		else {
			Map sessionMap = invocation.getInvocationContext().getSession();
			if(sessionMap instanceof SessionMap) {
				((SessionMap)sessionMap).invalidate();
				invocation.getInvocationContext().getSession();
			}
			return SSLRequiredResult;
		}
	}
}
