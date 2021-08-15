public class Main {

    public static void main(String[] args) {
	Fighter f1=new Fighter("Mübb",100,25,59,50);
	Fighter f2=new Fighter("Tubi",100,40,50,50);
    Match match=new Match(f1,f2,0,100);
    match.run();
    }
}
