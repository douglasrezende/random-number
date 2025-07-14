# random-number
Gerar um número inteiro aleatório em Java



Para gerar um número inteiro aleatório em Java 6, você pode usar a classe Random ou o método Math.random(). A classe Random permite gerar números aleatórios de diferentes tipos, enquanto Math.random() retorna um valor double entre 0.0 e 1.0. Para obter um número inteiro dentro de um intervalo específico, é necessário aplicar um cálculo adicional. 
Usando a classe Random: 

    Importe a classe: import java.util.Random;
    Crie uma instância da classe: Random random = new Random();
    Gere um número inteiro:
        Para um número entre 0 (inclusive) e um valor máximo (exclusive), use random.nextInt(max);
        Para um número entre um valor mínimo e máximo (inclusive), use random.nextInt(max - min + 1) + min; 
