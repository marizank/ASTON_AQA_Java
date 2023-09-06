package Lesson4;

public class EmployeeMassiv {

    String name;
    String surname;
    String position;
    String email;
    int phoneNumber;
    double salary;
    int age;

    EmployeeMassiv(String name1, String surname1, String position1, String email1, int phoneNumber1, double salary1, int age1) {
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
    class EmployeeMassivCreate {
        public static void main(String[] args){
            EmployeeMassiv[] arr;
            arr = new EmployeeMassiv[5];

            arr[0]=new EmployeeMassiv("Ron", "Redty", "AQA", "ronret@gmail.com", 12344442, 3453, 43);
            arr[1]=new EmployeeMassiv("Pol","Popov", "tester", "gopret@gmail.com", 3445434, 4054,22);
            arr[2]=new EmployeeMassiv("Kol","Sorty", "QA", "kolsoret@gmail.com", 4625674, 3054,34);
            arr[3]=new EmployeeMassiv("Fort", "Doptrew", "tester","folbop@gmail.com", 3242434, 4600, 46);
            arr[4]=new EmployeeMassiv("Fol", "Topov", "tester", "gopret@gmail.com", 3445434, 405.34, 18);

            for (int i = 0; i < arr.length; i++){
                if (arr[i].age>40)
                    System.out.println("Employee:"+ "name:"+arr[i].name+" surname:"+ arr[i].surname+" position:"+arr[i].position+" email:"+arr[i].email+" phoneNumber:"+arr[i].phoneNumber+" salary:"+arr[i].salary+" age:"+arr[i].age);
            }
        }

}
