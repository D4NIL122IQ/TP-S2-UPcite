<?php

$page = file_get_contents("date.html");

$jour = ['Dimanche' , 'Lundi' , 'Mardi', 'Mercredi', 'Jeudi', 'Vendredi', 'Samedi'];

$mois = ['janvier', 'fevrier', 'mars' , 'avril' , 'mars','mai',
    'juin' ,'juillet', 'auot' ,'septembre', 'octobre', 'novembre', 'decembre'];

if($page !== false){
    $page = str_replace("(DATE)", $jour[date('w')]." ".date(' j ')." ".$mois[date('n')]." ".date('Y'), $page);
    echo $page;
}

?>