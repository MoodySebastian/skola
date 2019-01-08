package com.example.demofimkf.dao;

import com.example.demofimkf.domain.User;

import java.util.List;

public interface Userdao {

    /**
     * Ulozi uzivatele
     * @param user
     */
    void create(User user);

    /**
     * Najde ulozeneho uzivatele
     * @param id
     * @return nalezeny uzivatel (jinak null)
     */
    User findById(long id);

    /**
     * Najde vsechny uzivatele
     * @return seznam vsech uzivatelu
     */
    List<User> findAll();
}
