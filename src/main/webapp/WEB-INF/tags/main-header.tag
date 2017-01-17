<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Buyco</title>

    <!-- Bootstrap Core CSS -->
    <link href="resources/agency/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="resources/agency/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>

    <!-- Theme CSS -->
    <link href="resources/agency/css/agency.min.css" rel="stylesheet">
    <!-- jQuery -->
    <script src="resources/jquery/jquery-3.1.1.min.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="resources/bootstrap/js/bootstrap.min.js"></script>
    <script src="resources/js/showModalDialog.js"></script>
    
</head>


<body id="page-top" class="index">

    <!-- Navigation -->
    <nav id="mainNav" class="navbar navbar-default navbar-custom navbar-fixed-top">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand page-scroll" href="#page-top">NHN Ent.</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li>
                        <a href="/buyco/register">Register</a>
                    </li>
                    <li>
                        <a href="/buyco/myPage">My Page</a>
                    </li>
                    <li>
                        <a class="page-modal" href="#login">Login</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <!-- Header -->
    <header>
        <div class="container">
            <div class="intro-text">
                <div class="intro-heading">BUYCO</div>
                <a href="#services" class="page-scroll btn btn-xl">Search Zone</a>
            </div>
        </div>
    </header>
    <!-- B -->
    <body>
    	<jsp:doBody/>
    </body>

    <footer>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <span class="copyright">Copyright &copy; BUYCO 2017</span>
                </div>
            </div>
        </div>
    </footer>
    <div class="modal fade">
  		<div class="modal-dialog">
    		<div class="modal-content">
        <!-- remote ajax call이 되는영역 -->
    		</div>
  		</div>
	</div>

</body>
<script>
(function($) {
    // jQuery for page Modal
    $('a.page-modal').bind('click', function(event) {
    	$('div.modal').modal({remote : '/buyco/login'});
    });
})(jQuery); // End of use strict

function login(){
	alert("Login");
}

function payco_login(){
	alert("Payco");

}

function facebook_login(){
	alert("Facebook");

}

function signin(){
	alert("Sign In");

}
</script>