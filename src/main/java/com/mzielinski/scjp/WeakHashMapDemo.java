package mzielins.scjp;

import java.lang.ref.WeakReference;

/**
 * Created with IntelliJ IDEA.
 * User: mzielinski
 * Date: 5/6/13
 * Time: 4:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class WeakHashMapDemo {

    public void ads()
    {}

    public static void main(String[] args) {
        // -- Fill a weak hash map with one entry
//        Map<Data, String> map = new WeakHashMap<Data, String>();
//        Map<WeakReference<Data>, String> map = new HashMap<WeakReference<Data>, String>();
        Data someDataObject = new Data("foo");
        WeakReference<Data> reference = new WeakReference<Data>(someDataObject);
//        map.put(reference, someDataObject.value);
//        System.out.println("map contains someDataObject ? " + map.containsKey(someDataObject));

        // -- now make someDataObject elligible for garbage collection...
        someDataObject = null;

        for (int i = 0; ;i++) {
//            if (map.size() != 0) {
//                System.out.println("At iteration " + i + " the map still holds the reference on someDataObject");
//            } else {
//                System.out.println("somDataObject has finally been garbage collected at iteration " + i + ", hence the map is now empty");
//                break;
//            }

            if (reference.get() != null) {
                System.out.println("At iteration " + i + " the map still holds the reference on someDataObject");
            } else {
                System.out.println("somDataObject has finally been garbage collected at iteration " + i + ", hence the map is now empty");
                break;
            }
        }
    }

    private static class Data {
        private String value;
        public Data(String value) {
            this.value = value;
        }
    }

}
