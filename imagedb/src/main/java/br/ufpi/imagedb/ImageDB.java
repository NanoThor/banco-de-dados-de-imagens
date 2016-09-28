package br.ufpi.imagedb;

import java.io.File;

import javax.swing.JFileChooser;

import com.drew.imaging.ImageMetadataReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import com.drew.metadata.jpeg.JpegDirectory;

/*
 * Utilizar este arquivo somente para referencia, porfavor não utiliza-lo na codificação
 */
public class ImageDB {
    public static void main(String[] args) throws Exception {

        JFileChooser jfc = new JFileChooser();
        int status = jfc.showOpenDialog(null);
        if (status != JFileChooser.APPROVE_OPTION)
            return;

        File file = jfc.getSelectedFile();

        Metadata metadata = ImageMetadataReader.readMetadata(file);

        Directory d = metadata.getFirstDirectoryOfType(JpegDirectory.class);

        System.out.println(d.getInt(JpegDirectory.TAG_IMAGE_WIDTH));

        System.out.println(metadata);
        System.out.println(metadata.getClass().getCanonicalName());

        for (Directory directory : metadata.getDirectories()) {
            System.out.println("Directory: " + directory);
            for (Tag tag : directory.getTags()) {
                System.out.printf("[%s] - %s = %s\n", directory.getName(),
                        tag.getTagName(), tag.getDescription());
            }
            if (directory.hasErrors()) {
                for (String error : directory.getErrors()) {
                    System.err.format("ERROR: %s", error);
                }
            }
        }
    }
}
