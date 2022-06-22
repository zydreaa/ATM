import controller.AtmController;
import controller.BankController;
import dto.User;
import dto.UserCard;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        BankController bankController = new BankController();

        Date expiryDate = new Date(2022, Calendar.JUNE, 22);
        UserCard card = new UserCard(expiryDate, 1245.50d, 2022);
        User user1 = new User("Zydre", "323232", card, 2.5 );

        bankController.createUser(user1);

        AtmController atmController = new AtmController();

        atmController.setBankController(bankController);
        atmController.insertCard(user1.getCard());

        JOptionPane.showMessageDialog(null, atmController.deposit());
        JOptionPane.showMessageDialog(null, atmController.withdraw());

        JOptionPane.showMessageDialog(null, atmController.validateCard());
        //atmController.validateCard(); another way to write same thing as above line

        JOptionPane.showMessageDialog(null, atmController.deposit());
        JOptionPane.showMessageDialog(null, atmController.withdraw());

        JOptionPane.showMessageDialog(null, atmController.removeCard());
        
        JOptionPane.showMessageDialog(null, atmController.withdraw());

    }
}