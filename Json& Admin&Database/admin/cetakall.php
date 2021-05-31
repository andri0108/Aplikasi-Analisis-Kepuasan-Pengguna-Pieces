<!DOCTYPE HTML>
<html>
<head>
	<title>Laporan</title>
	<link href="css1/bootstrap.css" rel="stylesheet">
	<script src="js1/bootstrap.js"></script>
</head>
<?php	
			$koneksi=mysql_connect("localhost","id13818931_analisis1","t!smi9wo&sKgxu}D");
			mysql_select_db("id13818931_analisis",$koneksi);
			$data=mysql_query("select *from r_performa");
?>

<body>

<div class="container">
	<div class="page-header" align="center"><h1>Laporan Hasil  Analisa Performa</h1></div>
	
	<table class="table table-striped">
		<thead>
			<th>Id</th>
			<th>All Skor</th>
			<th>Penganalisa</th>
			<th>Sangat Tidak Puas</th>
			<th>Tidak Puas</th>
			<th>Ragu-Ragu</th>
			<th>Puas</th>	
			<th>Sangat Puas</th>
			<th>Hasil</th>
			<th>Status</th>
		    <th>Tanggal</th>
			
			
		</thead>
		<tbody>
	<?php
		if(isset($_GET['cari'])){
			$cari = $_GET['cari'];
			$data = mysql_query("select * from r_performa where id like '%".$cari."%'");				
		}else{
		$data = mysql_query("select * from r_performa");	
	}
	
		while($d=mysql_fetch_array($data)){
		?>	
			
			<td><?php echo $d['id']; ?></td>
			<td><?php echo $d['allskor']; ?></td>
			<td><?php echo $d['penganalisa']; ?></td>
			<td><?php echo $d['jstp']; ?></td>
			<td><?php echo $d['jstp']; ?></td>
			<td><?php echo $d['jrg']; ?></td>
		    <td><?php echo $d['jp']; ?></td>
		    <td><?php echo $d['jsp']; ?></td>
		    <td><?php echo $d['hasil']; ?></td>
		    <td><?php echo $d['status']; ?></td>
		    <td><?php echo $d['tanggal']; ?></td>
			
			
		
		</tbody>
		<?php	
		}
	?>
	</table>
	<?php	
			$koneksi=mysql_connect("localhost","id13818931_analisis1","t!smi9wo&sKgxu}D");
			mysql_select_db("id13818931_analisis",$koneksi);
			$data=mysql_query("select *from r_informasi");
?>

<body>

<div class="container">
	<div class="page-header" align="center"><h1>Laporan Hasil  Analisa Informasi</h1></div>
	
	<table class="table table-striped">
		<thead>
			<th>Id</th>
			<th>All Skor</th>
			<th>Penganalisa</th>
			<th>Sangat Tidak Puas</th>
			<th>Tidak Puas</th>
			<th>Ragu-Ragu</th>
			<th>Puas</th>	
			<th>Sangat Puas</th>
			<th>Hasil</th>
			<th>Status</th>
		    <th>Tanggal</th>
			
			
		</thead>
		<tbody>
	<?php
		if(isset($_GET['cari'])){
			$cari = $_GET['cari'];
			$data = mysql_query("select * from r_informasi where id like '%".$cari."%'");				
		}else{
		$data = mysql_query("select * from r_informasi");	
	}
	
		while($d=mysql_fetch_array($data)){
		?>	
			
			<td><?php echo $d['id']; ?></td>
			<td><?php echo $d['allskor']; ?></td>
			<td><?php echo $d['penganalisa']; ?></td>
			<td><?php echo $d['jstp']; ?></td>
			<td><?php echo $d['jstp']; ?></td>
			<td><?php echo $d['jrg']; ?></td>
		    <td><?php echo $d['jp']; ?></td>
		    <td><?php echo $d['jsp']; ?></td>
		    <td><?php echo $d['hasil']; ?></td>
		    <td><?php echo $d['status']; ?></td>
		    <td><?php echo $d['tanggal']; ?></td>
			
			
		
		</tbody>
		<?php	
		}
	?>
	</table>
	<?php	
			$koneksi=mysql_connect("localhost","id13818931_analisis1","t!smi9wo&sKgxu}D");
			mysql_select_db("id13818931_analisis",$koneksi);
			$data=mysql_query("select *from r_ekonomi");
?>

<body>

<div class="container">
	<div class="page-header" align="center"><h1>Laporan Hasil  Analisa Ekonomi</h1></div>
	
	<table class="table table-striped">
		<thead>
			<th>Id</th>
			<th>All Skor</th>
			<th>Penganalisa</th>
			<th>Sangat Tidak Puas</th>
			<th>Tidak Puas</th>
			<th>Ragu-Ragu</th>
			<th>Puas</th>	
			<th>Sangat Puas</th>
			<th>Hasil</th>
			<th>Status</th>
		    <th>Tanggal</th>
			
			
		</thead>
		<tbody>
	<?php
		if(isset($_GET['cari'])){
			$cari = $_GET['cari'];
			$data = mysql_query("select * from r_ekonomi where id like '%".$cari."%'");				
		}else{
		$data = mysql_query("select * from r_ekonomi");	
	}
	
		while($d=mysql_fetch_array($data)){
		?>	
			
			<td><?php echo $d['id']; ?></td>
			<td><?php echo $d['allskor']; ?></td>
			<td><?php echo $d['penganalisa']; ?></td>
			<td><?php echo $d['jstp']; ?></td>
			<td><?php echo $d['jstp']; ?></td>
			<td><?php echo $d['jrg']; ?></td>
		    <td><?php echo $d['jp']; ?></td>
		    <td><?php echo $d['jsp']; ?></td>
		    <td><?php echo $d['hasil']; ?></td>
		    <td><?php echo $d['status']; ?></td>
		    <td><?php echo $d['tanggal']; ?></td>
			
			
		
		</tbody>
		<?php	
		}
	?>
	</table>
	<?php	
			$koneksi=mysql_connect("localhost","id13818931_analisis1","t!smi9wo&sKgxu}D");
			mysql_select_db("id13818931_analisis",$koneksi);
			$data=mysql_query("select *from r_control");
?>

<body>

<div class="container">
	<div class="page-header" align="center"><h1>Laporan Hasil  Analisa Control</h1></div>
	
	<table class="table table-striped">
		<thead>
			<th>Id</th>
			<th>All Skor</th>
			<th>Penganalisa</th>
			<th>Sangat Tidak Puas</th>
			<th>Tidak Puas</th>
			<th>Ragu-Ragu</th>
			<th>Puas</th>	
			<th>Sangat Puas</th>
			<th>Hasil</th>
			<th>Status</th>
		    <th>Tanggal</th>
			
			
		</thead>
		<tbody>
	<?php
		if(isset($_GET['cari'])){
			$cari = $_GET['cari'];
			$data = mysql_query("select * from r_control where id like '%".$cari."%'");				
		}else{
		$data = mysql_query("select * from r_control");	
	}
	
		while($d=mysql_fetch_array($data)){
		?>	
			
			<td><?php echo $d['id']; ?></td>
			<td><?php echo $d['allskor']; ?></td>
			<td><?php echo $d['penganalisa']; ?></td>
			<td><?php echo $d['jstp']; ?></td>
			<td><?php echo $d['jstp']; ?></td>
			<td><?php echo $d['jrg']; ?></td>
		    <td><?php echo $d['jp']; ?></td>
		    <td><?php echo $d['jsp']; ?></td>
		    <td><?php echo $d['hasil']; ?></td>
		    <td><?php echo $d['status']; ?></td>
		    <td><?php echo $d['tanggal']; ?></td>
			
			
		
		</tbody>
		<?php	
		}
	?>
	</table>
	<?php	
			$koneksi=mysql_connect("localhost","id13818931_analisis1","t!smi9wo&sKgxu}D");
			mysql_select_db("id13818931_analisis",$koneksi);
			$data=mysql_query("select *from r_efisien");
?>

<body>

<div class="container">
	<div class="page-header" align="center"><h1>Laporan Hasil  Analisa Efisien</h1></div>
	
	<table class="table table-striped">
		<thead>
			<th>Id</th>
			<th>All Skor</th>
			<th>Penganalisa</th>
			<th>Sangat Tidak Puas</th>
			<th>Tidak Puas</th>
			<th>Ragu-Ragu</th>
			<th>Puas</th>	
			<th>Sangat Puas</th>
			<th>Hasil</th>
			<th>Status</th>
		    <th>Tanggal</th>
			
			
		</thead>
		<tbody>
	<?php
		if(isset($_GET['cari'])){
			$cari = $_GET['cari'];
			$data = mysql_query("select * from r_efisien where id like '%".$cari."%'");				
		}else{
		$data = mysql_query("select * from r_efisien");	
	}
	
		while($d=mysql_fetch_array($data)){
		?>	
			
			<td><?php echo $d['id']; ?></td>
			<td><?php echo $d['allskor']; ?></td>
			<td><?php echo $d['penganalisa']; ?></td>
			<td><?php echo $d['jstp']; ?></td>
			<td><?php echo $d['jstp']; ?></td>
			<td><?php echo $d['jrg']; ?></td>
		    <td><?php echo $d['jp']; ?></td>
		    <td><?php echo $d['jsp']; ?></td>
		    <td><?php echo $d['hasil']; ?></td>
		    <td><?php echo $d['status']; ?></td>
		    <td><?php echo $d['tanggal']; ?></td>
			
			
		
		</tbody>
		<?php	
		}
	?>
	</table>
	<?php	
			$koneksi=mysql_connect("localhost","id13818931_analisis1","t!smi9wo&sKgxu}D");
			mysql_select_db("id13818931_analisis",$koneksi);
			$data=mysql_query("select *from r_servis");
?>

<body>

<div class="container">
	<div class="page-header" align="center"><h1>Laporan Hasil  Analisa Service</h1></div>
	
	<table class="table table-striped">
		<thead>
			<th>Id</th>
			<th>All Skor</th>
			<th>Penganalisa</th>
			<th>Sangat Tidak Puas</th>
			<th>Tidak Puas</th>
			<th>Ragu-Ragu</th>
			<th>Puas</th>	
			<th>Sangat Puas</th>
			<th>Hasil</th>
			<th>Status</th>
		    <th>Tanggal</th>
			
			
		</thead>
		<tbody>
	<?php
		if(isset($_GET['cari'])){
			$cari = $_GET['cari'];
			$data = mysql_query("select * from r_servis where id like '%".$cari."%'");				
		}else{
		$data = mysql_query("select * from r_servis");	
	}
	
		while($d=mysql_fetch_array($data)){
		?>	
			
			<td><?php echo $d['id']; ?></td>
			<td><?php echo $d['allskor']; ?></td>
			<td><?php echo $d['penganalisa']; ?></td>
			<td><?php echo $d['jstp']; ?></td>
			<td><?php echo $d['jstp']; ?></td>
			<td><?php echo $d['jrg']; ?></td>
		    <td><?php echo $d['jp']; ?></td>
		    <td><?php echo $d['jsp']; ?></td>
		    <td><?php echo $d['hasil']; ?></td>
		    <td><?php echo $d['status']; ?></td>
		    <td><?php echo $d['tanggal']; ?></td>
			
			
		
		</tbody>
		<?php	
		}
	?>
	</table>
	<script>
		window.print();
	</script>
	
</div>

</body>
	<script>
		window.print();
	</script>
	
</div>

</body>

</html>