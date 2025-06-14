the ARRAYLISTS i used:
plumbing - contains the names of all plumbing services (both added by the user and added by me) as strings
plumbPrices - contains all the prices for plumbing services as integers
tutoring - contains the names of all plumbing services as strings
tutorPrices - contains all the prices of tutoring services as integers
cleaning - contains all the prices of cleaning services as strings
cleaningPrices - contains all the cleaning services as integers
contracting - contains all contracting services as strings
contractingPrices - contains all contracting prices as integers
cart - contains all services added to the cart as strings
cartPrice - contains prices of all services added to the cart

the VARIABLES I used:
enter1 - binary option integer used to determine whether user is making service or booking an existing one
userName - the name of the service a user creates
userCategory - text that displays the type of business a user has made
userCategoryNum - integer variable number selector to determine the type of business the user has made
userRate - the hourly rate the user is charging
confirm - binary option to confirm the additon of a service by the user
catChoose - used to determine which category arrayList will be printed
servSelect - variable used to select the proper index from an arrayList and add it to the cart list
programEnd - variable that provides the user the option of ending the shopping and go to the checkout stage
removeCon - variable to allow the user to confirm if they want to remove a servremove a variable 
removeWhat - uses index to allow user to choose which service to get rid of
finalSum - the final sum from all of the price integers from cartPrice

LOGIC/STRUCTURE
The code functions mostly within a while loop. Outside of this loop is where the checkout and invoice occur. you are then greeted by an
introductory message and 2 options: browse and book existing services, or make your own. if the latter is chosen, you choose your service's
name, category, and its hourly rate. Then, you are once again given both options. If booking is chosen, you are asked which service you
want and you select via the set of options with numbers tied to them. Next you must choose which spesific service out of the categories to select.
After you have selected it, you will be shown the cart's contents and asked whether you wish to remove any of the services in your cart. If you select
the removal, the program will ask which service you would like removed via which number the service is from the top (index but shifted by -1 for user convience)
after this you can either continue and go back to the "book or create new service" menu or you can proceed to the checkout.
At this checkout you will be shown the "sales invoice" which is a list of all of the services sold to you, their induvidual prices, and
the total of all of the prices together. After the ivoice is printed, a farewell message is shown to the user wishing them well in a polite and nice fashion.


