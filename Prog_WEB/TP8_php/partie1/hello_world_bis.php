<?php

$html = file_get_contents("template.html");

if($html == true){
    $html = str_replace("(TITLE)" , "PHP", $html);

    $html = str_replace("(BODY)", "<h1>ICI C'EST PHP</h1>", $html);

    echo $html;
}
?>