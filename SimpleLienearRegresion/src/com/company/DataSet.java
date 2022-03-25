package com.company;

public class DataSet {

        int n = 9;
        int i;
        int x[] = {23, 26, 30, 34, 43, 48, 52, 57, 58};
        int y[] = {651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518};


        public void DataS() {
            System.out.printf("            Benetton        \n ");
            System.out.printf("\t year\t Adv \t Sales\n");

            for (i = 0; i < n; i++) {
                System.out.printf("\t %d\t %d \t %d \n", i + 1, x[i], y[i]);
            }
        }

}
