## autenticador-estruturas-dados
O objetivo do projeto é implementar um sistema que autentique documentos de texto utilizando estruturas de dados e funções hash.
## Etapas implementadas até agora
- Leitura de arquivo TXT utilizando Java
- Separação das linhas do texto
- Separação das palavras de cada linha
- Armazenamento das palavras em uma lista dinâmica (ArrayList)
- Estrutura inicial da Árvore AVL através da classe NoAVL
## Funcionamento atual do código
O programa lê um arquivo de texto linha por linha.  
Cada linha é separada em palavras utilizando o método `split`.  
As palavras são armazenadas em uma lista dinâmica (`ArrayList`).  
Também foi criada a estrutura base da árvore AVL através da classe `NoAVL`, que será utilizada posteriormente para armazenar as palavras.
## Próximas etapas do projeto
- Implementar a árvore AVL completa
- Inserir palavras na árvore em ordem reversa
- Ignorar palavras duplicadas
- Criar uma pilha para armazenar as árvores
- Implementar a geração de hash SHA-1
- Gerar o hash final de cada linha do documento
