<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Ember Starter Kit</title>
    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/sign-up.css">
</head>
<body>
<script type="text/x-handlebars">
    {{outlet}}
</script>

<script type="text/x-handlebars" id="index">
    <section class="sign-up-wrap">
        <div class="ui-wrap">
            <h3>Sign Up</h3>

            <div class="sign-ui">
                <div class="form-fields">
                    <div class="form-field">
                        <input type="text" name="userName" placeholder="User Name"/>
                    </div>
                </div>
                <div class="form-fields">
                    <div class="form-field">
                        <input type="text" name="emailId" placeholder="Email Id"/>
                    </div>
                </div>

                <div class="ui-ctrls">
                    <span id="register" class="btn btn-primary">Register</span>
                </div>
            </div>
        </div>
    </section>	
</script>

<script type="text/x-handlebars" id="dash">
    <ul>
        {{#each item in model}}
        <li>{{item}}</li>
        {{/each}}
    </ul>
</script>

<script src="js/libs/jquery-1.11.2.min.js"></script>
<script src="js/libs/ember-template-compiler-1.12.0.js"></script>
<script src="js/libs/ember-1.12.0.debug.js"></script>
<script src="js/app.js"></script>
<script src="js/challenge.js"></script>
<!-- to activate the test runner, add the "?test" query string parameter -->
<script src="tests/runner.js"></script>
</body>
</html>
	