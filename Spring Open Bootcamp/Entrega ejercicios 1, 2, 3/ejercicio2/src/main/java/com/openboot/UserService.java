package com.openboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificacionService notificacionService;

    public UserService(NotificacionService notificacionService) {
        System.out.println("Ejecutando constructor NotificacionService");
        this.notificacionService = notificacionService;
    }
}
