package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        String username = request.getParameter("username"); // 쿼리파라미터 조회
        System.out.println("username = " + username);

        // 응답부분
        response.setContentType("text/plain");   // 헤더정보
        response.setCharacterEncoding("UTF-8");  // 헤더정보
        response.getWriter().write("hello" + username); //HTTP 메시지 바디에 들어감
    }
}
