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
----------------------------------------------------------------------------------------------

                Projeto_integrador_UCS 2ª etapa
  Na segunda etapa do projeto serão incluídas novas características à estrutura do projeto
da primeira etapa, integrando outros elementos que compõem o modelo de objetos e recursos
da linguagem Java. Para isso realize as duas ações abaixo:

    Ação 1 : sobrescreva os métodos “toString” e “equals” para as classes Musica e Playlist.
    Use “toString” na implementação dos itens de consulta de Musica e Playlists no projeto.
    
  No modelo de objetos implementado em Java, todas as classes são sempre, por
definição, subclasses da classe Object. Isso significa que, se você não incluir uma superclasse
na implementação, sua classe, automaticamente, vai assumir “extends Object”.

  Assim todos os objetos instanciados em Java irão sempre herdar métodos presentes na
superclasse Object. Alguns destes métodos estão lá para serem sobrescritos! Dois deles são os
métodos “toString” e “equals”.

     Assinatura do método “toString” : String toString()
O método retorna uma representação do Objeto como um String.
A implementação de toString() herdada da classe Object produz um String padrão que envolve
a referência do objeto e o nome de sua classe. Mas podemos sobrescrever este método
produzindo um String mais significativo para objetos de uma determinada classe.
Por exemplo, um objeto Musica, embora tenha vários atributos, poderia ser representado
somente pelo nome ou pela junção do nome da música e do nome do artista (uma
implementação de toString() na classe Musica retornaria este String)

    Assinatura do método “equals” : boolean equals(Object outro)
Um uso típico de equals poderia ser (para o caso de termos dois objetos nas variáveis objeto1 e
objeto2)
  objeto1.equals(objeto2)
  
  Neste caso o método “equals” deve retornar true se objeto1 e objeto2 são iguais, e false caso
contrário.

     Observações:
  ● Nesta situação, como objeto1 é o receptor da mensagem, na implementação de equals
temos acesso a ele usando a variável this.

  ● Já o objeto2 estará na variável que é o parâmetro do método.
A implementação padrão do método “equals” na classe Object decide se objeto1 e objeto2 são
iguais comparando as referências que estão nessas duas variáveis (ou seja, verifica se temos o
mesmo objeto nas duas variáveis).
Quando sobrepomos “equals” em uma classe, no entanto, podemos também verificar se a
estrutura deles é a mesma, comparando seus atributos. Para um objeto do tipo Música, por
exemplo, poderíamos, na implementação de equals, verificar se os principais atributos dos dois
objetos são iguais: nome da música; Cantor/Cantora; Banda/Grupo.

    Ação 2 : Use o mecanismo de Exceções para tratar 2 situações específicas no projeto.
Mecanismo de tratamento de exceções estão presentes no framework de muitas linguagens de
programação. Em Java, o mecanismo envolve o uso de objetos que representam a exceção que
deve ser tratada.

Implemente, no projeto, o tratamento das seguintes situações usando o mecanismo de
tratamento de exceções:

- Ao inserir um objeto Musica em uma ListaDeMusica, se já há, na lista, outro objeto
Musica igual ao que está sendo inserido, jogue a exceção ExcecaoDeMusicaJaExistente
- Ao remover um objeto Musica de uma ListaDeMusica, se o objeto não é encontrado na
lista, jogue a exceção ExcecaoDeMusicaNaoEncontrada

  Observação: use sua implementação de “equals” na classe Musica para verificar as situações
de exceção!
Você deve fazer também o tratamento adequado das exceções nas situações em que elas podem
acontecer. Ou seja, quando os métodos de inserção e remoção de ListaDeMusica são utilizados,
devem estar em um bloco try{} que implementa os catch() adequados.
