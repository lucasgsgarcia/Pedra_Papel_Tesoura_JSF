# Pedra_Papel_Tesoura_JSF
## Atividade desenvolvida sobre JavaServer Faces (JSF) e PrimeFaces.

Utilizando beans gerenciados JSF para o processamento e páginas XHTM para a apresentação e interação com o usuário, faça uma aplicação web para o jogo pedra-papel-tesoura (Jo-Kem-Po). </br> 
A dinâmica deve ser a seguinte: </br>
Ao iniciar o jogo, o usuário escolhe uma das três opções, e clica em “Jogar!”. </br>
Na action do Bean (escopo de sessão), deve ser sorteada uma das opções de jogo, aleatoriamente (utilizar a classe Math.Random).  </br>

A página resultante deverá então mostrar as escolhas do usuário e do computador, além de escrever o resultado: </br>

“Você venceu”, “Computador venceu” ou “Empate”.  </br>

Devem ser mostradas estatísticas do jogo: número de partidas, número de vitórias para cada jogador e número de empates. </br>

Crie um bean com escopo de aplicação que guarde o nome e a pontuação dos 10 melhores jogadores.  </br>

A pontuação para entrar no ranking deve ser obtida em, no mínimo, 10 jogadas consecutivas. Deve ser registrado
o nome do jogador, o número de partidas e o número de vitórias. A classificação se dará pelo percentual de
vitórias: Ex: 15 vitórias em 20 jogos é melhor que 17 vitórias em 30 jogos. Injetar o bean nos beans de sessão,
usando CDI (@Inject).  </br>

A cada jogada, o bean de sessão deverá verificar se já foram realizadas 10 jogadas ou mais. Se sim, chamar um
método o bean de aplicação ser chamado um método que verifique se o percentual de vitórias atual pode entrar
no ranking. Se sim, deve ser mostrada uma interface para o usuário informar seu nome, se ainda não foi
informado. Na tela de respostas, incluir uma mensagem se o jogador entrou no ranking. </br>

Sugestões: pode-se solicitar o nome do jogador antes de iniciar o jogo, para simplificar a inclusão no ranking.
Pode-se colocar um botão para ver o ranking atual (mostrar a lista do bean de aplicação).
