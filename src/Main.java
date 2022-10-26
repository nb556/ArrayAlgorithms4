import ibcsutils.ReadViaURL;

public class Main
{
    public static void main(String[] args)
    {
        String addr = "http://www-personal.umich.edu/~jlawler/wordlist";
        String[] words = ReadViaURL.readWords(addr, true, true, true);

        String SearchFor = "abc";

        for (String i : words)
        {
            if (i.equals(SearchFor))
            {
                System.out.println("found");
                break;
            }
        }
    }
}