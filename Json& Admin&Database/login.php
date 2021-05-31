<?php
require_once('dbConnect.php');	
	
if($_SERVER['REQUEST_METHOD']=='POST') {
  $response = array();
  $id = $_POST['id'];
  $password = $_POST['password'];
  
  $sql = "SELECT * FROM penganalisis where id ='$id' and password = '$password'";
  $res = mysqli_fetch_array(mysqli_query($con,$sql));
  $res1 = mysqli_query($con,$sql);
  if(isset($res)){
	   while($row = mysqli_fetch_array($res1)){
    array_push($response, array('id'=>$row[0], 'nama'=>$row[1],'password'=>$row[2]));
    $_SESSION['id']=$row['0'];
 echo json_encode(array("value"=>1 ,"message"=>'sukses login!',"result"=>$response));
			}
}else {
       $response["value"] = 0;
       $response["message"] = "Username Atau Password Salah";
       echo json_encode($response);
   }
 
  mysqli_close($con);
}