import javax.swing.*;
public class t1 {
	public static void main(String[] args){
		int choice;
		String Choose;
		Choose = JOptionPane.showInputDialog("1.Add all numbers up to x\n2.Display n stars\n3.Exit");
		choice = Integer.parseInt(Choose);
		switch(choice){
		case(1):
			int sum;
			String sumLim;
			sumLim = JOptionPane.showInputDialog("Enter an integer");
			sum = Integer.parseInt(sumLim);
			int i = 0;
			int total = 0;
			while(i <= sum){
				total += i;
				i++;
			}
			String out = "Sum = " + total;
			JOptionPane.showMessageDialog(null, out);
			break;
		case(2):
			int num;
			String numLim;
			numLim = JOptionPane.showInputDialog("How many stars do you want to print");
			num = Integer.parseInt(numLim);
			i = 0;
			String stars = "";
			while(i < num){
				if(i % 5 == 0){
					stars = stars.concat("\n");
				}
				stars = stars.concat("*");
				i++;
			}
			JOptionPane.showMessageDialog(null, stars);
			break;
		case(3):
			JOptionPane.showMessageDialog(null, "Exiting...");
			break;
		
		}
		int i = 0;
		while(i < 1000000){
			System.out.println(i);
			i++;
		}
	}
}
