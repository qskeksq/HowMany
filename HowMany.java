package com.nadan.java.howmany;

public class HowMany {
	
	//� ���������� ������ �������� � ������ ������ �˰� ������ �Ű������� �־��ش�
	public void howMany(int limit, int target){
		
		//���ڿ��� ���� ���̱� ������ �˰� ���� ���ڸ� int���� String���� �ٲ��ش�
		String targ = target + "";
		
		//���� �ϳ��ϳ��� ���ؼ� �´� ������ŭ ��� �����ش�.
		int result = 0;
		
		for(int i=0; i<=limit; i++){
			//���ڸ� ���ڿ��� ���� ���̱� ������ ���ڿ��� �ٲ��ش�
			String num = i+ "";
			//���� ������ŭ ��ȯ�Ѵ�
			int num_length = num.length();
			for(int j=0; j<num_length; j++){
				//���ڸ� ��� �� ���ڷ� �ٲ㼭 equals�� ��
				String chr = num.charAt(j) + "";
				//���� �´ٸ� ������� 1�� �����ش�.
				if(chr.equals(targ)){
					result++;
				}
			
			}
		
		}
		
		System.out.println(limit+"������ ���� �� "+target+"�� ������ "+result);
		
	}

}
