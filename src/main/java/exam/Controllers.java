package exam;

import exam.entities.Group;
import exam.entities.Student;
import exam.mappers.GroupMapper;
import exam.mappers.StudentMapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by panchenkoanton on 30.05.17.
 */
@Controller
@RequestMapping("/")
public class Controllers {

    @Autowired
    private GroupMapper groupMapper;

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/groups")
    public String showAllGroups(Model model) {
        List<Group> groups = groupMapper.findAll();
        model.addAttribute("groups", groups);
        List<Student> students = studentMapper.findAllStudentsWithoutGroup();
        model.addAttribute("students", students);
        return "groups/grouplist";
    }

    @RequestMapping("/groups/{id}")
    public String showAllStudentsOfGroup(Model model, @PathVariable int id) {
        List<Student> students = studentMapper.findAllStudentsOfGroup(id);
        model.addAttribute("students", students);
        return "students/studentlist";
    }

    @RequestMapping("/groups/withoutgroup")
    public String showStudentsWithoutGroup(Model model) {
        List<Student> students = studentMapper.findAllStudentsWithoutGroup();
        model.addAttribute("students", students);
        return "students/withoutgroup";
    }
}
