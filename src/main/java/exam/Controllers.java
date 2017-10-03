package exam;

import exam.entities.Group;
import exam.entities.Student;
import exam.mappers.GroupMapper;
import exam.mappers.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Valentin on 03.10.17.
 */

@Controller
@RequestMapping("/")


public class Controllers {
    @Autowired
    private GroupMapper groupMapper;

            @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/groups")
    public String showGroup(Model model) {
        List<Group> groups = groupMapper.findAll();
        model.addAttribute("groups", groups);
        return "groups/group";
    }


   /* @RequestMapping("/group/{id}")
    public String showGroup(Model model,@PathVariable int id) {
        List<Student> students = studentMapper.findByGroupId(id);
        model.addAttribute("students", students);
        return "students/stud";
    }*/
   @RequestMapping("/stud/{id}")
   public String showGroup(Model model,@PathVariable int id) {
       List<Group> group = studentMapper. findGroupByStudent(id);
       model.addAttribute("stud",group);
       return "students/stud";
   }

    @RequestMapping("/students")
    public String showAllStudents(Model model) {
        List<Group> groups = groupMapper.findAll();
        model.addAttribute("groups", groups);
        List<Student> students = studentMapper.findAllsort();
        model.addAttribute("students", students);
        return "students/studentslist";
    }
     /* @RequestMapping("/group/{id}")
     public String showGroup(Model model,@PathVariable int id) {
         List<Student> students = studentMapper.findByGroupId(id);
         model.addAttribute("students", students);
         return "students/studentlist";
     }
     */

}

