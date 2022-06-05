package com.example.kck;

import java.sql.Date;

public class DaneOgloszenia {
    String tresc;
    Date data;
    int id;

    public DaneOgloszenia(int id, String tresc, Date data) {
        this.data = data;
        this.tresc = tresc;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }
}
