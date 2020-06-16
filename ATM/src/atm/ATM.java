package atm;

import java.util.Scanner;



public class ATM {

    public static void main(String[] args) {
        CC conto = new CC();
        String s;
        char c;
        float money;
        do{
            conto.menu();
            Scanner sc = new Scanner(System.in);
            s = sc.nextLine().toLowerCase();
            c = s.charAt(0);
            switch(c){
                case 'v':
                    System.out.println("Somma di versamento: ");
                    money = sc.nextFloat();
                    conto.versamento(money);
                    break;
                case 'p':
                    System.out.println("Somma da prilevare: ");
                    money = sc.nextFloat();
                    conto.prelevamento(money);
                    break;
                case 'h': 
                    for(int i=0;i<conto.getHistory().length;i++)
                         System.out.println(conto.getHistory()[i]+"");
                    
                    break;
                case 's': System.out.println(conto.getBalance()); break;
                case 'x': break;
                default: System.out.println("Operazione non valida"); break;
                
            }
            
        }while(c!='x');
    }
 
}
