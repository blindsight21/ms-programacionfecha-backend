/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.programacionfecha.ws.rest;

import java.math.BigDecimal;
import java.util.List;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.gob.mimp.programacionfecha.bean.FindByParamBean;

import pe.gob.mimp.programacionfecha.bean.ResponseData;
import pe.gob.mimp.programacionfecha.bean.ProgramacionFechaBean;
import pe.gob.mimp.programacionfecha.service.ProgramacionFechaService;

/**
 *
 * @author BlindSight
 */
@RestController
@RequestMapping(value = "/")
public class ProgramacionFechaController {

    @Autowired
    private ProgramacionFechaService programacionFechaService;

    @PostMapping(value = "/crearProgramacionFecha", consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseData<?>> crearProgramacionFecha(@RequestBody ProgramacionFechaBean programacionFechaBean) throws Exception {

        programacionFechaService.crearProgramacionFecha(programacionFechaBean);

        ResponseData<Object> response = new ResponseData<>();
        response.setCod(HttpStatus.CREATED.value());
        response.setMsg(HttpStatus.CREATED.getReasonPhrase());

        return ResponseEntity.ok(response);

    }

    @PostMapping(value = "/editarProgramacionFecha", consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseData<?>> editarProgramacionFecha(@RequestBody ProgramacionFechaBean programacionFechaBean) throws Exception {

        programacionFechaService.editarProgramacionFecha(programacionFechaBean);

        ResponseData<Object> response = new ResponseData<>();
        response.setCod(HttpStatus.OK.value());
        response.setMsg(HttpStatus.OK.getReasonPhrase());

        return ResponseEntity.ok(response);

    }

//    @GetMapping(value = "/obtenerProgramacionFechaPorId/{nidProgramacionFecha}")
//    public ResponseEntity<ResponseData<?>> obtenerProgramacionFechaPorId(@PathVariable("nidProgramacionFecha") BigDecimal nidProgramacionFecha) throws Exception {
//
//        String txtProgramacionFecha = programacionFechaService.obtenerProgramacionFechaPorId(nidProgramacionFecha);
//
//        ResponseData<Object> response = new ResponseData<>();
//        response.setCod(HttpStatus.OK.value());
//        response.setMsg(HttpStatus.OK.getReasonPhrase());
//        response.setResultado(txtProgramacionFecha);
//
//        return ResponseEntity.ok(response);
//
//    }
    @PostMapping(value = "/loadProgramacionFechaList", consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseData<?>> loadProgramacionFechaList(@RequestBody FindByParamBean findByParamBean) throws Exception {

        List<ProgramacionFechaBean> programacionFechaList = programacionFechaService.loadProgramacionFechaList(findByParamBean);

        ResponseData<Object> response = new ResponseData<>();
        response.setCod(HttpStatus.OK.value());
        response.setMsg(HttpStatus.OK.getReasonPhrase());
        response.setResultado(programacionFechaList);

        return ResponseEntity.ok(response);

    }

    @PostMapping(value = "/getRecordCount", consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseData<?>> getRecordCount(@RequestBody FindByParamBean findByParamBean) throws Exception {

        Integer count = programacionFechaService.getRecordCount(findByParamBean);

        ResponseData<Object> response = new ResponseData<>();
        response.setCod(HttpStatus.OK.value());
        response.setMsg(HttpStatus.OK.getReasonPhrase());
        response.setResultado(count);

        return ResponseEntity.ok(response);

    }
    
    @GetMapping(value = "/find/{id}")
    public ResponseEntity<ResponseData<?>> find(@PathVariable("id") BigDecimal id) throws Exception {

        ProgramacionFechaBean programacionFechaBean = programacionFechaService.find(id);

        ResponseData<Object> response = new ResponseData<>();
        response.setCod(HttpStatus.OK.value());
        response.setMsg(HttpStatus.OK.getReasonPhrase());
        response.setResultado(programacionFechaBean);

        return ResponseEntity.ok(response);

    }

}
