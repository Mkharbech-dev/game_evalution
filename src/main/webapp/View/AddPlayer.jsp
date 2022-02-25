<c:import url="Header.jsp"></c:import>
<div class="container " style="margin-top: 100px">
		<h1 class="mt-5">Ajouter un joueur</h1>
	
			 <form class="form" method="post" action="<%= request.getContextPath() %>/ajouter-joueur"  onsubmit="return envoyer(event);">
	        <div class="row">
		        <div class="mb-3 col">
		          <label for="email" class="form-label">email*:</label>
		          <input type="email" class="form-control" id="email" name="email" required>
		        </div>
		        <div class="mb-3 col">
		            <label for="nickname" class="form-label">surnom*:</label>
		            <input type="text" class="form-control" id="nickname" name="nickname" required>
		        </div>
	        </div>
	        
	      
	        <p style="text-align: left;">*: Champs obligatoire</p>
	        <button type="submit"  onsubmit='checkEmail();' class="btn btn-primary mb-4" onclick='confirmPass();'>Ajouter</button>
	        <a href="utilisateurs"  onsubmit='checkEmail();' class="btn btn-primary mb-4" onclick='confirmPass();'>Annuler</a>
	      </form> 
	</div>
</body>
</html>