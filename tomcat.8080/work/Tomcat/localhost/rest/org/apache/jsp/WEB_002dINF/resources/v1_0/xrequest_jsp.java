/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.31
 * Generated at: 2020-05-30 18:44:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.resources.v1_0;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class xrequest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("file:/C:/Users/papun/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar", Long.valueOf(1587221131927L));
    _jspx_dependants.put("jar:file:/C:/Users/papun/.m2/repository/com/metamug/mason/4.1/mason-4.1.jar!/META-INF/mtg-mason.tld", Long.valueOf(1590862762000L));
    _jspx_dependants.put("/WEB-INF/resources/v1.0/../fragments/mason-init.jspf", Long.valueOf(1588228776215L));
    _jspx_dependants.put("file:/C:/Users/papun/.m2/repository/com/metamug/mason/4.1/mason-4.1.jar", Long.valueOf(1590862815294L));
    _jspx_dependants.put("jar:file:/C:/Users/papun/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("jar:file:/C:/Users/papun/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/sql.tld", Long.valueOf(1153365282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fm_005fresource;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fm_005frequest_0026_005fmethod;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fm_005fxrequest_0026_005fvar_005furl_005foutput_005fmethod;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fm_005fheader_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fm_005fxbody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fm_005fresource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fm_005frequest_0026_005fmethod = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fm_005fxrequest_0026_005fvar_005furl_005foutput_005fmethod = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fm_005fheader_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fm_005fxbody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fm_005fresource.release();
    _005fjspx_005ftagPool_005fm_005frequest_0026_005fmethod.release();
    _005fjspx_005ftagPool_005fm_005fxrequest_0026_005fvar_005furl_005foutput_005fmethod.release();
    _005fjspx_005ftagPool_005fm_005fheader_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fm_005fxbody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"/WEB-INF/resources/error/errorpage.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      if (_jspx_meth_m_005fresource_005f0(_jspx_page_context))
        return;
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_m_005fresource_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  m:resource
    com.metamug.mason.tag.ResourceTagHandler _jspx_th_m_005fresource_005f0 = (com.metamug.mason.tag.ResourceTagHandler) _005fjspx_005ftagPool_005fm_005fresource.get(com.metamug.mason.tag.ResourceTagHandler.class);
    boolean _jspx_th_m_005fresource_005f0_reused = false;
    try {
      _jspx_th_m_005fresource_005f0.setPageContext(_jspx_page_context);
      _jspx_th_m_005fresource_005f0.setParent(null);
      int[] _jspx_push_body_count_m_005fresource_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_m_005fresource_005f0 = _jspx_th_m_005fresource_005f0.doStartTag();
        if (_jspx_eval_m_005fresource_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_m_005fresource_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            _jspx_push_body_count_m_005fresource_005f0[0]++;
            out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_m_005fresource_005f0);
          }
          do {
            if (_jspx_meth_m_005frequest_005f0(_jspx_th_m_005fresource_005f0, _jspx_page_context, _jspx_push_body_count_m_005fresource_005f0))
              return true;
            if (_jspx_meth_m_005frequest_005f1(_jspx_th_m_005fresource_005f0, _jspx_page_context, _jspx_push_body_count_m_005fresource_005f0))
              return true;
            int evalDoAfterBody = _jspx_th_m_005fresource_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_m_005fresource_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.popBody();
            _jspx_push_body_count_m_005fresource_005f0[0]--;
          }
        }
        if (_jspx_th_m_005fresource_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_m_005fresource_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_m_005fresource_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_m_005fresource_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fm_005fresource.reuse(_jspx_th_m_005fresource_005f0);
      _jspx_th_m_005fresource_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_m_005fresource_005f0, _jsp_getInstanceManager(), _jspx_th_m_005fresource_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_m_005frequest_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_m_005fresource_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_m_005fresource_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  m:request
    com.metamug.mason.tag.RequestTagHandler _jspx_th_m_005frequest_005f0 = (com.metamug.mason.tag.RequestTagHandler) _005fjspx_005ftagPool_005fm_005frequest_0026_005fmethod.get(com.metamug.mason.tag.RequestTagHandler.class);
    boolean _jspx_th_m_005frequest_005f0_reused = false;
    try {
      _jspx_th_m_005frequest_005f0.setPageContext(_jspx_page_context);
      _jspx_th_m_005frequest_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_m_005fresource_005f0);
      // /WEB-INF/resources/v1.0/xrequest.jsp(4,4) name = method type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_m_005frequest_005f0.setMethod("GET");
      int[] _jspx_push_body_count_m_005frequest_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_m_005frequest_005f0 = _jspx_th_m_005frequest_005f0.doStartTag();
        if (_jspx_eval_m_005frequest_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_m_005frequest_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            _jspx_push_body_count_m_005frequest_005f0[0]++;
            out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_m_005frequest_005f0);
          }
          do {
            if (_jspx_meth_m_005fxrequest_005f0(_jspx_th_m_005frequest_005f0, _jspx_page_context, _jspx_push_body_count_m_005frequest_005f0))
              return true;
            int evalDoAfterBody = _jspx_th_m_005frequest_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_m_005frequest_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.popBody();
            _jspx_push_body_count_m_005frequest_005f0[0]--;
          }
        }
        if (_jspx_th_m_005frequest_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_m_005frequest_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_m_005frequest_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_m_005frequest_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fm_005frequest_0026_005fmethod.reuse(_jspx_th_m_005frequest_005f0);
      _jspx_th_m_005frequest_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_m_005frequest_005f0, _jsp_getInstanceManager(), _jspx_th_m_005frequest_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_m_005fxrequest_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_m_005frequest_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_m_005frequest_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  m:xrequest
    com.metamug.mason.tag.xrequest.XRequestTagHandler _jspx_th_m_005fxrequest_005f0 = (com.metamug.mason.tag.xrequest.XRequestTagHandler) _005fjspx_005ftagPool_005fm_005fxrequest_0026_005fvar_005furl_005foutput_005fmethod.get(com.metamug.mason.tag.xrequest.XRequestTagHandler.class);
    boolean _jspx_th_m_005fxrequest_005f0_reused = false;
    try {
      _jspx_th_m_005fxrequest_005f0.setPageContext(_jspx_page_context);
      _jspx_th_m_005fxrequest_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_m_005frequest_005f0);
      // /WEB-INF/resources/v1.0/xrequest.jsp(5,8) name = var type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_m_005fxrequest_005f0.setVar("xreq");
      // /WEB-INF/resources/v1.0/xrequest.jsp(5,8) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_m_005fxrequest_005f0.setUrl("https://postman-echo.com/get?foo1=bar1&foo2=bar2");
      // /WEB-INF/resources/v1.0/xrequest.jsp(5,8) name = method type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_m_005fxrequest_005f0.setMethod("GET");
      // /WEB-INF/resources/v1.0/xrequest.jsp(5,8) name = output type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_m_005fxrequest_005f0.setOutput(new java.lang.Boolean(true));
      int[] _jspx_push_body_count_m_005fxrequest_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_m_005fxrequest_005f0 = _jspx_th_m_005fxrequest_005f0.doStartTag();
        if (_jspx_eval_m_005fxrequest_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_m_005fxrequest_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            _jspx_push_body_count_m_005fxrequest_005f0[0]++;
            out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_m_005fxrequest_005f0);
          }
          do {
            if (_jspx_meth_m_005fheader_005f0(_jspx_th_m_005fxrequest_005f0, _jspx_page_context, _jspx_push_body_count_m_005fxrequest_005f0))
              return true;
            int evalDoAfterBody = _jspx_th_m_005fxrequest_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_m_005fxrequest_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.popBody();
            _jspx_push_body_count_m_005fxrequest_005f0[0]--;
          }
        }
        if (_jspx_th_m_005fxrequest_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_m_005fxrequest_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_m_005fxrequest_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_m_005fxrequest_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fm_005fxrequest_0026_005fvar_005furl_005foutput_005fmethod.reuse(_jspx_th_m_005fxrequest_005f0);
      _jspx_th_m_005fxrequest_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_m_005fxrequest_005f0, _jsp_getInstanceManager(), _jspx_th_m_005fxrequest_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_m_005fheader_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_m_005fxrequest_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_m_005fxrequest_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  m:header
    com.metamug.mason.tag.HeaderTag _jspx_th_m_005fheader_005f0 = (com.metamug.mason.tag.HeaderTag) _005fjspx_005ftagPool_005fm_005fheader_0026_005fvalue_005fname_005fnobody.get(com.metamug.mason.tag.HeaderTag.class);
    boolean _jspx_th_m_005fheader_005f0_reused = false;
    try {
      _jspx_th_m_005fheader_005f0.setPageContext(_jspx_page_context);
      _jspx_th_m_005fheader_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_m_005fxrequest_005f0);
      // /WEB-INF/resources/v1.0/xrequest.jsp(7,12) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_m_005fheader_005f0.setName("Accept");
      // /WEB-INF/resources/v1.0/xrequest.jsp(7,12) name = value type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_m_005fheader_005f0.setValue("application/json");
      int _jspx_eval_m_005fheader_005f0 = _jspx_th_m_005fheader_005f0.doStartTag();
      if (_jspx_th_m_005fheader_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fm_005fheader_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_m_005fheader_005f0);
      _jspx_th_m_005fheader_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_m_005fheader_005f0, _jsp_getInstanceManager(), _jspx_th_m_005fheader_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_m_005frequest_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_m_005fresource_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_m_005fresource_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  m:request
    com.metamug.mason.tag.RequestTagHandler _jspx_th_m_005frequest_005f1 = (com.metamug.mason.tag.RequestTagHandler) _005fjspx_005ftagPool_005fm_005frequest_0026_005fmethod.get(com.metamug.mason.tag.RequestTagHandler.class);
    boolean _jspx_th_m_005frequest_005f1_reused = false;
    try {
      _jspx_th_m_005frequest_005f1.setPageContext(_jspx_page_context);
      _jspx_th_m_005frequest_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_m_005fresource_005f0);
      // /WEB-INF/resources/v1.0/xrequest.jsp(11,4) name = method type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_m_005frequest_005f1.setMethod("POST");
      int[] _jspx_push_body_count_m_005frequest_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_m_005frequest_005f1 = _jspx_th_m_005frequest_005f1.doStartTag();
        if (_jspx_eval_m_005frequest_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_m_005frequest_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            _jspx_push_body_count_m_005frequest_005f1[0]++;
            out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_m_005frequest_005f1);
          }
          do {
            if (_jspx_meth_m_005fxrequest_005f1(_jspx_th_m_005frequest_005f1, _jspx_page_context, _jspx_push_body_count_m_005frequest_005f1))
              return true;
            int evalDoAfterBody = _jspx_th_m_005frequest_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_m_005frequest_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.popBody();
            _jspx_push_body_count_m_005frequest_005f1[0]--;
          }
        }
        if (_jspx_th_m_005frequest_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_m_005frequest_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_m_005frequest_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_m_005frequest_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fm_005frequest_0026_005fmethod.reuse(_jspx_th_m_005frequest_005f1);
      _jspx_th_m_005frequest_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_m_005frequest_005f1, _jsp_getInstanceManager(), _jspx_th_m_005frequest_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_m_005fxrequest_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_m_005frequest_005f1, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_m_005frequest_005f1)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  m:xrequest
    com.metamug.mason.tag.xrequest.XRequestTagHandler _jspx_th_m_005fxrequest_005f1 = (com.metamug.mason.tag.xrequest.XRequestTagHandler) _005fjspx_005ftagPool_005fm_005fxrequest_0026_005fvar_005furl_005foutput_005fmethod.get(com.metamug.mason.tag.xrequest.XRequestTagHandler.class);
    boolean _jspx_th_m_005fxrequest_005f1_reused = false;
    try {
      _jspx_th_m_005fxrequest_005f1.setPageContext(_jspx_page_context);
      _jspx_th_m_005fxrequest_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_m_005frequest_005f1);
      // /WEB-INF/resources/v1.0/xrequest.jsp(12,8) name = var type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_m_005fxrequest_005f1.setVar("xreq");
      // /WEB-INF/resources/v1.0/xrequest.jsp(12,8) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_m_005fxrequest_005f1.setUrl("https://postman-echo.com/post");
      // /WEB-INF/resources/v1.0/xrequest.jsp(12,8) name = output type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_m_005fxrequest_005f1.setOutput(new java.lang.Boolean(true));
      // /WEB-INF/resources/v1.0/xrequest.jsp(12,8) name = method type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_m_005fxrequest_005f1.setMethod("POST");
      int[] _jspx_push_body_count_m_005fxrequest_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_m_005fxrequest_005f1 = _jspx_th_m_005fxrequest_005f1.doStartTag();
        if (_jspx_eval_m_005fxrequest_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_m_005fxrequest_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            _jspx_push_body_count_m_005fxrequest_005f1[0]++;
            out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_m_005fxrequest_005f1);
          }
          do {
            if (_jspx_meth_m_005fheader_005f1(_jspx_th_m_005fxrequest_005f1, _jspx_page_context, _jspx_push_body_count_m_005fxrequest_005f1))
              return true;
            if (_jspx_meth_m_005fxbody_005f0(_jspx_th_m_005fxrequest_005f1, _jspx_page_context, _jspx_push_body_count_m_005fxrequest_005f1))
              return true;
            int evalDoAfterBody = _jspx_th_m_005fxrequest_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_m_005fxrequest_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.popBody();
            _jspx_push_body_count_m_005fxrequest_005f1[0]--;
          }
        }
        if (_jspx_th_m_005fxrequest_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_m_005fxrequest_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_m_005fxrequest_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_m_005fxrequest_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fm_005fxrequest_0026_005fvar_005furl_005foutput_005fmethod.reuse(_jspx_th_m_005fxrequest_005f1);
      _jspx_th_m_005fxrequest_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_m_005fxrequest_005f1, _jsp_getInstanceManager(), _jspx_th_m_005fxrequest_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_m_005fheader_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_m_005fxrequest_005f1, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_m_005fxrequest_005f1)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  m:header
    com.metamug.mason.tag.HeaderTag _jspx_th_m_005fheader_005f1 = (com.metamug.mason.tag.HeaderTag) _005fjspx_005ftagPool_005fm_005fheader_0026_005fvalue_005fname_005fnobody.get(com.metamug.mason.tag.HeaderTag.class);
    boolean _jspx_th_m_005fheader_005f1_reused = false;
    try {
      _jspx_th_m_005fheader_005f1.setPageContext(_jspx_page_context);
      _jspx_th_m_005fheader_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_m_005fxrequest_005f1);
      // /WEB-INF/resources/v1.0/xrequest.jsp(13,12) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_m_005fheader_005f1.setName("Content-Type");
      // /WEB-INF/resources/v1.0/xrequest.jsp(13,12) name = value type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_m_005fheader_005f1.setValue("application/json");
      int _jspx_eval_m_005fheader_005f1 = _jspx_th_m_005fheader_005f1.doStartTag();
      if (_jspx_th_m_005fheader_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fm_005fheader_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_m_005fheader_005f1);
      _jspx_th_m_005fheader_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_m_005fheader_005f1, _jsp_getInstanceManager(), _jspx_th_m_005fheader_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_m_005fxbody_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_m_005fxrequest_005f1, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_m_005fxrequest_005f1)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  m:xbody
    com.metamug.mason.tag.xrequest.BodyTagHandler _jspx_th_m_005fxbody_005f0 = (com.metamug.mason.tag.xrequest.BodyTagHandler) _005fjspx_005ftagPool_005fm_005fxbody.get(com.metamug.mason.tag.xrequest.BodyTagHandler.class);
    boolean _jspx_th_m_005fxbody_005f0_reused = false;
    try {
      _jspx_th_m_005fxbody_005f0.setPageContext(_jspx_page_context);
      _jspx_th_m_005fxbody_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_m_005fxrequest_005f1);
      int _jspx_eval_m_005fxbody_005f0 = _jspx_th_m_005fxbody_005f0.doStartTag();
      if (_jspx_eval_m_005fxbody_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_m_005fxbody_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          _jspx_push_body_count_m_005fxrequest_005f1[0]++;
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_m_005fxbody_005f0);
        }
        do {
          out.write("\r\n");
          out.write("                {\r\n");
          out.write("                    \"foo1\": \"foovalue1\",\r\n");
          out.write("                    \"foo2\": \"foovalue2\"\r\n");
          out.write("                }\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_m_005fxbody_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_m_005fxbody_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_m_005fxrequest_005f1[0]--;
        }
      }
      if (_jspx_th_m_005fxbody_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fm_005fxbody.reuse(_jspx_th_m_005fxbody_005f0);
      _jspx_th_m_005fxbody_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_m_005fxbody_005f0, _jsp_getInstanceManager(), _jspx_th_m_005fxbody_005f0_reused);
    }
    return false;
  }
}
