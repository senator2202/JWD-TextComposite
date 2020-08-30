package com.kharitonov.text_compositor.data_provider;

public class StaticDataProvider {
    public static final String SOURCE_TEXT ;

    static {
        String ls = System.getProperty("line.separator");
        SOURCE_TEXT =
                "It has survived - not only (five) centuries, but also the leap into 13+ i-- " +
                        "electronic typesetting, remaining 3+5 essentially 6+9*(3-4) unchanged. It was " +
                        "popularised in the 5*(1*2*(3*(4*(5- --j + 4)-3)-2)-1) with the release of Letraset sheets " +
                        "containing Lorem Ipsum passages, and more recently with desktop publishing software " +
                        "like Aldus PageMaker including versions of Lorem Ipsum." + ls +
                        "It is a long established fact that a reader will be distracted by the readable " +
                        "content of a page when looking at its layout. The point of using (71-(2*i--*(3*(2-1/2*2)-" +
                        "2)-10/2))*++i Ipsum is that it has a more-or-less normal distribution of letters, as " +
                        "opposed to using (Content here), content here', making it look like readable English." + ls +
                        "It is a (-5+1/2*(2+5*2- --j))*1200 established fact that a reader will be of a page " +
                        "when looking at its layout." + ls +
                        "Bye.";
    }

    private StaticDataProvider() {
    }
}
