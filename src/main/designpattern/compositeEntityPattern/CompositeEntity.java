package main.designpattern.compositeEntityPattern;

/**
 * @author bx
 * @date 9/18/2019 2:24 PM
 */
public class CompositeEntity {
    CoarseGrainedObject coarseGrainedObject = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        coarseGrainedObject.setData(data1, data2);
    }

    public String[] getData() {
        return coarseGrainedObject.getData();
    }
}
