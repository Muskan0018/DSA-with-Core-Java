package CollectionFramework.PracticeProject;

import ArrayBasics.UserInputTwoD;

import java.util.*;

public class UserManage {
    public static void main(String[] args) {

    // ---------------- ALL USERS --------------

        // instead of creating like this we can create like Line no. 15 to 20
//        Set<String> user1Roles = new HashSet<>(Arrays.asList("ADMIN", "Manager"));
//        User u1 = new User("Muskan",true, user1Roles );

        List<User> users = new ArrayList<>();

        users.add(new User("Muskan",true, new HashSet<>(Arrays.asList("ADMIN", "Manager"))));
        users.add(new User("Pratiksha", true, new HashSet<>(Arrays.asList("VIEWER", "DEVELOPER"))));
        users.add(new User("Rohit", false, new HashSet<>(Arrays.asList("DEVELOPER"))));
        users.add(new User("Richa", false, new HashSet<>(Arrays.asList("HR MANAGER"))));
        users.add(new User("Rishank", true, new HashSet<>(Arrays.asList("TESTER", "DEVELOPER"))));
        System.out.println("================ ALL USERS ================");
        System.out.println(users);

    // ---------------- REMOVING INACTIVE USERS -----------------

        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().isActive()) {       // this line means if .isActive is False then go next
                iterator.remove();
            }
        }

    // ---------------- LIST OF ALL ACTIVE USERS -------------------

        System.out.println("================ ACITVE USERS ================");
        for (User user : users) {
            System.out.println(user.getName());
        }

    // ------------------ COUNT USERS PER ROLE ----------------

        Map<String, Integer> countRole = new HashMap<>();

        for (User user : users) {
            for (String roles : user.getRoles()) {
                countRole.put(roles, countRole.getOrDefault(roles, 0) + 1);
            }
        }

        System.out.println("================ USERS PER ROLES ================");
        for (Map.Entry<String, Integer> entry : countRole.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
