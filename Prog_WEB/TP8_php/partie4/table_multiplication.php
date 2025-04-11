<?php
define("NT", 20);
$page = file_get_contents("template.html");

$body= "";

if(isset($_GET['table'])){
    $body .= '<table border="1">';
    $body .= "    <tr>";
    $body .= '        <th colspan="2">Table des'. $_GET['table']. ' </th>';
    $body .= "    </tr>";
    $i = 0;
    while ($i <= 10) {
    $body .= "<tr>";
    $body .= '     <td>'. $i . 'x' . $_GET['table'] .'</td>';
    $body .= '     <td>' . $i * $_GET['table'] .'</td>';
    $body .= "</tr>";
    $i++;
  }
$body .= "</table>";

}else{
    for ($i = 1; $i <= NT; $i++) {
        $body .= "<a href=\"{$_SERVER['PHP_SELF']}?table=$i\">Table de $i</a><br>\n";
    }
}



if($page){
    if(isset($_GET["table"])){
        $page = str_replace("(BODY)", $body, $page);
    }
    echo $page;
}

?>