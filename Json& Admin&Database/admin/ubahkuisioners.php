  <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>UBAH DATA</title>
	<!-- BOOTSTRAP STYLES-->
    <link href="css2/bootstrap.min.css" rel="stylesheet" />
 <?php
	$koneksi=mysql_connect("localhost","id13818931_analisis1","t!smi9wo&sKgxu}D");
	mysql_select_db("id13818931_analisis",$koneksi);
	$isi=$_GET['id_kuisioner'];
	$cari=mysql_query("select * from k_servis where id_kuisioner='$isi'");
	$data=mysql_fetch_array($cari);
?>   

<div class="container register">
                <div class="row">
                    <div class="col-md-3 register-left">
                    </div>
                    <div class="col-md-9 register-right">
                        <ul class="nav nav-tabs nav-justified" id="myTab" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">UBAH</a>
                            </li>
                            
                        </ul>
                        <div class="tab-content" id="myTabContent">
                            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                <h3 class="register-heading">UBAH DATA</h3>
                                <div class="row register-form">
                                    <div class="col-md-6">
									<form method="POST" action="s_ubahkuisioners.php" name="form1">
                                     
                                        <div class="form-group">
                                            <input type="text" class="form-control"  value="<?php echo $data['id_kuisioner'];?>" name="id_kuisioner"/>
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control"    value="<?php echo $data['kuisioner'];?>" name="kuisioner"/>
                                        </div>
									
                                    </div>
										
                                        <input type="submit" class="btnRegister"  value="SIMPAN"/>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>