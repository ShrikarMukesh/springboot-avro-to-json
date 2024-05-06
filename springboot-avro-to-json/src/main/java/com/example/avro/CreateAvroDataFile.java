package com.example.avro;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.reflect.ReflectData;
import org.apache.avro.reflect.ReflectDatumWriter;

import java.io.File;
import java.io.IOException;

public class CreateAvroDataFile {

    public static void main(String[] args) throws IOException {
        // Define Avro schema
        Schema schema = ReflectData.get().getSchema(Example.class);

        // Create a GenericRecord instance
        GenericRecord record1 = new GenericData.Record(schema);
        record1.put("id", 1);
        record1.put("name", "John");

        GenericRecord record2 = new GenericData.Record(schema);
        record2.put("id", 2);
        record2.put("name", "Alice");

        // Write records to Avro data file
        DatumWriter<GenericRecord> datumWriter = new ReflectDatumWriter<>(schema);
        try (DataFileWriter<GenericRecord> dataFileWriter = new DataFileWriter<>(datumWriter)) {
            dataFileWriter.create(schema, new File("example.avro"));
            dataFileWriter.append(record1);
            dataFileWriter.append(record2);
        }

        System.out.println("Avro data file 'example.avro' created successfully.");
    }

    // Define Example class matching Avro schema
    public static class Example {
        int id;
        String name;

        public Example() {}

        public Example(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}

