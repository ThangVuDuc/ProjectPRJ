package org.apache.jsp.container.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjspasdas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Dashboard</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../components/navbar.jsp", out, false);
      out.write("\n");
      out.write("        <hr>\n");
      out.write("        <h1>&ensp; &ensp;Dashboard</h1>\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"row\" style=\"margin-left: 20px;\">\n");
      out.write("            <div class=\"col-2\">\n");
      out.write("                <div class=\"list-group\" id=\"list-tab\" role=\"tablist\">\n");
      out.write("                    <a class=\"list-group-item list-group-item-action active\" id=\"list-home-list\" data-toggle=\"list\" href=\"#list-home\" role=\"tab\" aria-controls=\"home\">Users</a>\n");
      out.write("                    <a class=\"list-group-item list-group-item-action\" id=\"list-profile-list\" data-toggle=\"list\" href=\"#list-profile\" role=\"tab\" aria-controls=\"profile\">Shops</a>\n");
      out.write("                    <a class=\"list-group-item list-group-item-action\" id=\"list-messages-list\" data-toggle=\"list\" href=\"#list-messages\" role=\"tab\" aria-controls=\"messages\">Products</a>\n");
      out.write("                    <a class=\"list-group-item list-group-item-action\" id=\"list-settings-list\" data-toggle=\"list\" href=\"#list-settings\" role=\"tab\" aria-controls=\"settings\">Invoice</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-8\">\n");
      out.write("                <div class=\"tab-content\" id=\"nav-tabContent\">\n");
      out.write("                    <div class=\"tab-pane fade show active\" id=\"list-home\" role=\"tabpanel\" aria-labelledby=\"list-home-list\"><table class=\"table\">\n");
      out.write("                            <thead class=\"thead-dark\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"col\">#</th>\n");
      out.write("                                    <th scope=\"col\">First</th>\n");
      out.write("                                    <th scope=\"col\">Last</th>\n");
      out.write("                                    <th scope=\"col\">Handle</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">1</th>\n");
      out.write("                                    <td>Mark</td>\n");
      out.write("                                    <td>Otto</td>\n");
      out.write("                                    <td>@mdo</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">2</th>\n");
      out.write("                                    <td>Jacob</td>\n");
      out.write("                                    <td>Thornton</td>\n");
      out.write("                                    <td>@fat</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">3</th>\n");
      out.write("                                    <td>Larry</td>\n");
      out.write("                                    <td>the Bird</td>\n");
      out.write("                                    <td>@twitter</td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                        <table class=\"table\">\n");
      out.write("                            <thead class=\"thead-light\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"col\">#</th>\n");
      out.write("                                    <th scope=\"col\">First</th>\n");
      out.write("                                    <th scope=\"col\">Last</th>\n");
      out.write("                                    <th scope=\"col\">Handle</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">1</th>\n");
      out.write("                                    <td>Mark</td>\n");
      out.write("                                    <td>Otto</td>\n");
      out.write("                                    <td>@mdo</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">2</th>\n");
      out.write("                                    <td>Jacob</td>\n");
      out.write("                                    <td>Thornton</td>\n");
      out.write("                                    <td>@fat</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">3</th>\n");
      out.write("                                    <td>Larry</td>\n");
      out.write("                                    <td>the Bird</td>\n");
      out.write("                                    <td>@twitter</td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table></div>\n");
      out.write("                    <div class=\"tab-pane fade\" id=\"list-profile\" role=\"tabpanel\" aria-labelledby=\"list-profile-list\"><table class=\"table table-striped\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"col\">#</th>\n");
      out.write("                                    <th scope=\"col\">First</th>\n");
      out.write("                                    <th scope=\"col\">Last</th>\n");
      out.write("                                    <th scope=\"col\">Handle</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">1</th>\n");
      out.write("                                    <td>Mark</td>\n");
      out.write("                                    <td>Otto</td>\n");
      out.write("                                    <td>@mdo</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">2</th>\n");
      out.write("                                    <td>Jacob</td>\n");
      out.write("                                    <td>Thornton</td>\n");
      out.write("                                    <td>@fat</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">3</th>\n");
      out.write("                                    <td>Larry</td>\n");
      out.write("                                    <td>the Bird</td>\n");
      out.write("                                    <td>@twitter</td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table></div>\n");
      out.write("                    <div class=\"tab-pane fade\" id=\"list-messages\" role=\"tabpanel\" aria-labelledby=\"list-messages-list\"><table class=\"table table-bordered\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"col\">#</th>\n");
      out.write("                                    <th scope=\"col\">First</th>\n");
      out.write("                                    <th scope=\"col\">Last</th>\n");
      out.write("                                    <th scope=\"col\">Handle</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">1</th>\n");
      out.write("                                    <td>Mark</td>\n");
      out.write("                                    <td>Otto</td>\n");
      out.write("                                    <td>@mdo</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">2</th>\n");
      out.write("                                    <td>Jacob</td>\n");
      out.write("                                    <td>Thornton</td>\n");
      out.write("                                    <td>@fat</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">3</th>\n");
      out.write("                                    <td colspan=\"2\">Larry the Bird</td>\n");
      out.write("                                    <td>@twitter</td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table></div>\n");
      out.write("                    <div class=\"tab-pane fade\" id=\"list-settings\" role=\"tabpanel\" aria-labelledby=\"list-settings-list\"><table class=\"table table-bordered table-dark\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"col\">#</th>\n");
      out.write("                                    <th scope=\"col\">First</th>\n");
      out.write("                                    <th scope=\"col\">Last</th>\n");
      out.write("                                    <th scope=\"col\">Handle</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">1</th>\n");
      out.write("                                    <td>Mark</td>\n");
      out.write("                                    <td>Otto</td>\n");
      out.write("                                    <td>@mdo</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">2</th>\n");
      out.write("                                    <td>Jacob</td>\n");
      out.write("                                    <td>Thornton</td>\n");
      out.write("                                    <td>@fat</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">3</th>\n");
      out.write("                                    <td colspan=\"2\">Larry the Bird</td>\n");
      out.write("                                    <td>@twitter</td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
}
