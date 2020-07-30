public class Student {
    private String name;

    public Student(String name){
        this.name = name;
    }
    @Override
    public boolean equals (Object student){

        // 强制类型转换前判断
        if(this == student)
            return true;

        if(student == null)
            return false;

        if(this.getClass() != student.getClass())
            return false;

        // 强制类型转换
        Student anther = (Student) student;

        return this.name.toLowerCase().equals(anther.name.toLowerCase());
    }
}
