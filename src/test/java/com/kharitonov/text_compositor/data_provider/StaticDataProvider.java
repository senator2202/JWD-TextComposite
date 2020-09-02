package com.kharitonov.text_compositor.data_provider;

public class StaticDataProvider {
    public static final String TEXT_INTERPRETED;
    public static final String TEXT_SOURCE;
    public static final String PARAGRAPH_SOURCE;
    public static final String SENTENCE_SOURCE;
    public static final String PARAGRAPH_INTERPRETED;
    public static final String SENTENCE_INTERPRETED;


    static {
        String ls = System.getProperty("line.separator");
        TEXT_INTERPRETED = "It has survived - not only (five) centuries, but " +
                "also the leap into 22 electronic typesetting, remaining" +
                " 8 essentially -3 unchanged. It was popularised" +
                " in the -115 with the release of Letraset sheets" +
                " containing Lorem Ipsum passages, and more recently" +
                " with desktop publishing software like Aldus" +
                " PageMaker including versions of Lorem Ipsum." + ls +
                "It is a long established fact that a reader will" +
                " be distracted by the readable content of a page" +
                " when looking at its layout. The point of using" +
                " 522 Ipsum is that it has a more-or-less normal" +
                " distribution of letters, as opposed to using" +
                " (Content here), content here', making it look" +
                " like readable English." + ls +
                "It is a -4200 established fact that a reader will" +
                " be of a page when looking at its layout." + ls +
                "Bye.";
        TEXT_SOURCE = "It has survived - not only (five) centuries, " +
                "but also the leap into 13+9 electronic typesetting," +
                " remaining 3+5 essentially 6+9*(3-4) unchanged. It" +
                " was popularised in the 5*(1*2*(3*(4*(5-9+4)-3)-2)-1)" +
                " with the release of Letraset sheets containing Lorem" +
                " Ipsum passages, and more recently with desktop publishing" +
                " software like Aldus PageMaker including versions of " +
                "Lorem Ipsum." + ls +
                "It is a long established fact that a reader will be" +
                " distracted by the readable content of a page when looking" +
                " at its layout. The point of using" +
                " (71-(2*9*(3*(2-1/2*2)-2)-10/2))*9 Ipsum is that it has" +
                " a more-or-less normal distribution of letters, as opposed" +
                " to using (Content here), content here', making it look " +
                "like readable English." + ls +
                "It is a (-5+1/2*(2+5*2-9))*1200 established fact that a" +
                " reader will be of a page when looking at its layout." + ls +
                "Bye.";
        PARAGRAPH_SOURCE = "It has survived - not only (five) centuries, " +
                "but also the leap into 13+9 electronic typesetting, " +
                "remaining 3+5 essentially 6+9*(3-4) unchanged. It was " +
                "popularised in the 5*(1*2*(3*(4*(5-9+4)-3)-2)-1) with " +
                "the release of Letraset sheets containing Lorem Ipsum " +
                "passages, and more recently with desktop publishing " +
                "software like Aldus PageMaker including versions of " +
                "Lorem Ipsum.";
        PARAGRAPH_INTERPRETED = "It has survived - not only (five) centuries," +
                " but also the leap into 22 electronic typesetting, " +
                "remaining 8 essentially -3 unchanged. It was " +
                "popularised in the -115 with " +
                "the release of Letraset sheets containing Lorem Ipsum " +
                "passages, and more recently with desktop publishing " +
                "software like Aldus PageMaker including versions of " +
                "Lorem Ipsum.";
        SENTENCE_SOURCE = "It has survived - not only (five)" +
                " centuries, but also the leap into 13+9 electronic" +
                " typesetting, remaining 3+5 essentially 6+9*(3-4) unchanged.";
        SENTENCE_INTERPRETED = "It has survived - not only (five)" +
                " centuries, but also the leap into 22 electronic" +
                " typesetting, remaining 8 essentially -3 unchanged.";
    }

    private StaticDataProvider() {
    }
}
