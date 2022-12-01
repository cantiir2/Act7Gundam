/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author acer
 */
@Entity
@Table(name = "mahasiswa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mahasiswa.findAll", query = "SELECT m FROM Mahasiswa m")
    , @NamedQuery(name = "Mahasiswa.findByNrp", query = "SELECT m FROM Mahasiswa m WHERE m.nrp = :nrp")
    , @NamedQuery(name = "Mahasiswa.findByNama", query = "SELECT m FROM Mahasiswa m WHERE m.nama = :nama")
    , @NamedQuery(name = "Mahasiswa.findByAngkatan", query = "SELECT m FROM Mahasiswa m WHERE m.angkatan = :angkatan")
    , @NamedQuery(name = "Mahasiswa.findBySekolahAsal", query = "SELECT m FROM Mahasiswa m WHERE m.sekolahAsal = :sekolahAsal")})
public class Mahasiswa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nrp")
    private String nrp;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "angkatan")
    private String angkatan;
    @Basic(optional = false)
    @Column(name = "sekolah_asal")
    private String sekolahAsal;

    public Mahasiswa() {
    }

    public Mahasiswa(String nrp) {
        this.nrp = nrp;
    }

    public Mahasiswa(String nrp, String nama, String angkatan, String sekolahAsal) {
        this.nrp = nrp;
        this.nama = nama;
        this.angkatan = angkatan;
        this.sekolahAsal = sekolahAsal;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public String getSekolahAsal() {
        return sekolahAsal;
    }

    public void setSekolahAsal(String sekolahAsal) {
        this.sekolahAsal = sekolahAsal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrp != null ? nrp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mahasiswa)) {
            return false;
        }
        Mahasiswa other = (Mahasiswa) object;
        if ((this.nrp == null && other.nrp != null) || (this.nrp != null && !this.nrp.equals(other.nrp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Mahasiswa[ nrp=" + nrp + " ]";
    }
    
}
