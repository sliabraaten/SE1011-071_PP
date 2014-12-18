//CH6Ex12
public class StudentId 
{
		private String name;
		private int id;
		
		public void setName(String n)
		{
			this.name = n;
		}
		
		public void setId(int id)
		{
			this.id = id;
		}
		
		public String getName()
		{
			return name;
		}
		
		public int getId()
		{
			return id;
		}
		
		public String getEmailAccount()
		{
			return "" + name.charAt(0) + id + "@pirate.park.edu";
		}
		
		public boolean isValid()
		{
			return id >= 100000 && id <= 999999;
		}
		
}

