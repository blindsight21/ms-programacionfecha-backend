/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.programacionfecha.converter;

import pe.gob.mimp.programacionfecha.bean.ProgramacionFechaBean;
import pe.gob.mimp.siscap.model.ProgramacionFecha;

/**
 *
 * @author Omar
 */
public class ProgramacionFechaCast {

    public static ProgramacionFechaBean castProgramacionFechaToProgramacionFechaBean(ProgramacionFecha programacionFecha) {

        if (programacionFecha == null) {
            return null;
        }

        ProgramacionFechaBean programacionFechaBean = new ProgramacionFechaBean();

        programacionFechaBean.setNidProgramacionFecha(programacionFecha.getNidProgramacionFecha());
        programacionFechaBean.setTxtAnio(programacionFecha.getTxtAnio());
        programacionFechaBean.setNumTrimestre(programacionFecha.getNumTrimestre());
        programacionFechaBean.setFecInicio(programacionFecha.getFecInicio());
        programacionFechaBean.setFecFin(programacionFecha.getFecFin());
        programacionFechaBean.setNidTipoActividad(programacionFecha.getNidTipoActividad());

        programacionFechaBean.setFlgActivo(programacionFecha.getFlgActivo());
        programacionFechaBean.setNidUsuario(programacionFecha.getNidUsuario());
        programacionFechaBean.setTxtPc(programacionFecha.getTxtPc());
        programacionFechaBean.setTxtIp(programacionFecha.getTxtIp());
        programacionFechaBean.setFecEdicion(programacionFecha.getFecEdicion());

        return programacionFechaBean;
    }

    public static ProgramacionFecha castProgramacionFechaBeanToProgramacionFecha(ProgramacionFechaBean programacionFechaBean) {

        if (programacionFechaBean == null) {
            return null;
        }

        ProgramacionFecha programacionFecha = new ProgramacionFecha();

        programacionFecha.setNidProgramacionFecha(programacionFechaBean.getNidProgramacionFecha());
        programacionFecha.setTxtAnio(programacionFechaBean.getTxtAnio());
        programacionFecha.setNumTrimestre(programacionFechaBean.getNumTrimestre());
        programacionFecha.setFecInicio(programacionFechaBean.getFecInicio());
        programacionFecha.setFecFin(programacionFechaBean.getFecFin());
        programacionFecha.setNidTipoActividad(programacionFechaBean.getNidTipoActividad());

        programacionFecha.setFlgActivo(programacionFechaBean.getFlgActivo());
        programacionFecha.setNidUsuario(programacionFechaBean.getNidUsuario());
        programacionFecha.setTxtPc(programacionFechaBean.getTxtPc());
        programacionFecha.setTxtIp(programacionFechaBean.getTxtIp());
        programacionFecha.setFecEdicion(programacionFechaBean.getFecEdicion());

        return programacionFecha;
    }
}
