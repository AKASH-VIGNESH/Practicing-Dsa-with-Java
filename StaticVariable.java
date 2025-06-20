class Student{
    private int rollNo;
    private String Name;
    static String school; 

    public int getRollNo() {
        return rollNo;
    }
    public String getName() {
        return Name;
    }
    public static String getSchool() {
        return school;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setName(String name) {
        Name = name;
    }
    public static void setSchool(String school) {
        Student.school = school;
    }

    public static void display1(Student obj)
    {
        System.out.println("RollNo: "+ obj.rollNo);
        System.out.println("Name: "+ obj.Name);
        System.out.println("School: "+ school);
    }

    static
    {
        System.out.println("In static block");
    }
}

public class StaticVariable{
    public static void main(String [] args)
    {
        Student obj1 = new Student();
        obj1.setName("Akash");
        obj1.setRollNo(10);
        Student.setSchool("adithya public matric hr.sec.school");
        Student.display1(obj1);        
    }
}
