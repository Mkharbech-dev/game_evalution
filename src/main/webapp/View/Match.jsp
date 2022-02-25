<c:import url="Header.jsp"></c:import>
<div class="container " style="margin-top: 100px">
		<h1 class="text-center">Détail de macth</h1>		
				<input type="hidden" name="idMatch" value="<c:out value="${matchDetail.id}" />" />
				<input type="hidden" name="action" value="post" />
				<h5>Nom de jeu : <span class="text-danger"> ${matchDetail.getGame().title}</span> </h5>
				<h5>date de jeu : <span class="text-danger"> ${matchDetail.start_date}</span> </h5>
				<h5>pseudo du gagnant : <span class="text-danger"> ${matchDetail.getPlayer().nickname}</span> </h5>
				<h5>Nombre de joueurs : <span class="text-danger"> ${matchDetail.getGame().count(matchDetail.getGame().max_players, matchDetail.getGame().min_players)}</span> </h5>
		<h1 class="text-center">Ajouter un joueur au match</h1>	
		 <form class="form" method="post" action="<%= request.getContextPath() %>/match"  onsubmit="return envoyer(event);">
	        <div class="row">
		        <div class="mb-3 col">
		          <label for="id_player" class="form-label">joueur*:</label>
		          <select class="form-select" aria-label="Default select example" name="player" required>
		           <option selected>choisir un joueur</option>
					  <c:forEach items= "${play}" var ="item">
						  <option value="<c:out value="${item.id}"></c:out>"><c:out value="${item.nickname}"></c:out></option>
					  </c:forEach>
				  </select>
		        </div>
		        <div class="mb-3 col">
		            <label for="id_match" class="form-label">match*:</label>
		             <select class="form-select" aria-label="Default select example" name="contest" required>
		           <option selected>choisir un match</option>
					  <c:forEach items= "${match}" var ="item">
						  <option value="<c:out value="${item.id}"></c:out>"><c:out value="${item.id}"></c:out></option>
					  </c:forEach>
				  </select>
		        </div>
	        </div>
	        <p style="text-align: left;">*: Champs obligatoire</p>
	        <button type="submit"  onsubmit='checkEmail();' class="btn btn-primary mb-4" onclick='confirmPass();'>Ajouter</button>
	        <a href="accueil"  onsubmit='checkEmail();' class="btn btn-primary mb-4" onclick='confirmPass();'>Annuler</a>
	      </form> 
</div>
</body>
</html>