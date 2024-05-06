package com.example.avro;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.avro.Schema;
import org.apache.avro.file.CodecFactory;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.reflect.ReflectDatumReader;
import org.apache.avro.specific.SpecificDatumReader;

import java.io.File;
import java.io.IOException;

public class AvroToJsonConverter {

    public static void main(String[] args) throws IOException {
        // Load Avro schema
        Schema schema = new Schema.Parser().parse(new File("example.avsc"));

        // Create Avro reader
        CodecFactory codecFactory = CodecFactory.nullCodec();
        DatumReader<GenericRecord> datumReader = new SpecificDatumReader<>(schema);
        DataFileReader<GenericRecord> dataFileReader = new DataFileReader<>(new File("example.avro"), datumReader);

        // Convert Avro records to JSON
        ObjectMapper mapper = new ObjectMapper();
        GenericRecord record = null;
        while (dataFileReader.hasNext()) {
            record = dataFileReader.next(record);
            System.out.println(record);
            //String json = mapper.writeValueAsString(record);
           // System.out.println(json);
        }
        dataFileReader.close();
    }
}
