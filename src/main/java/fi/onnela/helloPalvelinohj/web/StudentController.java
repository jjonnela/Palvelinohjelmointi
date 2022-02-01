package fi.onnela.helloPalvelinohj.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.Student;

@Controller
public class StudentController {

	@RequestMapping("students")
	public String showStudents (Model model) {
		ArrayList<Student> studentsList = new ArrayList<>();
		
		studentsList.add(new Student("Jaakko", "Onnela"));
		studentsList.add(new Student("Erkki", "Etevä"));
		studentsList.add(new Student("Olli", "Oppiva"));
		
		model.addAttribute("students", studentsList);
		
		return "helloStudents";
	}
}

