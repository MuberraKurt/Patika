import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Doğduğunuz gün:");
        int day = scan.nextInt();
        System.out.println("Doğduğunuz ay:");
        int month = scan.nextInt();
        if (month == 1) {
            if (0 < day && day <= 21) {
                System.out.println("Oğlak Burcu");
            } else if (21 < day && day <= 31) {
                System.out.println("Kova Burcu");
            }
        } else if (month == 2) {
            if (0 < day && day <= 19) {
                System.out.println("Kova Burcu");
            } else if (19 < day && day <= 30) {
                System.out.println("Balık Burcu");
            }
        } else if (month == 3) {
            if (0 < day && day <= 20) {
                System.out.println("Balık Burcu");
            } else if (20 < day && day <= 31) {
                System.out.println("Koç Burcu");
            }
        }else if(month==4) {
            if (0 < day && day <= 20) {
                System.out.println("Koç Burcu");
            } else if (20 < day && day <= 30) {
                System.out.println("Boğa Burcu");
            }
        }else if(month==5) {
            if (0 < day && day <= 21) {
                System.out.println("Boğa Burcu");
            } else if (21 < day && day <= 31) {
                System.out.println("İkizler Burcu");
            }
        }else if(month==6) {
            if (0 < day && day <= 22) {
                System.out.println("İkizler Burcu");
            } else if (22 < day && day <= 30) {
                System.out.println("Yengeç Burcu");
            }
        }else if(month==7) {
            if (0 < day && day <= 22) {
                System.out.println("Yengeç Burcu");
            } else if (22< day && day <= 31) {
                System.out.println("Aslan Burcu");
            }
        }else if(month==8) {
            if (0 < day && day <= 23) {
                System.out.println("Aslan Burcu");
            } else if (23 < day && day <= 30) {
                System.out.println("Başak Burcu");
            }
        }else if(month==9) {
            if (0 < day && day <= 22) {
                System.out.println("Başak Burcu");
            } else if (22 < day && day <= 31) {
                System.out.println("Terazi Burcu");
            }
        }else if(month==10) {
            if (0 < day && day <= 22) {
                System.out.println("Terazi Burcu");
            } else if (22 < day && day <= 30) {
                System.out.println("Akrep Burcu");
            }
        }else if(month==11) {
            if (0 < day && day <= 21) {
                System.out.println("Akrep Burcu");
            } else if (21 < day && day <= 31) {
                System.out.println("Yay Burcu");
            }
        }else if(month==12) {
            if (0 < day && day <= 21) {
                System.out.println("Yay Burcu");
            } else if (21 < day && day <= 30) {
                System.out.println("Oğlak Burcu");
           }
        }
    }
}
