console.log(hello); // 근데 함수인데 왜 hello()로 안해도 됨?

let hello = function (name) {
  // 이름이 없어도 식별자만 있으면 만들 수 있다.
  alert`${name} 님 안녕하세요`;
  // return 반환문은 암묵적으로 생략되어있다.
};

console.log(hello("홍길동"));
