import java.util.ArrayList;
import java.util.Arrays;

   class solving02 {
    //프로그래머스 : 완전탐색 (lv.1)
    //https://blue-jay.tistory.com/64
    //https://nahwasa.com/entry/%EC%9E%90%EB%B0%94%EB%A1%9C-%EB%B0%B1%EC%A4%80-%ED%92%80-%EB%95%8C%EC%9D%98-%ED%8C%81-%EB%B0%8F-%EC%A3%BC%EC%9D%98%EC%A0%90-boj-java?category=1049957
    //Queue : 줄세울 때 
    //Stack : 메뉴(트리) ex)뒤로가기, routing 
    //List vs Array 
    //Linked List  주소를 순차적으로 찾아가야 한다.  
    public static void main(String[] args) {
        int[] answers = {1, 3, 2, 4, 2};
		int [] a = solution(answers);
        System.out.println(a);
    }

        public static int[] solution(int[] answers) {
            int[] p1 = {1,2,3,4,5}; //2
            int[] p2 = {2,1,2,3,2,4,2,5};//2
            int[] p3 = {3,3,1,1,2,2,4,4,5,5};//2
            int [] correct = {0, 0, 0}; // 맞춘 정답의 갯수(초기화)

            for( int i=0; i< answers.length; i++){
                if ( answers[i] == p1[ i % 5 ]) correct[0]++;
                if ( answers[i] == p2[ i % 8 ]) correct[1]++;
                if ( answers[i] == p3[ i % 10 ]) correct[2]++;
            }
            
            //값 arr 에 복사!
            int [] arr = new int[correct.length];
            for( int i=0; i<correct.length; i++){
                arr[i] = correct[i];
            }

            //오름차순 정렬 : 가장 많이 맞은 정답 개수 = arr[2] ex) {2,2,2}
            Arrays.sort(arr);
            
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i< arr.length; i++){
                if(correct[i] == arr[2]){
                    list.add(i+1); //0번 학생이 아닌 1번째 학생부터 세기 때문에 +1
                }
            }
            //최종 answer 배열을 만들어서 
            int [] answer = new int[list.size()];
            for(int i =0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
            return answers;
      }
}