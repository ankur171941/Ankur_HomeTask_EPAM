package Epam;

import java.util.Scanner;

public class NewYearGift
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of chocolates to add in gift");
//        sc.nextLine();
        int n1 = scanner.nextInt();
        sweets chocoObject[] = new chocolate[n1];
        double totalweight=0;
        double chocolateweight[] = new double[n1];
        for(int i=0;i<n1;i++)
        {
            System.out.println("Enter chocolate "+(i+1)+" name to add in gift");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Enter chocolate "+(i+1)+" quantity");
            int quantity = scanner.nextInt();
            chocoObject[i] = new chocolate(name,quantity);
            chocolateweight[i] = chocoObject[i].weight*quantity;
            totalweight+=chocolateweight[i];
        }
        System.out.print("The chocolates added in the gift are: ");
        for(int i=0;i<chocoObject.length;i++)
        {
            System.out.print(chocoObject[i].name+" ");
        }
        System.out.println("Enter 1 to sort gift in order of their weight and 0 for none");
        int choice = scanner.nextInt();
        double temp=0;
        switch(choice)
        {
            case 1:
                for(int i=0;i<n1;i++)
                {
                    for(int j=i+1;j<n1;j++)
                    {
                        if(chocolateweight[i]>chocolateweight[j])
                        {
                            temp = chocolateweight[i];
                            chocolateweight[i] = chocolateweight[j];
                            chocolateweight[j] = temp;
                        }
                    }
                }
                System.out.println("The chocolates in the gift after sorting are");
                for(int i=0;i<n1;i++)
                {
                    System.out.print(chocoObject[i].name+", ");
                }
                System.out.println();
        }
    }
}
