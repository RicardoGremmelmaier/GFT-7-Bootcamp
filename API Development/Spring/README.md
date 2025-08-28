## Fundamentos do Spring Framework

* O que é?

    * É um framework open source desenvolvido para plataforma java baseado nos padrões de projetos inversão de controle e injeção de dependência. 
    * É composto por módulos afim de `reduzir a complexidade` no desenvolvimento
    * Alguns desses módulos são: 

    ![alt text](image.png)

* Spring x Java EE

    * Java EE tem muito mais verbosidade e burocracia comparado ao Spring antigamente, sendo então mais simples e fácil de usar o Spring

* Conceito de inversão de controle

    * Trata-se do redirecionamento do fluxo de execução de um código retirando parcialmente o controle sobre ele e delegando-o para um container -> `minimizar o acoplamento do código`

    ![alt text](image-1.png)

* Injeção de dependências

    * Padrão de desenvolvimento com a finalidade de manter baixo o nível de acoplamento entre módulos de um sistema.

    ![alt text](image-2.png)

* Beans / AutoWired / Scopes

    * Beans é um objeto que é instanciado, montado e gerenciado por um container através da inversão de controle.
    * Possuimos 5 tipos de conceitos diferentes : **Singleton, Prototype, Request, Session, Global**, onde os 3 últimos são do contexto HTTP.
        * Singleton: o conteiner do IOC define apenas uma instância do objeto.
        * Prototype: será criado um novo objeto a cada solicitação ao container.
        * HTTP Request: um bean será criado para cada requisição HTTP.
        * HTTP Session: um bean será criado para cada sessão de usuário.
        * HTTP Global: um bean será criado para o ciclo de vida do contexto da aplicação.
    * Autowired: uma anotação onde deverá ocorrer uma injeção automática de dependência.
        * byName: buscado um método set que corresponde ao nome do Bean.
        * byType: considerado o tipo da classe para inclusão do Bean.
        * byConstructor: usamos o construtor para incluir a dependência.

## Springboot

* O que é?

    * Diferente do Spring, que foca no padrão de injeção de dependências, o Springboot foca na configuração automática.
    * Antes dele, a dependência era individual, com alta verbosidade, incompatibilidade de versões, complexidade de gestão e configurações complexas e repetitivas.
    * Como a maior parte das configurações necessárias para o início de um projeto são sempre as mesmas, ele inicia um projeto com essas configurações já definidas.

* Starters

    * São descritores de dependência que reduzem em maior parte as dependências do arquivo, condensando-as.
    * Entre os benefícios temos: aumento da coesão, as versões ficam compatíveis, otimização do tempo, configuração simples e foco no negócio.

* Principais Starters
    * Spring-boot-starter-*
        * `data-jpa`: integração ao banco de dados via JPA - Hibernate
        * `data-mongodb`: interação com banco de dados MongoDB
        * `web`: inclusão do container Tomcat para aplicações REST
        * `web-services`: Webservices baseados na arquitetura SOAP
        * `batch`: Implementação de JOBs de processos
        * `test`: disponibilização de recursos para testes unitários como o JUnit 
        * `openfeign`: client HTTP baseado em interfaces
        * `actuator`: gerenciamento de monitoramento da aplicação

###