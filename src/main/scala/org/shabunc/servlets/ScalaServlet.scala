package org.shabunc.servlets

import javax.servlet.http._
import javax.servlet._

class ScalaServlet extends HttpServlet {

  override def doGet(request: HttpServletRequest, response: HttpServletResponse) = {
      ping(request, response)
  }

    def ping(request: HttpServletRequest, response: HttpServletResponse) = {
      response.getWriter().println( "Hello world, from a Scala servlet!" )
      ()
  }

}

