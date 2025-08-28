package day08.Exam;

public enum TheShapes {
    CIRCLE("원"),
    SQUARE("정사각형"),
    TRIANGLE("정삼각형");
private final String name;

TheShapes(String name){
    this.name = name;
}
public String getName(){
return name;

}
}
