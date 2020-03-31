# Projeto_integrador_UCS

Projeto_integrador_UCS 1ª etapa.

No Projeto Integrador do quinto módulo vamos empregar os conhecimentos
desenvolvidos nas disciplinas de Programação Orientada a Objetos (POO) e Estruturas de
Dados (ED). A disciplina de Programação Orientada a Objetos envolve aprendizagem de
programação de computadores no estilo Orientado a Objetos (ou o “modelo de objetos”), um
estilo de programação bastante difundido em todas as áreas de desenvolvimento de software

Primeira Etapa do Projeto Integrador

                          Cenário de Implementação

O grupo deve desenvolver um sistema computacional interativo implementando
funcionalidades para apoiar a organização de uma biblioteca de música. O programa deve
oferecer facilidades para catalogar músicas, bandas e organizar playlists (listas de música para
tocar).
A implementação é uma simulação e não pressupõe a manipulação de arquivos de
mídia!

                          Orientações para a Primeira Etapa

Inicialmente é importante lembrar que um objetivo central do projeto é o de
desenvolver habilidades de programação no modelo Orientado a Objetos. Portanto o grupo
deve, necessariamente, desenvolver uma solução Orientada a Objetos para o problema e
implementá-la adequadamente na linguagem de programação Java. Soluções para o problema
usando outros estilos de programação (p.ex.: procedural) não serão consideradas.
Na primeira etapa do projeto o grupo deve desenvolver um programa que permite a
interação com o usuário para cadastrar e consultar informações sobre as músicas, bandas e/ou
artistas, e Playlists. Os dados serão organizados, inicialmente, apenas na memória do
computador usando Estruturas de Dados bem definidas (dentre aquelas discutidas na
disciplina Estruturas de Dados).

Os dados mínimos sobre uma música que devem ser informadas pelo usuário são:
● Nome da música
● Cantor/Cantora
● Banda/Grupo
● Nome do álbum (se houver)
● Gênero da música
● Ano do lançamento

Músicas devem ser representadas, no programa, como objetos!

O programa deve permitir o cadastramento de músicas usando um menu de opções e
solicitando os dados (note que, eventualmente, alguns dos dados podem não estar
disponíveis!). Não é necessário implementar uma interface gráfica.
Além do cadastramento, o programa deve permitir também que o usuário realize
consultas sobre as músicas cadastradas:

1. Apresentar os nomes das músicas em ordem alfabética de nome
2. Apresentar os nomes das músicas de um determinado gênero
3. Apresentar os nomes das músicas de uma determinada banda
4. Apresentar os nomes das músicas lançadas em um determinado intervalo de
anos
5. Apresentar os nomes das Playlists cadastradas
6. Apresentar os nomes das músicas incluídas em uma Playlist

O programa deve também oferecer a possibilidade de criar Playlists. Uma Playlist tem
dois elementos associados a ela: 

➔ nome da Playlist
➔ lista de músicas que compõem a Playlist

Playlists devem ser representadas, no programa, como objetos!
Deve ser possível criar Playlists de duas maneiras:

1. O usuário informa o nome da Playlist e a quantidade de músicas, e o programa
seleciona, aleatoriamente, as músicas que estarão na Playlist.
2. O usuário informa o nome da Playlist e informa também os nomes das músicas
que deverão estar nela.

Os objetos que representam Músicas e Playlists devem estar organizados em listas. A
linguagem Java, assim como outras linguagens de programação, disponibiliza classes que
implementam listas. No entanto, como parte do processo de aprendizagem neste módulo, as
listas deverão ser implementadas pelo próprio grupo seguindo as especificações abaixo.
Para a implementação das listas podem ser utilizados arrays.

Classe : ListaDeMusica
Funcionalidade:
  incluirNoInicio(Musica) // inclui uma música no início da lista
  incluirNoFim(Musica) // incluir uma música no final da lista
  incluirEmOrdem(Musica) // inclui uma música na lista mantendo a
      // ordem alfabética de nome
  Musica removerDoInicio() // remove uma música do início da lista e retorna
      // a música removida
  Musica removerDoFim() // remove uma música do final da lista e a retorna
  int tamanho() // retorna a quantidade de músicas na lista
  Musica get(int) // retorna a música que está na posição da
      // lista indicada no argumento
      
Classe : ListaDePlaylists
Funcionalidade:

  incluirNoInicio(Playlist) // inclui uma playlist no início da lista
  incluirNoFim(Playlist) // incluir uma playlist no final da lista
  incluirEmOrdem(Playlist) // inclui uma playlist na lista mantendo a
    // ordem alfabética de nome
  Playlist removerDoInicio() // remove uma playlist do início da lista e retorna
    // a playlist removida
  Playlist removerDoFim() // remove uma playlist do final da lista
    // e a retorna
  int tamanho() // retorna a quantidade de playlists na lista
  Playlist get(int) // retorna a playlist que está na posição da lista
    // indicada no argumento
    
    Material a ser entregue:
- O programa Java que implementa uma solução para o problema proposto.

    Objetivos
O objetivo geral do Projeto Integrador III-A é o de desenvolver uma aplicação desktop
simples, utilizando uma linguagem de programação Orientada a Objetos (neste módulo
usaremos a linguagem de programação Java), na qual são explorados também conceitos de
Estruturas de Dados.

Objetivos específicos:

- analisar e compreender o problema proposto;
- discutir em grupo possíveis soluções;
- desenvolver habilidades para usar o material didático e a aprendizagem
desenvolvida com os exercícios das Unidades de Aprendizagem de
Programação Orientada a Objetos e Estruturas de Dados para organizar um
programa de computador capaz de expressar a solução proposta;
- desenvolver uma solução “Orientada a Objetos” para o problema;
- propor uma estratégia para estruturar a solução em um programa Java;
- Implementar, testar e documentar o programa Java;
- organizar um relatório descrevendo o resultado final do projeto, dificuldades
encontradas e soluções propostas.
