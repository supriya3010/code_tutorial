import java.util.HashMap;
import java.util.Map;

public class Test_Hash {
	public static void main(String args[])
	{
		User u1=new User(101,"supriya");
		User u2=new User(101,"supriya");
		Map<User,String> map=new HashMap<User,String>();
		map.put(u1,"abc");
		map.put(u2,"102");
		for(User u: map.keySet())
		{
			System.out.println(map.get(u).toString());
		}
	}

}

class User
{
	private int uid;
	private String uname;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public User(int uid, String uname) {
		this.uid = uid;
		this.uname = uname;
	}
	
	@Override
	public String toString()
	{
		return uid+" "+uname;
	}
	
	
	  @Override public int hashCode() { return uid; }
	 
	
	
	  @Override public boolean equals(Object o) { if(o==this) return true; if(!(o
	  instanceof User)) return false; User u=(User)o; return uid==u.uid &&
	  uname.equals(u.uname); }
	 
}