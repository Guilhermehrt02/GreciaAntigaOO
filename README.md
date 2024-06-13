# Simulação da Grécia Antiga

Este projeto é uma simulação de um ambiente na Grécia Antiga, utilizando diversas classes para representar elementos históricos e sociais. O projeto foi desenvolvido em Java e emprega vários padrões de design para simular a dinâmica da sociedade grega antiga.

## Estrutura do Projeto

O projeto contém as seguintes classes principais:

- `App`: Classe principal que inicializa e executa a simulação.
- `Atenas`: Representa a pólis de Atenas.
- `Esparta`: Representa a pólis de Esparta.
- `Esparciata`, `Escravo`, `Eupatrida`, `HomemAdulto`: Classes que representam diferentes tipos de habitantes na Grécia Antiga.
- `Democracia`: Classe que simula o sistema democrático de Atenas.
- `PolisGrega`: Classe abstrata que representa uma pólis grega genérica.
- `Atacar`, `Defender`, `LigaDelos`, `LigaPeloponeso`: Classes que representam a guerra e alianças militares.

## Diagrama

O diagrama de classes do projeto pode ser visualizado no arquivo `ProjetoFinal.dia`. Este diagrama fornece uma visão geral das relações entre as classes e a estrutura geral do projeto.

## Como Executar

1. **Compilação**:
   - Certifique-se de ter o JDK (Java Development Kit) instalado.
   - Compile as classes Java. No terminal, navegue até o diretório do projeto e execute:
     ```bash
     javac -d bin src/greciaAntiga/*.java
     ```

2. **Execução**:
   - Após a compilação, execute o programa principal:
     ```bash
     java -cp bin greciaAntiga.App
     ```

## Padrões de Design Utilizados

O projeto utiliza vários padrões de design:

- **Cadeia de Responsabilidade**: Implementado na hierarquia de classes relacionadas à votação e democracia.
- **Estratégia**: Usado na classe `PolisGrega` para definir diferentes abordagens de educação.
- **Mediador**: Aplicado nas classes relacionadas à guerra entre as Ligas de Delos e do Peloponeso.


