package AllPrograms;

public class task03 {
	public String MemberName,MembershipType;
	public int Duration,Fees,Offers;
	GymMembership(String MemberName,String MembershipType,int Duration,int Fees,int Offers)
	{
		this.MemberName=MemberName;
		this.MembershipType=MembershipType;
		this.Duration=Duration;
		this.Fees=Fees;
		this.Offers=Offers;
	}
	
	public String getMname()
	{
		return MemberName;
	}
	public String getMtype()
	{
		return MembershipType;
	}
	public int getDuration()
	{
		return Duration;
	}
	public int Fees()
	{
		
		return Duration*Fees;
	}
	public int Offers()
	{
		
		return Offers;
	}
	public void displayGymMembership()
	{
		System.out.println(MemberName);
		System.out.println(MembershipType);
		System.out.println(Duration);
		System.out.println(Fees);
		System.out.println(Offers);
	}
}
class PremiumMembership extends GymMembership
{
public String PersonalTrainerAvailability;
public String SpaAccess;

	PremiumMembership(String MemberName,String MembershipType,int Duration,int Offers,int Fees,String PersonalTrainerAvailability,String SpaAccess )
	{
		super(MemberName,MembershipType,Duration,Fees,Offers);
		this.PersonalTrainerAvailability=PersonalTrainerAvailability;
		this.SpaAccess=SpaAccess;
	}
	public String getPTA()
	{
		return PersonalTrainerAvailability;
	}
	public String getSpaAccess()
	{
		return SpaAccess;
	}
	public void displayPremiumMembership()
	{
		super.displayGymMembership();
		if(Duration>=12)
		{
			System.out.println("You are premium member");
			System.out.println(PersonalTrainerAvailability+" PersonalTrainer Available");
			System.out.println("You are eligible for special offers");
		}
		else {
			System.out.println("PersonalTrainer not Available");
		}
		
		
	
		
	}
}
public class Task030412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PremiumMembership obj=new PremiumMembership("Manoj","Premium",12,100,12,"Yes","Yes");
		obj.displayPremiumMembership();

	}

}
}
