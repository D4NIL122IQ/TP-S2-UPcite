<?php

require_once "Template.class.php";


$title = "Hello World";
$body = "<h1>Hello World</h1>";


$page = new Template("template.html");
$page->Replace("(TITLE)", $title);
$page->Replace("(BODY)", $body);
$page->Display();

?>