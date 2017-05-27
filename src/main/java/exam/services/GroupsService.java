package exam.services;

import exam.entities.GroupsEntity;
import exam.mappers.GroupsMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  Valentin26
 */



public class GroupsService {
    @Autowired
    private GroupsMapper groupsMapper;

    public List<GroupsEntity> findAll() {
        return this.groupsMapper.findAll();
    }


}
