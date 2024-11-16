/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tipocambio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tipocambio.model.TipoCambio;

public interface TipoCambioRepository extends JpaRepository<TipoCambio, Long> {
}
