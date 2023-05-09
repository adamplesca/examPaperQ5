// EXAM PAPAER QUESTION 2018-2019
// Adam Plesca
// 9/5/23

import javax.swing.JOptionPane;

public class RingRingApp{
	public static void main(String args[]){

		String name, county, cusNum;
		boolean dub;

		RingRing ring = new RingRing();

		name = JOptionPane.showInputDialog(null, "What is your name?");
		ring.setName(name);

		county = JOptionPane.showInputDialog(null, "What county do you live in?");
		ring.setCounty(county);

		ring.compute();
		dub = ring.getDub();

		if (dub) {
	 		JOptionPane.showMessageDialog(null, "You are eligible to become a RingRing member.");
		    cusNum = ring.getCusNum();
		    String special = "";
		    for (int i = 0; i < cusNum.length(); i++) {
		    	if (cusNum.charAt(i) == '!') {
		        	special = "!";
		            break; //break statement to exit the loop if the special character is found
		         }
		     }
		     JOptionPane.showMessageDialog(null, "Here is your customer Number: " + cusNum);
		     JOptionPane.showMessageDialog(null, "Your customer number has a special symbol, here is a 20 euro vouncher!" +cusNum+special);

		     } else {
		     	JOptionPane.showMessageDialog(null, "You are not eligible to become a RingRing member.\nYou must be living in Dublin as our services are only available in this county.");
		     }
		}
}