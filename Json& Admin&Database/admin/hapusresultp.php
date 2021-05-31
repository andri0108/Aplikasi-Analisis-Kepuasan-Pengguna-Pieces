<?php
	$koneksi=mysql_connect("localhost","id13818931_analisis1","t!smi9wo&sKgxu}D");
	mysql_select_db("id13818931_analisis",$koneksi);
	$id=$_GET['id'];
	
	$hapus=mysql_query("delete from r_performa where id='$id'");
	if($hapus){
		header("location:tampilresultp.php");
	}
?>