package exam.controllers;


import exam.entities.GroupsEntity;
import exam.entities.StudentEntity;
import exam.mappers.GroupsMapper;
import exam.mappers.StudentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author  Valentin26
 */
@Controller
@RequestMapping("/")
/*
public class GroupsController {
  @Autowired
    private GroupsMapper groupsMapper;
    @Autowired
    private StudentsMapper studentsMapper;

    @RequestMapping("groups")
    public String list(Model model) {
        final List<GroupsEntity>
              groups = groupsMapper.findAll();
        model.addAttribute("groups", groups);
        return "groups";
    }
    @RequestMapping("group/{groupId}")

    public String read(Model model, @PathVariable("groupId") Integer groupId) {
        final List<StudentEntity> students = studentsMapper.findByGroupId(groupId);
        model.addAttribute("students", students);
        return "students";
    }
}
*/

public class GroupsController {
    @Autowired
    private GroupsMapper groupsMapper;
    @Autowired
    private StudentsMapper studentsMapper;

    @RequestMapping("hobbys")
    public String list(Model model) {
        final List<GroupsEntity>
                hobbys = groupsMapper.findAll();
        model.addAttribute("hobbys", hobbys);
        return "hobbys";
    }
    @RequestMapping("hobby/{hobbyId}")

    public String read(Model model, @PathVariable("hobbyId") Integer hobbyId) {
        final List<StudentEntity> students = studentsMapper.findByHobbyId(hobbyId);
        model.addAttribute("students", students);
        return "students";
    }

}


