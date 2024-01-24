import java.awt.*;

public class Editor4 {
    public static void main(String[] args) {

        // get the params from the user
        String source = args[0];
        int n = Integer.parseInt(args[1]);
        Color[][] sourceImage = Runigram.read(source);
        // get the target image from the
        Color[][] targetImage = Runigram.grayScaled(sourceImage);

        Runigram.setCanvas(sourceImage);
        // call the morph function with the source and the final image
        Runigram.morph(sourceImage, targetImage, n);


    }
}
