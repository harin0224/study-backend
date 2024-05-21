const lastName = "홍";
const firstName = "길동";
console.log(`제 이름은 ${lastName}${firstName}입니다.`);
// 표현식 삽입은 반드시 백틱 내에서 사용해야 한다.
// 일반 문자열에서의 표현식 삽입은 문자열로 취급된다.

function hello(name) {
  return `${name}님 안녕하세요`;
}

console.log(hello("하린"));

// 함수 식별자 구분 예제
// 식별자 hello2    이름 hello1 만약 식별자를 작성하지 않으면
// 내부적으로 식별자를 이름과 같이 만들어서 실행시키고 있던 것
let hello2 = function hello1(name) {
  return `${name}님 안녕하세요`;
};
