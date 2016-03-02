This project contains additional configuration, interceptors, and other code used to improve the security of struts 2 applications.

Instructions for using the security addons are provided in the following files:

/WEB-INF/classes/
  * example.xml
  * example-auth.xml
  * struts-securityaddon-withauth.xml
  * struts-securityaddon.xml
  * struts.xml

This project uses the struts2-blank project as a starting point.  The following items were added:

WEB-INF/classes/
  * example.xml
  * example-auth.xml
  * struts-securityaddon-withauth.xml
  * struts-securityaddon.xml
  * struts.xml

com.nickcoblentz.struts2.interceptors
  * AuthenticationInterceptor
  * CachingHeadersInterceptor
  * RequireSSLInterceptor
  * RolesInterceptor

com.nickcoblentz.struts2.actions
  * BaseAction

The following blog entries discuss these items in more detail:

http://nickcoblentz.blogspot.com/2008/09/jsessionid-regeneration-in-struts-2.html

http://nickcoblentz.blogspot.com/2008/10/http-caching-headers-in-struts-2.html

http://nickcoblentz.blogspot.com/2008/10/ssltls-in-struts-2.html

http://nickcoblentz.blogspot.com/2008/10/custom-error-pages-in-struts-2.html

http://nickcoblentz.blogspot.com/2008/11/csrf-prevention-in-struts-2.html

http://nickcoblentz.blogspot.com/2008/11/page-level-access-controls-in-struts-2.html

http://nickcoblentz.blogspot.com/2008/12/page-level-access-controls-in-struts-2.html