package org.example.repository;

import org.example.entity.Contact;

public class ContactRepository extends RepositoryManager<Contact,Long> {
    public ContactRepository()
    {
        super(new Contact());
    }
}
