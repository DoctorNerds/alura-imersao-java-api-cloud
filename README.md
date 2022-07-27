# :school: Imersão Alura em Java - Criando Stickers

Este foi o meu primeiro projeto em **Java**, no primeiro contato com a linguagem, aprendido durante a imersão feita entre os dias 18 e 22/julho de 2022 pelos instrutores Jacqueline Oliveira, Alexandre Aquiles e Paulo Silveira, da [Alura](https://www.alura.com.br/).

## :notebook_with_decorative_cover: Projeto

O objetivo é criar uma API através do banco de dados global MongoDB Atlas e compartilhar na nuvem através do Heroku.

## :open_file_folder: Resultado do projeto

As APIS gerados utilizaram as informações e imagens dos projetos educacionais da Escola Matriz como o [MatrizKIDS](https://www.instagram.com/matrizkids/), que ensina crianças a programarem utilizando o [Scratch](https://scratch.mit.edu/users/FabioMori/projects/), o [MatrizCast](https://www.youtube.com/c/MatrizCast), o podcast de educação que conecta os jovens com diversos profissionais no mercado de trabalho e o Matriz4YOU, que busca alfabetizar digitalmente pessoas com mais de 50 anos.
Segue imagens do arquivo JSON gerados localmente e também na nuvem através do Heroku.

<img src="https://user-images.githubusercontent.com/101336111/181371106-f05f102d-205c-4880-822a-c12c7d925c8a.png" width="850" height="1050"> 
<img src="https://user-images.githubusercontent.com/101336111/181371171-73a9be58-eb2f-4924-a28c-86836ca5e211.png" width="850" height="1050">

## :unlock: O aprendizado do aluno Fábio Mori
### :bulb: Conceitos e ferramentas de programação

- Web API (Applications Protocol Interface): é um serviço que conecta um aplicativo a um banco de dados, permitindo fazer requisições para ler, editar e apagar informações. Podemos pensar em uma API como uma conexão entre dispositivos e servidores, feita para facilitar o acesso aos dados. Por exemplo, através de dispositivos podemos fazer uma requisição para uma API, que por sua vez realiza um processamento no servidor onde as informações estão armazenadas, e recebe um resultado de volta. Por sua vez, a API retorna este resultado como resposta para a requisição feita do dispositivo, finalizando este ciclo de comunicação de dados. 

- Cloud Computing: é a computação na nuvem, que permite a conexão entre softwares e aplicativos, armazenando e processando dados, como APIs, através de uma conexão pela internet. 

- PaaS (Platform as a Service): é uma plataforma com infraestrutura necessária para podermos gerenciar aplicativos na nuvem (neste projeto utilizamos o Heroku).

- JSON (Java Script Object Notation): é uma forma de notação **Java Script** muito utilizada para representar banco de dados e comum para diversas linguagens. Existem algumas regras que caracterizam um arquivo JSON, como: não pode ter funções, não pode ter comentários, todo texto tem aspas duplas e as propriedades sempre tem aspas duplas também.

### :arrow_forward: Rodando o Projeto
- Primeiro você deve fazer o download das pastas do projeto através do Git ou do arquivo ZIP.
- Em seguida você poderá utilizar uma IDE, como o Visual Studio Code, para abrir a pasta do projeto.
- Para rodar o projeto e gerar os stickers, você deve compilar o arquivo ``JogosApiApplication.java`` e verificar o arquivo JSON ``http://localhost:8080/jogos``.
- Caso queira acessar o JSON através da API compartilhada na nuvem pelo [Heroku](https://dashboard.heroku.com/apps) é necessário acessar o site do programa, criar uma conta (gratuita) e seguir os passos de deploy (instruídos no site), através de um terminal, para acessar este serviço, além de alterar o arquivo ``aplication.properties`` na pasta ``resources`` para inserir a sua URL com senha (instruído no próprio site do Heroku também).
