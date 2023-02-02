# Trabalho-java

Visão geral


Trata-se de um sistema de academia que deve manter dados de funcionamento.


Orientações


O módulo a ser implementado deverá manter um cadastro de clientes e dados relacionados.


Para cada cliente devem ser mantidos: nome, idade, telefone e fichas de exercícios.
Cada cliente pode ter um número variável de fichas (teoricamente sem número máximo, apesar de na prática isso não ser lá comum).

As informações nas fichas de exercícios são apenas textuais. O sistema não tratará como campos distintos os dados numéricos. Por exemplo, aeróbico 15 min é apenas um texto, o sistema não tem tratamento diferenciado para o texto “aeróbico” e o tempo “15min”. 

Seu sistema deverá conter os seguintes requisitos implementados:
<ul>
    <li>Cadastramento de clientes</li>
    <li>Cadastramento de fichas para cada cliente</li>
    <li>
    <ul>
        <li>Cada ficha deverá ter o nome da ficha e a lista de exercícios.</li>
        <li>Fichas podem ser preenchidas ao se cadastrar um cliente ou em outro momento.</li>
    </ul>
    </li>
    <li>Listagem de nomes clientes (sempre ordenada alfabeticamente) - listar apenas os nomes dos clientes.</li>
    <li>Busca por clientes, que resulta na exibição dos dados pessoais do cliente (se localizado) e também na exibição dos dados das fichas de exercícios do cliente encontrando (se existir alguma ficha para o cliente encontrado).</li>
    <li>O sistema deverá ser implementado utilizando uma interface gráfica que oferecerá recursos para a realização dos cadastros acima indicados.</li>
    <li>O sistema deverá ser implementado utilizando a IDE Netbeans.</li>
    <li>Classes devem ser criadas para cliente e ficha de exercícios.</li>
    <li>Deverá haver uma classe main para executar o sistema.</li>
</ul>

Sua implementação deverá possuir tratamento de exceção no caso em que os campos de dados pessoais do cliente forem deixados vazios no cadastramento (vazios apenas, não se preocupar neste trabalho com caracteres de espaços em branco).


