#language: pt
@Login @End2End
Funcionalidade: Login

  Contexto: 
    Dado que o usuario esteja na pagina de login do swaglabs

  @RealizarLogin @SmokeTest
  Esquema do Cenario: Realizar Login com Sucesso
    Quando informar o campo Username como "<username>"
    E informar o campo Password como "<password>"
    E clicar no botao Login
    Entao o sistema devera autorizar o login e mostrar o catalogo.

    Exemplos: 
      | username      | password     |
      | standard_user | secret_sauce |

  @RealizarLoginInvalido @SmokeTest
  Esquema do Cenario: Erro ao realizar login
    Quando informar o campo Username como "<username>"
    E informar o campo Password como "<password>"
    E clicar no botao Login
    Entao o sistema devera mostrar mensagen de erro.

    Exemplos: 
      | username     | password         |
      | userInvalido | passwordInvalido |

  @RealizarLogout @SmokeTest
  Cenario: Realizar Logout do usuario
    Dado que o usuario ja esteja logado
    Quando clicar no menu
    E clicar em logout
    Entao o sistema devera mostrar a pagina de login do sistema.