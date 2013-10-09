package org.cidrz.project.zeprs.valueobject.report.gen;

import org.cidrz.project.zeprs.valueobject.EncounterData;
import org.cidrz.webapp.dynasite.valueobject.Patient;
import java.sql.Date;
import java.util.Set;
import java.sql.Time;
import org.cidrz.webapp.dynasite.valueobject.AuditInfo;
import java.util.TreeSet;

/**
 * JavaBean MedSurgHistReport generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2007-08-14
 *         Time: 18:08:24
 *         Form Name: Medical/Surgical History
 *         Form Id: 70
 */

/**
 * @hibernate.joined-subclass table="medsurghist"
 * @hibernate.joined-subclass-key column="id"
 */
public class MedSurgHistReport extends EncounterData {

private transient Byte mental_illness_69;	//mental_illness_69
private String mental_illness_69R;
private transient Byte epilepsy_70;	//epilepsy_70
private String epilepsy_70R;
private transient Byte thyroid_71;	//thyroid_71
private String thyroid_71R;
private transient Byte diabetes_72;	//diabetes_72
private String diabetes_72R;
private transient Integer diabetes_years_73;	//diabetes_years_73
private String diabetes_years_73R;
private transient Byte hypertension_74;	//hypertension_74
private String hypertension_74R;
private transient Byte heart_disease_75;	//heart_disease_75
private String heart_disease_75R;
private transient Byte rheumatic_heart_disease_76;	//rheumatic_heart_disease_76
private String rheumatic_heart_disease_76R;
private transient Byte tuberculosis_78;	//tuberculosis_78
private String tuberculosis_78R;
private transient Byte asthma_79;	//asthma_79
private String asthma_79R;
private transient Byte pneumonia_80;	//pneumonia_80
private String pneumonia_80R;
private transient Byte kidney_disease_81;	//kidney_disease_81
private String kidney_disease_81R;
private transient Byte pyelonephritis_82;	//pyelonephritis_82
private String pyelonephritis_82R;
private transient Byte liver_disease_83;	//liver_disease_83
private String liver_disease_83R;
private transient Byte dvt_clots_84;	//dvt_clots_84
private String dvt_clots_84R;
private transient Byte malaria_85;	//malaria_85
private String malaria_85R;
private transient Byte anaemia_1548;	//anaemia_1548
private String anaemia_1548R;
private transient Byte sickle_cell_disease_87;	//sickle_cell_disease_87
private String sickle_cell_disease_87R;
private transient Byte genital_herpes_89;	//genital_herpes_89
private String genital_herpes_89R;
private transient Byte gc_90;	//gc_90
private String gc_90R;
private transient Byte chlamydia_91;	//chlamydia_91
private String chlamydia_91R;
private transient Byte hpv_92;	//hpv_92
private String hpv_92R;
private transient Byte hepatitis_b_93;	//hepatitis_b_93
private String hepatitis_b_93R;
private transient Byte syphilis_94;	//syphilis_94
private String syphilis_94R;
private transient Byte hiv;	//hiv
private String hivR;
private transient Byte drug_allergies_98;	//drug_allergies_98
private String drug_allergies_98R;
private transient String drug_allergy_99;	//drug_allergy_99
private String drug_allergy_99R;
private transient Byte family_history_birth_defects;	//family_history_birth_defects
private String family_history_birth_defectsR;
private transient String comments_1249;	//comments_1249
private String comments_1249R;
private transient Byte currently_taking_meds_95;	//currently_taking_meds_95
private String currently_taking_meds_95R;
private transient Byte prior_operations;	//prior_operations
private String prior_operationsR;
private transient Byte appendicectomy_116;	//appendicectomy_116
private String appendicectomy_116R;
private transient Integer if_appendectomy_117;	//if_appendectomy_117
private String if_appendectomy_117R;
private transient Byte cs;	//cs
private String csR;
private transient Integer cs_year;	//cs_year
private String cs_yearR;
private transient Byte pelvic_operation_118;	//pelvic_operation_118
private String pelvic_operation_118R;
private transient Integer if_pelvic_op_year_119;	//if_pelvic_op_year_119
private String if_pelvic_op_year_119R;
private transient String if_pelvic_op_descr_120;	//if_pelvic_op_descr_120
private String if_pelvic_op_descr_120R;
private transient Byte transfusions_121;	//transfusions_121
private String transfusions_121R;
private transient Byte other_surgery_1_1147;	//other_surgery_1_1147
private String other_surgery_1_1147R;
private transient Integer incident_1_year_122;	//incident_1_year_122
private String incident_1_year_122R;
private transient String incident_1_desc_123;	//incident_1_desc_123
private String incident_1_desc_123R;
private transient Byte other_surgery_2_1148;	//other_surgery_2_1148
private String other_surgery_2_1148R;
private transient Integer incident_2_year_1149;	//incident_2_year_1149
private String incident_2_year_1149R;
private transient String incident_2_desc_1150;	//incident_2_desc_1150
private String incident_2_desc_1150R;
private transient Byte other_surgery_3_1151;	//other_surgery_3_1151
private String other_surgery_3_1151R;
private transient Integer incident_3_year_1152;	//incident_3_year_1152
private String incident_3_year_1152R;
private transient String incident_3_desc_1153;	//incident_3_desc_1153
private String incident_3_desc_1153R;
private transient Byte other_surger_1154;	//other_surger_1154
private String other_surger_1154R;
private transient Integer incident_4_year_1155;	//incident_4_year_1155
private String incident_4_year_1155R;
private transient String incident_4_desc_1156;	//incident_4_desc_1156
private String incident_4_desc_1156R;
private transient Byte other_surgery_5_1157;	//other_surgery_5_1157
private String other_surgery_5_1157R;
private transient Integer incident_5_year_1158;	//incident_5_year_1158
private String incident_5_year_1158R;
private transient String incident_5_desc_1159;	//incident_5_desc_1159
private String incident_5_desc_1159R;




    public String getMental_illness_69R() {
        return this.mental_illness_69R;
    }

    public void setMental_illness_69R(String mental_illness_69R) {
        this.mental_illness_69R = mental_illness_69R;
    }



 /**
  * @return
  * @hibernate.property column="epilepsy_70"
  */
    public Byte getEpilepsy_70() {
        return this.epilepsy_70;
    }

    public void setEpilepsy_70(Byte epilepsy_70) {
        this.epilepsy_70 = epilepsy_70;
    }



    public String getEpilepsy_70R() {
        return this.epilepsy_70R;
    }

    public void setEpilepsy_70R(String epilepsy_70R) {
        this.epilepsy_70R = epilepsy_70R;
    }



 /**
  * @return
  * @hibernate.property column="thyroid_71"
  */
    public Byte getThyroid_71() {
        return this.thyroid_71;
    }

    public void setThyroid_71(Byte thyroid_71) {
        this.thyroid_71 = thyroid_71;
    }



    public String getThyroid_71R() {
        return this.thyroid_71R;
    }

    public void setThyroid_71R(String thyroid_71R) {
        this.thyroid_71R = thyroid_71R;
    }



 /**
  * @return
  * @hibernate.property column="diabetes_72"
  */
    public Byte getDiabetes_72() {
        return this.diabetes_72;
    }

    public void setDiabetes_72(Byte diabetes_72) {
        this.diabetes_72 = diabetes_72;
    }



    public String getDiabetes_72R() {
        return this.diabetes_72R;
    }

    public void setDiabetes_72R(String diabetes_72R) {
        this.diabetes_72R = diabetes_72R;
    }



 /**
  * @return
  * @hibernate.property column="diabetes_years_73"
  */
    public Integer getDiabetes_years_73() {
        return this.diabetes_years_73;
    }

    public void setDiabetes_years_73(Integer diabetes_years_73) {
        this.diabetes_years_73 = diabetes_years_73;
    }



    public String getDiabetes_years_73R() {
        return this.diabetes_years_73R;
    }

    public void setDiabetes_years_73R(String diabetes_years_73R) {
        this.diabetes_years_73R = diabetes_years_73R;
    }



 /**
  * @return
  * @hibernate.property column="hypertension_74"
  */
    public Byte getHypertension_74() {
        return this.hypertension_74;
    }

    public void setHypertension_74(Byte hypertension_74) {
        this.hypertension_74 = hypertension_74;
    }



    public String getHypertension_74R() {
        return this.hypertension_74R;
    }

    public void setHypertension_74R(String hypertension_74R) {
        this.hypertension_74R = hypertension_74R;
    }



 /**
  * @return
  * @hibernate.property column="heart_disease_75"
  */
    public Byte getHeart_disease_75() {
        return this.heart_disease_75;
    }

    public void setHeart_disease_75(Byte heart_disease_75) {
        this.heart_disease_75 = heart_disease_75;
    }



    public String getHeart_disease_75R() {
        return this.heart_disease_75R;
    }

    public void setHeart_disease_75R(String heart_disease_75R) {
        this.heart_disease_75R = heart_disease_75R;
    }





    public String getRheumatic_heart_disease_76R() {
        return this.rheumatic_heart_disease_76R;
    }

    public void setRheumatic_heart_disease_76R(String rheumatic_heart_disease_76R) {
        this.rheumatic_heart_disease_76R = rheumatic_heart_disease_76R;
    }



 /**
  * @return
  * @hibernate.property column="tuberculosis_78"
  */
    public Byte getTuberculosis_78() {
        return this.tuberculosis_78;
    }

    public void setTuberculosis_78(Byte tuberculosis_78) {
        this.tuberculosis_78 = tuberculosis_78;
    }



    public String getTuberculosis_78R() {
        return this.tuberculosis_78R;
    }

    public void setTuberculosis_78R(String tuberculosis_78R) {
        this.tuberculosis_78R = tuberculosis_78R;
    }



 /**
  * @return
  * @hibernate.property column="asthma_79"
  */
    public Byte getAsthma_79() {
        return this.asthma_79;
    }

    public void setAsthma_79(Byte asthma_79) {
        this.asthma_79 = asthma_79;
    }



    public String getAsthma_79R() {
        return this.asthma_79R;
    }

    public void setAsthma_79R(String asthma_79R) {
        this.asthma_79R = asthma_79R;
    }





    public String getPneumonia_80R() {
        return this.pneumonia_80R;
    }

    public void setPneumonia_80R(String pneumonia_80R) {
        this.pneumonia_80R = pneumonia_80R;
    }



 /**
  * @return
  * @hibernate.property column="kidney_disease_81"
  */
    public Byte getKidney_disease_81() {
        return this.kidney_disease_81;
    }

    public void setKidney_disease_81(Byte kidney_disease_81) {
        this.kidney_disease_81 = kidney_disease_81;
    }



    public String getKidney_disease_81R() {
        return this.kidney_disease_81R;
    }

    public void setKidney_disease_81R(String kidney_disease_81R) {
        this.kidney_disease_81R = kidney_disease_81R;
    }





    public String getPyelonephritis_82R() {
        return this.pyelonephritis_82R;
    }

    public void setPyelonephritis_82R(String pyelonephritis_82R) {
        this.pyelonephritis_82R = pyelonephritis_82R;
    }



 /**
  * @return
  * @hibernate.property column="liver_disease_83"
  */
    public Byte getLiver_disease_83() {
        return this.liver_disease_83;
    }

    public void setLiver_disease_83(Byte liver_disease_83) {
        this.liver_disease_83 = liver_disease_83;
    }



    public String getLiver_disease_83R() {
        return this.liver_disease_83R;
    }

    public void setLiver_disease_83R(String liver_disease_83R) {
        this.liver_disease_83R = liver_disease_83R;
    }



 /**
  * @return
  * @hibernate.property column="dvt_clots_84"
  */
    public Byte getDvt_clots_84() {
        return this.dvt_clots_84;
    }

    public void setDvt_clots_84(Byte dvt_clots_84) {
        this.dvt_clots_84 = dvt_clots_84;
    }



    public String getDvt_clots_84R() {
        return this.dvt_clots_84R;
    }

    public void setDvt_clots_84R(String dvt_clots_84R) {
        this.dvt_clots_84R = dvt_clots_84R;
    }



 /**
  * @return
  * @hibernate.property column="malaria_85"
  */
    public Byte getMalaria_85() {
        return this.malaria_85;
    }

    public void setMalaria_85(Byte malaria_85) {
        this.malaria_85 = malaria_85;
    }



    public String getMalaria_85R() {
        return this.malaria_85R;
    }

    public void setMalaria_85R(String malaria_85R) {
        this.malaria_85R = malaria_85R;
    }



 /**
  * @return
  * @hibernate.property column="anaemia_1548"
  */
    public Byte getAnaemia_1548() {
        return this.anaemia_1548;
    }

    public void setAnaemia_1548(Byte anaemia_1548) {
        this.anaemia_1548 = anaemia_1548;
    }



    public String getAnaemia_1548R() {
        return this.anaemia_1548R;
    }

    public void setAnaemia_1548R(String anaemia_1548R) {
        this.anaemia_1548R = anaemia_1548R;
    }



 /**
  * @return
  * @hibernate.property column="sickle_cell_disease_87"
  */
    public Byte getSickle_cell_disease_87() {
        return this.sickle_cell_disease_87;
    }

    public void setSickle_cell_disease_87(Byte sickle_cell_disease_87) {
        this.sickle_cell_disease_87 = sickle_cell_disease_87;
    }



    public String getSickle_cell_disease_87R() {
        return this.sickle_cell_disease_87R;
    }

    public void setSickle_cell_disease_87R(String sickle_cell_disease_87R) {
        this.sickle_cell_disease_87R = sickle_cell_disease_87R;
    }



 /**
  * @return
  * @hibernate.property column="genital_herpes_89"
  */
    public Byte getGenital_herpes_89() {
        return this.genital_herpes_89;
    }

    public void setGenital_herpes_89(Byte genital_herpes_89) {
        this.genital_herpes_89 = genital_herpes_89;
    }



    public String getGenital_herpes_89R() {
        return this.genital_herpes_89R;
    }

    public void setGenital_herpes_89R(String genital_herpes_89R) {
        this.genital_herpes_89R = genital_herpes_89R;
    }



 /**
  * @return
  * @hibernate.property column="gc_90"
  */
    public Byte getGc_90() {
        return this.gc_90;
    }

    public void setGc_90(Byte gc_90) {
        this.gc_90 = gc_90;
    }



    public String getGc_90R() {
        return this.gc_90R;
    }

    public void setGc_90R(String gc_90R) {
        this.gc_90R = gc_90R;
    }





    public String getChlamydia_91R() {
        return this.chlamydia_91R;
    }

    public void setChlamydia_91R(String chlamydia_91R) {
        this.chlamydia_91R = chlamydia_91R;
    }





    public String getHpv_92R() {
        return this.hpv_92R;
    }

    public void setHpv_92R(String hpv_92R) {
        this.hpv_92R = hpv_92R;
    }





    public String getHepatitis_b_93R() {
        return this.hepatitis_b_93R;
    }

    public void setHepatitis_b_93R(String hepatitis_b_93R) {
        this.hepatitis_b_93R = hepatitis_b_93R;
    }



 /**
  * @return
  * @hibernate.property column="syphilis_94"
  */
    public Byte getSyphilis_94() {
        return this.syphilis_94;
    }

    public void setSyphilis_94(Byte syphilis_94) {
        this.syphilis_94 = syphilis_94;
    }



    public String getSyphilis_94R() {
        return this.syphilis_94R;
    }

    public void setSyphilis_94R(String syphilis_94R) {
        this.syphilis_94R = syphilis_94R;
    }



 /**
  * @return
  * @hibernate.property column="hiv"
  */
    public Byte getHiv() {
        return this.hiv;
    }

    public void setHiv(Byte hiv) {
        this.hiv = hiv;
    }



    public String getHivR() {
        return this.hivR;
    }

    public void setHivR(String hivR) {
        this.hivR = hivR;
    }



 /**
  * @return
  * @hibernate.property column="drug_allergies_98"
  */
    public Byte getDrug_allergies_98() {
        return this.drug_allergies_98;
    }

    public void setDrug_allergies_98(Byte drug_allergies_98) {
        this.drug_allergies_98 = drug_allergies_98;
    }



    public String getDrug_allergies_98R() {
        return this.drug_allergies_98R;
    }

    public void setDrug_allergies_98R(String drug_allergies_98R) {
        this.drug_allergies_98R = drug_allergies_98R;
    }



 /**
  * @return
  * @hibernate.property column="drug_allergy_99" type="text"
  */
    public String getDrug_allergy_99() {
        return this.drug_allergy_99;
    }

    public void setDrug_allergy_99(String drug_allergy_99) {
        this.drug_allergy_99 = drug_allergy_99;
    }



    public String getDrug_allergy_99R() {
        return this.drug_allergy_99R;
    }

    public void setDrug_allergy_99R(String drug_allergy_99R) {
        this.drug_allergy_99R = drug_allergy_99R;
    }



 /**
  * @return
  * @hibernate.property column="family_history_birth_defects"
  */
    public Byte getFamily_history_birth_defects() {
        return this.family_history_birth_defects;
    }

    public void setFamily_history_birth_defects(Byte family_history_birth_defects) {
        this.family_history_birth_defects = family_history_birth_defects;
    }



    public String getFamily_history_birth_defectsR() {
        return this.family_history_birth_defectsR;
    }

    public void setFamily_history_birth_defectsR(String family_history_birth_defectsR) {
        this.family_history_birth_defectsR = family_history_birth_defectsR;
    }



 /**
  * @return
  * @hibernate.property column="comments_1249" type="text"
  */
    public String getComments_1249() {
        return this.comments_1249;
    }

    public void setComments_1249(String comments_1249) {
        this.comments_1249 = comments_1249;
    }



    public String getComments_1249R() {
        return this.comments_1249R;
    }

    public void setComments_1249R(String comments_1249R) {
        this.comments_1249R = comments_1249R;
    }



 /**
  * @return
  * @hibernate.property column="currently_taking_meds_95"
  */
    public Byte getCurrently_taking_meds_95() {
        return this.currently_taking_meds_95;
    }

    public void setCurrently_taking_meds_95(Byte currently_taking_meds_95) {
        this.currently_taking_meds_95 = currently_taking_meds_95;
    }



    public String getCurrently_taking_meds_95R() {
        return this.currently_taking_meds_95R;
    }

    public void setCurrently_taking_meds_95R(String currently_taking_meds_95R) {
        this.currently_taking_meds_95R = currently_taking_meds_95R;
    }



 /**
  * @return
  * @hibernate.property column="prior_operations"
  */
    public Byte getPrior_operations() {
        return this.prior_operations;
    }

    public void setPrior_operations(Byte prior_operations) {
        this.prior_operations = prior_operations;
    }



    public String getPrior_operationsR() {
        return this.prior_operationsR;
    }

    public void setPrior_operationsR(String prior_operationsR) {
        this.prior_operationsR = prior_operationsR;
    }



 /**
  * @return
  * @hibernate.property column="appendicectomy_116"
  */
    public Byte getAppendicectomy_116() {
        return this.appendicectomy_116;
    }

    public void setAppendicectomy_116(Byte appendicectomy_116) {
        this.appendicectomy_116 = appendicectomy_116;
    }



    public String getAppendicectomy_116R() {
        return this.appendicectomy_116R;
    }

    public void setAppendicectomy_116R(String appendicectomy_116R) {
        this.appendicectomy_116R = appendicectomy_116R;
    }



 /**
  * @return
  * @hibernate.property column="if_appendectomy_117"
  */
    public Integer getIf_appendectomy_117() {
        return this.if_appendectomy_117;
    }

    public void setIf_appendectomy_117(Integer if_appendectomy_117) {
        this.if_appendectomy_117 = if_appendectomy_117;
    }



    public String getIf_appendectomy_117R() {
        return this.if_appendectomy_117R;
    }

    public void setIf_appendectomy_117R(String if_appendectomy_117R) {
        this.if_appendectomy_117R = if_appendectomy_117R;
    }



 /**
  * @return
  * @hibernate.property column="cs"
  */
    public Byte getCs() {
        return this.cs;
    }

    public void setCs(Byte cs) {
        this.cs = cs;
    }



    public String getCsR() {
        return this.csR;
    }

    public void setCsR(String csR) {
        this.csR = csR;
    }



 /**
  * @return
  * @hibernate.property column="cs_year"
  */
    public Integer getCs_year() {
        return this.cs_year;
    }

    public void setCs_year(Integer cs_year) {
        this.cs_year = cs_year;
    }



    public String getCs_yearR() {
        return this.cs_yearR;
    }

    public void setCs_yearR(String cs_yearR) {
        this.cs_yearR = cs_yearR;
    }



 /**
  * @return
  * @hibernate.property column="pelvic_operation_118"
  */
    public Byte getPelvic_operation_118() {
        return this.pelvic_operation_118;
    }

    public void setPelvic_operation_118(Byte pelvic_operation_118) {
        this.pelvic_operation_118 = pelvic_operation_118;
    }



    public String getPelvic_operation_118R() {
        return this.pelvic_operation_118R;
    }

    public void setPelvic_operation_118R(String pelvic_operation_118R) {
        this.pelvic_operation_118R = pelvic_operation_118R;
    }



 /**
  * @return
  * @hibernate.property column="if_pelvic_op_year_119"
  */
    public Integer getIf_pelvic_op_year_119() {
        return this.if_pelvic_op_year_119;
    }

    public void setIf_pelvic_op_year_119(Integer if_pelvic_op_year_119) {
        this.if_pelvic_op_year_119 = if_pelvic_op_year_119;
    }



    public String getIf_pelvic_op_year_119R() {
        return this.if_pelvic_op_year_119R;
    }

    public void setIf_pelvic_op_year_119R(String if_pelvic_op_year_119R) {
        this.if_pelvic_op_year_119R = if_pelvic_op_year_119R;
    }



 /**
  * @return
  * @hibernate.property column="if_pelvic_op_descr_120" type="text"
  */
    public String getIf_pelvic_op_descr_120() {
        return this.if_pelvic_op_descr_120;
    }

    public void setIf_pelvic_op_descr_120(String if_pelvic_op_descr_120) {
        this.if_pelvic_op_descr_120 = if_pelvic_op_descr_120;
    }



    public String getIf_pelvic_op_descr_120R() {
        return this.if_pelvic_op_descr_120R;
    }

    public void setIf_pelvic_op_descr_120R(String if_pelvic_op_descr_120R) {
        this.if_pelvic_op_descr_120R = if_pelvic_op_descr_120R;
    }



 /**
  * @return
  * @hibernate.property column="transfusions_121"
  */
    public Byte getTransfusions_121() {
        return this.transfusions_121;
    }

    public void setTransfusions_121(Byte transfusions_121) {
        this.transfusions_121 = transfusions_121;
    }



    public String getTransfusions_121R() {
        return this.transfusions_121R;
    }

    public void setTransfusions_121R(String transfusions_121R) {
        this.transfusions_121R = transfusions_121R;
    }



 /**
  * @return
  * @hibernate.property column="other_surgery_1_1147"
  */
    public Byte getOther_surgery_1_1147() {
        return this.other_surgery_1_1147;
    }

    public void setOther_surgery_1_1147(Byte other_surgery_1_1147) {
        this.other_surgery_1_1147 = other_surgery_1_1147;
    }



    public String getOther_surgery_1_1147R() {
        return this.other_surgery_1_1147R;
    }

    public void setOther_surgery_1_1147R(String other_surgery_1_1147R) {
        this.other_surgery_1_1147R = other_surgery_1_1147R;
    }



 /**
  * @return
  * @hibernate.property column="incident_1_year_122"
  */
    public Integer getIncident_1_year_122() {
        return this.incident_1_year_122;
    }

    public void setIncident_1_year_122(Integer incident_1_year_122) {
        this.incident_1_year_122 = incident_1_year_122;
    }



    public String getIncident_1_year_122R() {
        return this.incident_1_year_122R;
    }

    public void setIncident_1_year_122R(String incident_1_year_122R) {
        this.incident_1_year_122R = incident_1_year_122R;
    }



 /**
  * @return
  * @hibernate.property column="incident_1_desc_123" type="text"
  */
    public String getIncident_1_desc_123() {
        return this.incident_1_desc_123;
    }

    public void setIncident_1_desc_123(String incident_1_desc_123) {
        this.incident_1_desc_123 = incident_1_desc_123;
    }



    public String getIncident_1_desc_123R() {
        return this.incident_1_desc_123R;
    }

    public void setIncident_1_desc_123R(String incident_1_desc_123R) {
        this.incident_1_desc_123R = incident_1_desc_123R;
    }



 /**
  * @return
  * @hibernate.property column="other_surgery_2_1148"
  */
    public Byte getOther_surgery_2_1148() {
        return this.other_surgery_2_1148;
    }

    public void setOther_surgery_2_1148(Byte other_surgery_2_1148) {
        this.other_surgery_2_1148 = other_surgery_2_1148;
    }



    public String getOther_surgery_2_1148R() {
        return this.other_surgery_2_1148R;
    }

    public void setOther_surgery_2_1148R(String other_surgery_2_1148R) {
        this.other_surgery_2_1148R = other_surgery_2_1148R;
    }



 /**
  * @return
  * @hibernate.property column="incident_2_year_1149"
  */
    public Integer getIncident_2_year_1149() {
        return this.incident_2_year_1149;
    }

    public void setIncident_2_year_1149(Integer incident_2_year_1149) {
        this.incident_2_year_1149 = incident_2_year_1149;
    }



    public String getIncident_2_year_1149R() {
        return this.incident_2_year_1149R;
    }

    public void setIncident_2_year_1149R(String incident_2_year_1149R) {
        this.incident_2_year_1149R = incident_2_year_1149R;
    }



 /**
  * @return
  * @hibernate.property column="incident_2_desc_1150" type="text"
  */
    public String getIncident_2_desc_1150() {
        return this.incident_2_desc_1150;
    }

    public void setIncident_2_desc_1150(String incident_2_desc_1150) {
        this.incident_2_desc_1150 = incident_2_desc_1150;
    }



    public String getIncident_2_desc_1150R() {
        return this.incident_2_desc_1150R;
    }

    public void setIncident_2_desc_1150R(String incident_2_desc_1150R) {
        this.incident_2_desc_1150R = incident_2_desc_1150R;
    }



 /**
  * @return
  * @hibernate.property column="other_surgery_3_1151"
  */
    public Byte getOther_surgery_3_1151() {
        return this.other_surgery_3_1151;
    }

    public void setOther_surgery_3_1151(Byte other_surgery_3_1151) {
        this.other_surgery_3_1151 = other_surgery_3_1151;
    }



    public String getOther_surgery_3_1151R() {
        return this.other_surgery_3_1151R;
    }

    public void setOther_surgery_3_1151R(String other_surgery_3_1151R) {
        this.other_surgery_3_1151R = other_surgery_3_1151R;
    }



 /**
  * @return
  * @hibernate.property column="incident_3_year_1152"
  */
    public Integer getIncident_3_year_1152() {
        return this.incident_3_year_1152;
    }

    public void setIncident_3_year_1152(Integer incident_3_year_1152) {
        this.incident_3_year_1152 = incident_3_year_1152;
    }



    public String getIncident_3_year_1152R() {
        return this.incident_3_year_1152R;
    }

    public void setIncident_3_year_1152R(String incident_3_year_1152R) {
        this.incident_3_year_1152R = incident_3_year_1152R;
    }



 /**
  * @return
  * @hibernate.property column="incident_3_desc_1153" type="text"
  */
    public String getIncident_3_desc_1153() {
        return this.incident_3_desc_1153;
    }

    public void setIncident_3_desc_1153(String incident_3_desc_1153) {
        this.incident_3_desc_1153 = incident_3_desc_1153;
    }



    public String getIncident_3_desc_1153R() {
        return this.incident_3_desc_1153R;
    }

    public void setIncident_3_desc_1153R(String incident_3_desc_1153R) {
        this.incident_3_desc_1153R = incident_3_desc_1153R;
    }



 /**
  * @return
  * @hibernate.property column="other_surger_1154"
  */
    public Byte getOther_surger_1154() {
        return this.other_surger_1154;
    }

    public void setOther_surger_1154(Byte other_surger_1154) {
        this.other_surger_1154 = other_surger_1154;
    }



    public String getOther_surger_1154R() {
        return this.other_surger_1154R;
    }

    public void setOther_surger_1154R(String other_surger_1154R) {
        this.other_surger_1154R = other_surger_1154R;
    }



 /**
  * @return
  * @hibernate.property column="incident_4_year_1155"
  */
    public Integer getIncident_4_year_1155() {
        return this.incident_4_year_1155;
    }

    public void setIncident_4_year_1155(Integer incident_4_year_1155) {
        this.incident_4_year_1155 = incident_4_year_1155;
    }



    public String getIncident_4_year_1155R() {
        return this.incident_4_year_1155R;
    }

    public void setIncident_4_year_1155R(String incident_4_year_1155R) {
        this.incident_4_year_1155R = incident_4_year_1155R;
    }



 /**
  * @return
  * @hibernate.property column="incident_4_desc_1156" type="text"
  */
    public String getIncident_4_desc_1156() {
        return this.incident_4_desc_1156;
    }

    public void setIncident_4_desc_1156(String incident_4_desc_1156) {
        this.incident_4_desc_1156 = incident_4_desc_1156;
    }



    public String getIncident_4_desc_1156R() {
        return this.incident_4_desc_1156R;
    }

    public void setIncident_4_desc_1156R(String incident_4_desc_1156R) {
        this.incident_4_desc_1156R = incident_4_desc_1156R;
    }



 /**
  * @return
  * @hibernate.property column="other_surgery_5_1157"
  */
    public Byte getOther_surgery_5_1157() {
        return this.other_surgery_5_1157;
    }

    public void setOther_surgery_5_1157(Byte other_surgery_5_1157) {
        this.other_surgery_5_1157 = other_surgery_5_1157;
    }



    public String getOther_surgery_5_1157R() {
        return this.other_surgery_5_1157R;
    }

    public void setOther_surgery_5_1157R(String other_surgery_5_1157R) {
        this.other_surgery_5_1157R = other_surgery_5_1157R;
    }



 /**
  * @return
  * @hibernate.property column="incident_5_year_1158"
  */
    public Integer getIncident_5_year_1158() {
        return this.incident_5_year_1158;
    }

    public void setIncident_5_year_1158(Integer incident_5_year_1158) {
        this.incident_5_year_1158 = incident_5_year_1158;
    }



    public String getIncident_5_year_1158R() {
        return this.incident_5_year_1158R;
    }

    public void setIncident_5_year_1158R(String incident_5_year_1158R) {
        this.incident_5_year_1158R = incident_5_year_1158R;
    }



 /**
  * @return
  * @hibernate.property column="incident_5_desc_1159" type="text"
  */
    public String getIncident_5_desc_1159() {
        return this.incident_5_desc_1159;
    }

    public void setIncident_5_desc_1159(String incident_5_desc_1159) {
        this.incident_5_desc_1159 = incident_5_desc_1159;
    }



    public String getIncident_5_desc_1159R() {
        return this.incident_5_desc_1159R;
    }

    public void setIncident_5_desc_1159R(String incident_5_desc_1159R) {
        this.incident_5_desc_1159R = incident_5_desc_1159R;
    }



}