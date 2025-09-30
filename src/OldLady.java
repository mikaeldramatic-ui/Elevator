public class OldLady {
    private String OldLady;
    private int floorAppearsOldLady;

    private String Line1 = "Kvinnan nickar lite lätt och tittar återigen på hisskärmen.\n" +
            "”Du kommer nog trivas bra här….ATJO!”";

    private String Line2 = "”Oj jag blöder näsblod också, typiskt” \n" +
            "Kvinnan försöker ta fram en näsduk men plötsligt börjar skrika av smärta.\n";

    private String Line3 = "Kvinnan bara skriker och börjar blöda ännu mer,\n " +
            "hon vänder sig om och lutar sig mot räcket\n";

    private String Line4 = "Kvinnan vänder sig om och har nu blodsprängda ögon och ser demonisk ut,\n " +
            "hon börjar hoppa fram mot dig och…….bara försvinner.\n";

    public OldLady(String OldLady, int floorAppearsOldLady) {
        this.OldLady = OldLady;
        this.floorAppearsOldLady = floorAppearsOldLady;
    }

    private String OldLadyBackground() {
        return "En kvinna kommer in till hissen och väljer sin våning. " +
                "Medan hon står och väntar så tittar hon på dig och säger: " +
                "Hej!, du måste vara ny här?";
    }

    public String getOldLady() {
        return OldLady;
    }

    public int getFloorAppearsOldLady() {
        return floorAppearsOldLady;

    }
}
