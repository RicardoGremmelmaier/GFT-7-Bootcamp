## API - Application Programming Interface

* São "formas", "contratos" padronizados para servir dados para outras aplicações. É uma interface de programação de aplicativos.
    * `Programação de aplicativos` -> Criar uma solução que sirva e atenda problemas de algum negócio.
    * `Interface` -> É um contrato, algo que deve ser seguido ou implementado pelos dois lados.
    * `API` -> Aplicação que foi programada para servir dados para um negócio seguindo padronização de um tipo de contrato de programação. Ou seja, é uma aplicação para servir dados de maneira padronizada seguindo algum protocolo de comunicação.
* Ela possui diversas características gerais, entre elas podemos citar
    * `Protocolo de comunicação rígido`: tanto para **responder (response)** coisas, como para **requisições (request)**
    * `Sempre retorna um conteúdo`: depende do protocolo, por exemplo o HTTP serve um conteúdo que contém um **header** e um **content**. Segue os padrões desse protocolo.
    * `Padrões de arquitetura`: O **REST** é um desses padrões de arquitetura.

### REST - Representational State Transfer

* Na tradução literal, é a Transferência de Estado Representacional.
    * `Representational State` -> O conteúdo que tem dentro de algum lugar em um certo tempo (variável, objeto, arquivo, etc.).
    * `Transfer` A transferência desse estado.
* Ela também possui algumas características marcantes
    * `Arquitetura baseada em cliente-servidor`: como por exemplo o **HTTP**.
    * `Comunicação stateless`: comunicação sem estado, ou seja, cada transação é efetuada de forma independente, sem que o servidor guarde informações sobre requisições anteriores ou o estado da sessão do cliente.
    * `Possibilidade de cache`: armazenamento de um estado por um Proxy a fim de evitar reprocessamento e envio mais rápido desse estado.
    * `Interface uniforme`: seu contrato é uniforme, coerente e segue padrões de retorno.
    * `Sistema de camadas`: deve manter uma organização de estrutura, ou seja, dentro de uma subpasta só pode ter serviços relacionados (coesão).
*  Caso a API siga todas essas características, ela será uma **API RESTFUL**.