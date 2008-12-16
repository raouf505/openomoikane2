/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.pppppp
 */

package omoikane.principal

import omoikane.principal.*
import omoikane.sistema.*
import groovy.sql.*;
import groovy.swing.*;
import javax.swing.*;
import java.awt.event.WindowListener;
import javax.swing.event.*;
import groovy.inspect.swingui.*;
import javax.swing.table.TableColumn
import java.awt.event.*;
import groovy.swing.*

/**
 *
 * @author Adan
 */
class Ventas {

    static def lastMovID  = -1
    static def escritorio = omoikane.principal.Principal.escritorio
    //static def getVenta(where) { new Venta(where)}

    static def lanzarCatalogo()
    {
        def cat = (new omoikane.formularios.CatalogoVentas())
        cat.setVisible(true);
        escritorio.getPanelEscritorio().add(cat)

        Herramientas.setColumnsWidth(cat.jTable1, [0.12,0.12,0.12,0.12,0.4,0.12]);
        Herramientas.In2ActionX(cat, KeyEvent.VK_ESCAPE, "cerrar"   ) { cat.btnCerrar.doClick()   }
        Herramientas.In2ActionX(cat, KeyEvent.VK_F4    , "detalles" ) { cat.btnDetalles.doClick() }
        Herramientas.In2ActionX(cat, KeyEvent.VK_F8    , "imprimir" ) { cat.btnImprimir.doClick() }
        Herramientas.iconificable(cat)

        cat.toFront()
        try { cat.setSelected(true) } catch(Exception e) { Dialogos.lanzarDialogoError(null, "Error al iniciar formulario catálogo ventas", Herramientas.getStackTraceString(e)) }
        cat.txtBusqueda.requestFocus()
    }

    static def lanzarDetalles(ID)
    {
        lastMovID = ID
        def form = (new omoikane.formularios.VentasDetalles())
        form.setVisible(true);
        escritorio.getPanelEscritorio().add(form)
        Herramientas.setColumnsWidth(form.jTable1, [0.2,0.5,0.1,0.1,0.1])
        Herramientas.In2ActionX(form, KeyEvent.VK_ESCAPE, "cerrar"   ) { form.btnCerrar.doClick()   }
        Herramientas.In2ActionX(form, KeyEvent.VK_F8    , "imprimir" ) { form.btnImprimir.doClick() }

        form.toFront()
        try { form.setSelected(true) } catch(Exception e) { Dialogos.lanzarDialogoError(null, "Error al iniciar formulario nuevo movimiento de almacén", Herramientas.getStackTraceString(e)) }

        def mov         = Nadesico.conectar().getVenta(ID)
        form.setCliente(mov.id_cliente as String)
        form.setDescuento(mov.descuento as String)
        form.setImpuesto(mov.impuestos as String)
        //form.setTipoSalida(mov.tabMatriz as String)
        form.setSubtotal(mov.subtotal as String)
        form.setTotal(mov.total as String)
        form.setAlmacen(mov.id_almacen as String)
        form.setFecha(mov.fecha_hora as String)
        form.setTablaPrincipal(mov.tabMatriz as List)
        form
    }
}

