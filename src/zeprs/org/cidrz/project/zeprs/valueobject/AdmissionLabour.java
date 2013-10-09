/*
 *    Copyright 2003, 2004, 2005, 2006 Research Triangle Institute
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 */

package org.cidrz.project.zeprs.valueobject;

import java.sql.Date;
import java.sql.Time;

/**
 * JavaBean AdmissionLabour generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 */

/**
 * @hibernate.joined-subclass table="admissionlabour"
 * @hibernate.joined-subclass-key column="id"
 */
public class AdmissionLabour extends EncounterData {

private Integer field260;
private String field1218;
private boolean field261;
private Date field262;
private Time field263;
private Integer field224;
private Integer field225;
private Float field266;
private Integer field169;
private String field170;
private Integer field171;
private Integer field269;
private Integer field167;
private String field1449;
private Integer field231;
private Integer field273;
private Integer field274;
private Integer field275;
private Integer field166;
private Integer field191;
private boolean field278;
private Integer field279;
private boolean field1219;
private Integer field280;
private Integer field1203;
private String field281;
private Time field282;
private Date field1220;
private Integer field283;
private Integer field284;
private Integer field285;
private boolean field286;
private Integer field1349;


 /**
  * @return
  * @hibernate.property column="general_condition_260"
  */
    public Integer getfield260() {
        return this.field260;
    }

    public void setfield260(Integer field260) {
        this.field260 = field260;
    }



 /**
  * @return
  * @hibernate.property column="presenting_complaints_1218"
  */
    public String getfield1218() {
        return this.field1218;
    }

    public void setfield1218(String field1218) {
        this.field1218 = field1218;
    }



 /**
  * @return
  * @hibernate.property column="mother_arv_taken_261"
  */
    public boolean isfield261() {
        return this.field261;
    }

    public void setfield261(boolean field261) {
        this.field261 =  field261;
    }



 /**
  * @return
  * @hibernate.property column="date_of_arv_injestion_262"
  */
    public Date getfield262() {
        return this.field262;
    }

    public void setfield262(Date field262) {
        this.field262 = field262;
    }



 /**
  * @return
  * @hibernate.property column="time_of_arv_injestion_263"
  */
    public Time getfield263() {
        return this.field263;
    }

    public void setfield263(Time field263) {
        this.field263 = field263;
    }



 /**
  * @return
  * @hibernate.property column="bp_systolic_224"
  */
    public Integer getfield224() {
        return this.field224;
    }

    public void setfield224(Integer field224) {
        this.field224 = field224;
    }



 /**
  * @return
  * @hibernate.property column="bp_diastolic_225"
  */
    public Integer getfield225() {
        return this.field225;
    }

    public void setfield225(Integer field225) {
        this.field225 = field225;
    }



 /**
  * @return
  * @hibernate.property column="temperature_266"
  */
    public Float getfield266() {
        return this.field266;
    }

    public void setfield266(Float field266) {
        this.field266 = field266;
    }



 /**
  * @return
  * @hibernate.property column="heart_169"
  */
    public Integer getfield169() {
        return this.field169;
    }

    public void setfield169(Integer field169) {
        this.field169 = field169;
    }



 /**
  * @return
  * @hibernate.property column="heart_other_170"
  */
    public String getfield170() {
        return this.field170;
    }

    public void setfield170(String field170) {
        this.field170 = field170;
    }



 /**
  * @return
  * @hibernate.property column="pulse_171"
  */
    public Integer getfield171() {
        return this.field171;
    }

    public void setfield171(Integer field171) {
        this.field171 = field171;
    }



 /**
  * @return
  * @hibernate.property column="respiration_rate_269"
  */
    public Integer getfield269() {
        return this.field269;
    }

    public void setfield269(Integer field269) {
        this.field269 = field269;
    }



 /**
  * @return
  * @hibernate.property column="respiratory_system_167"
  */
    public Integer getfield167() {
        return this.field167;
    }

    public void setfield167(Integer field167) {
        this.field167 = field167;
    }



 /**
  * @return
  * @hibernate.property column="respiratory_system_other"
  */
    public String getfield1449() {
        return this.field1449;
    }

    public void setfield1449(String field1449) {
        this.field1449 = field1449;
    }



 /**
  * @return
  * @hibernate.property column="oedema_231"
  */
    public Integer getfield231() {
        return this.field231;
    }

    public void setfield231(Integer field231) {
        this.field231 = field231;
    }



 /**
  * @return
  * @hibernate.property column="pallor_273"
  */
    public Integer getfield273() {
        return this.field273;
    }

    public void setfield273(Integer field273) {
        this.field273 = field273;
    }



 /**
  * @return
  * @hibernate.property column="mental_status_274"
  */
    public Integer getfield274() {
        return this.field274;
    }

    public void setfield274(Integer field274) {
        this.field274 = field274;
    }



 /**
  * @return
  * @hibernate.property column="reflexes_275"
  */
    public Integer getfield275() {
        return this.field275;
    }

    public void setfield275(Integer field275) {
        this.field275 = field275;
    }



 /**
  * @return
  * @hibernate.property column="breasts_166"
  */
    public Integer getfield166() {
        return this.field166;
    }

    public void setfield166(Integer field166) {
        this.field166 = field166;
    }



 /**
  * @return
  * @hibernate.property column="varicosities_191"
  */
    public Integer getfield191() {
        return this.field191;
    }

    public void setfield191(Integer field191) {
        this.field191 = field191;
    }



 /**
  * @return
  * @hibernate.property column="foul_smell_278"
  */
    public boolean isfield278() {
        return this.field278;
    }

    public void setfield278(boolean field278) {
        this.field278 =  field278;
    }



 /**
  * @return
  * @hibernate.property column="vaginal_bleeding_279"
  */
    public Integer getfield279() {
        return this.field279;
    }

    public void setfield279(Integer field279) {
        this.field279 = field279;
    }



 /**
  * @return
  * @hibernate.property column="vaginal_discharge_1219"
  */
    public boolean isfield1219() {
        return this.field1219;
    }

    public void setfield1219(boolean field1219) {
        this.field1219 =  field1219;
    }



 /**
  * @return
  * @hibernate.property column="vaginal_discharge_appearance_280"
  */
    public Integer getfield280() {
        return this.field280;
    }

    public void setfield280(Integer field280) {
        this.field280 = field280;
    }



 /**
  * @return
  * @hibernate.property column="vaginal_discharge_smell_1203"
  */
    public Integer getfield1203() {
        return this.field1203;
    }

    public void setfield1203(Integer field1203) {
        this.field1203 = field1203;
    }



 /**
  * @return
  * @hibernate.property column="other_abnormalities_281"
  */
    public String getfield281() {
        return this.field281;
    }

    public void setfield281(String field281) {
        this.field281 = field281;
    }



 /**
  * @return
  * @hibernate.property column="onset_of_con_282"
  */
    public Time getfield282() {
        return this.field282;
    }

    public void setfield282(Time field282) {
        this.field282 = field282;
    }



 /**
  * @return
  * @hibernate.property column="date_of_onset_contractions_1220"
  */
    public Date getfield1220() {
        return this.field1220;
    }

    public void setfield1220(Date field1220) {
        this.field1220 = field1220;
    }



 /**
  * @return
  * @hibernate.property column="contraction_freq_10_mins_283"
  */
    public Integer getfield283() {
        return this.field283;
    }

    public void setfield283(Integer field283) {
        this.field283 = field283;
    }



 /**
  * @return
  * @hibernate.property column="onset_of_labour_284"
  */
    public Integer getfield284() {
        return this.field284;
    }

    public void setfield284(Integer field284) {
        this.field284 = field284;
    }



 /**
  * @return
  * @hibernate.property column="foetal_movem_285"
  */
    public Integer getfield285() {
        return this.field285;
    }

    public void setfield285(Integer field285) {
        this.field285 = field285;
    }



 /**
  * @return
  * @hibernate.property column="referral_to_uth_286"
  */
    public boolean isfield286() {
        return this.field286;
    }

    public void setfield286(boolean field286) {
        this.field286 =  field286;
    }



 /**
  * @return
  * @hibernate.property column="priority_of_referral"
  */
    public Integer getfield1349() {
        return this.field1349;
    }

    public void setfield1349(Integer field1349) {
        this.field1349 = field1349;
    }



}