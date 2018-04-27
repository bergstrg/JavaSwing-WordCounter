package scan;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFrame;

/**
 * @author Gabriel Bergstrom
 *         This class is for the creation of the graphical user interface and the functions that go along with that.
 *         This is where the user will be able to browse and select text files to be scanned by the FileScanner class.
 *         Once the FileScanner class has returned the results this class will take those results and display them for the user.
 */
public class FileScannerWindow extends JFrame {
    private Component yourFrame;
    private String userTextFile;

    JButton scanFileButton = new JButton("Scan File");
    JButton fileButton = new JButton("Select File");
    JTextField enteredPath = new JTextField(200);
    JLabel filePath = new JLabel("File:");
    JFrame frame = new JFrame("File Scanning Results");
    JTextArea scannerResults = new JTextArea();
    JScrollPane scroll = new JScrollPane(scannerResults);

    /**
     * This function generates the application window where the user selects a text file and selects to scan the text file.
     * When a user selects a text file, the name of the file will be displayed as a way for the user to insure this is the
     * desired file.
     */
    public FileScannerWindow() {
        this.setTitle("Text File Scanner");
        this.setBounds(400, 300, 350, 200);
        this.getContentPane().setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        this.scanFileButton.setBounds(200, 60, 100, 30);
        this.getContentPane().add(scanFileButton);
        this.scanFileButton.addActionListener(new ButtonListener());

        this.fileButton.setBounds(60, 60, 100, 30);
        this.getContentPane().add(fileButton);
        this.fileButton.addActionListener(new FileButtonListener());

        this.enteredPath.setBounds(40, 20, 300, 30);
        this.getContentPane().add(enteredPath);
        this.enteredPath.setEditable(false);

        this.filePath.setBounds(10, 20, 100, 30);
        this.getContentPane().add(filePath);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This function is listening for the "Scan" button to be pressed.
     * When pressed this function has error handling for if the user clicks before selecting a txt file.
     * If the user has selected a txt file then this function will pass in the selected file to the FileScanner class.
     * After the FileScanner has been executed and the results have been returned this function will then generate a new
     * JFrame where the results will be displayed.
     */
    private void theButtonHasBeenPushed() {
        if (userTextFile != null) {
            String scanResults = fileScan();
            this.frame.setSize(700, 700);
            this.frame.setResizable(true);
            this.frame.add(scroll);
            this.frame.setVisible(true);
            this.frame.setBounds(20, 20, 700, 700);
            this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


            this.scannerResults.setSize(400, 400);
            this.scannerResults.setLineWrap(true);
            this.scannerResults.setEditable(false);
            this.scannerResults.setVisible(true);
            this.scannerResults.setText(scanResults);

            this.scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            this.scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            this.scannerResults.setCaretPosition(0);
        } else {
            JOptionPane.showMessageDialog(yourFrame,
                    "Please select a text file before scanning!",
                    "No text file selected",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    /**
     * @return This function returns the results of the FileScanner class: function fileScanner
     * The number of different words,total word count, and each individual word with the count of how many times they appear in the file
     */
    private String fileScan() {
        String results;
        Scanner scan = new Scanner(getUserTextFile());
        FileScanner scanFile = new FileScanner();
        scanFile.fileScanner(scan);
        return results = "Total Number of Words: " + scanFile.getTotalWordCount() + "\n" +
                "Total Number of Different Words: " + scanFile.getDifferentWordCount() + "\n"
                + scanFile.getScannerResults();
    }

    /**
     * This functions is the button listener for the Scan button
     * When a user hits this button it will check if the user has selected text file, if not an error message will appear.
     * If a valid file has been passed in then it will be passed to the FileScanner Class.
     */
    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            FileScannerWindow.this.theButtonHasBeenPushed();
        }
    }

    /**
     * This functions is the button listener for the file browse button.
     * When a user selects a text file, the file path will be saved to be passed into the scanner.
     */
    private class FileButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(new FileNameExtensionFilter(".txt ", "txt", "text"));
            int chooserSuccess = chooser.showOpenDialog(null);
            if (chooserSuccess == JFileChooser.APPROVE_OPTION) {
                File chosenFile = chooser.getSelectedFile();
                enteredPath.setText(chosenFile.getName());
                setUserTextFile(chosenFile.getAbsolutePath());
            } else {
            }
        }
    }

    /**
     * @param userTextFile This setter is used to set the file path of the selected text file by the user to pass into the
     *                     FileScanner Class.
     */
    private void setUserTextFile(String userTextFile) {
        this.userTextFile = userTextFile;
    }

    /**
     * @return The file path of the selected text file by the user.
     */
    public String getUserTextFile() {
        return userTextFile;
    }

    /**
     * This launches the application.
     */
    public static void main(String[] args) {
        FileScannerWindow fileScan = new FileScannerWindow();
        fileScan.setVisible(true);
    }
}


