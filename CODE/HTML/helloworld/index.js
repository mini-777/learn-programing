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
  */
 const title = document.querySelector("#title");
 
 function handleResize(){
   console.log("I have been resized")
 }

 window.addEventListener("resize", handleResize)