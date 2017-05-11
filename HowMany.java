package com.nadan.java.howmany;

public class HowMany {
	
	public void howMany(int limit, int target){
		
		String targ = target + "";
		
		int result = 0;
		
		for(int i=0; i<=limit; i++){
			String num = i+ "";
			int num_length = num.length();
			for(int j=0; j<num_length; j++){
				String chr = num.charAt(j) + "";
				if(chr.equals(targ)){
					result++;
				}
			
			}
		
		}
		
		System.out.println(limit+"이하의 숫자 중 "+target+"의 개수는 "+result);
		
	}

}
