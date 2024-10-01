package com.roshMain;

import com.roshjewel.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inv = new Inventory();
        //inv.show();
    

        Jewellery jw= new Jewellery();
        Login l = new Login();
        User u = new User();
       int op1;
        //List<Jewellery> lst = new ArrayList<>();
       /* int op1;
        int v;
        System.out.println("1.Add\n2.Update\n3.Search\n4.Remove\n5.Show\n-1 to stop");
        op1=sc.nextInt();

        do {
            try {
                System.out.println("Enter your name:");
                u.setName(sc.next());

                System.out.println("Enter your role:");
                u.setRole(sc.next());

                System.out.println("Enter your password:");
                u.setPassword(sc.next());

                // Check for invalid role and password
                if ("admin".equalsIgnoreCase(u.getRole()) && !u.getPassword().equals(l.getPassword())) {
                    throw new InvalidPasswordException("Invalid password for admin role.");
                }

                if ("admin".equalsIgnoreCase(u.getRole())) {
                    do {
                        
                        switch (op1) {
                            case 1:
                               jw = new Jewellery();
                                System.out.println("Enter name/shop name/branch/jewel type/quantity");
                                String name = sc.next();
                                String shop = sc.next();
                                String bran = sc.next();
                                String jewel = sc.next();
                                int q = sc.nextInt();
                                lst.add(new Jewellery(name, shop, bran, jewel, q));
                            	System.out.println("Enter jewellery details: NAME/SHOP NAME/BRANCH/JEWEL TYPE/QUANTITY:");
                            	jw.setName(sc.next());
                            	jw.setShop_name(sc.next());
                            	jw.setBranch(sc.next());
                            	jw.setJewel_type(sc.next());
                            	jw.setQuantity(sc.nextInt());
                            	inv.add(jw);
                            
                            	//boolean addSts=inv.add(jw);
                                break;
                            case 2:
                                System.out.println("List of items");
                                inv.show();
                                System.out.println("Enter id:");
                                String id = sc.next();
                                jw = inv.search(id);
                                if (jw == null) {
                                    throw new NullPointerException("Jewellery item not found.");
                                }
                                System.out.println("Enter 1.name\n2.shop name\n3.branch\n4.jewel type\n5.quantity\n6.Exit to update products basis:");
                                int o = sc.nextInt();
                                switch (o) {
                                    case 1:
                                        System.out.println("Enter name to be updated");
                                        jw.setName(sc.next());
                                        inv.update();
                                        break;
                                    case 2:
                                        System.out.println("Enter the shop name to be updated");
                                        jw.setShop_name(sc.next());
                                        inv.update();
                                        break;
                                    case 3:
                                        System.out.println("Enter branch to be updated:");
                                        jw.setBranch(sc.next());
                                        inv.update();
                                        break;
                                    case 4:
                                        System.out.println("Enter the jewel type to be updated");
                                        jw.setJewel_type(sc.next());
                                        inv.update();
                                        break;
                                    case 5:
                                        System.out.println("Enter the quantity to be updated");
                                        jw.setQuantity(sc.nextInt());
                                        inv.update();
                                        break;
                                    case 6:
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Invalid update option.");
                                }
                            	System.out.println("Enter id to be updated:");
                            	String idup=sc.next();
                            	jw.setId(idup);
                            	System.out.println("Enter Name: ");

    							String name=sc.next()+sc.nextLine();

    							jw.setName(name);
//                            	jw.setShop_name(sc.next());
//                            	jw.setBranch(sc.next());
//                            	jw.setJewel_type(sc.next());
//                            	jw.setQuantity(sc.nextInt());
                            	inv.update(jw);
                                break;
                                
                            case 3:
                                System.out.println("Enter id to be searched:");
                                String i1 = sc.next();
                                jw = inv.search(i1);
                                if (jw == null) {
                                    throw new NullPointerException("Jewellery item not found.");
                                }
                                System.out.println(jw);
                                break;
                            case 4:
                                System.out.println("Enter id to be deleted:");
                                String it = sc.next();
                                inv.remove(it);
                                break;
                            case 5:
                                inv.show();
                                break;
                            case -1:
                                break;
                            default:
                                throw new IllegalArgumentException("Invalid menu option.");
                        }
                    } while (op1 != -1);
                            	
                } else {
                    System.out.println("1.Sort by Name\n2.Sort by Quantity\n");
                    int val = sc.nextInt();
                    switch (val) {
                        case 1:
                            Collections.sort(lst, new csort());
                            break;
                        case 2:
                            Collections.sort(lst, new psort());
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid sort option.");
                    }

                    System.out.println(lst);
                }

            } catch (InvalidPasswordException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type.");
                sc.next(); // Clear the scanner buffer
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Press 1 to continue");
            v = sc.nextInt();
        } while (v == 1);*/
        do {
            System.out.println("Enter an option (-1 to exit):");
            op1 = sc.nextInt();  // Prompt for the option before the switch

            switch (op1) {
                case 1:
                    System.out.println("Enter jewellery details: NAME/SHOP NAME/BRANCH/JEWEL TYPE/QUANTITY:");
                   
                    jw.setName(sc.next());
                    jw.setShop_name(sc.next());
                    jw.setBranch(sc.next());
                    jw.setJewel_type(sc.next());
                    jw.setQuantity(sc.nextInt());
                    inv.add(jw);  // Add the jewellery to inventory
                    break;

                case 2:
                	System.out.println("Enter id to be updated:");
                	String idup=sc.next();
                	jw.setId(idup);
                	System.out.println("Enter Name: ");

					String name=sc.next()+sc.nextLine();

					jw.setName(name);
					inv.update(jw);
                    break;

                case 4:
                    System.out.println("Enter id to be deleted:");
                    String it = sc.next();
                    inv.remove(it);  // Remove the jewellery from inventory
                    break;

                case 5:
                    inv.show();  // Show all items in the inventory
                    break;

                case -1:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid menu option.");
                    break;
            }
        } while (op1 != -1); // Continue until -1 is entered

    
}
}