package zuniga.com.tarea01.model

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "product")
class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null

    @Column(length = 100)
    var description: String? = null

    @Column(nullable = false)
    var price: BigDecimal? = null

    @Column(nullable = false)
    var stock: Int? = null
}