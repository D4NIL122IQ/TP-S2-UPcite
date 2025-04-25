<?php

$pageForm = file_get_contents("form.html");
$pageValidation = file_get_contents("validation.html");

if(isset($_POST['prenom']) ){
    if($pageValidation){

        $pageValidation = str_replace("(PRENOM)", $_POST['prenom'], $pageValidation);
        $pageValidation = str_replace("(NOM)", $_POST['nom'], $pageValidation);
        $pageValidation = str_replace("(EMAIL)", $_POST['email'], $pageValidation);
        $pageValidation = str_replace("(CIVILITE)", $_POST['civilite'], $pageValidation);
        $pageValidation = str_replace("(NIVEAU)", $_POST['niveau'], $pageValidation);

        $tabCheckBox = $_POST['competence'];
        if(count($tabCheckBox) == 1) {
            $pageValidation = str_replace("(COMPETENCE)", $tabCheckBox[0], $pageValidation);
        }else{
            $cmp = $tabCheckBox[0];
            for($i = 1 ; $i<count($tabCheckBox) ; $i++){
                $cmp .= ", ". $tabCheckBox[$i];
            }
            $pageValidation = str_replace("(COMPETENCE)", $cmp, $pageValidation);
        }
        $pageValidation = str_replace("(AUTRE_COMPETENCE)", $_POST['autre_competence'], $pageValidation);

        echo $pageValidation;
    }
}else{
    if($pageForm){
        echo $pageForm;
    }
}






?>