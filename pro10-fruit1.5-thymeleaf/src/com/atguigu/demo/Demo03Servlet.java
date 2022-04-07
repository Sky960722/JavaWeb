package com.atguigu.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//演示session保存作用域（demo03和demo04）
@WebServlet("/demo03")
public class Demo03Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //1.向session保存作用域保存数据
        req.getSession().setAttribute("uname","lili");
        //2.客户端重定向
        resp.sendRedirect("demo04");

        //3.服务器端转发
//        req.getRequestDispatcher("demo04").forward(req,resp);
    }
}
