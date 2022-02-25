<c:import url="Header.jsp"></c:import>
<div class="container " style="margin-top: 100px">
		<h1 class="mt-5">Ajouter un Match</h1>
	
			 <form class="form" method="post" action="<%= request.getContextPath() %>/ajouter-match"  onsubmit="return envoyer(event);">
	        <div class="row">
		        <div class="mb-3 col">
		        <label for="game" class="form-label">Jeu*:</label>
		          <select class="form-select" aria-label="Default select example" name="game" required>
		           <option selected>choisir un jeu</option>
					  <c:forEach items= "${game}" var ="item">
						  <option value="<c:out value="${item.id}"></c:out>"><c:out value="${item.title}"></c:out></option>
					  </c:forEach>
				  </select>
		        </div>
		        <div class="mb-3 col">
		            <label for="player" class="form-label">Joueur*:</label>
		          <select class="form-select" aria-label="Default select example" name="player" required>
		          <option selected>choisir un joueur</option>
					  <c:forEach items= "${play}" var ="item">
						  <option value="<c:out value="${item.id}"></c:out>"><c:out value="${item.nickname}"></c:out></option>
					  </c:forEach>
				  </select>
		        </div>
	        </div>
	        
	        
	        
	      
	        <p style="text-align: left;">*: Champs obligatoire</p>
	        <button type="submit"  onsubmit='checkEmail();' class="btn btn-primary mb-4" onclick='confirmPass();'>Ajouter</button>
	        <a href="utilisateurs"  onsubmit='checkEmail();' class="btn btn-primary mb-4" onclick='confirmPass();'>Annuler</a>
	  
	      </form> 
	</div>
</body>
</html>