<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>admin Template</title>

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Anton" rel="stylesheet">  
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
    <div class="wrapper">
      <nav class="navbar navbar-default">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">ADMINISTRATOR</a>
        </div>
      </nav>
      <aside class="sidebar">
        <menu>
          <ul class="menu-content">
            <li><a href="dashboard.php"><i class="fa fa-home"></i> Home</a></li>
			<li>
              <a href="tampilpenganalisis.php"><i class="fa fa-users"></i> <span>Data Penganalisa</span></i></a>
            </li>
            <li><a href="#"><i class="fa fa-desktop"></i> <span>Data Kuisioner</span></i></a>
					<ul>
					<li><a href="tampilkuisionerp.php"><i class="fa fa-search-plus" aria-hidden="true"></i> <span>Kuisioner Performa</span></i></a></li>
					<li><a href="tampilkuisioneri.php"><i class="fa fa-search-plus" aria-hidden="true"></i> <span>Kuisioner Informasi</span></i></a></li>
					<li><a href="tampilkuisionere.php"><i class="fa fa-search-plus" aria-hidden="true"></i> <span>Kuisioner Efisien</span></i></a></li>
					<li><a href="tampilkuisionerc.php"><i class="fa fa-search-plus" aria-hidden="true"></i><span>Kuisioner Control</span></i></a></li>
					<li><a href="tampilkuisionerek.php"><i class="fa fa-search-plus" aria-hidden="true"></i> <span>Kuisioner Ekonomi</span></i></a></li>
					<li><a href="tampilkuisioners.php"><i class="fa fa-search-plus" aria-hidden="true"></i> <span>Kuisioner Servis</span></i></a></li>
					</ul>
					
            </li>
			<li> <a href="konfirmasi.php"><i class="fa fa-desktop"></i> <span>Hasil</span></i></a>
			<ul>
					<li><a href="tampilresultp.php"><i class="fa fa-line-chart" aria-hidden="true"></i> <span>Hasil Performa</span></i></a></li>
					<li><a href="tampilresulti.php"><i class="fa fa-line-chart" aria-hidden="true"></i> <span>Hasil Informasi</span></i></a></li>
					<li><a href="tampilresulte.php"><i class="fa fa-line-chart" aria-hidden="true"></i> <span>Hasil Efisien</span></i></a></li>
					<li><a href="tampilresultc.php"><i class="fa fa-line-chart" aria-hidden="true"></i></i><span>Hasil Control</span></i></a></li>
					<li><a href="tampilresultek.php"><i class="fa fa-line-chart" aria-hidden="true"></i></i> <span>Hasil Ekonomi</span></i></a></li>
					<li><a href="tampilresults.php"><i class="fa fa-line-chart" aria-hidden="true"></i> <span>Hasil Servis</span></i></a></li>
					</ul>
			
			</li>
			<li><a href="cetakall.php"><i class="fa fa-desktop"></i>Laporan keseluruhan</span></a></li>
			<li><a href="logout.php"><i class="fa fa-remove"></i> <span>Keluar</span></a></li>
			
          </ul>
        </menu>
      </aside>
      <section class="content">
        <div class="inner">
		                                <h3 class="register-heading">Daftar</h3>
			<form method="POST" enctype="multipart/form-data" action="simpan.php" name="form1">
			 <div class="form-group">
				<input type="text" class="form-control" placeholder="NIDN/NPM *" name="id" value="" />
             </div>	
			 <div class="form-group">
				<input type="text" class="form-control" placeholder="Nama *" name="nama" value="" />
             </div>	
			 <div class="form-group">
				<input type="text" class="form-control" placeholder="Password *" name="password" value="" />
             </div>	
				 <input type="submit" class="btnRegister"  value="Register"/>		
        </div>
      </section>
    </div>
    
    </body>
</html>