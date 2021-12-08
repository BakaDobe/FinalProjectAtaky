package Source;
public class Teacher extends Person implements PayRoll {
    String speciality;
    String degree;

    public Teacher(){}
    public Teacher(String speciality, String degree) {
        this.speciality = speciality;
        this.degree = degree;
    }
    public Teacher(int id, String name, int age, String gender, String speciality, String degree){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.speciality = speciality;
        this.degree = degree;
    }
    
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getDegree() {
        return degree;
    }

    //@Override
    public double computePayRoll(double saldegree) {
        return saldegree;
    }
    
    @Override
    public String toString(){
        return "-Speciality: " + speciality + "\nDegree: " + degree;
    }
//    @Override
//    public String toString(){
//        return "ID: " + id + "Name: " + name + "Age: " + age + "Gender: " + gender + "Speciality: " + speciality + "Degree: " + degree;
//    }
    
//    public void view(){
//        System.out.println("Speciality: " + speciality + "Degree: " + degree); 
//    }
}