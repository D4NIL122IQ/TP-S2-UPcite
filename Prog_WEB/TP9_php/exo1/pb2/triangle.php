<?php

$page = file_get_contents("triangle.html");


function triangle($taille){
    $triangle = "";
    $nbr = 1;
    for($i=$taille ; $i>= 0 ;$i--){
        for($j=0 ; $j<= $i; $j++){
            $triangle .= "&nbsp;";
        }
        for($j=0 ; $j<= $nbr; $j++){
            $triangle .= "*";
        }
        $nbr +=2;
        $triangle .= "<br/>";
    }

    return $triangle;
}


if($page){
    $page = str_replace("(BODY)", triangle(20), $page);
    echo $page;
}
?>