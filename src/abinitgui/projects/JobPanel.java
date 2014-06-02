/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abinitgui.projects;

import abinitgui.core.MainFrame;
import abinitgui.mdtb.ClustepSimulation;
import abinitgui.mdtb.TightBindingSimulationOld;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class JobPanel extends javax.swing.JPanel {

    private Machine currentMachine;
    private Project currentProject;
    private Simulation currentSimu;
    private SimulationPanel currentPanel;
    
    /**
     * Creates new form JobPanel
     */
    public JobPanel() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        simuList = new javax.swing.JList();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        tabbedPane = new javax.swing.JTabbedPane();
        inputPanel2 = new javax.swing.JPanel();
        clustepPanel1 = new abinitgui.mdtb.ClustepPanel();
        tightBindingPanel1 = new abinitgui.mdtb.TightBindingPanel();
        abinitInputPanel1 = new abinitgui.projects.AbinitInputPanel();
        tightBindingPanelOld1 = new abinitgui.mdtb.TightBindingPanelOld();
        jPanel1 = new javax.swing.JPanel();
        submissionScriptPanel1 = new abinitgui.projects.SubmissionScriptPanel();
        nameSimuLabel = new javax.swing.JLabel();
        nameSimuTextField = new javax.swing.JTextField();
        saveButton1 = new javax.swing.JButton();
        openLOGButton = new javax.swing.JButton();
        openOUTButton = new javax.swing.JButton();
        pspPathTextField = new javax.swing.JTextField();
        pspPathLabel = new javax.swing.JLabel();
        newButton1 = new javax.swing.JButton();
        machineCombo = new javax.swing.JComboBox();
        machineLabel = new javax.swing.JLabel();

        simuList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        simuList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                simuListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(simuList);

        newButton.setText("New Abinit simu");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        inputPanel2.setLayout(new java.awt.CardLayout());
        inputPanel2.add(clustepPanel1, "clustep");
        inputPanel2.add(tightBindingPanel1, "tb");
        inputPanel2.add(abinitInputPanel1, "abinit");
        inputPanel2.add(tightBindingPanelOld1, "tbold");

        tabbedPane.addTab("Input", inputPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(submissionScriptPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(submissionScriptPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Submission", jPanel1);

        nameSimuLabel.setText("Simulation name:");

        saveButton1.setText("Send simu");
        saveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton1ActionPerformed(evt);
            }
        });

        openLOGButton.setText("Open LOG");
        openLOGButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openLOGButtonActionPerformed(evt);
            }
        });

        openOUTButton.setText("Download output");
        openOUTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openOUTButtonActionPerformed(evt);
            }
        });

        pspPathLabel.setText("Local path to pseudopotentials");
        pspPathLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pspPathLabelMouseClicked(evt);
            }
        });

        newButton1.setText("Other simu");
        newButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButton1ActionPerformed(evt);
            }
        });

        machineCombo.setModel(new DefaultComboBoxModel<Machine>());
        machineCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                machineComboItemStateChanged(evt);
            }
        });
        machineCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                machineComboActionPerformed(evt);
            }
        });

        machineLabel.setText("Where to run the simulation:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(newButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(openLOGButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(openOUTButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pspPathLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameSimuLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameSimuTextField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(machineLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(machineCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(tabbedPane))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pspPathTextField)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(openLOGButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(openOUTButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pspPathLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pspPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameSimuLabel)
                            .addComponent(nameSimuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(machineCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(machineLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void simuListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_simuListValueChanged
        
        boolean adjust = evt.getValueIsAdjusting();
        if(!adjust)
        {
            Simulation simu = (Simulation)(simuList.getSelectedValue());
            System.out.println("simu : "+simu);

            if(simu != null)
            {
                currentSimu = simu;
            }

            refresh();
        }
    }//GEN-LAST:event_simuListValueChanged

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        if(currentProject != null)
        {
            Simulation simu = new AbinitSimulation();
            simu.setName("New simu");
            currentProject.addSimulation(simu);
        }
        refreshProject();
    }//GEN-LAST:event_newButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(currentSimu != null)
        {
            currentSimu.setName(nameSimuTextField.getText());
            if(currentPanel != null)
            {
                currentPanel.fillSimu(currentSimu);
            }
            
            SubmissionScript currentScript = submissionScriptPanel1.getScript();
            currentSimu.getRemoteJob().setScript(currentScript);
            
            Machine mach = (Machine)machineCombo.getSelectedItem();
            if(mach != null)
            {
                currentSimu.getRemoteJob().setMachineName(mach.getName());
            }
            else
            {
                currentSimu.getRemoteJob().setMachineName(null);
            }
        }
        
        currentProject.setPSPPath(this.pspPathTextField.getText());
        
        try {
            currentProject.save();
        } catch (IOException ex) {
            MainFrame.printERR("IOException: " + ex.getMessage());
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if(currentProject != null && currentSimu != null)
        {
            currentProject.removeSimulation(currentSimu);
            currentSimu = null;
        }
        refreshProject();
        refresh();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed
        saveButtonActionPerformed(evt); // Save before run!
        
        Runnable r = new Runnable() {
            @Override
            public void run()
            {
                currentSimu.submit();
            }
        };
        
        Thread t = new Thread(r);
        t.start();
    }//GEN-LAST:event_saveButton1ActionPerformed

    private void openLOGButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openLOGButtonActionPerformed

        // Ask simulation to do the job !
        Runnable r = new Runnable() {
            @Override
            public void run() {
                        
                if(currentSimu != null)
                {
                    currentSimu.downloadLog();
                }
            }
        };

        Thread t = new Thread(r);
        t.start();
    }//GEN-LAST:event_openLOGButtonActionPerformed

    private void openOUTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openOUTButtonActionPerformed
        
                // Ask simulation to do the job !
        Runnable r = new Runnable() {
            @Override
            public void run() {
                        
                if(currentSimu != null)
                {
                    currentSimu.downloadOutput();
                }
            }
        };

        Thread t = new Thread(r);
        t.start();
    }//GEN-LAST:event_openOUTButtonActionPerformed

    private void pspPathLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pspPathLabelMouseClicked
        MainFrame.printGEN("--- HINT ------------------------------------------", Color.BLACK, false, true);
        MainFrame.printGEN("Please fill in the path to your local pseudopotential database\n", Color.RED, false, true);
        MainFrame.printGEN("Examples: ./PSP (when the database is in your root folder or in the"
            + " same one as AbinitGUI.jar) or something like /home/user/PSP\n", new Color(0, 100, 0), false, true);
        MainFrame.printGEN("You can find the database at http://www.flavio.be", Color.DARK_GRAY, false, true);
        MainFrame.printGEN("---------------------------------------------------", Color.BLACK, false, true);
    }//GEN-LAST:event_pspPathLabelMouseClicked

    private void newButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButton1ActionPerformed

        String[] programs = new String[] {"abinit", "clustep", "TB"};
    
        String input = (String) JOptionPane.showInputDialog(this,
                "Please select your program", null,
                JOptionPane.INFORMATION_MESSAGE, null, programs, "abinit");
        
        if(input == null)
        {
            return;
        }
        switch (input) {
            case "abinit":
                if(currentProject != null)
                {
                    Simulation simu = new AbinitSimulation();
                    simu.setName("New simu");
                    currentProject.addSimulation(simu);
                }
                refreshProject();
                break;
            case "clustep":
                if(currentProject != null)
                {
                    Simulation simu = new ClustepSimulation();
                    simu.setName("clustep simu");
                    currentProject.addSimulation(simu);
                }
                refreshProject();
                break;
            case "TB":
                if(currentProject != null)
                {
                    Simulation simu = new TightBindingSimulationOld();
                    simu.setName("TB simu");
                    currentProject.addSimulation(simu);
                }
                refreshProject();
                break;
        }
    }//GEN-LAST:event_newButton1ActionPerformed

    private void machineComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machineComboActionPerformed
        Machine mach = (Machine)machineCombo.getSelectedItem();
        if(mach != null)
        {
            this.currentMachine = mach;
            // TODO
            this.submissionScriptPanel1.setScript(mach.getSubmissionScript());
        }
    }//GEN-LAST:event_machineComboActionPerformed

    private void machineComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_machineComboItemStateChanged

    }//GEN-LAST:event_machineComboItemStateChanged

    public void refreshMachines()
    {
        Machine mymach = (Machine)(machineCombo.getSelectedItem());
        
        DefaultComboBoxModel<Machine> model = new DefaultComboBoxModel<>();
        
        for(Machine mach : MainFrame.getMachineDatabase())
        {
            model.addElement(mach);
        }
        
        machineCombo.setModel(model);
        machineCombo.setSelectedItem(mymach);
    }
    
    public void refreshProject()
    {
        this.currentProject = MainFrame.getCurrentProject();
        
        DefaultListModel<Simulation> model = new DefaultListModel<>();
        
        for(Simulation simu : currentProject)
        {
            model.addElement(simu);
        }
        
        simuList.setModel(model);
        
        refresh();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private abinitgui.projects.AbinitInputPanel abinitInputPanel1;
    private abinitgui.mdtb.ClustepPanel clustepPanel1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel inputPanel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox machineCombo;
    private javax.swing.JLabel machineLabel;
    private javax.swing.JLabel nameSimuLabel;
    private javax.swing.JTextField nameSimuTextField;
    private javax.swing.JButton newButton;
    private javax.swing.JButton newButton1;
    private javax.swing.JButton openLOGButton;
    private javax.swing.JButton openOUTButton;
    private javax.swing.JLabel pspPathLabel;
    private javax.swing.JTextField pspPathTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton saveButton1;
    private javax.swing.JList simuList;
    private abinitgui.projects.SubmissionScriptPanel submissionScriptPanel1;
    private javax.swing.JTabbedPane tabbedPane;
    private abinitgui.mdtb.TightBindingPanel tightBindingPanel1;
    private abinitgui.mdtb.TightBindingPanelOld tightBindingPanelOld1;
    // End of variables declaration//GEN-END:variables

    private void setCorrectPanel() {
        if(currentSimu == null)
        {
            
        }
        else
        {
            if(currentSimu instanceof ClustepSimulation)
            {
                CardLayout cl = (CardLayout)(inputPanel2.getLayout());
                cl.show(inputPanel2, "clustep");
                this.currentPanel = clustepPanel1;
            }
            else if(currentSimu instanceof TightBindingSimulationOld)
            {
                CardLayout cl = (CardLayout)(inputPanel2.getLayout());
                cl.show(inputPanel2, "tbold");
                this.currentPanel = tightBindingPanelOld1;
            }
            else if(currentSimu instanceof AbinitSimulation)
            {
                CardLayout cl = (CardLayout)(inputPanel2.getLayout());
                cl.show(inputPanel2, "abinit");
                this.currentPanel = abinitInputPanel1;
            }
            else
            {
                MainFrame.printERR("This simulation is not supported anymore !");
            }
        }
    }
    private void refresh() {
        setCorrectPanel();
        setEmptyFields();
        if(currentSimu != null)
        {
            if(currentPanel != null)
            {
                currentPanel.fillFromSimu(currentSimu);
            }
            
            if(currentSimu.getName() != null)
                nameSimuTextField.setText(currentSimu.getName());
            
            String machineName = currentSimu.getRemoteJob().getMachineName();
            Machine mach = MainFrame.getMachineDatabase().getMachine(machineName);
            machineCombo.setSelectedItem(mach);
            submissionScriptPanel1.setScript(currentSimu.getRemoteJob().getScript());
        }
        
        if(currentProject != null)
        {
            pspPathTextField.setText(currentProject.getPSPPath());
        }
    }

    private void setEmptyFields() {
        nameSimuTextField.setText("");
    }
}
