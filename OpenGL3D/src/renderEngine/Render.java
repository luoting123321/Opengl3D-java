package renderEngine;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

/**
 * Created by admin on 2017/7/29.
 */
public class Render {

    public  void prepare()
    {
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
        GL11.glClearColor(1,0,0,1);
    }

    public  void render(RawModel model)
    {
        GL30.glBindVertexArray(model.getVaoId());
        GL20.glEnableVertexAttribArray(0);
       // GL11.glDrawArrays(GL11.GL_TRIANGLES,0,model.getVectexCount());
        GL11.glDrawElements(GL11.GL_TRIANGLES,model.getVectexCount(),GL11.GL_UNSIGNED_INT,0);
        GL20.glDisableVertexAttribArray(0);
        GL30.glBindVertexArray(0);
    }
}
