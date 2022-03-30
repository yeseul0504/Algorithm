function solution(numbers, target){
    var number = 0;
    
function dfs(sum, depth){
if(sum === numbers.length){
    if(sum === target){
        answer += 1;
    }
    return;
}
dfs(depth + 1, sum + numbers[depth]);
dfs(depth + 1, sum - numbers(depth));
}

dfs(0, 0);
return answer;

}
