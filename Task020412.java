package AllPrograms;

public class Task020412 {

	//04/12/24
	//Task02
	//2. Write a Java program to create a class called "Course" with attributes for course name,
	//instructor, and credits. Create a subclass "OnlineCourse" that adds attributes for platform
	//and duration. Implement methods to display course details and check if the course is eligible
	//for a certificate based on duration.


	package AllProgram;
	class Course
	{
		public String Cname;
		public String Instructor;
		public String Credits;
		Course(String Cname,String Instructor,String Credits)
		{
			this.Cname=Cname;
			this.Instructor=Instructor;
			this.Credits=Credits;		
		}
		public String getCname()
		{
			return Cname;
		}
		public String getInstructor()
		{
			return Instructor;
		}
		public String Credits()
		{
			return Credits;
		}
		public void displayCourse()
		{
		System.out.println("Selected Course is "+Cname);
		System.out.println(Instructor+" is your Instructor");
		System.out.println("Your Course Credit is "+Credits);
		
		}
	}
	class OnlineCourse extends Course
	{
	public String platform;
	public int duration;
		OnlineCourse(String Cname, String instructor, String Credits,String platform,int duration) {
			super(Cname, instructor, Credits);
			this.platform=platform;
			this.duration=duration;
		}
		public String platform()
		{
			return platform;
		}
		public int duration()
		{
			return duration;
		}
		
		public void displayOnlineCourse()
		{
			super.displayCourse();
			System.out.println(platform+" are the course platform");
			System.out.println(duration+" month course duration");
			if (duration>=6)
			{
				System.out.println("Your course is eligble for certification");
			}
			else
			{
				System.out.println("You are course is not eligble for certification");
			}
		}

	}

	public class Task020412 {

		public static void main(String[] args) {
//		Course obj=new Course("JAVA FS","Manoj","A+");
//		System.out.println("Course Details:\n");
//		obj.Course();
			
			OnlineCourse obj1=new OnlineCourse("JAVA FS","Manoj","A+","HTML & CSS",3);
			System.out.println("\nOnineCourse Details:\n");
			obj1.displayOnlineCourse();
			

			}

		}
}
