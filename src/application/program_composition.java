package application;

import entitiesComposition.departament;
import entitiesComposition.worker;
import entitiesEnum.workLevel;

import java.util.Locale;
import java.util.Scanner;

public class program_composition {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o departamento:");
        String departamentName = sc.nextLine();
        System.out.println("Entre com os dados do trabalhador:");
        System.out.println("name:");
        String name =sc.nextLine();
        System.out.println("Level:");
        String workerLevel = sc.nextLine();
        System.out.println("Salário:");
        double baseSalary =sc.nextDouble();

        worker worker = new worker(name, workLevel.valueOf(workerLevel), baseSalary, new departament(departamentName) );

        System.out.println(worker);



        sc.close();



    }
}
