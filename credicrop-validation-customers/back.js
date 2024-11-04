document.getElementById('miFormulario').addEventListener('submit', function(event) {
    event.preventDefault(); // Evita el envío del formulario

    // Obtiene el valor ingresado
    const dato = document.getElementById('dato').value;

    // Procesa la respuesta
    const respuesta = `Has ingresado: ${dato}`;
    
    // Muestra la respuesta en el div
    document.getElementById('respuesta').innerText = respuesta;
});
