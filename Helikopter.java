/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helikopter;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Ela
 */
public class Helikopter{
    
    public static void playHELIKOPTER(String filepath){
        InputStream music;
        try
        {
            music=new FileInputStream(new File(filepath));
            AudioStream audios= new AudioStream(music);
            AudioPlayer.player.start(audios);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        }
    }

	public static void main(String[] args) throws InterruptedException {

            
            playHELIKOPTER("C:\\Users\\Ela\\Desktop\\OOP\\Helikopter\\Music\\fazlija_2016_helikopter_6707199086266866431.wav");
		while (true) {

			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();

			System.out.println("         :HELI:KOP:TER");
			System.out.println("           A           ");
			System.out.println("       /--------       ");
			System.out.println("HELI ====      ()\\     ");
			System.out.println("       \\         \\        ");
			System.out.println("        \\_________]                ");
			System.out.println("           I     I      ");
			System.out.println("        -----------/              ");
			System.out.println("                       ");
			System.out.println("      HELIKOPER!              ");

			Thread.sleep(100);

			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();

			System.out.println("HELI:KOP:TER:         ");
			System.out.println("           A           ");
			System.out.println("  L    /--------       ");
			System.out.println("HELI ====      ()\\     ");
			System.out.println("       \\         \\        ");
			System.out.println("        \\_________]                ");
			System.out.println("           I     I      ");
			System.out.println("        -----------/              ");
			System.out.println("                       ");
			System.out.println("      HELIKOPTER!              ");

			Thread.sleep(100);
		}

	}

}