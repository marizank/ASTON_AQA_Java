package Lesson4;

public class Employee {

    String name;
    String surname;
    String position;
    String email;
    int phoneNumber;
    double salary;
    int age;

    Employee(String name1, String surname1, String position1, String email1, int phoneNumber1, double salary1, int age1) {
        name = name1;
        surname = surname1;
        position = position1;
        email = email1;
        phoneNumber = phoneNumber1;
        salary = salary1;
        age = age1;
    }

    void showInfo() {
        System.out.println("name:" + name + " surname:" + surname +" position:" + position +" email:" + email + " phoneNumber:" + phoneNumber + " salary:" + salary + " age:" + age);
    }
}

    class EmployeeCreate {
        public static void main(String[] args){
            Employee a1=new Employee("Pol","Popov", "tester", "gopret@gmail.com", 3445434, 405.34,22);
            a1.showInfo();
        }
}
