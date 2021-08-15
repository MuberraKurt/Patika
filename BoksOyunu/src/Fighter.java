public class Fighter {
    String name;
    int health,damage,weight;
    double dodge;
    Fighter(String name,int health,int damage,int weight,double dogde){
        this.name=name;
        this.health=health;
        this.damage=damage;
        this.weight=weight;
        this.dodge=dogde;
    }
    int hit(Fighter foe){
        System.out.println(this.name+"\t=>\t"+foe.name+" "+this.damage+" hasar verdi.");
        if(foe.isDodge()){
            System.out.println(foe.name+ " gelen hasarı blokladı.");
            return foe.health;
        }
        if(foe.health-this.damage<0)
            return 0;
        return foe.health-this.damage;
    }
    boolean isDodge(){
        double randomValue=Math.random()*100;
        return randomValue<=this.dodge;

    }

}
