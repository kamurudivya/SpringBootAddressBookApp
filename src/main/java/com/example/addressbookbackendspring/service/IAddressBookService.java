package com.example.addressbookbackendspring.service;



import com.example.addressbookbackendspring.dto.AddressBookDTO;
import com.example.addressbookbackendspring.model.AddressBook;

import java.util.List;

public interface IAddressBookService {

    String getWelcome();
    String saveDataToRepo(AddressBookDTO addressBookDTO);
    List<AddressBook> getAddressBookDataToken(String token);
    AddressBook getRecordOfIdFromToken(String token);
    AddressBook updateRecordByToken(String token, AddressBookDTO addressBookDTO);
    AddressBook deleteRecordByToken(String token);
    List<AddressBook> SortByCity();
    List<AddressBook> SortByState();
    List<AddressBook> SortByZip();

}