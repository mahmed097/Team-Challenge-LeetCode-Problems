class AverageSalary {
    public double average(int[] salary) {

        double sum = 0;
        int min = (int)Math.pow(10, 7);
        int max = 999;

        for(int i = 0; i<salary.length; i++){
            if(salary[i]>max){
                max = salary[i];
            }
             if(salary[i]<min){
                min = salary[i];
            }

            sum += salary[i];

        }

        return (sum-max-min)/(salary.length - 2);
        
    }

    public static void main(String[] args) {
        AverageSalary s = new AverageSalary();
        System.out.println(s.average(new int[]{4000,3000,1000,2000}));  
        System.out.println(s.average(new int[]{1000,2000,3000})); 
    }
}