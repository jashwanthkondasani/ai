// class Main {
//     public static void main(String[] args) {
//      int a=11;
//      int b=12;
//      int c=13;
//      if(a>b)
//      {

//             if(a>c)
//              {
//              System.out.println("A is big");

//               }
//                   else 
//                   {
//                   System.out.println("c is big");
//                 }
//      }
//                 else if(b>c)
//          {
//              System.out.println("b is big");
//          }
//          else
//          {
//              System.out.println("c is big");
//          }

//      int a=-11;
//      int b=-10;
//      int c=-220;
//      int d=-9;

//       if(a>b){
//           if(a>c){
//               if(a>d){
//                   System.out.println("a is big");
//               }
//               else{
//                   System.out.println("d is big");
//               }

//           }
//       }
//       else if(b>c)
//       {
//           if(b>d)
//           {
//               System.out.println("b is big");
//           }
//           else
//           {
//               System.out.println("d is big");
//           }

//         }
//       else if(c>d)
//       {
//           System.out.println(" c is big");
//       }

//       else{
//           System.out.println("d is big");
//       }

//          biggest of 5 numbers
//         int a=1;
//         int b=2;
//         int c=3;
//         int d=4;
//         int e=5;

//         if(a>b)
//         {
//             if(a>c)
//             {
//                 if(a>d)
//                 {
//                     if(a>e)
//                     {
//                         System.out.println(" A IS BIG NUMBER");
//                     }
//                     else
//                     {
//                         System.out.println("E IS BIG NUMBER");
//                     }
//                 }

//             }
//         }
//         else if(b>c)
//         {
//             if(b>d){
//                 if(b>e)
//                 {
//                     System.out.println("b is big number");
//                 }
//                 else
//                 {
//                     System.out.println("e is big number");
//                 }
//             }
//         }
//         else if(c>d)
//         {
//             if(c>e)
//             {
//                 System.out.println("c is big  number");
//             }
//             else
//             {
//                 System.out.println("e is big number");
//             }
//         }
//         else if(d>e)
//         {
//             System.out.println("d is big");
//         }
//         else
//         {
//             System.out.println("e is big");
//         }

//     }
// }
class Main {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        int n = 5;
        for (int i = 0; i < 2 * n; i++) {
            int total = i > n ? 2 * n - i : i;
            int nos = n - total;

            for (int j = 0; j < total; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}