javac NumberConverter.java
java NumberConverter --base 8 123 > actual
diff actual expectedOutputFor123InBase8

java NumberConverter --base 8 11 > actual
diff actual expectedOutputFor11InBase8

java NumberConverter --base 8 01 > actual
diff actual expectedOutputFor01InBase8

java NumberConverter --base 8 07 > actual
diff actual expectedOutputFor07InBase8

java NumberConverter --base 7 129 > actual
diff actual expectedOutputFor129InBase7