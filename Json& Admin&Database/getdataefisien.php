<?php
require_once('dbConnect.php');
if($_SERVER['REQUEST_METHOD']=='GET') {
  $sql = "SELECT * FROM k_efisien ";
  $res = mysqli_query($con,$sql);
  $result = array();
  if (mysqli_num_rows($res)> 0){
  while($row = mysqli_fetch_array($res)){
   $result[]=$row;
   }
   echo json_encode(array('k_efisien' =>$result));
   }
 
  mysqli_close($con);
}