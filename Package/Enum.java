package Package;

public class Enum {
	// by default enum is public/static/final
	public enum Months {
		January,Feburary,March,April,May,June,July,August,September,Octomber,November,December;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Months m:Months.values()) { // for each loop to print Months
			System.out.println(m);
		}
		for (Months s:Months.values()) {
			System.out.println();
			if(s.toString().equals("May"))// here enum is interface hence we 
				//want to convert that into String so we use to String method here
			System.out.println("Summer");
		}
			
		
		
	}
}
