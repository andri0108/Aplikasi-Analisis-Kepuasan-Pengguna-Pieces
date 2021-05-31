
<?php

if($_SERVER['REQUEST_METHOD']=='POST') {

   $response = array();
   //mendapatkan data
  
    $allskor = $_POST['allskor'];
    $penganalisa = $_POST['penganalisa'];
    $jstp = $_POST['jstp'];
    $jtp = $_POST['jtp'];
    $jrg = $_POST['jrg'];
    $jp = $_POST['jp'];
    $jsp = $_POST['jsp'];
    $hasil = $_POST['hasil'];
   $status = $_POST['status'];
    $tanggal = date("Y-m-d");

   require_once('dbConnect.php');
   //Cek npm sudah terdaftar apa belum
     $sql = "INSERT INTO r_efisien (allskor,penganalisa,jstp,jtp,jrg,jp,jsp,hasil,status,tanggal) VALUES('$allskor','$penganalisa','$jstp','$jtp','$jrg','$jp','$jsp','$hasil','$status','$tanggal')";
     if(mysqli_query($con,$sql)) {
       $response["value"] = 1;
       $response["message"] = "Silahkan Hubungi Admin Jika Meminta Laporan";
       echo json_encode($response);
     } else {
       $response["value"] = 0;
       $response["message"] = "oops! Coba lagi!";
       echo json_encode($response);
     }
   
   // tutup database
   mysqli_close($con);
} else {
  $response["value"] = 0;
  $response["message"] = "oops! Coba lagi!!!!!";
  echo json_encode($response);
}