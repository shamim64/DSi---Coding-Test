package Vehicle_Showroom;


public class Vehicle {
	
	private String Model_No;
	private String Engine_Type;
	private String Engine_Power;
	private String Tire_Size;
	private String Vehicle_Type;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String Model_No,String Engine_Type,String Engine_Power,String Tire_Size,String Vehicle_Type) {
		
		this.Model_No = Model_No;
		this.Engine_Type = Engine_Type;
		this.Engine_Power = Engine_Power;
		this.Tire_Size = Tire_Size;
		this.Vehicle_Type = Vehicle_Type;
	}
	
	
	public String GetModel_No() {
		return Model_No;
	}

	public void SetModel_No(String Model_No) {
		this.Model_No = Model_No;
	}
	
	
	public String GetEngine_Type() {
		return Engine_Type;
	}

	public void SetEngine_Type(String Engine_Type) {
		this.Engine_Type = Engine_Type;
	}
	
	
	public String GetEngine_Power() {
		return Engine_Power;
	}

	public void SetEngine_Power(String Engine_Power) {
		this.Engine_Power = Engine_Power;
	}
	
	
	public String GetTire_Size() {
		return Tire_Size;
	}

	public void SetTire_Size(String Tire_Size) {
		this.Tire_Size = Tire_Size;
	}
	
	
	public String GetVehicle_Type() {
		return Vehicle_Type;
	}

	public void SetVehicle_Type(String Vehicle_Type) {
		this.Vehicle_Type = Vehicle_Type;
	}
	
	public void Count_Visitor() {
		
		int Expected_Visitors = 30;	
	
		if (Vehicle_Type.equals("sports"))
			Expected_Visitors = Expected_Visitors + 20;
		
		System.out.println("Expected Visitor Count: "+Expected_Visitors);
					 
	}
	
	 public String toString(){  
		  return "Model No: "+Model_No+"\nEngine Type: "+Engine_Type+"\nEngine Power: "+Engine_Power+"\nTyre Size: "+Tire_Size+"\nVehicle Type: "+Vehicle_Type;  
		 } 
	
}