package org.example;

import lombok.*;
import com.google.gson.Gson;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

@Data
@Setter
@Getter
@AllArgsConstructor
public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
        Scanner scan = new Scanner(System.in);

        pol Pols = new pol();
        dateReg Dare = new dateReg();
        info Infos = new info();
        registerNumb Regnubs = new registerNumb();
        treb Trebs = new treb();
        baza baze = new baza();
        Gson gson = new Gson();

        try {

            FileReader reader = new FileReader("./fileForJson/txt");


        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
        int answer = 0;

        do {
            menu.MainMenu();
            answer = scan.nextInt();
            switch (answer) {
                //Ввод пола
                case 1:
                    scan.nextLine();
                    System.out.print("Введите ваш пол: ");
                    Pols.setMaleOrFemale(scan.nextLine());

                    System.out.print("Введите ваш регистрационный номер: ");
                    Regnubs.setRegNumb(scan.nextLine());

                    System.out.print("Введите вашу дату регистрации: ");
                    Dare.setDate(scan.nextInt());

                    System.out.print("Введите информацию о вас: ");
                    Infos.setInformation(scan.nextLine());
                    scan.nextLine();
                    System.out.print("Введите ваши требования к партнеру :");
                    Trebs.setNeed(scan.nextLine());


                    if (baze.getData() == null) {
                        List temp = new ArrayList<>();
                        temp.add(Infos);
                        baze.setData(temp);
                        System.out.println("\n добавлено!");
                    } else {
                        baze.getData().add(Infos);
                        System.out.println("\nдобавлено!");
                    }


                    break;
                //просмотр базы

                case 2:

                    System.out.println("В ассортименте имеются:\n");
                    try {
                        File fileForJson = new File("./fileForJson.txt");
                        if (!fileForJson.exists())
                            fileForJson.createNewFile();
                        FileWriter fw;
                        fw = new FileWriter(fileForJson);

                        fw.write(gson.toJson(Infos));
                        fw.close();
                        System.out.println("Запись завершена.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    if (baze.getData() == null) {
                        System.out.println("\uD83D\uDD78 Список пуст! \uD83D\uDD78");
                    } else baze.getData().forEach(System.out::println);


                    break;


                case 3:
                    try {
                        File fileForJson = new File("./fileForJson.txt");
                        if (!fileForJson.exists())
                            fileForJson.createNewFile();
                        FileWriter fw;
                        fw = new FileWriter(fileForJson);
                        fw.write(gson.toJson(Infos));
                        fw.close();
                        System.out.println("Запись завершена!");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    //выход из программы
                case 4:
                    System.out.println("Вы ушли...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте еще раз.");


            }


        }
        while (answer != 7);
    }
}