package viewModel;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    leftPanel LPanel=new leftPanel();
    RightPanel RPanel = new RightPanel();

 public MyFrame(){
     super("Sales Invoice Generator (SIG) ");
     setSize(1500, 550);
     setLocation(0 , 10);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     add(LPanel);
     add(RPanel);

 }

}
class leftPanel extends JPanel {
    JButton btn0 = new JButton("Create New Invoice");
    JButton btn1 = new JButton("Delete Invoice");
  String[][] data={
            {" ", " ", " "},{" "," "," "},{" "," "," "}
    };

    String[] colNames = { "No.", "Date", "Customer" ,/*"Total"*/};
    // Initializing the JTable
    JTable j = new JTable(data, colNames);
    JScrollPane sp = new JScrollPane(j);
   leftPanel(){
       //setBackground(Color.RED);
       setBounds(0,0,600,550);
       setBorder(BorderFactory.createLineBorder(Color.black));
       add(sp);
       add(btn0);
       add(btn1);

   }


}
class  RightPanel extends JPanel {
    String[][] data={
            {" ", " ", " "},{" "," "," "},{" "," "," "}
    };

    String[] colNames = { "No.", "Item Name", "Item Price" ,/*"count"*/};
    // Initializing the JTable
    JTable j = new JTable(data, colNames);
    JScrollPane sp1 = new JScrollPane(j);
    JTextField txt1 =new JTextField(15);
    JTextField txt2 =new JTextField(15);
    JLabel label0 = new JLabel("Invoice Number:    23\n");

    //Label label1 = new Label("                                   Invoice Date:        ");

    RightPanel(){

        //setBackground(Color.BLACK);
        setBounds(1,1,500,550);
        setBorder(BorderFactory.createLineBorder(Color.black));
        setLayout(new FlowLayout());
        add(label0);

       // add(sp1);
       // add(label1);



    }


}
