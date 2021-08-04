package collectionsdemo;

import java.util.Comparator;

public class Developer {
	int id;
	String name,domain;
	public Developer(int id, String name, String domain) {
		this.id = id;
		this.name = name;
		this.domain = domain;
		
	}
	@Override
	public String toString() {
		return "Developer [id=" + id + ", name=" + name + ", domain=" + domain + "]";
	}
}
	
class IdComparator implements Comparator {
	
	@Override
	public int compare(Object arg0, Object arg1) {
		Developer d1=(Developer)arg0;
		Developer d2=(Developer) arg1;
		if(d1.id==d2.id)
		{
			return 0;
		}
		else if(d1.id>d2.id)
		    return 1;
		else
			return -1;
	}
}
class DomainCom implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		Developer d1=(Developer)arg0;
		Developer d2=(Developer) arg1;
		return d1.domain.compareTo(d2.domain);
	}
	
}
