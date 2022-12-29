package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.User;
import dao.UserDAO;
import model.Feedback;
import java.util.List;
import dao.FeedbackDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link href=\"https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <title>Landing Page | LaRevue</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"pt-0 pl-24 pr-24\">\r\n");
      out.write("            <div class=\"flex items-center justify-between flex-wrap bg-teal p-6\">\r\n");
      out.write("                <div class=\"flex items-center flex-no-shrink text-black mr-6\">\r\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" class=\"h-6 w-6\" fill=\"none\" viewBox=\"0 0 24 24\" stroke=\"currentColor\">\r\n");
      out.write("                    <path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M11 19l-7-7 7-7m8 14l-7-7 7-7\" />\r\n");
      out.write("                    </svg>  \r\n");
      out.write("                    <span class=\"pl-2 font-semibold text-xl tracking-tight\">LaRevue</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"flex items-center\">\r\n");
      out.write("                        <a href=\"login.jsp\" class=\"ml-5 py-2 px-4 border border-transparent text-sm font-medium rounded-md text-white bg-gray-800 hover:bg-gray-700 focus:outline-none focus:ring-2 focus:ring-offset-2\">\r\n");
      out.write("                            Login\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"relative pt-0 pr-5 pl-5 pb-16 flex content-center items-center justify-center\">\r\n");
      out.write("                <div class=\"container relative w-full\">\r\n");
      out.write("                    <div class=\"items-center flex w-full\">\r\n");
      out.write("                        <div class=\"w-full lg:w-6/12 px-4 ml-auto mr-auto text-left\">\r\n");
      out.write("                            <div class=\"flex items-center\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <h1 class=\"text-gray-900 font-semibold text-3xl\">\r\n");
      out.write("                                        Discover a unique experience.\r\n");
      out.write("                                    </h1>\r\n");
      out.write("                                    <p class=\"mt-4 text-lg text-gray-800\">\r\n");
      out.write("                                        We bring the best café review system where it can be a diary of your food hunting journey. Voice it out!\r\n");
      out.write("                                    </p>   \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <img class=\"w-60 h-40 rounded-full\" class=\"lazy\" src=\"https://thesmartlocal.com/malaysia/wp-content/uploads/2021/01/New-cafes-in-KL-and-PJ-23.jpg\" alt=\"LaRevue Landing Image\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <div class=\"relative pt-16 pb-16 \">\r\n");
      out.write("                <div class=\"\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <h1 class=\"text-gray-900 font-semibold text-3xl text-center\">\r\n");
      out.write("                            Get To Know Us More!\r\n");
      out.write("                        </h1>\r\n");
      out.write("                        <p class=\"mt-4 text-lg text-gray-800 text-justify\">\r\n");
      out.write("                            La Revue is a web-based application system that allows users to rate cafes that are worth being displayed on their social media feeds, and it also represents one of our common interests, which is food hunting while traveling. Based on our perceptions, this will encourage the concept of eating from the eyes to the stomach.\r\n");
      out.write("                            Users can rate and review any cafe that the cafe owner has created using this cafe review system (La Revue). This forum-like platform can help cafe owners indirectly promoting their business and gaining interest from the general public and their customers. Furthermore, any user can survey any cafe or restaurant mentioned on the website before visiting it while traveling or at any other time.\r\n");
      out.write("                        </p>   \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <div class=\"py-16 px-28\">\r\n");
      out.write("                <div class=\"pb-4\">\r\n");
      out.write("                    <h1 class=\"text-gray-900 font-semibold text-3xl text-center\">\r\n");
      out.write("                        What They Said About This System?\r\n");
      out.write("                    </h1>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");

                    FeedbackDAO fbDAO = new FeedbackDAO();
                    List<Feedback> listFeedback = fbDAO.retrieveAllFeedbacks();
                    
                    UserDAO userDAO = new UserDAO();
                    for (Feedback feedback : listFeedback) {
                    User user = userDAO.retrieveUserByUserId(feedback.getUserid());
                
      out.write("\r\n");
      out.write("                <div class=\"px-4 my-4\">\r\n");
      out.write("                    <div class=\"border rounded-3xl border-gray-300\">\r\n");
      out.write("                        <div class=\"w-full p-3\">\r\n");
      out.write("                            <div class=\"flex text-gray-900 text-2xl mb-2 items-center\">\r\n");
      out.write("                                <svg xmlns=\"http://www.w3.org/2000/svg\" class=\"mr-3 h-6 w-6\" fill=\"none\" viewBox=\"0 0 24 24\" stroke=\"currentColor\">\r\n");
      out.write("                                <path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M16 7a4 4 0 11-8 0 4 4 0 018 0zM12 14a7 7 0 00-7 7h14a7 7 0 00-7-7z\" />\r\n");
      out.write("                                </svg>\r\n");
      out.write("                                ");
      out.print(user.getEmail());
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p class=\"pt-3 font-bold text-xl text-gray-900 flex\">\r\n");
      out.write("                                ");
      out.print(feedback.getSubject());
      out.write("\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p class=\"pt-3 text-gray-700 text-md\">\r\n");
      out.write("                                ");
      out.print(feedback.getMessage());
      out.write("\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");

                    }
                
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>        \r\n");
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
