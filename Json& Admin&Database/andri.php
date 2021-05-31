<?php
require_once('dbConnect.php');	
	
if($_SERVER['REQUEST_METHOD']=='POST') {
 
  $id = $_POST['id'];
  $password = $_POST['password'];
  
  $sql = "SELECT * FROM penganalisis where id ='$id' and password = '$password'";
  $res1 = mysqli_query($con,$sql);
  $result = array();
  if (mysqli_num_rows($res1)> 0){
  while($row = mysqli_fetch_array($res1)){
   $result[]=$row;
   }
    $_SESSION['id']=$row['0'];
 echo json_encode(array('penganalisis' =>$result,"value"=>1 ,"message"=>'sukses login!'));
			
}else {
       $response["value"] = 0;
       $response["message"] = "Username Atau Password Salah";
       echo json_encode($result);
   }
 
  mysqli_close($con);
}
