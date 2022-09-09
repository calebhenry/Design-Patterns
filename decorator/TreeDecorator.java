import java.util.ArrayList;

public abstract class TreeDecorator extends Tree {
    public TreeDecorator (ArrayList<String> lines) {
        
    }

    protected void integrateDecor(ArrayList<String> decor) {
        ArrayList<String> temp;
        for(int i = 0; i < decor.size(); i++) {
            for(int j = 0; j < decor.get(i).length(); j++) {
                if(decor.get(i).charAt(j)==" ") {

                }
                else {

                }

            }
        }
    }
}
