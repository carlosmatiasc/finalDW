/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tipocambio.client;

import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import com.tipocambio.soapclient.TipoCambioDia;
import com.tipocambio.soapclient.TipoCambioDiaResponse;

@Component
public class SoapClient extends WebServiceGatewaySupport {
    public TipoCambioDiaResponse getTipoCambioDia() {
        TipoCambioDia request = new TipoCambioDia();
        return (TipoCambioDiaResponse) getWebServiceTemplate()
                .marshalSendAndReceive("https://www.banguat.gob.gt/variables/ws/TipoCambio.asmx", request);
    }
}