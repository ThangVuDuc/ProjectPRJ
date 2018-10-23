package org.apache.jsp.component;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>HolaFood</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <nav class='navbar header fixed-top navber-expland-lg navbar-light'>\n");
      out.write("                <div class='container' >\n");
      out.write("                    <div class='col-4'>\n");
      out.write("                        <div class='input-group mt-3'>\n");
      out.write("                            <p style=\"width: 100%;color:rgb(48, 48, 48);marginBottom: 5;font-size: 15px;font-weight: 700;\" >Hotline: 0123456789</p>\n");
      out.write("                            <p style=\"width: 100%;color:rgb(48, 48, 48);marginBottom: 5;font-size: 15px;font-weight: 700;\">Địa chỉ: Thắng béo</p>\n");
      out.write("                        </div> \n");
      out.write("                    </div>\n");
      out.write("                    <div class='col-4'>\n");
      out.write("                        <div class='navbar-brand' href='#' >\n");
      out.write("                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/container/Home.jsp\">\n");
      out.write("                                <span><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/images/logo.png\" class='img-logo' alt='logo' /></span>\n");
      out.write("                            </a>\n");
      out.write("                        </div> \n");
      out.write("                    </div>\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ empty sessionScope.user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <div class='col-4'>\n");
        out.write("                            <div class=\"float-right\">\n");
        out.write("                                <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/container/Login.jsp\" class=\"signinBtn\">Sign in</a> \n");
        out.write("                                or\n");
        out.write("                                <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/container/SignUp.jsp\" class=\"signupBtn\">Sign up</a> \n");
        out.write("                            </div>\n");
        out.write("                        </div>   \n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <div class='col-4 profile'>\n");
        out.write("                            <div class=\"btn btn-primary profileSum\" data-toggle=\"collapse\" href=\"#collapseExample\" role=\"button\" aria-expanded=\"false\" aria-controls=\"collapseExample\">\n");
        out.write("                                <span class=\"user-avatar pull-left\" style=\"margin-right:8px; margin-top:-5px;\">\n");
        out.write("                                    <img src=\"https://lut.im/7JCpw12uUT/mY0Mb78SvSIcjvkf.png\" class=\"img-responsive img-circle\" title=\"John Doe\" alt=\"John Doe\" width=\"30px\" height=\"30px\">\n");
        out.write("                                </span>\n");
        out.write("                                <span class=\"user-name\">\n");
        out.write("                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                </span>\n");
        out.write("                            </div>\n");
        out.write("                            </p>\n");
        out.write("                            <div class=\"collapse\" id=\"collapseExample\">\n");
        out.write("                                <ul>\n");
        out.write("                                    <li><a href=\"./56ExR\" class=\"btn btn-default btn-xs\"><i class=\"fa fa-user-o\" aria-hidden=\"true\"></i> Profile</a></li>\n");
        out.write("                                    <li><a href=\"#\" class=\"btn btn-default btn-xs\"><i class=\"fa fa-address-card-o\" aria-hidden=\"true\"></i> Contacts</a></li>    \n");
        out.write("                                    <li><a href=\"#\" class=\"btn btn-default btn-xs\"><i class=\"fa fa-cogs\" aria-hidden=\"true\"></i> Settings</a></li>    \n");
        out.write("                                    <li><a href=\"#\" class=\"btn btn-default btn-xs\"><i class=\"fa fa-question-circle-o\" aria-hidden=\"true\"></i> Help!</a></li>  \n");
        out.write("                                    <hr>\n");
        out.write("                                    <li><a href=\"#\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-unlock-alt\" aria-hidden=\"true\"></i> Change Passowrd</a></li>    \n");
        out.write("                                    <li><a href=\"/ProjectJavaWeb/LogoutServlet\" class=\"btn btn-default btn-sm pull-right\"><i class=\"fa fa-power-off\" aria-hidden=\"true\"></i> Sign Out</a></li>\n");
        out.write("                                </ul>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
