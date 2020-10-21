/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.programacionfecha.service;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.programacionfecha.bean.FindByParamBean;
import pe.gob.mimp.programacionfecha.bean.ProgramacionFechaBean;

/**
 *
 * @author Omar
 */
public interface ProgramacionFechaService {

    void crearProgramacionFecha(ProgramacionFechaBean programacionFechaBean) throws Exception;

    void editarProgramacionFecha(ProgramacionFechaBean programacionFechaBean) throws Exception;

//    void anularProgramacionFecha(ProgramacionFechaBean programacionFechaBean) throws Exception;
//    String obtenerProgramacionFechaPorId(BigDecimal nidProgramacionFecha) throws Exception;
    List<ProgramacionFechaBean> loadProgramacionFechaList(FindByParamBean findByParamBean) throws Exception;

    Integer getRecordCount(FindByParamBean findByParamBean) throws Exception;
    
    ProgramacionFechaBean find(BigDecimal id);
}
