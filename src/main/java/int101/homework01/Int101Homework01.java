package int101.homework01;

import work03.MyUtil;
import work04.BankAccount;
import work04.Person;

public class Int101Homework01 {

    public static void main(String[] args) {
        work01Question(true, false, true, false, true, false);
        work01Answer(true, false, true, false, true, false);
        work02Question(1, 2, 3, 4, 5, 6);
        work02Answer(1, 2, 3, 4, 5, 6);
        work03UseOfUtilityClass();
        work04UseOfObjectClass();
    }
    
    static void work01Question(boolean b1, boolean b2, boolean b3, 
       boolean b4, boolean b5, boolean b6) {
       boolean b = ((b1 ^ (b2 | b3)) && b4) || (b5 & b6); 
       System.out.println("Work01:Question: b = " + b);
    }
    
    static void work01Answer(boolean b1, boolean b2, boolean b3, 
       boolean b4, boolean b5, boolean b6) {
       boolean b = b1 ^ (b2 | b3) && b4 || b5 & b6; 
       System.out.println("Work01:Answer: b = " + b);
    }
    
    
    static void work02Question(int v1, int v2, int v3, int v4, int v5, int v6) {
       boolean b = ((v1 << v2) < v3) != (v3 > ((v4 ^ v5) | v6)); 
       System.out.println("Work02:Question: b = " + b);
    }
    
    static void work02Answer(int v1, int v2, int v3, int v4, int v5, int v6) {
       boolean b = v1 << v2 < v3 != v3 > (v4 ^ v5 | v6); 
       System.out.println("Work02: Question: b = " + b);
    }

    
   static void work03UseOfUtilityClass() {
       System.out.println("BMI = " + MyUtil.calculateBMI(52,1.60));
       System.out.println("Average = " + MyUtil.average(2,4,6));
   }
   

   static void work04UseOfObjectClass() {
       
       // Person
       Person person1 = new Person(13);
       Person person2 = new Person(20);
       
       //toString
       System.out.println(person1);
       System.out.println(person2);
       
       //setId + getId
       person2.setId(24);
       System.out.println("New person2 id : " + person2.getId());
       
       
       // BankAccount
       BankAccount account1 = new BankAccount(123, person1);
       BankAccount account2 = new BankAccount(456, person2);
       
       //toString
       System.out.println(account1);
       System.out.println(account2);
       
       //deposit
       account1.deposit(200);
       System.out.println("Balance of Account1 : "+ account1.getBalance());
       account2.deposit(1);
       System.out.println("Balance of Account2 : "+ account2.getBalance());
       
       //withdraw
       account1.withdraw(128);
       System.out.println("Balance of Account1 : " + account1.getBalance());
       
       //transfer
       account1.transfer(53, account2);
       System.out.println("Balance of Account2 : "+ account2.getBalance());
       
       //getOwner
       System.out.println("Owner of account1 : " + account1.getOwner());
       System.out.println("Owner of account2 : " + account2.getOwner());
   }

}
