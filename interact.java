// when scrolled the page, execute myFunction
window.onscroll = function() {myFunction()};

// grab the navbar
var topnav = document.getElementById("topnav");

// the offset position of the navbar
var sticky = topnav.offsetTop;

// add the sticky class to the navbar when you reach its scroll position. Remove "sticky" when you leave the scroll position
function myFunction() {
  if (window.pageYOffset >= sticky) {
    topnav.classList.add("sticky")
  } else {
    topnav.classList.remove("sticky");
  }
}