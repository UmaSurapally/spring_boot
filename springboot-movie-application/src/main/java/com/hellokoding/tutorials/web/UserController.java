package com.hellokoding.tutorials.web;



import com.hellokoding.tutorials.model.BookingDetails.BookDetails;
import com.hellokoding.tutorials.model.MovieDetails;
import com.hellokoding.tutorials.model.User;
import com.hellokoding.tutorials.model.UserDetails;
import com.hellokoding.tutorials.repository.BookDetailsRepository;
import com.hellokoding.tutorials.repository.MovieDetailsRepository;
import com.hellokoding.tutorials.repository.UserDetailsRepository;
import com.hellokoding.tutorials.service.SecurityService;
import com.hellokoding.tutorials.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;
    
    @Autowired
    UserDetailsRepository repo;
    
    @Autowired
    MovieDetailsRepository repo1;
    
    @Autowired
    BookDetailsRepository repo2;
    
    @GetMapping("/registration")
    public String registration(Model model) {
        if (securityService.isAuthenticated()) {
            return "redirect:/";
        }

        model.addAttribute("userForm", new User());

        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/welcome";
    }

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (securityService.isAuthenticated()) {
            return "redirect:/";
        }

        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    @GetMapping({"/", "/welcome"})
    public String welcome(Model model) {
        return "welcome";
    }
    
    @GetMapping("/insertuser")
    public String insertuser(UserDetails userdetails) {
		
    	repo.save(userdetails);
    	
    	return "welcome";
    	
    }
    
    @GetMapping("/insertmovie")
    public String insertmovie(MovieDetails moviedetails) {
		
    	repo1.save(moviedetails);
    	
    	return "welcome";
    	
    }
    @GetMapping("/insertbookingdetails")
    public String insertbookingdetails(BookDetails bookdetails) {
		
    	repo2.save(bookdetails);
    	
    	return "welcome";
    	
    }
}
