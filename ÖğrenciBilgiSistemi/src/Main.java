public class Main {

    public static void main(String[] args) {
    Teacher t1=new Teacher("Mahmut","123","MAT");
    Teacher t2=new Teacher("Ayşe","345","FZK");
    Teacher t3=new Teacher("Ali","567","KİM");
    Course mat=new Course("Matematik","MAT101","MAT");
    Course fizik=new Course("Fizİk","FZK101","FZK");
    Course kimya=new Course("Kimya","KİM101","KİM");
    mat.addTeacher(t1);
    fizik.addTeacher(t2);
    kimya.addTeacher(t3);

    Student s1=new Student("Ali","011",4,mat,fizik,kimya);
    s1.addBulkExamNote(0,0,0);
    s1.isPass();
    s1.addBulkNote(100,100,100);
    s1.Avarage();
    s1.printAvarage();
    }
}
