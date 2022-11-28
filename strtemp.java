import javax.sound.midi.Soundbank;

public class strtemp {
    public static void main(String[] args) {
        String letter="Dear <|name|>, Thanks a lot";
        letter=letter.replace("<|name|>", "MAYANK");
        System.out.println(letter);
    }
}
