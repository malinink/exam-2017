


package exam.mappers;

import exam.entities.StudentEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author  Valentin26
 */
@Mapper
public interface StudentsMapper {
    @Results(
            id = "Student",
            value = {
                    @Result(property = "id", column = "id"),
                    @Result(property = "firstName", column = "first_name"),
                    @Result(property = "lastName", column = "last_name"),
                    @Result(property = "surname", column = "sur_name"),
                    @Result(property = "birthday", column = "birth_day"),
                    @Result(property = "city", column = "ci_ty"),
                    @Result(property = "student_id", column = "student_id"),
                    @Result(property = "hobby_id", column = "hobby_id"),
            })
    @Select("SELECT * FROM students")
    List<StudentEntity> findAll();

    @Insert("INSERT INTO students (first_name, last_name, surname, hobby_id, student_id, city ,birthday,) VALUES(#{firstName}, #{lastName},#{surname},#{birthday},#{city}, #{hobby_id}, #{student_id})")
    @Options(useGeneratedKeys = true, keyColumn = "id")
    void insert(StudentEntity student);

    @Update("UPDATE students SET first_name=#{firstName}, last_name=#{lastName},sur_name=#{surname},birth_day=#{birthday},ci_ty=#{city}, hobby_id=#{hobby_id}, student_id=#{student_id}")
    void update(StudentEntity student);

    @Select("SELECT * FROM  students WHERE hobby_id=#{HobbyId}" )
    List<StudentEntity> findByHobbyId(Integer HobbyId);
}