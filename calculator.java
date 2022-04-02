import java.util.Scanner;

class calculator {
    public static double addition(int num)
    {
        Scanner input = new Scanner(System.in);

        double arr[] = new double[num];
        double sum=0d;
        System.out.print("Enter numbers (followed by spaces): ");
        for(int i=0;i<num;i++)
        {
            arr[i]=input.nextDouble();
        }
        for(int i=0;i<num;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    public static double subtraction()
    {
        System.out.println("(Format =  NUMBER 1 - NUMBER 2)\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Value of Number 1 :");
        double num1=input.nextDouble();
        System.out.print("Enter the Value of Number 2 :");
        double num2=input.nextDouble();
        double result=num1-num2;
        return result;
    }
    public static double division()
    {
        System.out.println("(Format =  NUMBER 1 / NUMBER 2)\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Value of Number 1 :");
        double num1=input.nextDouble();
        System.out.print("Enter the Value of Number 2 :");
        double num2=input.nextDouble();
        double result=num1/num2;
        return result;
    }
    public static double multiplication()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to multiply : ");
        int num=input.nextInt();
        double arr[] = new double[num];
        double result=1d;
        System.out.print("Enter numbers (followed by spaces): ");
        for(int i=0;i<num;i++)
        {
            arr[i]=input.nextDouble();
        }
        for(int i=0;i<num;i++)
        {
            result*=arr[i];
        }
        return result;
    }
    public static double factorial(double a)
    {
        double result=1d;
        for(double i=a;i>=1;i--)
        {
            result*=i;
        }
        return result;
    }
    public static double permutation()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Format : nPr = (n)! / (n-r)! )\n");
        System.out.print("Enter the value of n : ");
        double n=input.nextDouble();
        System.out.print("Enter the value of r : ");
        double r=input.nextDouble();
        double temp = factorial(n);
        double temp1 = factorial(n-r);
        double result = temp / temp1;
        return result;
    }
    public static double combination()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Format : nCr = (n)! / ((r)!*(n-r)!)\n");
        System.out.print("Enter the value of n : ");
        double n=input.nextDouble();
        System.out.print("Enter the value of r : ");
        double r=input.nextDouble();
        double temp = factorial(n);
        double temp1 = factorial(r);
        double temp2 = factorial(n-r);
        double result = (temp/(temp1*temp2));
        return result;
    }
    public static double average(int num)
    {
        double sum=addition(num);
        sum = sum / num;
        return sum;
    }
    public static void main(String[] args)
    {
        int count=0;
        char check='Y';
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("-----------------Select the Operation you want to perform-----------------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");
            System.out.println("5. Factorial");
            System.out.println("6. Permutation");
            System.out.println("7. Combination");
            System.out.println("8. Average");
            System.out.println("--------------------------------------------------------------------------");
            System.out.print("Operation number to be performed : ");
            int select = input.nextInt();

            switch (select) {
                case 1:
                    System.out.println("\nYou selected Addition Operation");
                    System.out.print("Enter how many numbers you will enter : ");
                    int num = input.nextInt();
                    double x = addition(num);
                    System.out.printf("\nResult of Addition is %.2f", x);
                    break;
                case 2:
                    System.out.println("\nYou selected Subtraction Operation");
                    double y = subtraction();
                    System.out.printf("\nResult of Subtraction is %.2f", y);
                    break;
                case 3:
                    System.out.println("\nYou selected Division Operation");
                    double z = division();
                    System.out.printf("\nResult of Division is %.2f", z);
                    break;
                case 4:
                    System.out.println("\nYou selected Multiplication Operation");
                    double a = multiplication();
                    System.out.printf("\nResult of Multiplication is %.2f", a);
                    break;
                case 5:
                    System.out.println("\nYou selected Factorial Operation");
                    System.out.print("Enter the number : ");
                    int num1 = input.nextInt();
                    double b = factorial(num1);
                    System.out.printf("\nFactorial of given number is %.2f", b);
                    break;
                case 6:
                    System.out.println("\nYou selected Permutation Operation");
                    double c = permutation();
                    System.out.printf("\nPermutation of given number is %.2f", c);
                    break;
                case 7:
                    System.out.println("\nYou selected Combination Operation");
                    double d = combination();
                    System.out.printf("\nCombination of given number is %.2f", d);
                    break;
                case 8:
                    System.out.println("\nYou selected Average Operation");
                    System.out.print("Enter how many numbers you will enter : ");
                    int num2 = input.nextInt();
                    double e = average(num2);
                    System.out.printf("\nAverage of given number is %.2f", e);
                    break;
                default:
                    System.out.println("\nPlease enter valid operation number");
            }
            count++;
            System.out.println();
            System.out.println("\nDo you want to perform any other operation ? ");
            System.out.print("Press Y for Yes & N for No : ");
            check = input.next().charAt(0);
        }while(check=='y'||check=='Y');
    System.out.println();
    System.out.printf("                 You performed %d Operations on Calculator.",count);
    System.out.println("\n---------------------------------Thank you---------------------------------");
    }
}
