package SeleniumExamples;

public class GetOperatingSystem {
    public static void main (String args[]){
         String os = System.getProperty("os.name");

         if(os.equals("Windows 10")){
             System.out.println(os);
         }
        System.out.println("h" + os + "h");
    }
}
