package exam.controllers;

import exam.entities.GroupInterface;
import exam.services.GroupsService;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by portuiu on 20.05.17.
 */
public class GroupsController {

    @Autowired
    private GroupsService groupsService;

    @RequestMapping("/groups")
    public String list(Model model) {
        final List<GroupInterface> groups = this.groupsService.findAll();
        model.addAttribute("groups", groups);
        return "layout/group";
    }
}
