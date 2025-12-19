import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class ResumeGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Enter your Full Name: ");
            String name = sc.nextLine();

            System.out.print("Enter your Email: ");
            String email = sc.nextLine();

            System.out.print("Enter your Phone Number: ");
            String phone = sc.nextLine();

            System.out.print("Enter your Address: ");
            String address = sc.nextLine();

            
            System.out.print("Enter your Education: ");
            String education = sc.nextLine();

        
            System.out.print("Enter your Work Experience: ");
            String experience = sc.nextLine();

            
            System.out.print("Enter your Skills (comma separated): ");
            String skills = sc.nextLine();


            FileWriter writer = new FileWriter("Resume.txt");
            writer.write("-------------------------------\n");
            writer.write("           RESUME\n");
            writer.write("-------------------------------\n");
            writer.write("Name: " + name + "\n");
            writer.write("Email: " + email + "\n");
            writer.write("Phone: " + phone + "\n");
            writer.write("Address: " + address + "\n\n");

            writer.write("Education:\n- " + education + "\n\n");
            writer.write("Experience:\n- " + experience + "\n\n");

            writer.write("Skills:\n");
            String[] skillList = skills.split(",");
            for (String s : skillList) {
                writer.write("- " + s.trim() + "\n");
            }

            writer.write("-------------------------------\n");
            writer.close();

            System.out.println("\n✅ Resume Generated Successfully! Check 'Resume.txt'");
        } catch (IOException e) {
            System.out.println("Error while generating resume: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
