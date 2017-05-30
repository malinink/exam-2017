package exam.entities;

/**
 * Created by panchenkoanton on 30.05.17.
 */
public class Student {

    private int id;
    private String first_name;
    private String last_name;
    private String surname;
    private int student_card;
    private int group_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String middle_name) {
        this.surname = surname;
    }

    public int getStudent_card() {
        return student_card;
    }

    public void setStudent_card(int student_card) {
        this.student_card = student_card;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }
}
