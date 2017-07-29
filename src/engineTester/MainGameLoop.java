package engineTester;

import Shaders.StaticShader;
import org.lwjgl.opengl.Display;
import renderEngine.DisplayManager;
import renderEngine.Loader;
import renderEngine.RawModel;
import renderEngine.Render;

/**
 * Created by admin on 2017/7/29.
 */
public class MainGameLoop {

    public  static  void main(String[] args){
        DisplayManager.createDisplay();
        Loader loader = new Loader();
        Render render = new Render();
        StaticShader shader = new StaticShader();

        float[] vertices = { -0.5f, 0.5f, 0f, -0.5f, -0.5f, 0f, 0.5f, -0.5f, 0f, 0.5f, 0.5f, 0f,};
        int[] indices = {
                0,1,3,
                3,1,2
        };

        RawModel model = loader.loadToVAO(vertices,indices);


        while (!Display.isCloseRequested()){
            render.prepare();
            shader.start();
            render.render(model);
            shader.stop();
            DisplayManager.updateDisplay();

        }

        shader.cleanUp();
        loader.cleanUp();
        DisplayManager.closeDisplay();
    }
}
