package ultraemojicombat;

public class UltraEmojiCombat {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy","França", 31,1.75f, 68.9f, 11, 3 , 1);
        l[0].apresentar();
        l[0].status();
    }
}
