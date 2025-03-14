let p = document.querySelector("#p");

console.log(p);
console.log(getComputedStyle(p).display == "block");
function fold() {
  p.style.display = "none";
}

function unfold() {
  p.style.display = "block";
}

function toggle() {
  console.log("hello");
  getComputedStyle(p).display == "none" ? unfold() : fold();
}
