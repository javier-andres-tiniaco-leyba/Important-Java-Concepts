package code05_custom_annotation_and_reflection;

public class AnnotationRunner {
    public void method1(){
        System.out.println("method1");
    }
    @CanRun
    public void method2(){
        System.out.println("method2");
    }
    public void method3(){
        System.out.println("method3");
    }
    @CanRun
    public void method4(){
        System.out.println("method4");
    }
}
