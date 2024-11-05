# Recursion | 🃏 Blackjack

## Historia de Usuario

Como usuario, quiero participar en un juego interactivo de Blackjack donde pueda decidir si seguir jugando o plantarme usando 1 para pedir carta y 0 para plantarme. El juego debe seguir las reglas básicas del Blackjack y avisarme si gano, pierdo o empato contra el dealer.



## Reglas basicas del Blackjack 

- Objetivo del juego:
  - Conseguir un total de puntos lo más cercano posible a 21 sin pasarse.
- Valor de las cartas:
  - Las cartas numeradas (2-10) valen su valor nominal.
  - Las figuras (J, Q, K) valen 10 puntos.
  - El As vale 1 punto o 11 puntos, dependiendo de cuál sea más beneficioso.
- Cómo se juega:
  - El jugador y el dealer reciben dos cartas iniciales.
  - El jugador decide si sigue pidiendo cartas (1) o se planta (0).
  - Si el jugador supera los 21 puntos, pierde automáticamente.
  - Gana el que tenga la puntuación más cercana a 21 sin pasarse.

## Detalles a tener en cuenta

- Siempre empieza el jugador, una vez finalice su turno es turno del dealer (automático).
- El dealer siempre debe jugar a ganar, es decir tener al menos el mismo puntaje que el jugador.
- La estrategia esta en generar recursivamente las funciones para el juego del jugador y el dealer.
- El 1(AS) se tomara como el mejor valor sin pasarse de 21 posible.
