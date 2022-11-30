 import javax.swing.JOptionPane;  
public class ATM  
{  
    public static void main(String args[] )  
    {    
        int balance = 0, withdraw, deposit;    
        JOptionPane.showMessageDialog(null,"ATM Machine\n"); 
        String val="yes";
        while(val=="yes")  
        {   
            JOptionPane.showMessageDialog(null,"Choose 1 for Deposit\nChoose 2 for Withdraw\n Choose 3 for Check Balance\nChoose 4 for EXIT\n");  
            String c = JOptionPane.showInputDialog("Choose the operation:"); 
            int choice=Integer.valueOf(c); 
            switch(choice)  
            {  
                case 2:  
                    String w=JOptionPane.showInputDialog("Enter money to be withdrawn:");
                    withdraw=Integer.valueOf(w);
                    if(balance >= withdraw)  
                    {   
                        balance = balance - withdraw;  
                        JOptionPane.showMessageDialog(null,"Please collect your money"); 
                        JOptionPane.showMessageDialog(null,"Your Balance:" +balance); 
                    }  
                    else  
                    {     
                        JOptionPane.showMessageDialog(null,"Insufficient Balance");  
                    }   
                    break;  
                case 1:    
                    String d =  JOptionPane.showInputDialog("Enter money to be deposited:");
                    deposit=Integer.valueOf(d);
                    balance = balance + deposit;  
                    JOptionPane.showMessageDialog(null,"Your Money has been successfully depsited");  
                    break;  
                case 3:   
                    JOptionPane.showMessageDialog(null,"Balance : "+balance);   
                    break;  
                case 4:  
                    val = "no";
                    break; 
            }  
        }  
    }  
}  