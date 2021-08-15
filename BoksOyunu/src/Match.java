public class Match {
    Fighter f1,f2;
    int minWeight,maxWeight,min=2,max=3;
    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
        }
    void run(){
        if(checkWeight()){
            while (f1.health>0 && f2.health>0){
                System.out.println("----New Round-----");
                if(whoStart()){
                    f1.health=f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                    f2.health=f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                    printScore();
                }else{
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            }


        }else{
            System.out.println("Yarışmacılar farklı sikletlerde.");
        }
    }
    boolean checkWeight(){
      return (f1.weight>=minWeight && f1.weight<=maxWeight) && (f2.weight>=minWeight && f2.weight<=maxWeight);
    }
    boolean isWin(){
        if(f1.health==0){
            System.out.println(f2.name+" kazandı.");
            return true;
        }else if(f2.health==0){
            System.out.println(f1.name+" kazandı.");
            return true;
        }
     return false;
    }
    boolean whoStart(){
        int number = (int) (Math.floor(Math.random()*(this.max - this.min +1))+ this.min);
        return number==3;
    }
    void printScore(){
        System.out.println(f1.name+" Kalan can: "+f1.health);
        System.out.println(f2.name+" Kalan can: "+f2.health);
    }

}
