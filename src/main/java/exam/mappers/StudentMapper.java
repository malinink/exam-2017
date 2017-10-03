package exam.mappers;

import exam.entities.Group;
import exam.entities.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by valentin on 03.10.17.
 */
@Mapper
public interface StudentMapper {
    @Results(
            id = "students",
            value = {
                    @Result(property = "id", column = "id"),
                    @Result(property = "first_name", column = "first_name"),
                    @Result(property = "last_name", column = "last_name"),
                    @Result(property = "surname", column = "surname"),
                    @Result(property = "student_card", column = "student_card"),
                    @Result(property = "group_id", column = "group_id")
            })
    @Select("SELECT * FROM students ")
    List<Group> findAll();

   /* @Select("SELECT * FROM students WHERE group_id=#{id}")
    List<Student> findByGroupId(int id);*/

    @Select("SELECT * FROM students ORDER by first_name")
    List<Student> findAllsort();

    @Select("SELECT * FROM students WHERE id=#{id}")
    Student find(int id);

    @Update("UPDATE students SET first_name=#{first_name} , last_name=#{last_name} WHERE id=#{id}")
    void update(Student student);

    @Select("SELECT groups.id, groups.number, groups.course, groups.captain, groups.facult from students JOIN groups ON students.group_id = groups.id WHERE students.id =#{id}")
    List <Group> findGroupByStudent(int id);

}

