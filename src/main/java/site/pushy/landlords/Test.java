package site.pushy.landlords;

import site.pushy.landlords.core.TypeJudgement;
import site.pushy.landlords.core.enums.CardNumberEnum;
import site.pushy.landlords.pojo.Card;

import java.util.Arrays;
import java.util.List;

import static site.pushy.landlords.core.enums.CardGradeEnum.*;

/**
 * @author Pushy
 * @since 2018/12/28 23:31
 */
public class Test {
    public static void main(String[] args) {

        /*Card a = new Card();
        a.setNumber(CardNumberEnum.ONE);

        Card three = new Card();
        three.setNumber(CardNumberEnum.THREE);

        List<Card> list = new LinkedList<>();
        list.add(three);
        list.add(a);

        Collections.sort(list);
        System.out.println(list);*/

//         3带1
//        Card a = new Card(FIFTH);
//        Card b = new Card(FIFTH);
//        Card c = new Card(FIFTH);
//        Card d = new Card(FIFTH);
//
//        List<Card> cards = Arrays.asList(a, b, c, d);
//        System.out.println(TypeJudgement.isThreeWithOne(cards));

//        顺子
//        Card a = new Card(EIGHTH);
//        Card b = new Card(NINTH);
//        Card c = new Card(TENTH);
//        Card d = new Card(ELEVENTH);
//        Card e = new Card(TWELFTH);
//
//        List<Card> cards = Arrays.asList(a, b, c, d, e);
//        System.out.println(TypeJudgement.isStraight(cards));

//        连对
//        Card a = new Card(ELEVENTH);
//        Card b = new Card(ELEVENTH);
//        Card c = new Card(TWELFTH);
//        Card d = new Card(TWELFTH);
//        Card e = new Card(THIRTEENTH);
//        Card f = new Card(THIRTEENTH);
//
//        List<Card> cards = Arrays.asList(a, b, c, d, e, f);
//        System.out.println(TypeJudgement.isStraightPair(cards));

        /*Card a = new Card();
        a.setGrade(CardGradeEnum.THIRD);
        Card b = new Card();
        b.setGrade(CardGradeEnum.THIRD);
        Card c = new Card();
        c.setGrade(CardGradeEnum.THIRD);
        Card d = new Card();
        d.setGrade(CardGradeEnum.FOURTH);
        Card e = new Card();
        e.setGrade(CardGradeEnum.FOURTH);
        Card f = new Card();
        f.setGrade(CardGradeEnum.FOURTH);

        Card g = new Card();
        g.setNumber(CardNumberEnum.SIX);
        Card h = new Card();
        h.setNumber(CardNumberEnum.EIGHT);

        List<Card> cards = Arrays.asList(a, b, c, d, e, f);
        System.out.println(TypeJudgement.isFlyWithNone(cards));*/


//        4带2
//        Card a = new Card(FIRST);
//        Card b = new Card(SECOND);
//        Card c = new Card(SECOND);
//        Card d = new Card(SECOND);
//
//        Card e = new Card(SECOND);
//        Card f = new Card(THIRD);
//
//        List<Card> cards = Arrays.asList(a, b, c, d, e, f);
//        System.out.println(TypeJudgement.isFourWithTwo(cards));

    }
}
