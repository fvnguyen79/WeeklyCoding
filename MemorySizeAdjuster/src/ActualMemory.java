
public class ActualMemory {
	
	public ActualMemory(String memSize) {
		String label = memSize.substring(memSize.length()- 2, memSize.length());
		String num = memSize.substring(0, memSize.length()-2);
		System.out.println("label:"+label);
		System.out.println("num: "+num);
		String res1;
		String res2;
		
		if(label.equals("GB")) {
			double temp = Integer.parseInt(num);
			temp = temp * 0.93;
			if(temp < 1) {
				res2 = "MB";
				temp = temp *1000;
				res1 = String.valueOf(Math.round(temp*100.0)/100.0);
				System.out.println(res1+res2);
			}
			
			else {
				double temp1 = Integer.parseInt(num);
				temp1 = temp1 * 0.93;
				res1 = String.valueOf(Math.round(temp1*100.0)/100.0);
				res2 = "GB";
				System.out.println(res1+res2);
			}
			
		}
		else {
			double temp1 = Integer.parseInt(num);
			temp1 = temp1 * 0.93;
			res1 = String.valueOf(Math.round(temp1*100.0)/100.0);
			res2 = "GB";
			System.out.println(res1+res2);
		}
	}
}
