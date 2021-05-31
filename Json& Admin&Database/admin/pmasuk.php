<?php 
session_start();
$koneksi=mysql_connect("localhost","id13818931_analisis1","t!smi9wo&sKgxu}D");
	mysql_select_db("id13818931_analisis",$koneksi);

	$username=$_POST['username'];
	$password=$_POST['password'];

	$cek=mysql_query("select * from admin where username='$username' and password='$password'") or die(mysql_error());
	$banyak=mysql_num_rows($cek);
	$data=mysql_fetch_array($cek);
	if($banyak >=1){
		$_SESSION['username']=$data['username'];
		header("location:dashboard.php");
	}
	else{?>

	<script type="text/javascript">
		alert("username/password anda salah!");

	</script>
	<meta http-equiv="REFRESH" content="0;url=index.php">
	<?php  
     }
     ?>
?>
     


 