package exam.controllers;

import exam.entities.StudentEntity;
import exam.mappers.GroupsMapper;
import exam.mappers.StudentsMapper;
import exam.mappers.relationsMapper;
import exam.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  Valentin26
 */
@Controller
@RequestMapping("/")
/*
public class StudentsController {

    @Autowired
    private StudentsService studentsService;

    @RequestMapping("students")
    public String list(Model model) {
        final List<StudentEntity> students = studentsService.findAll();
        model.addAttribute("students", students);
        return "students";
    }
}
*/

public class StudentsController {

    @Autowired
    private StudentsService studentsService;
    private Model model;
    private Integer studentId;


    @RequestMapping("students")
    public String list(Model model) {
        final List<StudentEntity> students = studentsService.findAll();
        model.addAttribute("students", students);
        return "students";
    }

    @RequestMapping("studenthobbys/{student_id}")
    public String listing(Model model, @PathVariable("student_id") Integer studentId) {

        Listing<Integer> hobbies = relationsMapper.findByStudentId(studentId);
        Listing<Hobby> studentHobbys = new ArrayList<>();
        for(Integer hobbyId: hobbys) {
            studentHobbys .add(hobbysMapper.find(hobbyId));
        }

        model.addAttribute("hobbys", studentHobbys);
        return "students";
    }



}