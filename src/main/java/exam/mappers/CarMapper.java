package exam.mappers;

import exam.entities.CarEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by erale on 27.05.2017.
 */
@Mapper
@SuppressWarnings("checkstyle:linelength")
public interface CarMapper {
    @Results(
            id = "Car",
            value = {
                    @Result(property = "id", column = "id"),
                    @Result(property = "power", column = "power"),
                    @Result(property = "enginesize", column = "enginesize"),
                    @Result(property = "model", column = "model"),
                    @Result(property = "doors", column = "doors")
            })
    @Select("SELECT * FROM cars")
    List<CarEntity> findAll();

    @Select("SELECT * FROM cars where id=#{id}")
    @ResultMap("Brand")
    CarEntity find(Integer id);

    @Insert("INSERT INTO cars (power, enginesize, model, doors) VALUES(#{power}, #{enginesize}, #{model}, #{doors}" )
    @Options(useGeneratedKeys = true, keyColumn = "name")
    void insert(CarEntity user);

    @Update("UPDATE cars SET power=#{power}, enginesize=#{enginesize}, model=#{model}, doors=#{doors}")
    void update(CarEntity user);

    @Delete("DELETE FROM cars WHERE id=#{id}")
    void delete(CarEntity user);
}
