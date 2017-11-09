<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Entrar</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Indie+Flower" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

     <style>      
      body{background-image: url("../resources/img/salada.jpg"); background-repeat: no-repeat; background-size: 100%;}    
    </style>

    <script type="text/javascript">
      function trocaCor(flag) {
  var p = document.getElementsByTagName("p");
  if(flag == "bg") {
    /* Explicar como manipular os elementos (no exemplo o 'body') sem precisar definir uma ID */
    var body=document.getElementsByTagName('body')[0];

    body.bgColor = document.getElementsByName("cor")[0].value;
    alert(body.bgColor);
    document.getElementById("container").style.backgroundColor = document.getElementsByName("cor")[0].value;
  } else if(flag == "txt"){
    for (i = 0; i < p.length; i++) {
      document.getElementsByTagName('p')[i].style.color = document.getElementsByName("cor")[1].value;
    }
  }
}
    </script>
    
    <header class="masthead" style="background-image: url('resources/img/capa.jpg'); background-size: 100%">
			<div class="container">
				<div class="row">
					<div class="col-sm-6">
						<h1>
							<a href="#" title="Bootstrap Template">
								<img id="logo" alt="loveFood | Restaurantes Delivery" src="resources/img/logo.png" width="380">
							</a>
							<p id="txtLogo" class="lead"><em>Restaurantes Delivery</em></p>
						</h1>
					</div>
				
				</div>
			</div>
		</header>

    <!-- Bootstrap -->
    <script type="text/javascript" src="acessibilidade.js"></script>
    <link rel="stylesheet" type="text/css" href="acessibilidade.css" />
  </head>
  <body id="bd">
    <div class="container-fluid">
      <div class="col-md-4 col-md-offset-4 jumbotron" style="margin-top: 2%">
        <form id="form1">
          <fieldset>
            <legend><i class="fa fa-address-card" aria-hidden="true"></i>Faça Login</legend>
            <div class="form-group">
            
            <div class="form-group">
              <label for="id_email">Email</label>
              <input type="email" id="id_email" class="form-control" 
                placeholder=" Entre com o email" required>
            </div>           
              <label for="id_nome">Senha</label>
              <input type="text" id="id_senha" class="form-control" 
                placeholder=" Entre com a senha" required>
            </div>                                     
          </fieldset>
        </form>
        <button id="btn_send" class="btn btn-sm btn-success" form="form1" formaction="#" formmethod="post" type="submit">Entrar</button>
        <!-- <button id="btn_reset" class="btn btn-sm btn-warning" form="form1" type="reset">Cancelar</button> -->
      </div>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
  </body>
</html>