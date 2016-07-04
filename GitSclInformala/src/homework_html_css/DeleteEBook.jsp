
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./eBooksStore.css"> 
        <title>Search and Delete an eBook</title>
    </head>
    <body>
        <h1 class = "center"> Delete an eBook with the following ISBN</h1>
        <hr>
        <form action = DeleteEBook.jsp" method="delete">
            <div class = "center">
                <table>
                    <tr><td>I.S.B.N.:</td><td><input type="text" name="inputform_updatebook_ISBN"></input></td><td></td></tr>
                    
                </table>
                <input type="submit" class="submitbutton" value="Delete" name="inputform_deletebook_delete">
            </div>
        </form>
        <hr>
    </body>
</html>
