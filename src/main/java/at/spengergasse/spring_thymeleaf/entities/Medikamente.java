package at.spengergasse.spring_thymeleaf.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "m_medications")
public class Medikamente
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "m_id")
    private int medikamenteId;
    @Column(name = "m_name")
    private String name;
    @Column(name = "m_description")
    private String description;

    public int getMedikamenteId() {
        return medikamenteId;
    }

    public void setMedikamenteId(int medikamenteId) {
        this.medikamenteId = medikamenteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Medikamente(int medikamenteId, String name, String description) {
        this.medikamenteId = medikamenteId;
        this.name = name;
        this.description = description;
    }
    public Medikamente() {}


}
