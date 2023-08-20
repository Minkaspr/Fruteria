<%-- 
    Document   : index
    Created on : 09-ago-2023, 18:49:39
    Author     : MinKaspr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="assets/favicon-32x32.png">
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.8/css/line.css">
    <link rel="stylesheet" href="css/index.css">
    <title>Frutería</title>
</head>
<body>
    <header class="container">
        <div class="container-head">
            <a href="#" class="logo">Fruteria Mk</a>
            <nav class="navbar">
                <a href="#">Inicio</a>
                <a href="#">Frutas</a>
                <a href="#">Contacto</a>
            </nav>
        </div>
    </header>
    <main>
        <div class="container-main">
            <section class="information">
                <div class="slogan">
                    <p>¡Bienvenido a la <strong>Frutería del Sabor!</strong> 🍉😋</p>
                <div class="portada">
                    <img class="imgPortada" src="assets/portada.png" alt="Imagen de Portada">
                </div>
            </section>
            <section class="table">
                <div class="top-title">
                    <h2>Tabla de Frutas</h2>
                </div>
                <div class="wrap-input">
                    <input type="text" class="search">
                </div>
                <div class="wrap-option">
                    <div class="add">
                        <i class="uil uil-plus"></i>
                        <a href="#">Agregar</a>
                    </div>
                    <div class="delete">
                        <i class="uil uil-trash"></i>
                        <a href="#">Eliminar</a>
                    </div>
                </div>
                <div class="wrap-title">
                    <div><input type="checkbox" name="" id=""></div>
                    <div class="id center">#</div>
                    <div class="fruit center">
                        <h4>Fruta</h4>
                    </div>
                    <div class="quantity center">
                        <h4>Cantidad</h4>
                    </div>
                    <div class="price center">
                        <h4>Precio</h4>
                    </div>
                    <div class="operation center">
                        <h4>Operaciones</h4>
                    </div>
                </div>
                
                <div class="wrap-item">
                    <div><input type="checkbox" name="" id=""></div>
                    <div class="id">1</div>
                    <div class="fruit">
                        <p>Mandarina</p>
                    </div>
                    <div class="quantity">
                        <p>30 kg</p>
                    </div>
                    <div class="price">
                        <p>S/ 3.00</p>
                    </div>
                    <div class="edit">
                        <div class="edit-content">
                          <i class="uil uil-edit"></i>
                          <a href="#">Editar</a>
                        </div>
                      </div>
                      <div class="remove">
                        <div class="remove-content">
                            <i class="uil uil-trash-alt"></i>
                          <a href="#">Eliminar</a>
                        </div>
                      </div>
                </div>

                <div class="wrap-item">
                    <div><input type="checkbox" name="" id=""></div>
                    <div class="id">1</div>
                    <div class="fruit">
                        <p>Mandarina</p>
                    </div>
                    <div class="quantity">
                        <p>30 kg</p>
                    </div>
                    <div class="price">
                        <p>S/ 3.00</p>
                    </div>
                    <div class="edit">
                        <div class="edit-content">
                          <i class="uil uil-edit"></i>
                          <a href="#">Editar</a>
                        </div>
                      </div>
                      <div class="remove">
                        <div class="remove-content">
                            <i class="uil uil-trash-alt"></i>
                          <a href="#">Eliminar</a>
                        </div>
                      </div>
                </div>

                <div class="wrap-item">
                    <div><input type="checkbox" name="" id=""></div>
                    <div class="id">1</div>
                    <div class="fruit">
                        <p>Mandarina</p>
                    </div>
                    <div class="quantity">
                        <p>30 kg</p>
                    </div>
                    <div class="price">
                        <p>S/ 3.00</p>
                    </div>
                    <div class="edit">
                        <div class="edit-content">
                          <i class="uil uil-edit"></i>
                          <a href="#">Editar</a>
                        </div>
                      </div>
                      <div class="remove">
                        <div class="remove-content">
                            <i class="uil uil-trash-alt"></i>
                          <a href="#">Eliminar</a>
                        </div>
                      </div>
                </div>
            </section>
        </div>
    </main>
</body>
</html>