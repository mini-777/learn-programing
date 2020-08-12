function Animal(){
  var year = prompt("당신이 태어난 해를 입력하시오");
  var animal = document.getElementsByClassName("animal")
  if(year%12 == 0)
    document.getElementById("photo").src = animal[8].src;
  else if(year%12 == 1)
    document.getElementById("photo").src = animal[9].src;
  else if(year%12 == 2)
    document.getElementById("photo").src = animal[10].src;
  else if(year%12 == 3)
    document.getElementById("photo").src = animal[11].src;
  else if(year%12 == 4)
    document.getElementById("photo").src = animal[0].src;
  else if(year%12 == 5)
    document.getElementById("photo").src = animal[1].src;
  else if(year%12 == 6)
      document.getElementById("photo").src = animal[2].src;
  else if(year%12 == 7)
    document.getElementById("photo").src = animal[3].src;
  else if(year%12 == 8)
    document.getElementById("photo").src = animal[4].src;
  else if(year%12 == 9)
    document.getElementById("photo").src = animal[5].src;
  else if(year%12 == 10)
    document.getElementById("photo").src = animal[6].src;
  else if(year%12 == 11)
    document.getElementById("photo").src = animal[7].src;
  else
    document.getElementById("name").innerHTML = "다시입력하세요";
}
