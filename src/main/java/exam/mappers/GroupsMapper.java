package exam.mappers;

import exam.entities.GroupsEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author  Valentin26
 */

/*
public interface GroupsMapper {
    @Select("SELECT * FROM groups")
    @Results(
            id = "Group",
            value = {
                    @Result(property = "id", column = "id"),
                    @Result(property = "cource", column = "cource"),
                    @Result(property = "faculty", column = "name"),
                    @Result(property = "description", column = "description"),
                    @Result(property = "warden_id", column = "warden_id")
            })
    List<GroupsEntity> findAll();

    @Select("SELECT * FROM groups WHERE id=#{id}")
    @ResultMap("Group")
    GroupsEntity find(Integer id);

    @Select("SELECT * FROM groups WHERE Warden_id=#{Warden_id}")
    @ResultMap("Group")
    List<GroupsEntity> findByWarden_id(Integer warden_id);

    @Insert("INSERT INTO groups (cource, description, warden_id,faculty) VALUES (#{cource}, #{description}, #{warden_id}, #{faculty} )")
    @Options(useGeneratedKeys = true, keyColumn = "id")
    void insert(GroupsEntity group);

    @Update("UPDATE groups SET name=#{name}, description=#{description}, warden_id=#{warden_id}, faculty=#{faculty} WHERE id=#{id}")
    void update(GroupsEntity group);

    @Delete("DELETE FROM groups WHERE id=#{id}")
    void delete(GroupsEntity group);

}
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
