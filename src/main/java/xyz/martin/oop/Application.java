package xyz.martin.oop;

import xyz.martin.oop.constant.Gender;
import xyz.martin.oop.model.Student;

public class Application {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Martin");
        student.setAge(22);
        student.setGender(Gender.MALE.name());
        student.setIdNo("1601030128");

        System.out.println("------------start to print attributes------------");
        System.out.println("[student name]\t" + student.getName());
        System.out.println("[student age]\t" + student.getAge());
        System.out.println("[student gender]\t" + student.getGender());
        System.out.println("[student idNo]\t" + student.getIdNo());
        System.out.println("------------end to print attributes------------");
    }

}
