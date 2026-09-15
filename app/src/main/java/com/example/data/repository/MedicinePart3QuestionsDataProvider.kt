package com.example.data.repository

import com.example.data.model.*

object MedicinePart3QuestionsDataProvider {

    fun getPart3Topics(): List<Topic> = listOf(
        Topic(
            id = "med_cns_stroke_meningitis",
            subjectId = "medicine",
            name = "Neurology: Stroke, Meningitis & Status Epilepticus",
            description = "Acute ischemic stroke (MCA infarct, window period, rt-PA thrombolysis), pyogenic vs tubercular meningitis CSF analysis, and emergency status epilepticus protocol.",
            textbookChapter = "Chapter 10: Neurology, Archith Boloor (4th Ed)",
            standardPages = "pp. 1115-1230",
            questions = listOf(
                Question(
                    id = "med_stroke_ischemic_1",
                    subjectId = "medicine",
                    topicId = "med_cns_stroke_meningitis",
                    topicName = "Cerebrovascular Disease",
                    text = "A 65-year-old hypertensive and diabetic male presents with sudden-onset right-sided hemiplegia and expressive aphasia 2 hours ago. i) Localization of lesion; ii) Oxford (BAMFORD) stroke classification; iii) Non-contrast CT brain interpretation; iv) IV Thrombolysis eligibility and rt-PA protocol; v) Permissive hypertension guidelines and secondary prevention.",
                    years = listOf("2025", "2023", "2021", "2018", "2015", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 3 + 2 + 5 + 3 = 15 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "1135-1152",
                    highYieldPoints = listOf(
                        "Localization: Left Middle Cerebral Artery (MCA) superior division territory infarction (dominant hemisphere), causing right faciobrachial hemiplegia/paresis and Broca's (motor/expressive) non-fluent aphasia.",
                        "Oxford / BAMFORD Stroke Classification:",
                        "1. Total Anterior Circulation Infarct (TACI): Triad of hemiparesis/hemisensory loss, homonymous hemianopia, and higher cortical dysfunction (aphasia or visuospatial neglect).",
                        "2. Partial Anterior Circulation Infarct (PACI): Any two of the three components of TACI, or higher cortical dysfunction alone.",
                        "3. Lacunar Infarct (LACI): Pure motor stroke, pure sensory stroke, sensorimotor stroke, or ataxic hemiparesis (no cortical signs).",
                        "4. Posterior Circulation Infarct (POCI): Ipsilateral cranial nerve palsy with contralateral motor/sensory deficit (crossed signs), bilateral motor/sensory deficits, cerebellar dysfunction, or isolated homonymous hemianopia.",
                        "Non-Contrast CT Brain: Immediate NCCT is mandatory to RULE OUT INTRACRANIAL HEMORRHAGE (hyperdense area). Early ischemic signs on CT: Loss of insular ribbon, obscuration of lentiform nucleus, sulcal effacement, hyperdense MCA sign.",
                        "IV Thrombolysis Protocol (Window Period < 4.5 hours from symptom onset):",
                        "- Agent: Recombinant Tissue Plasminogen Activator (rt-PA / Alteplase): Dose = 0.9 mg/kg (maximum 90 mg); 10% given as IV bolus over 1 minute, remaining 90% infused over 60 minutes. Alternative: IV Tenecteplase 0.25 mg/kg single bolus (max 25 mg).",
                        "- Absolute Contraindications: Active internal bleeding, previous intracranial hemorrhage, recent head trauma/stroke (<3 months), intracranial neoplasm/AVM, platelet count <100,000/uL, INR >1.7 on warfarin, BP >185/110 mmHg refractory to antihypertensive therapy.",
                        "- Endovascular Mechanical Thrombectomy: Indicated for Large Vessel Occlusion (LVO - ICA or M1 segment MCA) up to 6 hours (and selected cases up to 24 hours based on CT perfusion / MR mismatch).",
                        "Permissive Hypertension Guidelines: Before thrombolysis, BP must be lowered to < 185/110 mmHg using IV Labetalol (10-20 mg bolus) or IV Nicardipine. If NOT eligible for thrombolysis, permit blood pressure up to 220/120 mmHg for the first 24-48 hours to maintain collateral cerebral perfusion in the ischemic penumbra.",
                        "Secondary Prevention: Dual Antiplatelet Therapy (DAPT: Aspirin 75-100 mg + Clopidogrel 75 mg) for 21 days followed by single antiplatelet; High-intensity Statin (Atorvastatin 80 mg daily); Target LDL < 55 mg/dL."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("AHA/ASA Guidelines for the Early Management of Acute Ischemic Stroke", "https://www.ahajournals.org/doi/10.1161/STR.0000000000000198", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "med_meningitis_csf_diff",
                    subjectId = "medicine",
                    topicId = "med_cns_stroke_meningitis",
                    topicName = "Central Nervous System Infections",
                    text = "A 25-year-old male presents with high fever, severe headache, projectile vomiting, and altered sensorium. On examination, neck stiffness and positive Kernig's sign are noted. i) Differentiate CSF findings in Pyogenic, Tubercular, and Viral meningitis; ii) Empiric antibiotic regimen; iii) Role of dexamethasone in bacterial and tubercular meningitis.",
                    years = listOf("2024", "2022", "2019", "2017", "2014", "2011"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 6 + 3 + 3 = 15 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "1180-1194",
                    highYieldPoints = listOf(
                        "Clinical Signs of Meningeal Irritation: Neck rigidity (resistance to passive neck flexion), Kernig's sign (resistance/pain on extending the knee when hip is flexed at 90 degrees), Brudzinski's neck sign (passive flexion of neck elicits involuntary flexion of hips and knees).",
                        "CSF Differentiation Table (Lumbar Puncture Findings):",
                        "1. Normal CSF: Clear, opening pressure 70-180 mm H2O, Cells 0-5 lymphocytes/uL, Protein 15-45 mg/dL, Glucose 50-80 mg/dL (CSF:blood glucose ratio >= 0.6).",
                        "2. Acute Pyogenic / Bacterial Meningitis: Turbid/purulent appearance; Opening pressure elevated (>200-300 mm H2O); Cells 1,000 - 10,000/uL with >80% Neutrophils (Polymorphonuclear pleocytosis); Protein markedly elevated (>100 - 500 mg/dL); Glucose markedly reduced (<40 mg/dL, CSF:blood ratio <0.4); Gram stain positive in 60-80%.",
                        "3. Tubercular Meningitis (TBM): Clear or opalescent fluid; 'Cobweb' / 'pellicle' coagulum forms on standing; Opening pressure elevated; Cells 100 - 500/uL with >70-80% Lymphocytes; Protein very markedly elevated (>150 - 500 mg/dL or higher); Glucose reduced (CSF:blood ratio <0.3); Adenosine Deaminase (ADA) elevated (>10 U/L); CBNAAT / GeneXpert positive for MTB.",
                        "4. Viral (Aseptic) Meningitis: Clear appearance; Opening pressure normal or mildly elevated; Cells 50 - 500/uL, predominantly Lymphocytes; Protein mildly elevated (50-100 mg/dL); Glucose NORMAL (CSF:blood ratio >0.6).",
                        "Empiric Antimicrobial Therapy (initiated immediately after blood cultures, before waiting for LP if delay anticipated):",
                        "- Community-acquired bacterial meningitis: IV Ceftriaxone (2 g IV 12-hourly) + IV Vancomycin (15-20 mg/kg 8-12 hourly). Add IV Ampicillin (2 g 4-hourly) if age >50 years or immunocompromised to cover Listeria monocytogenes.",
                        "Role of Dexamethasone:",
                        "- Acute Bacterial Meningitis (especially Streptococcus pneumoniae and H. influenzae): IV Dexamethasone 10 mg administered 10-15 minutes BEFORE or CONCURRENT with the first dose of IV antibiotic, repeated every 6 hours for 4 days. Proven to significantly reduce sensorineural hearing loss, neurological sequelae, and overall mortality by suppressing subarachnoid space cytokine release.",
                        "- Tubercular Meningitis: Systemic Dexamethasone (0.4 mg/kg/day tapered over 6-8 weeks) reduces basal exudates, cerebral edema, vasculitis/infarction, and mortality in British Medical Research Council (BMRC) Stage II and III TBM."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("IDSA Clinical Practice Guidelines for Bacterial Meningitis", "https://www.idsociety.org/", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "med_status_epilepticus",
                    subjectId = "medicine",
                    topicId = "med_cns_stroke_meningitis",
                    topicName = "Neurocritical Emergencies",
                    text = "Define Status Epilepticus (operational definition). Outline the systematic stepwise management protocol (0 to 60 minutes) for a patient brought to the casualty in generalized convulsive status epilepticus.",
                    years = listOf("2025", "2023", "2020", "2018", "2016", "2013"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 12 = 15 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "1165-1175",
                    highYieldPoints = listOf(
                        "Operational Definition of Generalized Convulsive Status Epilepticus (GCSE):",
                        "- T1 (Time to initiate treatment): Seizure activity lasting >= 5 minutes, OR two or more discrete seizures between which there is incomplete recovery of consciousness.",
                        "- T2 (Time when neuronal damage begins): Seizure activity persisting >= 30 minutes, resulting in long-term consequences including neuronal death, neuronal injury, and alteration of neuronal networks.",
                        "Stepwise Management Protocol (Timeline 0 - 60 Minutes):",
                        "1. Phase 0 (0 - 5 Minutes) - Stabilization Phase:",
                        "- Airway, Breathing, Circulation (ABC): Position in lateral decubitus, suction secretions, insert nasopharyngeal airway, administer high-flow oxygen.",
                        "- IV Access: Insert 2 large-bore IV lines, draw blood for CBC, electrolytes, calcium, magnesium, renal and liver function, toxicology screen, and blood glucose.",
                        "- Correct Hypoglycemia: If bedside blood glucose < 70 mg/dL, administer 100 mg IV Thiamine (to prevent Wernicke's encephalopathy) followed by 50 mL of 50% Dextrose IV.",
                        "2. Phase 1 (5 - 20 Minutes) - Emergent Initial Therapy (First-Line Benzodiazepines):",
                        "- IV Lorazepam: 4 mg IV bolus over 2 minutes (0.1 mg/kg; may repeat once at 10 min if seizure continues). Drug of Choice due to prolonged CNS half-life.",
                        "- Alternatives: IV Diazepam 10 mg (0.15-0.2 mg/kg) or IM Midazolam 10 mg (if IV access not established).",
                        "3. Phase 2 (20 - 40 Minutes) - Urgent Control Therapy (Second-Line Non-Sedating Antiseizure Medications):",
                        "- IV Levetiracetam: 60 mg/kg IV infusion (maximum 4500 mg) over 10-15 minutes.",
                        "- OR IV Fosphenytoin: 20 mg PE/kg (maximum 1500 mg PE) infused at 150 mg PE/min with continuous cardiac monitoring.",
                        "- OR IV Sodium Valproate: 40 mg/kg IV infusion (maximum 3000 mg) over 10 minutes.",
                        "4. Phase 3 (> 40 Minutes) - Refractory Status Epilepticus (Third-Line General Anesthesia in ICU):",
                        "- Patient requires endotracheal intubation, mechanical ventilation, and continuous electroencephalographic (EEG) monitoring.",
                        "- Continuous IV Infusion Anesthetics: IV Propofol (1-2 mg/kg bolus, then 2-10 mg/kg/h) OR IV Midazolam (0.2 mg/kg bolus, then 0.05-2 mg/kg/h) OR IV Thiopental / Pentobarbital.",
                        "- Goal: Titrate anesthetic infusion to achieve burst suppression pattern on continuous EEG for 24-48 hours before gradual taper."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("American Epilepsy Society (AES) Guidelines for Status Epilepticus", "https://www.aesnet.org/", "Guideline")
                    ),
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "med_nephrology_hypertension",
            subjectId = "medicine",
            name = "Nephrology, AKI & Hypertensive Emergencies",
            description = "Acute kidney injury (KDIGO staging, prerenal vs ATN, emergency dialysis indications), nephrotic syndrome workup & complications, and hypertensive emergency management.",
            textbookChapter = "Chapters 2 & 8: Archith Boloor (4th Ed)",
            standardPages = "pp. 120-145, 850-940",
            questions = listOf(
                Question(
                    id = "med_aki_kdigo_dialysis",
                    subjectId = "medicine",
                    topicId = "med_nephrology_hypertension",
                    topicName = "Acute Kidney Injury",
                    text = "Define Acute Kidney Injury (AKI) using KDIGO criteria and mention its staging. Differentiate laboratory findings in Prerenal Azotemia vs Acute Tubular Necrosis (ATN). List the absolute emergency indications for hemodialysis.",
                    years = listOf("2025", "2023", "2020", "2018", "2015", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 3 + 5 + 4 = 15 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "855-870",
                    highYieldPoints = listOf(
                        "KDIGO Definition of AKI (any of the following 3):",
                        "1. Increase in Serum Creatinine by >= 0.3 mg/dL (>= 26.5 umol/L) within 48 hours; OR",
                        "2. Increase in Serum Creatinine to >= 1.5 times baseline, which is known or presumed to have occurred within the prior 7 days; OR",
                        "3. Urine volume < 0.5 mL/kg/hour for 6 continuous hours.",
                        "KDIGO Staging of AKI:",
                        "- Stage 1: Serum creatinine 1.5 - 1.9 times baseline OR increase by >=0.3 mg/dL; Urine output <0.5 mL/kg/h for 6-12 hours.",
                        "- Stage 2: Serum creatinine 2.0 - 2.9 times baseline; Urine output <0.5 mL/kg/h for >=12 hours.",
                        "- Stage 3: Serum creatinine 3.0 times baseline OR >=4.0 mg/dL OR initiation of renal replacement therapy; Urine output <0.3 mL/kg/h for >=24 hours OR Anuria for >=12 hours.",
                        "Prerenal Azotemia vs Acute Tubular Necrosis (ATN) Table:",
                        "1. Fractional Excretion of Sodium (FENa = [UNa x SCr] / [SNa x UCr] x 100): Prerenal < 1%; ATN > 2%. (Most reliable differentiator).",
                        "2. Urinary Sodium Concentration (UNa): Prerenal < 20 mEq/L (avid tubular reabsorption); ATN > 40 mEq/L (damaged tubule cannot reabsorb sodium).",
                        "3. Urine Osmolality: Prerenal > 500 mOsm/kg (concentrated urine); ATN < 350 mOsm/kg (isosthenuric, damaged concentrating mechanism).",
                        "4. BUN / Serum Creatinine Ratio: Prerenal > 20:1; ATN 10-15:1.",
                        "5. Urine Specific Gravity: Prerenal > 1.020; ATN < 1.010 - 1.012.",
                        "6. Urine Microscopy: Prerenal shows normal bland sediment or hyaline casts; ATN shows 'Muddy brown' coarse granular casts and necrotic renal tubular epithelial cells.",
                        "Emergency Indications for Hemodialysis (Mnemonic: AEIOU):",
                        "- A (Acidosis): Severe refractory metabolic acidosis with arterial pH < 7.15 unresponsive to medical therapy.",
                        "- E (Electrolytes): Severe refractory hyperkalemia with serum potassium > 6.5 mEq/L or ECG changes (tall peaked T waves, widened QRS) despite medical stabilization.",
                        "- I (Ingestion / Intoxication): Poisoning with dialyzable toxins (Methanol, Ethylene glycol, Salicylates, Lithium, Theophylline).",
                        "- O (Overload): Severe fluid overload / Acute pulmonary edema refractory to high-dose IV diuretics.",
                        "- U (Uremia): Symptomatic uremic complications including Uremic Pericarditis, Uremic Encephalopathy / Asterixis, or Uremic Bleeding diathesis."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("KDIGO Clinical Practice Guideline for Acute Kidney Injury", "https://kdigo.org/guidelines/acute-kidney-injury/", "Guideline")
                    ),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "med_nephrotic_syndrome",
                    subjectId = "medicine",
                    topicId = "med_nephrology_hypertension",
                    topicName = "Glomerular Diseases",
                    text = "A 22-year-old male presents with generalized swelling of body (anasarca) and frothy urine. Define Nephrotic Syndrome, clinical features, diagnostic evaluation, secondary causes, major thromboembolic and infectious complications, and management.",
                    years = listOf("2024", "2021", "2019", "2016", "2013", "2010"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 3 + 4 + 5 = 15 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "875-890",
                    highYieldPoints = listOf(
                        "Definition of Nephrotic Syndrome (Classic Diagnostic Triad):",
                        "1. Heavy / Nephrotic-range Proteinuria: > 3.5 g / 24 hours / 1.73 m2 (or Spot urine protein-to-creatinine ratio > 3.5 mg/mg).",
                        "2. Hypoalbuminemia: Serum albumin < 3.0 g/dL (often < 2.5 g/dL).",
                        "3. Generalized Edema / Anasarca: Dependent pitting edema starting in periorbital tissue and spreading to lower limbs, scrotum, and serous cavities (ascites, pleural effusion).",
                        "Accompanied by: Hypercholesterolemia / Dyslipidemia (total cholesterol > 250 mg/dL) and Lipiduria ('oval fat bodies' showing Maltese cross appearance under polarized light).",
                        "Primary Causes in Adults: Membranous Nephropathy (30-40%, associated with anti-PLA2R antibodies), Focal Segmental Glomerulosclerosis (FSGS - 30-35%), Minimal Change Disease (10-15%, electron microscopy shows effacement of podocyte foot processes), Membranoproliferative Glomerulonephritis (MPGN).",
                        "Secondary Causes: Diabetic nephropathy (most common systemic cause), Systemic Lupus Erythematosus (Lupus nephritis), Amyloidosis, Hepatitis B, Hepatitis C, HIV, NSAIDs, Penicillamine.",
                        "Major Life-Threatening Complications:",
                        "1. Hypercoagulability & Thromboembolism: High incidence of Deep Vein Thrombosis (DVT), Renal Vein Thrombosis (flank pain, gross hematuria), and Pulmonary Embolism. Mechanisms: Urinary loss of natural anticoagulants (Antithrombin III, Protein C, Protein S), increased hepatic synthesis of fibrinogen, and thrombocytosis. Prophylactic anticoagulation is indicated when serum albumin < 2.0 - 2.5 g/dL.",
                        "2. Severe Infections: Spontaneous Bacterial Peritonitis (SBP - Streptococcus pneumoniae is classic organism) and cellulitis, due to urinary loss of IgG immunoglobulins and complement Factor B.",
                        "3. Accelerated Atherosclerosis (due to severe hypercholesterolemia).",
                        "Management Protocol:",
                        "- General: Dietary sodium restriction (< 2 g/day), loop diuretics (IV Furosemide 40-80 mg + Spironolactone) for edema, ACE inhibitors / ARBs (reduce intraglomerular pressure and proteinuria by 30-50%), Statins for dyslipidemia.",
                        "- Immunosuppressive Therapy: First-line for Minimal Change Disease: Oral Prednisolone 1 mg/kg/day (maximum 80 mg) for 8-12 weeks, followed by alternate-day taper over 6 months.",
                        "- Membranous Nephropathy: Ponticelli regimen (alternating monthly cycles of Corticosteroids and Cyclophosphamide/Chlorambucil) or Calcineurin inhibitors (Tacrolimus/Cyclosporine) or Rituximab (anti-CD20 antibody)."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("KDIGO Clinical Practice Guideline for the Management of Glomerular Diseases", "https://kdigo.org/", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "med_hypertensive_emergencies",
                    subjectId = "medicine",
                    topicId = "med_nephrology_hypertension",
                    topicName = "Hypertension & Cardiovascular Emergencies",
                    text = "Differentiate Hypertensive Emergency vs Hypertensive Urgency. Mention manifestations of acute target-organ damage. Outline blood pressure reduction principles, timeline targets, and intravenous pharmacological agents of choice.",
                    years = listOf("2025", "2022", "2018", "2015", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 4 + 4 + 4 = 15 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "120-135",
                    highYieldPoints = listOf(
                        "Definitions:",
                        "- Hypertensive Emergency: Severe elevation of blood pressure (typically Systolic BP > 180 mmHg and/or Diastolic BP > 120 mmHg) accompanied by ACUTE, ONGOING, LIFE-THREATENING TARGET-ORGAN DAMAGE. Requires immediate ICU admission and parenteral antihypertensive therapy.",
                        "- Hypertensive Urgency: Severe elevation of blood pressure (>180/120 mmHg) in a stable patient WITHOUT acute target-organ damage. Managed with oral agents over 24-48 hours on an outpatient/short-stay basis.",
                        "Manifestations of Acute Target-Organ Damage:",
                        "1. Neurological: Hypertensive encephalopathy (headache, vomiting, papilledema, seizures, coma), acute ischemic stroke, intracerebral hemorrhage, subarachnoid hemorrhage.",
                        "2. Cardiovascular: Acute aortic dissection, acute coronary syndrome (STEMI/NSTEMI/unstable angina), acute left ventricular failure with pulmonary edema.",
                        "3. Renal: Acute kidney injury with hematuria, proteinuria, and rapid decline in GFR.",
                        "4. Ocular: Grade IV Hypertensive Retinopathy (Keith-Wagener-Barker classification: flame hemorrhages, cotton-wool spots, hard exudates, and Papilledema).",
                        "5. Obstetric: Eclampsia / Severe pre-eclampsia.",
                        "Target BP Reduction Principles (Golden Rule of Auto-Regulation):",
                        "- DO NOT LOWER BLOOD PRESSURE RAPIDLY OR TO NORMAL LEVELS IMMEDIATELY! Rapid reduction below the autoregulatory range precipitates cerebral watershed infarction, optic nerve ischemia (ischemic optic neuropathy / blindness), and coronary hypoperfusion.",
                        "- Standard Target Timeline: Reduce Mean Arterial Pressure (MAP) by NO MORE than 20% to 25% within the first 1 hour; then if stable, reduce towards 160/100 mmHg over the next 2 to 6 hours, and cautiously normalize over the subsequent 24 to 48 hours.",
                        "- Critical Exception: ACUTE AORTIC DISSECTION: SBP MUST be reduced RAPIDLY to < 120 mmHg and heart rate to < 60 bpm within 20 minutes (using IV Esmolol + IV Nicardipine/Nitroprusside).",
                        "First-Line Intravenous Pharmacological Agents:",
                        "1. IV Labetalol (Combined alpha-1 and non-selective beta-blocker, 1:7 ratio): 20 mg IV bolus over 2 min, repeated as 40-80 mg every 10 min up to max 300 mg; or infusion 1-2 mg/min. Excellent in stroke, hypertensive encephalopathy, and pregnancy.",
                        "2. IV Nicardipine: Dihydropyridine calcium channel blocker (5 mg/h titrating by 2.5 mg/h every 15 min to max 15 mg/h). Predictable titratability.",
                        "3. IV Nitroglycerin: Potent venodilator (5-100 mcg/min). DRUG OF CHOICE in Acute Coronary Syndrome and Acute Pulmonary Edema.",
                        "4. IV Sodium Nitroprusside: Balanced arterial and venous dilator (0.25-10 mcg/kg/min). Requires arterial line monitoring; risk of cyanide and thiocyanate toxicity."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("ACC/AHA Guideline for the Prevention, Detection, Evaluation, and Management of High Blood Pressure", "https://www.ahajournals.org/", "Guideline")
                    ),
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "med_tropical_fevers_tb",
            subjectId = "medicine",
            name = "Infectious Diseases: Tropical Fevers, Endocarditis & Tuberculosis",
            description = "Infective endocarditis (Modified Duke criteria), Dengue fever & DSS (WHO criteria & fluids), Enteric / Typhoid fever (clinical course & Widal), and Pulmonary Tuberculosis (NTEP daily FDC & MDR-TB).",
            textbookChapter = "Chapters 1 & 4: Archith Boloor (4th Ed)",
            standardPages = "pp. 75-95, 355-440",
            questions = listOf(
                Question(
                    id = "med_infective_endocarditis",
                    subjectId = "medicine",
                    topicId = "med_tropical_fevers_tb",
                    topicName = "Infective Endocarditis",
                    text = "Describe the Modified Duke Criteria for the clinical diagnosis of Infective Endocarditis (IE). List peripheral vascular and immunologic stigmata. Outline empiric antimicrobial regimens and surgical indications.",
                    years = listOf("2024", "2022", "2019", "2016", "2013", "2011"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "6 + 3 + 3 + 3 = 15 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "78-92",
                    highYieldPoints = listOf(
                        "Modified Duke Criteria for Diagnosis of Infective Endocarditis:",
                        "Major Criteria (2):",
                        "1. Positive Blood Cultures for IE: Typical microorganisms consistent with IE from 2 separate blood cultures (Viridans streptococci, Streptococcus gallolyticus, HACEK group, Staphylococcus aureus, or community-acquired enterococci without primary focus); OR persistently positive blood cultures (>12 hours apart or all 3 of 3); OR single positive culture for Coxiella burnetii / phase I IgG antibody titer > 1:800.",
                        "2. Evidence of Endocardial Involvement on Echocardiography (TEE is superior to TTE): Oscillating intracardiac mass (vegetation) on valve or supporting structures; Abscess / pseudoaneurysm / intracardiac fistula; New partial dehiscence of prosthetic valve; New valvular regurgitation (worsening or changing of pre-existing murmur).",
                        "Minor Criteria (5):",
                        "1. Predisposition: Predisposing heart condition (rheumatic valvular disease, prosthetic valve, congenital heart disease, prior IE) or IV drug use.",
                        "2. Fever: Temperature >= 38.0 C (100.4 F).",
                        "3. Vascular Phenomena: Major arterial emboli, septic pulmonary infarcts, mycotic aneurysm, intracranial hemorrhage, conjunctival hemorrhages, Janeway lesions (painless, erythematous, blanching macules on palms and soles due to septic microemboli).",
                        "4. Immunologic Phenomena: Glomerulonephritis, Osler nodes (painful, tender, erythematous nodules on pads of fingers and toes due to immune complex deposition), Roth spots (oval retinal hemorrhages with pale central centers), Positive Rheumatoid Factor (RF).",
                        "5. Microbiological Evidence: Positive blood culture not meeting major criterion, or serological evidence of active infection.",
                        "Diagnostic Requirements: Definite IE: 2 Major criteria; OR 1 Major + 3 Minor; OR 5 Minor criteria.",
                        "Empiric Antimicrobial Therapy (administered IV for 4-6 weeks):",
                        "- Native Valve Endocarditis: IV Ampicillin-Sulbactam (12 g/day IV in 4 divided doses) OR IV Amoxicillin-Clavulanate + IV Gentamicin (3 mg/kg/day); OR IV Vancomycin (15-20 mg/kg q8-12h) if MRSA suspected.",
                        "- Prosthetic Valve Endocarditis: IV Vancomycin + IV Gentamicin + IV Rifampicin (300-600 mg BD).",
                        "Indications for Urgent Cardiac Surgery (within 24-48 hours):",
                        "1. Severe acute aortic or mitral regurgitation causing refractory pulmonary edema or cardiogenic shock.",
                        "2. Locally uncontrolled infection (paravalvular abscess, fistula, pseudoaneurysm, enlarging vegetation).",
                        "3. Persistent bacteremia or fever despite >7-10 days of appropriate antibiotics.",
                        "4. Prevention of embolism in large mobile vegetations (>10 mm) especially after recurrent embolic episodes.",
                        "5. Fungal endocarditis (Candida, Aspergillus) or resistant pathogens."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("ESC Guidelines for the Management of Endocarditis", "https://www.escardio.org/", "Guideline")
                    ),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "med_dengue_fever_dss",
                    subjectId = "medicine",
                    topicId = "med_tropical_fevers_tb",
                    topicName = "Arboviral Infections",
                    text = "A 20-year-old student presents on Day 5 of high fever with retro-orbital pain, severe myalgia, persistent vomiting, and abdominal pain. Platelet count is 45,000/uL and Hematocrit is 48%. i) WHO (2009) classification of Dengue; ii) Pathophysiology of capillary leakage and critical phase; iii) Fluid resuscitation protocol; iv) Indications for platelet transfusion.",
                    years = listOf("2024", "2022", "2019", "2018", "2015", "2013"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 3 + 6 + 3 = 15 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "372-385",
                    highYieldPoints = listOf(
                        "Diagnosis: Dengue Fever with Warning Signs, in Critical Phase (Day 5, hemoconcentration with rising hematocrit and thrombocytopenia).",
                        "WHO (2009) Classification of Dengue:",
                        "1. Dengue Without Warning Signs: Fever with two of: nausea/vomiting, rash, aches and pains (headache, retro-orbital pain, myalgia, arthralgia - 'breakbone fever'), positive tourniquet test, leukopenia.",
                        "2. Dengue With Warning Signs: 1. Abdominal pain or tenderness; 2. Persistent vomiting; 3. Clinical fluid accumulation (pleural effusion, ascites); 4. Mucosal bleeding (epistaxis, gum bleed, menorrhagia); 5. Lethargy or restlessness; 6. Hepatomegaly > 2 cm; 7. Laboratory: Concurrent rapid decline in platelet count (<100,000/uL) with progressive rise in hematocrit (>20% above baseline, indicating plasma leakage).",
                        "3. Severe Dengue: 1. Severe Plasma Leakage leading to Dengue Shock Syndrome (DSS - rapid weak pulse, narrow pulse pressure <20 mmHg, cold clammy extremities, CRT >2 sec) or respiratory distress from fluid accumulation; 2. Severe Bleeding (as evaluated by clinician); 3. Severe Organ Involvement (Liver: AST or ALT >= 1000 IU/L; CNS: impaired consciousness; Heart: myocarditis).",
                        "Critical Phase & Pathophysiology: Occurs at the time of defervescence (typically Days 3-7 of illness) and lasts 24 to 48 hours. Antibody-Dependent Enhancement (ADE) in secondary dengue causes intense cytokine storm (TNF-alpha, IL-6, IL-8) that disrupts endothelial glycocalyx, causing acute capillary hyperpermeability and massive extravasation of plasma into serous spaces, leading to hypovolemic shock and hemoconcentration.",
                        "Fluid Resuscitation Protocol (Cornerstone of Therapy):",
                        "- Isotonic Crystalloid: Ringer's Lactate or 0.9% Normal Saline.",
                        "- Initial Rate for Warning Signs: 5 to 7 mL/kg/hour for 1-2 hours. If clinical status and hematocrit improve, reduce to 3-5 mL/kg/hour for 2-4 hours, then 2-3 mL/kg/hour.",
                        "- For Dengue Shock Syndrome (Compensated / Decompensated Shock): Immediate IV fluid bolus of 10 to 20 mL/kg over 15 to 30 minutes. If shock persists and hematocrit remains high, repeat crystalloid bolus or switch to colloid (Dextran 40 or 6% HES 10-20 mL/kg). If hematocrit drops rapidly without clinical improvement, suspect occult internal hemorrhage -> administer PRBC transfusion.",
                        "- Total fluid therapy must NOT exceed 24-48 hours of critical phase. CESSATION OF FLUIDS is vital once hematocrit normalizes to prevent pulmonary edema during the recovery / reabsorption phase.",
                        "Evidence-Based Triggers for Platelet Transfusion (Strict Guidelines):",
                        "- PLATELET TRANSFUSION IS NOT ROUTINELY RECOMMENDED based on platelet count alone, even if < 20,000/uL, as it does not prevent bleeding or shorten hospital stay, and risks volume overload.",
                        "- Absolute Indications: 1. Platelet count < 10,000/uL in asymptomatic patients without bleeding (prophylactic trigger); 2. Platelet count < 50,000/uL with significant active bleeding (epistaxis, hematemesis, melena, menorrhagia); 3. Urgent emergency surgery required."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("WHO Comprehensive Guidelines for Dengue", "https://www.who.int/", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "med_typhoid_fever_tb",
                    subjectId = "medicine",
                    topicId = "med_tropical_fevers_tb",
                    topicName = "Enteric Fever & Pulmonary Tuberculosis",
                    text = "Describe the weekly clinical course, diagnostic tests (Widal interpretation), and complications of Enteric Fever. Outline the NTEP daily Fixed-Dose Combination (FDC) regimen for pulmonary tuberculosis and define MDR-TB.",
                    years = listOf("2025", "2023", "2021", "2018", "2016", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 3 + 2 + 5 + 2 = 15 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "358-370, 395-420",
                    highYieldPoints = listOf(
                        "Clinical Course of Enteric (Typhoid) Fever (Caused by Salmonella enterica serotype Typhi):",
                        "- 1st Week: 'Step-ladder' pattern of remittent fever rising day by day, frontal headache, dry cough, malaise, relative bradycardia (Faget's sign - pulse rate inappropriately slow for the height of temperature).",
                        "- 2nd Week: High continuous plateau fever (103-104 F), Rose spots (faint erythematous, blanching macules on lower chest and abdomen appearing on days 7-10), apathy, 'pea-soup' diarrhea or constipation, tender splenomegaly, and abdominal distension.",
                        "- 3rd Week ('Complication Week'): Severe toxic state ('typhoid state' with muttering delirium, coma vigil); Serious complications: Intestinal perforation (due to necrosis and ulceration of Peyer's patches in the antimesenteric border of terminal ileum, causing acute peritonitis and pneumoperitoneum on erect abdominal X-ray) and Massive intestinal hemorrhage; Cholecystitis, myocarditis.",
                        "- 4th Week: Defervescence and recovery; or development of chronic carrier state (excretion of bacilli in stools/urine for >1 year, stored in gallbladder stones).",
                        "Diagnostic Evaluation:",
                        "- Blood Culture: GOLD STANDARD; positive in 90% in the 1st week of fever. (Bone marrow culture is most sensitive at 95% even after prior antibiotics).",
                        "- Widal Test: Tube agglutination test detecting O (somatic) and H (flagellar) agglutinins. Titers become positive only after 7-10 days. Diagnostic cut-off in endemic areas (India): Anti-O titer >= 1:160 and Anti-H titer >= 1:200; or a 4-fold rise in paired sera collected 1-2 weeks apart.",
                        "- Pharmacotherapy: First-line: IV Ceftriaxone (2 g once daily IV for 10-14 days) or Oral Azithromycin (500 mg once daily for 7 days) due to widespread fluoroquinolone resistance.",
                        "National Tuberculosis Elimination Program (NTEP) Protocol for Pulmonary TB:",
                        "- Diagnostic Algorithm: Rapid Molecular Testing by CBNAAT (Cartridge Based Nucleic Acid Amplification Test / GeneXpert MTB/RIF) or TrueNat on sputum specimens to detect Mycobacterium tuberculosis complex and Rifampicin resistance within 2 hours.",
                        "- Daily Fixed-Dose Combination (FDC) Regimen for New Drug-Sensitive Pulmonary TB:",
                        "1. Intensive Phase (IP - 2 Months of 4 Drugs: HRZE): Daily Isoniazid (H, 300 mg) + Rifampicin (R, 450-600 mg) + Pyrazinamide (Z, 1500 mg) + Ethambutol (E, 1000 mg) based on weight bands.",
                        "2. Continuation Phase (CP - 4 Months of 3 Drugs: HRE): Daily Isoniazid (H) + Rifampicin (R) + Ethambutol (E). (Pyrazinamide omitted in CP).",
                        "- Pyridoxine (Vitamin B6 10-20 mg daily) co-administered to prevent Isoniazid-induced peripheral neuropathy.",
                        "Drug-Resistant TB Definitions:",
                        "- Multidrug-Resistant TB (MDR-TB): TB disease caused by strains of M. tuberculosis that are resistant in vitro to at least both Isoniazid (H) and Rifampicin (R).",
                        "- Pre-XDR-TB: TB that meets the definition of MDR/RR-TB and is also resistant to any fluoroquinolone (Levofloxacin or Moxifloxacin).",
                        "- XDR-TB: Pre-XDR-TB that is also resistant to at least one additional Group A drug (Bedaquiline or Linezolid)."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("National Tuberculosis Elimination Program (NTEP) Technical Guidelines", "https://tbcindia.gov.in/", "Guideline")
                    ),
                    isRepeatQuestion = true
                )
            )
        )
    )
}
