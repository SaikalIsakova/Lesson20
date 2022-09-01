package work20;

public enum Elements {
    H("Водород",1),
    O("Кислород",8),
    SE("Селен",34),
    N("Азот",7),
    FE("Железо",26),
    NE("Неон",10),
    HE("Гелий",2),

    ;

    private String name;
    private int atomicNumber;

    Elements(String name,int atomicNumber){
        this.name=name;
        this.atomicNumber=atomicNumber;
    }

    @Override
    public String toString() {
        return
                "[ Название = ' " + name + '\'' +
                ", Атомный номер = " + atomicNumber +
                " ]";
    }

}
