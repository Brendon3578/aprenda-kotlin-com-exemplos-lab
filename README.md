# Desafio de Projeto - Aprenda Kotlin Com Exemplos (Lab)

![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)

Esse repositório é a resolução do **Desafio de Projeto** criado para avaliação do conteúdo técnico explorado no repositório [aprenda-kotlin-com-exemplos](https://github.com/digitalinnovationone/aprenda-kotlin-com-exemplos) que aborda os fundamentos da linguagem de programação `Kotlin`

## 🔮 Contexto do desafio

A aplicação foi desenvolvida abstraindo o seguinte domínio:

**A [Digital Innovation One](https://web.dio.me) possui `Formacoes` incríveis que têm como objetivo oferecer um conjunto de `ConteudosEducacionais` voltados para uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho. `Formacoes` possuem algumas características importantes, como `nome`, `nivel` e seus respectivos `conteudosEducacionais`. Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio, definido pela capacidade de `matricular` um ou mais `Alunos`.**

## ✨ Resolução do desafio

- Para ver a resolução do projeto veja o arquivo [desafio.kt](./desafio.kt)
- Para testar a resolução do projeto online [clique aqui para abrir a página do Kotlin Playground](https://play.kotlinlang.org/#eyJ2ZXJzaW9uIjoiMS43LjIxIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJjb2RlIjoiY2xhc3MgVXN1YXJpbyh2YWwgbm9tZTogU3RyaW5nPywgdmFsIGVtYWlsOiBTdHJpbmcpIHsgLy8gMVxuICAgIG92ZXJyaWRlIGZ1biBlcXVhbHMob3RoZXI6IEFueT8pID0gb3RoZXIgaXMgVXN1YXJpbyAmJiBvdGhlci5lbWFpbCA9PSB0aGlzLmVtYWlsXG5cbiAgICBvdmVycmlkZSBmdW4gdG9TdHJpbmcoKSA9IFwiVXN1w6FyaW8gJyRub21lJywgZW1haWw6ICRlbWFpbFwiXG59XG5cbi8vIGNsYXNzZSB1dGlsaXTDoXJpYSBkZSBleGNlcHRpb24gcXVhbmRvIG8gZW1haWwgbsOjbyDDqSB2w6FsaWRvXG5jbGFzcyBJbnZhbGlkRW1haWxFeGNlcHRpb24obWVzc2FnZTogU3RyaW5nKSA6IEV4Y2VwdGlvbihtZXNzYWdlKSAvLyAyXG5cbi8vIGZ1bsOnw6NvIHF1ZSB2ZXJpZmljYSBzZSBvIGUtbWFpbCDDqSB2YWxpZG9cbmZ1biBpc0VtYWlsVmFsaWQoZW1haWw6IFN0cmluZykgPSBlbWFpbC5jb250YWlucyhcIkBcIikgLy8gM1xuXG4vLyBFbnVtZXJhdmVsIHF1ZSBkZWZpbmUgb3MgbsOtdmVpcyBkbyBjb250ZXVkbyBlZHVjYWNpb25hbFxuZW51bSBjbGFzcyBOaXZlbCB7XG4gICAgQkFTSUNPLFxuICAgIElOVEVSTUVESUFSSU8sXG4gICAgRElGSUNJTFxufSAvLyA0XG5cbmRhdGEgY2xhc3MgQ29udGV1ZG9FZHVjYWNpb25hbCh2YWwgbm9tZTogU3RyaW5nLCB2YWwgZHVyYWNhbzogSW50ID0gNjAsIHZhbCBuaXZlbDogTml2ZWwpIC8vIDVcblxuZGF0YSBjbGFzcyBGb3JtYWNhbyh2YWwgbm9tZTogU3RyaW5nLCB2YWwgY29udGV1ZG9zOiBMaXN0PENvbnRldWRvRWR1Y2FjaW9uYWw+KSB7IC8vIDZcblxuICAgIC8vIHV0aWxpemFkbyBhIGNvbGxlY3Rpb24gU2V0IChjb25qdW50bykgcGFyYSBuw6NvIHBlcm1pdGlyLi4uXG4gICAgLy8gdXN1w6FyaW9zIHNlIG1hdHJpY3VsYXIgZHVhcyB2ZXplcyBjb20gbyBtZXNtbyBlLW1haWxcbiAgICBwcml2YXRlIHZhbCBpbnNjcml0b3MgPSBtdXRhYmxlU2V0T2Y8VXN1YXJpbz4oKSAvLyA3XG5cbiAgICBwcml2YXRlIGZ1biBpbnNjcmV2ZXJVc3VhcmlvKHVzdWFyaW86IFVzdWFyaW8pIHsgLy8gOFxuICAgICAgICBpZiAoIWlzRW1haWxWYWxpZCh1c3VhcmlvLmVtYWlsKSkge1xuICAgICAgICAgICAgdGhyb3cgSW52YWxpZEVtYWlsRXhjZXB0aW9uKFwiRW1haWwgaW52w6FsaWRvISFcIikgLy8gOVxuICAgICAgICB9XG4gICAgICAgIGluc2NyaXRvcy5hZGQodXN1YXJpbykgLy8gMTBcbiAgICAgICAgLy8gdXRpbGl6YcOnw6NvIGNvbSBvIHdpdGhcbiAgICAgICAgd2l0aCh1c3VhcmlvKSB7IC8vIDExXG4gICAgICAgICAgICBwcmludGxuKFwi8J+foiBNYXRyaWN1bGFkbyBjb20gc3VjZXNzbyBvIGFsdW5vKGEpOiAkbm9tZSwgJGVtYWlsXCIpIC8vIDEyXG4gICAgICAgIH1cbiAgICB9XG5cbiAgICBmdW4gbWF0cmljdWxhcih1c3VhcmlvOiBVc3VhcmlvKSB7IC8vIDEzXG4gICAgICAgIHRyeSB7IC8vIDE0XG4gICAgICAgICAgICBpbnNjcmV2ZXJVc3VhcmlvKHVzdWFyaW8pXG4gICAgICAgIH0gY2F0Y2ggKGU6IEV4Y2VwdGlvbikge1xuICAgICAgICAgICAgcHJpbnRsbihcIvCflLQgJHVzdWFyaW8gbsOjbyBtYXRyaWN1bGFkbzogJGVcIikgLy8gMTVcbiAgICAgICAgfVxuICAgIH1cblxuICAgIC8vIC0gY2FkYXN0cmFyIHVtYSBsaXN0YSBkZSB1c3XDoXJpb3NcbiAgICBmdW4gbWF0cmljdWxhcih1c3VhcmlvczogTGlzdDxVc3VhcmlvPikgeyAvLyAxNlxuICAgICAgICB1c3Vhcmlvcy5mb3JFYWNoIHsgbWF0cmljdWxhcihpdCkgfSAvLyAxN1xuICAgIH1cblxuICAgIGZ1biBleGliaXJVc3Vhcmlvc01hdHJpY3VsYWRvcygpIHsgLy8gMThcbiAgICAgICAgcHJpbnRsbihcIlxcbi0tPiBVc3XDoXJpb3MgbWF0cmljdWxhZG9zIG5hIGZvcm1hw6fDo28gJyRub21lJ1wiKVxuICAgICAgICBpbnNjcml0b3MuZm9yRWFjaCB7IHByaW50bG4oXCLigKIgJGl0XCIpIH0gLy8gMTlcbiAgICB9XG5cbiAgICBmdW4gZXhpYmlyQ29udGV1ZG9zKCkge1xuICAgICAgICBwcmludGxuKFwiXFxuLS0+IENvbnRlw7pkb3MgZGEgZm9ybWHDp8OjbyAnJG5vbWUnXCIpXG4gICAgICAgIGNvbnRldWRvcy5mb3JFYWNoIHsgcHJpbnRsbihcIuKAoiAkaXRcIikgfSAvLyAyMFxuICAgIH1cbn1cblxuLy8gMjFcbmZ1biBtYWluKCkge1xuICAgIHZhbCBrb3RsaW5GdW5kYW1lbnRvcyA9XG4gICAgICAgIENvbnRldWRvRWR1Y2FjaW9uYWwobm9tZSA9IFwiRnVuZGFtZW50b3MgZGUgS290bGluXCIsIG5pdmVsID0gTml2ZWwuQkFTSUNPKVxuICAgIHZhbCBrb3RsaW5Db2xsZWN0aW9ucyA9XG4gICAgICAgIENvbnRldWRvRWR1Y2FjaW9uYWwoXCJUcmFiYWxoYW5kbyBjb20gQ29sbGVjdGlvbnMgbm8gS290bGluXCIsIDkwLCBOaXZlbC5CQVNJQ08pXG4gICAgdmFsIGtvdGxpblNwcmluZyA9IENvbnRldWRvRWR1Y2FjaW9uYWwoXCJLb3RsaW4gY29tIFNwcmluZ1wiLCAxODAsIE5pdmVsLkRJRklDSUwpXG5cbiAgICAvLyAyMlxuICAgIHZhbCBjb250ZXVkb3M6IExpc3Q8Q29udGV1ZG9FZHVjYWNpb25hbD4gPVxuICAgICAgICBsaXN0T2Yoa290bGluRnVuZGFtZW50b3MsIGtvdGxpbkNvbGxlY3Rpb25zLCBrb3RsaW5TcHJpbmcpXG5cbiAgICAvLyAyM1xuICAgIHZhbCBmb3JtYWNhb0tvdGxpbkJhY2tFbmQgPVxuICAgICAgICBGb3JtYWNhbyhcIkRlc2Vudm9sdmltZW50byBCYWNrZW5kIGNvbSBLb3RsaW4gZSBTcHJpbmcgQm9vdFwiLCBjb250ZXVkb3MpXG5cbiAgICAvLyAyNFxuICAgIHZhbCBicmVuZG9uVXNlciA9IFVzdWFyaW8oXCJCcmVuZG9uXCIsIFwiYnJlbmRvbkBlbWFpbC5jb21cIilcbiAgICB2YWwgc2F5TXlOYW1lVXNlciA9IFVzdWFyaW8oXCJXYWx0ZXIgV2hpdGVcIiwgXCJoZWlzZW5iZXJnQGVtYWlsLmNvbVwiKVxuICAgIHZhbCBnbGFkb3NVc2VyID0gVXN1YXJpbyhcIkdMYURPU1wiLCBcInRoZWNha2Vpc2FsaWVAZW1haWwuY29tXCIpXG4gICAgdmFsIGludmFsaWRFbWFpbFVzZXIgPSBVc3VhcmlvKFwiSm9obiBEb2VcIiwgXCJqb2huZG9lI2VtYWlsLmNvbVwiKSAvLyAyNVxuXG4gICAgdmFsIHVzdWFyaW9zTWF0cmljdWxhID0gbGlzdE9mKGJyZW5kb25Vc2VyLCBzYXlNeU5hbWVVc2VyLCBnbGFkb3NVc2VyLCBpbnZhbGlkRW1haWxVc2VyKSAvLyAyNlxuXG4gICAgZm9ybWFjYW9Lb3RsaW5CYWNrRW5kLm1hdHJpY3VsYXIoYnJlbmRvblVzZXIpIC8vIDI3XG4gICAgZm9ybWFjYW9Lb3RsaW5CYWNrRW5kLm1hdHJpY3VsYXIodXN1YXJpb3NNYXRyaWN1bGEpIC8vIDI4XG5cbiAgICBmb3JtYWNhb0tvdGxpbkJhY2tFbmQuZXhpYmlyVXN1YXJpb3NNYXRyaWN1bGFkb3MoKSAvLyAyOVxuICAgIGZvcm1hY2FvS290bGluQmFja0VuZC5leGliaXJDb250ZXVkb3MoKSAvLyAzMFxufSJ9)

## 🤔 Explicação do código

O código acima, escrito em Kotlin, representa uma implementação simplificada da plataforma de cursos **Digital Innovation One**, com ênfase em formações voltadas para uma stack tecnológica específica.

<small>

1. Classe `Usuario` com dois parâmetros: nome (opcional, pode ser nulo) e email. Também há o ***override*** (sobrecarga) dos métodos: **equals** que é usado para a verificação se o email de dois usuários são iguais, e **toString** usado para exibir o objeto em uma String mais "idiomática"
2. Classe utilitária `InvalidEmailException` usada quando há uma exceção do e-mail ser inválido, ela estende da classe Exception do próprio Kotlin e é passada a propriedade message, quando é instanciada, para a super classe Exception.
3. Função utilitária `isEmailValid` que verifica se um e-mail é válido, verificando a presença do caractere '@'.
4. Classe Enumerável `Nivel` que define os níveis do conteúdo educacional: BÁSICO, INTERMEDIÁRIO e DIFÍCIL.
5. ***Data class*** `ConteudoEducacional` com três propriedades: nome, duracao (com valor padrão 60) e nivel do tipo (enumerável) Nivel.
6. ***Data class*** `Formacao` com duas propriedades: nome e conteudos, que é uma lista de ConteudoEducacional.
7. ***Set*** (conjuntos) mutável de **Usuario** chamado `inscritos`, que é usado para armazenar usuários matriculados, no qual, por ser um Set, não permite usuários com o mesmo e-mail.
8. Função privada `inscreverUsuario` que realiza a matrícula de um único usuário, lançando uma exceção se o e-mail não for válido.
    - > Em um cenário real, esta função que interage de fato com uma API externa para inscrever o usuário em uma Formação, nela estaria a regra de negócio que valida o usuário
9. Lança uma exceção do tipo `InvalidEmailException` se o e-mail do usuário não for válido.
10. Adiciona o usuário ao conjunto de inscritos após verificar a validade do e-mail.
      - > Em um cenário real, este código estaria a regra de negócio que interage uma API externa para inscrever o usuário em uma Formação.
11. Função de escopo `with`, que permite chamar métodos e acessar propriedades do objeto **usuario** sem a necessidade de repetir seu nome.
12. Imprime uma mensagem indicando o sucesso da matrícula do aluno.
13. Função `matricular` que tenta matricular um único usuário, tratando exceções.
14. Início do bloco `try/catch`, onde o código suscetível a exceções é colocado, no qual é tentado inscrever o usuário (se ele contiver um e-mail válido).
15. Captura exceções do tipo Exception e imprime uma mensagem indicando que o usuário não foi matriculado, em seguida da mensagem de erro.
16. Polimorfismo da função `matricular` que aceita uma lista de usuários
17. Chama a função `matricular(usuario)` para cada usuário na lista, através da variável implícita ***it*** que é usada para referenciar o elemento atual da iteração.
    - > Observe que é passada uma função **lambda** (delimitada pelas chaves `{ }`) como parâmetro para o **forEach**, que é uma função de ordem superior.
18. Função `exibirUsuariosMatriculados` que imprime os usuários matriculados na formação.
19. Para cada usuário matriculado, imprime em tela uma String do objeto **Usuario**.
20. Para cada conteúdo educacional na formação, imprime uma String do objeto **ConteudoEducacional**.
21. É a função principal `main()` sendo chamada quando o programa é executado inicialmente.
    - Nela é criada uma formação chamada **"Desenvolvimento Backend com Kotlin e Spring Boot"**, com três conteúdos educacionais associados a ela. Em seguida, são criados quatro usuários, sendo um deles com um e-mail inválido.
    - Os usuários são matriculados na formação, e a lista de usuários matriculados e os conteúdos da formação são exibidos.
22. É criado uma lista imutável de objetos do tipo **ConteudoEducacional** através da função **listOf**, sobre os conteúdos criados anteriormente.
23. É criado um objeto `Formacao` , juntamente com a lista de conteúdos criada anteriormente
24. É criado vários objetos do tipo `Usuario`
25. Este objeto **Usuario** em específico não possui um email válido.
26. É criado uma lista imutável de objetos do tipo **Usuário** através da função **listOf**, sobre os usuários criados anteriormente.
27. É matriculado apenas um Usuário (`brendonUser`)
28. É matriculado os usuários da lista criada anteriormente, o **brendonUser** não será adicionado pois o email já existe dentro do ***Set***
29. É exibido em tela os usuários matriculados
30. É exibido em tela os conteúdos da formação **"Desenvolvimento Backend com Kotlin e Spring Boot"**

</small>

---

<h3 align="center">
    Feito com ☕ por <a href="https://github.com/Brendon3578"> Brendon Gomes</a>
</h3>
