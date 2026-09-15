package com.example.data.repository

import com.example.data.model.*

object SurgerySystemicQuestionsDataProvider {

    fun getSystemicTopics(): List<Topic> = listOf(
        Topic(
            id = "surg_head_neck_endocrine",
            subjectId = "surgery",
            name = "Head, Neck, Salivary & Endocrine (Thyroid & Breast)",
            description = "Cleft lip/palate, pleomorphic adenoma, multinodular goitre, primary hyperparathyroidism, solitary thyroid nodule, breast carcinoma TNM and triple assessment.",
            textbookChapter = "Chapters 16-25: Faciomaxillary, Salivary, Thyroid & Breast",
            standardPages = "pp. 383-612",
            questions = listOf(
                Question(
                    id = "surg_cleft_salivary_1",
                    subjectId = "surgery",
                    topicId = "surg_head_neck_endocrine",
                    topicName = "Faciomaxillary & Salivary",
                    text = "What is cleft lip and cleft palate? Write down management of cleft lip and palate. Classify parotid tumours. How will you manage Pleomorphic adenoma of parotid in a 40-year-old man?",
                    years = listOf("2025 P2", "2024", "2020 P2", "2018 P1", "2012 P2"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "15 Marks",
                    textbookRef = "SRB (7th Ed)",
                    pageNumbers = "383-386, 477, 480",
                    highYieldPoints = listOf(
                        "Cleft Lip Management Rule of 10s (Millard's rotation-advancement repair at ~3 months / 10 weeks of age): 1. Age >=10 weeks, 2. Weight >=10 lbs (4.5 kg), 3. Hemoglobin >=10 g/dL, 4. WBC count <10,000/mm3.",
                        "Cleft Palate Repair: Timing: 9 to 18 months of age (before child develops faulty speech habits and phonation); Wardill-Kilner pushback palatoplasty or Von Langenbeck bipedicle flap palatoplasty.",
                        "Parotid Tumours Classification: Benign (80%): Pleomorphic adenoma (mixed tumour, 85%), Warthin's tumour (adenolymphoma / papillary cystadenoma lymphomatosum, smoking association), Monomorphic adenoma, Oncocytoma; Malignant (20%): Mucoepidermoid carcinoma (most common), Adenoid cystic carcinoma (perineural invasion), Acinic cell carcinoma, Carcinoma ex-pleomorphic adenoma.",
                        "Pleomorphic Adenoma Management: Superficial Parotidectomy (removal of superficial lobe lateral to the facial nerve with identification and preservation of all facial nerve branches: temporal, zygomatic, buccal, marginal mandibular, cervical).",
                        "Golden Rule: ENUCLEATION IS FORBIDDEN because pseudopods penetrate the false capsule, causing recurrences that are difficult to re-operate and risk malignant change."
                    ),
                    referenceLinks = listOf(ReferenceLink("ASI Head and Neck Surgical Oncology", "https://asiindia.org/", "Guideline")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "surg_thyroid_1",
                    subjectId = "surgery",
                    topicId = "surg_head_neck_endocrine",
                    topicName = "Thyroid & Parathyroid",
                    text = "A 32 year old lady attended surgical OPD with painless multiple nodules of various sizes on both lobes of thyroid and isthmus. No sign of malignancy or thyrotoxicosis. Diagnosis, investigations, management, and post-operative complications of thyroid surgery.",
                    years = listOf("2025 P1", "2020 P2", "2018 P2", "2016 P2", "2015 P2", "2012 P2"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "1 + 4 + 5 + 5 = 15 Marks",
                    textbookRef = "SRB (7th Ed)",
                    pageNumbers = "502, 517, 519, 533",
                    highYieldPoints = listOf(
                        "Diagnosis: Non-toxic Multinodular Goitre (Colloid Goitre / MNG).",
                        "Investigations: 1. Thyroid function tests (Serum T3, T4, TSH - normal in non-toxic MNG); 2. High-resolution Ultrasound neck with TIRADS grading; 3. FNAC of suspicious/dominant nodules (Bethesda classification); 4. X-ray neck / thoracic inlet (checks tracheal compression / Kocher's scabbard trachea or retrosternal extension); 5. Indirect laryngoscopy (pre-op vocal cord mobility documentation).",
                        "Management: Total Thyroidectomy is the standard modern procedure of choice (eliminates recurrence risk and occult malignancy ~10-15%); lifelong postoperative L-Thyroxine (100-150 mcg daily).",
                        "Post-operative Complications: Immediate: 1. Tension hematoma under deep cervical fascia compressing trachea (emergency bedside clip removal and opening wound); 2. Recurrent Laryngeal Nerve (RLN) injury (unilateral -> hoarseness and bovine cough; bilateral -> emergency tracheostomy for adducted vocal cords and stridor); 3. Hypocalcemia / Tetany (inadvertent removal or devascularization of parathyroid glands, Chvostek's & Trousseau's signs positive, IV Calcium gluconate stat); 4. Thyroid storm; 5. Hypothyroidism."
                    ),
                    referenceLinks = listOf(ReferenceLink("ATA Management Guidelines for Thyroid Nodules", "https://www.thyroid.org/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "surg_breast_ca_1",
                    subjectId = "surgery",
                    topicId = "surg_head_neck_endocrine",
                    topicName = "Breast Carcinoma",
                    text = "A 40-year-old female presented with 2x3cm SOL in upper outer quadrant of right breast, free from skin and underlying structures, single mobile palpable level 1 axillary node. CXR and USG normal. i) TNM classification; ii) What is triple assessment? iii) Treatment options of early breast carcinoma.",
                    years = listOf("2024", "2021 P1", "2018 P2", "2016 P1", "2013 P2", "2011 P2"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 6 + 6 = 15 Marks",
                    textbookRef = "SRB (7th Ed)",
                    pageNumbers = "585, 591, 601",
                    highYieldPoints = listOf(
                        "TNM Staging: T2 (tumor >2 cm but <=5 cm), N1 (metastasis to movable ipsilateral level I/II axillary lymph nodes), M0 (no distant metastasis) -> Stage IIB (T2N1M0), which is Early Breast Cancer (EBC).",
                        "Triple Assessment (Accuracy >99% when all 3 concordant): 1. Clinical Examination (bilateral breasts, axillae, supraclavicular fossae); 2. Imaging (Bilateral digital mammography showing microcalcifications or architectural distortion; USG breast in younger women <40 with dense breasts); 3. Pathological Evaluation (Core Needle Biopsy preferred over FNAC because it provides histology, ER/PR and HER2/neu receptor status, and distinguishes in situ from invasive ductal carcinoma).",
                        "Surgical Treatment Options for Early Breast Cancer: 1. Breast Conserving Surgery (BCS / Wide local excision / Lumpectomy with 1 cm clear surgical margins) followed by MANDATORY whole breast radiotherapy; 2. Modified Radical Mastectomy (MRM - Patey or Auchincloss technique) removing entire breast tissue, nipple-areola complex, and axillary lymph nodes levels I & II while preserving pectoralis major; Axillary staging via Sentinel Lymph Node Biopsy (SLNB) using radiocolloid and patent blue dye."
                    ),
                    referenceLinks = listOf(ReferenceLink("NCCN Guidelines for Breast Cancer", "https://www.nccn.org/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "surg_gi_hepatobiliary_urology",
            subjectId = "surgery",
            name = "GI, Hepatobiliary, Hernia, Urology & Neurosurgery",
            description = "Obstructive jaundice, acute pancreatitis, gastric cancer, strangulated hernia, intestinal obstruction, appendicitis, RCC, BPH, extradural hematoma, and tension pneumothorax.",
            textbookChapter = "Chapters 26-55: Abdomen, Hernia, Urology, Neurosurgery & Thorax",
            standardPages = "pp. 640-1200",
            questions = listOf(
                Question(
                    id = "surg_jaundice_1",
                    subjectId = "surgery",
                    topicId = "surg_gi_hepatobiliary_urology",
                    topicName = "Hepatobiliary & Pancreas",
                    text = "A 54-year-old gentleman presents with dull epigastric pain, progressive yellow discoloration of eyes and urine for 4 months, anorexia and weight loss. On examination, gall bladder is palpable as soft cystic swelling. Work-up, Courvoisier law, preoperative preparation, and treatment outline.",
                    years = listOf("2025 P1", "2019 P1", "2017 P1", "2015 P1", "2012 P1", "2010 P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "5 + 5 + 5 = 15 Marks",
                    textbookRef = "SRB (7th Ed)",
                    pageNumbers = "707, 708, 763",
                    highYieldPoints = listOf(
                        "Diagnosis: Malignant Obstructive Jaundice (Carcinoma head of pancreas or periampullary carcinoma) obeying Courvoisier's Law.",
                        "Courvoisier's Law: In a patient with obstructive jaundice, if the gallbladder is palpable, the cause is unlikely to be a gallstone because the gallbladder is usually fibrosed and shrunken from chronic cholecystitis; the jaundice is most likely due to malignant obstruction of the common bile duct (e.g. Ca head of pancreas, periampullary Ca, cholangiocarcinoma).",
                        "Work-up: Triple-phase contrast-enhanced CT (CECT) of abdomen (pancreatic protocol); MRCP to visualize ductal anatomy; Serum CA 19-9; LFTs (elevated conjugated bilirubin and alkaline phosphatase >3x normal).",
                        "Pre-operative Preparation of Jaundiced Patient: 1. Correct coagulopathy (Parenteral Vitamin K 10 mg daily for 3-5 days; fresh frozen plasma if PT/INR prolonged); 2. Prevent Hepatorenal Syndrome (vigorous IV hydration, maintain urine output >1 mL/kg/hr); 3. Prophylactic broad-spectrum IV antibiotics covering enterococci and gram-negative bacilli (Pip-Taz); 4. Preoperative biliary drainage (ERCP stenting) only if severe cholangitis or intractable pruritus.",
                        "Definitive Surgery: Pancreaticoduodenectomy (Whipple's procedure / pylorus-preserving PPPD) for resectable cases; Palliative hepaticojejunostomy + gastrojejunostomy (double bypass) or endoscopic metallic biliary stenting for unresectable cases."
                    ),
                    referenceLinks = listOf(ReferenceLink("International Study Group of Pancreatic Surgery", "https://isgps.org/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "surg_hernia_sbo_1",
                    subjectId = "surgery",
                    topicId = "surg_gi_hepatobiliary_urology",
                    topicName = "Hernia & Intestinal Obstruction",
                    text = "A 58-year-old male presented with long existing right inguinal scrotal swelling which became irreducible for 12 hours with vomiting, abdominal distension and features of shock. Diagnosis, signs of strangulation, and emergency management.",
                    years = listOf("2025 P1", "2023 P1", "2017 P1", "2016 P1", "2012 S P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "15 Marks",
                    textbookRef = "SRB (7th Ed)",
                    pageNumbers = "813, 819, 981, 985",
                    highYieldPoints = listOf(
                        "Diagnosis: Strangulated Right Inguinoscrotal Hernia with Acute Mechanical Small Bowel Obstruction.",
                        "Signs of Strangulation: 1. Constant severe pain replacing intermittent colicky pain; 2. Localized extreme tenderness, erythema, edema, and warmth over the hernia sac; 3. Tense, completely irreducible mass with absent impulse on coughing; 4. Systemic toxicity (fever, tachycardia, tachypnea, hypotension, leukocytosis with left shift, elevated serum lactate).",
                        "Golden Rule: NEVER ATTEMPT TAXIS (FORCEFUL MANUAL REDUCTION) IN A STRANGULATED HERNIA, as this risks reduction-en-masse or rupturing gangrenous bowel into the peritoneal cavity!",
                        "Emergency Management: 1. Aggressive IV fluid resuscitation with Ringer's lactate; 2. Ryle's tube nasogastric aspiration and Foley catheter insertion; 3. Broad-spectrum IV antibiotics (Ceftriaxone + Metronidazole); 4. Emergency exploration via inguinal incision opening the sac with extreme care -> inspect fluid (blood-stained/foul) -> release constriction ring at internal ring -> assess viability of bowel loop (color pink, peristalsis present, mesenteric arterial pulsations felt).",
                        "If bowel is viable: Reduce into abdomen and perform herniotomy + Lichtenstein tension-free mesh hernioplasty (or Darn repair if infected). If gangrenous: Resection of non-viable bowel segment and end-to-end small bowel anastomosis, herniotomy, and anatomical tissue repair (mesh is strictly avoided in gangrene due to high infection risk)."
                    ),
                    referenceLinks = listOf(ReferenceLink("World Journal of Emergency Surgery Hernia Guidelines", "https://wjes.biomedcentral.com/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "surg_urology_rcc_bph",
                    subjectId = "surgery",
                    topicId = "surg_gi_hepatobiliary_urology",
                    topicName = "Urology",
                    text = "A 60-year-old gentleman has come to surgery OPD with complain of painless haematuria for 2 weeks. i) Five causes of painless haematuria; ii) Investigations to confirm; iii) Management of Renal Cell Carcinoma (RCC) affecting lower pole of right kidney. Discuss BPH management.",
                    years = listOf("2025 P2", "2024", "2021 P2", "2020 P2", "2018 P2", "2017 P2", "2014 P2"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "5 + 4 + 6 = 15 Marks",
                    textbookRef = "SRB (7th Ed)",
                    pageNumbers = "1086, 1104-1107",
                    highYieldPoints = listOf(
                        "Painless Hematuria Causes: 1. Bladder transitional cell carcinoma (most common >50 years); 2. Renal cell carcinoma (hypernephroma / Grawitz tumour); 3. Benign prostatic hyperplasia (vascular friability); 4. Carcinoma prostate; 5. Adult polycystic kidney disease (ADPKD); 6. Glomerulonephritis.",
                        "Investigations: Urine analysis and cytology, Renal function tests, USG KUB, Contrast CECT KUB (gold standard for RCC staging), Rigid/flexible cystoscopy (identifies bleeding origin).",
                        "RCC Clinical Triad (Too Late Triad <10%): Hematuria, flank pain, and palpable abdominal mass. Paraneoplastic syndromes: Hypercalcemia (PTHrP), erythrocytosis, hypertension (renin), Stauffer syndrome (reversible hepatic dysfunction).",
                        "Management of Lower Pole RCC: 1. Partial Nephrectomy (Nephron-sparing surgery) if tumor <=4 cm (T1a) or up to 7 cm (T1b), preserving surrounding normal parenchyma; 2. Radical Nephrectomy (Robson technique: removal of kidney, perinephric Gerota's fascia, perirenal fat, and ipsilateral adrenal gland) if central, invasive, or large; Note: RCC is resistant to conventional chemotherapy and radiotherapy; metastatic disease treated with Targeted Tyrosine Kinase Inhibitors (Sunitinib, Pazopanib) and Immunotherapy (Nivolumab + Ipilimumab).",
                        "BPH Management: Medical: Alpha-1 blockers (Tamsulosin 0.4 mg - relaxes bladder neck) + 5-alpha reductase inhibitors (Finasteride/Dutasteride - shrinks prostate volume); Surgical gold standard: Transurethral Resection of Prostate (TURP) or HoLEP/ThuLEP."
                    ),
                    referenceLinks = listOf(ReferenceLink("EAU Guidelines on Renal Cell Carcinoma", "https://uroweb.org/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "surg_neuro_edh_gcs",
                    subjectId = "surgery",
                    topicId = "surg_gi_hepatobiliary_urology",
                    topicName = "Neurosurgery & Thorax",
                    text = "A 60-year-old male ER head injury: Glasgow Coma Scale (GCS), features of raised ICP, etiopathology of acute Extradural Hematoma (EDH) and lucid interval. What is tension pneumothorax and its emergency management?",
                    years = listOf("2025 P2", "2024", "2023 P2", "2021 P2", "2018 S P2", "2015 P2"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "15 Marks",
                    textbookRef = "SRB (7th Ed)",
                    pageNumbers = "1152, 1153, 1155-1156, 1160, 1175",
                    highYieldPoints = listOf(
                        "Glasgow Coma Scale (GCS): Minimum score is 3 (NEVER zero!), Maximum 15: Eye Opening (E1-4), Verbal Response (V1-5), Motor Response (M1-6); Severe head injury: GCS <=8 (requires intubation).",
                        "Cushing's Triad of Raised ICP: Hypertension (widened pulse pressure), Bradycardia, and Irregular/depressed respiration.",
                        "Extradural Hematoma (EDH): Arterial hemorrhage into extradural space between skull bone and endosteal layer of dura, classically caused by temporoparietal fracture tearing the Middle Meningeal Artery / vein at the pterion.",
                        "Lucid Interval: Temporary period of normal consciousness between initial post-traumatic concussion and subsequent secondary deterioration/coma caused by progressive hematoma expansion and brain herniation.",
                        "NCCT Brain in EDH: Pathognomonic BICONVEX / LENTICULAR hyperdense biconvex shadow bounded by cranial sutures (dura adheres tightly at sutures); Treatment: Emergency craniotomy and hematoma evacuation.",
                        "Tension Pneumothorax: One-way valve air leak into pleural space -> positive pleural pressure -> complete lung collapse, mediastinal shift to opposite side, compression of SVC/IVC -> decreased venous return and cardiac arrest; Clinical signs: Respiratory distress, absent breath sounds on affected side, hyper-resonance, tracheal deviation to opposite side, distended neck veins, severe hypotension.",
                        "Emergency Decompression: Immediate Needle Decompression with large bore cannula (14-16G) in 2nd intercostal space midclavicular line (or 5th ICS anterior axillary line), followed immediately by formal Intercostal Tube Thoracostomy (28-32 Fr chest tube connected to underwater seal)."
                    ),
                    referenceLinks = listOf(ReferenceLink("ATLS Guidelines for Head & Thoracic Trauma", "https://www.facs.org/", "Guideline")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "surg_appendicitis_alvarado",
                    subjectId = "surgery",
                    topicId = "surg_gi_hepatobiliary_urology",
                    topicName = "Acute Abdomen & Appendix",
                    text = "A 21-year-old medical student presents with periumbilical pain shifting to the right iliac fossa, anorexia, nausea, and low-grade fever. i) Calculate and interpret the Alvarado (MANTRELS) score; ii) Physical examination signs (Rovsing, Psoas, Obturator, Dunphy); iii) Management of an Appendicular Mass (Ochsner-Sherren regimen); iv) Open vs Laparoscopic Appendicectomy.",
                    years = listOf("2025 P1", "2023 P1", "2021 P1", "2019 P1", "2016 P1", "2013 P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 3 + 5 + 4 = 15 Marks",
                    textbookRef = "SRB (7th Ed)",
                    pageNumbers = "945-962",
                    highYieldPoints = listOf(
                        "Diagnosis: Acute Appendicitis.",
                        "Alvarado (MANTRELS) Score (Total = 10):",
                        "- M (Migration of pain to RIF): 1",
                        "- A (Anorexia): 1",
                        "- N (Nausea / Vomiting): 1",
                        "- T (Tenderness in RIF / McBurney's point): 2 (Double weighted)",
                        "- R (Rebound tenderness in RIF / Blumberg sign): 1",
                        "- E (Elevation of temperature >= 37.3 C): 1",
                        "- L (Leukocytosis > 10,000/uL): 2 (Double weighted)",
                        "- S (Shift of neutrophils to left > 75%): 1",
                        "Interpretation: Score 5-6: Compatible with acute appendicitis (observe/USG); Score 7-8: Probable acute appendicitis (surgical exploration indicated); Score 9-10: Highly probable acute appendicitis.",
                        "Physical Examination Signs:",
                        "1. Rovsing's Sign: Palpation of left iliac fossa elicits pain in the right iliac fossa (due to retrograde displacement of colonic gas stretching the inflamed cecum/appendix).",
                        "2. Psoas Sign: Pain on passive hyperextension of right hip with patient in left lateral position (indicates retrocecal appendicitis irritating the iliopsoas muscle).",
                        "3. Obturator Sign: Pain on passive internal rotation of flexed right hip (indicates pelvic appendicitis irritating the obturator internus muscle).",
                        "4. Dunphy's Sign: Increased RIF pain provoked by coughing.",
                        "Management of Appendicular Mass (Ochsner-Sherren Conservative Regimen):",
                        "- Occurs when inflamed appendix is walled off by greater omentum and loops of small bowel (Day 3-5).",
                        "- Strict Inpatient Monitoring: Mark mass boundary on abdomen skin with indelible ink; NPO with IV fluids initially -> clear liquids; Broad-spectrum IV antibiotics (Ceftriaxone + Metronidazole); Strict vitals chart (temperature, pulse every 4 hours), repeat abdominal exam for mass size.",
                        "- Failure of Regimen (indications for emergency surgery): Rising pulse rate, spreading peritonitis, increasing size of mass, spiking fever, or leukocytosis.",
                        "- If mass successfully resolves: Interval Appendicectomy performed electively after 6 to 12 weeks.",
                        "Laparoscopic Appendicectomy: Advantages include reduced surgical site infections, less postoperative pain, shorter hospital stay, faster return to work, and excellent visualization of the entire peritoneal cavity (ruling out Meckel's diverticulitis, ovarian pathology, or mesenteric adenitis)."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("WSES Jerusalem Guidelines for Diagnosis and Treatment of Acute Appendicitis", "https://wjes.biomedcentral.com/", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "surg_pancreatitis_atlanta",
                    subjectId = "surgery",
                    topicId = "surg_gi_hepatobiliary_urology",
                    topicName = "Pancreatic Diseases",
                    text = "A 45-year-old chronic alcoholic male presents with agonizing epigastric pain radiating to the back and persistent vomiting. i) Diagnostic criteria for Acute Pancreatitis; ii) Revised Atlanta Classification (mild, moderately severe, severe); iii) Early prognostic scoring systems (Ranson vs BISAP); iv) The Step-Up surgical approach for infected necrotizing pancreatitis.",
                    years = listOf("2024", "2022 P1", "2020 P1", "2018 P1", "2015 P1", "2011 P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 3 + 4 + 5 = 15 Marks",
                    textbookRef = "SRB (7th Ed)",
                    pageNumbers = "735-752",
                    highYieldPoints = listOf(
                        "Diagnosis of Acute Pancreatitis (Requires 2 out of 3):",
                        "1. Characteristic abdominal pain: Sudden-onset, severe, persistent epigastric pain radiating straight to the back, partially relieved by leaning forward.",
                        "2. Serum Amylase or Lipase >= 3 times the upper limit of normal (Serum Lipase is more sensitive and specific, remaining elevated for 8-14 days).",
                        "3. Characteristic imaging findings on Contrast-Enhanced CT (CECT) or MRI.",
                        "Revised Atlanta Classification (2012):",
                        "- Mild Acute Pancreatitis: Absence of organ failure and absence of local or systemic complications.",
                        "- Moderately Severe: Transient organ failure (< 48 hours) and/or local complications (acute peripancreatic fluid collection, acute necrotic collection).",
                        "- Severe Acute Pancreatitis: Persistent organ failure (> 48 hours) involving single or multiple organs (respiratory PaO2/FiO2 <= 300, renal creatinine >= 1.9 mg/dL, cardiovascular SBP < 90 mmHg despite fluid resuscitation).",
                        "BISAP Score (Bedside Index for Severity in Acute Pancreatitis - assessed in first 24 hours):",
                        "- B (BUN > 25 mg/dL)",
                        "- I (Impaired mental status / GCS < 15)",
                        "- S (SIRS >= 2 criteria present)",
                        "- A (Age > 60 years)",
                        "- P (Pleural effusion present on imaging)",
                        "Step-Up Approach for Infected Necrotizing Pancreatitis (PANTER Trial protocol):",
                        "- Golden Rule: Delay interventions for necrotizing pancreatitis for >= 4 weeks until acute necrotic collection becomes encapsulated and demarcated (Walled-Off Pancreatic Necrosis - WOPN).",
                        "- Step 1: Broad-spectrum IV antibiotics (Carbapenem - Meropenem/Imipenem) with excellent pancreatic penetration.",
                        "- Step 2: Percutaneous Catheter Drainage (PCD) or Endoscopic Transluminal Transgastric Drainage: Successfully resolves infection in 35-50% of patients without surgery.",
                        "- Step 3: Video-Assisted Retroperitoneal Debridement (VARD) or Minimally Invasive Necrosectomy through the existing sinus tract if patient fails to improve after 72 hours of drainage.",
                        "- Step 4: Open surgical necrosectomy reserved only as the final salvage option."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("IAP/APA Evidence-Based Guidelines for the Management of Acute Pancreatitis", "https://www.pancreas.org/", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                )
            )
        )
    )
}
