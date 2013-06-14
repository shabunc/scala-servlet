package org.stackoverflow.questions

import javax.servlet.http._
import javax.servlet._

class ScalaServlet extends HttpServlet {

  override def doGet(request: HttpServletRequest, response: HttpServletResponse) = response.getWriter().println( exampleContent )

  def exampleContent(): String = { "Hello world, from a Scala servlet!" }
}

