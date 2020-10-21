/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.programacionfecha.service.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.gob.mimp.siscap.model.ProgramacionFecha;
import pe.gob.mimp.siscap.repository.programacionfecha.ProgramFecRepository;
import pe.gob.mimp.programacionfecha.bean.FindByParamBean;
import pe.gob.mimp.programacionfecha.bean.ProgramacionFechaBean;
import pe.gob.mimp.programacionfecha.converter.ProgramacionFechaCast;
import pe.gob.mimp.programacionfecha.util.Util;
import pe.gob.mimp.programacionfecha.service.ProgramacionFechaService;

/**
 *
 * @author Omar
 */
@Transactional(rollbackFor = Exception.class)
@Service
public class ProgramacionFechaServiceImpl implements ProgramacionFechaService {

    @Autowired
    private ProgramFecRepository programacionFechaRepository;

    @Override
    public void crearProgramacionFecha(ProgramacionFechaBean programacionFechaBean) throws Exception {

        ProgramacionFecha programacionFecha = new ProgramacionFecha();
        programacionFecha.setTxtAnio(programacionFechaBean.getTxtAnio());
        programacionFecha.setNumTrimestre(programacionFechaBean.getNumTrimestre());
        programacionFecha.setFecInicio(programacionFechaBean.getFecInicio());
        programacionFecha.setFecFin(programacionFechaBean.getFecFin());
        programacionFecha.setNidTipoActividad(programacionFechaBean.getNidTipoActividad());
        programacionFecha.setNidUsuario(programacionFechaBean.getNidUsuario());
        programacionFecha.setTxtPc(programacionFechaBean.getTxtPc());
        programacionFecha.setTxtIp(programacionFechaBean.getTxtIp());
        programacionFecha.setFecEdicion(programacionFechaBean.getFecEdicion());
        programacionFecha.setFlgActivo(programacionFechaBean.getFlgActivo());

        programacionFechaRepository.save(programacionFecha);

    }

    @Override
    public void editarProgramacionFecha(ProgramacionFechaBean programacionFechaBean) {

        ProgramacionFecha programacionFecha = new ProgramacionFecha();

        programacionFecha.setNidProgramacionFecha(programacionFechaBean.getNidProgramacionFecha());
        programacionFecha.setTxtAnio(programacionFechaBean.getTxtAnio());
        programacionFecha.setNumTrimestre(programacionFechaBean.getNumTrimestre());
        programacionFecha.setFecInicio(programacionFechaBean.getFecInicio());
        programacionFecha.setFecFin(programacionFechaBean.getFecFin());
        programacionFecha.setNidTipoActividad(programacionFechaBean.getNidTipoActividad());
        programacionFecha.setNidUsuario(programacionFechaBean.getNidUsuario());
        programacionFecha.setTxtPc(programacionFechaBean.getTxtPc());
        programacionFecha.setTxtIp(programacionFechaBean.getTxtIp());
        programacionFecha.setFecEdicion(programacionFechaBean.getFecEdicion());
        programacionFecha.setFlgActivo(programacionFechaBean.getFlgActivo());

        programacionFechaRepository.save(programacionFecha);

    }

//    @Override
//    public String obtenerProgramacionFechaPorId(BigDecimal nidProgramacionFecha) throws Exception {
//
//        Optional<ProgramacionFecha> programacionFecha = programacionFechaRepository.findById(nidProgramacionFecha);
//
//        if (programacionFecha.isPresent()) {
//            return programacionFecha.get().getTxtProgramacionFecha();
//        }
//
//        return "";
//    }
    @Override
    public List<ProgramacionFechaBean> loadProgramacionFechaList(FindByParamBean findByParamBean) throws Exception {

        if (findByParamBean.getParameters() == null) {
            findByParamBean.setParameters(new HashMap<>());
        }

        List<ProgramacionFecha> programacionFechaList = programacionFechaRepository.findByParams(findByParamBean.getParameters(), findByParamBean.getOrderBy());

        if (!Util.esListaVacia(programacionFechaList)) {

            return programacionFechaList.stream().map(programacionFecha -> {
                ProgramacionFechaBean programacionFechaBean = new ProgramacionFechaBean();
                programacionFechaBean.setNidProgramacionFecha(programacionFecha.getNidProgramacionFecha());
                programacionFecha.setTxtAnio(programacionFechaBean.getTxtAnio());
                programacionFecha.setNumTrimestre(programacionFechaBean.getNumTrimestre());
                programacionFecha.setFecInicio(programacionFechaBean.getFecInicio());
                programacionFecha.setFecFin(programacionFechaBean.getFecFin());
                programacionFecha.setNidTipoActividad(programacionFechaBean.getNidTipoActividad());
                programacionFechaBean.setNidUsuario(programacionFecha.getNidUsuario());
                programacionFechaBean.setTxtPc(programacionFecha.getTxtPc());
                programacionFechaBean.setTxtIp(programacionFecha.getTxtIp());
                programacionFechaBean.setFecEdicion(programacionFecha.getFecEdicion());
                programacionFechaBean.setFlgActivo(programacionFecha.getFlgActivo());
                return programacionFechaBean;
            }).collect(Collectors.toList());
        }

        return null;
    }
    
    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) throws Exception {

        if (findByParamBean.getParameters() == null) {
            findByParamBean.setParameters(new HashMap<>());
        }
        Integer count = programacionFechaRepository.getRecordCount(findByParamBean.getParameters());
        return count;
    }

    @Override
    public ProgramacionFechaBean find(BigDecimal id) {

        Optional<ProgramacionFecha> programacionFecha = programacionFechaRepository.findById(id);

        if (!programacionFecha.isPresent()) {
            return null;
        }

        return ProgramacionFechaCast.castProgramacionFechaToProgramacionFechaBean(programacionFecha.get());

    }

}
