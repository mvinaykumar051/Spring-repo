package mvc.service;

import java.sql.Date;
import java.util.List;
import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import mvc.dao.StudentDao;
import mvc.dto.Student;

@Component
public class StudentService {
	@Autowired
	StudentDao dao;

	public ModelAndView save(Student student, String date) {
		student.setDob(Date.valueOf(date));
		student.setAge(Period.between(LocalDate.parse(date), LocalDate.now()).getYears());
		dao.save(student);
		ModelAndView view = new ModelAndView();
		view.setViewName("Home");
		view.addObject("success", "Data Added Sucessfully");
		return view;
	}

	public ModelAndView fetchAll() {
		ModelAndView view = new ModelAndView();
		List<Student> list = dao.fetchAll();
		if (list.isEmpty()) {
			view.addObject("fail", "No Data Found");
			view.setViewName("Home");
		} else {
			view.addObject("list", list);
			view.setViewName("Result");
		}
		return view;
	}

	public ModelAndView FetchByName(String name) {
		ModelAndView view = new ModelAndView();
		List<Student> list = dao.FetchByName(name);
		if (list.isEmpty()) {
			view.addObject("fail", "No Data Found");
			view.setViewName("Home");
		} else {
			view.setViewName("Result");
			view.addObject("list", list);
		}
		return view;
	}

	public ModelAndView delete(int id) {
		ModelAndView view = new ModelAndView();
		dao.delete(id);
		List<Student> list = dao.fetchAll();
		if (list.isEmpty()) {
			view.addObject("fail", "No Data Found");
			view.setViewName("Home");
		} else {
			view.addObject("list", list);
			view.addObject("success", "Deleted Success");
			view.setViewName("Result");
		}
		return view;
	}

	public ModelAndView edit(int id) {
		ModelAndView view = new ModelAndView();
		Student student = dao.FetchById(id);
		view.addObject("student", student);
		view.setViewName("Edit");
		return view;
	}

	public ModelAndView update(Student student,String date) {
		student.setDob(Date.valueOf(date));
		student.setAge(Period.between(LocalDate.parse(date), LocalDate.now()).getYears());
		dao.update(student);
		ModelAndView view = new ModelAndView();
		view.setViewName("Result");
		view.addObject("list",dao.fetchAll());
		view.addObject("success", "Data Updated Sucessfully");
		return view;
	}
}
