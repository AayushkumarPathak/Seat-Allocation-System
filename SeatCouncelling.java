import java.util.PriorityQueue;
import java.util.Scanner;

public class SeatCouncelling {
    static Scanner sc = new Scanner(System.in);

    static class Student implements Comparable<Student> {
        private String name;
        private int rank;
        private int regNo;

        public Student(String name, int rank, int reg){
            this.name = name;
            this.rank = rank;
            this.regNo = reg;
        }
        @Override
        public int compareTo(Student s2){
            return (this.rank - s2.rank);
        }
    }
    
    
    
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        
        System.out.println("\t\t\t||\tSeat Allotment Management System\t||\n");
        int deptNo = 4;
        String dept1, dept2, dept3, dept4;
        while(deptNo>0){
            System.out.print("Enter the First Department: ");
            dept1 = sc.nextLine();
            System.out.print("Enter the Second Department: ");
            dept2 = sc.nextLine();
            System.out.print("Enter the Third Department: ");
            dept3 = sc.nextLine();
            System.out.print("Enter the Fourth Department: ");
            dept4 = sc.nextLine();
            deptNo = deptNo - 4;
        }
        System.out.print("Enter the Departement: ");
        String dept = sc.nextLine();

        System.out.print("Enter number of seats available in "+dept+" department: ");
        int seats = sc.nextInt();
        System.out.println("Allocating seats according to available seats "+seats+".");
        
        System.out.print("Enter the number of Students:");
        int t = sc.nextInt();
        sc.nextLine();
        int no = 1;
        while(t>0){
            System.out.println("Enter the detail of student "+ (no));
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter Student Rank: ");
            int rank = sc.nextInt();

            System.out.print("Enter Student RegNo: ");
            int reg = sc.nextInt();

            pq.add(new Student(name, rank, reg));

            t--;
            no++; 
            sc.nextLine(); 
        }
        System.out.println("Name \tRegNo ->\tRank \t Status");
        int i = 0;
        while (i<seats) {
            System.out.println(pq.peek().name+"\t "+pq.peek().regNo+"   ->\t "+pq.peek().rank+" \t"+"Allocated.");
            pq.remove();
            i++;
        }
        System.out.println("Exiting the program");
    }
    
}
