public class Teacher {
    String name,mpno,branch;
    Teacher(String name,String mpno,String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }
    void print(){
        System.out.println("Adı:"+this.name);
        System.out.println("mpno:"+this.mpno);
        System.out.println("branch:"+this.branch);
    }


}
