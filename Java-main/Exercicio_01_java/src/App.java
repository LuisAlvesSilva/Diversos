import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // 1. Faça um Programa que mostre a mensagem "Alo Mundo" na tela.
        /* System.out.println("Alo Mundo"); */

        // 2. Faça um Programa que peça um número e então mostre a mensagem: O número
        // informado é: [Numero]
        /*
         * Scanner entrada = new Scanner(System.in);
         * int numero;
         * 
         * System.out.print("Digite seu numero: ");
         * numero = entrada.nextInt();
         * 
         * System.out.printf("Seu numero é " + numero + "\n");
         */

        // 3. Faça um prigrama que pela dois números e imprima a soma
        /*
         * Scanner entrada = new Scanner(System.in);
         * int numero_01;
         * int numero_02;
         * 
         * System.out.print("Digite o seu primeiro numero: ");
         * numero_01 = entrada.nextInt();
         * 
         * System.out.print("Digite o seu segundo numero: ");
         * numero_02 = entrada.nextInt();
         * 
         * int soma;
         * soma = numero_01 + numero_02;
         * 
         * System.out.printf("A soma dos seus numeros é: " + soma);
         */

        // 4. Faça um programa que peça as 4 notas bimestrais e mostra a media.
        /*
         * Scanner entrada = new Scanner(System.in);
         * float nota_01;
         * float nota_02;
         * float nota_03;
         * float nota_04;
         * 
         * System.out.print("Digite a sua primeira nota: ");
         * nota_01 = entrada.nextFloat();
         * System.out.print("Digite a sua segunda nota: ");
         * nota_02 = entrada.nextFloat();
         * System.out.print("Digite a sua terceira nota: ");
         * nota_03 = entrada.nextFloat();
         * System.out.print("Digite a sua quarta nota: ");
         * nota_04 = entrada.nextFloat();
         * 
         * float media;
         * media = (nota_01 + nota_02 + nota_03 + nota_04) / 4;
         * 
         * System.out.printf("A sua media foi: " + media);
         */

        // 5. Faça um programa que converta metros para centimetros.
        /*Scanner entrada = new Scanner(System.in);
        float metros;
        float centimetros;

        System.out.print("Digite quantos centimetros quer transformar em metros: ");
        centimetros = entrada.nextFloat();
        metros = centimetros / 60;

        System.out.printf(metros + "Metros");*/

        // 6. Faça um programa que peça o raio de um circulo, calcule e mostre sua area.
        /*Scanner entrada = new Scanner(System.in);
        double area;
        double circulo;
        
        final double pi = 3.1416;
        System.out.print("Digite o raio do circulo que deseja saber a area: ");
        circulo = entrada.nextFloat();
        area = pi * (circulo * circulo);
        System.out.printf("A area do seu circulo é: " + area);*/

        // 7. Faça um programa e calcule a area de um quadrado, em seguida mostro o dobro desta area para o usuario.
        /*Scanner entrada = new Scanner(System.in);
        double area;
        double quadrado;

        System.out.print("Digite a area do quadrado: ");
        quadrado = entrada.nextDouble();
        area = quadrado * 2;
        System.out.printf("O dobro da area do quadrado é: " + area);*/

        // 8. Faça um programa que pergunte quanto voce ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
        /*Scanner entrada = new Scanner(System.in);
        int hora;
        double valor;
        double salario;

        System.out.print("Digite quantas horas trabalhadas esse mes: ");
        hora = entrada.nextInt();
        System.out.print("Digite o valor da hora trabalhada: ");
        valor = entrada.nextDouble();

        salario = hora * valor;

        System.out.printf("O seu salario deste mes será: " + salario);*/

        // 9. Faça um programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
        /*Scanner entrada = new Scanner(System.in);
        double farenheit;
        double celsius;

        System.out.print("Digite quantos graus farenheit, deseja transformar em celsius: ");
        farenheit = entrada.nextDouble();

        celsius = (5 * (farenheit - 32) / 9);
        System.out.printf("A temperatura em graus Celsius é: " + celsius);*/

        // 10. Faça um programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
        /*Scanner entrada = new Scanner(System.in);
        double celsius;
        double farenheit;

        System.out.print("Digite quantos graus Celsius deseja transformar em farenheit: ");
        celsius = entrada.nextDouble();

        farenheit = (celsius * 1.8) + 32;
        System.out.printf("A temperatura em graus Farenheit é: " + farenheit);*/

        // 11. Faça um programa que peça 2 números inteiros e um número real. Calcule e mostre: a. o produto do dobro do primeiro com a metado do
            //a. o produto do dobro do primeiro com a metado do
            //b. a soma do triplo do primeiro com o terceiro.
            //c. o terceiro elevado ao cubo.
        /*Scanner entrada = new Scanner (System.in);
        int numero_01;
        int numero_02;
        float numero_03;
        
        System.out.print("Digite o seu primeiro numero: ");
        numero_01 = entrada.nextInt();
        System.out.print("Digite o seu segundo numero: ");
        numero_02 = entrada.nextInt();
        System.out.print("Digite o seu terceiro numero: ");
        numero_03 = entrada.nextFloat();

        int dobro_metade;
        dobro_metade = (numero_01 * 2) + (numero_02 / 2);
        float soma_triplo;
        soma_triplo = (numero_01 * 3) + numero_03;
        float elevado;
        elevado = ((numero_03 * 3)* 3)* 3;

        System.out.printf("O dobro do primeiro numero com a metade do segundo numero: " + dobro_metade + "\n");
        System.out.printf("A soma do triplo do primeiro numero com o terceiro numero: " + soma_triplo + "\n");
        System.out.printf("Terceiro numero elevado ao cubo: " + elevado + "\n");*/

        // 12. Tendo como dados de entrada a altura de uma pessoa, contrua um algoritmo que calcule seu peso ideal, usando a seguinte formula: (72.7*altura)-58
        /*Scanner entrada = new Scanner (System.in);
        double altura;
        double peso;

        System.out.print("Digite a altura da pessoa do qual voce deseja saber o peso ideal: ");
        altura = entrada.nextDouble();

        peso = (72.7*altura)-58;
        System.out.printf("O peso ideal da pessoa com a altura informada é: " + peso);*/

        // 13. Tendo como dado de entrada a altura (h) de uma pessoa, contrua um algoritmo que calcule seu peso ideal, utilizando as seguintes formulas:
            //Para Homens: (72.7*h) - 58
            //Para Mulheres: (62.1*h) - 44.7

        /*Scanner entrada = new Scanner (System.in);
        double altura;
        double peso;
        String sexo;
        String masculino;
        String feminino;

        System.out.print("Digite M para Masculino e F para Feminino: ");
        sexo = entrada.nextLine();

        if String sexo == {
            System.out.print("Digite a altura do Homem do qual voce deseja saber o peso ideal: ");
            altura = entrada.nextDouble();

            peso = (72.7*altura)-58;
            System.out.printf("O peso ideal da pessoa com a altura informada é: " + peso);
        }*/


        // 14. João Papo-de-Pescador, homen de bem, comprou um mocrocomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.

        // 15. Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
            //a. Salário Bruto
            //b. Quanto pagou ao Imposto de Renda
            //c. Quanto pagou ao INSS
            //d. Quanto pagou ao Sindicato
            //e. O Salário Líquido

        // 16. Faça um programa para um loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura de tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidade de latas de tinta a serem compreadas e o preço total.

        // 17. Faça um programa para um loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura de tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam 80,00 reais ou em galões de 3,6 litros, que custam 25,00 reais.
            //Informe ao usuário as qunatidades de tinta a serem compradas e os respectivos preços em 3 situações:
            //Comprar apenas latas de 18 litros;
            //Comprar apenas galões de 3,6 litros;
            //misturar as latas e galões, de forma que o preço seja o menos. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

        // 18. Faça um programa que peça o tamanho de um arquivo de download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
        
    }
}
