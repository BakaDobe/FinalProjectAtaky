package Source;
import java.util.*;
public class Department {
    int id;
    String description;
    Teacher dean;
    ArrayList<Teacher> TeacherList = new ArrayList<>();
    ArrayList<Student> StudentList = new ArrayList<>();
    ArrayList<Staff> StaffList = new ArrayList<>();

    public Department(int id, String description, Teacher dean) {
        this.id = id;
        this.description = description;
        this.dean = dean;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDean(Teacher dean) {
        this.dean = dean;
    }

    public void setTeacherList(ArrayList<Teacher> TeacherList) {
        this.TeacherList = TeacherList;
    }

    public void setStudentList(ArrayList<Student> StudentList) {
        this.StudentList = StudentList;
    }

    public void setStaffList(ArrayList<Staff> StaffList) {
        this.StaffList = StaffList;
    }

    public int getID() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Teacher getDean() {
        return dean;
    }

    public ArrayList<Teacher> getTeacherList() {
        return TeacherList;
    }

    public ArrayList<Student> getStudentList() {
        return StudentList;
    }

    public ArrayList<Staff> getStaffList() {
        return StaffList;
    }
    
}