function solution(answers) {
  let p1=[1, 2, 3, 4, 5];
  let p2=[2, 1, 2, 3, 2, 4, 2, 5];
  let p3=[3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
  let correct=[0, 0, 0];
  
  for(let i = 0; i<answers.length; i++){
    if(p1[i % p1.length] === answers[i]){
      correct[0]++;
    };

    if(p2[i % p2.length] === answers[i]){
      correct[1]++;
    };

    if(p3[i % p3.length] === answers[i]){
      correct[2]++;
    };
  };

  //... 배열복사 !
  //최대값과 일치하는 index만 answer배열에 넣어주기
  let max = Math.max(...correct);
    let answer=[];
    for(let j = 0; j < correct.length; j++){
      if(correct[j] === max){
        answer.push(j+1);
      };
    };

  return answer;
};