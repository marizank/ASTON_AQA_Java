package org.example;

public class Factorial {
        public Factorial() {
        }

        public int factorial(int n) {
            int result = 1;

            for(int i = 1; i <= n; ++i) {
                result *= i;
            }

            return result;
        }
}
