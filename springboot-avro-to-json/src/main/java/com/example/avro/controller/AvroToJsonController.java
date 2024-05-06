package com.example.avro.controller;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.FileReader;
import org.apache.avro.io.DatumReader;
import org.apache.avro.specific.SpecificDatumReader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//import com.example.avro.Example;


@RestController
public class AvroToJsonController {

//    @GetMapping("/convert")
//    public ResponseEntity<List<String>> convertAvroToJson() throws IOException {
//        List<String> jsonList = new ArrayList<>();
//
//        // Deserialize Avro data
//        DatumReader<Example> reader = new SpecificDatumReader<>(Example.class);
//        FileReader<Example> dataFileReader =
//                DataFileReader.openReader(new File("example.avro"), reader);
//        Example example = null;
//        while (dataFileReader.hasNext()) {
//            example = dataFileReader.next(example);
//            // Convert to JSON
//            String json = example.toString();
//            jsonList.add(json);
//        }
//        dataFileReader.close();
//
//        return ResponseEntity.ok(jsonList);
//    }
}
