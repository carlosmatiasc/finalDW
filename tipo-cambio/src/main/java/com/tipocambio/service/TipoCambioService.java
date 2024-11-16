/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tipocambio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tipocambio.client.SoapClient;
import com.tipocambio.model.TipoCambio;
import com.tipocambio.repository.TipoCambioRepository;
import com.tipocambio.soapclient.TipoCambioDiaResponse;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class TipoCambioService {
    @Autowired
    private TipoCambioRepository repository;
    @Autowired
    private SoapClient soapClient;

    public TipoCambio guardarSolicitud() {
        TipoCambioDiaResponse response = soapClient.getTipoCambioDia();
        TipoCambio tipoCambio = new TipoCambio();
        tipoCambio.setNumeroSolicitud(UUID.randomUUID().toString());
        tipoCambio.setRespuesta(response.getTipoCambioDiaResult());
        tipoCambio.setFechaSolicitud(LocalDateTime.now());
        return repository.save(tipoCambio);
    }

    public List<TipoCambio> obtenerSolicitudes() {
        return repository.findAll();
    }
}