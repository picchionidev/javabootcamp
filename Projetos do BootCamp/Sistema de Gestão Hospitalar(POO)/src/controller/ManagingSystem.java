// package controller;
package controller;

import java.util.ArrayList;
import java.util.Scanner;
import models.Doctor;
import models.Employee;
import models.Person;
import models.Pacient;

// Class responsible for managing the system
public class ManagingSystem {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Pacient> pacients = new ArrayList<>();
    ArrayList<Person> people = new ArrayList<>();

    // Main menu
    public void menu() {
        boolean menuloop = false;

        while (!menuloop) {
            System.out.println("Menu:");
            System.out.println("1 - Register Pacient");
            System.out.println("2 - Register Doctor");
            System.out.println("3 - Register Employee");
            System.out.println("4 - Show All Records");
            System.out.println("0 - Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    getPacientData();
                    break;

                case 2:
                    getDoctorData();
                    break;

                case 3:
                    getEmployeeData();
                    break;

                case 4:
                    showAllData();
                    break;

                case 0:
                    menuloop = true;
                    break;

                default:
                    break;
            }
        }
    }

    // Collect data to register a pacient
    private void getPacientData() {
        System.out.println("Enter pacient's name:");
        String pacientname = scanner.nextLine();

        System.out.println("Enter pacient's age:");
        int pacientage = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter pacient's CPF:");
        String pacientcpf = scanner.nextLine();

        System.out.println("Enter pacient's diagnostic:");
        String diagnostic = scanner.nextLine();

        Pacient pacient = new Pacient(pacientname, pacientage, pacientcpf, diagnostic);
        pacients.add(pacient);
    }

    // Collect data to register a doctor
    private void getDoctorData() {
        System.out.println("Enter doctor's name:");
        String doctorname = scanner.nextLine();

        System.out.println("Enter doctor's age:");
        int doctorage = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter doctor's CPF:");
        String doctorcpf = scanner.nextLine();

        System.out.println("Enter medical specialty:");
        String medicalSpecialty = scanner.nextLine();

        Doctor doctor = new Doctor(doctorname, doctorage, doctorcpf, medicalSpecialty);
        doctors.add(doctor);
    }

    // Collect data to register an employee
    private void getEmployeeData() {
        System.out.println("Enter employee's name:");
        String employeename = scanner.nextLine();

        System.out.println("Enter employee's age:");
        int employeeage = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter employee's CPF:");
        String employeecpf = scanner.nextLine();

        System.out.println("Enter employee's sector:");
        String sector = scanner.nextLine();

        Employee employee = new Employee(employeename, employeeage, employeecpf, sector);
        employees.add(employee);
    }

    // Show data from all people
    private void showAllData() {
        System.out.println("----------Pacients List ----------");
        for (Pacient pacient : pacients) {
            pacient.showData();
            pacient.takeAction();
            pacient.rest();
        }

        System.out.println("----------Doctors List ----------");
        for (Doctor doctor : doctors) {
            doctor.showData();
            doctor.takeAction();
            doctor.performingSurgery();
        }

        System.out.println("----------Employees List ----------");
        for (Employee employee : employees) {
            employee.showData();
            employee.takeAction();
            employee.makingSpreadsheets();
        }
    }
}

