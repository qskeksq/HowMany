package com.nadan.java.howmany;

public class HowMany {
	
	//어떤 정수값까지 조사할 것인지와 어떤 숫자의 개수를 알고 싶은지 매개변수로 넣어준다
	public void howMany(int limit, int target){
		
		//문자열로 비교할 것이기 때문에 알고 싶은 숫자를 int에서 String으로 바꿔준다
		String targ = target + "";
		
		//문자 하나하나를 비교해서 맞는 개수만큼 계속 더해준다.
		int result = 0;
		
		for(int i=0; i<=limit; i++){
			//숫자를 문자열로 비교할 것이기 때문에 문자열로 바꿔준다
			String num = i+ "";
			//숫자 개수만큼 순환한다
			int num_length = num.length();
			for(int j=0; j<num_length; j++){
				//숫자를 떼어낸 후 문자로 바꿔서 equals로 비교
				String chr = num.charAt(j) + "";
				//만약 맞다면 결과값에 1을 더해준다.
				if(chr.equals(targ)){
					result++;
				}
			
			}
		
		}
		
		System.out.println(limit+"이하의 숫자 중 "+target+"의 개수는 "+result);
		
	}

}
