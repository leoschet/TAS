<%@ page import="ta.UEvaluation" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Criar Avaliação</title>
</head>
<body>
	<g:form name="createEvaluation" action="rippenEvaluation">
		<input name="title" />
		<input name="question description" />
		<input name="question answer" />
		<input name="question alternative" />
		<input id="register" type="submit" value="Create" />
	</g:form>
</body>
</html>