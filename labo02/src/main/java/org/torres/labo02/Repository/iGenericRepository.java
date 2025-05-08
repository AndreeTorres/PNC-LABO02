package org.torres.labo02.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface iGenericRepository<T, ID> extends JpaRepository<T, ID> {

}
