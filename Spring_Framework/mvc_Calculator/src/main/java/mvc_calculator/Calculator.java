package mvc_calculator;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculator {

//	@RequestMapping("add")
//	public void add(HttpServletRequest req,HttpServletResponse resp) throws IOException
//	{
//	int num1=Integer.parseInt(req.getParameter("num1"));
//	int num2=Integer.parseInt(req.getParameter("num2"));
//	int result=num1+num2;
//	resp.getWriter().print("<h1>The sum of " +num1+" and "+num2+" is "+result+"</h1>");
//	}
	
//	@RequestMapping("sub")
//	@ResponseBody
//	public String sub(@RequestParam int num1,@RequestParam int num2)
//	{
//	int result=num1-num2;
//	return "<h1>The Difference of " +num1+" and "+num2+" is "+result+"</h1>";
//	}
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam int num1,@RequestParam int num2)
	{
		ModelAndView view=new ModelAndView("Result.jsp");
		view.addObject("op","Sum");
		view.addObject("num1",num1);
		view.addObject("num2",num2);
		int res=num1+num2;
		   if (res%2==0) {
			   view.addObject("even",res);
		} else {
			 view.addObject("odd",res);
		}
		return view;
	}
	
	@RequestMapping("sub")
	public ModelAndView sub(@RequestParam int num1,@RequestParam int num2)
	{
		ModelAndView view=new ModelAndView("Result.jsp");
		view.addObject("op","Difference");
		view.addObject("num1",num1);
		view.addObject("num2",num2);
		int res=num1-num2;
		   if (res%2==0) {
			   view.addObject("even",res);
		} else {
			 view.addObject("odd",res);
		}
		return view;
	}
	
	@RequestMapping("mul")
	public ModelAndView mul(@RequestParam int num1,@RequestParam int num2)
	{
	ModelAndView view=new ModelAndView("Result.jsp");
	view.addObject("op","Multiplication");
	view.addObject("num1",num1);
	view.addObject("num2",num2);
	int res=num1*num2;
   if (res%2==0) {
	   view.addObject("even",res);
} else {
	 view.addObject("odd",res);
}
	return view;
	}
	
	@RequestMapping("div")
	public ModelAndView div(@RequestParam int num1,@RequestParam int num2)
	{
		ModelAndView view=new ModelAndView("Result.jsp");
		view.addObject("op","Division");
		view.addObject("num1",num1);
		view.addObject("num2",num2);
		double res=num1/num2;
		   if (res%2==0) {
			   view.addObject("even",res);
		} else {
			 view.addObject("odd",res);
		}
		return view;
	}
}
