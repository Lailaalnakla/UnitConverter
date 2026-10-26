
package unitconverter;

import javax.swing.JOptionPane;

public class UnitConverter {

    public static void main(String[] args) {
         double number = Double.parseDouble(
                JOptionPane.showInputDialog("Enter a number"));

    StringBuffer buf = new StringBuffer();
    buf.append("1. cm to inch\n");
    buf.append("2. inch to cm\n");
    buf.append("3. feet to meter\n");
    buf.append("4. meter to feet\n");
    buf.append("5. dunum to hektar\n");
    buf.append("6. hektar to dunum\n");
    buf.append("7. Fahrenheit to Celsius\n");
    buf.append("8. Celsius to Fahrenheit\n");
    int choice = Integer.parseInt(JOptionPane.showInputDialog(buf.toString()));
        
      switch (choice) {
           case 1:
               JOptionPane.showMessageDialog(null,"Answer = " + (number / 2.54));
        break;
           case 2:
               JOptionPane.showMessageDialog(null,"Answer = " + (number * 2.54));
        break;
           case 3:
               JOptionPane.showMessageDialog(null,"Answer = " + (number * 0.3048));
        break;
           case 4:
               JOptionPane.showMessageDialog(null,"Answer = " + (number * 3.28084));
        break;
           case 5:
               JOptionPane.showMessageDialog(null,"Answer = " + (number / 10));
        break;
           case 6:
               JOptionPane.showMessageDialog(null,"Answer = " + (number * 10));
        break;
           case 7:
               JOptionPane.showMessageDialog(null,"Answer = " + ((number - 32) * 5 / 9));
        break;
           case 8:
               JOptionPane.showMessageDialog(null,"Answer = " + ((number * 9 / 5) + 32));
        break;
           default:
               JOptionPane.showMessageDialog(null,"Invalid Choice");
                System.exit(0);
        }
    }
}
    

