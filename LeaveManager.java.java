package com.leave;

import java.util.*;
public class LeaveManager {
	 private static List<LeaveRequest> leaveRequests = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Employee emp = new Employee(1, "Pragati");

        while (true) {
            System.out.println("\n=== Leave Management ===");
            System.out.println("1. Apply for Leave");
            System.out.println("2. View Leave Requests");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter leave date (YYYY-MM-DD): ");
                    String date = sc.nextLine();
                    System.out.print("Enter reason for leave: ");
                    String reason = sc.nextLine();
                    LeaveRequest req = new LeaveRequest(emp, date, reason);
                    leaveRequests.add(req);
                    System.out.println("Leave request submitted.");
                    break;

                case 2:
                    System.out.println("\nLeave Requests:");
                    for (LeaveRequest r : leaveRequests) {
                        System.out.println("Name: " + r.getEmployee().getName() +
                                           ", Date: " + r.getDate() +
                                           ", Reason: " + r.getReason());
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }

	}


