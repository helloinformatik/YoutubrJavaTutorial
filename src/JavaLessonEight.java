import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class JavaLessonEight {
    public static void main (String[] args){
        //https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0
        MonsterTwo.battleBoard();
        char[][] tempBattleBoard = new char [10][10];
        // ObjectName[] ArrayName = new ObjectName[4];
        MonsterTwo[] Monsters = new MonsterTwo[4];
        //MonsterTwo(int health, int attack, int movement, String name)
        Monsters[0] = new MonsterTwo(1000, 20, 1, "Frank" );
        Monsters[1] = new MonsterTwo(500, 40, 2, "Drac" );
        Monsters[2] = new MonsterTwo(1000, 20, 1, "Paul" );
        Monsters[3] = new MonsterTwo(1000, 20, 1, "George" );

        MonsterTwo.redrawBoard();

    }
}
