function fold(p, lc) {
  let realHeight = p.offsetHeight;
  let i = realHeight;
  let o = 1;
  let intervalID = setInterval(() => {
    i -= realHeight / 15;
    if (i <= 0) {
      clearInterval(intervalID);
      p.style.display = "none";
      p.style.height = "";
      p.style.opacity = "0";
    } else {
      p.style.height = i + "px";
      o -= 1 / 5;
      p.style.opacity = o;
    }
  }, 15);

  lc.innerHTML = "&triangleright;";
}

function unfold(p, lc) {
  p.style.display = "block";
  p.style.opacity = "0";
  let realHeight = p.scrollHeight;
  let i = 0;
  let o = 0;
  let intervalID = setInterval(() => {
    i += realHeight / 15;
    if (i >= realHeight) {
      clearInterval(intervalID);
      p.style.height = "";
      p.style.opacity = "1";
    } else {
      p.style.height = i + "px";
      o += 1 / 5;
      p.style.opacity = o;
    }
  }, 15);

  lc.innerHTML = "&triangledown;";
}

function toggle(element) {
  let p = element.nextElementSibling;
  let lc = element.lastElementChild;

  getComputedStyle(p).display === "none" ? unfold(p, lc) : fold(p, lc);
}
