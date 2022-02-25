<c:import url="Header.jsp"></c:import>
<div class="container " style="margin-top: 100px">
<h1>Liste des joueurs</h1>
	<table class="table table-success table-striped">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Email</th>
      <th scope="col">Pseudoname</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach items= "${play}" var ="item">
    <tr>
      <th scope="row">${item.id }</th>
      <td>${item.email}</td>
      <td>${item.nickname}</td>
    </tr>
    </c:forEach> 
  </tbody>
</table>

<hr>
<h1>Liste des jeux</h1>
	<table class="table table-success table-striped">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Titre</th>
      <th scope="col">Min-joueur</th>
      <th scope="col">Max-joueur</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach items= "${game}" var ="item">
    <tr>
      <th scope="row">${item.id }</th>
      <td>${item.title}</td>
      <td>${item.min_players}</td>
      <td>${item.max_players}</td>
    </tr>
    </c:forEach> 
  </tbody>
</table>

<h1>Liste des matchs</h1>
	<table class="table table-success table-striped">
  <thead>
    <tr> 
      <th scope="col">#</th> 
      <th scope="col">nom de jeu</th>
      <th scope="col">Date</th>
      <th scope="col">pseudo du gagnant</th>
      <th scope="col">Nombre de joueurs</th>
      <th scope="col">Détail</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach items= "${cont}" var ="item">
    <tr>
      <th scope="row">${item.id }</th>
      <td>${item.getGame().title }</td>
      <td>${item.start_date}</td>
      <td>${item.getPlayer().nickname }</td>
      <td>${item.getGame().count(item.getGame().max_players, item.getGame().min_players) }</td>
      <td><a href="match?idMatch=<c:out value="${item.id}"/>">voir plus</a></td>
    </tr>
    </c:forEach> 
  </tbody>
</table>
</div>
</body>
</html>