package exam.mappers;

import exam.entities.GroupsEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author  Valentin26
 */


public interface GroupsMapper {
    @Select("SELECT * FROM hobbys")
    @Results(
            id = "Hobby",
            value = {
                    @Result(property = "id", column = "id"),
                    @Result(property = "title", column = "title"),
                    @Result(property = "country", column = "country"),
                    @Result(property = "description", column = "description"),
            })
    List<GroupsEntity> findAll();

    @Select("SELECT * FROM hobbys WHERE id=#{id}")
    @ResultMap("Hobby")
    GroupsEntity find(Integer id);


    @Insert("INSERT INTO hobbys (title, description, country) VALUES (#{title}, #{description}, #{country} )")
    @Options(useGeneratedKeys = true, keyColumn = "id")
    void insert(GroupsEntity hobby);

    @Update("UPDATE hobbys SET name=#{name}, description=#{description}, country=#{country}, title=#{title} WHERE id=#{id}")
    void update(GroupsEntity hobby);

    @Delete("DELETE FROM hobbys WHERE id=#{id}")
    void delete(GroupsEntity hobby);

}
