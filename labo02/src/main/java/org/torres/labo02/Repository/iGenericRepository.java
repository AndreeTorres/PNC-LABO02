package org.torres.labo02.Repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface iGenericRepository<T, ID> extends JpaRepository<T, ID> {

}
