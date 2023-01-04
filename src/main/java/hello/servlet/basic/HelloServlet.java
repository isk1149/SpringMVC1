package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("HelloServlet.service");
        System.out.println("request = " + request); //request = org.apache.catalina.connector.RequestFacade@984a53
        System.out.println("response = " + response); //response = org.apache.catalina.connector.ResponseFacade@3fd2ec51

        String username = request.getParameter("username"); //쿼리파라미터 get
        System.out.println("username = " + username);

        //response header 값 설정
        response.setContentType("text/plan");
        response.setCharacterEncoding("utf-8");

        //response body 데이터 설정
        response.getWriter().write("hello " + username);

    }
}
