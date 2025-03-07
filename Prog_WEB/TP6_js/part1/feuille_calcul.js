let tabChampNumber = document.querySelectorAll('input[type="number"]');

tabChampNumber.forEach((champ) => {
  champ.addEventListener("input", calculeTotal, false); // type == "input" au sinon on prend pas en compte les changement clavier
});

function init(params) {}

function calculeTotal() {
  let champTotal = document.querySelector("#total");

  let total = 0;

  for (i = 0; i < 10; i++) {
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
