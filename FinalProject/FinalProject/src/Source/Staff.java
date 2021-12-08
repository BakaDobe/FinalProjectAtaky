package Source;
public class Staff extends Person implements PayRoll {
    String duty;
    int workload;
    
    public Staff(){}
    public Staff(String duty, int workload) {
        this.duty = duty;
        this.workload = workload;
    }
    public Staff(int id, String name, int age, String gender, String duty, int workload){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.duty = duty;
        this.workload = workload;
    }
    
    public void setDuty(String duty) {
        this.duty = duty;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public String getDuty() {
        return duty;
    }

    public int getWorkload() {
        return workload;
    }

    //@Override
    public double computePayRoll(double workload) {
        int exceedHours = 36;
        if(workload <= 0){
            return -1;
        }
        else if(workload < exceedHours ){
            
        }return (workload*32*2)*0.85;
    }
    
    @Override
    public String toString(){
        return "ID: " + id + "Name: " + name + "Age: " + age + "Gender: " + gender + "Duty: " + duty + "Workload: " + workload;
    }
}