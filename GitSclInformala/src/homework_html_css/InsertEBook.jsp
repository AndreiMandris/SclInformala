
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./eBooksStore.css"> 
        <title>Insert new eBook</title>
    </head>
    <body>
        <h1 class = "center">Insert new electronic book</h1><br>
        <hr>
        <form action="${pageContext.request.contextPath}/insertebook" method="put">
            <div class = "center">
                <table>
                    <tr><td>I.S.B.N.:</td><td><input type="text" name="inputform_newebook_ISBN"></input></td></tr>
                    <tr><td>Title:</td><td><input type="text" name="inputform_newebook_title"></input></td></tr>
                    <tr><td>Authors:</td><td><input type="text"name="inputform_newebook_authors"></input></td></tr>
                    <tr><td>Devices:</td><td><input type="text"name="inputform_newebook_devices"></input></td></tr>
                    <tr><td>Price:</td><td><input type="text"name="inputform_newebook_price"></input></td></tr>
                </table>
                <input type="submit" class = "submitbutton" value="Save" name="inputform_save"> 
            </div>
        </form>
    </body>
</html>
