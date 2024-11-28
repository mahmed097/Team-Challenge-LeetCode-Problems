class AverageSalary {
    public double average(int[] salary) {

        double sum = 0;
        int min = (int)Math.pow(10, 7); // Initializing minimum salary and setting it to a number outside our constraints (Which was 1000 <= salary[i] <= 10^6)
        int max = 999; // Initializing maximum salary and setting it to a number outside our constraints (Which was 1000 <= salary[i] <= 10^6)

        for(int i = 0; i<salary.length; i++){
          
            if(salary[i]>max){ // Checking for maximum number
                max = salary[i]; // If maximum salary, store it in max
            }
             if(salary[i]<min){ // Checking for minimum number
                min = salary[i]; // If minimum salary, store it in min
            }

            sum += salary[i]; // Adding all the salaries togeth

        }

        return (sum-max-min)/(salary.length - 2);  // Returning the average salary after removing max and min
        
    }

    public static void main(String[] args) {
        // Test output
        AverageSalary s = new AverageSalary(); 
        System.out.println(s.average(new int[]{4000,3000,1000,2000}));  
        System.out.println(s.average(new int[]{1000,2000,3000})); 
    }
}