package com.october.week1;

public class RecentCounter {

	int req, max;
	public RecentCounter() {
		this.req = 0;
		this.max = -1;
	}
	
	public int ping(int t) {
		int min = t - 3000;

		if(req == 0)
			max = t;
		
		if(min > max) {
			max = min;
			return req;
		}
		else{
			req++;
			return req;
		}
			
		
		
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
