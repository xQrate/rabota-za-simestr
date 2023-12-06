package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Data
@Setter
@Getter
public class menu {
    public static void MainMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nДобро пожаловать в бюро знакомств!");
        System.out.println("Выберите действие!\n");

        System.out.print("\nДобавить знакомство-----------(1)");
        System.out.print("\nПросмотреть список знакомств--(2)");
        System.out.print("\nЗапись------------------------(3)");
        System.out.print("\nВыход-------------------------(4)");

        System.out.print("\nВвод: ");

    }

}
