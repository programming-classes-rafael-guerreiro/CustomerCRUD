<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Customer</title>
</head>
<body>
	<c:forEach varStatus="status" begin="0" end="1000">
		<p id="${status.index}" class="class${status.index}">
			<span>${status.index % 2 == 0 ? '' : 'não '}é par!</span>
			Customer ${status.index}
		</p>
	</c:forEach>
</body>
</html>