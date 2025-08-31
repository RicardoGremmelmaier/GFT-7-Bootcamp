## Introdução ao conceito de Cloud

### O que é Cloud computing?

Antes da Cloud, a arquitetura era modelo Cliente/Servidor, os ambientes eram on-premises e existia virtualização. Ou seja, nao é escalável devido aos altos preços.

Cloud Computing é a entrega de recursos de TI – como servidores, armazenamento, bancos de dados e software – pela Internet, sob demanda e com pagamento conforme o uso. Em vez de possuir e manter infraestruturas físicas, as empresas e indivíduos podem aceder a estes serviços através de um provedor de nuvem, pagando apenas pelos recursos que utilizam. 

Como funciona?
1. **Recursos Remotos**:
A computação em nuvem utiliza uma vasta rede de servidores remotos hospedados na Internet. 
2. **Acesso "Sob Demanda"**:
Os utilizadores acedem a esses recursos, como poder de processamento e espaço de armazenamento, pela Internet, sem a necessidade de infraestrutura local. 
3.**Provedores de Nuvem**:
Empresas como a Amazon Web Services (AWS) ou a Microsoft Azure gerem os servidores, cuidando da manutenção, segurança e atualizações dos sistemas. 
4. **Pagamento por Uso**:
A grande vantagem é a flexibilidade e a economia, pois paga-se apenas pelo que se consome. 

Vantagens da Cloud Computing

* **Economia de Custos**:
Reduz drasticamente os custos com a compra e manutenção de servidores e infraestruturas físicas. 
* **Flexibilidade e Escalabilidade**:
Permite ajustar os recursos de TI de acordo com a necessidade do negócio, aumentando ou diminuindo a capacidade de forma rápida. 
* **Acesso Remoto**:
Os dados e as aplicações podem ser acedidos de qualquer lugar do planeta através da Internet. 
* **Foco na Inovação**:
As empresas podem concentrar-se nas suas atividades principais, delegando a gestão da infraestrutura de TI aos provedores de nuvem. 


Existem diferentes tipos de serviços de cloud computing, incluindo: 
* **Infraestrutura como Serviço (IaaS)**:
Fornece recursos básicos de infraestrutura, como servidores virtuais e armazenamento. 
* **Plataforma como Serviço (PaaS)**:
Oferece uma plataforma para desenvolver, executar e gerir aplicações sem se preocupar com a infraestrutura. 
* **Software como Serviço (SaaS)**:
O software é entregue pela Internet, com exemplos como e-mail corporativo e ferramentas de colaboração.

Existem também os **modelos de implantação**, que se relacionam com como os recursos de computação estão estruturados e distribuídos, ou seja, onde o serviço está implantado. Eles podem ser **On-premise**, **Hybrid** ou **Cloud**, onde On-premise é todo o ambiente local, Hybrid possui tanto local quanto remoto, enquanto Cloud possui tudo remoto.

## Infraestrutura Global AWS

É uma infraestrutura de datacenters em todo o mundo que fornecem serviços que você pode uilizar na AWS. É composto por **Regiões** e **Zonas de disponibilidade**. Algumas de suas vantagens é a alta disponibilidade e a tolerância a falhas.

Cada uma dessas regiões possuem os locais isolados chamados de Zonas de Disponibilidade. Todas as regiões são conectadas com rede de alta velocidade. Além disso, possui o isolamento de dados e a regulação de dados local (LGPD, por exemplo).

As zonas são um agrupamento de datacenters isolados dentro de uma região, possuindo rede, energia e conectividade redundantes. São próximas o suficiente para manter baixa latência, porém longe o suficiente para que um desastre afete mais de uma Zona. É recomendado que execute pelo menos em duas AZs.

**Os pontos de presença**, também chamados de locais de borda, funcionam como pontos específicos pelo globo para distribuir conteúdo de forma rápida. Alguns exemplos de serviços que se encontram nos locais de borda são **Cloud Front** e **Route53** (Como um "Proxy").

Para interagir com os serviços AWS, podemos seguir por um **console de gerenciamento**, um **AWS CLI** e um **SDK**. O Console de gerenciamento é via portal web, com usuário e senha, tendo acesso aos serviços. O CLI é um terminal baixado na AWS, exige um pouco mais de conhecimento sobre os comandos que podem ser utilizados. Os SDKs é um jeito de uma aplicação acessar o recurso AWS de forma automatizada, como por exemplo uma API ou um microsserviço.

## Computação em Cloud

* Elastic Compute Cloud - EC2
    * Capacidade computacional segura e redimensionável
    * Computação: CPU, memória, rede, armazenamento, SO
    * Definição de preço conforme uso e modalidades específicas de necessidade
    * Instância com tipos otimizados para sua atividade
    * Chamamos de instância as máquinas do EC2, ou seja, um servidor virtual na AWS que possui configurações específicas.