package Vehicle_Showroom;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle V1 = new Vehicle ("la39872","oil","200 hr","12 inch","sports");
		Vehicle V2 = new Vehicle ("la65454872","gas","180 hr","15 inch","normal");
		Vehicle V3 = new Vehicle ("la9877672","diessl","500 hr","13 inch","sports");
		Vehicle V4 = new Vehicle ("la46768872","diessl","200 hr","17 inch","heavy");
		Vehicle V5 = new Vehicle ("la372","oil","200 hr","22 inch","heavy");
		
		System.out.println("\nvehicles with details: \n"+V1);
		V1.Count_Visitor();
		System.out.println("\nvehicles with details: \n"+V2);
		V2.Count_Visitor();
		System.out.println("\nvehicles with details: \n"+V3);
		V3.Count_Visitor();
		System.out.println("\nvehicles with details: \n"+V4);
		System.out.println("\nvehicles with details: \n"+V5);

	}

}
