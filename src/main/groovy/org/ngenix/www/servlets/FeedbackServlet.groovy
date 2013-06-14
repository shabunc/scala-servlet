
package org.ngenix.www.servlets

import groovy.json.JsonSlurper
import groovy.xml.MarkupBuilder
import org.ngenix.www.MailFeedback

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


class FeedbackServlet extends HttpServlet {


    void send(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/plain")
        response.setCharacterEncoding("UTF-8")

        PrintWriter out = response.getWriter()

        out.println("PING!");

        out.close()
    }

}
