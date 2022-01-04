/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dados.userData;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class UsuarioDAO {
    public static List<userData> usuarios;
    
    
    public static userData findUsuario(String nome) {
        for (userData m : usuarios) {
            if (m.getName() == nome) {
                return m;
            }
        }
        return null;
    }
}
