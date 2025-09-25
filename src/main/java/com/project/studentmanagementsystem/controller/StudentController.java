 package com.project.studentmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.project.studentmanagementsystem.service.StudentService;
import com.project.studentmanagementsystem.model.Student;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Handle methods to handle list student and return model and view
   @GetMapping("/students")
public String listStudents(Model model) {
    List<Student> students = studentService.getAllStudents();
    model.addAttribute("students", students);
    return "students";
}

     @GetMapping("/students/new")
      
    public String createStudentForm(Model model) {
        Student student = new Student(); 
        model.addAttribute("student", student);
        return "create_student";
    }
   @PostMapping("/students")
public String saveStudent(@ModelAttribute("student") Student student) {
    studentService.saveStudent(student); // now 'student' exists
    return "redirect:/students";
}
@GetMapping("/students/edit/{id}")
public String editStudentForm(@PathVariable Long id, Model model) {
model.addAttribute("student",studentService.getStudentById(id));
return "edit_student";

}
    
   @PostMapping("/students/{id}")
public String updateStudent(@PathVariable Long id,@ModelAttribute("student") Student student,Model model) {
     // get student from database by id 
     Student existingStudent = studentService.getStudentById(id);
     existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
          existingStudent.setEmail(student.getEmail());
          //save update student from database 
     studentService.updateStudent(existingStudent);
     return "redirect:/students";


}
//handle method to delete student 
@GetMapping("/students/{id}")
public String deleteStudent(@PathVariable Long id){
    studentService.deleteStudentById(id);
    return "redirect:/students";
}

}