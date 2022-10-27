import ibcsutils.ReadViaURL;

public class Main
{
    public static void main(String[] args)
    {
        String addr = "http://www-personal.umich.edu/~jlawler/wordlist";
        String[] words = ReadViaURL.readWords(addr, true, true, true);

        String SearchFor = "abc";

        /*
        for (String i : words)
        {
            if (i.equals(SearchFor))
            {
                System.out.println("found");
                break;
            }
        }
        */
        boolean found = false;
        int lo = 0, hi = words.length -1;

        while (!found && lo <= hi)
        {
            int mid = (lo+hi)/2;
            if (words[mid].equals(SearchFor))
            {
                found = true;
                System.out.println("found " + mid);
            }
            else if (SearchFor.compareTo(words[mid]) < 0)
                hi = mid -1;
            else
                lo = mid + 1;

        }
    }
}