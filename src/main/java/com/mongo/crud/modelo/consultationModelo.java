package com.mongo.crud.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="consultation")

public class consultationModelo {
    @Id
    private String _id;
    private String history;
    private String symptomatology;
    private String historyMedications;
    private String vaccines;

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getSymptomatology() {
        return symptomatology;
    }

    public void setSymptomatology(String symptomatology) {
        this.symptomatology = symptomatology;
    }

    public String getHistoryMedications() {
        return historyMedications;
    }

    public void setHistoryMedications(String historyMedications) {
        this.historyMedications = historyMedications;
    }

    public String getVaccines() {
        return vaccines;
    }

    public void setVaccines(String vaccines) {
        this.vaccines = vaccines;
    }
    
    
}
