<?php
$koneksi=mysql_connect("localhost","id13818931_analisis1","t!smi9wo&sKgxu}D");
	mysql_select_db("id13818931_analisis",$koneksi);
	
	$id_kuisionerx=$_POST['id_kuisioner'];
	$kuisionerx=$_POST['kuisioner'];
	
	
	
	$simpan=mysql_query("update k_informasi set kuisioner='$kuisionerx' where id_kuisioner='$id_kuisionerx'");
	if($simpan){
	echo "<h4>berhasil disimpan</h4>";
	//header("location:tampilkuisioneip.php");
	include "tampilkuisioneri.php";
	}
?>
