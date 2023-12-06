package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class info {
    baza bas = new baza();
    private String information;
    private String pol;
    private String registerNum;
    private int daterag;
    private String treb;


    @Override
    public String toString() {
        return "Анкета  " +
                "\n:регистрационный номер  " + " " + registerNum +
                "\nдата регистрации: " + daterag +
                "\nПол: " + " " + pol +
                "\nсведения о себе " + " " + information +
                "\nтребования к партнеру.: " + " " + treb.toString();

    }


}
