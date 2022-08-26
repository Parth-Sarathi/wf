package insurance;

public class Sedan extends Vehicle{
	
	
	

	double calculatePremium(String insuranceType, double base){
		
		double ans=0;
		switch(insuranceType) {
		case "premium" :
			ans = base*1.2;
			break;
		case "basic" :
			ans = base;
		}
		return ans;
	}
}
