package com.MainApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.MainApp.Pojo.Admin;
import com.MainApp.Pojo.Question;
import com.MainApp.Pojo.Section;
import com.MainApp.Repository.AdminRepo;
import com.MainApp.Repository.QuestionRepo;
import com.MainApp.Repository.SectionRepo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
@Controller
public class AdminController {
	
	@Autowired
	AdminRepo aRepo;
	
	@Autowired
	SectionRepo sRepo;
	
	@RequestMapping("/adminlogin")
	public String adLoginPageshow()
	{
		return "adminlogin";
	}
	
	@RequestMapping("/adminpage")
	public String adSingnUpPageshow()
	{
		return "adminsignup";
	}
	
	@RequestMapping("/adsignup")
	public String adSingnUpProcess(@ModelAttribute Admin ad)
	{
		aRepo.save(ad);
		return "adminlogin";
	}
	
	@RequestMapping("/adlogin")
	public String adloginUpProcess(@RequestParam("username") String name, @RequestParam("password") String pass, HttpServletRequest req)
	{
		Admin a=aRepo.findByUsernameAndPassword(name, pass);
		HttpSession s = req.getSession();
		if(a!=null)
		{
			s.setAttribute("check", name);
			s.setAttribute("als", sRepo.findByAdname(name));
			return "adminhome";
		}
		else
		{
			return "adminlogin";
		}
	}
	
	
	@RequestMapping("/logout")
	public String adloginUpProcess(HttpServletRequest req)
	{
		
		HttpSession s = req.getSession();
		s.removeAttribute("check");
		return "adminlogin";
		
	}
	
	
	
	@RequestMapping("/addSection")
	public String addSectionProcess(@RequestParam("id") int id, @RequestParam("section") String section, @RequestParam("adname") String adname, HttpServletRequest req)
	{
		Section s = new Section();
		s.setId(id);
		s.setSection(section);
		s.setAdname(adname);
		sRepo.save(s);
		HttpSession ss = req.getSession();
		ss.setAttribute("als", sRepo.findByAdname(s.getAdname()));
		return "adminhome";
	}
	
	@RequestMapping("/addQuestion")
	public String addQuestionProcess(HttpServletRequest req, @RequestParam("section") String section)
	{
		
		HttpSession s = req.getSession();
		s.setAttribute("section", section);
		return "addQuestion";
		
	}
	@Autowired
	QuestionRepo qRepo;
	
	@RequestMapping("/insertQuestion")
	public String insertQuestionProcess(@ModelAttribute Question q,HttpServletRequest req)
	{
		qRepo.save(q);
		HttpSession s = req.getSession();
		
		return "adminhome";
		
	}
	

}
