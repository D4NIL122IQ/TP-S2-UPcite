<?php

$page = file_get_contents("acronym.php");



function acronym($chaine){
    $acr ="";

    $tabMot = explode(" " ,$chaine);

    foreach($tabMot as $mot){
        $mot = strtoupper($mot);
        $acr .= $mot[0];
    }

    return $acr;
}


if($page){

    $page = str_replace("(BODY)", acronym("cas sac cas"), $page);
    echo $page;
}
?>