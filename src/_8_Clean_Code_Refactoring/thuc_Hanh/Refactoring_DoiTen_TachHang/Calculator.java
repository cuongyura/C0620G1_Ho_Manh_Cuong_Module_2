package _8_Clean_Code_Refactoring.thuc_Hanh.Refactoring_DoiTen_TachHang;

            public class Calculator {
            public static int calculate(int a, int b, char o) {
                switch (o) {
                    case '+':
                        return a + b;
                    case '-':
                        return a - b;
                    case '*':
                        return a * b;
                    case '/':
                        if (b != 0)
                            return a / b;
                        else
                            throw new RuntimeException("Can not divide by 0");
                    default:
                        throw new RuntimeException("Unsupported operation");
                }
            }
        }



