package SeleniumExamples;

public class GetOperatingSystem {
    public static void main (String args[]){
         String os = System.getProperty("os.name");
         System.out.println(os);
    }
}
