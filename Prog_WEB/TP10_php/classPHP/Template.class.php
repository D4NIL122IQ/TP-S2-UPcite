<?php

class Template{
    private $template;

    function __construct($nomFichier){
        $this->template = file_get_contents($nomFichier) or exit("erreur fichier");
    }

    function replace($label , $value){
        $this->template = str_replace($label , $value , $this->template);
    }

    function display(){
        echo $this->template;
    }
    
}

?>