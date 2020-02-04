/*const calculator = {
    plus: function(a, b){
      return a + b;
    },
    multiplication: function(a, b){
      return a * b;
    },
    division: function(a, b){
      return a / b;
    },
    minus: function(a, b){
      return a - b;
    },
    power: function(a, b){
      return a ** b;
    }
    
}
const plus = calculator.plus(5, 5)
const multiplication = calculator.multiplication(5, 5)
const division = calculator.division(5, 5)
const minus = calculator.minus(5, 5)
const power = calculator.power(5, 5)
  
  
  console.log(plus, multiplication, division, minus, power);
  
  const title = document.querySelector("#title");
  title.innerHTML = "Hi! From JS";
  title.style.color = "red";
  document.title = 'i own you now'


  const title = document.querySelector("#title");
 
 function handleClick(){
   title.style.color = "red";
 }
 title.addEventListener("click", handleClick)
 

 if(10 === 5){
   console.log('hi')
 } else {
   console.log('ho')
 }
 

 const age = prompt("Ask something");

 console.log(age);
 //prompt is an old tech
 */
const clockContainer = document.querySelector(".js-clock");
const clockTitle = clockContainer.querySelector("h1");
function getTime(){
  const date = new Date();
  const minutes = date.getMinutes();
  const hours = date.getHours();
  const seconds = date.getSeconds();
  clockTitle.innerText = `${hours < 10 ? `0${hours}`
  : hours}:${minutes < 10 ? `0${minutes}`
  : minutes}:${seconds < 10 ? `0${seconds}`
   : seconds}`;
}
 function init() {
   getTime();
   setInterval(getTime, 1000)
}
init();
