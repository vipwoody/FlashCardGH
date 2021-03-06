/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Play.java
 *
 * Created on 20-Dec-2011, 4:59:24 AM
 */

package flashcard;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author GiantChiprel
 */
public class Play extends javax.swing.JFrame {

    /** Creates new form Play */
    public Play() {
        initComponents();
        loadQuestion(0);
    }
        public Play(int reset) {
        initComponents();
        FlashcardView.model.QuestionNumber = 0;
        FlashcardView.model.rightAnswers = 0;
        loadQuestion(0);

    }
 
    public void showResults() {
        if (Results == null) {
            JFrame mainFrame = FlashcardApp.getApplication().getMainFrame();
            Results = new Results(mainFrame);
            Results.setLocationRelativeTo(mainFrame);
        }                
        else
        {
            Results.dispose();
            JFrame mainFrame = FlashcardApp.getApplication().getMainFrame();
            Results = new Results(mainFrame);
            Results.setLocationRelativeTo(mainFrame);
        }
        FlashcardApp.getApplication().show(Results);      
    }

    private void loadQuestion(int qNum)
    {
        ReadXMLFile.readXML(FlashcardView.model.deckSelected, qNum);
        jTextArea1.setText(FlashcardView.model.Question);
        multipleChoiceA.setText(FlashcardView.model.answerA);
        multipleChoiceB.setText(FlashcardView.model.answerB);
        multipleChoiceC.setText(FlashcardView.model.answerC);
        score.setText(FlashcardView.model.rightAnswers + "/" + FlashcardView.model.deckSize);
    }

    private void nextCard()
    {
        if(FlashcardView.model.QuestionNumber<FlashcardView.model.deckSize-1)
        {
            FlashcardView.model.QuestionNumber++;
            loadQuestion(FlashcardView.model.QuestionNumber);
        }
        else
            showResults();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        programTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        multipleChoiceA = new javax.swing.JButton();
        multipleChoiceB = new javax.swing.JButton();
        multipleChoiceC = new javax.swing.JButton();
        mainMenuButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(flashcard.FlashcardApp.class).getContext().getResourceMap(Play.class);
        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setName("jPanel1"); // NOI18N

        programTitle.setFont(resourceMap.getFont("programTitle.font")); // NOI18N
        programTitle.setText(resourceMap.getString("programTitle.text")); // NOI18N
        programTitle.setName("programTitle"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText(resourceMap.getString("jTextArea1.text")); // NOI18N
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        multipleChoiceA.setText(resourceMap.getString("multipleChoiceA.text")); // NOI18N
        multipleChoiceA.setName("multipleChoiceA"); // NOI18N
        multipleChoiceA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleChoiceAActionPerformed(evt);
            }
        });

        multipleChoiceB.setText(resourceMap.getString("multipleChoiceB.text")); // NOI18N
        multipleChoiceB.setName("multipleChoiceB"); // NOI18N
        multipleChoiceB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleChoiceBActionPerformed(evt);
            }
        });

        multipleChoiceC.setText(resourceMap.getString("multipleChoiceC.text")); // NOI18N
        multipleChoiceC.setName("multipleChoiceC"); // NOI18N
        multipleChoiceC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleChoiceCActionPerformed(evt);
            }
        });

        mainMenuButton.setText(resourceMap.getString("mainMenuButton.text")); // NOI18N
        mainMenuButton.setName("mainMenuButton"); // NOI18N
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        score.setText(resourceMap.getString("score.text")); // NOI18N
        score.setName("score"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(programTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(multipleChoiceA, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(multipleChoiceB, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(multipleChoiceC, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mainMenuButton)
                                .addGap(176, 176, 176))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {multipleChoiceA, multipleChoiceB, multipleChoiceC});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(programTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(score))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multipleChoiceA, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multipleChoiceB, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(multipleChoiceC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(mainMenuButton)
                .addGap(38, 38, 38))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {multipleChoiceA, multipleChoiceB, multipleChoiceC});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void multipleChoiceAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleChoiceAActionPerformed
        // TODO add your handling code here:
        if(FlashcardView.model.rightAnswer == 1)
            FlashcardView.model.rightAnswers++;
        nextCard();
}//GEN-LAST:event_multipleChoiceAActionPerformed

    private void multipleChoiceBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleChoiceBActionPerformed
        // TODO add your handling code here:        
        if(FlashcardView.model.rightAnswer == 2)
            FlashcardView.model.rightAnswers++;
        nextCard();
}//GEN-LAST:event_multipleChoiceBActionPerformed

    private void multipleChoiceCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleChoiceCActionPerformed
        // TODO add your handling code here:
        if(FlashcardView.model.rightAnswer == 3)
            FlashcardView.model.rightAnswers++;
        nextCard();
}//GEN-LAST:event_multipleChoiceCActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_mainMenuButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Play().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JButton multipleChoiceA;
    private javax.swing.JButton multipleChoiceB;
    private javax.swing.JButton multipleChoiceC;
    private javax.swing.JLabel programTitle;
    private javax.swing.JLabel score;
    // End of variables declaration//GEN-END:variables

    private JDialog Results;



}
