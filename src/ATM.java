import Model.KartuATM;

import java.util.Scanner;

public class ATM {
        private static void PrintTitle() {
            System.out.println("-----------------------------");
            System.out.println("  HH   HH       HHHHH");
            System.out.println("  HH   HH       hh   hh ");
            System.out.println("  HHHHHHH       hh  hh ");
            System.out.println("  HH   HH       hh  hh ");
            System.out.println("  HH   HH       HHHHH ");
            System.out.println("------------------------------");
            System.out.println(" BANK HARBER  -  CABANG TEGAL");
            System.out.println("------------------------------");
        }

        public static void main(String[] args) {
            String nokar;
            String norek;
            String nama;
            String pin;

            nokar = "ABCDE";
            norek = "087687";
            nama = "donald";
            Scanner inputUser = new Scanner(System.in);
            PrintTitle();
            System.out.println("Masukkan Kartu");
            System.out.println("Masukkan PIN  ");
            pin = inputUser.nextLine();
            if (pin.equals("123456")){
                KartuATM donald = new KartuATM(nokar,norek,nama);
                char pilihan = 0;
                do{
                    PrintTitle();
                    System.out.println();
                    System.out.println("MENU");
                    System.out.println("[1]. Deposit");
                    System.out.println("[2]. Withdraw");
                    System.out.println("[0]. Exit");
                    System.out.println("Pilihan Anda  :");
                    pilihan = inputUser.nextLine().charAt(0);
                    System.out.println();
                    switch (pilihan){
                        case  '1'  -> {
                            int jumlahdepo;
                            jumlahdepo = 100000;
                            int saldoakhirdepo = donald.Deposit(jumlahdepo);
                            System.out.println("Saldo Akhir : " + saldoakhirdepo);
                        }
                        case '2' -> {
                            int jumlahwd = 10000;
                            int saldoakhirwd = donald.Withdraw(jumlahwd);
                            System.out.println("Saldo Akhir  : "+ saldoakhirwd);
                        }
                        default -> {
                        }
                    }
                }while (pilihan!='0');
            }
        }
    }

