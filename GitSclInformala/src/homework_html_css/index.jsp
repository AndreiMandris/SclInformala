
<!DOCTYPE html>

<html>
    <head>
        <title>Electronic Books Store</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="./eBooksStore.css">        
    </head>
    <body>
        <h1 class = "center2"> eBooks Store</h3> 
        <hr>
        <br>
        <!-- usage of a servlet, i9n our case index, to process pushing of buttons -->
        <form action="${pageContext.request.contextPath}/index" method="post">
            <table class="tablewithborder, center">
                <tr><td class="tdc, center2"><input type="submit" class="button" name="mainpage_newebook" value="Record new eBook"></td></tr>
                <tr><td class="tdc, center2"><input type="submit" class="button" name="mainpage_updateebook" value="Update an eBook"></td></tr>
                <tr><td class="tdc, center2"><input type="submit" class="button" name="mainpagedeleteebook" value="Delete an eBook"></td></tr>
                <tr><td class="tdc, center2"><input type="submit" class="button" name="mainpage_displayebooks" value="Display all eBooks" size="30"></td></tr>
                <tr><td class="tdc, center2"><input type="submit" class="button" name="mainpage_exit" value=" Exit from eBooks" size="40"></td></tr>
            </table>
            <br>
        </form>
