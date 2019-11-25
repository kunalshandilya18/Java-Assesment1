package com.manthan.musicplayer;

import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("------ WELCOME TO My MUSIC PLAYER --------");
		System.out.println("-----Press 1:PlaySong  --------");
		System.out.println("-----Press 2 :SEarch Song--------");
		System.out.println("-----Press 3 :Show all songs --------");
		System.out.println("-----Press 4 :Operate on songs --------");

		System.out.println("Enter Your Choice : ");
		int input1=sc.nextInt();
		sc.nextLine();
	
		MusicPlay mp=new MusicPlay();

		switch (input1) {
		case 1:
			System.out.println("-----Press A :Play all Songs--------");
			System.out.println("-----Press B :Play Songs Randomly--------");
			System.out.println("-----Press C :Play Particular Song --------");
			System.out.println("Enter Your Choice : ");
			char input2=sc.next().charAt(0);
			
			switch (input2) {
			case 'A':
				System.out.println("Playing all songs!!!!");
				mp.playAllSong();
				break;
			case 'B':
				System.out.println("Playing songs randomly!!!!");
				mp.playAllSongRandom();
				break;
			case 'C':
				System.out.println("Enter the song id of the song :");
				int songId=sc.nextInt();
				String songTitle=mp.playSong(songId);
				System.out.println("Playing "+songTitle+"!!!!!");

				break;
			default:
				System.out.println(" You have entered Wrong Choice!!");
				break;
			}
			break;
		case 2:
			System.out.println("Search a song");
			System.out.println("Enter song Name : ");
			String songName=sc.nextLine();
			MusicDBSearch mdsrch=new MusicDBSearch();
			mdsrch.search(songName);
			break;
		case 3:
			MusicDBShow mds=new MusicDBShow();
			mds.show();
			break;
		case 4: 
			System.out.println("Operating on Songs Database");
			System.out.println("-----Press A :Add a Song--------");
			System.out.println("-----Press B :Edit Song --------");
			System.out.println("-----Press C :Delete Song--------");
			System.out.println("Enter Your Choice : ");
			char input3=sc.next().charAt(0);

			switch (input3) {
			case 'A':
				MusicDBAdd mdadd=new MusicDBAdd();
				mdadd.add();
				break;
			case 'B':
				MusicDBUpdate mdup= new MusicDBUpdate();
				mdup.update();
				break;
			case 'C':
				MusicDBDelete mddel=new MusicDBDelete();
				mddel.delete();
				break;

			default:
				System.out.println("You have Entered Wrong Choice!!");
				break;
			}

			break;
		default:
			System.out.println("You have Entered Wrong Choice!!");
			break;
		}

	}// end of main()
}// end of class
