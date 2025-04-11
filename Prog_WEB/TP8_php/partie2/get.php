<?php

$page = file_get_contents("index.html");
$str = "";
foreach( $_GET as $key => $value){
    $str .= "\$_GET['" . $key . "'] = " . $value;
}
if($page !== false){

    $page = str_replace("(body)" , $str, $page);


    echo $page;
}


?>