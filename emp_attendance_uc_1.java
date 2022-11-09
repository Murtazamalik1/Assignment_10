public class emp_attendance_uc_1 {

    public static void main(String[] args) {
        int is_full_time = 1;
        double empcheck = Math.floor(Math.random()*10) %2;
        if (empcheck == is_full_time)
            System.out.println("employee is present");
        else
            System.out.println("employee is not present");
    }
}
