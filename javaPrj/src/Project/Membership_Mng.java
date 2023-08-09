package Project;

import java.util.ArrayList;

public class Membership_Mng {

	ArrayList<Membership> mlist = new ArrayList<>();
	public Membership_Mng() {}
	public void init() {
		mlist.add(new Membership("GOLD OLIVE", 100,1.5));
		mlist.add(new Membership("BLACK OLIVE", 70,1.25));
		mlist.add(new Membership("GREEN OLIVE", 40,1.0));
		mlist.add(new Membership("PINK OLIVE", 10,0.75));
		mlist.add(new Membership("BABY OLIVE", 0,0.5));
	}
	
	public void printData() {
		for(int i=0; i<mlist.size(); i++) {
			Membership ms = mlist.get(i);
			System.out.println(ms);
		}
	}
	public Membership  FindMembership(int totalCost) {
		if(totalCost>=100) return mlist.get(0);
		else if(totalCost>=70 && totalCost<100) return mlist.get(1);
		else if(totalCost>=40 && totalCost<70) return mlist.get(2);
		else if(totalCost>=10 && totalCost<40) return mlist.get(3);
		else if(totalCost>=0 && totalCost<10) return mlist.get(4);
		return null;
	}
	public void ShowMember() {
		
	}
	
}
