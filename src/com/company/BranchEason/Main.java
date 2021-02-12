package com.company.BranchEason;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int uOption=-1;
        ArrayList<String> taskList = new ArrayList<>();

        while(uOption !=0){
            System.out.println("Please Choose an option: ");
            System.out.println("(1) Add a task");
            System.out.println("(2) Remove a task.");
            System.out.println("(3) Update a task.");
            System.out.println("(4) List all tasks.");
            System.out.println("(0) Exit.");
            uOption= input.nextInt();
            switch (uOption){
                case 0:
                    break;
                case 1:
                    taskList= addTask(taskList);
                    break;
                case 2:
                    taskList= removeTask(taskList);
                    break;
                case 3:
                    taskList= updateTask(taskList);
                   break;
                case 4:
                    listTask(taskList);
                    break;
                default:
                    System.out.println("This ins not an option, Please use one of the numbers provided");
                    break;
            }
        }
    }

    public static  ArrayList addTask(ArrayList taskList){
        System.out.println("Enter the a task");
        Scanner input= new Scanner(System.in);
        String newTask= input.nextLine();
        taskList.add(newTask);
        return taskList;

    }

    public static  ArrayList removeTask(ArrayList taskList){
        System.out.println("Enter the of the task you want to delete");
        Scanner input= new Scanner(System.in);
        int numRemove = input.nextInt();
        taskList.remove(numRemove);
        return taskList;
    }
    public static  ArrayList updateTask(ArrayList taskList){
        System.out.println("Enter the index of the task you want to update");
        Scanner input= new Scanner(System.in);
        int numRemove = input.nextInt();
        taskList.remove(numRemove);
        System.out.println("Enter the a task");
        Scanner input1= new Scanner(System.in);
        String newTask= input1.nextLine();
        taskList.add(newTask);
        return taskList;    }
    static void listTask(ArrayList<String> taskList){
        System.out.println(taskList);

    }

    }
