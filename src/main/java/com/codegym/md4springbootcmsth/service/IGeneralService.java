package com.codegym.md4springbootcmsth.service;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAlL();

    Optional<T> findById(Long id);

    void save(T t);

    void remove(Long id);
}
