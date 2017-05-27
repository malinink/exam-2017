package exam.services;

import exam.entities.StudentEntity;
import exam.mappers.GroupsMapper;
import exam.mappers.StudentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  Valentin26
 */
@Service

public class StudentsService {

    @Autowired
    private StudentsMapper studentsMapper;

    public List<StudentEntity> findAll() {
        return this.studentsMapper.findAll();
    }


}

