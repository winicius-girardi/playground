# BONUS

A classe Employee mapeia o "empregado"
EmployeeHandler faz o gerenciamento do array de empregados, adicionando os empregados ao array, e as validações nome nulo, salário negativo.   
RegisterEmployee instancia os objetos necessários para manipulação dos empregados.

### Para rodar:
```
javac -d ./out  Bonus/*.java 
```
```
java -cp out Entrega.Compass.Bonus.RegisterEmployee 
```



# QUIZ

A classe Player mapeia o "jogador"
Question tem as perguntas, alternativas e as respostas do quiz,
Quiz faz o gerenciamento das questões, e respostas do usuário.
QuizPrinter tem os métodos para imprimir na tela, para melhorar a leitura do código.


### Para rodar:
```
javac -d ./out Quiz/*.java
```
```
java -cp out Entrega.Compass.Quiz.Quiz
```



# LOGIN
A classe ValidUsers tem os usuários válidos do sistema.
A classe Users mapeia um usuário.
PrinterLogin tem os metódos que imprimem algo na tela, conforme o horário do login.
LoginController faz o gerenciamento da tentativa de login, verificando se os campos usuário e senha são validos, isto é não nulos.
A classe Login instancia um array de Users válidos a partir dos valores contidos na classe ValidUsers. Também instancia LoginController para 
pegar a tentativa de login do usuário, e verifica se a tentativa for válida, isto é o usuário e senha fornecidos pelo usuário estão no array de Users válidos.



### Para rodar:
```
javac -d ./out Login/*.java
```
```
java -cp out Entrega.Compass.Login.Login
```




# EMOTICONS

A classe ProcessString faz o processamento da string de entrada, quebrando ela utilizando o metódo .split(":-")
e atribuindo o resultado em um vetor String. Com isso, só é necessário percorrer o vetor e verificar  se a primeira caracter de cada string do vetor é o caracter ")" se for para contabilizar
emotes felizes e caso queira verificar se há emotes triste, testando se o caracter é "(".
A classe Emoticons faz a leitura da String e faz chamada do metodo de processamento.


### Para rodar:

```
javac -d ./out Emoticons/*.java
```
```

java -cp out Entrega.Compass.Emoticons.Emoticons
```



# PALINDROMO

  A classe Palindromo faz o split() da frase para analise e atribui o resultado a um vetor de String str. 
  Depois percorre esse vetor com um laço, dois indices i e k, onde i é indice inicial e k o indice do ultimo valor, verificando se str[i] é igual a str[k].
  Caso essa verificação de falso, a entrada do usuário não é um palindromo.
  Caso percorra todo laço, a entrada do usuário é um palíndromo.



### Para rodar:
```

javac -d ./out Palindromo/*.java
```
```
java -cp out Entrega.Compass.PalindromoMain
```


# GERENCIAMENTO DE ESTOQUE DE PRODUTOS

A classe Produto mapeia Produto
ProdutoArray faz o gerenciamento de um array de produtos, adicionando um novo produto a lista, impedindo inserção de produtos com mesmo código, encontrando um produto especifíco da lista
MainProduto instancia  ProdutoArray e faz operações com produtos contidos nesse array.

### Para rodar:
```
java -d ./out2 EstoqueProduto/*.java
```
```
java -cp out Entrega.Compass.EstoqueProduto.MainProduto 
```

