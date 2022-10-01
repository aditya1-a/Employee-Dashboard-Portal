
import java.awt.Component;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author anupamaditya
 */
public class MainFrame extends javax.swing.JFrame {

    

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        TFName = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        TFEmpID = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        TFAge = new javax.swing.JTextField();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        TFStartDate = new javax.swing.JTextField();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        TFTeamInfo = new javax.swing.JTextField();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        TFPositionTitle = new javax.swing.JTextField();
        javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
        TFCellPhoneNo = new javax.swing.JTextField();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
        TFEmailAdd = new javax.swing.JTextField();
        javax.swing.JButton BtnCreate = new javax.swing.JButton();
        javax.swing.JButton BtnUpdate = new javax.swing.JButton();
        BtnBrowse = new javax.swing.JButton();
        image_txt = new javax.swing.JTextField();
        TFLevel = new javax.swing.JComboBox<>();
        TFGender = new javax.swing.JComboBox<>();
        javax.swing.JButton BtnDelete = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        TableEmp = new javax.swing.JTable();
        TFSearch = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/man.png"))); // NOI18N
        jLabel1.setText("List of Employees");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("List Of Employees"));
        jPanel2.setOpaque(false);

        jLabel2.setText("Name");

        TFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNameActionPerformed(evt);
            }
        });
        TFName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFNameKeyPressed(evt);
            }
        });

        jLabel3.setText("Employee ID");

        jLabel4.setText("Age");

        TFAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFAgeKeyPressed(evt);
            }
        });

        jLabel5.setText("Gender");

        jLabel6.setText("Start Date");

        jLabel7.setText("Level");

        jLabel8.setText("Team Info");

        TFTeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFTeamInfoActionPerformed(evt);
            }
        });

        jLabel9.setText("Position Title");

        jLabel10.setText("Cell Phone No");

        TFCellPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCellPhoneNoActionPerformed(evt);
            }
        });
        TFCellPhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFCellPhoneNoKeyPressed(evt);
            }
        });

        jLabel11.setText("Email Address");

        TFEmailAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFEmailAddActionPerformed(evt);
            }
        });

        BtnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        BtnCreate.setText("Create");
        BtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateActionPerformed(evt);
            }
        });

        BtnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eraser.png"))); // NOI18N
        BtnUpdate.setText("Update");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        BtnBrowse.setText("Browse for Image");
        BtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBrowseActionPerformed(evt);
            }
        });

        TFLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" }));

        TFGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TFEmailAdd, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFPositionTitle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFTeamInfo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFStartDate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFAge, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFEmpID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFCellPhoneNo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnBrowse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(image_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(TFLevel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TFGender, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFCellPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnBrowse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(image_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCreate)
                    .addComponent(BtnUpdate)))
        );

        BtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin.png"))); // NOI18N
        BtnDelete.setText("Delete");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        TableEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "EmpID", "Age", "Gender", "StartDate", "Level", "Team Info", "Position Title", "CellNo", "Email", "imageicon"
            }
        ));
        TableEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableEmpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableEmp);

        TFSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFSearchKeyReleased(evt);
            }
        });

        jLabel12.setText("Search");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 51, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnDelete)
                            .addComponent(TFSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFTeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFTeamInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFTeamInfoActionPerformed

    private void TFCellPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCellPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCellPhoneNoActionPerformed

    private void TFEmailAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFEmailAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFEmailAddActionPerformed

   
  
    private void BtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateActionPerformed
        String name = TFName.getText();
        String empid = TFEmpID.getText();
        String age = TFAge.getText();
        String gender = TFGender.getSelectedItem().toString();
        String startdate = TFStartDate.getText();
        String level = TFLevel.getSelectedItem().toString();
        String teaminfo = TFTeamInfo.getText();
        String positiontitle = TFPositionTitle.getText();
        String cellphoneno = TFCellPhoneNo.getText();
        String email = TFEmailAdd.getText();
        String image = image_txt.getText();
        
         TableEmp.getColumn("imageicon").setCellRenderer(new myTableCellRenderer());
  
             JLabel ImageLabel = new JLabel();        
             ImageIcon imageicon = new ImageIcon(image);
             //Resize image to fixed dimension 60 *60 (width and height)
             Image ImageIC = imageicon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
             //storimng image in JLabel
             ImageLabel.setIcon(new ImageIcon(ImageIC));
       
        
        if (name.isEmpty() || empid.isEmpty()|| age.isEmpty() || gender.isEmpty()|| startdate.isEmpty() 
                || level.isEmpty() || teaminfo.isEmpty() || positiontitle.isEmpty() || 
                cellphoneno.isEmpty() || email.isEmpty() ||image.isEmpty()){
            JOptionPane.showMessageDialog(this,
                    "Please enter all fields",
                    "Try Again",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        else {
            DefaultTableModel model = (DefaultTableModel) TableEmp.getModel();
            model.addRow( new Object[] {name, empid, age, gender, startdate, level, teaminfo, 
                positiontitle, cellphoneno, email, ImageLabel});
        
            
            
            
            TFName.setText("");
            TFEmpID.setText("");
            TFAge.setText("");
            TFGender.setSelectedIndex(0);
            TFStartDate.setText("");
            TFLevel.setSelectedIndex(0);
            TFTeamInfo.setText("");
            TFPositionTitle.setText("");
            TFCellPhoneNo.setText("");
            TFEmailAdd.setText("");
            image_txt.setText("");
            
            
        } 
        
    }//GEN-LAST:event_BtnCreateActionPerformed
    class myTableCellRenderer implements TableCellRenderer{
        
        public Component getTableCellRendererComponent (JTable table, Object value, boolean isSelected, 
                boolean hasFocus, int row, int column){
            
            //Change Image column minimum width and maximum width
            TableColumn tb = TableEmp.getColumn("imageicon");
            tb.setMaxWidth(60);
            
            TableEmp.setRowHeight(60);
            return (Component) value;
        }
    } 
    
    
    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        // TODO add your handling code here:
        //Get table Model
        DefaultTableModel model = (DefaultTableModel) TableEmp.getModel();
        if (TableEmp.getSelectedRowCount()==1){
            //if single row is selected then update
            String name = TFName.getText();
            String empid = TFEmpID.getText();
            String age = TFAge.getText();
            String gender = TFGender.getSelectedItem().toString();
            String startdate = TFStartDate.getText();
            String level = TFLevel.getSelectedItem().toString();
            String teaminfo = TFTeamInfo.getText();
            String positiontitle = TFPositionTitle.getText();
            String cellphoneno = TFCellPhoneNo.getText();
            String email = TFEmailAdd.getText();
            //String image = TFImage.getText();
            
            //Set updated value on table row
            model.setValueAt(name, TableEmp.getSelectedRow(),0);
            model.setValueAt(empid, TableEmp.getSelectedRow(),1);
            model.setValueAt(age, TableEmp.getSelectedRow(),2);
            model.setValueAt(gender, TableEmp.getSelectedRow(),3);
            model.setValueAt(startdate, TableEmp.getSelectedRow(),4);
            model.setValueAt(level, TableEmp.getSelectedRow(),5);
            model.setValueAt(teaminfo, TableEmp.getSelectedRow(),6);
            model.setValueAt(positiontitle, TableEmp.getSelectedRow(),7);
            model.setValueAt(cellphoneno, TableEmp.getSelectedRow(),8);
            model.setValueAt(email, TableEmp.getSelectedRow(),9);
   //         model.setValueAt(image, TableEmp.getSelectedRow(),10);
            
            //upadte message display
            JOptionPane.showMessageDialog(this, "Update Successfully");
        } else{
            if(TableEmp.getRowCount()==0){
                //if table is empty
                JOptionPane.showMessageDialog(this, "table is empty");
            } else {
                //if row is not selected or multiple row is selected
                JOptionPane.showMessageDialog(this, "Please select single row for update");
            }
        }
           
            TFName.setText("");
            TFEmpID.setText("");
            TFAge.setText("");
            TFGender.setSelectedIndex(0);
            TFStartDate.setText("");
            TFLevel.setSelectedIndex(0);
            TFTeamInfo.setText("");
            TFPositionTitle.setText("");
            TFCellPhoneNo.setText("");
            TFEmailAdd.setText("");
            image_txt.setText("");
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        int row = TableEmp.getSelectedRow();
        
        if (row <0){
            JOptionPane.showMessageDialog(this,
                    "No row is selected! Please select one row",
                    "Select row",
                    JOptionPane.ERROR_MESSAGE);
            
        } else{
            DefaultTableModel model  = (DefaultTableModel) TableEmp.getModel();
            model.removeRow(row);
        }
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void TableEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableEmpMouseClicked
        // set data to textfield
        
        DefaultTableModel model  = (DefaultTableModel) TableEmp.getModel();
        
        //set data to text field when row is selected
        String TableName = model.getValueAt(TableEmp.getSelectedRow(), 0).toString();
        String TableEmpID = model.getValueAt(TableEmp.getSelectedRow(), 1).toString();
        String TableAge = model.getValueAt(TableEmp.getSelectedRow(), 2).toString();
        String TableGender = model.getValueAt(TableEmp.getSelectedRow(), 3).toString();
        String TableStartDate = model.getValueAt(TableEmp.getSelectedRow(), 4).toString();
        String TableLevel = model.getValueAt(TableEmp.getSelectedRow(), 5).toString();
        String TableTeamInfo = model.getValueAt(TableEmp.getSelectedRow(), 6).toString();
        String TablePositionTitle = model.getValueAt(TableEmp.getSelectedRow(), 7).toString();
        String TableCellNo = model.getValueAt(TableEmp.getSelectedRow(), 8).toString();
        String TableEmail = model.getValueAt(TableEmp.getSelectedRow(), 9).toString();
        String TableImage = model.getValueAt(TableEmp.getSelectedRow(), 10).toString();
        //set to textField
        
        TFName.setText(TableName);
        TFEmpID.setText(TableEmpID);
        TFAge.setText(TableAge);
        TFGender.setSelectedItem(TableGender);
        TFStartDate.setText(TableStartDate);
        TFLevel.setSelectedItem(TableLevel);
        TFTeamInfo.setText(TableTeamInfo);
        TFPositionTitle.setText(TablePositionTitle);
        TFCellPhoneNo.setText(TableCellNo);
        TFEmailAdd.setText(TableEmail);
        //TFImage.setText(TableImage);
        
        
        
    }//GEN-LAST:event_TableEmpMouseClicked

    public void search(String str){
        DefaultTableModel model = (DefaultTableModel)TableEmp.getModel();
         TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(model);
         TableEmp.setRowSorter(trs);
         trs.setRowFilter(RowFilter.regexFilter(str));
    }
    
    private void TFSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFSearchKeyReleased
         // TODO add your handling code here:
         String search = TFSearch.getText();
         search(search);
         
    }//GEN-LAST:event_TFSearchKeyReleased

    private void BtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        //Filter image extensions
        FileNameExtensionFilter Fnef = new FileNameExtensionFilter("Image", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(Fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION){
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            image_txt.setText(selectedImagePath);
            JOptionPane.showMessageDialog(null, selectedImagePath);
            
            //Display image on Label
            //ImageIcon imageicon = new ImageIcon(selectedImagePath);
            //Resize image to fit on Label
            //Image image = imageicon.getImage().getScaledInstance(TFImage.getWidth(),TFImage.getHeight(),Image.SCALE_SMOOTH);
            //TFImage.setIcon(new ImageIcon(image));
        }
        
    }//GEN-LAST:event_BtnBrowseActionPerformed

    private void TFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNameActionPerformed

    private void TFCellPhoneNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFCellPhoneNoKeyPressed
        // TODO add your handling code here:
        String CellNumber = TFCellPhoneNo.getText();
        int length = CellNumber.length();
        char c = evt.getKeyChar();
        
        //check for number 0 to 9
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            //check for length not more than 10 digit
            if(length<10){
                TFCellPhoneNo.setEditable(true);
                
            } else{
                TFCellPhoneNo.setEditable(false);
            }
        }else{
            if (evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                TFCellPhoneNo.setEditable(true);
            } else{
                TFCellPhoneNo.setEditable(false);
            }
        }
        
    }//GEN-LAST:event_TFCellPhoneNoKeyPressed

    private void TFAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFAgeKeyPressed
        // TODO add your handling code here:
        String CellNumber = TFAge.getText();
        int length = CellNumber.length();
        char c = evt.getKeyChar();
        
        //check for number 0 to 1
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            //check for length not more than 10 digit
            if(length<2){
                TFAge.setEditable(true);
                
            } else{
                TFAge.setEditable(false);
            }
        }else{
            if (evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                TFAge.setEditable(true);
            } else{
                TFAge.setEditable(false);
            }
        }
    }//GEN-LAST:event_TFAgeKeyPressed

    private void TFNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFNameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c) || Character.isWhitespace(c )|| Character.isISOControl(c)){
            TFName.setEditable(true);
        } else {
            TFName.setEditable(false);
        }
    }//GEN-LAST:event_TFNameKeyPressed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBrowse;
    private javax.swing.JTextField TFAge;
    private javax.swing.JTextField TFCellPhoneNo;
    private javax.swing.JTextField TFEmailAdd;
    private javax.swing.JTextField TFEmpID;
    private javax.swing.JComboBox<String> TFGender;
    private javax.swing.JComboBox<String> TFLevel;
    private javax.swing.JTextField TFName;
    private javax.swing.JTextField TFPositionTitle;
    private javax.swing.JTextField TFSearch;
    private javax.swing.JTextField TFStartDate;
    private javax.swing.JTextField TFTeamInfo;
    private javax.swing.JTable TableEmp;
    private javax.swing.JTextField image_txt;
    private javax.swing.JLabel jLabel12;
    // End of variables declaration//GEN-END:variables
}


