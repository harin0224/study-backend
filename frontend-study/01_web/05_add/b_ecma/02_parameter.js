// rest parameter ...로 나머지 요소를 한 번에 가져올 수도 있다.
// "쌍둥이자리", "게자리", "사자자리",를 모두 rest에 넣은 것
let [sign1, sign2, ...rest] = [
  "양자리",
  "황소자리",
  "쌍둥이자리",
  "게자리",
  "사자자리",
];

console.log(sign1);
console.log(sign2);
console.log(rest);

// 프로퍼티가 많은 복잡한 객체에서 원하는 정보만 뽑아오는 것도 가능하다.
let pants = {
  productName: "배기팬츠",
  color: "검정색",
  price: 30000,
};

let { productName: productName3 } = pants; // pants에서 productName만 변수로 뽑아내기
console.log(`productName3 : ${productName3}`);

let { productName: productName4, ...r } = pants;

console.log(`productName4 : ${productName4}`);
console.log(`rest.color : ${r.color}`);
console.log(`rest.price : ${r.price}`);

// 스프레드 연산자
// rest parameter처럼 매개변수 목록을 배열로 가져오는 것과는 반대로 배열을 통째로 매개변수에 넘겨주는 기능이다.
// 하나로 뭉쳐 있는 여러 값들의 집합을 전개해서 개별적인 값들의 목록으로 만든다.
let arr1 = [10, 30, 20];
let arr2 = [100, 300, 200];

// 배열 객체 여러 개 전달 가능
console.log(`가장 작은 값 : ${Math.min(...arr1, ...arr2)}`);
// 일반 값과 혼합해서 사용 가능
console.log(`가장 작은 값 : ${Math.min(1, ...arr1, 2, ...arr2, 3)}`);

//
function merge(msg1, msg2) {
  return msg1 + msg2;
}
console.log(merge("안녕하세요."));
console.log(merge("안녕하세요.", "반갑습니다."));
console.log(merge("안녕하세요.", "반갑습니다.", "제 이름은 홍길동입니다"));

function mergeAll(...args) {
  let message = "";
  for (let arg of args) {
    message += arg;
  }
  return message;
}
console.log(mergeAll("안녕하세요."));
console.log(mergeAll("안녕하세요.", "반갑습니다."));
console.log(mergeAll("안녕하세요.", "반갑습니다.", "제 이름은 홍길동입니다."));

// 스프레드 문법 : 배열을 목록으로 확장해주므로 ...이 함수 호출 시, 배열이나 객체 리터럴 내부에 사용된다.
// 나머지 매개변수 : 인수 목록의 나머지를 배열로 모아주므로 ...이 함수 매개변수의 끝에 있다.

// 01. array and object copy (스프레드 문법을 이용한 배열, 객체 복사)
//깊은복사
let arr = [10, 30, 20];
let arrC = arr;
console.log(arr1);
let arrCopy = [...arr]; // 별개의 새로운 객체 - 깊은 복사
console.log(arr);
console.log(arrCopy);
console.log(arr === arrC); // true
console.log(arr === arrCopy); // false 새로운 객체
arrCopy.push(50); // 복사본 배열에 값 추가
console.log(arr);
console.log(arrCopy);
