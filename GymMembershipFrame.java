/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Student
 */
public class GymMembershipFrame extends JFrame {

    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel idNoPnl;
    private JPanel genderPnl;
    private JPanel clientPnl;
    private JPanel membershpPnl;
    private JPanel btnPnl;
    private JPanel headingClientPnl;
    private JPanel membershipCommentPnl;
    private JPanel personalTrainerpnl;
    private JPanel contractPnl;
    private JPanel commentPnl;
    private JPanel mainPnl;

    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel idNoLbl;
    private JLabel genderLbl;
    private JLabel personalTrainerLbl;
    private JLabel contractLbl;

    private JTextField nametxf;
    private JTextField surnametxf;
    private JTextField idNotxf;

    private JComboBox genderBox;

    private JRadioButton m2mbtn;
    private JRadioButton sixMonthbtn;
    private JRadioButton annualbtn;

    private JCheckBox personalTrainerbox;

    private ButtonGroup btnGrp;

    private JTextArea commentArea;

    private JScrollPane ScrollableTxtArea;

    private JButton applyBtn;

    public GymMembershipFrame() {

        setTitle("Gym membership");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idNoPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        clientPnl = new JPanel(new GridLayout(4,1,1,1));
        clientPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Client details"));
       
        personalTrainerpnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contractPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        membershpPnl = new JPanel(new GridLayout(2,1,1,1));
        membershpPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Contract Options"));
        
        commentPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
                
        headingClientPnl = new JPanel(new BorderLayout());
        membershipCommentPnl = new JPanel(new BorderLayout());
        btnPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));            
        mainPnl = new JPanel(new BorderLayout());
        
        headingLbl = new JLabel("Membership Form");
        headingLbl.setFont(new Font(Font.SANS_SERIF,Font.ITALIC + Font.BOLD,20));
        headingLbl.setForeground(Color.MAGENTA);
        
        nameLbl = new JLabel("Name:         ");
        surnameLbl = new JLabel("Surname:   ");
        idNoLbl = new JLabel("Id no:        ");
        genderLbl = new JLabel("Gender:     ");
        contractLbl = new JLabel("Type of contract:  ");
        personalTrainerLbl = new JLabel("select the checkbox if you need a personal trainer  ");
        
        nametxf = new JTextField(10);
        surnametxf = new JTextField(10);
        idNotxf = new JTextField(10);
        
        genderBox = new JComboBox();
        genderBox.addItem("Male");
        genderBox.addItem("Female");
        
        m2mbtn = new JRadioButton("Month-to-Month");
        sixMonthbtn = new JRadioButton("six Month");
        annualbtn = new JRadioButton("Annual");
        
        personalTrainerbox = new JCheckBox();
        
        btnGrp = new ButtonGroup();
        btnGrp.add(m2mbtn);
        btnGrp.add(sixMonthbtn);
        btnGrp.add(annualbtn);
        
        commentArea = new JTextArea(20,40);
        commentArea.setBorder(new TitledBorder(new LineBorder(Color.BLACK),"Comments"));
        
        ScrollableTxtArea = new JScrollPane(commentArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS , JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        applyBtn = new JButton("Apply");
        
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nametxf);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnametxf);
        
        idNoPnl.add(idNoLbl);
        idNoPnl.add(idNotxf);
        
        genderPnl.add(genderLbl);
        genderPnl.add(genderBox);
        
        clientPnl.add(namePnl);
        clientPnl.add(surnamePnl);
        clientPnl.add(idNoPnl);
        clientPnl.add(genderPnl);
        
        headingClientPnl.add(headingPnl,BorderLayout.NORTH);
        headingClientPnl.add(clientPnl,BorderLayout.CENTER);
        
        contractPnl.add(contractLbl);
        contractPnl.add(m2mbtn);
        contractPnl.add(sixMonthbtn);
        contractPnl.add(annualbtn);
        
        personalTrainerpnl.add(personalTrainerLbl);
        personalTrainerpnl.add(personalTrainerbox);
        
        membershpPnl.add(contractPnl);
        membershpPnl.add(personalTrainerpnl);
        
        commentPnl.add(ScrollableTxtArea);
        
        membershipCommentPnl.add(membershpPnl,BorderLayout.NORTH);
        membershipCommentPnl.add(commentPnl , BorderLayout.CENTER);
        
        btnPnl.add(applyBtn);
        
        mainPnl.add(headingClientPnl,BorderLayout.NORTH);
        mainPnl.add(membershipCommentPnl, BorderLayout.CENTER);
        mainPnl.add(btnPnl , BorderLayout.SOUTH);
        
        add(mainPnl);
        
        
        
        pack();
        setVisible(true);
    }
    
    

}
