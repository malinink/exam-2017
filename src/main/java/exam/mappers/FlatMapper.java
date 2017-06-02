package exam.mappers;

import exam.entities.Flat;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by alex on 02.06.17.
 */
public interface FlatMapper {
    @Results(
            id = "flat",
            value = {
                    @Result(property = "id", column = "id"),
                    @Result(property = "floor", column = "floor"),
                    @Result(property = "entrance", column = "entrance"),
                    @Result(property = "adress", column = "adress")
            })
    @Select("SELECT * FROM flats")
    List<Flat> findAll();

}

