package Shaders;

/**
 * Created by admin on 2017/7/29.
 */
public class StaticShader extends  ShaderProgram {

    private  static  final  String VERTEX_FILE = "src/Shaders/vertexShader.txt";
    private  static  final  String FRAGMENT_FILE = "src/Shaders/fragShader.txt";

    public StaticShader() {
        super(VERTEX_FILE, FRAGMENT_FILE);
    }

    @Override
    protected void bindAttributes() {
        super.bindAttribute(0,"position");
    }
}
