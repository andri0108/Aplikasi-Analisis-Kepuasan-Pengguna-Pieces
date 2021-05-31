<!DOCTYPE HTML>
<html>
<head>
	<title>Helo</title>
	<link href="css1/bootstrap.css" rel="stylesheet">
	<script src="js1/bootstrap.js"></script>
</head>
<?php	
			$koneksi=mysql_connect("localhost","id13818931_analisis1","t!smi9wo&sKgxu}D");
			mysql_select_db("id13818931_analisis",$koneksi);
			$data=mysql_query("select *from r_informasi");
?>

<body>

<div class="container">
	<div class="page-header" align="center"><h1>Laporan Hasil Analisis Informasi</h1></div>
	<form action="tampilresulti.php" method="get">
		<label>Cari :</label>
		<input type="text" name="cari">
		<input type="submit" value="Cari">
	</form>
	<?php 
	if(isset($_GET['cari'])){
		$cari = $_GET['cari'];
		echo "<b>Hasil pencarian : ".$cari."</b>";
	}
	?>
	<table class="table table-striped">
		<thead>
			<th>id</th>
			<th>All Skor</th>
			<th>Penganalisa</th>
			<th>Jumlah Sangat Tidak Puas</th>
			<th>Jumlah Tidak Puas</th>
			<th>Jumlah Ragu-Ragu</th>
			<th>JUmlah puas</th>
			<th>Jumlah Sangat Puas</th>
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
			<td><?php echo $d['jtp']; ?></td>
			<td><?php echo $d['jrg']; ?></td>
			<td><?php echo $d['jp']; ?></td>
			<td><?php echo $d['jsp']; ?></td>
			<td><?php echo $d['hasil']; ?></td>
	    	<td><?php echo $d['status']; ?></td>
			<td><?php echo $d['tanggal']; ?></td>
		
			
			
			
		
			</tr>
			
		
		</tbody>
		<?php	
		}
	?>
	</table>
	
	<a class="btn btn-info btn-sm" href="cetakresulti.php" target="blank">Cetak</a>
	<a class="btn btn-info btn-sm" href="dashboard.php">Kembali</a>
		<a class="btn btn-info btn-sm" href="diagrami.php">Grafik</a>
	
</div>

</body>

</html>