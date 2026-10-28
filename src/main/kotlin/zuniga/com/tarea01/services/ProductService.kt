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
        return productRepository.save(product)
    }

    fun update(product: Product): String {

        val existing = productRepository.findById(product.id!!)

        if (!existing.isPresent) {
            throw Exception("Producto no encontrado")
        }

        productRepository.save(product)

        return "Producto actualizado correctamente"
    }

    fun delete(id: Int): String {

        val existing = productRepository.findById(id)

        if (!existing.isPresent) {
            throw Exception("Producto no encontrado")
        }

        productRepository.deleteById(id)

        return "Producto eliminado correctamente"
    }
}