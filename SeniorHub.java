import java.util.Scanner; //importing the scanner

public class SeniorHub {
	
	public static void main(String[] args) throws Throwable{

		Scanner input = new Scanner(System.in); //creating a new scanner

		//initial menu
		System.out.println("          Menu");
		System.out.println("1. Food");
		System.out.println("2. Entertainment");
		System.out.println("3. Social");
		System.out.println("4. Shopping");

		System.out.print("\nMenu Choice: ");
		int menuChoice = input.nextInt();

		if (menuChoice == 1) {
			//food menu
			System.out.println("\n          Food");
			System.out.println("1. Pickup and Delivery");
			System.out.println("2. Groceries");

			System.out.print("\nMenu Choice: ");
			int foodChoice = input.nextInt();

			if (foodChoice == 1) {
				//pickup and delivery menu
				System.out.println("\n          Pickup and Delivery");
				System.out.println("1. DoorDash");
				System.out.println("2. Uber Eats");
				System.out.println("3. Grubhub");
				System.out.println("4. Search Restaurants");

				System.out.print("\nMenu Choice: ");
				int pdChoice = input.nextInt();
				System.out.println();

				if (pdChoice == 1) {
					//door dash
					String doordashURL = "https://www.doordash.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(doordashURL));
				}
				else if (pdChoice == 2) {
					//uber eats
					String ubereatsURL = "https://www.ubereats.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(ubereatsURL));
				}
				else if (pdChoice == 3) {
					//grubhub
					String grubhubURL = "https://www.grubhub.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(grubhubURL));
				}
				else if (pdChoice == 4) {
					//search restaurants
					//prompting user for restaurant name and formatting it for a map search
					System.out.println("\nWhat is the name of the restaurant you would like to search for?");
					System.out.print("Restaurant name: ");
					String decoy = input.nextLine();
					String restaurantName = input.nextLine();
					String modifiedName = restaurantName.replaceAll(" ", "+").replaceAll(",","%2C");

					//asking if user wants directions or just a search
					System.out.println("\nWould you like directions to " + restaurantName + "?");
					System.out.println("1. Yes");
					System.out.println("2. No");

					System.out.print("\nMenu Choice: ");
					int directionsChoice = input.nextInt();

					if (directionsChoice == 1) {
						//prompting user for start location
						System.out.println("\nWhat is the starting address?");
						System.out.print("Address: ");
						String decoy2 = input.nextLine();
						String address = input.nextLine();
						String modifiedAddress = address.replaceAll(" ", "+").replaceAll(",","%2C");

						//asking for method of transportation
						System.out.println("\nWhat is your preferred method of transportation?");
						System.out.println("1. Driving");
						System.out.println("2. Public Transportation");
						System.out.println("3. Riding a bicycle");
						System.out.println("4. Walking");

						System.out.print("\nMenu Choice: ");
						int transportationChoice = input.nextInt();

						if (transportationChoice == 1) {
							String restaurantDirections = "https://www.google.com/maps/dir/?api=1&origin=" + modifiedAddress + "&destination=" + modifiedName + "&travelmode=driving";
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(restaurantDirections));
							System.out.println();
						}
						else if (transportationChoice == 2) {
							String restaurantDirections = "https://www.google.com/maps/dir/?api=1&origin=" + modifiedAddress + "&destination=" + modifiedName + "&travelmode=transit";
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(restaurantDirections));
							System.out.println();
						}
						else if (transportationChoice == 3) {
							String restaurantDirections = "https://www.google.com/maps/dir/?api=1&origin=" + modifiedAddress + "&destination=" + modifiedName + "&travelmode=bicycling";
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(restaurantDirections));
							System.out.println();
						}
						else if (transportationChoice == 4) {
							String restaurantDirections = "https://www.google.com/maps/dir/?api=1&origin=" + modifiedAddress + "&destination=" + modifiedName + "&travelmode=walking";
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(restaurantDirections));
							System.out.println();
						}
						else {
							System.out.println("That is not a current menu option. Please restart the program and try again");
						}
					}
					else if (directionsChoice == 2) {
						String restaurantSearch = "https://www.google.com/maps/search/?api=1&query=" + modifiedName;
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(restaurantSearch));
						System.out.println();
					}
					else {
						System.out.println("That is not a current menu option. Please restart the program and try again");
					}
				}
				else {
					System.out.println("That is not a current menu option. Please restart the program and try again");
				}
			}
			else if (foodChoice == 2) {
				//groceries menu
				System.out.println("\n          Groceries");
				System.out.println("1. Enter Your Grocery Store");
				System.out.println("2. Find Nearby Grocery Store");

				System.out.print("\nMenu Choice: ");
				int groceriesChoice = input.nextInt();

				if (groceriesChoice == 1) {
					//getting user grocery store and formatting corretly
					System.out.println("\nPlease enter the name of the grocery store you most frequently use");
					System.out.print("Store Name: ");
					String decoy = input.nextLine();
					String userStore = input.nextLine();
					String modifiedStore = userStore.replaceAll(" ","").replaceAll("'","");

					//list of stores that have modified urls
					String frys = "frys";
					String martins = "martins";
					//fixes for modified store links
					if (modifiedStore.equalsIgnoreCase(frys)) {
						modifiedStore = "frysfood";
					}
					if (modifiedStore.equalsIgnoreCase(martins)) {
						modifiedStore = "martinsfoods";
					}
					
					//creating url
					String storeURL = "http://www." + modifiedStore + ".com";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(storeURL));
				}
				else if (groceriesChoice == 2) {
					String groceryStoreSearch = "https://www.google.com/maps/search/?api=1&query=grocery+stores";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(groceryStoreSearch));
					System.out.println();
				}
				else {
					System.out.println("That is not a current menu option. Please restart the program and try again");
				}
			}
			else {
				System.out.println("That is not a current menu option. Please restart the program and try again");
			}
		}
		else if (menuChoice == 2) {
			//entertainment menu
			System.out.println("\n          Entertainment");
			System.out.println("1. Puzzles and Games");
			System.out.println("2. Movies, Shows, and Videos");
			System.out.println("3. News");
			System.out.println("4. Music");
			System.out.println("5. Reading");

			System.out.print("\nMenu Choice: ");
			int entertainmentChoice = input.nextInt();

			if (entertainmentChoice == 1) {
				//puzzles and games menu
				System.out.println("\n          Puzzles and Games");
				System.out.println("1. Crossword Puzzles");
				System.out.println("2. Word Search");
				System.out.println("3. Sudoku");
				System.out.println("4. Chess");
				System.out.println("5. Standard Solitaire");
				System.out.println("6. Bridge");
				System.out.println("7. Hearts");
				System.out.println("8. Spades");
				System.out.println("9. Mahjong");

				System.out.print("\nMenu Choice: ");
				int pgChoice = input.nextInt();

				if (pgChoice == 1) {
					String crosswordURL = "https://www.boatloadpuzzles.com/playcrossword";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(crosswordURL));
				}
				else if (pgChoice == 2) {
					String wordSearchURL = "https://thewordsearch.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(wordSearchURL));
				}
				else if (pgChoice == 3) {
					String sudokuURL = "https://sudoku.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(sudokuURL));
				}
				else if (pgChoice == 4) {
					String chessURL = "https://www.chess.com/play/computer";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(chessURL));
				}
				else if (pgChoice == 5) {
					String solitaireURL = "https://www.solitr.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(solitaireURL));
				}
				else if (pgChoice == 6) {
					String bridgeURL = "https://www.247bridge.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(bridgeURL));
				}
				else if (pgChoice == 7) {
					String heartsURL = "https://www.playhearts-online.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(heartsURL));
				}
				else if (pgChoice == 8) {
					String spadesURL = "https://playspades-online.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(spadesURL));
				}
				else if (pgChoice == 9) {
					String mahjongURL = "https://www.mahjong-game.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(mahjongURL));
				}
				else {
					System.out.println("That is not a current menu option. Please restart the program and try again");
				}
			}
			else if (entertainmentChoice == 2) {
				//movies, shows, and videos menu
				System.out.println("\n          Movies, Shows, and Videos");
				System.out.println("1. Netflix");
				System.out.println("2. Hulu");
				System.out.println("3. Amazon Prime Video");
				System.out.println("4. Disney Plus");
				System.out.println("5. YouTube");

				System.out.print("\nMenu Choice: ");
				int msvChoice = input.nextInt();

				if (msvChoice == 1) {
					String netflixURL = "https://www.netflix.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(netflixURL));
				}
				else if (msvChoice == 2) {
					String huluURL = "https://www.hulu.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(huluURL));
				}
				else if (msvChoice == 3) {
					String primeVideoURL = "https://www.primevideo.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(primeVideoURL));
				}
				else if (msvChoice == 4) {
					String disneyPlusURL = "https://www.disneyplus.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(disneyPlusURL));
				}
				else if (msvChoice == 5) {
					String youtubeURL = "https://www.youtube.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(youtubeURL));
				}
				else {
					System.out.println("That is not a current menu option. Please restart the program and try again");
				}
			}
			else if (entertainmentChoice == 3) {
				//news
				System.out.println("\n          News");
				System.out.println("1. Newspapers");
				System.out.println("2. TV Networks");
				System.out.println("3. Sports");

				System.out.print("\nMenu Choice: ");
				int newsChoice = input.nextInt();

				if (newsChoice == 1) {
					//newspapers
					System.out.println("\n          Newspapers");
					System.out.println("1. New York Times");
					System.out.println("2. New York Post");
					System.out.println("3. The Washington Times");
					System.out.println("4. The Washington Post");
					System.out.println("5. USA Today");
					System.out.println("6. Chicago Tribune");
					System.out.println("7. Los Angeles Times");
					System.out.println("8. The Wall Street Journal");
					System.out.println("9. NPR");

					System.out.print("\nMenu Choice: ");
					int newspaperChoice = input.nextInt();

					if (newspaperChoice == 1) {
						String nyTimesURL = "https://www.nytimes.com/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(nyTimesURL));
					}
					else if (newspaperChoice == 2) {
						String nyPostURL = "https://www.nypost.com/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(nyPostURL));
					}
					else if (newspaperChoice == 3) {
						String washingtonTimesURL = "https://www.washingtontimes.com/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(washingtonTimesURL));
					}
					else if (newspaperChoice == 4) {
						String washingtonPostURL = "https://www.washingtonpost.com/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(washingtonPostURL));
					}
					else if (newspaperChoice == 5) {
						String usaTodayURL = "https://www.usatoday.com/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(usaTodayURL));
					}
					else if (newspaperChoice == 6) {
						String chicagoTribuneURL = "https://www.chicagotribune.com/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(chicagoTribuneURL));
					}
					else if (newspaperChoice == 7) {
						String laTimesURL = "https://www.latimes.com/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(laTimesURL));
					}
					else if (newspaperChoice == 8) {
						String wallStreetJournalURL = "https://www.wsj.com/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(wallStreetJournalURL));
					}
					else if (newspaperChoice == 9) {
						String nprURL = "https://www.npr.org/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(nprURL));
					}
					else {
						System.out.println("That is not a current menu option. Please restart the program and try again");
					}
				}
				else if (newsChoice == 2) {
					//tv networks
					System.out.println("\n          TV Networks");
					System.out.println("1. PBS NewsHour");
					System.out.println("2. ABC News");
					System.out.println("3. CNN");
					System.out.println("4. MSNBC");
					System.out.println("5. CNBC");
					System.out.println("6. Fox News");
					System.out.println("7. BBC News");

					System.out.print("\nMenu Choice: ");
					int networkChoice = input.nextInt();

					if (networkChoice == 1) {
						String pbsURL = "https://www.pbs.org/newshour/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(pbsURL));
					}
					else if (networkChoice == 2) {
						String abcURL = "https://abcnews.go.com/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(abcURL));
					}
					else if (networkChoice == 3) {
						String cnnURL = "https://www.cnn.com/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(cnnURL));
					}
					else if (networkChoice == 4) {
						String msnbcURL = "https://www.msnbc.com/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(msnbcURL));
					}
					else if (networkChoice == 5) {
						String cnbcURL = "https://www.cnbc.com/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(cnbcURL));
					}
					else if (networkChoice == 6) {
						String foxNewsURL = "https://www.foxnews.com/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(foxNewsURL));
					}
					else if (networkChoice == 7) {
						String bbcURL = "https://www.bbc.com/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(bbcURL));
					}
					else {
						System.out.println("That is not a current menu option. Please restart the program and try again");
					}
				}
				else if (newsChoice == 3) {
					//sports
					System.out.println("\n          Sports");
					System.out.println("1. ESPN");
					System.out.println("2. Fox Sports");
					System.out.println("3. NBCSN");
					System.out.println("4. MSN Sports");
					System.out.println("5. MLB Network");
					System.out.println("6. Tennis Channel");
					System.out.println("7. beIN Sports");

					System.out.print("\nMenu Choice: ");
					int sportsChoice = input.nextInt();

					if (sportsChoice == 1) {
						String espnURL = "https://www.espn.com";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(espnURL));
					}
					else if (sportsChoice == 2) {
						String foxSportsURL = "https://www.foxsports.com";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(foxSportsURL));
					}
					else if (sportsChoice == 3) {
						String nbcsnURL = "https://www.nbcsports.com";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(nbcsnURL));
					}
					else if (sportsChoice == 4) {
						String msnURL = "https://www.msn.com/en-us/sports/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(msnURL));
					}
					else if (sportsChoice == 5) {
						String mlbNetworkURL = "https://www.mlb.com/network/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(mlbNetworkURL));
					}
					else if (sportsChoice == 6) {
						String tennisChannelURL = "https://www.tennischannel.com";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(tennisChannelURL));
					}
					else if (sportsChoice == 7) {
						String beINURL = "http://www.espn.com/video/sportscenter";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(beINURL));
					}
					else {
						System.out.println("That is not a current menu option. Please restart the program and try again");
					}
				}
				else {
					System.out.println("That is not a current menu option. Please restart the program and try again");
				}
			}
			else if (entertainmentChoice == 4) {
				//music
				System.out.println("\n          Music");
				System.out.println("1. Pandora");
				System.out.println("2. Spotify");
				System.out.println("3. Apple Music");
				System.out.println("4. SoundCloud");
				System.out.println("5. iHeartRadio");

				System.out.print("\nMenu Choice: ");
				int musicChoice = input.nextInt();

				if (musicChoice == 1) {
					String pandoraURL = "https://www.pandora.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(pandoraURL));
				}
				else if (musicChoice == 2) {
					String spotifyURL = "https://www.spotify.com/us/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(spotifyURL));
				}
				else if (musicChoice == 3) {
					String appleMusicURL = "https://www.apple.com/apple-music/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(appleMusicURL));
				}
				else if (musicChoice == 4) {
					String soundcloudURL = "https://www.soundcloud.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(soundcloudURL));
				}
				else if (musicChoice == 5) {
					String iHeartRadioURL = "https://iheart.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(iHeartRadioURL));
				}
				else {
					System.out.println("That is not a current menu option. Please restart the program and try again");
				}
			}
			else if (entertainmentChoice == 5) {
				//reading
				System.out.println("\n          Reading");
				System.out.println("1. Amazom Kindle Store");
				System.out.println("2. Barnes and Noble");
				System.out.println("3. Audible");
				System.out.println("4. GoodReads");
				System.out.println("5. Find a Local Bookstore");

				System.out.print("\nMenu Choice: ");
				int readingChoice = input.nextInt();

				if (readingChoice == 1) {
					String kindleURL = "https://www.amazon.com/Kindle-Store/b?ie=UTF8&node=133140011";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(kindleURL));
				}
				else if (readingChoice == 2) {
					String barnesAndNobleURL = "https://www.barnesandnoble.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(barnesAndNobleURL));
				}
				else if (readingChoice == 3) {
					String audibleURL = "https://www.audible.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(audibleURL));
				}
				else if (readingChoice == 4) {
					String goodreadsURL = "https://www.goodreads.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(goodreadsURL));
				}
				else if (readingChoice == 5) {
					String localBookstoreURL = "https://www.google.com/maps/search/?api=1&query=bookstores+near+me";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(localBookstoreURL));
				}
				else {
					System.out.println("That is not a current menu option. Please restart the program and try again");
				}
			}
			else {
				System.out.println("That is not a current menu option. Please restart the program and try again");
			}
		}
		else if (menuChoice == 3) {
			//social menu
			System.out.println("\n          Social");
			System.out.println("1. Social Media");
			System.out.println("2. Video and Text Chat");
			System.out.println("3. Email");

			System.out.print("\nMenu Choice: ");
			int socialChoice = input.nextInt();
		}
		else if (menuChoice == 4) {
			//shopping menu
			System.out.println("\n          Shopping");
			System.out.println("1. Amazon (for all purposes)");
			System.out.println("2. Technology");
			System.out.println("3. Cars");
			System.out.println("4. Clothing and Shoes");
			System.out.println("5. Art and Crafts");
			System.out.println("6. Hardware");
			System.out.println("7. Athletics");
			System.out.println("8. Cosmetics");

			System.out.print("\nMenu Choice: ");
			int shoppingChoice = input.nextInt();
		}
		else {
			System.out.println("That is not a current menu option. Please restart the program and try again");
		}

	}

}