package exam.mappers;

import exam.entities.Group;
import exam.entities.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by panchenkoanton on 30.05.17.
 */
@Mapper
public interface StudentMapper {
    @Results(
            id = "student",
            value = {
                    @Result(property = "id", column = "id"),
                    @Result(property = "first_name", column = "first_name"),
                    @Result(property = "last_name", column = "last_name"),
                    @Result(property = "surname", column = "surname"),
                    @Result(property = "student_card", column = "student_card"),
                    @Result(property = "group_id", column = "group_id")
            })
    @Select("SELECT * FROM students")
    List<Group> findAll();

    @Select("SELECT students.id, students.first_name, students.last_name, students.surname, students.student_card, " +
            "students.group_id FROM groups JOIN students ON groups.id = students.group_id WHERE groups.id =#{id};")
    List<Student> findAllStudentsOfGroup(int id);

    @Select("SELECT * FROM students WHERE group_id = 6;")
    List<Student> findAllStudentsWithoutGroup();
}
