package com.mycompany.prjinterfaces.classes;

/**
 *
 * @author IFTM
 */
public interface Conta {
    void depositar(double valor);
    void sacar(double valor);
    double getSaldo();
}
