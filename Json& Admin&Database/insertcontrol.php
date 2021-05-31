<?php

if($_SERVER['REQUEST_METHOD']=='POST') {

   $response = array();
   //mendapatkan data
   $id = $_POST['id'];
   $c = $_POST['c'];
   $status = $_POST['status'];
  

   require_once('dbConnect.php');
   //Cek npm sudah terdaftar apa belum
   $sql = "SELECT * FROM penganalisis where id ='$id'";
   $check = mysqli_fetch_array(mysqli_query($con,$sql));
   if(isset($check)){
        $sql = "INSERT INTO s_control (id,c,status) VALUES('$id','$c','$status')";
     if(mysqli_query($con,$sql)) {
     $response["value"] = false;
     $response["message"] = "Terimakasih Data anda Akan Kami rekam";
     echo json_encode($response);
   } else {
     $sql = "INSERT INTO s_control (id,c,status) VALUES('$id','$c',$status)";
     if(mysqli_query($con,$sql)) {
       $response["value"] = 1;
       $response["message"] = "Sukses mendaftar";
       echo json_encode($response);
     } else {
       $response["value"] = 0;
       $response["message"] = "Maaf Anda Sudah Mengisi Kuesoner";
       echo json_encode($response);
     }
   }
   // tutup database
   mysqli_close($con);
} else {
  $response["value"] = 0;
  $response["message"] = "oops! Coba lagi!";
  echo json_encode($response);
}
}