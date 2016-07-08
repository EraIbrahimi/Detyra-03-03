import javax.swing.*;

public class Voting{
public static void main(String[] args)
{ int age = new Integer(JOptionPane.showInputDialog("Type your age")).intValue();
  int HilaryClinton = 0;
  int DonaldTrump = 0;
  int vote=0; 
  
  if (age < 18)
     { JOptionPane.showMessageDialog(null,"You can't vote.");
     }
  else{ vote = new Integer(JOptionPane.showInputDialog("Vote for your favourite: \n1.Hilary Clinton \n2.Donald Trump")).intValue();
        if(vote !=1 && vote !=2)
           { JOptionPane.showMessageDialog(null,"Illegarl vote");
              
           }
        else {if(vote ==1)
                 { HilaryClinton++;
                 }
              else{DonaldTrump++;}
             }
       }
       
   JOptionPane.showMessageDialog(null,"You have voted number " + vote+".");
   JOptionPane.showMessageDialog(null,"First candidate has " + HilaryClinton+" votes.");
   JOptionPane.showMessageDialog(null,"Second candidate has " + DonaldTrump+" votes.");
   
  }
 }