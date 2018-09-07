import java.util.ArrayList;
import java.util.Scanner;
public class DecisionMaker
	{
		static Scanner userInput = new Scanner(System.in);
		static ArrayList<String> possibleChoices = new ArrayList<String>();
		
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				System.out.println("Hello, user, and welcome to the Decision-Maker9001!");
				enterChoices();
				makeChoice(generateRandom());
			}
		public static void enterChoices()
		{
			boolean repeat = true;
			int choicesMade = 0;
			do
				{
					System.out.println("Please enter choice #"+(choicesMade + 1)+", or type 'end' if you're done!");
					String userChoice = userInput.nextLine();
					
					if(userChoice.equals("end"))
						{
							repeat = false;
						}
					else
						{
							possibleChoices.add(userChoice);
							//System.out.println(possibleChoices.get(choicesMade));
							choicesMade += 1;
						}
				}
			while(repeat);
		}
		public static int generateRandom()
		{
			int randomChoice = (int)(Math.random() * possibleChoices.size());
			return randomChoice;
		}
		public static void makeChoice(int randChoice)
		{
			if (possibleChoices.size() == 0)
				{
					System.out.println("You have to enter at least one choice.");
				}
			else
				{
					System.out.println("You should choose '"+possibleChoices.get(randChoice)+"'. Hope it helps!");
				}
		}

	}
