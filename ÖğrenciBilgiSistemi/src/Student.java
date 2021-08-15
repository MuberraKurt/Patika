public class Student {
    String name,stuNo;
    int classes;
    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;
    Student(String name,String stuNo,int classes,Course c1,Course c2,Course c3 ){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;
    }

    public void addBulkExamNote(int note1,int note2,int note3){
       if(0<=note1 && note1<=100){
           this.c1.note=note1;
       }
        if(0<=note2 && note2<=100){
            this.c2.note=note2;
        }
        if(0<=note3 && note3<=100){
            this.c3.note=note3;
        }
    }
    void addBulkNote(int soz1,int soz2,int soz3){
        if(0<=soz1 && soz1<=100){
            this.c1.snote=soz1;
        }
        if(0<=soz2 && soz2<=100){
            this.c2.snote=soz2;
        }
        if(0<=soz3 && soz3<=100){
            this.c3.snote=soz3;
        }
    }
    void Avarage(){
        this.c1.cavarage=((this.c1.snote*0.3)+(this.c1.note*0.7));
        this.c2.cavarage=((this.c2.snote*0.2)+(this.c2.note*0.8));
        this.c3.cavarage=((this.c3.snote*0.4)+(this.c3.note*0.6));
    }
    void printAvarage(){
        System.out.println("Fizik ort:"+this.c2.cavarage);
        System.out.println("Mat ort:"+this.c1.cavarage);
        System.out.println("Kimya ort:"+this.c3.cavarage);
    }
    void calcAvarage(){
        this.avarage=(this.c1.note+this.c2.note+this.c3.note)/3.0;
    }
    void isPass(){
        calcAvarage();
        if(this.avarage>55){
            System.out.println("Geçtiniz.");
        }else{
            System.out.println("Kaldınız.");
        }
    }
    void printNote(){
        System.out.println("Öğrenci:"+this.name +"/nMatematik notu:"+this.c1.note+
                "/nFizik notu:"+this.c2.note+"/nKimya notu:"+this.c3.note);
    }
}
