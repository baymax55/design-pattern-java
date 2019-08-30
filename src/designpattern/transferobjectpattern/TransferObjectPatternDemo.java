package designpattern.transferobjectpattern;

import designpattern.transferobjectpattern.BO.StudentBO;
import designpattern.transferobjectpattern.VO.StudentVO;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author bx
 * @date 8/29/2019 4:45 PM
 */
public class TransferObjectPatternDemo {
    public static void main(String[] args) {
        StudentBO studentBO=new StudentBO();
        for(StudentVO student:studentBO.getAllStudents()){
            System.out.println("Student: [RollNo : " +student.getRollNo()+", Name : "+student.getName()+" ]");
        }
        //更新学生
        StudentVO student =studentBO.getAllStudents().get(0);
        student.setName("Michael");
        studentBO.updateStudent(student);

        //获取学生
        studentBO.getStudent(0);
        System.out.println("Student: [RollNo : " +student.getRollNo()+", Name : "+student.getName()+" ]");
    }
}
