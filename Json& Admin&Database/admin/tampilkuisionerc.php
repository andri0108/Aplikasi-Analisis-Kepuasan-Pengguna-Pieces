<!DOCTYPE HTML>
<html>
<head>
	<title>Pendaftaran</title>
	<link href="css1/bootstrap.css" rel="stylesheet">
	<script src="js1/bootstrap.js"></script>
</head>
<?php	
			$koneksi=mysql_connect("localhost","id13818931_analisis1","t!smi9wo&sKgxu}D");
			mysql_select_db("id13818931_analisis",$koneksi);
			$data=mysql_query("select *from k_control");
?>

<body>

<div class="container">
	<div class="page-header" align="center"><h1>Kuisioner Kontrol</h1></div>
	<form action="tampilkuisionerc.php" method="get">
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
			<th>Id_Kuisioner</th>
			<th>kuisioner</th>
			
		
			
		</thead>
		<tbody>
	<?php
		if(isset($_GET['cari'])){
			$cari = $_GET['cari'];
			$data = mysql_query("select * from k_control where id_kuisioner like '%".$cari."%'");				
		}else{
		$data = mysql_query("select * from k_control");	
	}
	
		while($d=mysql_fetch_array($data)){
		?>	
			
			<td><?php echo $d['id_kuisioner']; ?></td>
			<td><?php echo $d['kuisioner']; ?></td>
		
		
			
			
			
	
		<td><a class="btn btn-info btn-xs" a href="ubahkuisionerc.php?id_kuisioner=<?php echo $d['id_kuisioner']; ?>">Ubah</td>
			</tr>
			
		
		</tbody>
		<?php	
		}
	?>
	</table>
	
	
	<a class="btn btn-info btn-sm" href="dashboard.php">Kembali</a>
	
</div>

</body>

</html>