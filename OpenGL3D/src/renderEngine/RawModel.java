package renderEngine;


/**
 * Created by admin on 2017/7/29.
 */
public class RawModel {
    private  int vaoId;
    private  int vectexCount;

    public  RawModel(int vaoId, int vectexCount)
    {
        this.vaoId = vaoId;
        this.vectexCount = vectexCount;
    }

    public int getVaoId() {
        return vaoId;
    }

    public int getVectexCount() {
        return vectexCount;
    }
}
