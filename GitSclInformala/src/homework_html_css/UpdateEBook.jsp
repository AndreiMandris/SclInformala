


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./eBooksStore.css"> 
    </head>
    <body>
        <h1 class = "center">Update eBook</h1>
        <hr>
        <form action=UpdateEBook.jsp" method="put">
            <div class = "center">
                <table>
                    <tr><td>I.S.B.N.:</td><td><input type="text" name="inputform_updatebook_ISBN"></input></td><td></td></tr>
                    <tr><td>Title:</td><td><input type="text" name="inputform_updatebook_title"></input></td><td></td></tr>
                    <tr><td>Authors:</td><td><input type="text"name="inputform_updatebook_authors"></input></td><td></td></tr>
                    <tr><td>Devices:</td><td><input type="text"name="inputform_updatebook_devices"></input></td><td></td></tr>
                    <tr><td>Price:</td><td><input type="text"name="inputform_updatebook_price"></input></td><td></td></tr>
                </table>
                <input type="submit" class="submitbutton" value="Update" name="inputform_updatebook_update">
            </div>
        </form>
    </body> 
    
</html>
