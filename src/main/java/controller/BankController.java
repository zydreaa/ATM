package controller;

import dto.User;

import java.util.ArrayList;
import java.util.UUID;

public class BankController {

    private ArrayList<User> users = new ArrayList<>();

    public void createUser(User user){
        this.users.add(user);
    }

    public User findUserByCardId(UUID cardId) throws Exception{
        for (User currentUser: this.users){
            /*
            UserCard card = currentUser.getCard();
            UUID currentCardId == card.getId();
            if (currentCardId == cardId){
            return currentUser;
            }
             */
            if(currentUser.getCard().getId().equals(cardId)){
                return currentUser;
            }
        }
        throw new Exception("User is not found!");
    }
}
