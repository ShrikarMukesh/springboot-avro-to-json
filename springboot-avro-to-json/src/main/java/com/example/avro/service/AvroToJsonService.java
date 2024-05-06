package com.example.avro.service;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;

import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.*;
import org.apache.avro.specific.SpecificDatumWriter;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
public class AvroToJsonService {

 //   public String convertToJson(byte[] avroData) throws IOException {
//        Schema schema = new Schema.Parser().parse(new File("example.avsc"));
//        DatumReader<GenericRecord> reader = new GenericDatumReader<>(schema);
//
//        DatumWriter<GenericRecord> writer = new SpecificDatumWriter<>(schema);
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        JsonEncoder encoder = EncoderFactory.get().jsonEncoder(schema, out);
//
//        GenericRecord record = reader.read(new ByteArrayInputStream(avroData), null);
//        writer.append(record, encoder);
//        encoder.flush();
//
//        return new String(out.toByteArray(), StandardCharsets.UTF_8);
  //  }

//    // Simulate Avro data (replace with your actual data source)
//    private byte[] getAvroData() {
//        GenericRecord user = new GenericRecord(new Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserData\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"age\",\"type\":\"int\"},{\"name\":\"city\",\"type\":\"string\"}]}"));
//        user.put("name", "John Doe");
//        user.put("age", 30);
//        user.put("city", "New York");
//
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        DatumWriter<GenericRecord> writer = new GenericDatumWriter<>(user.getSchema());
//        Encoder encoder = EncoderFactory.get().binaryEncoder(out, null);
//        writer.append(user, encoder);
//        encoder.flush();
//        return out.toByteArray();
//    }
}
