let tabChampNumber = document.querySelectorAll('input[type="number"]');
let nbrLigne = 10;

tabChampNumber.forEach((champ) => {
  champ.addEventListener("input", calculeTotal, false); // type == "input" au sinon on prend pas en compte les changement clavier
});

function init(params) {}

function calculeTotal() {
  let champTotal = document.querySelector("#total");

  let total = 0;

  for (i = 0; i < nbrLigne; i++) {
    total += calculPrix(i);
  }

  champTotal.value = total;
}

function calculPrix(numLigne) {
  let champPrix = document.querySelector("#unitaire_" + numLigne).value;
  let champUnit = document.querySelector("#quantite_" + numLigne).value;

  let val = champPrix * champUnit;

  document.querySelector("#prix_" + numLigne).value = val;
  return val;
}

function getTD(ligne) {
  let contenu = "";
  contenu += `<td><input type="text" name="article_${nbrLigne}" id="article_${nbrLigne}"></td>`;
  contenu += `<td><input type="number" name="unitaire_${nbrLigne}" id="unitaire_${nbrLigne}"></td>`;
  contenu += `<td><input type="number" name="quantite_${nbrLigne}" id="quantite_${nbrLigne}"></td>`;
  contenu += `<td><input type="text" name="prix_${nbrLigne}" id="prix_${nbrLigne}" readonly></td>`;
  return contenu;
}

function ajouteLigne() {
  let tr = document.createElement("tr"); //creation d'un tr
  let allElement = document.getElementsByTagName("tr"); //recuperation des tout les tr
  let lastElement = allElement[document.getElementsByTagName("tr").length - 1]; // reperation du dernier tr
  let temp = lastElement.parentNode;
  tr.innerHTML = getTD(nbrLigne);
  nbrLigne++; //MAJ pour le prochain ajout
  tabChampNumber = document.querySelectorAll('input[type="number"]'); //maj du tab contenant tout les input de type number
  temp.insertBefore(tr, lastElement); //ajout d'une ligne juste avant total
}
