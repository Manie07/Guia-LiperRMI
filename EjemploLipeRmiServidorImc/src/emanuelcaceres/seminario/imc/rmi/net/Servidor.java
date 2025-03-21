/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emanuelcaceres.seminario.imc.rmi.net;

import java.io.IOException;
import emanuelcaceres.seminario.imc.rmi.lib.IRemotaCalculoImc; 
import net.sf.lipermi.exception. LipeRMIException;
import net.sf.lipermi.handler.CallHandler;
import net.sf.lipermi.net.Server;

/**
 *
 * @author emanu
 */
public class Servidor {

    private int puerto = 9008;
    private CallHandler invocador;
    private Server servidor;
    private CalculoRmiImcImplem calculoImc ;
    private IRemotaCalculoImc calculoImcRemoto;

    public Servidor() {
        invocador = new CallHandler();
        servidor = new Server();
        calculoImc = new CalculoRmiImcImplem();
    }

    public void iniciar() throws Exception {
        try {
            invocador.registerGlobal(IRemotaCalculoImc.class, calculoImc);
            servidor.bind(puerto, invocador);
        } catch (LipeRMIException ex) {
            throw new Exception("Error: No es posible invocar metodos remotos");
        } catch (IOException ex) {
            throw new Exception("Error: 1/0");
        }
    }

    public void detener() {
        servidor.close();
    }
}
