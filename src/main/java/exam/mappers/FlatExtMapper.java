package exam.mappers;

import exam.entities.FlatExt;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by alex on 02.06.17.
 */
public interface FlatExtMapper {
    @Results(
            id = "flat",
            value = {
                    @Result(property = "id", column = "id"),
                    @Result(property = "floor", column = "floor"),
                    @Result(property = "entrance", column = "entrance"),
                    @Result(property = "adress", column = "adress"),
                    @Result(property = "livingsquare", column = "livingsquare")
            })

    @Select("SELECT flats.id, flats.floor, flats.entrance, flats.adress, rrr.sum AS livingsquare FROM flats LEFT JOIN (SELECT temp.id, SUM(temp.sq) FROM  (SELECT flats.id, room.square AS Sq  FROM flats LEFT JOIN room ON flats.id = room.flat_id) AS temp GROUP BY temp.id) AS rrr ON rrr.id = flats.id")
    List<FlatExt> findAll();

}
