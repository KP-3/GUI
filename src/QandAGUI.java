import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class QandAGUI extends JFrame implements ActionListener{
    JLabel aslabel = new JLabel("Assertion-filename");
    JTextArea as = new JTextArea(30,20);
    JButton assave = new JButton("save");
    JButton asload = new JButton("load");
    JTextField asfilename = new JTextField(30);
    JTextField rulefilename = new JTextField(40);
    //saveボタン
    JButton rulesave = new JButton("save");
    //loadボタン
    JButton ruleload = new JButton("load");
    JTextArea rule = new JTextArea(20,30);
    JTextField query = new JTextField(50);
    JButton Go = new JButton("Go");

    JDialog dialog = new JDialog();

    JButton ok = new JButton("OK");
    JLabel error = new JLabel();

    public static void main(String args[]){
        QandAGUI frame = new QandAGUI();
        frame.setVisible(true);
    }
    QandAGUI(){


        GridBagLayout layout = new GridBagLayout();
        setSize(600,700);
        getContentPane().setLayout(layout);
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        gbc1.weightx = 50;
        gbc1.weighty = 40;
        JPanel P2 = new JPanel();

        //P2.setBackground(Color.blue);
        gbc1.fill = GridBagConstraints.BOTH;
        layout.setConstraints(P2,gbc1);
        add(P2);
        gbc1.gridy = 1;
        gbc1.weighty = 10;
        JPanel P3 = new JPanel();
        //P3.setBackground(Color.ORANGE);
        layout.setConstraints(P3,gbc1);
        add(P3);
        JPanel P4 = new JPanel();
        //P4.setBackground(Color.GREEN);
        gbc1.gridy=2;
        gbc1.weighty=40;
        layout.setConstraints(P4,gbc1);
        add(P4);

        JPanel P5 = new JPanel();
        JScrollPane s2 = new JScrollPane(as);
        as.setLineWrap(true);

        P5.setLayout(layout);
        GridBagConstraints gbc4 = new GridBagConstraints();
        gbc4.gridx = 0;
        gbc4.gridy = 0;
        gbc4.weighty = 5;
        gbc4.weightx = 100;
        gbc4.insets = new Insets(5,5,5,5);
        gbc4.fill = GridBagConstraints.BOTH;
        layout.setConstraints(aslabel,gbc4);
        P5.add(aslabel);
        gbc4.gridy = 1;
        gbc4.gridwidth = GridBagConstraints.REMAINDER;
        layout.setConstraints(asfilename,gbc4);
        P5.add(asfilename);
        gbc4.gridy = 2;
        gbc4.gridwidth = 1;
        layout.setConstraints(assave,gbc4);
        P5.add(assave);
        gbc4.gridx = 2;
        layout.setConstraints(asload,gbc4);
        P5.add(asload);
        gbc4.gridx = 0;
        gbc4.gridy = 3;
        gbc4.weighty = 80;
        gbc4.gridwidth = GridBagConstraints.REMAINDER;
        layout.setConstraints(s2,gbc4);
        P5.add(s2);

        P2.setLayout(layout);
        GridBagConstraints gbc2 = new GridBagConstraints();


        gbc2.gridx = 0;
        gbc2.gridy = 0;
        gbc2.weightx = 90;
        gbc2.gridheight = GridBagConstraints.REMAINDER;
        gbc2.fill = GridBagConstraints.BOTH;
        gbc2.insets = new Insets(5,5,5,5);
        layout.setConstraints(P5,gbc2);
        P2.add(P5);
        JLabel rulefn = new JLabel("rulelist-filename");
        gbc2.gridx = 1;
        gbc2.weightx = 22;
        gbc2.weighty = 5;
        gbc2.gridwidth = 2;
        gbc2.gridheight = 1;
        layout.setConstraints(rulefn,gbc2);
        P2.add(rulefn);

        gbc2.gridy = 1;
        layout.setConstraints(rulefilename,gbc2);
        P2.add(rulefilename);

        rulesave.addActionListener(this);
        gbc2.gridy = 2;
        gbc2.weightx = 22;
        gbc2.gridwidth = 1;
        layout.setConstraints(rulesave,gbc2);
        P2.add(rulesave);

        ruleload.addActionListener(this);
        gbc2.gridx = 2;
        layout.setConstraints(ruleload,gbc2);
        P2.add(ruleload);

        rule.setLineWrap(true);
        JScrollPane s1 = new JScrollPane(rule);

        gbc2.gridx = 1;
        gbc2.gridy = 3;
        gbc2.weightx = 90;
        gbc2.weighty = 70;
        gbc2.gridwidth = 2;
        gbc2.gridheight = GridBagConstraints.REMAINDER;

        layout.setConstraints(s1,gbc2);
        P2.add(s1);

        Go.addActionListener(this);
        P3.setLayout(layout);
        GridBagConstraints gbc3 = new GridBagConstraints();
        gbc3.fill = GridBagConstraints.HORIZONTAL;
        gbc3.gridx = 0;
        gbc3.gridy = 0;
        gbc3.insets = new Insets(0,3,0,3);
        JLabel question = new JLabel("Please write query");
        layout.setConstraints(question,gbc3);
        P3.add(question);
        gbc3.gridy = 1;
        gbc3.weightx = 90;
        layout.setConstraints(query,gbc3);
        P3.add(query);
        gbc3.gridx = 1;
        gbc3.weightx = 10;
        layout.setConstraints(Go,gbc3);
        P3.add(Go);
        BorderLayout bl = new BorderLayout();
        bl.setVgap(10);
        dialog.setLayout(bl);
        dialog.setSize(300,100);
        ok.setSize(100,80);

        dialog.add(error,BorderLayout.NORTH);
        dialog.add(ok,BorderLayout.CENTER);
        dialog.setVisible(false);
    }
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == rulesave){

            if(rulefilename.getText().equals("")){
                error.setText("Please write rulelist-filename");
                dialog.setVisible(true);
            }else{
                try{
                    String filename = rulefilename.getText();

                }catch(IOException e){

                }
            }
        }else if(event.getSource() == ruleload){

        }else if(event.getSource() == Go){

        }
    }
}