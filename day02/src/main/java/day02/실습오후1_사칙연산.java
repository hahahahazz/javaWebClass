package day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
	// /calc?num1=3&num2=5
public class 실습오후1_사칙연산 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String num1_ = req.getParameter("num1");
	String num2_ = req.getParameter("num2");
	
	int num1 ; int num2;
	num1 = Integer.parseInt(num1_);
	num2 = Integer.parseInt(num2_);
	
	int plus = num1 + num2;
	int minus = num1 - num2;
	int multi = num1 * num2;
	int divide = num1 / num2;
	int divide2 = num1 % num2;
	
	
	PrintWriter out = resp.getWriter();
	out.println(num1+" + " +num2 +" = "+plus);
	out.println(num1+" - " +num2 +" = "+minus);
	out.println(num1+" X " +num2 +" = "+multi);
	out.println(num1+" / " +num2 +" = "+divide);
	out.println(num1+ " , " +num2 +" 두수를 나눴을때 나머지 = "+divide2);
	
	
	
	}
	
	
}
