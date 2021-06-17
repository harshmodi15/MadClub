import java.util.Scanner;

class MadTask1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
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
                    System.out.println("Physics Score is " + phy.pScore + " out of 3");
                    break;

                case ("a"):
                    phy.pQuestion1();
                    phy.pQuestion2();
                    phy.pQuestion3();
                    System.out.println("Physics Score is " + phy.pScore + " out of 3");
                    break;

                case ("B"):
                    chem.cQuestion1();
                    chem.cQuestion2();
                    chem.cQuestion3();
                    System.out.println("Chemistry Score is " + chem.cScore + " out of 3");
                    break;

                case ("b"):
                    chem.cQuestion1();
                    chem.cQuestion2();
                    chem.cQuestion3();
                    System.out.println("Chemistry Score is " + chem.cScore + " out of 3");
                    break;

                case ("C"):
                    ma.mQuestion1();
                    ma.mQuestion2();
                    ma.mQuestion3();
                    System.out.println("Maths Score is " + ma.mScore + " out of 3");
                    break;

                case ("c"):
                    ma.mQuestion1();
                    ma.mQuestion2();
                    ma.mQuestion3();
                    System.out.println("Maths Score is " + ma.mScore + " out of 3");
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
    Scanner sc = new Scanner(System.in);
    
    void pQuestion1() {           
        System.out.println("The force acting on a body for a short time are called as: ");
        System.out.println("A. Average Force");
        System.out.println("B. Momentum");
        System.out.println("C. Impulse");
        System.out.println("D. Tension");
        String p1 = sc.next();
        if (p1.equals("C") || p1.equals("c")) {
            System.out.println("You got the right answer");
            pScore = pScore + 1;
        } else if (p1.equals("A") || p1.equals("B") || p1.equals("D") || p1.equals("a") || p1.equals("b") || p1.equals("d")) {
            System.out.println("Sorry Wrong Answer. The Correct Option Is C");
        } else {
            System.out.println("Please give the Input in A, B, C or D");
            pQuestion1();
        }
        
    }

    void pQuestion2() {
        System.out.println("The second law of motion gives us a measure of which of the following physical quantities?");
        System.out.println("A. Acceleration");
        System.out.println("B. Force");
        System.out.println("C. Power");
        System.out.println("D. Work Done");
        String p2 = sc.next();
        if (p2.equals("B") || p2.equals("b")) {
            System.out.println("You got the right answer");
            pScore = pScore + 1;
        } else if (p2.equals("A") || p2.equals("C") || p2.equals("D") || p2.equals("a") || p2.equals("c") || p2.equals("d")) {
            System.out.println("Sorry Wrong Answer. The Correct Option Is B");
        } else {
            System.out.println("Please give the Input in A, B, C or D");
            pQuestion2();
        }
    }

    void pQuestion3() {
        System.out.println("The Universal Gravitational Constant for two bodies is dependent on which of the following?");
        System.out.println("A. Nature of the Bodies");
        System.out.println("B. Size of the Bodies");
        System.out.println("C. Nature of Medium Between the Bodies");
        System.out.println("D. None of the Above");
        String p3 = sc.next();
        if (p3.equals("D") || p3.equals("d")) {
            System.out.println("You got the right answer");
            pScore = pScore + 1;
        } else if (p3.equals("A") || p3.equals("B") || p3.equals("C") || p3.equals("a") || p3.equals("b") || p3.equals("c")) {
            System.out.println("Sorry Wrong Answer. The Correct Option Is D");
        } else {
            System.out.println("Please give the Input in A, B, C or D");
            pQuestion3();
        }
    }
}

class Chemistry {
    Scanner sc = new Scanner(System.in);
    int cScore = 0;
    
    public void cQuestion1() {
        System.out.println("The Modern periodic table has_____________:");
        System.out.println("A. Seven Periods and Eighteen Groups");
        System.out.println("B. Nine Periods and Eighten Groups");
        System.out.println("C. Seven Periods and Twenty One Groups");
        System.out.println("D. Nine Periods and Twenty One Groups");
        String c1 = sc.next();
        if (c1.equals("A") || c1.equals("a")) {
            System.out.println("You got the right answer");
            cScore = cScore + 1;
        } else if (c1.equals("B") || c1.equals("C") || c1.equals("D") || c1.equals("b") || c1.equals("c") || c1.equals("d")) {
            System.out.println("Sorry Wrong Answer. The Correct Option Is A");
        } else {
            System.out.println("Please give the Input in A, B, C or D");
            cQuestion1();
        }
    }

    public void cQuestion2() {
        System.out.println("What is water gas?");
        System.out.println("A. Mixture of CO and H2");
        System.out.println("B. Mixture of CO and H2O");
        System.out.println("C. Mixture of CO2 and H2");
        System.out.println("D. Carbon Mono-oxide");
        String c2 = sc.next();
        if (c2.equals("A") || c2.equals("a")) {
            System.out.println("You got the right answer");
            cScore = cScore + 1;
        } else if (c2.equals("B") || c2.equals("C") || c2.equals("D") || c2.equals("b") || c2.equals("c") || c2.equals("d")) {
            System.out.println("Sorry Wrong Answer. The Correct Option Is A");
        } else {
            System.out.println("Please give the Input in A, B, C or D");
            cQuestion2();
        }
    }

    public void cQuestion3() {
        System.out
                .println("What will be the number of neutrons in an atom having atomic number 35 and mass number 80?");
        System.out.println("A. 35");
        System.out.println("B. 45");
        System.out.println("C. 55");
        System.out.println("D. 80");
        String c3 = sc.next();
        if (c3.equals("B") || c3.equals("b")) {
            System.out.println("You got the right answer");
            cScore = cScore + 1;
        } else if (c3.equals("A") || c3.equals("C") || c3.equals("D") || c3.equals("a") || c3.equals("c") || c3.equals("d")) {
            System.out.println("Sorry Wrong Answer. The Correct Option Is B");
        } else {
            System.out.println("Please give the Input in A, B, C or D");
            cQuestion3();
        }
    }
}

class Maths {
    int mScore = 0;
    Scanner sc = new Scanner(System.in);

    void mQuestion1() {
        System.out.println("What is the average of first 150 natural numbers?");
        System.out.println("A. 70");
        System.out.println("B. 70.5");
        System.out.println("C. 75");
        System.out.println("D. 75.5");
        String m1 = sc.next();
        if (m1.equals("D") || m1.equals("d")) {
            System.out.println("You got the right answer");
            mScore = mScore + 1;
        } else if (m1.equals("A") || m1.equals("B") || m1.equals("C") || m1.equals("a") || m1.equals("b") || m1.equals("c")) {
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
        if (m2.equals("D") || m2.equals("d")) {
            System.out.println("You got the right answer");
            mScore = mScore + 1;
        } else if (m2.equals("A") || m2.equals("B") || m2.equals("C") || m2.equals("a") || m2.equals("b") || m2.equals("c")) {
            System.out.println("Sorry Wrong Answer. The Correct Option Is D");
        } else {
            System.out.println("Please give the Input in A, B, C or D");
            mQuestion2();
        }
    }

    void mQuestion3() {
        System.out.println("If A completes a particular work in 8 days and B completes the same work in 24 days. How many days will it take if they work together?");
        System.out.println("A. 4");
        System.out.println("B. 5");
        System.out.println("C. 6");
        System.out.println("D. 7");
        String m3 = sc.next();
        if (m3.equals("C") || m3.equals("c")) {
            System.out.println("You got the right answer");
            mScore = mScore + 1;
        } else if (m3.equals("A") || m3.equals("B") || m3.equals("D") || m3.equals("a") || m3.equals("b") || m3.equals("d")) {
            System.out.println("Sorry Wrong Answer. The Correct Option Is C");
        } else {
            System.out.println("Please give the Input in A, B, C or D");
            mQuestion3();
        }
    }
}
