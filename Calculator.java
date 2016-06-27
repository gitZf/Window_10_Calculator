

public class Calculator extends CalculatorGui
{

	private double memory;
	private double memoryPlus;
	
	public Calculator(double number)
	{
		setMemory(number);
		setMemoryPluss(number);
	}
	
	public void setMemory(double number)
	{
		System.out.println("Memory set " + number);
		this.memory = number;
		counter();
	}
	
	public void addToMemory(double number)
	{
		memory += number;
		memoryPlus += number;
	}
	
	public void substractFromMemory(double number)
	{
		memory -= number;
		memoryPlus -= number;
	}
	
	public double getMemory()
	{
		return memory;
	}
	
	public void setMemoryPluss(double number)
	{
		System.out.println("MemoryPlus set " + number);
		this.memoryPlus = number;
	}
	
	public double getMemoryPluss()
	{
		return memoryPlus;
	}
	
	public double add(double number)
	{
		//if(getMemory()>0)
			//return getMemory() > 0 ? number + getMemory() : number;
		//else
			//return getMemory() + number;
		//setMemory(getMemory() + number);//last change
		setMemory(getMemory() + number);
		return getMemory();
	}
	
	public double subtract(double number)
	{
		//return getMemory() > 0 ?  getMemory() - number : number;
		setMemory(getMemory() - number);
		return getMemory();
	}
	
	public double multiply(double number)
	{
		//return getMemory() > 0 ? number * getMemory() : number;
		return getMemory() * number;
	}
	
	public double divid(double number)
	{
		return getMemory() / number;
		//double n = getMemory();
		//System.out.println(getMemory() + "" + number);
		//if(getMemory()>0)
		//{
		//	return n / number;
		//}
		//else
		//{
		//	return number;
		//}
	}
	
	public double square(double number)
	{
		return number * number;
	}
	
	public double squareRoot(double number)
	{
		return Math.sqrt(number);
	}
	
	public double reciproc(double number)
	{
		return 1.0 / number;
	}
	
	public double percentage(double number)
	{
		return  getMemory() / 100 * number;
	}
	
}
