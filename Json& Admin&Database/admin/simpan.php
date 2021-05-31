<?php
	$koneksi=mysql_connect("localhost","id13818931_analisis1","t!smi9wo&sKgxu}D");
	mysql_select_db("id13818931_analisis",$koneksi);
	
	$id=$_POST['id'];
	$nama=$_POST['nama'];
	$password=$_POST['password'];

	
	
	$simpan=mysql_query("insert into penganalisis(id,nama,password) values('$id','$nama','$password')") or die (mysql_error());
	if ($simpan){
		echo "<h4> berhasil disimpan </h4>";
		include "dashboard.php";
	}
?>
	




