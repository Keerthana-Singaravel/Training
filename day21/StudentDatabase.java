package Day21.MiniProject;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Student{
      public int id;
      public String name;
      public int age;
      public String grade;
      public String email;
      public Student(int id,String name,int age,String grade,String email){
          this.id=id;
          this.name=name;
          this.age=age;
          this.grade=grade;
          this.email=email;
      }
      public int getId(){
          return id;
    }
    public String getName(){
          return name;
    }
    public int getAge(){
          return age;
    }
    public String getGrade(){
          return grade;
    }
    public String getEmail(){
          return email;
    }


    public void setName(String name){
          this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGrade(String grade){
        this.grade=grade;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String toString(){
          return "Id : "+id+" Name : "+name+" Age : "+age+" Grade : "+grade+" Email :"+email;
    }

}
class StudentManage {
    public List<Student> s = new ArrayList<>();
    public static final String File_Name = "StudentDatabase.csv";

    public StudentManage() {
        loadFromFile();
    }

    public void AddStudent(Student stu) {
        if (s.stream().anyMatch(s -> s.getId() == s.getId())) {
            System.out.println("Student ID already exists.");
            return;
        }
        s.add(stu);
        saveToFile();
    }

    public List<Student> viewDatabase() {
        return s;
    }

    public Optional<Student> searchStudentId(int id) {
        return s.stream().filter(x -> x.getId() == id).findFirst();
    }

    public void deleteStudent(int id) {
        s.removeIf(st -> st.getId() == id);
        saveToFile();
    }

    public void SortAge() {
        int n = s.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - 1; j++) {
                if (s.get(j).getAge() > s.get(j + 1).getAge()) {
                    Student t = s.get(j);
                    s.set(j, s.get(j + 1));
                    s.set(j + 1, t);
                }
            }
        }
    }

    public boolean isValid(String email) {
        String emailcheck = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern p = Pattern.compile(emailcheck);
        Matcher m = p.matcher(email);
        return m.matches();
    }

    public void saveToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(File_Name))) {
            for (Student student : s) {
                writer.println(student.getId() + "," + student.getName() + "," + student.getAge() + "," + student.getGrade() + "," + student.getEmail());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFromFile() {
      new Thread(() -> {
        try (BufferedReader reader = new BufferedReader(new FileReader(File_Name))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 5) {  
                    s.add(new Student(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), data[3], data[4]));
                }
            }
        } catch (IOException e) {
            s = new ArrayList<>();
        }
      }).start();
    }
}
public class StudentDatabase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            StudentManage sm = new StudentManage();
            while (true) {
                System.out.println();
                System.out.println(" 1. Add Student data \n 2. View Student Data \n 3. Search Student Data \n 4. Update Student Database \n 5. Delete database \n 6. Sort with age \n 7. Exit ");

                int z = sc.nextInt();
                switch (z) {
                    case 1:
                        System.out.println("enter the student Id :");
                        int id = sc.nextInt();
                        if (sm.searchStudentId(id).isPresent()) {
                            System.out.println("Student ID already exists.");
                            break;
                        }
                        sc.nextLine();
                        System.out.println("enter the Student name:");
                        String name = sc.nextLine();
                        int age = 0;
                        boolean valid = false;
                        while (!valid) {
                            try {
                                System.out.println("enter student age:");
                                age = sc.nextInt();
                                sc.nextLine();
                                if (age < 18 || age > 100) {
                                    System.out.println("Age must be greater than 18 ");
                                }
                                valid = true;
                            } catch (Exception e) {
                                System.out.println("Invalid age ...");
                                sc.nextLine();
                            }
                        }
                        System.out.println("enter student grade:");
                        String grade = sc.nextLine();
                        System.out.println("enter student email:");
                        String email = sc.nextLine();
                        while (!sm.isValid(email)) {
                            System.out.println("Invalid email id...please enter valid email...");
                            email = sc.nextLine();
                        }
                        sm.AddStudent(new Student(id, name, age, grade, email));
                        break;
                    case 2:
                        System.out.println("Student Database : ");
                        sm.viewDatabase().forEach(System.out::println);
                        break;
                    case 3:
                        System.out.println("enter student id to search database:");
                        int searchId = sc.nextInt();
                        sm.searchStudentId(searchId).ifPresentOrElse(System.out::println, () -> System.out.println("DB not found.."));
                        break;
                    case 4:
                        System.out.println("enter the id to update database:");
                        int uid = sc.nextInt();
                        sc.nextLine();
                        Optional<Student> toUpdate = sm.searchStudentId(uid);
                        if (toUpdate.isPresent()) {
                            Student s = toUpdate.get();
                            System.out.println("What data want to update :\n 1. Name \n 2. Age \n 3. Grade \n 4. Email ");
                            int q = sc.nextInt();
                            switch (q) {
                                case 1:
                                    System.out.println("enter the name to update:");
                                    String uname = sc.nextLine();
                                    s.setName(uname);
                                    sm.saveToFile();
                                    break;
                                case 2:
                                    System.out.println("enter updated age:");
                                    int uage = sc.nextInt();
                                    sc.nextLine();
                                    s.setAge(uage);
                                    sm.saveToFile();
                                    break;
                                case 3:
                                    System.out.println("enter updated grade:");
                                    String ugrade = sc.nextLine();
                                    s.setGrade(ugrade);
                                    sm.saveToFile();
                                    break;
                                case 4:
                                    System.out.println("enter updated email:");
                                    String uemail = sc.nextLine();
                                    while (!sm.isValid(uemail)) {
                                        System.out.println("invalid email....enter the valid email:");
                                        uemail = sc.nextLine();
                                    }
                                    s.setEmail(uemail);
                                    sm.saveToFile();
                                    break;
                            }
                        } else {
                            System.out.println(uid + " Not found...");
                        }
                        break;
                    case 5:
                        System.out.println("enter Id to delete:");
                        int del = sc.nextInt();
                        sm.deleteStudent(del);
                        break;
                    case 6:
                        sm.SortAge();
                        System.out.println("Sorted the list with age:");
                        sm.viewDatabase().forEach(System.out::println);
                        break;
                    case 7:
                        System.exit(0);
                        break;

                    }
            }
    }
}

