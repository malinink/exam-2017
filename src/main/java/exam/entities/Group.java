package exam.entities;

/**
 * Created by valentin on 03.10.17.
 */
public class Group {
    private int id;
    private int number;
    private int course;
    private String facult;
    private int captain;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFacult() {
        return facult;
    }

    public void setFacult(String facult) {
        this.facult = facult;
    }

    public int getCaptain() {
        return captain;
    }

    public void setCaptain(int captain) {
        this.captain = captain;
    }


}

