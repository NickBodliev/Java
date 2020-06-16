package atm;


public class CC {
     private float balance;
     private float history [] = new float[5];
        
        public double getBalance(){
            return balance;
        } 
        
        
        
        public float []getHistory(){
            return history;
        }
        
        public void menu(){
            System.out.println("Prremi uno dei seguenti pulsanti:");
            System.out.println("p-Prelevamento");
            System.out.println("v-Versamento");
            System.out.println("s-Saldo");
            System.out.println("h-History");
            System.out.println("x-Exit");
        }
        
        public void prelevamento(float money){
           float newBalance = balance - money;
           balance = newBalance;
           money = -money;
           updateHistory(money);
        
        }
      
        public void versamento(float money){
            float newBalance = balance + money;
            balance = newBalance;
            updateHistory(money);
        }
        
        public void updateHistory(float money){
            float buffer[] = new float[5];
            int i;
            for(i = 1;i<history.length;i++)
                buffer[i] = history[i-1];
            buffer[0] = money;
            for(i = 0;i<history.length;i++)
                history[i] = buffer[i];
            
        }
}
