/*class Loops {
public static void main(String[] args) {
for(int i=0;i<10;i++) {
System.out.println("Bright IT Career");
}
}
}*/

/*class WhileLoop {
public static void main(String args[]) {
int i=1;
while(i<=20) {
System.out.print(i+" ");
i++;
}
}
}*/

import java.util.Scanner;
/*class EvenOdd {
public static void main(String[] args) {
Scanner s1=new Scanner(System.in);
System.out.println("Enter the upper limit:");
int n=s1.nextInt();
System.out.println("\nEven numbers are:");
for(int i=1;i<=n;i++) {
if(i%2==0) {
System.out.print(i+" ");
}
}
System.out.println("\nOdd numbers are:");
for(int i=1;i<=n;i++) {
if(i%2==1) {
System.out.print(i+" ");
}
}
}
}*/

/*class LargeThree {
public static void main(String[] args) {
Scanner s1=new Scanner(System.in);
System.out.println("Enter the three values:");
int a=s1.nextInt();
int b=s1.nextInt();
int c=s1.nextInt();
if(a>b && a>c) {
System.out.println("The "+a+" value is largest");
}
else if(b>c) {
System.out.println("The "+b+" value is largest");
}
else {
System.out.println("The "+c+" value is largest:");
}
}
}*/

/*class Even {
public static void main(String[] args) {
int i=10;
System.out.print("The even numbers between 10-100 is:");
while(i<=100) {
if(i%2==0) {
System.out.print(i+" ");
}
i++;
}
}
}*/

/*class Numbers {
public static void main(String[] args) {
int i=1;
System.out.print("The numbers between 1-10 is:");
do {
System.out.print(i+" ");
i++;
}
while(i<=10);
}
}*/

/*class Prime {
public static void main(String[] args) {
int n,count=0;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the number:");
n=s1.nextInt();
for(int i=1;i<=n;i++) 
{
if(n%i==0){
count+=1;
}
}
if(count==2) {
System.out.println("The given Number "+n+" is a prime Number");
}
else {
System.out.println("The given number "+n+"is a not prime number:");
}
}
}*/

/*class AmstrongNumber {
public static void main(String args[]) {
int num,rem,temp,sum=0;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the number:");
num=s1.nextInt();
temp=num;
while(num>0) {
rem=num%10;
sum=sum+(rem*rem*rem);
num=num/10;
}
if(sum==temp) {
System.out.println("The given number "+temp+" is a Amstrong number");
}
else {
System.out.println("The given number "+temp+" is not a Amstrong number:");
}
} 
}*/

/*class Palindrom {
public static void main(String args[]) {
int rev=0,rem,value;
Scanner s1=new Scanner(System.in);
int val=s1.nextInt();
value=val;
while(val>0) {
rem=val%10;
rev=rev*10+rem;
val/=10;
}
if(value==rev) {
System.out.println("The given number "+value+" is palindrom:");
}
else {
System.out.println("The given number "+value+" is not palindrom");
}
}
}*/

/*class EvenOdd {
public static void main(String args[]) {
int num;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the number:");
num=s1.nextInt();
switch(num%2) {
case 0:
System.out.println("The given number "+num+" is Even number");
break;
case 1:
System.out.println("The given number "+num+" is Odd number");
break;
default:
System.out.println("The given number "+num+" is -ve odd number");
break;
}
}
}*/

/*class Gender {
public static void main(String args[]) {
String g;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the Gender:");
g=s1.nextLine().toUpperCase();
switch(g) {
case "F":
System.out.println("Female");
break;
case "M":
System.out.println("Male");
break;
default:
System.out.println("Enter the rigth option");
break;
}
}
}*/

class LargeThree {
public static void main(String[] args) {
System.out.println("Enter the three values:");
int a=10,b=20,c=30;
if(a>b && a>c) {
System.out.println("The "+a+" value is largest");
}
else if(b>c) {
System.out.println("The "+b+" value is largest");
}
else {
System.out.println("The "+c+" value is largest:");
}
}
}
