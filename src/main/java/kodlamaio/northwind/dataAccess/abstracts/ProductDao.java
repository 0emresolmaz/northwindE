package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

//hangi tabloya hangi id veri tiple ile sorguların hazırlanmasını gerektiğini repository'e söylüyoruz.
public interface ProductDao extends JpaRepository<Product, Integer> { // Crud operasyonlari hazir :)

}
