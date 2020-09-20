package collectionshandson;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Player1
		{

		    private String name,tname,skill;
		    

		    public Player1( String name, String tname, String skill )
		    {
		        super();
		        this.name = name;
		        this.tname = tname;
		        this.skill = skill;
		    }

		    public String getName()
		    {
		        return name;
		    }

		    public void setName( String name )
		    {
		        this.name = name;
		    }

		    public String gettname()
		    {
		        return tname;
		    }

		    public void settname( String tname )
		    {
		        this.tname = tname;
		    }

		    public String getskill()
		    {
		        return skill;
		    }

		    public void setskill( String skill )
		    {
		        this.skill = skill;
		    }
		    public String toString()
		    {
		        return  name + "--" + tname + "--" + skill;
		    }

		}
		public class Main1 {

			public static void main(String[] args) {
				TreeMap<String,Player1> map=new TreeMap<String,Player1>();  
				 
				int n;
				String num,name,tname,skill;
				Scanner sc = new Scanner(System.in);
				n=sc.nextInt();sc.nextLine();
				Player1[] player = new Player1[n];
				for(int i=0;i<n;i++){
					num=sc.nextLine();
					name=sc.nextLine();
					tname=sc.nextLine();
					skill=sc.nextLine();
					player[i]=new Player1(name,tname,skill);
					map.put(num,player[i]);
				}
			    Set<Map.Entry<String, Player1>> set = map.entrySet();
			        
			       for( Map.Entry<String, Player1> entry : set )
			        {
			            String cap = entry.getKey();
			            Player1 p = entry.getValue();
			            System.out.println(cap + "--" + p);
		
			        }
	}

}
