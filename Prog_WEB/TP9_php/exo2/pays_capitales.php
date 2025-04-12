<?php
$page = file_get_contents("pays_capitales.html");

$table = array(
    "Algérie" => "Alger",
    "Pays-Bas" => "Amsterdam",
    "Irak" => "Bagdad",
    "Mali" => "Bamako",
    "Thaïlande" => "Bangkok",
    "Serbie" => "Belgrade",
    "Allemagne" => "Berlin",
    "Liban" => "Beyrouth",
    "Colombie" => "Bogota",
    "Brésil" => "Brasilia",
    "Slovaquie" => "Bratislava",
    "Belgique" => "Bruxelles",
    "Roumanie" => "Bucarest",
    "Hongrie" => "Budapest",
    "Argentine" => "Buenos Aires",
    "Danemark" => "Copenhague",
    "Sénégal" => "Dakar",
    "Irlande" => "Dublin",
    "Ukraine" => "Kiev",
    "Pérou" => "Lima",
    "Portugal" => "Lisbonne",
    "Royaume-Uni" => "Londres",
    "Espagne" => "Madrid",
    "Mexique" => "Mexico",
    "Inde" => "New Delhi",
    "Norvège" => "Oslo",
    "France" => "Paris",
    "Italie" => "Rome",
    "Chili" => "Santiago",
    "Libye" => "Tripoli",
    "Tunisie" => "Tunis",
    );

$sort = "country";
$oder = "normal";


function inverseOrder($order){
    if($order == "normal"){
        $order = "inverse";
    }else{
        $order = "normal";
    }
    return $order;
}

function inverseSort($sort){
    if($sort == "country"){
        $sort = "city";
    }else{
        $sort = "country";
    }
    return $sort;
}


if(isset($_GET['sort'])){
    if($_GET['sort'] == "country"){
        ksort($table);
    }else{
        asort($table);
    }
}else{
    ksort($table);
}

if(isset($_GET['order'])){
    if($_GET['order'] == "inevrse" && $_GET['sort'] == "country"){
        krsort($table);
    }
    if($_GET['order'] == "inevrse" && $_GET['sort'] == "city"){
        arsort($table);
    }
}

function table($table){
    $temp = "<table>";

    $temp .= "<tr><th> <a Pays</th> <th>Capitale</th></tr>";

    foreach($table as $key => $value){
        $temp .= "<tr> <td>" . $key . "</td> <td>". $value . "</td></tr>";
    }

    $temp .= "</table>";
    return $temp;
}

if($page){
    $page = str_replace("(TABLE)", table($table) ,$page);
    echo $page;
}

?>