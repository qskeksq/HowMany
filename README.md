# HowManyNumber

### 주어지는 수(limit)까지 원하는 숫자(target)의 개수 구하기

- String 값을 문자별로 나누기, equals를 통해 비교
- 개선할 점은, for문 안에 String 값이 돌고, charAt으로 모든 수를 분리해 내기 때문에 String 객체가 501500개 생성된다. 알고리즘으로 바꿀 필요 있음.

> 숫자를 String으로 받는 경우

```java
public void howMany(int limit, int target){
      //타겟 값을 int에서 String으로 바꿔준다.
      String targ = target + "";
      //문자 하나하나를 비교해서 맞는 개수만큼 계속 더해준다.
      int result = 0;
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

> String으로 나누지 않고 char로 받으면 3배정도 속도 차이가 난다

```java
public void howMany2(int limit, int target){
      // 타켓 값을 char 타입으로 바꿔준다.
      char tarTemp = Integer.toString(target).charAt(0);			
      //문자 하나하나를 비교해서 맞는 개수만큼 계속 더해준다.
      int result = 0;			
      for(int i=0; i<=limit; i++){
          //숫자를 문자열로 비교할 것이기 때문에 문자열로 바꿔준다
          String num = i+ "";
          //숫자 개수만큼 순환한다
          int num_length = num.length();
          for(int j=0; j<num_length; j++){
              //숫자를 떼어낸 후 문자로 바꿔서 equals로 비교
              char chrTemp = num.charAt(j);
              if(chrTemp == tarTemp) {
                  result++;
              }
          }
      }
}
```
