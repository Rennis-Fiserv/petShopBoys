// package com.pizzashop.H2database.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.ResponseStatus;
// import org.springframework.web.bind.annotation.RestController;

// import com.pizzashop.H2database.model.CustomerOrder;
// import com.pizzashop.H2database.service.CustomerOrderService;

// import reactor.core.publisher.Flux;
// import reactor.core.publisher.Mono;

// @CrossOrigin(origins = "http://localhost:8081")
// @RestController
// @RequestMapping("/api")
// public class CustomerOrderController {
//     @Autowired
//     CustomerOrderService CustomerOrderService;

//     @GetMapping("/customers")
//     @ResponseStatus(HttpStatus.OK)
//     public Flux<CustomerOrder> getAllProducts(@RequestParam(required = false) String name) {
//         if (name == null) {
//             return CustomerOrderService.findAll();
//         } else {
//             return CustomerOrderService.findByName(name);
//         }
//     }

//     @GetMapping("/customers/{id}")
//     @ResponseStatus(HttpStatus.OK)
//     public Mono<CustomerOrder> getProductById(@PathVariable("id") int id) {
//         return CustomerOrderService.findById(id);
//     }

//     @PostMapping("/customers")
//     @ResponseStatus(HttpStatus.CREATED)
//     public Mono<CustomerOrder> createCustomer(@RequestBody CustomerOrder CustomerOrder) {
//         return CustomerOrderService.save(
//                 new CustomerOrder(
//                         CustomerOrder.getFirst_name(),
//                         CustomerOrder.getLast_name(),
//                         CustomerOrder.getPhone_number()));
//     }

//     @PutMapping("/customers/{id}")
//     @ResponseStatus(HttpStatus.OK)
//     public Mono<CustomerOrder> updateProduct(@PathVariable("id") int id, @RequestBody CustomerOrder CustomerOrder) {
//         return CustomerOrderService.update(id, CustomerOrder);
//     }

//     @DeleteMapping("/customers/{id}")
//     @ResponseStatus(HttpStatus.NO_CONTENT)
//     public Mono<Void> deleteProduct(@PathVariable("id") int id) {
//         return CustomerOrderService.deleteById(id);
//     }

//     @DeleteMapping("/customers")
//     @ResponseStatus(HttpStatus.NO_CONTENT)
//     public Mono<Void> deleteAllProducts() {
//         return CustomerOrderService.deleteAll();
//     }
// }

