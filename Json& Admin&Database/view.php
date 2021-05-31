<?php
require_once('dbConnect.php');
if($_SERVER['REQUEST_METHOD']=='GET') {
  $sql = "SELECT * FROM k_control";
  $res = mysqli_query($con,$sql);
  $result = array();
  while($row = mysqli_fetch_array($res)){
    array_push($result, array('id_kuisioner'=>$row[0], 'kuisioner'=>$row[1]));
  }
  echo json_encode(array("value"=>1,"result"=>$result));
  mysqli_close($con);
}