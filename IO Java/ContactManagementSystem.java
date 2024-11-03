import java.io.*;
import java.util.*;

public class ContactManagementSystem 
{
    public static void main (String[] args)
    {
        boolean condition = true;
        Scanner scan = new Scanner(System.in);

        while(condition)
        {
            System.out.println("\n\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.printf("Choose an option: ");
            char option = scan.next().charAt(0);
            scan.nextLine();

            switch(option)
            {
                case '1': //Add Contact
                    System.out.printf("\nEnter Contact Name: ");
                    String newContact = scan.nextLine();

                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("contacts.txt", true)))
                    {
                        writer.write(newContact);
                        writer.newLine();
                        System.out.println("Contact Added");
                    }
                    catch(IOException e)
                    {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;

                case '2': //View Contact
                    System.out.println("Contacts:");
                    try (BufferedReader reader = new BufferedReader(new FileReader("contacts.txt")))
                    {
                        String line;
                        while((line = reader.readLine()) != null)
                        {
                            System.out.println(line);
                        }
                    } 
                    catch (IOException e) 
                    {
                       System.err.println("Error: " + e.getMessage());
                    }
                    break;    
                    
                case '3': //Update Contact
                    System.out.printf("Enter the name of the contact to update: ");
                    String oldName = scan.nextLine();
                    System.out.printf("\nEnter the new name: ");
                    String newName = scan.nextLine();
                    List<String> contacts = new ArrayList<>();
                    boolean contactFound = false;

                    try(BufferedReader reader = new BufferedReader(new FileReader("contacts.txt")))
                    {
                        String line;
                        while((line = reader.readLine()) != null)
                        {
                            if(line.trim().equalsIgnoreCase(oldName))
                            {
                                contacts.add(newName);
                                contactFound = true;     
                            }
                            else    
                                contacts.add(line);
                        }
                    }
                    catch(IOException e)
                    {
                        System.err.println("Error: " + e.getMessage());
                    }

                    if(contactFound)
                    {
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter("contacts.txt")))
                        {
                            for (String contact : contacts)
                            {
                                writer.write(contact);
                                writer.newLine();
                            }
                            System.out.println("Contact Updated");
                        }
                        catch (IOException e)
                        {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    else
                        System.out.println("Contact not found");
                    break;
                    
                case '4': //Delete Contact
                    System.out.printf("\nEnter the name of the contact to delete: ");
                    String deleteName = scan.nextLine();
                    contacts = new ArrayList<>();
                    contactFound = false;

                    try (BufferedReader reader = new BufferedReader(new FileReader("contacts.txt")))
                    {
                        String line;
                        while((line = reader.readLine()) != null)
                        {
                            if(!line.trim().equalsIgnoreCase(deleteName))
                                contacts.add(line);
                            else
                                contactFound = true;
                        }
                    }
                    catch(IOException e)
                    {
                        System.err.println("Error: " + e.getMessage());
                    }
                    
                    if (contactFound)
                    {
                        try(BufferedWriter writer = new BufferedWriter(new FileWriter("contacts.txt")))
                        {
                            for (String contact : contacts)
                            {
                                writer.write(contact);
                                writer.newLine();
                            }
                            System.out.println("Contact Deleted");
                        }
                        catch(IOException e)
                        {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    else
                        System.out.println("Contact not found");
                    break;

                case '5': //Exiting the program
                    System.out.println("Exiting...");
                    condition = false;
                    break;

                default:
                    System.out.println("Please enter the correct option!");
            }
        }
    }
}
