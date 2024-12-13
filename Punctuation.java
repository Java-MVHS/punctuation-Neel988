/*
Neel Murthy
12/12/24
Punctuation.java

This program looks for all of the words in a given text that have punctuation next to it. It used loops and String methods to search through each value in the String
to check if it has a punctuation character next to it.

Working On:
String methods, iteration with strings

Psuedocode:
Class header
main()
    create instance of the class
    call searchIt()
searchIt()
    create variable to store the string
    call punctuation words()
    call printWords()
checkForPunctuation()
    create variable to store output(words with punctuation)
    integer variable y for the index to start searching
    integer variable for the length of the string
    String variable for the possible punctuation characters
    for loop (i == 0; i <= length; i++)
        i is the index of a space
        if i == space character
            String variable to store substring between start and index of space
            D & I boolean variable to check if iterated values have punctuation
            for loop (a == 0; a < length of variable for possible punctuation characters, a++)
                char variable that iterates through the values inside the string storing possible punctuation
                if indexOf that char is != -1 (meaning that it exists)
                    boolean value = true
                set y = i+1
    return the output
printWords()
    System.out.println(output)


 */

public class Punctuation
{
    public static void main(String[] args)
    {
        Punctuation ps = new Punctuation();
        ps.searchIt();
    }

    public void searchIt()
    {
        String text = new String("Blood, Sweat, and Tears by Winston Churchill " +
            "May 13, 1940 " +
            "Mr. Speaker: " +
            "On Friday evening last I received His Majesty’s commission to form a new " +
            "Administration. It was the evident wish and will of Parliament and the nation " +
            "that this should be conceived on the broadest possible basis and that it should " +
            "include all parties, both those who supported the late Government and also the " +
            "parties of the Opposition." +
            "I have completed the most important part of this task. A War Cabinet has been " +
            "formed of five Members, representing, with the Liberal Opposition, the unity of the " +
            "nation. The three party Leaders have agreed to serve, either in the War Cabinet or in " +
            "high executive office. The three Fighting Services have been filled. It was necessary " +
            "that this should be done in one single day, on account of the extreme urgency and " +
            "rigour of events. A number of other key positions were filled yesterday, and I am " +
            "submitting a further list to His Majesty tonight. I hope to complete the appointment of " +
            "the principal Ministers during tomorrow. The appointment of the other Ministers usually " +
            "takes a little longer, but I trust that, when Parliament meets again, this part of my task " +
            "will be completed, and that the Administration will be complete in all respects." +
            "Sir, I considered it in the public interest to suggest that the House should " +
            "be summoned to meet today. Mr. Speaker agreed and took the necessary steps, in " +
            "accordance with the powers conferred upon him by the Resolution of the House. At the " +
            "end of the proceedings today, the Adjournment of the House will be proposed until " +
            "Tuesday, the 21st May, with, of course, provision for earlier meeting, if need be. The " +
            "business to be considered during that week will be notified to Members at the earliest " +
            "opportunity. I now invite the House, by the Resolution which stands in my name, to " +
            "record its approval of the steps taken and to declare its confidence in the new " +
            "Government.");

        String punctuationWords = getPunctuationWords(text);
        printWords(punctuationWords);
    }

    public String getPunctuationWords(String textIn)
    {
        return checkForPunctuation(textIn);
    }

    public String checkForPunctuation(String text_In)
    {
        String output = "";
        int y = 0;
        int length = text_In.length();
        String punctuationCharacters = ",.;!?\"'()-:";

        for (int i = 0; i <= length; i++)
        {
            if (i == length || text_In.charAt(i) == ' ')
            {
                String word = text_In.substring(y, i);
                boolean hasPunctuation = false;

                for (int a = 0; a < punctuationCharacters.length(); a++)
                {
                    char punctChar = punctuationCharacters.charAt(a);
                    if (word.indexOf(punctChar) != -1) 
                    {
                        hasPunctuation = true;
                    }
                }

                if (hasPunctuation)
                {
                    output = output.concat(word).concat("\n");
                }
                y = i + 1;
            }
        }
        return output;
    }

    public void printWords(String words) {
        System.out.println(words);
    }
}