import java.util.Scanner;

class MadTask1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int pScore = 0;
        int cScore = 0;
        int mScore = 0;
        int i = 1;
        Physics phy = new Physics();
        Chemistry chem = new Chemistry();
        Maths ma = new Maths();
        while (i == 1) {
            System.out.println("Choose the Topic of Quiz:");
            System.out.println("A. Physics");
            System.out.println("B. Chemistry");
            System.out.println("C. Maths");
            System.out.println("D. Exit");
            String topic = sc.next();

            switch (topic) {
                case ("A"):
                    phy.pQuestion1();
                    phy.pQuestion2();
                    phy.pQuestion3();
                    System.out.println("Physics Score is " + pScore + " out of 3");
                    break;

                case ("a"):
                    phy.pQuestion1();
                    phy.pQuestion2();
                    phy.pQuestion3();
                    System.out.println("Physics Score is " + pScore + " out of 3");
                    break;

                case ("B"):
                    chem.cQuestion1();
                    chem.cQuestion2();
                    chem.cQuestion3();
                    System.out.println("Chemistry Score is " + cScore + " out of 3");
                    break;

                case ("b"):
                    chem.cQuestion1();
                    chem.cQuestion2();
                    chem.cQuestion3();
                    System.out.println("Chemistry Score is " + cScore + " out of 3");
                    break;

                case ("C"):
                    ma.mQuestion1();
                    ma.mQuestion2();
                    ma.mQuestion3();
                    System.out.println("Maths Score is " + mScore + " out of 3");
                    break;

                case ("c"):
                    ma.mQuestion1();
                    ma.mQuestion2();
                    ma.mQuestion3();
                    System.out.println("Maths Score is " + mScore + " out of 3");
                    break;

                case ("D"):
                    System.out.println("Thank You for taking the quiz. Hope you come back stronger");
                    System.exit(0);

                case ("d"):
                    System.out.println("Thank You for taking the quiz. Hope you come back stronger");
                    System.exit(0);

                default:
                    System.out.println("Please select option from A, B, C or D");
                
            sc.close();
            }
        }
    }
}

class Physics {
    int pScore = 0;
    
    void pQuestion1() {           
        Scanner sc = new Scanner(System.in);
        System.out.println("The force acting on a body for a short time are called as: ");
        System.out.println("A. Average Force");
        System.out.println("B. Momentum");
        System.out.println("C. Impulse");
        System.out.println("D. Tension");
        String p1 = sc.next();
        if (p1 == "C" || p1 == "c") {
            System.out.println("You got the right answer");
            pScore = pScore + 1;
        } else if (p1 == "A" || p1 == "B" || p1 == "D" || p1 == "a" || p1 == "b" || p1 == "d") {
            System.out.println("Sorry Wrong Answer. The Correct Option Is C");
        } else {
            System.out.println("Please give the Input in A, B, C or D");
            //pQuestion1();
        }
        sc.close();
    }

    void pQuestion2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("The second law of motion gives us a measure of which of the following physical quantities?");
        System.out.println("A. Acceleration");
        System.out.println("B. Force");
        System.out.println("C. Power");
        System.out.println("D. Work Done");
        String p2 = sc.next();
        if (p2 == "B" || p2 == "b") {
            pScore = pScore + 1;
        } else if (p2 == "A" || p2 == "C" || p2 == "D" || p2 == "a" || p2 == "c" || p2 == "d") {
            System.out.println("Sorry Wrong Answer. The Correct Option Is B");
        } else {
            System.out.println("Please give the Input in A, B, C or D");
            pQuestion2();
        }
        sc.close();
    }

    void pQuestion3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Universal Gravitational Constant for two bodies is dependent on which of the following?");
        System.out.println("A. Nature of the Bodies");
        System.out.println("B. Size of the Bodies");
        System.out.println("C. Nature of Medium Between the Bodies");
        System.out.println("D. None of the Above");
        String p3 = sc.next();
        if (p3 == "D" || p3 == "d") {
            pScore = pScore + 1;
        } else if (p3 == "A" || p3 == "B" || p3 == "C" || p3 == "a" || p3 == "b" || p3 == "c") {
            System.out.println("Sorry Wrong Answer. The Correct Option Is D");
        } else {
            System.out.println("Please give the Input in A, B, C or D");
            pQuestion3();
        }
        sc.close();
    }
}

class Chemistry {

    public static int cScore = 0;
    
    public void cQuestion1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Modern periodic table has_____________:");
        System.out.println("A. Seven Periods and Eighteen Groups");
        System.out.println("B. Nine Periods and Eighten Groups");
        System.out.println("C. Seven Periods and Twenty One Groups");
        System.out.println("D. Nine Periods and Twenty One Groups");
        String c1 = sc.next();
        if (c1 == "A" || c1 == "a") {
            cScore = cScore + 1;
        } else if (c1 == "B" || c1 == "C" || c1 == "D" || c1 == "b" || c1 == "c" || c1 == "d") {
            System.out.println("Sorry Wrong Answer. The Correct Option Is A");
        } else {
            System.out.println("Please give the Input in A, B, C or D");
            cQuestion1();
        }
        sc.close();
    }

    public void cQuestion2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is water gas?");
        System.out.println("A. Mixture of CO and H2");
        System.out.println("B. Mixture of CO and H2O");
        System.out.println("C. Mixture of CO2 and H2");
        System.out.println("D. Carbon Mono-oxide");
        String c2 = sc.next();
        if (c2 == "A" || c2 == "a") {
            cScore = cScore + 1;
        } else if (c2 == "B" || c2 == "C" || c2 == "D" || c2 == "b" || c2 == "c" || c2 == "d") {
            System.out.println("Sorry Wrong Answer. The Correct Option Is A");
        } else {
            System.out.println("Please give the Input in A, B, C or D");
            cQuestion2();
        }
        sc.close();
    }

    public void cQuestion3() {
        Scanner sc = new Scanner(System.in);
        System.out
                .println("What will be the number of neutrons in an atom having atomic number 35 and mass number 80?");
        System.out.println("A. 35");
        System.out.println("B. 45");
        System.out.println("C. 55");
        System.out.println("D. 80");
        String c3 = sc.next();
        if (c3 == "B" || c3 == "b") {
            cScore = cScore + 1;
        } else if (c3 == "A" || c3 == "C" || c3 == "D" || c3 == "a" || c3 == "c" || c3 == "d") {
            System.out.println("Sorry Wrong Answer. The Correct Option Is B");
        } else {
            System.out.println("Please give the Input in A, B, C or D");
            cQuestion3();
        }
        sc.close();
    }
}

class Maths {
    public static int mScore = 0;
    Scanner sc = new Scanner(System.in);

    void mQuestion1() {
        System.out.println("What is the average of first 150 natural numbers?");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        String m1 = sc.next();
        if (m1 == "a" || m1 == "A") {
            mScore = mScore + 1;
        } else if (m1 == "A" || m1 == "B" || m1 == "C" || m1 == "a" || m1 == "b" || m1 == "c") {
            System.out.println("Sorry Wrong Answer. The Correct Option Is D");
        } else {
            System.out.println("Please give the Input in A, B, C or D");
            mQuestion1();
        }
    }

    public void mQuestion2() {
        System.out.println("What is the rate of discount if a car which price was 4,000 was sold for 3,200 ?");
        System.out.println("A. 14%");
        System.out.println("B. 16%");
        System.out.println("C. 18%");
        System.out.println("D. 20%");
        String m2 = sc.next();
        if (m2 == "D" || m2 == "d") {
            mScore = mScore + 1;
        } else if (m2 == "A" || m2 == "B" || m2 == "C" || m2 == "a" || m2 == "b" || m2 == "c") {
            System.out.println("Sorry Wrong Answer. The Correct Option Is D");
        } else {
            System.out.println("Please give the Input in A, B, C or D");
            mQuestion2();
        }
    }

    void mQuestion3() {
        System.out.println("3) 19 + ……. = 42 \n A. 23 \n B. 61 \n C. 0 \n D. 42");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        String m3 = sc.next();
        if (m3 == "d" || m3 == "D") {
            mScore = mScore + 1;
        } else if (m3 == "A" || m3 == "B" || m3 == "D" || m3 == "a" || m3 == "b" || m3 == "d") {
            System.out.println("Sorry Wrong Answer. The Correct Option Is C");
        } else {
            System.out.println("Please give the Input in A, B, C or D");
            mQuestion3();
        }
    }
}
