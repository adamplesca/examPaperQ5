// EXAM PAPAER QUESTION 2018-2019
// Adam Plesca
// 9/5/23

import javax.swing.JOptionPane;
import java.util.Random;

public class RingRing{

	private String name, county, cusNum;
	private boolean dub;

	public RingRing(){
		name = "";
		county = "";
		cusNum = "";
		dub = false;
	}

	public void setName(String name){
		this.name = name;
	}
	public void setCounty(String county){
			this.county = county;
	}
 	public void compute() {
        dub = false;
        if (county.equalsIgnoreCase("Dublin")){
            dub = true;
            Random random = new Random();
            cusNum = "123" + (random.nextInt(999999) + 1);
        }
    }
	public String getCusNum(){
		return cusNum;
	}
	public boolean getDub(){
		return dub;
	}
}