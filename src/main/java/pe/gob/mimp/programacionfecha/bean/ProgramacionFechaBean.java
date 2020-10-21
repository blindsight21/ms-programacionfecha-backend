/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.programacionfecha.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import pe.gob.mimp.programacionfecha.util.FormatoFechaConstante;

/**
 *
 * @author Omar
 */
public class ProgramacionFechaBean implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @JsonInclude(Include.NON_NULL)
    private BigDecimal nidProgramacionFecha;
    @JsonInclude(Include.NON_NULL)
    private String txtAnio;
    @JsonInclude(Include.NON_NULL)
    private BigInteger numTrimestre;
    @JsonInclude(Include.NON_NULL)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = FormatoFechaConstante.yyyyMMddTHHmmssSSSXXX, timezone = FormatoFechaConstante.ZONA_HORARIA)
    private Date fecInicio;
    @JsonInclude(Include.NON_NULL)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = FormatoFechaConstante.yyyyMMddTHHmmssSSSXXX, timezone = FormatoFechaConstante.ZONA_HORARIA)
    private Date fecFin;
    @JsonInclude(Include.NON_NULL)
    private BigInteger nidTipoActividad;
    @JsonInclude(Include.NON_NULL)
    private BigInteger flgActivo;
    @JsonInclude(Include.NON_NULL)
    private BigInteger nidUsuario;
    @JsonInclude(Include.NON_NULL)
    private String txtPc;
    @JsonInclude(Include.NON_NULL)
    private String txtIp;
    @JsonInclude(Include.NON_NULL)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = FormatoFechaConstante.yyyyMMddTHHmmssSSSXXX, timezone = FormatoFechaConstante.ZONA_HORARIA)
    private Date fecEdicion;

    public BigDecimal getNidProgramacionFecha() {
        return nidProgramacionFecha;
    }

    public void setNidProgramacionFecha(BigDecimal nidProgramacionFecha) {
        this.nidProgramacionFecha = nidProgramacionFecha;
    }

    public String getTxtAnio() {
        return txtAnio;
    }

    public void setTxtAnio(String txtAnio) {
        this.txtAnio = txtAnio;
    }

    public BigInteger getNumTrimestre() {
        return numTrimestre;
    }

    public void setNumTrimestre(BigInteger numTrimestre) {
        this.numTrimestre = numTrimestre;
    }

    public Date getFecInicio() {
        return fecInicio;
    }

    public void setFecInicio(Date fecInicio) {
        this.fecInicio = fecInicio;
    }

    public Date getFecFin() {
        return fecFin;
    }

    public void setFecFin(Date fecFin) {
        this.fecFin = fecFin;
    }

    public BigInteger getNidTipoActividad() {
        return nidTipoActividad;
    }

    public void setNidTipoActividad(BigInteger nidTipoActividad) {
        this.nidTipoActividad = nidTipoActividad;
    }

    public BigInteger getFlgActivo() {
        return flgActivo;
    }

    public void setFlgActivo(BigInteger flgActivo) {
        this.flgActivo = flgActivo;
    }

    public BigInteger getNidUsuario() {
        return nidUsuario;
    }

    public void setNidUsuario(BigInteger nidUsuario) {
        this.nidUsuario = nidUsuario;
    }

    public String getTxtPc() {
        return txtPc;
    }

    public void setTxtPc(String txtPc) {
        this.txtPc = txtPc;
    }

    public String getTxtIp() {
        return txtIp;
    }

    public void setTxtIp(String txtIp) {
        this.txtIp = txtIp;
    }

    public Date getFecEdicion() {
        return fecEdicion;
    }

    public void setFecEdicion(Date fecEdicion) {
        this.fecEdicion = fecEdicion;
    }

    @Override
    public String toString() {
        return "ProgramacionFechaBean{" + "nidProgramacionFecha=" + nidProgramacionFecha + ", txtAnio=" + txtAnio + ", numTrimestre=" + numTrimestre + ", fecInicio=" + fecInicio + ", fecFin=" + fecFin + ", nidTipoActividad=" + nidTipoActividad + ", flgActivo=" + flgActivo + ", nidUsuario=" + nidUsuario + ", txtPc=" + txtPc + ", txtIp=" + txtIp + ", fecEdicion=" + fecEdicion + '}';
    }

}
