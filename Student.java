public class Student {
    String name;
    String studentId;

    public Student(String name, String id){
        this.name = name;
        this.studentId = id;
    }

    public void showStudent(){
        System.out.println("Student Name = " + name);
        System.out.println("Student Id = " + studentId);
    }
}
