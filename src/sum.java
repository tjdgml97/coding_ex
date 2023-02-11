import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sum {
  public static void main(String[] args) throws IOException {

   //한줄씩 입력받은것
   BufferedReader bufferedReadeer  = 
     new BufferedReader(new InputStreamReader(System.in));
   
   //한줄씩 입력받은것을 나누는것 
   StringTokenizer stringTokenizer = 
     new StringTokenizer(bufferedReadeer.readLine());

   //int 형으로 변환 - 처음 token 값(공백을 기준으로 ) => 숫자갯수
   int suNo = Integer.parseInt(stringTokenizer.nextToken());
   //int 다음 token  => 질문 수 
   int quizNo = Integer.parseInt(stringTokenizer.nextToken());

   //숫자갯수+1 만큼 long 숫자들어가는 배열 만들기 
   long[] S = new long[suNo +1];
   stringTokenizer = new StringTokenizer(bufferedReadeer.readLine());
   
   // 숫자수만큼 반복 .
   for( int i=1; i<=suNo; i++) {
     // 다음 토큰 받아서 
     S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
   } 
   for(int q=0; q< quizNo; q++) {
     //질문 범위 받기 
     stringTokenizer = new StringTokenizer(bufferedReadeer.readLine());
     int i= Integer.parseInt(stringTokenizer.nextToken());
     int j = Integer.parseInt(stringTokenizer.nextToken());
     System.out.println(S[j]-S[i-1]);
   }
 }
 
}
