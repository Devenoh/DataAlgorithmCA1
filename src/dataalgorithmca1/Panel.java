/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dataalgorithmca1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
Panel.java
16/03/2025
@author ATra
This is the panel class that holds the swing GUI with the two lists.
*/
public class Panel extends javax.swing.JFrame {
    // creating instances of classes
    TestRequestQueue testRequestQueue = new TestRequestQueue();
    MissedAppointments missedAppointments = new MissedAppointments();
    
    // Constructor
    public Panel() {
        // Missed Appointments List, this pushes all the information for the people who missed an appointment.
        // SCHEMA Patients list information is further commented on in the TestRequest class,
        // but the order is in  :Name, Priority (Low, Medium, High), age, whether they came from a hospital ward, and their GP Details.
        // GP details are further commented on in their respective class. 
        // Stack used because it doesn't need to be shown in any particular order. (I think)
        
        // While the Priority isn't NECESSARY in this, the appointment would have had a priority anyway even if they didn't attend.
        // 1
        missedAppointments.pushMissedAppointments(new TestRequest("Dan1", 
                TestRequest.Priority.MEDIUM, 13, false,
                new GPDetails("Ban1", 13, GPDetails.Gender.MALE)));
        
        // 2
        missedAppointments.pushMissedAppointments(new TestRequest("Dan2", 
                TestRequest.Priority.MEDIUM, 13, false,
                new GPDetails("Ban2", 13, GPDetails.Gender.MALE)));
        
        // 3
        missedAppointments.pushMissedAppointments(new TestRequest("Dan3", 
                TestRequest.Priority.MEDIUM, 13, false,
                new GPDetails("Ban3", 13, GPDetails.Gender.MALE)));
        
        // 4
        missedAppointments.pushMissedAppointments(new TestRequest("Dan4", 
                TestRequest.Priority.MEDIUM, 13, false,
                new GPDetails("Ban4", 13, GPDetails.Gender.MALE)));
        
        // 5 
        missedAppointments.pushMissedAppointments(new TestRequest("Dan5", 
                TestRequest.Priority.MEDIUM, 13, false,
                new GPDetails("Ban5", 13, GPDetails.Gender.MALE)));
        
        // 6 
        missedAppointments.pushMissedAppointments(new TestRequest("Dan6", 
                TestRequest.Priority.MEDIUM, 13, false,
                new GPDetails("Ban6", 13, GPDetails.Gender.MALE)));
        
        // 7
        missedAppointments.pushMissedAppointments(new TestRequest("Dan7", 
                TestRequest.Priority.MEDIUM, 13, false,
                new GPDetails("Ban7", 13, GPDetails.Gender.MALE))); 
        
        
        // This is the Queue portion that shows the patients who did show up for the blood test appointment.
        // Queue ADT used because it's a literal queue of people with different priorities.
        // How everything affects the priority is commented on further within the TestRequest class.
        // 1
        testRequestQueue.enqueue(new TestRequest("Don1", 
                TestRequest.Priority.LOW, 15, true,
                new GPDetails("Bon1", 15, GPDetails.Gender.MALE)));
        
        // 2
        testRequestQueue.enqueue(new TestRequest("Don2", 
                TestRequest.Priority.LOW, 13, false,
                new GPDetails("Bon2", 13, GPDetails.Gender.MALE)));
        
        // 3
        testRequestQueue.enqueue(new TestRequest("Don3", 
                TestRequest.Priority.URGENT, 13, true,
                new GPDetails("Bon3", 13, GPDetails.Gender.MALE)));
        
        // 4
        testRequestQueue.enqueue(new TestRequest("Don4", 
                TestRequest.Priority.MEDIUM, 13, false,
                new GPDetails("Bon4", 13, GPDetails.Gender.MALE)));
        
        // 5 
        testRequestQueue.enqueue(new TestRequest("Don5", 
                TestRequest.Priority.URGENT, 18, true,
                new GPDetails("Bon5", 13, GPDetails.Gender.MALE)));
        
        // 6 
        testRequestQueue.enqueue(new TestRequest("Don6", 
                TestRequest.Priority.MEDIUM, 13, false,
                new GPDetails("Bon6", 13, GPDetails.Gender.MALE)));
        
        // 7
        testRequestQueue.enqueue(new TestRequest("Don7", 
                TestRequest.Priority.URGENT, 75, false,
                new GPDetails("Bon7", 13, GPDetails.Gender.MALE)));
        
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

        Title = new javax.swing.JLabel();
        AppList = new javax.swing.JLabel();
        MissList = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MissedAppointmentsList = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        PatientList = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Title.setText("Blood Hospital Patients Window");

        AppList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AppList.setText("Patient Application List");

        MissList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MissList.setText("Missed Appointments");

        MissedAppointmentsList.setColumns(20);
        MissedAppointmentsList.setRows(5);
        jScrollPane1.setViewportView(MissedAppointmentsList);

        PatientList.setColumns(20);
        PatientList.setRows(5);
        jScrollPane2.setViewportView(PatientList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AppList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MissList)
                        .addGap(75, 75, 75)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Title)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppList)
                    .addComponent(MissList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }
    
    // This is the method for showing the patients that are in the queue. 
    public void showPatients(){
        ArrayList<TestRequest> queued = testRequestQueue.peek(7); // 7 because we added 7 people.
        String result = "";
        for (TestRequest testRequest : queued) { // creating the string to showcase all of the data from the priority queue.
            result = result + "Name : " + testRequest.getName() + "\n Age : " + 
                    testRequest.getAge() + "\n Priority : " + testRequest.getPriority() + 
                    "\n Arriving from Ward : " + testRequest.isWard() + "\n GP Details : " + 
                    "\n Name : " + testRequest.getGpdetails().getName() + "\n Age : " +
                    testRequest.getGpdetails().getAge() + "\n Gender : " + testRequest.getGpdetails().getGender() + "\n \n";
        }
        PatientList.setText(result); // set result to be the text in the PatientList JTextArea.
    }
    
    public void showMissedPatients(){
        ArrayList<TestRequest> missed = missedAppointments.returnMissedAppointments(5);
        String missedResult = "";
        for (TestRequest testRequest : missed) {
            missedResult = missedResult + "Name : " + testRequest.getName() +
                    "\n Age : " + testRequest.getAge() + "\n Arriving from Ward : " + 
                    testRequest.isWard() + "\n GP Details : " + "\n Name : " + 
                    testRequest.getGpdetails().getName() + "\n Age : " + 
                    testRequest.getGpdetails().getAge() + "\n Gender : " + testRequest.getGpdetails().getGender() +
                    "\n \n";
        }
        MissedAppointmentsList.setText(missedResult); //This sets the text for the OTHER list.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppList;
    private javax.swing.JLabel MissList;
    private javax.swing.JTextArea MissedAppointmentsList;
    private javax.swing.JTextArea PatientList;
    private javax.swing.JLabel Title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
