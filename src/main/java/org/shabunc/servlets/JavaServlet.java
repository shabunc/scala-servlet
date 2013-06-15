package org.shabunc.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: shahen
 * Date: 13.06.13
 * Time: 20:32
 * To change this template use File | Settings | File Templates.
 */
public class JavaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ping(req, resp);
    }

    public void ping(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        resp.getWriter().println("Hello world, from a Java servlet!");
    }
}
