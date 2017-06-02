package exam.mappers;

import exam.entities.BrandsEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Your-Liya
 */
@Mapper
public interface CarsMapper {
    @Results(
            id = "flat",
            value = {
                    @Result(property = "id", column = "id"),
                    @Result(property = "brandId", column = "brandId"),
                    @Result(property = "power", column = "power"),
                    @Result(property = "engineCapacity", column = "engineCapacity"),
                    @Result(property = "model", column = "model"),
                    @Result(property = "doorNumber", column = "doorNumber"),
            })
    @Select("SELECT * FROM brands ORDER BY id")
    List<BrandsEntity> findAll();

}
