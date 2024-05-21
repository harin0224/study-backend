/* 01_Object-constructor-function (Object 생성자 함수)
객체 리터럴에 의한 객체 생성
*/
// 일일히 값 넣어서 만든 객체
const student1 = {
  name: "제니",
  age: 16,
};

const student2 = {
  name: "주혁",
  age: 25,
};

console.log(student);

// 생성자에 의한 객체 생성
function Student(name, age) {
  this.name = name; // 여기서 생성되는 name 은 파라미터로 받은 name을 받을 것이다.
  this.age = age;
  this.getInfo = function () {
    // 익명 함수
    return `${this.name}은 ${this.age}세 입니다. `;
  };
}

// 객체 생성
const student3 = new Student("사나", 20);
const student4 = new Student("로운", 25);

console.log(student3.name);
console.log(student3.getInfo());

/* 반드시 Object 생성자 함수를 사용해 객체를 생성할 필요는 없다. 객체 리터럴을 사용하는 것이 더 간편하다.
자바스크립트에는 Object 생성자 함수 이외에도 String, Number, Boolean, Function, Array, Date, RegExp
 등의  생성자 함수를 제공한다. */

/* 02_instance-creation-process(인스턴스 생성 과정) */
function StudentNew(name, age) {
  // 1. 암묵적으로 인스턴스가 생성되고 this에 바인딩 되는 과정이 런타임 이전에 실행된다.
  console.log(this);
  // 2. this에 바인딩 되어 있는 인스턴스를 초기화 한다.
  this.name = name;
  this.age = age;
  this.getInfo = function () {
    return `${this.name}(은)는 ${this.age}세입니다.`;
  };
  // 3. 완성된 인스턴스가 바인딩 된 this가 암묵적으로 반환된다.
  // 만약 명시적으로 객체를 반환하면 암묵적인 this 반환이 무시된다.
  // return {};
  // 하지만 명시적으로 원시 값을 반환하면 원시 값 반환은 무시되고 암묵적으로 this가 반환된다.
  // return 1;
  // 생성자 내부에서 return은 생략하는 것이 기본이다.
}

// 인스턴스 생성
const student = new StudentNew("홍길동", 20);
console.log(student);

// // 이 함수가 new 연산자와 함께 호출되지 않았다면 new.target은 undefined이다.
// console.log(new.target);
// if(!new.target) {
//     console.log(`new.target= ${new.target}`);
//     // new 연산자와 함께 생성자 함수를 재귀 호출하여 생성 된 인스턴스를 반환한다. [Function: Dog]
//     return new Dog(name, age);
// }

function Dog(name, age) {
  // 이 함수가 new 연산자와 함께 호출되지 않았다면 new.target은 undefined이다.
  console.log(new.target);
  if (!new.target) {
    console.log(`new.target= ${new.target}`);
    // new 연산자와 함께 생성자 함수를 재귀 호출하여 생성 된 인스턴스를 반환한다. [Function: Dog]
    return new Dog(name, age);
  }
  this.name = name;
  this.age = age;
}

// 대부분의 빌트인 생성자 함수(Object, String, Number, Boolean, Date, RegExp, ...)는
// new 연산자와 함께 호출 되었는지를 확인한 후 적절한 값을 반환한다.
const obj = Object();
console.log(obj); // new 연산자 없이 잘 동작한다.
