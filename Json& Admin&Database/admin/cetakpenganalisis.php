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
			$data=mysql_query("select *from penganalisis");
?>

<body>

<div class="container">
	<div class="page-header" align="center"><h1>Laporan Penganalisis</h1></div>
	
	<table class="table table-striped">
		<thead>
			<th>id</th>
			<th>Nama</th>
			<th>Jenis Kelamin</th>
			
			
			
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

</html>