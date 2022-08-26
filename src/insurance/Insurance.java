package insurance;
import java.util.*;
import insurance.Sedan;

public class Insurance {
	
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		 	while(true) {
			takeDetails();
			System.out.println("Do you want to enter details of any other car (y/n):");
			String yesOrNo = sc.nextLine();
			
				try {
					if(yesOrNo.equalsIgnoreCase("n")) {
						break;
					}
					
					if(!yesOrNo.equalsIgnoreCase("yes") && 
							!yesOrNo.equalsIgnoreCase("no"))     
							throw new Exception("Enter valid input");
				}
				catch(Exception e) {
					System.out.println(e);
				}
		 	}
		
	}
	static public void takeDetails() {
		double total;
		 Suv suv;
		 Hatchback hatchback;
		 Sedan sedan;
		Scanner sc= new Scanner(System.in);
		System.out.println("---Insurance details---");
		System.out.print("-model  ");
		String model=sc.nextLine(); 
		//System.out.println();
		System.out.print("-type ");
		String type=sc.nextLine(); 
		try {
			
			if(!( type.equals("SUV") || type.equals("Sedan") || type.equals("Hatchback") ))
				throw new Exception("Enter valid car type");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//System.out.println();
		System.out.print("-insurance type ");
		String insuranceType=sc.nextLine();  
		try {
			
			if(!( insuranceType.equals("SUV") || insuranceType.equals("Sedan") || insuranceType.equals("Hatchback") ))
				throw new Exception("Enter valid car type");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.print("-price ");
		int price=sc.nextInt();
		
		
		if(type.equals("SUV")) {
			suv= new Suv();
			total= suv.calculatePremium(insuranceType, price/10);
			System.out.println(total);
		}
		if(type.equals("Hatchback")) {
			hatchback= new Hatchback();
			total= hatchback.calculatePremium(insuranceType, price/20);
			System.out.println(total);
		}
		else if(type.equals("Sedan")) {
			sedan= new Sedan();
			total= sedan.calculatePremium(insuranceType, (price*8)/100);
			System.out.println(total);
		}
		
			
			
	}

}
