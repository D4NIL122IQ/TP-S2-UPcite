let h = document.querySelector("#h");
let p = h.nextElementSibling;

function fold() {
  p.style.display = "none";
}

function unfold() {
  p.style.display = "block";
}

function toggle() {
  getComputedStyle(p).display == "none" ? unfold() : fold();
}
