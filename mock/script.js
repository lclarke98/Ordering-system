function openNav() {
    document.getElementById("navigationBar").style.width = "15%";
    document.getElementById("main").style.width = "85%";
}

function closeNav() {
    document.getElementById("navigationBar").style.width = "0px";
    document.getElementById("main").style.width = "100%";
}

window.onload = showDivs;

var x;
var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
  showDivs(slideIndex += n);
}

function currentDiv(n) {
  showDivs(slideIndex = n);
}

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("slideContainer");
  var dots = document.getElementsByClassName("slide");
  if (n > x.length) {slideIndex = 1}
  if (n < 1) {slideIndex = x.length}
  for (i = 0; i < x.length; i++) {
     x[i].style.display = "none";
  }
  for (i = 0; i < dots.length; i++) {
     dots[i].className = dots[i].className.replace(" place-holder", "");
  }
  x[slideIndex-1].style.display = "block";
  dots[slideIndex-1].className += " place-holder";
}
