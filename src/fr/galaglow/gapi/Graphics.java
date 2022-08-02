package fr.galaglow.gapi;

import java.util.ArrayList;
import fr.galaglow.gapi.util.GraphicsTypes;

public class Graphics {

    public static String APP_NAME = "Graphics";
    public static Integer[] APP_SIZE = {800, 600};

    private ArrayList<Integer[2]> values;
    private GraphicsTypes gType;

    private Integer Y_AXIS;
    private Integer X_AXIS;

    public static class InitializeGraphic {

        private GraphicsTypes gType;

        private Integer Y_AXIS;
        private Integer X_AXIS;

        public Graphics create() {

            Graphics graph = new Graphics();

            graph.gType = this.gType;
            graph.Y_AXIS = this.Y_AXIS;
            graph.X_AXIS = this.X_AXIS;

        }

    }

    public static String getAppName() {
        return APP_NAME;
    }

    public static Integer[] getAppSize() {
        return APP_SIZE;
    }

    public ArrayList<Integer> getValues() {
        return this.values;
    }

    public GraphicsTypes getGraphicsTypes() {
        return this.gType;
    }

    public getYAxis() {
        return Y_AXIS;
    }

    public getXAxis() {
        return X_AXIS;
    }

    public static void setAppName(String appName) {
        this.APP_NAME = appName;
    }

    public static void setAppSize(Integer[2] appSize) {
        this.APP_SIZE = appSize;
    }

    public void addPoints(Integer[2] addedValue) {
        this.values.put(addedValue);
    }

    public void setGraphicsTypes(GraphicsTypes gType) {
        this.gType = gType;
    }

    public void setYAxis(Integer yAxis) {
        this.Y_AXIS = yAxis;
    }

    public void setXAxis(Integer xAxis) {
        this.X_AXIS = xAxis;
    }

}