<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<title>Gamer</title>
<script src="https://kit.fontawesome.com/2118f0bad8.js" crossorigin="anonymous"></script>
<link href="CSS/style.css" rel="stylesheet" >
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" 
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
 	crossorigin="anonymous"> 	
 	<style>
 	.dataTables_wrapper .dataTables_length {
    float: none;
    text-align: center;
    display: none;
	}
	.dataTables_info{
	 display: none;
	}
 @media screen and (max-width: 640px){
 	.dataTables_wrapper .dataTables_length{
    float: none;
    text-align: center;
    display: none;
	}
	}
 </style> 	
</head>
		<!--Liens du Menu  -->
		<c:url value ="/" var="accueil"/>
 		<c:url value ="/ajouter-jeu" var="jeu"/>
	     <c:url value ="/ajouter-joueur" var="joueur"/>
	     <c:url value ="/ajouter-match" var="match"/>

		<!-- fin Liens du Menu  -->	
<body class= "" style= "">
	<div class= "fixed-top">
	<nav class="navbar navbar-expand-lg navbar-light" style="background:black">
  		<div class="container-fluid">
			  <a class="navbar-brand pl-5" style="width: 60px; color:white" href="${accueil}">GAMER</a>
			  <button class="navbar-toggler bg-white" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
			   aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		      <span class="navbar-toggler-icon"></span>
		    </button>
		    <div class="collapse navbar-collapse" id="navbarSupportedContent" >
		    	<ul class="navbar-nav">		    		
		        	<li class="nav-item">
		          		<a class="nav-link active pr-5" aria-current="page" style= color:white;  href="${jeu}">Ajout-jeu</a>
		        	</li>
		        	<li class="nav-item">
		          		<a class="nav-link active pr-5" aria-current="page" style= color:white;  href="${joueur}">Ajout-joueur</a>
		        	</li>
		        	<li class="nav-item">
		          		<a class="nav-link active pr-5" aria-current="page" style= color:white;  href="${match}">Ajout-match</a>
		        	</li>		        	
		    	</ul>		     	
		    </div>
		 </div>
	</nav>
	</div>