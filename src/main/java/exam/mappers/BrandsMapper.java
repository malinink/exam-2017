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
public interface BrandsMapper {
    @Results(
            id = "flat",
            value = {
                    @Result(property = "id", column = "id"),
                    @Result(property = "name", column = "name"),
                    @Result(property = "foundationDate", column = "foundationDate"),
                    @Result(property = "premium", column = "premium")
            })
    @Select("SELECT * FROM brands ORDER BY id")
    List<BrandsEntity> findAll();
}
