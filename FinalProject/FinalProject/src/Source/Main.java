package Source;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/*@author Brams*/

interface PayRoll{
    public double computePayRoll(double pr);
}

public class Main {
    public static void main(String[] args) {
//        String sp;
//        String dg;
        double saldegreeP = (36 * 112 * 2)*0.76;
        
        
        
        
        
        boolean flag = true;
        boolean stop = true;
        ArrayList<Teacher> myTea = new ArrayList<>();
        Teacher t1 = new Teacher("Math", "Master");
        Teacher t2 = new Teacher("French", "Bachelor");
        Teacher t3 = new Teacher("Science", "Phd");
        Teacher t4 = new Teacher("English", "Bachelor");
        
        myTea.add(t1);
        myTea.add(t2);
        myTea.add(t3);
        myTea.add(t4);
        for(Teacher t: myTea){
            System.out.println(t);
        }
          //CODE WORKS
        Teacher test = new Teacher("Science", "mmmm");
        //myTea.add(test);
//        System.out.println(test);
//        System.out.println(myTea.contains(test));
//        System.out.println(myTea.indexOf(test));
        
        int contains = 0;
        for(Teacher p: myTea){
            if(p.getDegree() == test.getDegree());
            contains++;
        }if(contains!=0){
            System.out.println("Element Found");
            /*System.out.println("Salary: " + saldegreeP);*/ //Add in later
        }else{
            System.out.println("Element does not exist");
        }
//        for(Teacher tn: myTea){
//            System.out.println(tn);
//        }
//        Scanner menuOp = new Scanner(System.in);
//        int menuOption = menuOp.nextInt();
//        if(flag){
//            do{
//                switch(menuOption){
//                    case 1:
//                        System.out.println("Select Speciality");
//                        sp = menuOp.nextLine();
//                        menuOp.nextLine();
//                        System.out.println("Select Degree");
//                        dg = menuOp.nextLine();
//                        
//                        Teacher t5 = new Teacher(sp, dg);
//                        myTea.add(t5);
//                        for(Teacher tn: myTea){
//                            System.out.println(tn);
//                        }
//                        int counter = 0;
//                        double saldegreeP = (36 * 112 * 2)*0.76;
//                        for(Teacher tc: myTea){
//                            if(tc.getDegree().contains("Phd") /*&& tc.getDegree().equals(t5.getDegree())*/){
//                                counter++;
//                            }if(counter!=0){
//                                System.out.println("Element Found");
//                                System.out.println("Salary: " + saldegreeP);
//                                break;
//                            }else{
//                                System.out.println("Element not found");
//                            }
//                        }break;
//                        case 2:
//                            System.exit(0);
//                            break;
//                        }
//            }while(stop == true);
//        }
    }
}