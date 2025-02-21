function verifier_email() {
  console.log(monFormulaire.confemail.value);
  console.log(monFormulaire.email.value);
  if (monFormulaire.confemail.value === monFormulaire.email.value) {
    return true;
  } else {
    return false;
  }
}

function tester_formulaire() {
  // Création d'une variable qui contiendra le résultat à afficher.
  var result;

  if (verifier_email()) {
    result = "Nom : " + monFormulaire.nom.value + "\n";
    result += `Prenom : ${monFormulaire.prenom.value} \n`;
    result += `Civilité : ${monFormulaire.civilite.value} \n`;
    result += `Adresse e-mail : ${monFormulaire.email.value} \n`;
    result += `Mot de pasee : ${monFormulaire.mot_de_passe.value}\n\n`;

    result += `Niveau : ${monFormulaire.niveau.value}\n`;
    // Création d'une chaîne qui contiendra la compétence.
    var competence = "";
    let checkbox = document.querySelectorAll('input[type="checkbox"]');
    let cb = checkbox.length;
    checkbox.forEach((box) => {
      if (box.checked) {
        switch (box.name) {
          case "comp_c":
            competence = "C";
            cb--;
            break;
          case "comp_cpp":
            if (competence.length > 0) competence += ", ";
            competence += "C++";
            cb--;
          case "comp_java":
            if (competence.length > 0) competence += ", ";
            competence += "Java";
            cb--;
          case "comp_caml":
            if (competence.length > 0) competence += ", ";
            competence += "CAML";
            cb--;
        }
      }
    });

    if (cb == checkbox.length) competence = "Aucune";

    // On ajoute la compétence à la variable du résultat.
    result += "Compétence : " + competence + "\n\n";

    result += `Autre compétence : \n${monFormulaire.autre_competence.value}\n\n`;

    result += `Couleur : ${monFormulaire.couleur.value}\n`;
    result += `Fichier : ${monFormulaire.cv.value}\n`;
    result += `Type de fichier : ${monFormulaire.file_type.value}\n`;
  } else {
    result = "Erreur email";
  }

  // Affichage du résultat.
  alert(result);
}
