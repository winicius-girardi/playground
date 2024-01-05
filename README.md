# BONUS

A classe Employee mapeia o "empregado". EmployeeHandler faz o gerenciamento do array de empregados, adicionando os empregados ao array, e fazendo validações como nome nulo e salário negativo. 
RegisterEmployee instancia os objetos necessários para manipulação dos empregados.


### Para rodar:
```
javac -d ./out  Bonus/*.java 
```
```
java -cp out Entrega.Compass.Bonus.RegisterEmployee 
```



# QUIZ
A classe Player mapeia o "jogador". Question tem as perguntas, alternativas e as respostas do quiz, Quiz faz o gerenciamento das questões e respostas do usuário. QuizPrinter tem os métodos para imprimir na tela, para melhorar a leitura do código.

### Para rodar:
```
javac -d ./out Quiz/*.java
```
```
java -cp out Entrega.Compass.Quiz.Quiz
```



# LOGIN
A classe ValidUsers tem os usuários válidos do sistema. A classe Users mapeia um usuário. PrinterLogin tem os métodos que imprimem algo na tela, conforme o horário do login. LoginController faz o gerenciamento da tentativa de login, verificando se os campos usuário e senha são válidos, ou seja, não nulos. A classe Login instancia um array de Users válidos a partir dos valores contidos na classe ValidUsers. Também instancia LoginController para pegar a tentativa de login do usuário e verifica se a tentativa for válida, ou seja, se o usuário e a senha fornecidos pelo usuário estão no array de Users válidos

### Para rodar:
```
javac -d ./out Login/*.java
```
```
java -cp out Entrega.Compass.Login.Login
```




# EMOTICONS

A classe ProcessString faz o processamento da string de entrada, quebrando-a utilizando o método .split(":-") e atribuindo o resultado a um vetor de String. Com isso, só é necessário percorrer o vetor e verificar se o primeiro caractere de cada string do vetor é o caractere ")" para contabilizar emotes felizes e caso queira verificar se há emotes tristes, testando se o caractere é "(".
A classe Emoticons faz a leitura da String e chama o método de processamento.


### Para rodar:

```
javac -d ./out Emoticons/*.java
```
```

java -cp out Entrega.Compass.Emoticons.Emoticons
```



# PALINDROMO

A classe Palindromo faz o split() da frase para análise e atribui o resultado a um vetor de String str. Depois percorre esse vetor com um laço, dois índices i e k, onde i é o índice inicial e k é o índice do último valor, verificando se str[i] é igual a str[k]. Caso essa verificação falhe, a entrada do usuário não é um palíndromo. Caso percorra todo o laço, a entrada do usuário é um palíndromo.



### Para rodar:
```

javac -d ./out Palindromo/*.java
```
```
java -cp out Entrega.Compass.PalindromoMain
```


# GERENCIAMENTO DE ESTOQUE DE PRODUTOS

A classe Produto mapeia Produto. ProdutoArray faz o gerenciamento de um array de produtos, adicionando um novo produto à lista e impedindo a inserção de produtos com o mesmo código. Além disso, encontra um produto específico na lista. MainProduto instancia ProdutoArray e realiza operações com produtos contidos nesse array.

### Para rodar:
```
java -d ./out2 EstoqueProduto/*.java
```
```
java -cp out Entrega.Compass.EstoqueProduto.MainProduto 
```

