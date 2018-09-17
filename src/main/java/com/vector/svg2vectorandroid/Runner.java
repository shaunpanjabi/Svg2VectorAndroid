package com.vector.svg2vectorandroid;

/**
 * Created by ravi on 19/12/17.
 */
public class Runner {
    public static void main(String args[]){
        if (args.length == 0) {
            System.out.println("Provide source directory as first arguement for svg files to be converted\n example: java -jar Svg2VectorAndroid-1.0.jar <SourceDirectoryPath>");
            return;
        }

        String sourceDirectory = args[0];
        SvgFilesProcessor processor = null;

        if (args.length == 2) {
            String destinationDirectory = args[1];

            if (null != sourceDirectory && !sourceDirectory.isEmpty() &&
                null != destinationDirectory && !destinationDirectory.isEmpty()) {
                processor = new SvgFilesProcessor(sourceDirectory, destinationDirectory);
            }
        }
        else {
            if (null != sourceDirectory && !sourceDirectory.isEmpty()) {
                processor = new SvgFilesProcessor(sourceDirectory);
            }
        }

        if (processor != null) {
            processor.process();
        }
    }
}
