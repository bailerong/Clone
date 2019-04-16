package com.lele.clone;

public class TestClone {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("张三","数学");
        Student student=new Student("lele",13,teacher);
        System.out.println("这是原来的学生");
        System.out.println(student);
        System.out.println("这是克隆的学生");
        Student CloneStudent=null;
        try {
             CloneStudent= (Student) student.clone();
            System.out.println(CloneStudent);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //注意：
        //teacher ->student
        //teacher->clonestudent
        //如果teacher的信息改变了，student和cloneStudent中关于teacher的信息都变了，说明teacher是共享的

        //如果teacher的信息改变了，student中关于teacher的信息改变了，cloneTeacher没有改变，说明teacher是私有的
        teacher.setName("Tang");
        System.out.println(student);
        System.out.println(CloneStudent);

    }
}
