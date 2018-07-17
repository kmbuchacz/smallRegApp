package SmallRegApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping ( "/mainPage")
	public String mainPage (Model theModel ) {	
		
		
	theModel.addAttribute("student",  new Student ());
	
	
	return "mainPage";}
	
	@RequestMapping ("/processForm")
	public String theStudentPage ( @ModelAttribute ("student") Student theStudent) {
		System.out.println("this is student form processForm Controller message" + theStudent.getFirstName());
	return "studentPage";}

}
