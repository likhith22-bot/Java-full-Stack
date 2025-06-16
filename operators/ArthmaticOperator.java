import java.util.Scanner;
class ArthmaticOperator {
public static void main(String[] args) {
int a,b,operator;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the a and b values:");
a=s1.nextInt();
b=s1.nextInt();
System.out.println("Enter the 1.add,2.sub,3.mult,4.div,5.pow,6.modul");
operator=s1.nextInt();
switch(operator) {
case 1:
System.out.println("Addition:"+(a+b));
break;
case 2:
System.out.println("Substration:"+(a-b));
break;
case 3:
System.out.println("Multplication:"+(a*b));
break;
case 4:
System.out.println("Division:"+(a/b));
break;
case 5:
System.out.println("Power:"+Math.pow(a,b));
break;
case 6:
System.out.println("Modulas"+(a%b));
break;
default:
System.out.println("Choose correct operator");
}
}
}