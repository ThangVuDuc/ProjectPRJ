package org.apache.jsp.component;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mapGoogle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <title>Custom Markers</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\"\n");
      out.write("        crossorigin=\"anonymous\">\n");
      out.write("    <style>\n");
      out.write("        /* Always set the map height explicitly to define the size of the div\n");
      out.write("                 * element that contains the map. */\n");
      out.write("\n");
      out.write("        #map {\n");
      out.write("            height:400px;\n");
      out.write("            width:400px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Optional: Makes the sample page fill the window. */\n");
      out.write("\n");
      out.write("       \n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("        // This example requires the Places library. Include the libraries=places\n");
      out.write("        // parameter when you first load the API. For example:\n");
      out.write("        // <script src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY&libraries=places\">\n");
      out.write("\n");
      out.write("        function initMap() {\n");
      out.write("            var map = new google.maps.Map(document.getElementById('map'), {\n");
      out.write("                center: { lat: 21.0133737, lng: 105.5251055 },\n");
      out.write("                zoom: 15\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            var infowindow = new google.maps.InfoWindow();\n");
      out.write("            var service = new google.maps.places.PlacesService(map);\n");
      out.write("\n");
      out.write("            service.getDetails({\n");
      out.write("                placeId: 'ChIJbQilLLNUNDER5Der2CkuxqM'  // address if FPT Univerity of googleMap\n");
      out.write("            }, function (place, status) {\n");
      out.write("                if (status === google.maps.places.PlacesServiceStatus.OK) {\n");
      out.write("                    var marker = new google.maps.Marker({\n");
      out.write("                        map: map,\n");
      out.write("                        position: place.geometry.location\n");
      out.write("                    });\n");
      out.write("                    google.maps.event.addListener(marker, 'click', function () {\n");
      out.write("                        infowindow.setContent('<div><strong>' + place.name + '</strong><br>' +\n");
      out.write("                            'Place ID: ' + place.place_id + '<br>' +\n");
      out.write("                            place.formatted_address + '</div>');\n");
      out.write("                        infowindow.open(map, this);\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div id=\"map\"></div>\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("    <script async defer src=\"https://maps.googleapis.com/maps/api/js?key=&libraries=places&callback=initMap\">\n");
      out.write("    </script>\n");
      out.write("</body>\n");
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
