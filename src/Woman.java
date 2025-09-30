public class Woman {


    private String woman;
    private int floorAppearsWoman;



    private String womanBackground = "En kvinna kommer in till hissen och väljer sin våning. \n" +
                "Medan hon står och väntar så tittar hon på dig och säger: \n" +
                "Hej!, du måste vara ny här?";


    private String womanLine1 = "Kvinnan nickar lite lätt och tittar återigen på hisskärmen.\n" +
                            "”Du kommer nog trivas bra här….ATJO!”";

    private String womanLine2 = "”Oj jag blöder näsblod också, typiskt” \n" +
            "Kvinnan försöker ta fram en näsduk men plötsligt börjar skrika av smärta.\n";

    private String womanLine3 =  "Kvinnan bara skriker och börjar blöda ännu mer,\n " +
                            "hon vänder sig om och lutar sig mot räcket\n";

    private String womanLine4 = "Kvinnan vänder sig om och har nu blodsprängda ögon och ser demonisk ut,\n " +
                                "hon börjar hoppa fram mot dig och…… bara försvinner.\n";

    public Woman(String woman, int floorAppearsWoman, String womanBackground, String womanLine1, String womanLine2, String womanLine3, String womanLine4) {
        this.woman = woman;
        this.floorAppearsWoman = floorAppearsWoman;
        this.womanBackground = womanBackground;
        this.womanLine1 = womanLine1;
        this.womanLine2 = womanLine2;
        this.womanLine3 = womanLine3;
        this.womanLine4 = womanLine4;
    }

    public Woman() {

    }

    public String getWomanBackground(){
        return womanBackground;
    }

    public String getWomanLine1() {
        return womanLine1;
    }
    public String getWomanLine2() {
        return womanLine2;
    }

    public String getWomanLine3() {
        return womanLine3;
    }
    public String getWomanLine4(){
        return womanLine4;
    }





    }



