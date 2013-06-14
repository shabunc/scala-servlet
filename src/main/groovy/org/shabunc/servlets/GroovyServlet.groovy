package org.shabunc.servlets

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Created with IntelliJ IDEA.
 * User: shahen
 * Date: 13.06.13
 * Time: 20:23
 * To change this template use File | Settings | File Templates.
 */
class GroovyServlet extends HttpServlet {

    @Override
    void doGet(HttpServletRequest req, HttpServletResponse resp) {
        ping(req, resp)
    }

    void ping(HttpServletRequest req, HttpServletResponse resp) {
        PrintWriter out = resp.getWriter()

        out.println("Hello world, from a Groovy servlet!")
        out.close()

    }

}
