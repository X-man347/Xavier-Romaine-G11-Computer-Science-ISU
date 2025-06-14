//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userEnter1;
        String flowerStand = "Tina's flowers";
        String bookStore = "Reader's Haven";
        String userName;
        String userCategory = "";
        int userCategoryNum;
        int userRate;
        int confirm;
        int catChoose;
        int servSelect;
        int programEnd = 0;
        int removeCon;
        int removeWhat;
        int finalSum = 0;
        ArrayList<String> plumbing  = new ArrayList<String>();
        ArrayList<Integer> plumbPrices = new ArrayList<Integer>();
        ArrayList<String> tutoring = new ArrayList<String>();
        ArrayList<Integer> tutorPrices = new ArrayList<Integer>();
        ArrayList<String> cleaning = new ArrayList<String>();
        ArrayList<Integer> cleaningPrices = new ArrayList();
        ArrayList<String> contracting = new ArrayList();
        ArrayList<Integer> contractingPrices = new ArrayList();
        ArrayList<String> cart = new ArrayList();
        ArrayList <Integer> cartPrice = new ArrayList();
        //plumbing

        plumbing.add("Mario bros plumbing");
        plumbing.add("plumbo");
        plumbPrices.add(3);
        plumbPrices.add(5);

        //tutoring

        tutoring.add("Ryan's tutoring");
        tutoring.add("Mathnasium");
        tutorPrices.add(4);
        tutorPrices.add(4);

        //cleaning

        cleaning.add("mr clean");
        cleaning.add("XR Windows");
        cleaningPrices.add(4);
        cleaningPrices.add(100);

        //contracting

        contracting.add("johns yardwork");
        contracting.add("contracting");
        contractingPrices.add(5);
        contractingPrices.add(10);

        //welcome menu

        System.out.println("welcome to the St. George market");
        System.out.println(" ");
        System.out.println("here you can book services, or you can also add your own!");
        System.out.println(" ");

        while (programEnd != 1){
            System.out.println("to choose book, type 1. to add your own service, type 2.");
            userEnter1 = sc.nextInt();



            //making new service

            while (userEnter1 == 2){
                sc.nextLine();
                System.out.println("enter the name of your new service");
                userName = sc.nextLine();
                System.out.println("now you must enter the category. enter 1 for plumbing, 2 for tutoring, 3 for cleaning, and 4 for contracting");
                userCategoryNum = sc.nextInt();
                //adding category

                //adding plumbing
                if (userCategoryNum == 1){
                    userCategory = "plumbing";
                    System.out.println("Enter the rate you will be charging for your " + userCategory + " service");
                    userRate = sc.nextInt();
                    System.out.println("press 1 to confirm");
                    confirm = sc.nextInt();


                    //scenarios for each category
                    if(confirm == 1) {


                        plumbing.add(userName);
                        plumbPrices.add(userRate);
                    }

                    //adding tutoring
                }
                if (userCategoryNum == 2){
                    userCategory = "tutoring";
                    System.out.println("Enter the rate you will be charging for your " + userCategory + " service");
                    userRate = sc.nextInt();
                    System.out.println("press 1 to confirm");
                    confirm = sc.nextInt();
                    if (confirm == 1){
                        tutoring.add(userName);
                        tutorPrices.add(userRate);
                    }



                }
                // adding cleaning
                if (userCategoryNum == 3){
                    userCategory = "cleaning";
                    System.out.println("Enter the rate you will be charging for your " + userCategory + " service");
                    userRate = sc.nextInt();
                    System.out.println("press 1 to confirm");
                    confirm = sc.nextInt();
                    if (confirm == 1){
                        cleaning.add(userName);
                        cleaningPrices.add(userRate);
                    }


                }
                //adding contracting
                if (userCategoryNum == 4){
                    userCategory = "contracting";
                    System.out.println("Enter the rate you will be charging for your " + userCategory + " service");
                    userRate = sc.nextInt();
                    System.out.println("press 1 to confirm");
                    confirm = sc.nextInt();

                    contracting.add(userName);
                    contractingPrices.add(userRate);
                }


                System.out.println("to choose book, type 1. to add your own service, type 2.");
                userEnter1 = sc.nextInt();

            }
            // browsing/booking

            //PRINTING SERVICES
            if (userEnter1 == 1) {
                System.out.println("enter 1 to see plumbing, 2 for tutoring, 3 for cleaning, and 4 for contracting");
                catChoose = sc.nextInt();
                if (catChoose == 1){
                    for (int i = 0; i < plumbing.size() && i < plumbPrices.size(); i++){

                        System.out.println(plumbing.get(i) + " for: " + plumbPrices.get(i));
                    }
                    System.out.println(" What would you like to purchase? click 1 for the first one, 2 for the 2nd and so on 1");
                    servSelect = sc.nextInt();
                    servSelect = servSelect - 1;
                    if (cart.contains(plumbing.get(servSelect)) ){
                        System.out.println("|| SYSTEM ERROR SERVICE FULLY BOOKED ||");
                    }else {
                        cart.add(plumbing.get(servSelect));
                        cartPrice.add(plumbPrices.get(servSelect));

                    }
                    System.out.println(" || CART || " );
                    for(int i = 0; i < cart.size(); i++){
                        System.out.println(cart.get(i) + " for: " + cartPrice.get(i));
                    }
                    System.out.println(" ___________");
                    System.out.println("press 1 to continue. press 0 to remove service from the cart");
                    removeCon = sc.nextInt();
                    if (removeCon == 0){
                        System.out.println("click 1 to remove 1, 2 to remove the 2nd and so on");
                        removeWhat = sc.nextInt();
                        removeWhat = removeWhat - 1;
                        cart.remove(cart.get(removeWhat));
                        cartPrice.remove(cartPrice.get(removeWhat));
                        System.out.println(" || CART ||");
                        for(int i = 0; i < cart.size(); i++){
                            System.out.println(cart.get(i) + " for: " + cartPrice.get(i));
                        }
                        System.out.println(" ___________");
                    }


                }
                //BOOKING TUTORING

                if (catChoose == 2){
                    for (int i = 0; i < tutoring.size() && i < tutorPrices.size(); i++){
                        System.out.println(tutoring.get(i) + " for: " + tutorPrices.get(i));
                        }
                    System.out.println(" What would you like to purchase? click 1 for the first one, 2 for the 2nd and so on ");

                    servSelect = sc.nextInt();
                    servSelect = servSelect - 1;
                    if(cart.contains(tutoring.get(servSelect))){
                        System.out.println("|| SYSTEM ERROR SERVICE FULLY BOOKED ||");

                    }else{
                        cart.add(tutoring.get(servSelect));
                        cartPrice.add(tutorPrices.get(servSelect));

                    }
                    System.out.println(" || CART ||");
                    for (int i = 0; i < cart.size(); i++){
                        System.out.println(cart.get(i) + " for: " + cartPrice.get(i));
                    }
                    System.out.println(" ___________");
                    System.out.println("press 1 to continue. press 0 to remove service from the cart");
                    removeCon = sc.nextInt();
                    if (removeCon == 0){
                        System.out.println("click 1 to remove 1, 2 to remove the 2nd and so on");
                        removeWhat = sc.nextInt();
                        removeWhat = removeWhat - 1;
                        cart.remove(cart.get(removeWhat));
                        cartPrice.remove(cartPrice.get(removeWhat));
                        System.out.println(" || CART ||");
                        for(int i = 0; i < cart.size(); i++){
                            System.out.println(cart.get(i) + " for: " + cartPrice.get(i));
                        }
                        System.out.println(" ___________");
                    }
                }
// BOOKING CLEANING
                if (catChoose == 3){
                    for (int i = 0; i < cleaning.size() && i < cleaningPrices.size(); i++){

                        System.out.println(cleaning.get(i) + " for: " + cleaningPrices.get(i));
                        }

                    System.out.println(" What would you like to purchase? click 1 for the first one, 2 for the 2nd and so on");
                    servSelect = sc.nextInt();
                    servSelect = servSelect - 1;
                    if (cart.contains(cleaning.get(servSelect))){
                        System.out.println("|| SYSTEM ERROR SERVICE FULLY BOOKED ||");
                    }else{
                        cart.add(cleaning.get(servSelect));
                        cartPrice.add(cleaningPrices.get(servSelect));
                    }
                    System.out.println(" || CART ||");
                    for(int i = 0; i < cart.size(); i++ ){
                        System.out.println(cart.get(i) + " for: " + cartPrice.get(i));
                    }
                    System.out.println(" ___________");
                    System.out.println("press 1 to continue. press 0 to remove service from the cart");
                    removeCon = sc.nextInt();
                    if (removeCon == 0){
                        System.out.println("click 1 to remove 1, 2 to remove the 2nd and so on");
                        removeWhat = sc.nextInt();
                        removeWhat = removeWhat - 1;
                        cart.remove(cart.get(removeWhat));
                        cartPrice.remove(cartPrice.get(removeWhat));
                        System.out.println(" || CART ||");
                        for(int i = 0; i < cart.size(); i++){
                            System.out.println(cart.get(i) + " for: " + cartPrice.get(i));
                        }
                        System.out.println(" ___________");
                    }
                }
// BOOKING CONTRACTING
                if (catChoose == 4){
                    for (int i = 0; i < contracting.size() && i < contractingPrices.size(); i++){

                        System.out.println(contracting.get(i) + " for: " + contractingPrices.get(i));
                    }

                    System.out.println(" What would you like to purchase? click 1 for the first one, 2 for the 2nd and so on");
                    servSelect = sc.nextInt();
                    servSelect = servSelect - 1;
                    if(cart.contains(contracting.get(servSelect))){
                        System.out.println("|| SYSTEM ERROR SERVICE FULLY BOOKED ||");
                    }else{
                        cart.add(contracting.get(servSelect));
                        cartPrice.add(contractingPrices.get(servSelect));
                    }
                    System.out.println(" || CART ||");
                    for (int i = 0; i < cart.size(); i++){
                        System.out.println(cart.get(i) + " for: " + cartPrice.get(i));
                    }
                    System.out.println(" ___________");
                    System.out.println("press 1 to continue. press 0 to remove service from the cart");
                    removeCon = sc.nextInt();
                    if (removeCon == 0){
                        System.out.println("click 1 to remove 1, 2 to remove the 2nd and so on");
                        removeWhat = sc.nextInt();
                        removeWhat = removeWhat - 1;
                        cart.remove(cart.get(removeWhat));
                        cartPrice.remove(cartPrice.get(removeWhat));
                        System.out.println(" || CART ||");
                        for(int i = 0; i < cart.size(); i++){
                            System.out.println(cart.get(i) + " for: " + cartPrice.get(i));
                        }
                        System.out.println(" ___________");
                    }
                }
//IF WRONG NUMBER INPUTTED
                if (catChoose > 4 || catChoose < 1 ){
                    System.out.println(" || ERROR PLEASE RESTART PROGRAM ||");
                }


            }
            System.out.println("press 1 to go to checkout. press 0 to continue shopping");
            programEnd = sc.nextInt();
        }
        // FINAL INVOICE
        System.out.println(" || SALES INVOICE ||");
        for(int i = 0; i < cart.size() && i < cartPrice.size(); i++){
            System.out.println(cart.get(i) + " for: " + cartPrice.get(i));
        }

        for(int i = 0; i < cartPrice.size(); i++){
            finalSum = finalSum + cartPrice.get(i);
        }
        System.out.println(" ___________________");
        System.out.println("TOTAL FOR: " + finalSum);
        System.out.println("");
        System.out.println("Thank you for shopping with us at the St. George market! We hope you could find everything you were looking for. Good luck my friend!");


        sc.close();
    }
}




