package com.music;

import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("------ WELCOME TO MUSIC PLAYER --------");
		System.out.println("-----Press 1 to 'Play a Song'  --------");
		System.out.println("-----Press 2 to 'Search a Song'  --------");
		System.out.println("-----Press 3 to 'Show all Songs'  --------");
		System.out.println("-----Press 4 to 'Operate on Songs Database' --------");

		System.out.println("Enter Your Choice : ");
		int input1=sc.nextInt();
		sc.nextLine();
	
		MusicOperator mo=new MusicOperator();

		switch (input1) {
		case 1:
			System.out.println("-----Press A to 'Play all Songs'  --------");
			System.out.println("-----Press B to 'Play Songs Randomly'  --------");
			System.out.println("-----Press C to 'Play a Particular Song'  --------");
			System.out.println("Enter Your Choice : ");
			char input2=sc.next().charAt(0);
			
			switch (input2) {
			case 'A':
				System.out.println("Playing all songs......... Enjoy!!!");
				mo.playAllSong();
				break;
			case 'B':
				System.out.println("Playing songs randomly......... Enjoy!!!");
				mo.playAllSongRandom();
				break;
			case 'C':
				System.out.println("Enter the song id of the song :");
				int songId=sc.nextInt();
				String songTitle=mo.playSong(songId);
				System.out.println("Playing "+songTitle+"......... Enjoy!!!");

				break;
			default:
				System.out.println("Wrong Choice!!");
				break;
			}
			break;
		case 2:
			System.out.println("Search a song");
			System.out.println("Enter song Name : ");
			String songName=sc.nextLine();
			mo.searchSong(songName);
			break;
		case 3:
			mo.showAllSongs();
			break;
		case 4: 
			System.out.println("Operating on Songs Database");
			System.out.println("-----Press A to 'Add a Song'  --------");
			System.out.println("-----Press B to 'Edit an existing Song'  --------");
			System.out.println("-----Press C to 'Delete an existing Song'  --------");
			System.out.println("Enter Your Choice : ");
			char input3=sc.next().charAt(0);

			switch (input3) {
			case 'A':
				mo.addSong();
				break;
			case 'B':
				mo.updateSong();
				break;
			case 'C':
				mo.deleteSong();
				break;

			default:
				System.out.println("Wrong Choice!!");
				break;
			}

			break;
		default:
			System.out.println("Wrong Choice!!");
			break;
		}

	}// end of main()
}// end of class
