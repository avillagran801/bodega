# Proyecto Semestral. Grupo 18.

• En panel central se muestra una de dos vistas posibles: en una se debe 
mostrar toda la bodega en vista aérea, en la otra, en vista lateral se 
muestra sólo el estante o deposito que esta frente del carro móvil que 
recorre el pasillo retirando robóticamente los objetos que se le ordenen 
para despacho. Los objetos deben moverse del depósito al móvil de 
manera automática, cuando el carro está detenido. El carro se mueve en 
forma continua y se detiene en los estantes programados.

• El usuario debe poder elegir un conjunto de productos para cada viaje de 
un carro, pero el sistema debe localizar el estante y compartimento donde 
se encuentran. El móvil se debe desplazar y recibir como carga los objetos 
y llevarlos al lugar de entrega, y dejarlo en un mesón, desde el cual 
desaparecen cuando se inicia otra petición. La lista de productos se elige 
mediante controles GUI. La vista lateral y aérea se ve en dos paneles en el 
centro de la ventana. El movimiento debe ser continuo y genero por timer. 
Las rutas deben ser creadas mediante un conjunto de líneas Polygon 
(generadas por RellenaConPuntos y Angular), el carro debe tomar el 
ángulo de la pista y debe notarse cuál es la pare anterior y posterior del 
carro. 
