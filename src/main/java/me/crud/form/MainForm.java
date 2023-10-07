/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package me.crud.form;

import me.crud.database.DatabaseManager;

/**
 *
 * @author helio
 */
public class MainForm extends javax.swing.JFrame {

    private boolean loaded;

    public boolean isLoaded() {
        return loaded;
    }

    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        loadingPanel.setVisible(false);
        mainPanel.setVisible(false);
    }
    
    public void initLoading() {
        if (isLoaded()) return;
        
        loadingPanel.setVisible(true);
        try {
            loadingLabel.setText("Connecting to database...");
            DatabaseManager databaseManager = new DatabaseManager();
            databaseManager.connect();
            if (databaseManager.isClosed()) {
                loadingLabel.setText("Could not connect to the database");
                return;
            }

            databaseManager.setInstance(databaseManager);
            databaseManager.setupDatabase();
            
            loadingLabel.setText("Successfully connected to database");
        }
        catch (Exception e) {
            loadingLabel.setText("An error occurred when connecting to the database");
            return;
        }

        loadingPanel.setVisible(false);
        mainPanel.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        formTitle = new javax.swing.JLabel();
        productsTitle = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();
        insertButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        loadingPanel = new javax.swing.JPanel();
        loadingLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD - Product Manager");
        setResizable(false);

        formTitle.setFont(new java.awt.Font("Dialog", 0, 40)); // NOI18N
        formTitle.setText("Product Manager");

        productsTitle.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        productsTitle.setText("Products");

        removeButton.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        removeButton.setText("Remove Product");

        insertButton.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        insertButton.setText("Insert Product");

        editButton.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        editButton.setText("Edit Product");

        searchField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        searchField.setText("Search");

        searchButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        searchButton.setText("SEARCH");

        productsTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        productsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productsTable.setRowHeight(24);
        scrollPane.setViewportView(productsTable);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(insertButton)
                                .addGap(41, 41, 41)
                                .addComponent(editButton)
                                .addGap(35, 35, 35)
                                .addComponent(removeButton))
                            .addComponent(formTitle)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(productsTitle)
                                .addGap(525, 525, 525)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(scrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                            .addComponent(searchButton)
                            .addGap(18, 18, 18)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(formTitle)
                .addGap(32, 32, 32)
                .addComponent(productsTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(18, 18, 18)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeButton)
                    .addComponent(insertButton)
                    .addComponent(editButton))
                .addGap(40, 40, 40))
        );

        loadingLabel.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        loadingLabel.setText("...");

        javax.swing.GroupLayout loadingPanelLayout = new javax.swing.GroupLayout(loadingPanel);
        loadingPanel.setLayout(loadingPanelLayout);
        loadingPanelLayout.setHorizontalGroup(
            loadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1101, Short.MAX_VALUE)
            .addGroup(loadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loadingPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(loadingLabel)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        loadingPanelLayout.setVerticalGroup(
            loadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(loadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loadingPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(loadingLabel)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(loadingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(loadingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editButton;
    private javax.swing.JLabel formTitle;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel loadingLabel;
    private javax.swing.JPanel loadingPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable productsTable;
    private javax.swing.JLabel productsTitle;
    private javax.swing.JButton removeButton;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
