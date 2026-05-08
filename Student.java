package Ss9Rikke;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private String fullName;
    private int age;
    private double gpa;

    private final double MIN_GPA = 0.0;
    private final double MAX_GPA = 4.0;

    private static int count = 0;
    public Student() {
    }

    public Student(String id, String fullName, int age, double gpa) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gpa = gpa;
        count ++;
    }

    public static int getCount() {
        return count;
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Tuổi: " + age);
        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args) {
        Student s1 = new Student("S01", "Nguyễn Việt Dương", 20, 3.5);
        Student s2 = new Student("S02", "Trần Thị B", 21, 3.8);
        Student s3 = new Student("S03", "Lê Văn C", 19, 3.2);
        Student s4 = new Student("S04", "Hoàng Van D", 33, 3.4);


        List<Student> st = new ArrayList<>();
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);

        System.out.println("Danh sách sinh viên là:");
        for(Student s : st) {
            s.printInfo();
        }
        System.out.println("Tổng số sinh viên được tạo là:"+Student.getCount());
    }
}
