class StudentCourses extends Student{
    public static void main(String[] args) {
        StudentCourses student01 = new StudentCourses();
        
        student01.semester01(93, 82);
        student01.semester02(90, 85);
        student01.semester03(92,94);

    }

    public void semester01(int C_Programming, int wed_Technology){
        System.out.println("First semester courses and mark :- ");
      
        System.out.println("i. C Programming : "+ C_Programming);
        System.out.println("ii. Wed Technology : "+ wed_Technology);
    }
    public void semester02(int Cpp_Programming, int FCO){
        System.out.println("Second semester courses and mark :- ");
        
        System.out.println("i. C++ Programming : "+ Cpp_Programming);
        System.out.println("ii. FCO : "+ FCO);
    }
    public void semester03(int applied_statistics, int computer_networking){
        System.out.println("Third semester courses and mark :-");
      
        System.out.println("i. Applied Statistics : "+ applied_statistics);
        System.out.println("ii. Computer Networking : "+ computer_networking);  }  
    }