<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="it.unisa.model.*, java.util.*"%>
    
    <%
	ArrayList<ArrayList<ProdottoBean>> categorie = (ArrayList<ArrayList<ProdottoBean>>) request.getSession().getAttribute("categorie");
	if(categorie == null) {
		response.sendRedirect("./home?page=Home.jsp");	
		return;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">	
<title>Home</title>
</head>
<body>

		<%@ include file="./fragments/header.jsp" %>
		<%@ include file="./fragments/menu.jsp" %>
	
		<div id="main" class="clear">
			
			<%for(int i = 0 ; i < categorie.size() ; i++){%>
				<div class="categoria categoria<%=i%>">
				<%switch(i){
					case 0 : %> <h2>ALIMENTAZIONE</h2><a href="Alimentazione.jsp" id="orange">vedi tutta la categoria</a> <hr>
								<%break;
					case 1 : %> <h2>ACCESSORI</h2> <a href="Accessori.jsp" id="orange">vedi tutta la categoria</a> <hr>
								<%break;
					case 2 : %> <h2>ELETTRONICA</h2><a href="Elettronica.jsp" id="orange">vedi tutta la categoria</a>  <hr>
								<%break;
					case 3 : %> <h2>GIOIELLI</h2><a href="Gioielli.jsp" id="orange">vedi tutta la categoria</a>  <hr>
								<%break;
					case 4 : %> <h2>GIOCHI E GIOCATTOLI</h2><a href="Giocattoli.jsp" id="orange">vedi tutta la categoria</a>  <hr>
								<%break;
				
				}for(int j = 0; j< categorie.get(i).size(); j++){
					ProdottoBean bean = categorie.get(i).get(j);%>
					 <div class="item">
						<ul>
							<li><a href="dettagli?id=<%=bean.getIdProdotto()%>"><img src="<%=bean.getImmagine()%>" height="130" width="130"></a></li>
							<li><%=bean.getNome()%></li>
							<li>prezzo: &euro;<%=bean.getPrezzo()%></li>
							<li><a href="carrello?action=addC&id=<%=bean.getIdProdotto()%>&page=Home.jsp"><button>Aggiungi al carrello</button></a></li>
		 				</ul>
					</div>
				<%}%></div><%}%> 
		</div>
	
		<%@ include file="./fragments/footer.jsp" %>
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		
		<script>
			$(document).ready(function(){
				$("img").hover(function(){
					$(this).css({"height": "135px", "width" :"135px"});
				}, function(){
						$(this).css({"height" : "130px", "width" : "130px"});
					});
				});
			
			$(document).ready(function(){
				$(".categoria0 .item").slice(6).hide();
				$(".categoria1 .item").slice(5).hide();
				$(".categoria2 .item").slice(6).hide();
				$(".categoria3 .item").slice(6).hide();
				$(".categoria4 .item").slice(6).hide();
				});

		</script>

</body>
</html>