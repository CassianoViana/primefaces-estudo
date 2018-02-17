* Pode utilizar o banco de dados da sua preferência (se for possível, utilizar postgresql), basta citar no email resposta qual foi o banco utilizado.

1. Crie a tabela chamada Lancamento, contendo os seguintes atributos:
- oid (pk, int)
- dt_inicial (datetime)
- dt_final (datetime)
- vl_total (numeric (8,2))
- observacao (varchar(1000))

2. Crie a tabela chamada Item, contendo os seguintes atributos:
- oid (pk, int)
- descricao (varchar(255))
- valor (numeric(8,2))

3. Crie uma tabela intermediaria entre Lancamento e Item, chamada LancamentoItem, para armazenar o relacionamento entre as tabelas.
- oid_lancamento (fk, int) 
- oid_item (fk, int) 


Enviar os scripts sql de criação das tabelas dos itens 1, 2 e 3. 
====================================================================

4. Crie um projeto Java Web, contendo as camadas MVC.

5. Na camada de Modelo, deve-se mapear as classes de Lancamento e Item, fazendo uso de annotations do Hibernate.

6. Na camada de View, deve-se fazer uso de JSF com Primefaces.

6.a - Criar uma CRUD para cadastrar itens, podendo informar a descrição e o valor. O campo oid deve ser populado através de uma sequence. Exemplo:

Oid:
1
Descrição:
[xxxxxxxxxxxxxxxxxxxxxxxxxxxx]
Valor:
[R$ 000.000,00]

6.b - Criar uma CRUD para cadastrar lançamentos, podendo informar as datas inicial e final (a mascara das datas serão distintas), e o campo de observacao. O campo oid deve ser populado através de uma sequence. Deve-se ainda na mesma tela, permitir vincular N itens, criando assim uma mestre X detalhe. O campo total é somente leitura, e deve ser populado com o valor total dos itens vinculados ao lançamento. Exemplo:

Oid:
5
Data inicial:
[29/02/2016] 
Data final:
[Ter 15/03/16]
Observação:
[xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx]
Itens:
	1 - aaaaaaaaaaaaa - R$ 10,00 x (opção para remover o item do lançamento)
	4 - bbbbbbbbbbbbb - R$ 18,50 x
	9 - ccccccccccccc - R$ 30,00 x
	6 - ddddddddddddd - R$ 19,99 x
Total:
R$ 78,49

7. A regra de negócio do valor total, deve ser mantida na camada de Controle.

8. Criar uma tela chamada Intersecao, que receba 2 intervalos e retorne uma mensagem em tela informando se existe ou não interserção entre os intervalos. 

Exemplo a):

Faixa 1:
[10] - [25]
Faxai 2: 
[20] - [30]

[Botão CONSULTAR]
Mensagem: Existe interseção entre as faixas 1 e 2.

Exemplo b):
Faixa 1:
[55] - [88]
Faxai 2: 
[12] - [40]

[Botão CONSULTAR]
Mensagem: Não há interseção entre as faixas 1 e 2.

9. Criar uma classe na camada de Controle chamada Primos, contendo o método main que imprima todos os números primos entre 41 e 5002.

10. Fazer uma consulta para somar o total dos lançamentos, cujo a média dos itens foi maior ou igual à R$ 100,00.

11. Fazer uma consulta para trazer os 10 lançamentos que possuam o maior valor de itens e tenham a descrição começando com a letra A. Sendo que só devem mostrar lançamentos no qual o somatório desses itens sejam maiores que R$ 50,00.

12. Crie um script para selecionar todos os lançamentos que possuam mais que 10 itens e alterar a observação dos lançamentos selecionados anteriormente concatenando a observação atual com a seguinte texto ("- Possuem mais que 10 itens").

Zipar o projeto criado, junto com os scripts sql e as bibliotecas (jars) terceiros. 
========================================================================================
