<c:import url="Header.jsp"></c:import>
<div class="container " style="margin-top: 100px">
		<h1 class="mt-5">Ajouter un jeu</h1>
	
			 <form class="form" method="post" action="<%= request.getContextPath() %>/ajouter-jeu"  onsubmit="return envoyer(event);">
	        <div class="row">
		        <div class="mb-3 col">
		          <label for="title" class="form-label">Titre*:</label>
		          <input type="text" class="form-control" id="title" name="title" required>
		        </div>
		        <div class="mb-3 col">
		            <label for="minPlayer" class="form-label">min_player*:</label>
		            <input type="text" class="form-control" id="minPlayer" name="minPlayer" required>
		        </div>
	        </div>
	        
	         <div class="row">
		          <div class="mb-3 col">
		            <label for="maxPlayer" class="form-label">max_player*:</label>
		            <input type="text" class="form-control" id="maxPlayer" name="maxPlayer" required>
		            <div id="errorEmail"></div>
		          </div>
		         
	         </div>
	      
	        <p style="text-align: left;">*: Champs obligatoire</p>
	        <button type="submit"  onsubmit='checkEmail();' class="btn btn-primary mb-4" onclick='confirmPass();'>Ajouter</button>
	        <a href="utilisateurs"  onsubmit='checkEmail();' class="btn btn-primary mb-4" onclick='confirmPass();'>Annuler</a>
	      </form> 
	</div>
</body>
</html>