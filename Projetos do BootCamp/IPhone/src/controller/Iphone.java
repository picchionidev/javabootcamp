package controller;

import interfaces.InternetNavigator;
import interfaces.MusicPlayer;
import interfaces.Telephone;

public class Iphone implements InternetNavigator,MusicPlayer,Telephone{

    @Override
    public void displayPage(String url) {
        System.out.printf("Opening : %s",url);
        
    }

    @Override
    public void openNewTab() {
        System.out.println("Opening new Tab...");
        
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing Page...");
        
    }

    @Override
    public void pause() {
        System.out.println("Pausing Music...\n");
        
    }

    @Override
    public void play() {
        System.out.println("Playing Music...\n");
        
    }

    @Override
    public void selectSong(String song) {
        System.out.println("Current Song = ");
        
    }

    @Override
    public void answer() {
        System.out.println("Answering the Call...");
        
    }

    @Override
    public void call(String number) {
        System.out.printf("Calling to %d :\n",number);
        
    }

    @Override
    public void startVoicemail() {
        System.out.println("Listening to VoiceMail...");
        
    }
    
}
