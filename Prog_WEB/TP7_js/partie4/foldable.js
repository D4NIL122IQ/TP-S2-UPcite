function fold(p, lc) {
  p.style.display = "none";
  lc.innerHTML = "&triangleright;";
}

function unfold(p, lc) {
  p.style.display = "block";
  lc.innerHTML = "&triangledown;";
}

function toggle(element) {
  p = element.nextElementSibling;
  lc = element.lastElementChild;
  getComputedStyle(p).display == "none" ? unfold(p, lc) : fold(p, lc);
}
