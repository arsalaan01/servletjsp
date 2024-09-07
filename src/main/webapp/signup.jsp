<%--
  Created by IntelliJ IDEA.
  User: Arsalaan
  Date: 06/09/24
  Time: 10:25 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col m6 offset-m3">
                <div class="card">
                    <div class="card-content">
                        <h3>Register Here !</h3>
                        <h6 id="msg" class="center-align"></h6>
                        <div class="form center-align" id="form">
                            <form action="Register" method="post">
                                <input type="text" name="user_name" placeholder="Enter user name"/>
                                <input type="password" name="user_password" placeholder="Enter user password"/>
                                <input type="email" name="user_email" placeholder="Enter user email"/>
                                <button type="submit" name="submit" class="btn light-blue accent-3">Submit</button>
                            </form>
                        </div>

                        <div class="loader center-align" style="margin-top: 10px; display:none;" >
                            <div class="loader center-align" style="margin-top: 10px;">
                                <div class="preloader-wrapper big active">
                                    <div class="spinner-layer spinner-blue-only">
                                        <div class="circle-clipper left">
                                            <div class="circle"></div>
                                        </div><div class="gap-patch">
                                        <div class="circle"></div>
                                    </div><div class="circle-clipper right">
                                        <div class="circle"></div>
                                    </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>

    <script>
        $(document).ready(function () {
            console.log("Page is ready .....");
            $("form").on("submit",function (event) {
                event.preventDefault();

                // Check form data
                $(this).find('input').each(function() {
                    console.log('Input name: ' + $(this).attr('name') + ', value: ' + $(this).val());
                });

                $(".loader").show();
                $("form").hide();

                $.ajax({
                    url:"Register",
                    data: $(this).serialize(),
                    type: 'POST',
                    success: function (data,textStatus,jqXHR) {
                        console.log(data);
                        console.log("SUCCESS - - - - - ");
                        $(".loader").hide();
                        $("form").show();
                        if(data.trim() === "complete"){
                            $('#msg').html("Successfully registered!!");
                        }else {
                            $('#msg').html("Something went wrong!!");
                        }
                    },
                    error: function (jqXHR, textStatus, errorThrown) {
                        console.log(data);
                        console.log("ERROR - - - - - ");
                        $(".loader").hide();
                        $("form").show();
                    }
                })

            })
        })
    </script>
</body>
</html>
