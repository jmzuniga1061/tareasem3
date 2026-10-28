package zuniga.com.tarea01.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import zuniga.com.tarea01.model.Product
import zuniga.com.tarea01.repository.ProductRepository

@Service
class ProductService {

    @Autowired
    lateinit var productRepository: ProductRepository

    fun list(): List<Product> {
        return productRepository.findAll()
    }

    fun save(product: Product): Product {

        if (product.description.isNullOrBlank()) {
            throw Exception("La descripción es obligatoria")
        }

        if (product.stock != null && product.stock!! < 0) {
            throw Exception("El stock no puede ser negativo")
        }

        return productRepository.save(product)
    }
}