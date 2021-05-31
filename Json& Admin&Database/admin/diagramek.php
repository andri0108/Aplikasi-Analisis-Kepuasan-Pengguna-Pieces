<!DOCTYPE html>
<html>
<head>
	<title>GRAFIK EKONOMI</title>
	<script type="text/javascript" src="chartjs/Chart.js"></script>
</head>
<body>
	<style type="text/css">
	body{
		font-family: roboto;
	}

	table{
		margin: 0px auto;
	}
	</style>


	<center>
		<h2>Grafik Ekonomi</h2>
		
	</center>


	<?php 
	include 'koneksi.php';
	?>

	<div style="width: 800px;margin: 0px auto;">
		<canvas id="myChart"></canvas>
	</div>

	<br/>
	<br/>


	<script>
		var ctx = document.getElementById("myChart").getContext('2d');
		var myChart = new Chart(ctx, {
			type: 'bar',
			data: {
				labels: ["SANGAT TIDAK PUAS", "TIDAK PUAS","RAGU-RAGU","PUAS","SANGAT PUAS"],
				datasets: [{
					label: '',
					data: [
					<?php 
					$stp = mysqli_query($koneksi,"select * from s_ekonomi where status='SANGAT TIDAK PUAS'");
					echo mysqli_num_rows($stp);
					?>, 
					<?php 
					$tp = mysqli_query($koneksi,"select * from s_ekonomi where status='TIDAK PUAS'");
					echo mysqli_num_rows($tp);
					?>,
						<?php 
					$rg = mysqli_query($koneksi,"select * from s_ekonomi where status='RAGU-RAGU'");
					echo mysqli_num_rows($rg);
					?>,
						<?php 
					$p = mysqli_query($koneksi,"select * from s_ekonomi where status='PUAS'");
					echo mysqli_num_rows($p);
					?>,
						<?php 
					$sp = mysqli_query($koneksi,"select * from s_ekonomi where status='SANGAT PUAS'");
					echo mysqli_num_rows($sp);
					?>,
					],
					backgroundColor: [
					'rgba(255, 99, 132, 0.2)',
					'rgba(54, 162, 235, 0.2)',
				    'rgba(255, 206, 86, 0.2)',
					'rgba(75, 192, 192, 0.2)'
					],
					borderColor: [
					'rgba(255,99,132,1)',
					'rgba(54, 162, 235, 1)',
					'rgba(255, 206, 86, 1)',
					'rgba(75, 192, 192, 1)'
					],
					borderWidth: 1
				}]
			},
			options: {
				scales: {
					yAxes: [{
						ticks: {
							beginAtZero:true
						}
					}]
				}
			}
		});
	</script>
</body>
</html>