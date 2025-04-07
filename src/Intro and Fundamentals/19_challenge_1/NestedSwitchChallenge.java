public class NestedSwitchChallenge {
    public static void main(String[] args) {
        int option = 1;
               
        // switch (option) {
        //     case 1: System.out.println("Option is not 2");
        //     switch (option) {
        //         case 2: System.out.println("Option is not 1");
        //         switch (option) {
        //             case 3: System.out.println("Option is not 1");
        //             break;
        //         }break;
        //     }
        //     break;
            
        //     default: System.out.println("Option is not 1");
        // }

                
        if (option == 1)
            if (option == 2)
                if (option == 3)
                    System.out.println("Option is 3");
                else
                    System.out.println("Option is not 3");
            else
                System.out.println("Option is not 2");
        else
            System.out.println("Option is not 1");
    }

}
