package com.clubdeportivo2.servicioreservas.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.clubdeportivo2.servicioreservas.model.dto.Cancha;

@FeignClient(name = "serviciocanchas", url = "http://localhost:8081")
public interface CanchaClient {

    @GetMapping("/api/canchas/{id}")
    Cancha obtenerCancha(@PathVariable("id") Long id);
}