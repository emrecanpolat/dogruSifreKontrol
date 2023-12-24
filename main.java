package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String customerPassword = "12345";
        boolean passwordSuccessfull = false;
        int denemeSayisi = 0;

        while(!passwordSuccessfull && denemeSayisi<3) {
            denemeSayisi+=1;
            System.out.println("Hesap şifrenizi giriniz:");
            String typedPassword = scanner.next();

            if(customerPassword.contentEquals(typedPassword)) {
                passwordSuccessfull = true;
                System.out.println("Sisteme başarılı giriş yaptınız!");
            }else {
                if ((3-denemeSayisi)==0){
                    System.out.println("3 kez üst üste hatalı şifre girdiniz. Hesabınız bloke oldu. Lütfen müşteri hizmetleri ile iletişime geçiniz.");
                }else{
                    System.out.println("Hatalı şifre girdiniz. Lütfen tekrar deneyin. Kalan deneme hakkı: " + (3-denemeSayisi));

                }
            }
        }


    }
}
