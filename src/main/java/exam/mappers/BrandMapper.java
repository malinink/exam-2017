package exam.mappers;
import exam.entities.BrandEntity;
import java.util.List;
import org.apache.ibatis.annotations.*;


@Mapper
@SuppressWarnings("checkstyle:linelength")
public interface BrandMapper {
    @Results(
            id = "Brand",
            value = {
                    @Result(property = "id", column = "id"),
                    @Result(property = "name", column = "name"),
                    @Result(property = "date", column = "date"),
                    @Result(property = "premium", column = "premium")
            })
    @Select("SELECT * FROM brands")
    List<BrandEntity> findAll();

    @Select("SELECT * FROM brands where id=#{id}")
    @ResultMap("Brand")
    BrandEntity find(Integer id);

    @Insert("INSERT INTO brands (name, date, premium) VALUES(#{name}, #{date}, #{premium}")
    @Options(useGeneratedKeys = true, keyColumn = "name")
    void insert(BrandEntity user);

    @Update("UPDATE brands SET name=#{name}, date=#{date}, premium=#{premium}")
    void update(BrandEntity user);

    @Delete("DELETE FROM brands WHERE id=#{id}")
    void delete(BrandEntity user);
}
