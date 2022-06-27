public class commandLine {
    public static void main(String[] args){
        if(args.length > 1){
            throw new ("Too many arguments");
        }
        System.out.print("Hello " + args[0] );
    }
}
