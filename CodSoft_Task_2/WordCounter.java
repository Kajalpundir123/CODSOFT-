import java.awt.event.*;
import javax.swing.*;
public class WordCounter extends JFrame implements ActionListener
{
  private  JLabel countLabel;
   private JTextArea textArea;
   private JButton countButton;

 public  WordCounter()
  {
    super(" Word Counter");
    //Create text area and count button
    textArea =new JTextArea(10,30);
    countButton= new JButton("count");
    //Create count label with initial value of zero
    countLabel=new JLabel("Word Count: 0");
    //Add components to frame
    JPanel panel= new JPanel();
    panel.add (new JScrollPane(textArea));
    panel.add(countButton);
    panel.add(countLabel);
    add(panel);

    //Register action listener for count button
    countButton.addActionListener(this);

    //Set frame properties
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);
  } 
    public void actionPerformed(ActionEvent e)
    {
     //Get text from text area
     String text=textArea.getText();
     //Split text into words
     String[] words=text.split("\\s+");
     //Count number of words
     int count=words.length;
     //Update count label
     countLabel.setText("Word Count:"+ count);
    }

    public static void main(String[] args)
    {
      new WordCounter();
    }
  }
