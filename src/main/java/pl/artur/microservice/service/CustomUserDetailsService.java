package pl.artur.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import pl.artur.microservice.model.ApplicationUser;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ApplicationUser applicationUser = loadApplicationUserByUsername(username);
        return new User(applicationUser.getUsername(), applicationUser.getPassword(), AuthorityUtils.createAuthorityList("ROLE_USER"));
    }

    public ApplicationUser loadApplicationUserByUsername(String username) {
        return new ApplicationUser("user", passwordEncoder.encode("password"));
    }
}
