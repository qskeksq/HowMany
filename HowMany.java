package com.nadan.java.howmany;

public class HowMany {
	
	//� ���������� ������ �������� � ������ ������ �˰� ������ �Ű������� �־��ش�
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
		
		System.out.println(limit+"������ ���� �� "+target+"�� ������ "+result);
		
	}

}
