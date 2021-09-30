package arrays;

public class Banking {
	public void Eligible(int age, String name) throws AgeException
	{
		if(age<18)
			throw new AgeException(age,name);
		else
			System.out.println(age+" "+"Your age is eligible for bank account so your Account is Accepted");
	}
	public static void main(String[] args) {
Banking age=new Banking();
try
{
	age.Eligible(20,"dharani");
	age.Eligible(15,"nani");
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}