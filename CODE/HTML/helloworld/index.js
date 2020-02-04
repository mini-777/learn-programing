const calculator = {
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
  