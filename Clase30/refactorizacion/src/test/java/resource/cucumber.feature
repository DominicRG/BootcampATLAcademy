Feature: Juego del ahorcado

  Scenario: Ocultar la palabra correctamente
    Given la palabra codigo
    When inicia el juego
    Then verificar que se oculta correctamente como ______