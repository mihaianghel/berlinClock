package com.company.test.helper;

import java.util.Arrays;
import java.util.List;

public final class TestDataHelper {

    public static List<Object[]> getHours() {
        return Arrays.asList(new Object[][] {
                {0, " O  O  O  O \n O  O  O  O "},
                {1, " O  O  O  O \n R  O  O  O "},
                {2, " O  O  O  O \n R  R  O  O "},
                {3, " O  O  O  O \n R  R  R  O "},
                {4, " O  O  O  O \n R  R  R  R "},
                {5, " R  O  O  O \n O  O  O  O "},
                {6, " R  O  O  O \n R  O  O  O "},
                {7, " R  O  O  O \n R  R  O  O "},
                {8, " R  O  O  O \n R  R  R  O "},
                {9, " R  O  O  O \n R  R  R  R "},
                {10, " R  R  O  O \n O  O  O  O "},
                {11, " R  R  O  O \n R  O  O  O "},
                {12, " R  R  O  O \n R  R  O  O "},
                {13, " R  R  O  O \n R  R  R  O "},
                {14, " R  R  O  O \n R  R  R  R "},
                {15, " R  R  R  O \n O  O  O  O "},
                {16, " R  R  R  O \n R  O  O  O "},
                {17, " R  R  R  O \n R  R  O  O "},
                {18, " R  R  R  O \n R  R  R  O "},
                {19, " R  R  R  O \n R  R  R  R "},
                {20, " R  R  R  R \n O  O  O  O "},
                {21, " R  R  R  R \n R  O  O  O "},
                {22, " R  R  R  R \n R  R  O  O "},
                {23, " R  R  R  R \n R  R  R  O "}
        });
    }

    public static List<Object[]> getMinutes() {
        return Arrays.asList(new Object[][] {
                {0,  "OOOOOOOOOOO\n O  O  O  O "},
                {1,  "OOOOOOOOOOO\n Y  O  O  O "},
                {2,  "OOOOOOOOOOO\n Y  Y  O  O "},
                {3,  "OOOOOOOOOOO\n Y  Y  Y  O "},
                {4,  "OOOOOOOOOOO\n Y  Y  Y  Y "},
                {5,  "YOOOOOOOOOO\n O  O  O  O "},
                {6,  "YOOOOOOOOOO\n Y  O  O  O "},
                {7,  "YOOOOOOOOOO\n Y  Y  O  O "},
                {8,  "YOOOOOOOOOO\n Y  Y  Y  O "},
                {9,  "YOOOOOOOOOO\n Y  Y  Y  Y "},
                {10, "YYOOOOOOOOO\n O  O  O  O "},
                {11, "YYOOOOOOOOO\n Y  O  O  O "},
                {12, "YYOOOOOOOOO\n Y  Y  O  O "},
                {13, "YYOOOOOOOOO\n Y  Y  Y  O "},
                {14, "YYOOOOOOOOO\n Y  Y  Y  Y "},
                {15, "YYROOOOOOOO\n O  O  O  O "},
                {16, "YYROOOOOOOO\n Y  O  O  O "},
                {17, "YYROOOOOOOO\n Y  Y  O  O "},
                {18, "YYROOOOOOOO\n Y  Y  Y  O "},
                {19, "YYROOOOOOOO\n Y  Y  Y  Y "},
                {20, "YYRYOOOOOOO\n O  O  O  O "},
                {21, "YYRYOOOOOOO\n Y  O  O  O "},
                {22, "YYRYOOOOOOO\n Y  Y  O  O "},
                {23, "YYRYOOOOOOO\n Y  Y  Y  O "},
                {24, "YYRYOOOOOOO\n Y  Y  Y  Y "},
                {25, "YYRYYOOOOOO\n O  O  O  O "},
                {26, "YYRYYOOOOOO\n Y  O  O  O "},
                {27, "YYRYYOOOOOO\n Y  Y  O  O "},
                {28, "YYRYYOOOOOO\n Y  Y  Y  O "},
                {29, "YYRYYOOOOOO\n Y  Y  Y  Y "},
                {30, "YYRYYROOOOO\n O  O  O  O "},
                {31, "YYRYYROOOOO\n Y  O  O  O "},
                {32, "YYRYYROOOOO\n Y  Y  O  O "},
                {33, "YYRYYROOOOO\n Y  Y  Y  O "},
                {34, "YYRYYROOOOO\n Y  Y  Y  Y "},
                {35, "YYRYYRYOOOO\n O  O  O  O "},
                {36, "YYRYYRYOOOO\n Y  O  O  O "},
                {37, "YYRYYRYOOOO\n Y  Y  O  O "},
                {38, "YYRYYRYOOOO\n Y  Y  Y  O "},
                {39, "YYRYYRYOOOO\n Y  Y  Y  Y "},
                {40, "YYRYYRYYOOO\n O  O  O  O "},
                {41, "YYRYYRYYOOO\n Y  O  O  O "},
                {42, "YYRYYRYYOOO\n Y  Y  O  O "},
                {43, "YYRYYRYYOOO\n Y  Y  Y  O "},
                {44, "YYRYYRYYOOO\n Y  Y  Y  Y "},
                {45, "YYRYYRYYROO\n O  O  O  O "},
                {46, "YYRYYRYYROO\n Y  O  O  O "},
                {47, "YYRYYRYYROO\n Y  Y  O  O "},
                {48, "YYRYYRYYROO\n Y  Y  Y  O "},
                {49, "YYRYYRYYROO\n Y  Y  Y  Y "},
                {50, "YYRYYRYYRYO\n O  O  O  O "},
                {51, "YYRYYRYYRYO\n Y  O  O  O "},
                {52, "YYRYYRYYRYO\n Y  Y  O  O "},
                {53, "YYRYYRYYRYO\n Y  Y  Y  O "},
                {54, "YYRYYRYYRYO\n Y  Y  Y  Y "},
                {55, "YYRYYRYYRYY\n O  O  O  O "},
                {56, "YYRYYRYYRYY\n Y  O  O  O "},
                {57, "YYRYYRYYRYY\n Y  Y  O  O "},
                {58, "YYRYYRYYRYY\n Y  Y  Y  O "},
                {59, "YYRYYRYYRYY\n Y  Y  Y  Y "}
        });
    }

    private TestDataHelper() {}
}
