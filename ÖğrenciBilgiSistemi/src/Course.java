public class Course {
    Teacher teacher;
    String name,code,prefix;
    int note,snote;
    double cavarage;
    Course(String name,String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.snote=0;
        this.cavarage=0.0;
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }else{
            System.out.println("öğretmen ve ders uyuşmuyor.");
        }
    }
    void printTeacherInfo(){
        this.teacher.print();
    }

}
