function fold(p) {
  p.style.display = "none";
}

function unfold(p) {
  p.style.display = "block";
}

function toggle(element) {
  p = element.nextElementSibling;
  getComputedStyle(p).display == "none" ? unfold(p) : fold(p);
}
