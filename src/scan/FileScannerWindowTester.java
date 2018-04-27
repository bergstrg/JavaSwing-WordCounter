package scan;

/**
 * Created by Gabriel Bergstrom on 10/3/17.
 * This class is used for the testing of the FileScannerWindow.
 * There are three instances of the window that are created with different values for userTextFile for testing the
 * result area for scroll-ability.
 * With the instances where there are values being set with setUserTextFile
 * it is important not to press the browse button and to only select the scan button so that the values are not overwritten.
 * This will test for if the text area has text wrapping and scrolling.
 */
public class FileScannerWindowTester {
    public static void main(String[] args) {

        /**
         * This tests for the normal work flow of selecting a file and then scanning.
         * The output for this test will be the path of the file selected.
         */
        FileScannerWindow tw = new FileScannerWindow();
        tw.setVisible(true);

        /**
         * This tests for line wrapping within the text area. This is an instance where you should only press
         * the scan button.
         */
       /* FileScannerWindow tw1 = new FileScannerWindow();
        tw1.setVisible(true);
        tw1.setUserTextFile("$$@@##!!%%^^&&**Gabe,GabeGABE!!!!!!!!!!{)4$$Gabe$$@@##!!%%^^&&**Gabe,GaBe GABE!!!!!!!!!!{4$$Gabe,Gabe,Gabe$$Gabe,Gabe$$");
        */

        /**
         * This tests for scrolling when the results are too large for the size of the text area.
         * This is another instance where you should only press the scan button.
         */
       /*
        FileScannerWindow tw2 = new FileScannerWindow();
        tw2.setVisible(true);
        tw2.setUserTextFile("***The Project Gutenberg's Etext of Shakespeare's First Folio***\n" +
                "*********************The Tragedie of Hamlet*********************\n" +
                "\n" +
                "This is our 3rd edition of most of these plays.  See the index.\n" +
                "\n" +
                "\n" +
                "Copyright laws are changing all over the world, be sure to check\n" +
                "the copyright laws for your country before posting these files!!\n" +
                "\n" +
                "Please take a look at the important information in this header.\n" +
                "We encourage you to keep this file on your own disk, keeping an\n" +
                "electronic path open for the next readers.  Do not remove this.\n" +
                "\n" +
                "\n" +
                "**Welcome To The World of Free Plain Vanilla Electronic Texts**\n" +
                "\n" +
                "**Etexts Readable By Both Humans and By Computers, Since 1971**\n" +
                "\n" +
                "*These Etexts Prepared By Hundreds of Volunteers and Donations*\n" +
                "\n" +
                "Information on contacting Project Gutenberg to get Etexts, and\n" +
                "further information is included below.  We need your donations.\n" +
                "\n" +
                "\n" +
                "The Tragedie of Hamlet\n" +
                "\n" +
                "by William Shakespeare\n" +
                "\n" +
                "July, 2000  [Etext #2265]\n" +
                "\n" +
                "\n" +
                "***The Project Gutenberg's Etext of Shakespeare's First Folio***\n" +
                "*********************The Tragedie of Hamlet*********************\n" +
                "\n" +
                "*****This file should be named 2265.txt or 2265.zip******\n" +
                "\n" +
                "Project Gutenberg Etexts are usually created from multiple editions,\n" +
                "all of which are in the Public Domain in the United States, unless a\n" +
                "copyright notice is included.  Therefore, we usually do NOT keep any\n" +
                "of these books in compliance with any particular paper edition.\n" +
                "\n" +
                "\n" +
                "We are now trying to release all our books one month in advance\n" +
                "of the official release dates, leaving time for better editing.\n" +
                "\n" +
                "Please note:  neither this list nor its contents are final till\n" +
                "midnight of the last day of the month of any such announcement.\n" +
                "The official release date of all Project Gutenberg Etexts is at\n" +
                "Midnight, Central Time, of the last day of the stated month.  A\n" +
                "preliminary version may often be posted for suggestion, comment\n" +
                "and editing by those who wish to do so.  To be sure you have an\n" +
                "up to date first edition [xxxxx10x.xxx] please check file sizes\n" +
                "in the first week of the next month.  Since our ftp program has\n" +
                "a bug in it that scrambles the date [tried to fix and failed] a\n" +
                "look at the file size will have to do, but we will try to see a\n" +
                "new copy has at least one byte more or less.\n" +
                "\n" +
                "\n" +
                "Information about Project Gutenberg (one page)\n" +
                "\n" +
                "We produce about two million dollars for each hour we work.  The\n" +
                "time it takes us, a rather conservative estimate, is fifty hours\n" +
                "to get any etext selected, entered, proofread, edited, copyright\n" +
                "searched and analyzed, the copyright letters written, etc.  This\n" +
                "projected audience is one hundred million readers.  If our value\n" +
                "per text is nominally estimated at one dollar then we produce $2\n" +
                "million dollars per hour this year as we release thirty-six text\n" +
                "files per month, or 432 more Etexts in 1999 for a total of 2000+\n" +
                "If these reach just 10% of the computerized population, then the\n" +
                "total should reach over 200 billion Etexts given away this year.\n" +
                "\n" +
                "The Goal of Project Gutenberg is to Give Away One Trillion Etext\n" +
                "Files by December 31, 2001.  [10,000 x 100,000,000 = 1 Trillion]\n" +
                "This is ten thousand titles each to one hundred million readers,\n" +
                "which is only ~5% of the present number of computer users.\n" +
                "\n" +
                "At our revised rates of production, we will reach only one-third\n" +
                "of that goal by the end of 2001, or about 3,333 Etexts unless we\n" +
                "manage to get some real funding; currently our funding is mostly\n" +
                "from Michael Hart's salary at Carnegie-Mellon University, and an\n" +
                "assortment of sporadic gifts; this salary is only good for a few\n" +
                "more years, so we are looking for something to replace it, as we\n" +
                "don't want Project Gutenberg to be so dependent on one person.\n" +
                "\n" +
                "We need your donations more than ever!\n");
                */
    }
}
