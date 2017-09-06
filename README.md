# HowManyNumber

### 주어지는 수(limit)까지 원하는 숫자(target)의 개수 구하기

- String 값을 문자별로 나누기, equals를 통해 비교
- 개선할 점은, for문 안에 String 값이 돌고, charAt으로 모든 수를 분리해 내기 때문에 String 객체가 501500개 생성된다. 알고리즘으로 바꿀 필요 있음.

```java
public void howMany(int limit, int target){
      String targ = target + ""; //숫자를 int에서 String으로 바꿔준다.
      int result = 0; //문자 하나하나를 비교해서 맞는 개수만큼 계속 더해준다.

      for(int i=0; i<=limit; i++){
          String num = i+ "";
          int num_length = num.length(); //숫자 개수만큼 순환한다
          
          for(int j=0; j<num_length; j++){
              //숫자를 떼어낸 후 문자로 바꿔서 equals로 비교
              String chr = num.charAt(j) + "";
              //만약 맞다면 결과값에 1을 더해준다.
              if(chr.equals(targ)){
                  result++;
              }
          }
      }
}
```
