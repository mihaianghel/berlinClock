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
                {0,  "OOOOOOOOOOOO\n O  O  O  O "},
                {1,  "OOOOOOOOOOOO\n Y  O  O  O "},
                {2,  "OOOOOOOOOOOO\n Y  Y  O  O "},
                {3,  "OOOOOOOOOOOO\n Y  Y  Y  O "},
                {4,  "OOOOOOOOOOOO\n Y  Y  Y  Y "},
                {5,  "YOOOOOOOOOOO\n O  O  O  O "},
                {6,  "YOOOOOOOOOOO\n Y  O  O  O "},
                {7,  "YOOOOOOOOOOO\n Y  Y  O  O "},
                {8,  "YOOOOOOOOOOO\n Y  Y  Y  O "},
                {9,  "YOOOOOOOOOOO\n Y  Y  Y  Y "},
                {10, "YYOOOOOOOOOO\n O  O  O  O "},
                {11, "YYOOOOOOOOOO\n Y  O  O  O "},
                {12, "YYOOOOOOOOOO\n Y  Y  O  O "},
                {13, "YYOOOOOOOOOO\n Y  Y  Y  O "},
                {14, "YYOOOOOOOOOO\n Y  Y  Y  Y "},
                {15, "YYROOOOOOOOO\n O  O  O  O "},
                {16, "YYROOOOOOOOO\n Y  O  O  O "},
                {17, "YYROOOOOOOOO\n Y  Y  O  O "},
                {18, "YYROOOOOOOOO\n Y  Y  Y  O "},
                {19, "YYROOOOOOOOO\n Y  Y  Y  Y "},
                {20, "YYRYOOOOOOOO\n O  O  O  O "},
                {21, "YYRYOOOOOOOO\n Y  O  O  O "},
                {22, "YYRYOOOOOOOO\n Y  Y  O  O "},
                {23, "YYRYOOOOOOOO\n Y  Y  Y  O "},
                {24, "YYRYOOOOOOOO\n Y  Y  Y  Y "},
                {25, "YYRYYOOOOOOO\n O  O  O  O "},
                {26, "YYRYYOOOOOOO\n Y  O  O  O "},
                {27, "YYRYYOOOOOOO\n Y  Y  O  O "},
                {28, "YYRYYOOOOOOO\n Y  Y  Y  O "},
                {29, "YYRYYOOOOOOO\n Y  Y  Y  Y "},
                {30, "YYRYYROOOOOO\n O  O  O  O "},
                {31, "YYRYYROOOOOO\n Y  O  O  O "},
                {32, "YYRYYROOOOOO\n Y  Y  O  O "},
                {33, "YYRYYROOOOOO\n Y  Y  Y  O "},
                {34, "YYRYYROOOOOO\n Y  Y  Y  Y "},
                {35, "YYRYYRYOOOOO\n O  O  O  O "},
                {36, "YYRYYRYOOOOO\n Y  O  O  O "},
                {37, "YYRYYRYOOOOO\n Y  Y  O  O "},
                {38, "YYRYYRYOOOOO\n Y  Y  Y  O "},
                {39, "YYRYYRYOOOOO\n Y  Y  Y  Y "},
                {40, "YYRYYRYYOOOO\n O  O  O  O "},
                {41, "YYRYYRYYOOOO\n Y  O  O  O "},
                {42, "YYRYYRYYOOOO\n Y  Y  O  O "},
                {43, "YYRYYRYYOOOO\n Y  Y  Y  O "},
                {44, "YYRYYRYYOOOO\n Y  Y  Y  Y "},
                {45, "YYRYYRYYROOO\n O  O  O  O "},
                {46, "YYRYYRYYROOO\n Y  O  O  O "},
                {47, "YYRYYRYYROOO\n Y  Y  O  O "},
                {48, "YYRYYRYYROOO\n Y  Y  Y  O "},
                {49, "YYRYYRYYROOO\n Y  Y  Y  Y "},
                {50, "YYRYYRYYRYOO\n O  O  O  O "},
                {51, "YYRYYRYYRYOO\n Y  O  O  O "},
                {52, "YYRYYRYYRYOO\n Y  Y  O  O "},
                {53, "YYRYYRYYRYOO\n Y  Y  Y  O "},
                {54, "YYRYYRYYRYOO\n Y  Y  Y  Y "},
                {55, "YYRYYRYYRYYO\n O  O  O  O "},
                {56, "YYRYYRYYRYYO\n Y  O  O  O "},
                {57, "YYRYYRYYRYYO\n Y  Y  O  O "},
                {58, "YYRYYRYYRYYO\n Y  Y  Y  O "},
                {59, "YYRYYRYYRYYO\n Y  Y  Y  Y "}
        });
    }

    private TestDataHelper() {}
}
