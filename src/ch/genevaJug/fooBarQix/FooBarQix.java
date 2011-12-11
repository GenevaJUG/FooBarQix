package ch.genevaJug.fooBarQix;


import org.apache.log4j.Logger;

public class FooBarQix {

    private final static Logger logger = Logger.getLogger(FooBarQix.class);
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        logger.debug("START FooBarQix");
        FooBarQix fooBarQix = new FooBarQix();
        fooBarQix.display(100);
        logger.debug("END FooBarQix");
    }
    
    public void display(int nbLine) {
        Window window = new Window();
        
        FooBarQixConverter converter = FooBarQixConverter.getInstance();
        for (int i = 1; i <= nbLine; i++) {
            try {
                String value = converter.convert(i);
                window.addValue(value);
            } catch (Exception e) {
                logger.error("Unable to convert value "+i, e);
                // Error policy, continue and hope user will not see the error
                // => we display the number. But we send by mail the error so know they are a error.
                window.addValue(String.valueOf(i));
            }
        }
    }
}
