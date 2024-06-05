package org.example.models;

import org.example.enums.CipsType;

public class Cips {
    private CipsType cipsType;

    public Cips(CipsType cipsType) {
        this.cipsType = cipsType;
    }

    public CipsType getCipsType() {
        return cipsType;
    }
}
