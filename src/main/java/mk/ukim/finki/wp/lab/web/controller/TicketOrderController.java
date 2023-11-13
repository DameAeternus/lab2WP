// TicketOrderController.java
package mk.ukim.finki.wp.lab.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ticket")
public class TicketOrderController {

    @PostMapping("/order")
    public String placeOrder(Model model) {
        // Business logic for placing an order
        // You can access the order details from the form using @ModelAttribute if needed

        // For simplicity, let's assume the order is successful
        model.addAttribute("message", "Order placed successfully!");
        return "order-confirmation";
    }
}
