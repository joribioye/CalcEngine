package mainpackage;


public class Interest {
	public double Investment;
	private double Years;
	private double Inv_rate;
	private double value;
	
	public Interest()
	{
		Investment = 0;
		Years = 0;
		Inv_rate = 0;
		value = 0;
	}
	
	public Interest(double i, double y, double Ir)
	{
		Investment = i;
		Years = y;
		Inv_rate = Ir;
		value = Investment * (Math.pow(1 + Inv_rate/100, Years));
	}
	
	public double getValue(){
		return value;
	}

}