import java.util.EnumSet;

public enum Points {
    LOVE("0"),
    FIFTEEN("15"),
    THIRTY("30"),
    FOURTY("40"),
    ADVANTAGE("A");

    private String value;
    private Points(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }

    public Points next(){
        if(ordinal() < EnumSet.allOf(Points.class).size() - 1) {
            return values()[ordinal() + 1];
        }else return values()[ordinal()];
    }

    public Points previous(){
        if(ordinal() >= 1) {
            return values()[ordinal() - 1];
        }else return values()[ordinal()];
    }
}
