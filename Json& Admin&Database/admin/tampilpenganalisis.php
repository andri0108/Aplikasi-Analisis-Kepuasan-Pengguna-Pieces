<!DOCTYPE HTML>
<html>
<head>
	<title>Heloo</title>
	<link href="css1/bootstrap.css" rel="stylesheet">
	<script src="js1/bootstrap.js"></script>
</head>
<?php	
			$koneksi=mysql_connect("localhost","id13818931_analisis1","t!smi9wo&sKgxu}D");
			mysql_select_db("id13818931_analisis",$koneksi);
			$data=mysql_query("select *from penganalisis");
?>

<body>

<div class="container">
	<div class="page-header" align="center"><h1>Data Penganalisa</h1></div>
	<form action="tampilpenganalisis.php" method="get">
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
			<th>NAMA</th>
			<th>Password</th>
		
			
		</thead>
		<tbody>
	<?php
		if(isset($_GET['cari'])){
			$cari = $_GET['cari'];
			$data = mysql_query("select * from penganalisis where id like '%".$cari."%'");				
		}else{
		$data = mysql_query("select * from penganalisis");	
	}
	
		while($d=mysql_fetch_array($data)){
		?>	
			
			<td><?php echo $d['id']; ?></td>
			<td><?php echo $d['nama']; ?></td>
			<td><?php echo $d['password']; ?></td>
		
			
			
			
			<td><a class="btn btn-info btn-xs" a href="hapuspenganalisis.php?id=<?php echo $d['id']; ?>">Hapus</td>
			</tr>
			
		
		</tbody>
		<?php	
		}
	?>
	</table>
	
	<a class="btn btn-info btn-sm" href="cetakpenganalisis.php" target="blank">Cetak</a>
	<a class="btn btn-info btn-sm" href="dashboard.php">Kembali</a>
	
</div>

</body>

</html>