package com.nadan.java.howmany;

public class HowMany {
	
	//어떤 정수값까지 조사할 것인지와 어떤 숫자의 개수를 알고 싶은지 매개변수로 넣어준다
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
