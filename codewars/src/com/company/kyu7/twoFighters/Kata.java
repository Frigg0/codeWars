package com.company.kyu7.twoFighters;

public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        return (firstAttacker.equals(fighter1.name)) ? round1(fighter1, fighter2) : round1(fighter2, fighter1);
    }

    private static String round1(Fighter fighter1, Fighter fighter2){
        int life = fighter2.health - fighter1.damagePerAttack;
        fighter2.health = life;

        if(life > 0){
            return round2(fighter1, fighter2);
        } else
            return fighter1.name;
    }

    private static String round2(Fighter fighter1, Fighter fighter2){
        int life = fighter1.health - fighter2.damagePerAttack;
        fighter1.health = life;

        if (life > 0){
            return round1(fighter1, fighter2);
        } else
            return fighter2.name;
    }
}
/*
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    Fighter a=fighter1, b=fighter2;
    if (firstAttacker.equals(fighter2.name)) {
      a = fighter2; b = fighter1;
    }
    while (true) {
      if ((b.health -= a.damagePerAttack) <= 0) return a.name;  // a wins
      if ((a.health -= b.damagePerAttack) <= 0) return b.name;  // b wins
    }
  }
 */