package com.example.avro.poc2;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
//import org.codehaus.jackson.map.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class AvroToJsonConverterUser {

    public static void main(String[] args) throws IOException {
        // Load Avro schema
        Schema schema = new Schema.Parser().parse(new File("bank_user_schema.avsc"));

        // Create Avro reader
        DatumReader<GenericRecord> datumReader = new GenericDatumReader<>(schema);
        DataFileReader<GenericRecord> dataFileReader =
                new DataFileReader<>(new File("bank_user_data.avro"), datumReader);

        // Convert Avro records to JSON
        ObjectMapper mapper = new ObjectMapper();
        GenericRecord record = null;
        while (dataFileReader.hasNext()) {
            record = dataFileReader.next(record);
            System.out.println(record);
//            String json = mapper.writeValueAsString(record);
//            System.out.println(json);
        }
        dataFileReader.close();
    }
}
