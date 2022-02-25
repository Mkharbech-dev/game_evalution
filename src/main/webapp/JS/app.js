

function envoyer(event){

    //event.preventDefault();
   
    let myRegex = /^[a-zA-Z-\s]+$/;
   
    if(document.querySelector('#firstname').value == ""){;
    document.querySelector('#firstname').style.border= '4px solid red '
    document.querySelector('#firstname').focus();
    alert('entrer un nom ')
    return false;
    }else if (myRegex.test(document.querySelector('#firstname').value) == false){
    alert('saisir uniquement des lettres et des espaces dans le nom ')
    document.querySelector('#firstname').style.border= '4px solid red '
    document.querySelector('#firstname').focus();
    return false;       
    }else{
    document.querySelector('#firstname').style.border= '4px solid green '
    }
    if(document.querySelector('#lastname').value == ""){
    document.querySelector('#lastname').style.border= '4px solid red '
    document.querySelector('#lastname').focus();
    alert('entrer un prénom ')
    return false;
    }else if (myRegex.test(document.querySelector('#lastname').value) == false){
        alert('saisir uniquement des lettres et des espaces dans le prénom ')
        document.querySelector('#lastname').style.border= '4px solid red '
        document.querySelector('#lastname').focus();
        return false;       
    }else{
    document.querySelector('#lastname').style.border= '4px solid green '
    }
    
      if(document.querySelector('#tel').value == ""){
    document.querySelector('#tel').style.border= '4px solid red '
    document.querySelector('#tel').focus();
    alert('entrer un tel ')
    return false;
    }else{
    document.querySelector('#tel').style.border= '4px solid green '
    }
    
    if(document.querySelector('#email').value == ""){
    document.querySelector('#email').style.border= '4px solid red '
    document.querySelector('#email').focus();
    alert('entrer un email ')
    return false;
    }else{
    document.querySelector('#email').style.border= '4px solid green '
    }

     if(document.querySelector('#password').value == ""){
    document.querySelector('#password').style.border= '4px solid red '
    document.querySelector('#password').focus();
    alert('entrer un mot de passe ')
    return false;
    }else{
    document.querySelector('#password').style.border= '4px solid green '
    }
    
     if(document.querySelector('#password2').value == ""){
    document.querySelector('#password2').style.border= '4px solid red '
    document.querySelector('#password2').focus();
    alert('Confirmer ou corriger votre mot de passe de confirmation svp!')
    return false;
    }else{
    document.querySelector('#password2').style.border= '4px solid green '
    }
    
    setTimeout(function(){
			document.querySelector("#msg").innertHTML='';
		},5000);

     
}

//vérification du numéro de téléphone. Attendre la saisie COMPLETE pour savoir si la réponse est bonne.    
var tel = document.querySelector("#tel");
var regexTel = /^(?:(?:\+|00)33|0)\s*[1-9](?:[\s.-]*\d{2}){4}$/;

tel.addEventListener("keyup", function() {
    if (!regexTel.test(tel.value)) {
        tel.focus();
        document.querySelector("#errorTel").innerHTML = '<p style="color:red">Merci de ne pas saisir de lettres ou format incorrect</p>';
        return false;
    }else {
        document.querySelector("#errorTel").innerHTML = '';
       
    }
})

/*	//vérification du mail:
	var email = document.querySelector("#email");
	var regexMail = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,6})+$/;
	
	email.addEventListener("keyup", function () {
	    if (!regexMail.test(email.value)){
	        email.focus();
	        document.querySelector("#errorEmail").innerHTML = '<p style="color:red">Merci de saisir une adresse mail correcte</p>';
	        return false;
	    }else {
	        document.querySelector("#errorEmail").innerHTML = '';
	    }
	})*/

//vérification des mots de passe
		var pwd = document.querySelector("#password");
		var pwdConfirmed = document.querySelector("#password2");
		
		pwdConfirmed.addEventListener("keyup", function (){
		    if (!(pwd.value == pwdConfirmed.value)){
		        pwdConfirmed.focus();
		        document.querySelector("#pwdConfirmError").innerHTML = '<p style="color:red">Le mot de passe ne correspond pas.</p>';
		        return false;
		    }else {
		        document.querySelector("#pwdConfirmError").innerHTML = '';
		         document.querySelector('#password2').style.border= '4px solid green '
		    }
		})


 function checkEmail() {

        var email = document.querySelector('#email');
        var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

        if (!filter.test(email.value)) {
            alert('Veuillez entrer une adresse email valide svp!');
            email.focus;
            return false;
        }
    }
    
  /*  function confirmPass() {
        	var pwd = document.querySelector('#password');
         	var pwd2 = document.querySelector('#password2');
         
         console.log(pwd.value);
         console.log(pwd2.value);
       
        if (pwd.value != pwd2.value) {
            alert("Les Mots de passe ne sont pas identiques");
            //pwd2.style.border= '4px solid red ';
            pwd2.focus;
            pwd2.value="";
            return false;
        }
    }
    */
        
        setTimeout(function(){
			document.querySelector("#msg").innertHTML='';
		},5000);
       
         
  
		const element = document.querySelector(".hidden");
			  element.addEventListener("click", myFunction);
		
		function myFunction() {
			element.classList.remove("show");
			element.classList.add("visually-hidden");
		}
   
   
