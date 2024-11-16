/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tipocambio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tipocambio.model.TipoCambio;
import com.tipocambio.service.TipoCambioService;

import java.util.List;

@RestController
@RequestMapping("/api/tipo-cambio")
public class TipoCambioController {
    @Autowired
    private TipoCambioService service;

    @GetMapping
    public List<TipoCambio> obtenerTipoCambio() {
        return service.obtenerSolicitudes();
    }

    @PostMapping
    public TipoCambio nuevaSolicitud() {
        return service.guardarSolicitud();
    }
}