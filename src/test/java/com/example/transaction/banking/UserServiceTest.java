package com.example.transaction.banking;

import com.example.transaction.banking.impl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;

import java.util.UUID;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserServiceTest {
    UserService userService;
    UsersRepository usersRepository;
    private String userId;
    private User user;

    @BeforeEach
    void setUp() {
        //TODO Måste skickas med som en parameter i UserService constructor
        usersRepository = mock(UsersRepository.class);

        userService = new UserServiceImpl(usersRepository);

        userId = UUID.randomUUID().toString();
        user = mock(User.class);
        when(user.getId()).thenReturn(userId);
        when(user.getName()).thenReturn("Arne Gunnarsson");
        when(user.getPersonalIdentificationNumber()).thenReturn("20011010-1234");
        when(user.isActive()).thenReturn(true);
    }

}
