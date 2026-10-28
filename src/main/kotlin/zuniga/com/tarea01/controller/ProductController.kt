package zuniga.com.tarea01.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import zuniga.com.tarea01.model.Product
import zuniga.com.tarea01.services.ProductService

@RestController
@RequestMapping("/product")
class ProductController {

    @Autowired
    lateinit var productService: ProductService

    @GetMapping
    fun list(): List<Product> {
        return productService.list()
    }

    @PostMapping
    fun save(@RequestBody product: Product): Product {
        return productService.save(product)
    }
}