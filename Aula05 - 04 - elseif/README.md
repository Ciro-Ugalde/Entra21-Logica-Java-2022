# aprendendo sobre else if 

## incluindo novas perguntas no else de cada if

> n�o h� limites em rela��o a aumentos de condi��es em ifs, por�m, deve ter cuidado com a quantidade

> pois fica a pergunta (n�o seria melhor um switch ?)

>por�m quando utilizados else if()

>se faz necess�rio fechar essa cadeia com um else final, por equest�es de boas pr�ticas

````java
if(condcao1){
  // se atender condicao 1
}else if(condicao2){
  // se atender condicao 2
}else if(condicaoN){
  // se atender condicao N
{else {
//pode ter alguma a��o, mas mesmo que n�o tenha escreva mesmo assim

}
````