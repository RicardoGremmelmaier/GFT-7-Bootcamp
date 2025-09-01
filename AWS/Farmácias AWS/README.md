
# Relatório Técnico de Adoção de Cloud

Data: 01/09/2025
Empresa: Abstergo Industries
Responsável: Ricardo Marthus Gremmelmaier

## Introdução
A farmácia em questão atualmente **não utiliza serviços em Cloud**. O objetivo do projeto é migrar para a **AWS (Amazon Web Services)** para **reduzir custos operacionais** e **criar uma base escalável** que permita futuramente revender soluções para outras farmácias e empresas parceiras que atendem diretamente o consumidor final.  

A adoção de Cloud traz benefícios como:  
- Escalabilidade sob demanda  
- Redução de custos com infraestrutura física  
- Maior segurança e disponibilidade  
- Modelo de pagamento “pay-as-you-go”  

---

## Ferramentas/Serviços AWS Selecionados

### 1. **Amazon S3 (Simple Storage Service)**
- **Descrição:** Serviço de armazenamento de objetos altamente escalável e durável.  
- **Ganho para a farmácia:**  
  - Centralização de arquivos (notas fiscais eletrônicas, relatórios, imagens de prescrições).  
  - Backup automático e seguro sem necessidade de infraestrutura local.  
  - Compartilhamento controlado de documentos entre parceiros.  
- **Redução de custos:**  
  - Elimina a necessidade de servidores locais de armazenamento.  
  - Paga-se apenas pelo espaço utilizado.  

---

### 2. **Amazon RDS (Relational Database Service)**
- **Descrição:** Banco de dados relacional gerenciado, compatível com MySQL e PostgreSQL.  
- **Ganho para a farmácia:**  
  - Armazenamento seguro de informações de estoque, vendas e histórico de clientes.  
  - Atualizações, backups e patches automatizados.  
  - Alta disponibilidade com replicação entre zonas de disponibilidade (AZs).  
- **Redução de custos:**  
  - Diminui a necessidade de equipe especializada em manutenção de banco de dados.  
  - Elimina custos de hardware e licenciamento de servidores locais.  

---

### 3. **Amazon VPC (Virtual Private Cloud) + Security Groups**
- **Descrição:** Rede virtual privada que permite controlar a comunicação entre servidores, sistemas internos e parceiros.  
- **Ganho para a farmácia:**  
  - Segurança para dados sensíveis de clientes e fornecedores.  
  - Segmentação entre os ambientes (produção, testes, revenda).  
  - Possibilidade de integrar de forma privada com outras empresas via VPN ou Direct Connect.  
- **Redução de custos:**  
  - Evita investimentos em equipamentos de rede e firewalls locais.  
  - Uso de recursos de rede sob demanda, com escalabilidade automática.  

---

## Conclusão
Com a adoção dessas três soluções da AWS, a farmácia:  

- **Reduz custos** de infraestrutura física (servidores, redes, armazenamento local).  
- **Aumenta a segurança e disponibilidade**, garantindo continuidade de negócios.  
- **Cria uma base escalável** para oferecer serviços digitais a outras farmácias e empresas, se posicionando como **revendedora de soluções Cloud** no futuro.  
