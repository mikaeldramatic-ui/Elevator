public class Man {
    private String man;
    private int floorAppearsMan;

    private String manBackground = "\n" +
            "En man kommer in och har på sig en svart kostym och tjockt långt hår.\n " +
            "Han bär på en datorväska och en mugg från Starbucks\n" +
            "\n" +
            "Mannen nickar åt dig och väljer sin våning….han ser stressad ut och rädd.\n";

    private String manLine1 = "Mannen tittar snabbt på dig men vänder sig snabbt tillbaka och stirrar mot hissdörren.";

    private String manLine2 = "Mannen svarar inte och börjar darra och svettas ännu mer….";

    private String manLine3 = "Mannen viskar något men du hör inte vad han säger...";

    private String manLine4 = "Mannen viskar högre ba…. ak";
    private String manLine5 =  """
                              BAKOM DIG!
                              Du vänder dig om men ser inget...
                              Du vänder dig tillbaka till mannen som stirrar på dig med sin blick och ett hemskt leende.
                              Du ramlar ner till golvet och han står nu bara och skrattar,
                               tar sedan sin mugg och häller vätska över sig och börjar smälta.""";

        private String userChoiceMan1 =" 1.Hur är det?, Du ser ut som om du har sett ett spöke…";
        private String userChoiceMan2 =" 2.Du är tyst och tittar på mannen..";
    private String userChoiceman3 = " Hur mår du…..?";
    private String userChoiceman4 = "1. SVARA?!?!?";
    private String userChoiceman5 = "2. .....";
    private String userChoiceman6 = "1.Vad viskar du om?";
    private String userChoiceman7 = "2. ....";
    private String userChoiceman8 = "1. TALA HÖGRE!";
    private String userChoiceman9 ="2. Ak...vadå?!";
    private String userChoiceman10 ="1. Tittar på när mannen smälter";
    private String userChoiceman11 = "2. Vill blunda..";

    public Man (String man, int floorAppearsMan) {
        this.man = man;
        this.floorAppearsMan = floorAppearsMan;
    }

    public Man() {

    }

    private String manBackground() {
        return "En man kommer in och har på sig en svart kostym och tjockt långt hår.\n+" +
                " Han bär på en datorväska och en mugg från Starbucks\n" +
                "\n" +
                "Mannen nickar åt dig och väljer sin våning….han ser stressad ut och rädd.";
    }

    public String getman() {
        return man;
    }



    public int getFloorAppearsMan() {
        return floorAppearsMan;
    }
}