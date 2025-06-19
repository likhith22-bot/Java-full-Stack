import java.util.Scanner;
/*public class StarSquar {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=0;i<n;i++) {
for(int j=0;j<n;j++) {
System.out.print("*");
}
System.out.println();
}
}
}*/
/*class NumberSquar {
public static void main(String args[]) {
int n;
Scanner s2=new Scanner(System.in);
n=s2.nextInt();
for(int i=1;i<=n;i++) {
for(int j=1;j<=n;j++) {
System.out.print(i);
}
System.out.println();
}
}
}*/
/*class NumberSequence {
public static void main(String[] args) {
int n;
Scanner s3=new Scanner(System.in);
n=s3.nextInt();
for(int i=1;i<=n;i++) {
for(int j=1;j<=n;j++) {
System.out.print(j);
}
System.out.println();
}
}
}*/
/*class Numbers {
public static void main(String[] args) {
int n,k=1;
Scanner s3=new Scanner(System.in);
n=s3.nextInt();
for(int i=1;i<=n;i++) {
for(int j=1;j<=n;j++) {
System.out.print(k++ +"\t");
}
System.out.println();
}
}
}*/
/*class Pattren5 {
public static void main(String[] args) {
int n,k=1;
Scanner s3=new Scanner(System.in);
n=s3.nextInt();
for(int i=1;i<=n;i++) {
for(int j=1;j<=n;j++) {
if(k==10) {
k=1;
}
System.out.print(k++ +"\t");
}
System.out.println();
}
}
}*/
/*class Pattren6 {
public static void main(String[] args) {
int n,k=1;
Scanner s3=new Scanner(System.in);
n=s3.nextInt();
for(int i=1;i<=n;i++) {
for(int j=1;j<=n;j++) {
System.out.print(k +"\t");
k+=2;
}
System.out.println();
}
}
}*/
/*class Pattren7 {
public static void main(String[] args) {
int n;
Scanner s3=new Scanner(System.in);
n=s3.nextInt();
for(int i=1;i<=n;i++) {
for(int j=1;j<=n;j++) 
{
System.out.print(j%2);
}
System.out.println();
}
}
}*/
/*class Pattren8 {
public static void main(String[] args) {
int n;
Scanner s3=new Scanner(System.in);
n=s3.nextInt();
for(int i=1;i<=n;i++) {
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++) {
System.out.print(" *");
}
System.out.println();
}
}
}*/

/*class Pattren9 {
public static void main(String[] args) {
int n,even=2;
Scanner s3=new Scanner(System.in);
n=s3.nextInt();
for(int i=1;i<=n;i++) {
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++) {
System.out.print(" "+even);
even+=2;
}
System.out.println();
even=2;
}
}
}*/

/*class Pattren10 {
public static void main(String[] args) {
int n;
String s="INDIA";
Scanner s3=new Scanner(System.in);
n=s3.nextInt();
for(int i=1;i<=n;i++) {
for(int j=0;j<i;j++)
{
System.out.print(s.charAt(j));
}
System.out.println();
}
}
}*/

/*class Pattren11 {
public static void main(String[] args) {
int n;
Scanner s3=new Scanner(System.in);
n=s3.nextInt();
for(int i=1;i<=n;i++) {
for(int j=i;j<=2*n-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=2*i-1;k++) {
System.out.print(" *");
}
System.out.println();
}
}
}*/
 
/*class Pattren12 {
public static void main(String[] args) {
int n;
Scanner s3=new Scanner(System.in);
n=s3.nextInt();
for(int i=1;i<=n;i++) {
for(int j=i;j<=2*n-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=2*i-1;k++) {
System.out.print(" *");
}
System.out.println();
}
for(int i=n-1;i>0;i--) {
for(int j=i;j<=2*n-i;j++) {
System.out.print(" ");
}
for(int k=0;k<2*i-1;k++) {
System.out.print(" *");
}
System.out.println();
}
}
}*/

/*class Pattren13 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n - i; j++) {
System.out.print(" ");
}
for (int k = 1; k <= 2 * i - 1; k++) {
if (k == 1 || k == 2 * i - 1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
for (int i = n - 1; i >= 1; i--) {
for (int j = 1; j <= n - i; j++) {
System.out.print(" ");
}
for (int k = 1; k <= 2 * i - 1; k++) {
if (k == 1 || k == 2 * i - 1) {
 System.out.print("*");
}
 else {
System.out.print(" ");
}
}
System.out.println();
}        
}
}*/
/*class pattren14 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=0;i<n;i++) {
for(int j=0;j<n;j++) {
if(i==0 || j==0 || j==n-1 || i==n-1) {
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}
}*/

/*class Pattren15 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=0;i<n;i++) {
for(int j=0;j<n;j++) {
if(i==n/2 || j==n/2) {
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}
}*/

/*class Pattren16 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=1;i<=n;i++) {
for(int j=1;j<=n;j++) {
if(i==j || j==n-i+1) {
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}
}*/

/*class Pattren17 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=0;i<n;i++) {
for(int j=0;j<n;j++) {
if(i==n/2 || j==n/2 || i==0 || j==0 || j==n-1 || i==n-1) {
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}
}*/

/*class Pattren18 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=n;i>0;i--) {
for(int j=0;j<i;j++) {
if(j==0 || i==n || j==i-1) {
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}
}*/

/*class Pattren19 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=0;i<=n;i++) {
for(int j=0;j<=i;j++) {
if(j!=i) {
System.out.print("*");
}
else {
System.out.print(j);
}
}
System.out.println();
}
}
}*/

class Pattren20 {
public static void main(String args[]){
int n;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the value:");
n=s1.nextInt();
for(int i=0;i<=n;i++) {
for(int j=0;j<=n;j++) {
if(j==0 || i==0 || i==j) {
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}
}