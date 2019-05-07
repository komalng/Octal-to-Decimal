javac OctalToDecimalConverter.java
java OctalToDecimalConverter 123 > actual
diff actual expectedOutput

java OctalToDecimalConverter 11 > actual
diff actual expectedOutput1

java OctalToDecimalConverter 01 > actual
diff actual expectedOutput2

java OctalToDecimalConverter 07 > actual
diff actual expectedOutput3

