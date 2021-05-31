<?php
require_once('dbConnect.php');
if($_SERVER['REQUEST_METHOD']=='GET') {
  $sql = "SELECT SUM(ek) FROM s_ekonomi";
  $res = mysqli_query($con,$sql);
  $result = array();
  if (mysqli_num_rows($res)> 0){
  while($row = mysqli_fetch_array($res)){
   $result[]=$row;
   }
   echo json_encode(array('s_ekonomi' =>$result));
   }
 
  mysqli_close($con);
}
