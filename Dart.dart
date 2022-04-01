import 'dart:io';
void main(){
   double num1,area;

   num1 = double.parse(stdin.readLineSync());
   area = 3.14159 * num1 * num1;
   var num2 = area.toStringAsFixed(4); 
   print("A=$num2");
}
