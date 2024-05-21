/* 01_arrow-funciton-basic-syntax
ES6에서 도입 된 화살표 함수는 function 키워드 대신 화살표를 사용해 좀 더 간략한 방법으로 함수를 선언할 수 있다. 
화살표 함수는 항상 익명 함수로 정의한다. 본문이 한 줄인 함수를 작성할 때 유용하다.

// 1. 매개변수 지정 방법
    () => { ... }       // 매개변수가 없을 경우
    x => { ... }        // 매개변수가 한 개인 경우, 소괄호를 생략할 수 있다.
    (x, y) => { ... }   // 매개변수가 여러 개인 경우, 소괄호를 생략할 수 없다.

// 2.함수 지정 방법
    x => { return x * x }   
    x => x * x              // 한줄이면  중괄호를 생략할 수 있고  암묵적으로 return

    () => { return { a: 1 }; }
    () => ({ a: 1 })        // 객체 반환시 소괄호를 사용한다.

    () => {                 //멀티라인이면 중괄호를 생략할 수 없다
    const x = 5;
    return x * x;
    };

*/

let message;

// 기존 function 정의법
message = function () {
  return "hello world";
};

console.log(message());
// arrow function 정의법
message = () => {
  return "Arrow Function";
};

message = () => "Simple Arrow Function";

// 매게변수가 있을 경우
message = (val) => "Simple Arrow Function" + val;

// 매게변수가 2개 이상 있을 경우
message = (val, val2) => "Simple Arrow Function" + val + val2;

const createUser = (id, name) => ({ id, name });

console.log(
  [1, 2, 3, 4, 5].map(function (val) {
    // val가 for문 처럼 배열 안의 값을 하나씩 가진다.
    return val * 10;
  })
);
console.log([1, 2, 3, 4, 5].map((val) => val * 10));
