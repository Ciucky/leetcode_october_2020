package com.october.week1;
import java.util.*;

public class RecentCounter {

	int req;
	List<Integer> pings = new ArrayList<Integer>();
	public RecentCounter() {
		this.req = 0;
	}
	
	public int ping(int t) {
		//System.out.println("t: " + t);
		pings.add(t+3000);
		
		for(int i = 0; i < pings.size()-1; i++) {
			//System.out.println("i: " + i + " ping: " + pings.get(i));
			if(t > pings.get(i)) {
				req--;
				//System.out.println("removed " + pings.get(i) + " req: " + req);
				pings.remove(i);
				i--;
			}
				
		} 
		req++;
		return req;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecentCounter recent = new RecentCounter();
		System.out.println(recent.ping(1));
		System.out.println(recent.ping(100));
		System.out.println(recent.ping(3001)); 
		System.out.println(recent.ping(3002));
	}

}
