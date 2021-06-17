import 'dart:io';

void main() {
  int i = 1;
  int pScore = 0;
  int cScore = 0;
  int mScore = 0;

  while (i == 1) {
    print("Choose the Topic of Quiz");
    print("A. Physics");
    print("B. Chemistry");
    print("C. Maths");
    print("D. Exit");

    String? topic = stdin.readLineSync();

    switch (topic) {
      case ("A"):
        pScore = physics();
        print("\nYou have scored $pScore Out of 3 in Physics Quiz");
        break;
      case ("a"):
        pScore = physics();
        print("\nYou have scored $pScore Out of 3 in Physics Quiz");
        break;
      case ("B"):
        cScore = chemistry();
        print("\nYou have scored $cScore Out of 3 in Chemistry Quiz");
        break;
      case ("b"):
        cScore = chemistry();
        print("\nYou have scored $cScore Out of 3 in Chemistry Quiz");
        break;
      case ("C"):
        mScore = maths();
        print("\nYou have scored $mScore Out of 3 in Maths Quiz");
        break;
      case ("c"):
        mScore = maths();
        print("\nYou have scored $mScore Out of 3 in Maths Quiz");
        break;
      case ("D"):
        print("Thank You for taking the quiz. Hope you come back stronger");
        exit(0);
      case ("d"):
        print("Thank You for taking the quiz. Hope you come back stronger");
        exit(0);
      default:
        print("Invalid Option");
    }
    print("");
  }
}

int physics() {
  int pScore = 0;

  void pQuestion1() {
    print("\nThe force acting on a body for a short time are called as: ");
    print("A. Average Force");
    print("B. Momentum");
    print("C. Impulse");
    print("D. Tension");

    String? p1 = stdin.readLineSync();
    if (p1 == "C" || p1 == "c") {
      print("You have got the Right Answer");
      pScore = pScore + 1;
    } else if (p1 == "A" ||
        p1 == "B" ||
        p1 == "D" ||
        p1 == "a" ||
        p1 == "b" ||
        p1 == "d") {
      print("Sorry Wrong Answer. The Correct Option Is C");
    } else {
      print("Please give the Input in A, B, C or D");
      pQuestion1();
    }
  }

  void pQuestion2() {
    print(
        "\nThe second law of motion gives us a measure of which of the following physical quantities?");
    print("A. Acceleration");
    print("B. Force");
    print("C. Power");
    print("D. Work Done");

    String? p2 = stdin.readLineSync();
    if (p2 == "B" || p2 == "b") {
      print("You have got the Right Answer");
      pScore = pScore + 1;
    } else if (p2 == "A" ||
        p2 == "C" ||
        p2 == "D" ||
        p2 == "a" ||
        p2 == "c" ||
        p2 == "d") {
      print("Sorry Wrong Answer. The Correct Option Is B");
    } else {
      print("Please give the Input in A, B, C or D");
      pQuestion2();
    }
  }

  void pQuestion3() {
    print(
        "\nThe Universal Gravitational Constant for two bodies is dependent on which of the following?");
    print("A. Nature of the Bodies");
    print("B. Size of the Bodies");
    print("C. Nature of Medium Between the Bodies");
    print("D. None of the Above");

    String? p3 = stdin.readLineSync();
    if (p3 == "D" || p3 == "d") {
      print("You have got the Right Answer");
      pScore = pScore + 1;
    } else if (p3 == "A" ||
        p3 == "B" ||
        p3 == "C" ||
        p3 == "a" ||
        p3 == "b" ||
        p3 == "c") {
      print("Sorry Wrong Answer. The Correct Option Is D");
    } else {
      print("Please give the Input in A, B, C or D");
      pQuestion3();
    }
  }

  pQuestion1();
  pQuestion2();
  pQuestion3();
  return pScore;
}

int chemistry() {
  int cScore = 0;

  void cQuestion1() {
    print("\nThe Modern periodic table has_____________:");
    print("A. Seven Periods and Eighteen Groups");
    print("B. Nine Periods and Eighten Groups");
    print("C. Seven Periods and Twenty One Groups");
    print("D. Nine Periods and Twenty One Groups");

    String? c1 = stdin.readLineSync();
    if (c1 == "A" || c1 == "a") {
      print("You have got the Right Answer");
      cScore = cScore + 1;
    } else if (c1 == "B" ||
        c1 == "C" ||
        c1 == "D" ||
        c1 == "b" ||
        c1 == "c" ||
        c1 == "d") {
      print("Sorry Wrong Answer. The Correct Option Is A");
    } else {
      print("Please give the Input in A, B, C or D");
      cQuestion1();
    }
  }

  void cQuestion2() {
    print("\nWhat is water gas?");
    print("A. Mixture of CO and H2");
    print("B. Mixture of CO and H2O");
    print("C. Mixture of CO2 and H2");
    print("D. Carbon Mono-oxide");

    String? c2 = stdin.readLineSync();
    if (c2 == "A" || c2 == "a") {
      print("You have got the Right Answer");
      cScore = cScore + 1;
    } else if (c2 == "B" ||
        c2 == "C" ||
        c2 == "D" ||
        c2 == "b" ||
        c2 == "c" ||
        c2 == "d") {
      print("Sorry Wrong Answer. The Correct Option Is A");
    } else {
      print("Please give the Input in A, B, C or D");
      cQuestion2();
    }
  }

  void cQuestion3() {
    print(
        "\nWhat will be the number of neutrons in an atom having atomic number 35 and mass number 80?");
    print("A. 35");
    print("B. 45");
    print("C. 55");
    print("D. 80");

    String? c3 = stdin.readLineSync();
    if (c3 == "B" || c3 == "b") {
      print("You have got the Right Answer");
      cScore = cScore + 1;
    } else if (c3 == "A" ||
        c3 == "C" ||
        c3 == "D" ||
        c3 == "a" ||
        c3 == "c" ||
        c3 == "d") {
      print("Sorry Wrong Answer. The Correct Option Is B");
    } else {
      print("Please give the Input in A, B, C or D");
      cQuestion3();
    }
  }

  cQuestion1();
  cQuestion2();
  cQuestion3();
  return cScore;
}

int maths() {
  int mScore = 0;

  void mQuestion1() {
    print("\nWhat is the average of first 150 natural numbers?");
    print("A. 70");
    print("B. 70.5");
    print("C. 75");
    print("D. 75.5");

    String? m1 = stdin.readLineSync();
    if (m1 == "D" || m1 == "d") {
      print("You have got the Right Answer");
      mScore = mScore + 1;
    } else if (m1 == "A" ||
        m1 == "B" ||
        m1 == "C" ||
        m1 == "a" ||
        m1 == "b" ||
        m1 == "c") {
      print("Sorry Wrong Answer. The Correct Option Is D");
    } else {
      print("Please give the Input in A, B, C or D");
      mQuestion1();
    }
  }

  void mQuestion2() {
    print(
        "\nWhat is the rate of discount if a car which price was \$4,000 was sold for \$3,200 ?");
    print("A. 14%");
    print("B. 16%");
    print("C. 18%");
    print("D. 20%");

    String? m2 = stdin.readLineSync();
    if (m2 == "D" || m2 == "d") {
      print("You have got the Right Answer");
      mScore = mScore + 1;
    } else if (m2 == "A" ||
        m2 == "B" ||
        m2 == "C" ||
        m2 == "a" ||
        m2 == "b" ||
        m2 == "c") {
      print("Sorry Wrong Answer. The Correct Option Is D");
    } else {
      print("Please give the Input in A, B, C or D");
      mQuestion2();
    }
  }

  void mQuestion3() {
    print(
        "\nIf A completes a particular work in 8 days and B completes the same work in 24 days. How many days will it take if they work together?");
    print("A. 4");
    print("B. 5");
    print("C. 6");
    print("D. 7");

    String? m3 = stdin.readLineSync();
    if (m3 == "C" || m3 == "c") {
      print("You have got the Right Answer");
      mScore = mScore + 1;
    } else if (m3 == "A" ||
        m3 == "B" ||
        m3 == "D" ||
        m3 == "a" ||
        m3 == "b" ||
        m3 == "d") {
      print("Sorry Wrong Answer. The Correct Option Is C");
    } else {
      print("Please give the Input in A, B, C or D");
      mQuestion3();
    }
  }

  mQuestion1();
  mQuestion2();
  mQuestion3();
  return mScore;
}
