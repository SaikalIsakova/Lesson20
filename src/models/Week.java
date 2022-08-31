package models;

public enum Week {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3);

    private final int val;

    Week(int v){
        val = v;

    }

    public int getVal(){
        return val;
    }

}
