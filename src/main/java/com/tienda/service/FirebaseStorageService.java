
package com.tienda.service;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-bc679.firebasestorage.app";

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "techshop/csamuels00989";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-bc679-firebase-adminsdk-fbsvc-a52b9a5562.json";
}