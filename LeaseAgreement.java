public class LeaseAgreement
{
    public static void main(String[] args) {
        proof_of_Income income= new proof_of_Income();

        String profession= "software developer";
        long salary= 127000L;
        income.proof(127000);
        income.proof();
        income.proof("sotware developer");
        income.proof("software Developer",127000);
        income.proof(127000,"software Developer");


    }
}
class proof_of_Income
{
    void proof(){
        System.out.println("no proof");
    }
    void proof(String profession){
        System.out.println("proof of income is "+profession);
    }
    void proof(long salary){
        System.out.println("proof of income is "+salary);

    }
        void proof(String profession, long salary){
            System.out.println("proof of income is "+profession +"and salary: "+salary);
        }
        void proof(long salary, String profession){
            System.out.println("proof of income is "+profession+ " and salary: "+salary);
        }
}