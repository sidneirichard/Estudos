import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("SnapInsta.io-KAMELOT-One-More-Flag-In-The-Ground-_Official-Video_-Napalm-Records-_320-kbps_.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
            System.out.print("Escolha: ");

            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case ("P") -> clip.start();
                case ("S") -> clip.stop();
                case ("R") -> clip.setMicrosecondPosition(0);
                case ("Q") -> {
                    clip.close();
                    System.out.println("Saindo...");
                }
                default -> System.out.println("Não é uma opção válida.");
            }
        }
    }
}


