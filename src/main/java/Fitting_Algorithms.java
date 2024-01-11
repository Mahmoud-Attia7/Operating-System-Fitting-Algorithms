
import java.util.Scanner;

public class Fitting_Algorithms {
    //First Fit Algorithm
    public static void FirstFit(int[] Process_Size)
    {
        int [] Block_Size = {100,500,200,300,600}; //The Memory Size array
        //Print the Memory Size 
        System.out.print("# First Fit Algorithm \n" + "#\n" + "# The block size: {");
        for(int i = 0; i < Block_Size.length; i++)
        {
            System.out.print("["+Block_Size[i]+"]"+" ");
        }
        System.out.println("}\n#");
        
        //Alocate the Processes in Memory
        for(int i = 0; i < Process_Size.length; i++)
        {
            boolean Done = true;
            int X = Process_Size[i]; // the process to be alocate in memory
            for(int j = 0; j < Block_Size.length && Done == true; j++)
            {
                if(X <= Block_Size[j])
                {
                    System.out.println("# Process ("+ X +") will take place in block ("+ Block_Size[j] +") number "+j+"\n#");
                    Block_Size[j] = Block_Size[j] - X;
                    Done = false; //set Done to false to stop the loop while the process has been alocated in memory
                }
            }
            if(Done != false) //if Done not equal false then the process has not been alocated in memory
                    System.out.println("# Process ("+ Process_Size[i] +") NOT HAS A PLACE\n#");
            
        }
        //Print the new Memory size
        System.out.print("# The new block size: { ");
        for(int i = 0; i < Block_Size.length; i++)
        {
            System.out.print("["+Block_Size[i]+"]"+" ");
        }
        System.out.println("}");
    }
    
    //Worst Fit Algorithm
    public static void WorstFit(int[] Process_Size)
    {
        int [] Block_Size = {100,500,200,300,600}; //The Memory Size array
        //Print the Memory Size 
        System.out.print("# Worst Fit Algorithm §-\n#\n" + "# The block size: { ");
        for(int i = 0; i < Block_Size.length; i++)
        {
            System.out.print("["+Block_Size[i]+"]"+" ");
        }
        System.out.println("}\n#");
        
        //Alocate the Processes in Memory
        for(int i = 0; i < Process_Size.length; i++)
        {
            int X = Process_Size[i]; // the first process to be alocate in memory
            int indWF = 0; //index of WORST Memory size!
            int Worst_Fit = Block_Size[0]; //Worst Memory size!
            int j = 0;
            while(j < Block_Size.length-1)
            {
                //GET THE INDEX OF WORST MEMORY AND THE SIZE
                if(Worst_Fit < Block_Size[j+1])
                {
                    indWF = j+1;
                    Worst_Fit =
                            
                           Block_Size[indWF];
                }
                j++;
            }
            // Alocate if  it can be..
            if(X <= Worst_Fit)
            {
                System.out.println("# Process ("+ X +") will take place in block ("+ Worst_Fit +") number "+indWF+"\n#");
                Block_Size[indWF] = Block_Size[indWF] - X;
            }
            else
                System.out.println("# Process ("+ Process_Size[i] +") NOT HAS A PLACE\n#");
        }
        
        //Print the new Memory size
        System.out.print("# The new block size: { ");
        for(int i = 0; i < Block_Size.length; i++)
        {
            System.out.print("["+Block_Size[i]+"]"+" ");
        }
        System.out.println("}");
    }
    
    //Best Fit Algorithm
    public static void BestFit(int[] Process_Size)
    {
        int [] Block_Size = {100,500,200,300,600}; //The Memory Size array
        //Print the Memory Size 
        System.out.print("# Best Fit Algorithm §-\n#\n" + "# The block size: { ");
        for(int i = 0; i < Block_Size.length; i++)
        {
            System.out.print("["+Block_Size[i]+"]"+" ");
        }
        System.out.println("}\n#");

        //Alocate the Processes in Memory
        for(int i = 0; i < Process_Size.length; i++)
        {
            int X = Process_Size[i]; // the first process to be alocate in memory
            int indBF = 0; //index of Best Memory size!
            int Best_Fit = Block_Size[0]; //Best Memory size!
            int j = 0;
            while(j < Block_Size.length)
            {
                //Get a Memory size bigger than the process size
                if(X <= Block_Size[j])
                {
                    indBF = j;
                    Best_Fit = Block_Size[indBF];
                    //Get a Memory size the is bigger than the process size and the smallest one!
                    for(int k=0; k < Block_Size.length; k++)
                    {
                        if(Block_Size[k] < Best_Fit && X <= Block_Size[k])
                        {
                            indBF = k;
                            Best_Fit = Block_Size[k];
                        }
                    }
                }
                j++;
            }
            
             //Alocate if  it can be..
            if(Best_Fit >= X)
            {
                System.out.println("# Process ("+ X +") will take place in block ("+ Best_Fit +") number "+indBF+"\n#");
                Block_Size[indBF] = Block_Size[indBF] - X;
            }
            else
                System.out.println("# Process ("+ Process_Size[i] +") NOT HAS A PLACE\n#");
        }
        
        //Print the new Memory size
        System.out.print("# The new block size: { ");
        for(int i = 0; i < Block_Size.length; i++)
        {
            System.out.print("["+Block_Size[i]+"]"+" ");
        }
        System.out.println("}");
    }
    
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int [] Process_Size = new int[6];
        System.out.print("Enter 6 Processes size: ");
        for(int i = 0; i < Process_Size.length; i++)
        {
            Process_Size[i] = n.nextInt();
        }
        System.out.println("########################################################");
        BestFit(Process_Size);
        System.out.println("########################################################");
        FirstFit(Process_Size);
        System.out.println("########################################################");
        WorstFit(Process_Size);
        System.out.println("########################################################");
        
    }
    
}
