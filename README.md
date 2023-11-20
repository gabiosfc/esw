# Mabi - Documentação
Bem-vindo ao repositório do projeto Mabi!

## Descrição do Projeto
Mabi é um software desenvolvido como parte do projeto da disciplina de Engenharia de Software 3. Ele foi criado com o objetivo de atender a cafeterias, oferecendo funcionalidades tanto para clientes quanto para funcionários.

## Funcionalidades
Tela do Cliente (Cardápio): Permite que o cliente selecione produtos, indique a quantidade desejada e insira o número da mesa antes de confirmar o pedido.

Tela do Funcionário (Visualizar): Exibe informações detalhadas sobre os pedidos, incluindo ID do pedido, itens, valor total e status do pedido. Os funcionários podem alterar o status de preparando para pronto, entregue e pago.

## Configuração do Banco de Dados
Para configurar a conexão com o banco de dados, é necessário modificar as credenciais no arquivo FabricaConexao.java, localizado em Mabi/src/pacote/DAO/FabricaConexao.java. 

Certifique-se de inserir as informações corretas de usuário e senha para a sua instância do banco de dados.

## Estrutura do Repositório
- esw (Repositório): Link para o Repositório
- Mabi (Projeto):
- SQL (Diretório): Contém o arquivo SQL com a estrutura das tabelas do banco de dados.
- src (Diretório): Contém o código-fonte do projeto, desenvolvido no NetBeans utilizando JPanel e JTable.
- docs (Diretório): Documentação adicional ou diagramas UML, se houver.

## Instruções de Uso
Configuração do Banco de Dados:

Abra o arquivo FabricaConexao.java em Mabi/src/pacote/DAO/.
Modifique as credenciais de usuário e senha para refletir as configurações do seu banco de dados.

## Compilação e Execução:

Importe o projeto no NetBeans.
Compile e execute o projeto.

## Utilização:

Acesse a tela do cliente para fazer pedidos.
Utilize a tela do funcionário para visualizar e gerenciar pedidos.
