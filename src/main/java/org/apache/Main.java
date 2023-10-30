package org.apache;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.apache.ddl.objects.Dataset;


import java.io.IOException;
import java.io.InputStream;


public class Main {
    public static void main(String[] args) throws IOException {

        String datasetName = "sample_data";
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        InputStream inputStream = Main.class
                .getClassLoader()
                .getResourceAsStream("%s.yml".formatted(datasetName));


        Dataset dataset = objectMapper.readValue(inputStream, Dataset.class);
        dataset.setName(datasetName);
        System.out.println(dataset);

    }
}
