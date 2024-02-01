package sasidhar;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	public int eid;
	public String ename;
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public int compareTo(Employee o) {
		if(this.eid<o.eid)
		{
			return -1;
		}
		else if(this.eid>o.eid)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}

	
	
}
