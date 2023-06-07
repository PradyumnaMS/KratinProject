package Application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

    public class KratinMobile {


        public static class RemindSeniors {

            private final List<Reminder> reminders;

            public RemindSeniors() {
                reminders = new ArrayList<>();
            }

            public void addReminder(String title, Date date) {
                reminders.add(new Reminder(title, date));
            }

            public void listReminders() {
                for (Reminder reminder : reminders) {
                    System.out.println(reminder);
                }
            }

            public void run() {
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    System.out.println("What would you like to do?");
                    System.out.println("1. Add a reminder");
                    System.out.println("2. List reminders");
                    System.out.println("3. Quit");

                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
//                        System.out.println("Enter the reminder title:");
                            System.out.println("Take Medicines for Diabetics and HyperTension");
                            System.out.println("Book a Doctor's Appointment for FollowUp");
                            String title = scanner.nextLine();

//                        System.out.println("Enter the reminder date:");
                            Date date = new Date();

                            addReminder(title, date);
                            break;
                        case 2:
                            listReminders();
                            break;
                        case 3:
                            System.out.println("Goodbye!");
                            return;
                    }
                }
            }

            public static void main(String[] args) {
                RemindSeniors application = new RemindSeniors();
                application.run();
            }
        }

        static class Reminder {

            private final String title;
            private final Date date;

            public Reminder(String title, Date date) {
                this.title = title;
                this.date = date;
            }

            @Override
            public String toString() {
                return String.format("Reminder: %s, Date: %s", title, date);
            }
        }

    }

}
