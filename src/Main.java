import javax.swing.*;

public class Main {
    public static void main(String[] args) {
                //Задание 1
                int clientOS = 1;
                if (clientOS == 0)
                    System.out.println("Установите версию приложения для iOS по ссылке");
                else
                    System.out.println("Установите версию приложения для Android по ссылке");
                //Задание 2
                int clientOS1 = 1;
                int yearP = 2014;
                boolean yearPhone= yearP<2015;
                if (clientOS1 == 0) {
                    if(yearPhone)
                        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    else
                        System.out.println("Установите версию приложения для iOS по ссылке");
                }
                else if(yearPhone) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                //Задание 3
                int year =2021;
                if (((year%4)==0 || (year%400)==0)&&(year%100)!=0){
                    System.out.println(year + " год является високосным");
                }
                else System.out.println(year + " год не является високосным");
                //Задание 4
                int deliveryDistance =95;
                int days=1;
                if (deliveryDistance<20)
                    System.out.println("Потребуется дней: " + days);
                else if (deliveryDistance>=20 && deliveryDistance<60){
                    System.out.println("Потребуется дней: " + (days+1));}
                else System.out.println("Потребуется дней: " + (days+2));
                //Задание 5
                int month =10;
                switch (month) {
                    case 12:
                    case 1:
                    case 2:
                        System.out.println("Месяц " + month + " принадлежит к сезону зима.");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Месяц " + month + " принадлежит к сезону весна.");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Месяц " + month + " принадлежит к сезону лето.");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Месяц " + month + " принадлежит к сезону осень.");
                        break;
                    default:
                        System.out.println("Такого месяца не существует.");
                }


            }
        }


