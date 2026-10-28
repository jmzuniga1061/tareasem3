package zuniga.com.tarea01.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import zuniga.com.tarea01.model.Product

@Repository
interface ProductRepository : JpaRepository<Product, Int>