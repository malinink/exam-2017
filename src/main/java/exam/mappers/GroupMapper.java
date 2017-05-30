package exam.mappers;

import exam.entities.Group;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by panchenkoanton on 30.05.17.
 */
@Mapper
public interface GroupMapper {
    @Results(
            id = "group",
            value = {
                    @Result(property = "id", column = "id"),
                    @Result(property = "number", column = "number"),
                    @Result(property = "course", column = "course"),
                    @Result(property = "captain", column = "captain")
            })
    @Select("SELECT * FROM groups ORDER BY id")
    List<Group> findAll();
}
