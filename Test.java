public static String extractNumber (String input) {
StringBuilder number = new StringBuilder();
boolean decimalFound = false;
for (char c : input.toCharArray()) {
if (Character. isDigit(c)) {
number.append (c);
｝ else if （c=
''）｛
number. append (c);
decimalFound = true;
｝
else t break;}}
if
(decimalFound) {
int decimalIndex = number.indexOf("");
if (decimalIndex != -1 && decimalIndex + 3 ‹ number.length)) {
number.setLength(decimalIndex + 3);
｝
else if (decimalIndex |= -1 && decimalIndex + 3 > number. length()) {
while (number.length)
‹ decimalIndex + 3) {
number.append ("0");}}}
else {
number.append(" .00");}
return number. toString();}
public static void main(String[] args) f
String input1 = "abcd123.456";
String input2 = "abcd123" ;
String resulti = extractNumber (input1);
String result2 = extractNumber (input2);
System. out-printin("Input: " + input1);
System.out-printin("Result: " + result1);
System.out -printin();
System.out-println("Input: " + input2);
System.out-println("Result:" + result2);
}}
