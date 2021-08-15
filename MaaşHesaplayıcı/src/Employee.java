public class Employee {
    String name;
    double salary,newSalary,TotalSalary;
    int hireYear,workHours;
    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    double tax(){
      if(this.salary<1000){
          return 0;
      }else{
          return salary*0.03;
      }

    }
    int bonus(){
        if(this.workHours>40){
            return (workHours-40)*30;
        }else{
        return 0;
        }
    }double raiseSlary(){
        int year=2021-hireYear;
        if(year<10){
            return this.salary*0.05;
        }else if(9<year && year<20){
            return this.salary*0.1;
        }else {
            return this.salary*0.15;
        }
    }
    public void print(){
        System.out.println("Adı: "+name+ "\nMaaşı: "+salary+"\nÇalışma saati: "+workHours+
                "\nBaşlangıç Yılı: "+hireYear+"\nVergi: "+tax()+"\nBonus: "+bonus()+
                "\nMaaş artışı: "+raiseSlary()+"\nVergi ve Bonuslarla birlikte maaş:"+(salary+tax()+bonus())+
                "\nToplam Maaş:"+(salary+tax()+bonus()+raiseSlary()));

    }
}
