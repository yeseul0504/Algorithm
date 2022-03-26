class solving01 {
    //프로그래머스 LV.2 : 깊이 우선 탐색 알고리즘 
    //타겟 넘버

    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};    
        int answer = solution(numbers, 3);
        System.out.println(answer);     
}

    public static int solution(int[] numbers, int target) {   
        return dfs(0, 0, numbers, target);
    }

    public static int dfs(int sum, int depth, int[] numbers, int target) {
        int answer=0;
        if (depth == numbers.length) {
            if(sum == target) {
                answer++;
            }
            return answer;
        }
        return dfs(sum - numbers[depth], depth + 1, numbers, target) 
            + dfs(sum + numbers[depth], depth + 1, numbers, target);
    }
}