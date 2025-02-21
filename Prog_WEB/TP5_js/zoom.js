let taille = 20;
function zoom_plus() {
  taille += 2;
  toZoom.style.fontSize = taille + "px";
  console.log(getComputedStyle(document.querySelector("#toZoom")).fontSize);
  console.log(taille);
}

function zoom_moins() {
  if (taille > 3) {
    taille -= 2;
    toZoom.style.fontSize = taille + "px";
    console.log(getComputedStyle(document.querySelector("#toZoom")).fontSize);
    console.log(taille);
  }
}
