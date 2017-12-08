# AV2 -Sistemas de Informação

Com base nas aulas e no
exemplo trabalhado em sala
sobre Conexão com Banco de
Dados, desenvolver uma agenda
que permita a inserção de
diversos registros, pesquisa,
alteração e exclusão.

P.S.: O programa deverá ser
executado dentro de um lação
de repetição do tipo
do...while

Prof. Edson Melo de Souza


#### CARLOS JOSE DE AMORIM - RA 917207155
#### ALEXSANDRO SILVA PIAZZA- RA 916119196
#### BRUNO OLIVEIRA BRAZ - RA - RA 916111837
#### GLAUCYANY LIRA DA CRUZ - RA - RA 916116774

# Acesso a Aplicação Agenda:
User: Admin
Pass: 1234

# Criação do Banco:

BD: Agenda
Ob.: o BD está anexo em um arquivo .rar.

# Criação das tabelas: Usuário e Tarefas

create table 'agenda'.usuario
(
id BIGINT not null primary key,
Nome VARCHAR(10) not null unique,
Senha VARCHAR(6) not null
)

create table 'agenda'.tarefa
(
id BIGINT not null primary key,
Data DATE not null,
Descricao VARCHAR(30) not null,
id_Usuario BIGINT not null,
foreign key(id_Usuario) references usuario(id)
)
