/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import ConnectDB.ConnectDB;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
//
///**
// *
// * @author monte
// */
public class Main1 extends javax.swing.JFrame {
    
    public static JButton getConfirm() {
        return confirm;
    }

    public static void setConfirm(JButton confirm) {
        Main1.confirm = confirm;
    }

    public static JTextField getMyAmountPaid() {
        return myAmountPaid;
    }

    public static void setMyAmountPaid(JTextField myAmountPaid) {
        Main1.myAmountPaid = myAmountPaid;
    }

    public static JCheckBox getMyCbox() {
        return myCbox;
    }

    public static void setMyCbox(JCheckBox myCbox) {
        Main1.myCbox = myCbox;
    }

    public static JLabel getMyChange() {
        return myChange;
    }

    public static void setMyChange(JLabel myChange) {
        Main1.myChange = myChange;
    }

    public static JComboBox getMyComboDest() {
        return myComboDest;
    }

    public static void setMyComboDest(JComboBox myComboDest) {
        Main1.myComboDest = myComboDest;
    }
    
    public JLabel getMyComp() {
        return myComp;
    }

    public void setMyComp(JLabel myComp) {
        this.myComp = myComp;
    }

    public JLabel getMyContactNumber() {
        return myContactNumber;
    }

    public void setMyContactNumber(JLabel myContactNumber) {
        this.myContactNumber = myContactNumber;
    }

    public JLabel getMyDest() {
        return myDest;
    }

    public void setMyDest(JLabel myDest) {
        this.myDest = myDest;
    }

    public static JLabel getMyDestination() {
        return myDestination;
    }

    public static void setMyDestination(JLabel myDestination) {
        Main1.myDestination = myDestination;
    }

    public static JLabel getMyFullName() {
        return myFullName;
    }

    public static void setMyFullName(JLabel myFullName) {
        Main1.myFullName = myFullName;
    }

    public static JLabel getMyGend() {
        return myGend;
    }

    public static void setMyGend(JLabel myGend) {
        Main1.myGend = myGend;
    }

    public JLabel getMyGender() {
        return myGender;
    }

    public void setMyGender(JLabel myGender) {
        this.myGender = myGender;
    }

    public JButton getMyHomeButton() {
        return myHomeButton;
    }

    public void setMyHomeButton(JButton myHomeButton) {
        this.myHomeButton = myHomeButton;
    }

    public static JComboBox getMyInputGen() {
        return myInputGen;
    }

    public static void setMyInputGen(JComboBox myInputGen) {
        Main1.myInputGen = myInputGen;
    }

    public static JTextField getMyInputName() {
        return myInputName;
    }

    public static void setMyInputName(JTextField myInputName) {
        Main1.myInputName = myInputName;
    }

    public static JTextField getMyInputNumber() {
        return myInputNumber;
    }

    public static void setMyInputNumber(JTextField myInputNumber) {
        Main1.myInputNumber = myInputNumber;
    }

    public static JComboBox getMyInputPasType() {
        return myInputPasType;
    }

    public static void setMyInputPasType(JComboBox myInputPasType) {
        Main1.myInputPasType = myInputPasType;
    }

    public static JComboBox getMyInputSeatType() {
        return myInputSeatType;
    }

    public static void setMyInputSeatType(JComboBox myInputSeatType) {
        Main1.myInputSeatType = myInputSeatType;
    }

    public JLabel getMyName() {
        return myName;
    }

    public void setMyName(JLabel myName) {
        this.myName = myName;
    }

    public static JLabel getMyNumber1() {
        return myNumber1;
    }

    public static void setMyNumber1(JLabel myNumber1) {
        Main1.myNumber1 = myNumber1;
    }

    public JLabel getMyPaid() {
        return myPaid;
    }

    public void setMyPaid(JLabel myPaid) {
        this.myPaid = myPaid;
    }

    public JLabel getMyPasType() {
        return myPasType;
    }

    public void setMyPasType(JLabel myPasType) {
        this.myPasType = myPasType;
    }

    public static JLabel getMyPassenger() {
        return myPassenger;
    }

    public static void setMyPassenger(JLabel myPassenger) {
        Main1.myPassenger = myPassenger;
    }

    public static JButton getMyResetBut() {
        return myResetBut;
    }

    public static void setMyResetBut(JButton myResetBut) {
        Main1.myResetBut = myResetBut;
    }

    public static JLabel getMyRush() {
        return myRush;
    }

    public static void setMyRush(JLabel myRush) {
        Main1.myRush = myRush;
    }

    public static JLabel getMySeat() {
        return mySeat;
    }

    public static void setMySeat(JLabel mySeat) {
        Main1.mySeat = mySeat;
    }

    public JLabel getMySeatType() {
        return mySeatType;
    }

    public void setMySeatType(JLabel mySeatType) {
        this.mySeatType = mySeatType;
    }

    public static JLabel getMyTotal1() {
        return myTotal1;
    }

    public static void setMyTotal1(JLabel myTotal1) {
        Main1.myTotal1 = myTotal1;
    }

    public static JButton getMyTransactionBut() {
        return myTransactionBut;
    }

    public static void setMyTransactionBut(JButton myTransactionBut) {
        Main1.myTransactionBut = myTransactionBut;
    }

    public static JButton getTotalAll() {
        return totalAll;
    }

    public static void setTotalAll(JButton totalAll) {
        Main1.totalAll = totalAll;
    }

    /**
     * Creates new form Main1
     */
    public Main1() {
        initComponents();
        
        setLocationRelativeTo(null);
        viewAllTransactions();
        
        Timer timer = new Timer(1000, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                viewAllTransactions();
            }
        });
        
        timer.start();
    }
    
   Connection Con = null;
   PreparedStatement Pst = null;
   ResultSet Rs = null;
   Statement ST = null;
//  
//    /**
//     * This method is called from within the constructor to initialize the form.
//     * WARNING: Do NOT modify this code. The content of this method is always
//     * regenerated by the Form Editor.
//     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myComp = new javax.swing.JLabel();
        myName = new javax.swing.JLabel();
        myInputName = new javax.swing.JTextField();
        myContactNumber = new javax.swing.JLabel();
        myInputNumber = new javax.swing.JTextField();
        myGender = new javax.swing.JLabel();
        myInputGen = new javax.swing.JComboBox();
        myDest = new javax.swing.JLabel();
        myPasType = new javax.swing.JLabel();
        mySeatType = new javax.swing.JLabel();
        myComboDest = new javax.swing.JComboBox();
        myInputPasType = new javax.swing.JComboBox();
        myInputSeatType = new javax.swing.JComboBox();
        myCbox = new javax.swing.JCheckBox();
        myRecDetails = new javax.swing.JLabel();
        myFullName = new javax.swing.JLabel();
        myNumber1 = new javax.swing.JLabel();
        myGend = new javax.swing.JLabel();
        myDestination = new javax.swing.JLabel();
        myPassenger = new javax.swing.JLabel();
        mySeat = new javax.swing.JLabel();
        myRush = new javax.swing.JLabel();
        totalAll = new javax.swing.JButton();
        myHomeButton = new javax.swing.JButton();
        myTotal1 = new javax.swing.JLabel();
        myPaid = new javax.swing.JLabel();
        myAmountPaid = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        myChange = new javax.swing.JLabel();
        myTransactionBut = new javax.swing.JButton();
        myResetBut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        allTransactions = new javax.swing.JTable();
        myId = new javax.swing.JLabel();
        myInputID = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));

        myComp.setBackground(new java.awt.Color(153, 0, 153));
        myComp.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        myComp.setForeground(new java.awt.Color(153, 0, 153));
        myComp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        myComp.setText("      AMOREZ AIRLINE TICKETING");
        myComp.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        myName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        myName.setForeground(new java.awt.Color(153, 0, 153));
        myName.setText("Full Name:");

        myInputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myInputNameActionPerformed(evt);
            }
        });

        myContactNumber.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        myContactNumber.setForeground(new java.awt.Color(153, 0, 153));
        myContactNumber.setText("Contact Number:");

        myInputNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myInputNumberActionPerformed(evt);
            }
        });

        myGender.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        myGender.setForeground(new java.awt.Color(153, 0, 153));
        myGender.setText("Gender:");

        myInputGen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", " " }));
        myInputGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myInputGenActionPerformed(evt);
            }
        });

        myDest.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        myDest.setForeground(new java.awt.Color(153, 0, 153));
        myDest.setText("Destination:");

        myPasType.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        myPasType.setForeground(new java.awt.Color(153, 0, 153));
        myPasType.setText("Passenger Type:");

        mySeatType.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mySeatType.setForeground(new java.awt.Color(153, 0, 153));
        mySeatType.setText("Seat Type:");

        myComboDest.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dumaguete to Cebu", "Dumaguete to Dipolog", "Dumaguete to Palawan", "Dumaguete to Siargao", "Dumaguete to Manila" }));
        myComboDest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myComboDestActionPerformed(evt);
            }
        });

        myInputPasType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Regular", "Student", "Senior Citizen", "Person with Disability", " " }));
        myInputPasType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myInputPasTypeActionPerformed(evt);
            }
        });

        myInputSeatType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Economy", "Premium Class", "Business Class" }));
        myInputSeatType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myInputSeatTypeActionPerformed(evt);
            }
        });

        myCbox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        myCbox.setText("Rush Booking");
        myCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myCboxActionPerformed(evt);
            }
        });

        myRecDetails.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        myRecDetails.setForeground(new java.awt.Color(0, 51, 51));
        myRecDetails.setText("Ticket Receipt Details");

        myFullName.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        myFullName.setForeground(new java.awt.Color(0, 51, 51));
        myFullName.setText("Full Name:");

        myNumber1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        myNumber1.setForeground(new java.awt.Color(0, 51, 51));
        myNumber1.setText("Contact Number:");

        myGend.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        myGend.setForeground(new java.awt.Color(0, 51, 51));
        myGend.setText("Gender:");

        myDestination.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        myDestination.setForeground(new java.awt.Color(0, 51, 51));
        myDestination.setText("Destination:");

        myPassenger.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        myPassenger.setForeground(new java.awt.Color(0, 51, 51));
        myPassenger.setText("Passenger Type:");

        mySeat.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        mySeat.setForeground(new java.awt.Color(0, 51, 51));
        mySeat.setText("Seat Type:");

        myRush.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        myRush.setForeground(new java.awt.Color(0, 51, 51));
        myRush.setText("Rush Booking Fee:");

        totalAll.setBackground(new java.awt.Color(0, 255, 51));
        totalAll.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        totalAll.setText("CONFIRM");
        totalAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalAllActionPerformed(evt);
            }
        });

        myHomeButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        myHomeButton.setText("Back to Home");
        myHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myHomeButtonActionPerformed(evt);
            }
        });

        myTotal1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        myTotal1.setForeground(new java.awt.Color(0, 51, 51));
        myTotal1.setText("Total Amount:");
        myTotal1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                myTotal1CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        myPaid.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        myPaid.setForeground(new java.awt.Color(0, 51, 51));
        myPaid.setText("Amount Paid:");

        myAmountPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myAmountPaidActionPerformed(evt);
            }
        });

        confirm.setBackground(new java.awt.Color(0, 255, 51));
        confirm.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        confirm.setText("CONFIRM");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        myChange.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        myChange.setForeground(new java.awt.Color(0, 51, 51));
        myChange.setText("Change:");
        myChange.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                myChangeAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        myTransactionBut.setBackground(new java.awt.Color(0, 255, 51));
        myTransactionBut.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        myTransactionBut.setText("Save Transaction");
        myTransactionBut.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                myTransactionButAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        myTransactionBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myTransactionButActionPerformed(evt);
            }
        });

        myResetBut.setBackground(new java.awt.Color(255, 51, 51));
        myResetBut.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        myResetBut.setText("Reset");
        myResetBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myResetButActionPerformed(evt);
            }
        });

        allTransactions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Number", "Gender", "Destination", "Ptype", "Stype", "Fee", "Total", "Paid", "Change"
            }
        ));
        allTransactions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                allTransactionsMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(allTransactions);
        if (allTransactions.getColumnModel().getColumnCount() > 0) {
            allTransactions.getColumnModel().getColumn(0).setResizable(false);
            allTransactions.getColumnModel().getColumn(1).setResizable(false);
            allTransactions.getColumnModel().getColumn(2).setResizable(false);
            allTransactions.getColumnModel().getColumn(3).setResizable(false);
            allTransactions.getColumnModel().getColumn(4).setResizable(false);
            allTransactions.getColumnModel().getColumn(5).setResizable(false);
            allTransactions.getColumnModel().getColumn(6).setResizable(false);
            allTransactions.getColumnModel().getColumn(7).setResizable(false);
            allTransactions.getColumnModel().getColumn(8).setResizable(false);
            allTransactions.getColumnModel().getColumn(10).setResizable(false);
        }

        myId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        myId.setForeground(new java.awt.Color(0, 51, 51));
        myId.setText("ID:");

        myInputID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myInputIDActionPerformed(evt);
            }
        });
        myInputID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                myInputIDKeyReleased(evt);
            }
        });

        delete.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        update.setText("Update Ticket");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(myName, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(myComp, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(myInputName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(myDest)
                                    .addComponent(myComboDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(myContactNumber)
                                            .addComponent(myInputNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(myPasType))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(mySeatType)
                                                    .addComponent(myGender)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(myInputGen, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(myCbox)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(myInputPasType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)
                                            .addComponent(myInputSeatType, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(myHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(myRush, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                        .addComponent(mySeat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(myPassenger, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(myDestination, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(myGend, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(myNumber1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(myFullName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(totalAll, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(myRecDetails))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(myTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(myPaid)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(confirm))
                                            .addComponent(myAmountPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(myTransactionBut, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(myChange, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(update))
                                    .addComponent(myResetBut, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(myId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(myInputID, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(myComp, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(myName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myGender, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(myInputName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myInputNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myInputGen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(myDest, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myPasType, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mySeatType, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(myComboDest, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myInputPasType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myInputSeatType, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(myCbox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myRecDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(myFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(myNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(myGend, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myPaid)
                            .addComponent(myAmountPaid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(myDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(myPassenger, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myChange, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mySeat, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(myRush, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalAll, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(myHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(myTransactionBut, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(myResetBut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(myId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(myInputID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewAllTransactions(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = ConnectDB.connectToDB();
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM ticketdata");
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int t = rsmd.getColumnCount();
            
            DefaultTableModel ticketList = (DefaultTableModel) allTransactions.getModel();
            ticketList.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                
                for(int i = 1; i <= t; i++){
                    columnData.add(rs.getInt("id"));
                    columnData.add(rs.getString("fullName"));
                    columnData.add(rs.getString("contactNumber"));
                    columnData.add(rs.getString("gender"));
                    columnData.add(rs.getString("destination"));
                    columnData.add(rs.getString("passenger_type"));
                    columnData.add(rs.getString("seat_type"));
                    columnData.add(rs.getInt("bookingFee"));
                    columnData.add(rs.getDouble("total_amount"));
                    columnData.add(rs.getDouble("amount_paid"));
                    columnData.add(rs.getDouble("bookChange"));
                }
                ticketList.addRow(columnData);
            }
        } catch(Exception ex){
            System.out.println(ex);
        }
    }

    private void myInputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myInputNameActionPerformed

        myFullName.setText("Full Name : " + myInputName.getText());
    }//GEN-LAST:event_myInputNameActionPerformed

    private void myInputNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myInputNumberActionPerformed

        myNumber1.setText("Contact Number : " + myInputNumber.getText());
    }//GEN-LAST:event_myInputNumberActionPerformed

    private void myInputGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myInputGenActionPerformed

        myGend.setText("Gender : " + myInputGen.getSelectedItem());
    }//GEN-LAST:event_myInputGenActionPerformed

    private void myComboDestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myComboDestActionPerformed

        String destination = myComboDest.getSelectedItem().toString();
        
        double dCost;
        switch(destination){
            case "Dumaguete to Cebu":
        dCost = 1500;
                break;
             case "Dumaguete to Dipolog":
        dCost = 3000;
                 break;
             case "Dumaguete to Palawan":
        dCost = 3500;
                 break;
             case "Dumaguete to Siargao":
        dCost = 4000;
                 break;
         case "Dumaguete to Manila":
        dCost = 5000;
             break;
         default:
        dCost = 0.0;
        break;}
        
        myDestination.setText("Destination : " + destination +" (" + dCost +")");
        
    }//GEN-LAST:event_myComboDestActionPerformed

    private void myInputPasTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myInputPasTypeActionPerformed

       String Ptype = myInputPasType.getSelectedItem().toString();
        
        double discount;
        switch(Ptype){
            case "Regular":
        discount = 0;
                break;
             case "Student":
        discount = 500;
                 break;
             case "Senior Citizen":
        discount = 700;
                 break;
             case "Person with Disability":
        discount = 750;
                 break;
                 default:
        discount = 0.0;
        break;
         }
        myPassenger.setText("Passenger Type : " + Ptype +" (" + discount + ")");

    }//GEN-LAST:event_myInputPasTypeActionPerformed

    private void myInputSeatTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myInputSeatTypeActionPerformed

        String Stype = myInputSeatType.getSelectedItem().toString();
        
        double addCost;
        switch(Stype){
            case "Economy":
        addCost = 300;
                break;
             case "Premium Class":
        addCost = 500;
                 break;
             case "Business Class":
        addCost = 1500;
                 break;
                 default:
        addCost = 0.0;
        break;
             }
        mySeat.setText("Seat Type : " + Stype +" (" + addCost + ")");
        
    }//GEN-LAST:event_myInputSeatTypeActionPerformed

    private void myCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myCboxActionPerformed

       boolean isRush = myCbox.isSelected();
        
        double additional = 0;
        if(isRush){
        additional = 50;
        }
        
         myRush.setText("Rush Booking Fee : " + additional );
         
    }//GEN-LAST:event_myCboxActionPerformed

    private void totalAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalAllActionPerformed

        String destination = myComboDest.getSelectedItem().toString();
        String Ptype = myInputPasType.getSelectedItem().toString();
        String Stype = myInputSeatType.getSelectedItem().toString();
        boolean isRush = myCbox.isSelected();
        
        double additional = 0;
        if(isRush){
        additional = 50;
        }
        
        double dCost;
        switch(destination){
            case "Dumaguete to Cebu":
        dCost = 1500;
                break;
             case "Dumaguete to Dipolog":
        dCost = 3000;
                 break;
             case "Dumaguete to Palawan":
        dCost = 3500;
                 break;
             case "Dumaguete to Siargao":
        dCost = 4000;
                 break;
         case "Dumaguete to Manila":
        dCost = 5000;
             break;
         default:
        dCost = 0.0;
        break;}
        
        
        double discount;
        switch(Ptype){
            case "Regular":
        discount = 0;
                break;
             case "Student":
        discount = 500;
                 break;
             case "Senior Citizen":
        discount = 700;
                 break;
             case "Person with Disability":
        discount = 750;
                 break;
                 default:
        discount = 0.0;
        break;
         }
        
        double addCost;
        switch(Stype){
            case "Regular":
        addCost = 0;
                break;
             case "Premium Class":
        addCost = 500;
                 break;
             case "Business Class":
        addCost = 1500;
                 break;
                 default:
        addCost = 0.0;
        break;
             }
        
        double totalPayment = ((dCost - discount)+ (addCost + additional) );
        
        
        myTotal1.setText("Total Amount: " + totalPayment);
    }//GEN-LAST:event_totalAllActionPerformed

    private void myHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myHomeButtonActionPerformed

        Home home = new Home();
        home.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_myHomeButtonActionPerformed

    private void myTotal1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_myTotal1CaretPositionChanged

    }//GEN-LAST:event_myTotal1CaretPositionChanged

    private void myAmountPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myAmountPaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myAmountPaidActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed

      String destination = myComboDest.getSelectedItem().toString();
        String Ptype = myInputPasType.getSelectedItem().toString();
        String Stype = myInputSeatType.getSelectedItem().toString();
        boolean isRush = myCbox.isSelected();
        
        double additional = 0;
        if(isRush){
        additional = 50;
        }
        
        double dCost;
        switch(destination){
            case "Dumaguete to Cebu":
        dCost = 1500;
                break;
             case "Dumaguete to Dipolog":
        dCost = 3000;
                 break;
             case "Dumaguete to Palawan":
        dCost = 3500;
                 break;
             case "Dumaguete to Siargao":
        dCost = 4000;
                 break;
         case "Dumaguete to Manila":
        dCost = 5000;
             break;
         default:
        dCost = 0.0;
        break;}
        
        
        double discount;
        switch(Ptype){
            case "Regular":
        discount = 0;
                break;
             case "Student":
        discount = 500;
                 break;
             case "Senior Citizen":
        discount = 700;
                 break;
             case "Person with Disability":
        discount = 750;
                 break;
                 default:
        discount = 0.0;
        break;
         }
        
        double addCost;
        switch(Stype){
            case "Economy":
        addCost = 300;
                break;
             case "Premium Class":
        addCost = 500;
                 break;
             case "Business Class":
        addCost = 1500;
                 break;
                 default:
        addCost = 0.0;
        break;
             }
        
        double totalPayment = ((dCost - discount)+ (addCost + additional) );
        double amountPaid = Double.parseDouble(myAmountPaid.getText());
        double change = amountPaid - totalPayment;
        
             myChange.setText("Change: " + change);
            
    }//GEN-LAST:event_confirmActionPerformed

    private void myChangeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_myChangeAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_myChangeAncestorAdded

    private void myTransactionButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myTransactionButActionPerformed

    String destination = myComboDest.getSelectedItem().toString();
        String Ptype = myInputPasType.getSelectedItem().toString();
        String Stype = myInputSeatType.getSelectedItem().toString();
        boolean isRush = myCbox.isSelected();
        
        double additional = 0;
        if(isRush){
        additional = 50;
        }
        
        double dCost;
        switch(destination){
            case "Dumaguete to Cebu":
        dCost = 1500;
                break;
             case "Dumaguete to Dipolog":
        dCost = 3000;
                 break;
             case "Dumaguete to Palawan":
        dCost = 3500;
                 break;
             case "Dumaguete to Siargao":
        dCost = 4000;
                 break;
         case "Dumaguete to Manila":
        dCost = 5000;
             break;
         default:
        dCost = 0.0;
        break;}
        
        
        double discount;
        switch(Ptype){
            case "Regular":
        discount = 0;
                break;
             case "Student":
        discount = 500;
                 break;
             case "Senior Citizen":
        discount = 700;
                 break;
             case "Person with Disability":
        discount = 750;
                 break;
                 default:
        discount = 0.0;
        break;
         }
        
        double addCost;
        switch(Stype){
            case "Economy":
        addCost = 300;
                break;
             case "Premium Class":
        addCost = 500;
                 break;
             case "Business Class":
        addCost = 1500;
                 break;
                 default:
        addCost = 0.0;
        break;
             }
        
        double totalPayment = ((dCost - discount)+ (addCost + additional) );
        double amountPaid = Double.parseDouble(myAmountPaid.getText());
        double change = amountPaid - totalPayment;
        
        myTotal1.setText("Total Amount: " + totalPayment);

        
        try{
         Con =  ConnectDB.connectToDB();
         
         String query = "INSERT INTO ticketdata (fullName, contactNumber, gender, destination, passenger_type, seat_type, bookingFee, total_amount, amount_paid, bookChange) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
         Pst = Con.prepareStatement(query);
         
         Pst.setString(1, myInputName.getText());
         Pst.setString(2, myInputNumber.getText());
         Pst.setString(3, myInputGen.getSelectedItem().toString());
         Pst.setString(4, destination);
         Pst.setString(5, Ptype);
         Pst.setString(6, Stype);
         Pst.setBoolean(7, isRush);
         Pst.setDouble(8, totalPayment);
         Pst.setDouble(9, amountPaid);
         Pst.setDouble(10, change);
         
         int rowInserted = Pst.executeUpdate();
         
         if(rowInserted > 0 ){
             
             myChange.setText("Change: " + change);
             JOptionPane.showMessageDialog(this, "Book added Sucessfully");
         
         }else{
             
             
             JOptionPane.showMessageDialog(this, "Book not added");
         
         }
         
         
        }catch(Exception e ){
            
            JOptionPane.showMessageDialog(this, "error" + e.getMessage());
            System.out.println(e);
        
        }
    }//GEN-LAST:event_myTransactionButActionPerformed

    private void myResetButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myResetButActionPerformed

         myInputName.setText("");
        myInputNumber.setText("");
        myInputGen.setSelectedIndex(0);
        myComboDest.setSelectedIndex(0);
        myInputPasType.setSelectedIndex(0);
        myInputSeatType.setSelectedIndex(0);
        myCbox.isSelected();
        myFullName.setText("Full Name: ");
        myNumber1.setText("Contact Number: ");
        myGend.setText("Gender: ");
        myDestination.setText("Destination: ");
        myPassenger.setText("Passenger Type: ");
        mySeat.setText("Seat Type: ");
        myRush.setText("Rush Booking Fee: ");
        myTotal1.setText("Total Amount: ");
        myAmountPaid.setText("");
        myChange.setText("Change: ");
      
    }//GEN-LAST:event_myResetButActionPerformed

    private void myInputIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myInputIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myInputIDActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        try{
         Con =  ConnectDB.connectToDB();
         
         String query = "DELETE FROM `ticketdata` WHERE id = ?";
         Pst = Con.prepareStatement(query);
         
         Pst.setString(1, myInputID.getText());
         
         int rowInserted = Pst.executeUpdate();
         
         if(rowInserted > 0 ){
             
             JOptionPane.showMessageDialog(this, "Deleted Sucessfully");
         
         }else{
             
             
             JOptionPane.showMessageDialog(this, "Delete unsuccessful");
         
         }
         
         
        }catch(Exception e ){
            
            JOptionPane.showMessageDialog(this, "error" + e.getMessage());
            System.out.println(e);
        
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        String destination = myComboDest.getSelectedItem().toString();
        String Ptype = myInputPasType.getSelectedItem().toString();
        String Stype = myInputSeatType.getSelectedItem().toString();
        boolean isRush = myCbox.isSelected();

        double additional = 0;
        if (isRush) {
            additional = 50;
        }

        double dCost;
        switch (destination) {
            case "Dumaguete to Cebu":
                dCost = 1500;
                break;
            case "Dumaguete to Dipolog":
                dCost = 3000;
                break;
            case "Dumaguete to Palawan":
                dCost = 3500;
                break;
            case "Dumaguete to Siargao":
                dCost = 4000;
                break;
            case "Dumaguete to Manila":
                dCost = 5000;
                break;
            default:
                dCost = 0.0;
                break;
        }

        double discount;
        switch (Ptype) {
            case "Regular":
                discount = 0;
                break;
            case "Student":
                discount = 500;
                break;
            case "Senior Citizen":
                discount = 700;
                break;
            case "Person with Disability":
                discount = 750;
                break;
            default:
                discount = 0.0;
                break;
        }

        double addCost;
        switch (Stype) {
            case "Economy":
                addCost = 300;
                break;
            case "Premium Class":
                addCost = 500;
                break;
            case "Business Class":
                addCost = 1500;
                break;
            default:
                addCost = 0.0;
                break;
        }

        double totalPayment = ((dCost - discount) + (addCost + additional));
        double amountPaid = Double.parseDouble(myAmountPaid.getText());
        double change = amountPaid - totalPayment;

        myTotal1.setText("Total Amount: " + totalPayment);

        try {
//            int ticketSelected = allTransactions.getSelectedRow();
            int selectedTicket = (int) allTransactions.getValueAt(0, 0);
        
            Con = ConnectDB.connectToDB();
            String query = "UPDATE ticketdata SET id = ?, fullName = ?, contactNumber = ?, gender = ?, destination = ?, passenger_type = ?, seat_type = ?, bookingFee = ?, total_amount = ?, amount_paid = ?, bookChange = ? WHERE id = ?";
            Pst = Con.prepareStatement(query);

            Pst.setInt(1, selectedTicket);
            Pst.setString(2, myInputName.getText());
            Pst.setString(3, myInputNumber.getText());
            Pst.setString(4, myInputGen.getSelectedItem().toString());
            Pst.setString(5, destination);
            Pst.setString(6, Ptype);
            Pst.setString(7, Stype);
            Pst.setBoolean(8, isRush);
            Pst.setDouble(9, totalPayment);
            Pst.setDouble(10, amountPaid);
            Pst.setDouble(11, change);
            Pst.setInt(12, selectedTicket);

            int rowInserted = Pst.executeUpdate();

            if (rowInserted > 0) {
                myChange.setText("Change: " + change);
                JOptionPane.showMessageDialog(this, "Book update successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Book update unsuccessfull!");
            }

            Con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            System.out.println(e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void myTransactionButAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_myTransactionButAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_myTransactionButAncestorAdded

    private void myInputIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_myInputIDKeyReleased
        
        
        DefaultTableModel ticketTable = (DefaultTableModel) allTransactions.getModel();
        String searchTicket = myInputID.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> ticketTr = new TableRowSorter<DefaultTableModel>(ticketTable);
        allTransactions.setRowSorter(ticketTr);
        ticketTr.setRowFilter(RowFilter.regexFilter(searchTicket, 0));
        
    }//GEN-LAST:event_myInputIDKeyReleased

    private void allTransactionsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allTransactionsMousePressed
        
        try{
            int ticketSelected = (int) allTransactions.getSelectedRow();
            int selectedTicket = (int)  allTransactions.getValueAt(ticketSelected, 0);
            
            Connection conn = ConnectDB.connectToDB();
            String query = "SELECT fullName, contactNumber, gender, destination, passenger_type, seat_type FROM ticketdata WHERE id = ?";
            
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setInt(1, selectedTicket);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                myInputName.setText(rs.getString("fullName"));
                myInputNumber.setText(rs.getString("contactNumber"));
                myInputGen.setSelectedItem(rs.getString("gender"));
                myComboDest.setSelectedItem(rs.getString("destination"));
                myInputPasType.setSelectedItem(rs.getString("passenger_type"));
                myInputSeatType.setSelectedItem(rs.getString("seat_type"));
            } else{
                JOptionPane.showMessageDialog(this, "The ticket id is not found!", "WARNING", JOptionPane.WARNING_MESSAGE);
            }
        } catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_allTransactionsMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allTransactions;
    public static javax.swing.JButton confirm;
    private javax.swing.JButton delete;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField myAmountPaid;
    public static javax.swing.JCheckBox myCbox;
    public static javax.swing.JLabel myChange;
    public static javax.swing.JComboBox myComboDest;
    private javax.swing.JLabel myComp;
    private javax.swing.JLabel myContactNumber;
    private javax.swing.JLabel myDest;
    public static javax.swing.JLabel myDestination;
    public static javax.swing.JLabel myFullName;
    public static javax.swing.JLabel myGend;
    private javax.swing.JLabel myGender;
    private javax.swing.JButton myHomeButton;
    private javax.swing.JLabel myId;
    public static javax.swing.JComboBox myInputGen;
    public static javax.swing.JTextField myInputID;
    public static javax.swing.JTextField myInputName;
    public static javax.swing.JTextField myInputNumber;
    public static javax.swing.JComboBox myInputPasType;
    public static javax.swing.JComboBox myInputSeatType;
    private javax.swing.JLabel myName;
    public static javax.swing.JLabel myNumber1;
    private javax.swing.JLabel myPaid;
    private javax.swing.JLabel myPasType;
    public static javax.swing.JLabel myPassenger;
    private javax.swing.JLabel myRecDetails;
    public static javax.swing.JButton myResetBut;
    public static javax.swing.JLabel myRush;
    public static javax.swing.JLabel mySeat;
    private javax.swing.JLabel mySeatType;
    public static javax.swing.JLabel myTotal1;
    public static javax.swing.JButton myTransactionBut;
    public static javax.swing.JButton totalAll;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    private Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getFullName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getContactNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getGender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getDestination() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getPassenger_type() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getSeat_type() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getBookingFee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getTotal_amount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getAmount_paid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getBookChange() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the Con
     */
}
