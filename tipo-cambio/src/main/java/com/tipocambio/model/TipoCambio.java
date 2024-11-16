/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tipocambio.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class TipoCambio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroSolicitud;
    private String respuesta;
    private LocalDateTime fechaSolicitud;

    // Getters y setters
}