package com.kamron.pogoiv.scanlogic;

import java.util.Comparator;

/**
 * Created by Johan on 2018-02-19.
 * <p>
 * A class which represents the data of a moveset, which is used by the MoveSetFraction to create the moveset list.
 */

public class MovesetData {

    private String quick;
    private String charge;
    private boolean quickIsLegacy;
    private boolean chargeIsLegacy;
    private double atkScore;
    private double defScore;
    private String quickMoveType;
    private String chargeMoveType;


    public MovesetData(String quick, String charge, boolean quickIsLegacy, boolean chargeIsLegacy, double atkScore,
                       double defScore,
                       String chargeMoveType, String quickMoveType) {
        this.quick = quick;
        this.charge = charge;
        this.quickIsLegacy = quickIsLegacy;
        this.chargeIsLegacy = chargeIsLegacy;
        this.atkScore = atkScore;
        this.defScore = defScore;
        this.chargeMoveType = chargeMoveType;
        this.quickMoveType = quickMoveType;


    }

    public String getQuickMoveType() {
        return quickMoveType;
    }

    public String getChargeMoveType() {
        return chargeMoveType;
    }

    public String getQuick() {
        return quick;
    }

    public String getCharge() {
        return charge;
    }

    public boolean isQuickIsLegacy() {
        return quickIsLegacy;
    }

    public boolean isChargeIsLegacy() {
        return chargeIsLegacy;
    }

    public double getAtkScore() {
        return atkScore;
    }

    public double getDefScore() {
        return defScore;
    }

    public static class AtkComparator implements Comparator<MovesetData> {

        @Override public int compare(MovesetData movesetData, MovesetData other) {
            return Double.compare(other.getAtkScore(), movesetData.getAtkScore());
        }
    }

    public static class DefComparator implements Comparator<MovesetData> {

        @Override public int compare(MovesetData movesetData, MovesetData other) {
            return Double.compare(other.getDefScore(), movesetData.getDefScore());
        }
    }

}
