package main;
import controller.Iphone;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Iphone iphone = new Iphone();
        
        int choice=0;
        
        while (choice!=4){
            // Exibe o menu
            System.out.println("\n***** iPhone Menu *****");
            System.out.println("1. Music Player");
            System.out.println("2. Phone");
            System.out.println("3. Web Browser");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            // Lê a escolha do usuário
            choice = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após a escolha
            
            switch (choice) {
                case 1:
                    // Music Player
                    System.out.println("\nMusic Player Menu:");
                    System.out.println("1. Play music");
                    System.out.println("2. Pause music");
                    System.out.println("3. Select song");
                    System.out.print("Choose an option: ");
                    int musicChoice = scanner.nextInt();
                    scanner.nextLine();
                    
                    switch (musicChoice) {
                        case 1:
                            iphone.play();
                            break;
                        case 2:
                            iphone.pause();
                            break;
                        case 3:
                            System.out.print("Enter song name: ");
                            String song = scanner.nextLine();
                            iphone.selectSong(song);
                            break;
                        default:
                            System.out.println("Invalid option.");
                            break;
                    }
                    break;

                case 2:
                    // Phone
                    System.out.println("\nPhone Menu:");
                    System.out.println("1. Call");
                    System.out.println("2. Answer");
                    System.out.println("3. Start voicemail");
                    System.out.print("Choose an option: ");
                    int phoneChoice = scanner.nextInt();
                    scanner.nextLine();
                    
                    switch (phoneChoice) {
                        case 1:
                            System.out.print("Enter phone number: ");
                            String number = scanner.nextLine();
                            iphone.call(number);
                            break;
                        case 2:
                            iphone.answer();
                            break;
                        case 3:
                            iphone.startVoicemail();
                            break;
                        default:
                            System.out.println("Invalid option.");
                            break;
                    }
                    break;

                case 3:
                    // Web Browser
                    System.out.println("\nWeb Browser Menu:");
                    System.out.println("1. Display page");
                    System.out.println("2. Open new tab");
                    System.out.println("3. Refresh page");
                    System.out.print("Choose an option: ");
                    int browserChoice = scanner.nextInt();
                    scanner.nextLine();
                    
                    switch (browserChoice) {
                        case 1:
                            System.out.print("Enter URL: ");
                            String url = scanner.nextLine();
                            iphone.displayPage(url);
                            break;
                        case 2:
                            iphone.openNewTab();
                            break;
                        case 3:
                            iphone.refreshPage();
                            break;
                        default:
                            System.out.println("Invalid option.");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } // Loop até o usuário escolher sair
        
        scanner.close();
    }
}