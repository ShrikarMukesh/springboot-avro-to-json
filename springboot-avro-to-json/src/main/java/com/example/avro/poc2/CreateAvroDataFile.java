package com.example.avro.poc2;


import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.reflect.ReflectDatumWriter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateAvroDataFile {

//    public static void main(String[] args) throws IOException {
//        // Create example bank users
//        List<BankUser> bankUsers = new ArrayList<>();
//        bankUsers.add(createExampleUser("user123", "John Doe", 30, "Male",
//                createAddress("123 Main St", "Anytown", "CA", "12345"),
//                createAccounts(createBankAccount("acc123", "Savings", 5000.0),
//                        createBankAccount("acc456", "Checking", 10000.0))));
//        bankUsers.add(createExampleUser("user456", "Alice Smith", 25, "Female",
//                createAddress("456 Elm St", "Sometown", "NY", "54321"),
//                createAccounts(createBankAccount("acc789", "Savings", 8000.0))));
//
//        // Write bank users to Avro data file
//        writeAvroDataFile(bankUsers, "bank_user_data.avro");
//
//        System.out.println("Avro data file 'bank_user_data.avro' created successfully.");
//    }
//
//    private static BankUser createExampleUser(String userId, String fullName, int age, String gender,
//                                              Address address, List<BankAccount> accounts) {
//        BankUser user = new BankUser();
//        user.setUserId(userId);
//        user.setFullName(fullName);
//        user.setAge(age);
//        user.setGender(gender);
//        user.setAddress(address);
//        user.setAccounts(accounts);
//        return user;
//    }
//
//    private static Address createAddress(String street, String city, String state, String zipCode) {
//        Address address = new Address();
//        address.setStreet(street);
//        address.setCity(city);
//        address.setState(state);
//        address.setZipCode(zipCode);
//        return address;
//    }
//
//    private static List<BankAccount> createAccounts(BankAccount... bankAccounts) {
//        List<BankAccount> accounts = new ArrayList<>();
//        for (BankAccount account : bankAccounts) {
//            accounts.add(account);
//        }
//        return accounts;
//    }
//
//    private static BankAccount createBankAccount(String accountId, String accountType, double balance) {
//        BankAccount bankAccount = new BankAccount();
//        bankAccount.setAccountId(accountId);
//        bankAccount.setAccountType(accountType);
//        bankAccount.setBalance(balance);
//        return bankAccount;
//    }
//
//    private static void writeAvroDataFile(List<BankUser> bankUsers, String filename) throws IOException {
//        DatumWriter<BankUser> userDatumWriter = new ReflectDatumWriter<>(BankUser.class);
//        try (DataFileWriter<BankUser> dataFileWriter = new DataFileWriter<>(userDatumWriter)) {
//            dataFileWriter.create(bankUsers.get(0).getSchema(), new File(filename));
//            for (BankUser user : bankUsers) {
//                dataFileWriter.append(user);
//            }
//        }
//    }
}

