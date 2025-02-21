function message() {
  alert("Cette fonction se trouve dans un fichier externe");
}

function surface(longeur, largeur) {
  return longeur * largeur;
}

function onSurface() {
  alert(
    "la surface est : " +
      surface(prompt("Entrez la longeur"), prompt("Entrez la largeur"))
  );
}

function onValidation() {
  if (confirm("Etes vous sur de ce que vous faites ? ") == true) {
    document.write("<h1>Vous allez etre rediriger</h1>");
  } else {
    document.write("<h1>Au revoir</h1>");
  }
}

function table(number) {
  let tb = "";
  let i = 1;
  tb = '<table border="1">\n';
  tb += "    <tr>\n";
  tb += `        <th colspan="2">Table des ${number} </th>\n`;
  tb += "    </tr>\n";
  while (i <= 10) {
    tb += "<tr>\n";
    tb += `     <td>${i} x ${number}</td>\n`;
    tb += `     <td>${i * number}</td>\n`;
    tb += "</tr>\n";
    i++;
  }
  tb += "</table>";

  document.write(tb);
}

function onTable() {
  table(prompt("Quelle table voulez vous generé"));
}
