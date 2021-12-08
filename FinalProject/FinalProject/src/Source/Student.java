package Source;
public class Student extends Person {
    String course;
    int semester;
    
    public Student(){}
    public Student(String course, int semester) {
        this.course = course;
        this.semester = semester;
    }
    public Student(int id, String name, int age, String gender, String course, int semester){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.course = course;
        this.semester = semester;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCourse() {
        return course;
    }

    public int getSemester() {
        return semester;
    }
    
    @Override
    public String toString(){
        return "ID: " + id + "Name: " + name + "Age: " + age + "Gender: " + gender + "Course: " + course + "Semester: " + semester;
    }
    
}