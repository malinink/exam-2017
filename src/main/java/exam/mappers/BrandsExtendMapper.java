package exam.mappers;

import exam.entities.BrandsExtendEntity;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Your-Liya
 */
public interface BrandsExtendMapper {
    @Results(
            id = "flat",
            value = {
                    @Result(property = "id", column = "id"),
                    @Result(property = "name", column = "name"),
                    @Result(property = "foundationDate", column = "foundationDate"),
                    @Result(property = "premium", column = "premium"),
                    @Result(property = "carQuantity", column = "carQuantity")
            })
    @Select("SELECT brands.name, brands.foundationDate, brands.premium, count(cars.id) AS carQuantity FROM brands LEFT OUTER JOIN cars ON  brands.id = cars.brandId GROUP BY brands.id;")
    List<BrandsExtendEntity> findAll();
}
