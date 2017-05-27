package exam.mappers;

import exam.entities.StudentEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 *
 */
public interface relationsMapper {

    @Select("SELECT hobby_id FROM hobbys_students WHERE student_id=#{studentId}")
    List<Integer> find(Integer studentId);
    

}
