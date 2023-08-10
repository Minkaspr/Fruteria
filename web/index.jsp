<%-- 
    Document   : index
    Created on : 09-ago-2023, 18:49:39
    Author     : MinKaspr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Frutería</title>
        <link rel="stylesheet" href="css/index.css">
        <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.8/css/line.css">
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
                        <h3>¡Bienvenido/a a la Frutería del Sabor! :)</h3>
                    </div>
                    <div class="portada">
                        <img class="imgPortada" src="assets/portada.jpg" alt="Imagen de Portada">
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
                        <div class="id">1</div>
                        <div class="fruit">
                            <h4>Mandarina</h4>
                        </div>
                        <div class="quantity">
                            <h4>30 kg</h4>
                        </div>
                        <div class="price">
                            <h4>S/ 3.00</h4>
                        </div>
                        <div class="edit">
                            <h4>Editar</h4>
                        </div>
                        <div class="remove">
                            <h4>Eliminar</h4>
                        </div>
                    </div>
                </section>
            </div>
        </main>
    </body>
</html>
