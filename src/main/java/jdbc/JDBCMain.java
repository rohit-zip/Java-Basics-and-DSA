package jdbc;

import java.util.Scanner;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - jdbc
 * Created_on - 24 November-2023
 * Created_at - 22 : 38
 */

public class JDBCMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id : ");
        int id = sc.nextInt();
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Email : ");
        String email = sc.nextLine();
        System.out.println("Enter Username : ");
        String username = sc.nextLine();

//        Entity entity = new Entity();
//        entity.setId(id);
//        entity.setName(name);
//        entity.setEmail(email);
//        entity.setUsername(username);

        Entity entity = new Entity(id, name, email, username);
        int save = Repository.save(entity);
        System.out.println(save);
    }
}
