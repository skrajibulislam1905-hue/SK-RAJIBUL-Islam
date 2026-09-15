package com.example.data.repository

import com.example.data.model.*

object MedicinePart1QuestionsDataProvider {

    fun getPart1Topics(): List<Topic> = listOf(
        Topic(
            id = "med_cardiology",
            subjectId = "medicine",
            name = "Cardiology & Vascular Medicine",
            description = "Mitral stenosis, acute myocardial infarction & ACS, acute left ventricular failure (ALVF), hypertension, atrial fibrillation, and emergency approach to chest pain.",
            textbookChapter = "Chapter 1: Cardiovascular System",
            standardPages = "pp. 8-167",
            questions = listOf(
                Question(
                    id = "med_card_ms_1",
                    subjectId = "medicine",
                    topicId = "med_cardiology",
                    topicName = "Valvular Heart Disease",
                    text = "A 30 year old female patient presented with gradual onset of shortness of breath, orthopnoea, history of PND, on examination there is mid diastolic murmur at mitral area. What is your diagnosis? Describe the Pathophysiology of this clinical condition. Outline the management of this case.",
                    years = listOf("2024", "2019 P1", "2018 P1", "2014 P1", "2010 P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 7 + 6 = 15 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "74, 81",
                    highYieldPoints = listOf(
                        "Diagnosis: Mitral Stenosis (predominantly rheumatic etiology in young Indian females).",
                        "Pathophysiology: Stenosis of mitral valve orifice (<2 cm2; critical <1 cm2) causes obstruction to blood flow from LA to LV -> elevated left atrial pressure -> left atrial dilatation (predisposing to Atrial Fibrillation and left atrial appendage mural thrombus with systemic embolization) -> retrograde elevation of pulmonary venous and capillary wedge pressures (>25 mmHg) -> pulmonary congestion, dyspnea, orthopnoea, paroxysmal nocturnal dyspnea (PND), and acute pulmonary edema -> reactive pulmonary arteriolar vasoconstriction and pulmonary arterial hypertension (PAH) -> right ventricular hypertrophy, functional tricuspid regurgitation, and congestive right heart failure.",
                        "Auscultatory Features: Tapping apex beat (palpable S1), loud tapping first heart sound (S1), high-pitched Opening Snap (OS - closer to A2 indicates severe stenosis), and low-pitched rough rumbling Mid-Diastolic Murmur with presystolic accentuation at the apex in left lateral decubitus position.",
                        "Medical Management: Sodium restriction, Loop diuretics (Furosemide 20-40 mg) for pulmonary congestion, Rate control for AF (Beta-blockers: Metoprolol / Bisoprolol or Digoxin), Anticoagulation (Warfarin, INR target 2.0 - 3.0 or DOAC) to prevent systemic stroke.",
                        "Interventional / Surgical Management: Percutaneous Transvenous Mitral Commissurotomy (PTMC / Inoue balloon) if Wilkins echocardiographic score <=8 without LA clot or moderate/severe MR; Surgical Closed or Open Mitral Valvotomy; Mitral Valve Replacement (MVR) with mechanical or bioprosthetic valve for calcified, rigid, or regurgitant valves."
                    ),
                    referenceLinks = listOf(ReferenceLink("AHA/ACC Valvular Heart Disease Guidelines", "https://www.ahajournals.org/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "med_card_ami_1",
                    subjectId = "medicine",
                    topicId = "med_cardiology",
                    topicName = "Ischemic Heart Disease",
                    text = "A 65 year old male patient has presented to the emergency with acute onset severe retrosternal chest pain with sweating for last 3 hours. Differential diagnosis, emergency approach in next 1 hour, and management of acute myocardial infarction.",
                    years = listOf("2024", "2021 P1", "2020 P1", "2015 P1", "2014 P1", "2012 P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "5 + 5 = 10 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "29, 41, 45",
                    highYieldPoints = listOf(
                        "Life-Threatening Emergency Chest Pain DD: 1. Acute Myocardial Infarction / ACS; 2. Aortic Dissection (tearing pain radiating to back, BP asymmetry); 3. Massive Pulmonary Embolism (sudden dyspnea, tachycardia, S1Q3T3); 4. Tension Pneumothorax (hyper-resonance, absent breath sounds); 5. Boerhaave syndrome (esophageal rupture after violent retching).",
                        "First 10-Minute Emergency Protocol: 1. Immediate 12-lead ECG (ST elevation >=1 mm in 2 contiguous leads, or new LBBB); 2. High-sensitivity Cardiac Troponin I/T; 3. Oxygen (only if SpO2 <90%); 4. Dispersible Aspirin 300 mg chewed + Ticagrelor 180 mg (or Clopidogrel 600 mg); 5. Atorvastatin 80 mg stat; 6. Sublingual Nitroglycerin 0.4 mg (contraindicated if RV infarction - leads V3R/V4R, hypotension, or recent PDE5 inhibitor use); 7. IV Morphine 2-4 mg titrated.",
                        "Reperfusion Strategy: Primary Percutaneous Coronary Intervention (PCI) is gold standard (door-to-balloon time <90 minutes); If PCI facility >120 min away: Thrombolysis (door-to-needle time <30 minutes) using weight-adjusted IV Tenecteplase (TNK-tPA) bolus or Streptokinase 1.5 million units in 100 mL NS over 60 minutes."
                    ),
                    referenceLinks = listOf(ReferenceLink("ESC Guidelines for Management of STEMI", "https://www.escardio.org/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "med_card_failure_af",
                    subjectId = "medicine",
                    topicId = "med_cardiology",
                    topicName = "Heart Failure & Arrhythmias",
                    text = "Define heart failure. Pathophysiology and management of acute left ventricular failure (ALVF) / pulmonary edema. Management of Atrial Fibrillation (rate vs rhythm control, anticoagulation).",
                    years = listOf("2023", "2021 P1", "2019 P1", "2018 P2", "2015 P1", "2014 S P1", "2013 P1", "2010 P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "10 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "110, 112, 114, 116, 124, 127-130",
                    highYieldPoints = listOf(
                        "Acute LVF Management (LMNOP): 1. Lasix (IV Furosemide 40-80 mg bolus - venodilator and diuretic); 2. Morphine (IV 2-4 mg - relieves anxiety and sympathetic tone); 3. Nitrates (IV Nitroglycerin infusion titrated to BP - reduces preload and afterload); 4. Oxygen & Non-Invasive Ventilation (CPAP / BiPAP - reduces work of breathing and extravascular lung water); 5. Position (prop patient upright with legs dangling off the bed).",
                        "Chronic HFrEF Four Pillars of Medical Therapy: 1. ARNI (Sacubitril/Valsartan) or ACEi; 2. Beta-blocker (Carvedilol, Bisoprolol, Metoprolol succinate); 3. MRA (Spironolactone / Eplerenone); 4. SGLT2 inhibitor (Dapagliflozin / Empagliflozin).",
                        "Atrial Fibrillation Management: Hemodynamically unstable -> Immediate Synchronized Direct Current Cardioversion (100-200 J); Hemodynamically stable -> Rate control (Beta-blockers, Diltiazem, Digoxin target resting HR <110 bpm); Stroke Risk Assessment via CHA2DS2-VASc score; If score >=2 in males or >=3 in females -> Oral Anticoagulation (DOACs: Apixaban, Rivaroxaban, Dabigatran preferred over Warfarin)."
                    ),
                    referenceLinks = listOf(ReferenceLink("ESC Guidelines for Acute and Chronic Heart Failure", "https://www.escardio.org/", "Guideline")),
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "med_respiratory",
            subjectId = "medicine",
            name = "Respiratory Medicine",
            description = "Community acquired pneumonia (CAP), nosocomial pneumonia, pleural effusion & Light's criteria, acute severe asthma, and acute exacerbation of COPD.",
            textbookChapter = "Chapter 2: Respiratory System",
            standardPages = "pp. 185-350",
            questions = listOf(
                Question(
                    id = "med_resp_effusion_1",
                    subjectId = "medicine",
                    topicId = "med_respiratory",
                    topicName = "Pleural Effusion & Light's Criteria",
                    text = "A 40-year-old patient presents with shortness of breath, heaviness on right side of chest, low grade fever for 3 weeks, and stony dullness on percussion of right thorax. Diagnosis, Light's criteria, investigations, and management of tubercular pleural effusion.",
                    years = listOf("2025", "2024", "2021 P2", "2019 P2", "2017 S P1", "2016 S P2"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 3 + 4 + 6 = 15 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "268-269, 271-272",
                    highYieldPoints = listOf(
                        "Diagnosis: Right-sided Pleural Effusion (most commonly Tubercular Pleural Effusion in young/middle-aged Indian patients).",
                        "Clinical Signs: Diminished chest expansion on affected side, tracheal and mediastinal shift to opposite side (in massive effusion), stony dull note on percussion with Ellis S-shaped curve, absent or severely decreased vocal resonance and vesicular breath sounds.",
                        "Light's Criteria (Distinguishes Exudate from Transudate; exudate if ANY ONE present): 1. Pleural fluid protein to serum protein ratio > 0.5; 2. Pleural fluid LDH to serum LDH ratio > 0.6; 3. Pleural fluid LDH > two-thirds the upper limit of normal serum LDH (>200 IU/L).",
                        "Tubercular Pleural Fluid Analysis: Exudative, high protein (>4-5 g/dL), lymphocytic predominance (>80%), Pleural Fluid Adenosine Deaminase (ADA) > 40 U/L (highly sensitive and specific for tuberculosis), low glucose (<60 mg/dL), GeneXpert MTB/RIF and AFB smear/culture.",
                        "Management: Diagnostic and therapeutic thoracocentesis (evacuation of pleural fluid, maximum 1.5 L in one sitting to avoid re-expansion pulmonary edema); Standard Anti-Tubercular Therapy (ATT - 2HRZE + 4HRE daily under NTEP); short-course oral Prednisolone only if severe toxemia or impending pleural thickening."
                    ),
                    referenceLinks = listOf(ReferenceLink("BTS Pleural Disease Guideline", "https://www.brit-thoracic.org.uk/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "med_resp_pneumonia_asthma",
                    subjectId = "medicine",
                    topicId = "med_respiratory",
                    topicName = "Pneumonia & Obstructive Airway Disease",
                    text = "Community acquired pneumonia (CAP) vs Nosocomial pneumonia. CURB-65 scoring. Management of Acute Severe Asthma in emergency and acute exacerbation of COPD.",
                    years = listOf("2025", "2023 P2", "2020 P2", "2019 S P2", "2016 S P1", "2015 P2", "2014 P2", "2013 P2", "2012 P2", "2011 P2"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "10 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "211, 216, 221, 282, 283, 287, 295-296",
                    highYieldPoints = listOf(
                        "CAP vs Nosocomial (HAP): CAP acquired outside hospital or within 48 hours of admission (Streptococcus pneumoniae, Mycoplasma, Klebsiella); HAP occurs >=48 hours after admission (Pseudomonas aeruginosa, MRSA, Acinetobacter, Enterobacteriaceae).",
                        "CURB-65 Severity Score: Confusion (AMTS <=8), Urea >7 mmol/L (BUN >19 mg/dL), Respiratory rate >=30/min, Blood pressure (SBP <90 or DBP <=60 mmHg), Age >=65 years; 0-1 = home treatment; 2 = hospital admission; >=3 = ICU care.",
                        "Acute Severe Asthma Management: High-flow oxygen (target SpO2 93-95%); Frequent nebulized SABA (Salbutamol 5 mg) + SAMA (Ipratropium bromide 0.5 mg) via oxygen-driven nebulizer every 20 minutes; Systemic Corticosteroids (IV Hydrocortisone 100-200 mg or oral Prednisolone 40-50 mg); IV Magnesium Sulfate (2 g in 100 mL NS over 20 min) for severe or life-threatening attack (silent chest, PEFR <33%, exhaustion, altered sensorium).",
                        "COPD Exacerbation Management: Controlled oxygen therapy via Venturi mask (target SpO2 88-92% to avoid blunting hypoxic drive and worsening hypercapnic respiratory failure); Nebulized bronchodilators; Oral Prednisolone (40 mg daily for 5 days); Antibiotics (Amoxicillin-clavulanate or Azithromycin); Non-Invasive Ventilation (BiPAP) if respiratory acidosis (pH 7.25-7.35 with PaCO2 >45 mmHg)."
                    ),
                    referenceLinks = listOf(ReferenceLink("GOLD Guidelines for COPD & GINA Guidelines for Asthma", "https://goldcopd.org/", "Guideline")),
                    isRepeatQuestion = true
                )
            )
        )
    )
}
