package rs.srb.two.collection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class DatabaseDemo {
    public static void main(String[] args) {
        CustomerDao customerDao = new CustomerDao();
        List<Customer> customerList = customerDao.selectAll();
        for(Customer customer : customerList){

        }
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JComboBox<Customer> customerJCheckBox = new JComboBox<>();
        for (Customer customer : customerList){
            customerJCheckBox.addItem(customer);
        }
        customerSelectedLisinter customerSelectedLisinter = new customerSelectedLisinter();
        customerJCheckBox.addActionListener(customerSelectedLisinter);
        panel.add(customerJCheckBox);
        frame.getContentPane().add(panel);
        frame.setSize(800,640);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
    }
    private static class  customerSelectedLisinter implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JComboBox<Customer> source = (JComboBox<Customer>) e.getSource();
            String komanda = e.getActionCommand();
            System.out.println(source.getSelectedItem() + " je dap/la");
        }
    }
}
