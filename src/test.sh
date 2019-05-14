javac OctalToDecimalConverter.java
java OctalToDecimalConverter --base 8 123 > actual
diff actual expectedOutput

java OctalToDecimalConverter --base 8 11 > actual
diff actual expectedOutput1

java OctalToDecimalConverter --base 8 01 > actual
diff actual expectedOutput2

java OctalToDecimalConverter --base 8 07 > actual
diff actual expectedOutput3

java OctalToDecimalConverter --base 8 -1 > actual
diff actual expectedOutput4

java OctalToDecimalConverter --base 7 129 > actual
diff actual expectedOutput5