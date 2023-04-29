import java.util.Scanner;
public class ExercicioListaQuatro{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome, cartaoVacina, sintomas, contato,retornoViagem;
        int idade, porcentagem = 0, tentativa = 0;
        System.out.println("Informe seu nome:");
        nome = input.next();

        System.out.println("informe sua idade: ");
        idade = input.nextInt();

        System.out.println("perguntas com respostas sim ou não:\n");
        System.out.println("Seu cartão de vacina está em dia?");
        cartaoVacina = input.next();

        System.out.println("Teve algum dos sintomas recentemente? \n(dor de cabeça, febre, náusea, dor articular, gripe)");
        sintomas = input.next();

        System.out.println("Teve contato com pessoas com sintomas gripais nos últimos dias?");
        contato = input.next();

        System.out.println("Está retornando de viagem realizada no exterior?");
        retornoViagem = input.next();
        if(retornoViagem.equals("sim")){
            System.out.println("Você ficará sob observação por 05 dias.");
        }
        while((!cartaoVacina.equals("sim") && !cartaoVacina.equals("nao")) || (!sintomas.equals("sim") && !sintomas.equals("nao")) || (!contato.equals("sim") && !contato.equals("nao")) || (!retornoViagem.equals("sim") && !retornoViagem.equals("nao")) && tentativa < 3){
            System.out.println("alguma das alternativas esta incorreta tente novamente: ");
            tentativa++;

            System.out.println("Seu cartão de vacina está em dia?");
            cartaoVacina = input.next();

            System.out.println("Teve algum dos sintomas recentemente? \n(dor de cabeça, febre, náusea, dor articular, gripe)");
            sintomas = input.next();

            System.out.println("Teve contato com pessoas com sintomas gripais nos últimos dias?");
            contato = input.next();

            System.out.println("Está retornando de viagem realizada no exterior?");
            retornoViagem = input.next();
        }
        if (tentativa >= 3) {
            System.out.println("Não foi possível realizar o diagnóstico.");
            System.out.println("Gentileza procurar ajuda médica caso apareça algum sintoma.");
        }
        if (cartaoVacina.equals("nao"))
            porcentagem += 10;

        if (sintomas.equals("sim"))
            porcentagem += 30;

        if (contato.equals("sim"))
            porcentagem += 30;

        if(retornoViagem.equals("sim"))
            porcentagem += 30;
        if(porcentagem <=30){
            System.out.println("Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.");
        }else if(porcentagem <=60){
            System.out.println("Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.");
        } else if(porcentagem > 90){
            System.out.println("Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado");
        }
        System.out.println(nome);
        System.out.println(idade);
        if (cartaoVacina.equals("sim")){
        System.out.println("Seu cartao de vacina esta em dia!");
        }else {
            System.out.println("Seu cartao de vacina nao esta em dia!");
        }
        System.out.println("Você teve sintomas recentimente: " + sintomas);
        System.out.println("Você teve contato com pessoas infectadas: " + contato);
        System.out.println("Você esta retornando de viagem: " + retornoViagem);
        System.out.println("A probabilidade de estar infectado é: " + porcentagem + "por cento");
        System.out.println("Cuide-se pois saúde é coisa séria!");
        input.close();
    }
}