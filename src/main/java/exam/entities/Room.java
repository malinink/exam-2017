package exam.entities;

/**
 * Created by alex on 02.06.17.
 */
public class Room {

    private int id;
    private int square;
    private String  function;
    private Boolean isliving;
    private int flat_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public Boolean getIsliving() {
        return isliving;
    }

    public void setIsliving(Boolean isliving) {
        this.isliving = isliving;
    }

    public int getFlat_id() {
        return flat_id;
    }

    public void setFlat_id(int flat_id) {
        this.flat_id = flat_id;
    }
}
