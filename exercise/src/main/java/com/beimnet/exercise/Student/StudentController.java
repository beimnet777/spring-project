package com.beimnet.exercise.Student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController()
@RequestMapping("/api")
public class StudentController {
  private final StudentService x ;
  @Autowired
  public StudentController (StudentService x){
    this.x=x;
  }
  
   
  public static void main(String[] args) {
  }

  @GetMapping("/k")
  public  String home(){
    return x.man();
  }
}
