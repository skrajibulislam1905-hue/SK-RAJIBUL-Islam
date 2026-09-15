package com.example.data.repository

import com.example.data.model.*

object MedicinePart2QuestionsDataProvider {

    fun getPart2Topics(): List<Topic> = listOf(
        Topic(
            id = "med_endocrine_diabetology",
            subjectId = "medicine",
            name = "Endocrinology, Diabetology & Acid-Base",
            description = "Subclinical hypothyroidism, thyrotoxicosis & Graves', myxoedema coma, Diabetic Ketoacidosis (DKA), Hyperosmolar Hyperglycemic State (HHS), and hypoglycemia.",
            textbookChapter = "Chapters 8 & 9: Endocrinology & Diabetology",
            standardPages = "pp. 941-1050",
            questions = listOf(
                Question(
                    id = "med_dka_1",
                    subjectId = "medicine",
                    topicId = "med_endocrine_diabetology",
                    topicName = "Diabetic Ketoacidosis & Emergencies",
                    text = "A 16-year-old boy presents with fever, cough for 7 days, deep rapid breathing (Kussmaul), abdominal pain, vomiting, polyuria and dehydration. Diagnosis, clinical differentiation between DKA and HHS, and comprehensive management protocol.",
                    years = listOf("2025", "2023 P2", "2021 P1", "2018 P2", "2016 P1", "2015 P2", "2013 P1", "2012 P2", "2010 P2"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 7 = 10 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "968, 969-970, 972",
                    highYieldPoints = listOf(
                        "Diagnosis: Diabetic Ketoacidosis (DKA) precipitated by infection (pneumonia).",
                        "Diagnostic Triad of DKA: 1. Hyperglycemia (blood glucose >250 mg/dL); 2. Metabolic acidosis (arterial pH <7.30, serum bicarbonate <18 mEq/L, high anion gap >12 mEq/L); 3. Ketonemia / Ketonuria (positive serum beta-hydroxybutyrate >3 mmol/L or urine ketones).",
                        "DKA vs HHS: DKA occurs in younger Type 1 DM, rapid onset (<24h), severe ketoacidosis (pH <7.3), prominent Kussmaul breathing with fruity acetone breath, moderate glucose (250-600 mg/dL); HHS occurs in elderly Type 2 DM, insidious onset (days/weeks), marked dehydration, extreme hyperglycemia (>600-1000 mg/dL), serum effective osmolality >320 mOsm/kg, absence of significant ketoacidosis (pH >7.30, bicarb >18), and profound neurological impairment/coma.",
                        "DKA Management Protocol (Four Pillars): 1. Fluid Resuscitation: Normal Saline (0.9% NaCl) 1-1.5 L in 1st hour, followed by 500 mL/hr; Switch to 5% Dextrose in 0.45% Saline when glucose drops <200-250 mg/dL to prevent hypoglycemia and cerebral edema.",
                        "2. Insulin Therapy: Low-dose regular insulin IV infusion at 0.1 units/kg/hour (aim for steady blood glucose drop of 50-75 mg/dL/hour); NEVER give insulin bolus if serum K+ < 3.3 mEq/L!",
                        "3. Potassium Replacement: Add 20-30 mEq K+ per liter of IV fluid once urine output confirmed and serum K+ between 3.5 - 5.0 mEq/L to prevent fatal hypokalemic cardiac arrhythmias.",
                        "4. Resolution Criteria: Blood glucose <200 mg/dL, serum bicarbonate >=18 mEq/L, venous pH >7.30, and normalized anion gap."
                    ),
                    referenceLinks = listOf(ReferenceLink("ADA Standards of Care in Diabetes", "https://diabetesjournals.org/care", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "med_thyroid_1",
                    subjectId = "medicine",
                    topicId = "med_endocrine_diabetology",
                    topicName = "Thyroid Disorders",
                    text = "What is subclinical hypothyroidism and when should it be treated? Describe causes and clinical features of thyrotoxicosis and management of myxoedema coma and thyroid storm.",
                    years = listOf("2025", "2024", "2023", "2018 P2", "2017 P2", "2016 P2", "2014 P2"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 4 + 3 = 10 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "1003, 1008, 1009, 1011, 1015, 1017",
                    highYieldPoints = listOf(
                        "Subclinical Hypothyroidism: Elevated serum TSH (>4.5-5.0 mIU/L) with normal free T3 and free T4 levels.",
                        "Indications to Treat Subclinical Hypothyroidism: 1. Serum TSH >= 10 mIU/L; 2. Pregnancy or planning pregnancy (target TSH <2.5 mIU/L to prevent neurocognitive fetal impairment); 3. Presence of anti-TPO antibodies (high risk of progression to overt hypothyroidism); 4. Symptomatic patients with goitre, dyslipidemia, or ovulatory dysfunction.",
                        "Myxoedema Coma (Medical Emergency): Severe hypothermia (<35 deg C), altered mental status/coma, bradycardia, hypoventilation, hyponatremia; Management: ICU admission, passive rewarming (never active external rewarming to avoid vasodilatory shock), IV Levothyroxine (loading dose 200-400 mcg IV) + IV Hydrocortisone (100 mg IV Q8H given BEFORE thyroxine to prevent precipitating adrenal crisis), mechanical ventilation.",
                        "Thyroid Storm Management: 1. Propylthiouracil (PTU 200 mg Q4H - blocks hormone synthesis AND peripheral T4->T3 conversion); 2. Potassium Iodide / Lugol's iodine (given 1 hour AFTER antithyroid drug to prevent Jod-Basedow phenomenon and Wolff-Chaikoff effect); 3. Beta-blocker (Propranolol 60-80 mg Q6H); 4. IV Dexamethasone 2 mg Q6H; 5. Aggressive cooling and supportive care."
                    ),
                    referenceLinks = listOf(ReferenceLink("ATA Guidelines on Hypothyroidism & Hyperthyroidism", "https://www.thyroid.org/", "Guideline")),
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "med_gastro_hepatology",
            subjectId = "medicine",
            name = "Gastroenterology, Hepatology & GI Bleed",
            description = "Ulcerative colitis, chronic diarrhea, acute upper GI bleed & variceal hemorrhage, acute viral hepatitis, cirrhosis, portal hypertension, ascites & SAAG, and hepatic encephalopathy.",
            textbookChapter = "Chapters 4 & 5: Gastrointestinal & Liver",
            standardPages = "pp. 490-640",
            questions = listOf(
                Question(
                    id = "med_uc_1",
                    subjectId = "medicine",
                    topicId = "med_gastro_hepatology",
                    topicName = "Inflammatory Bowel Disease",
                    text = "Describe clinical features, extra-intestinal manifestations, and laboratory workup of ulcerative colitis. Mention complications (toxic megacolon, carcinoma colon) and management protocol.",
                    years = listOf("2025", "2023", "2020 P1", "2019 P1", "2018 S P1", "2014 S P1", "2011 P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "7 + 3 = 10 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "500, 535, 536, 539, 543",
                    highYieldPoints = listOf(
                        "Clinical Features: Relapsing and remitting bloody diarrhea with mucous, tenesmus, crampy lower abdominal pain relieved by defecation, weight loss, fever in severe flares (Truelove and Witts criteria).",
                        "Endoscopic / Histopathological Findings: Continuous, symmetrical inflammation starting from rectum (proctitis) and extending proximally into colon, superficial mucosal ulcerations (lead pipe colon on barium enema due to loss of haustrations), crypt abscesses, crypt architectural distortion, and pseudopolyps.",
                        "Extra-Intestinal Manifestations: Musculoskeletal (enteropathic peripheral arthritis, sacroiliitis, ankylosing spondylitis HLA-B27); Cutaneous (erythema nodosum, pyoderma gangrenosum); Ocular (anterior uveitis, episcleritis); Hepatobiliary (Primary Sclerosing Cholangitis - PSC, high p-ANCA).",
                        "Complications: Toxic Megacolon (transverse colon diameter >6 cm with systemic toxicity, risk of perforation), massive lower GI hemorrhage, colorectal adenocarcinoma (screening colonoscopy every 1-2 years after 8 years of pancolitis).",
                        "Management: Mild-to-Moderate: Oral and topical 5-Aminosalicylic acid (Mesalamine / Sulfasalazine 2-4 g daily); Severe acute flare: IV Hydrocortisone (100 mg Q6H) or IV Methylprednisolone; Biologics (Infliximab, Adalimumab, Vedolizumab); Surgical cure: Restorative Proctocolectomy with Ileal Pouch-Anal Anastomosis (IPAA)."
                    ),
                    referenceLinks = listOf(ReferenceLink("ECCO Guidelines on Ulcerative Colitis", "https://www.ecco-ibd.eu/", "Guideline")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "med_cirrhosis_bleed_1",
                    subjectId = "medicine",
                    topicId = "med_gastro_hepatology",
                    topicName = "Hepatology & Portal Hypertension",
                    text = "A 55-year-old male with past history of jaundice presents with abdominal distension, hematemesis, and altered mental status. Diagnosis, SAAG calculation, management of bleeding esophageal varices, and hepatic encephalopathy.",
                    years = listOf("2024", "2023", "2021 P1", "2020 P1", "2019 P1", "2018 P1", "2016 P1", "2014 P1", "2012 P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "15 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "583, 588, 595, 596, 599-603, 607, 610, 612",
                    highYieldPoints = listOf(
                        "Diagnosis: Decompensated Liver Cirrhosis with Portal Hypertension, bleeding Esophageal Varices, and Grade 2-3 Hepatic Encephalopathy.",
                        "Serum Ascites Albumin Gradient (SAAG = Serum Albumin - Ascitic Fluid Albumin): High SAAG (>=1.1 g/dL) indicates Portal Hypertension (Cirrhosis, cardiac ascites, Budd-Chiari); Low SAAG (<1.1 g/dL) indicates Peritoneal Carcinomatosis, Peritoneal Tuberculosis, Pancreatic ascites, or Nephrotic syndrome.",
                        "Emergency Management of Bleeding Varices: 1. Hemodynamic resuscitation with restrictive transfusion strategy (target Hb 7-8 g/dL to avoid rebound portal pressure surge); 2. Vasoactive drug infusion (IV Terlipressin 2 mg IV bolus then 1-2 mg Q4H or Octreotide 50 mcg bolus + 50 mcg/hr infusion for 3-5 days); 3. Prophylactic antibiotic (IV Ceftriaxone 1 g daily for 7 days to prevent SBP and septicemia); 4. Urgent Upper GI Endoscopy within 12 hours -> Endoscopic Variceal Ligation (EVL / rubber band ligation); 5. If refractory: Balloon tamponade (Sengstaken-Blakemore tube / Minnesota tube) as a temporary bridge to Transjugular Intrahepatic Portosystemic Shunt (TIPS).",
                        "Hepatic Encephalopathy Protocol: 1. Identify and treat precipitating triggers (GI bleed, constipation, infection/SBP, hypokalemic alkalosis, sedatives, azotemia); 2. Non-absorbable disaccharide: Lactulose (titrated to achieve 2-3 soft acidic bowel movements daily, converts NH3 to non-absorbable NH4+); 3. Non-absorbable antibiotic: Rifaximin (550 mg BD - suppresses urease-producing gut flora, gold standard for preventing recurrence); 4. L-Ornithine L-Aspartate (LOLA) infusion to promote ammonia detoxification."
                    ),
                    referenceLinks = listOf(ReferenceLink("AASLD Portal Hypertension Guidelines", "https://www.aasld.org/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "med_haem_rheumatology_neuro",
            subjectId = "medicine",
            name = "Haematology, Rheumatology, Neurology & Nephrology",
            description = "Hemolytic anemia, acute leukemias, lymphoma, ITP, rheumatoid arthritis, SLE, Guillain-Barré Syndrome (GBS), stroke, meningitis, PSGN, and acute kidney injury.",
            textbookChapter = "Chapters 6, 7, 10 & 11: Hematology, Rheumatology, Neurology & Nephrology",
            standardPages = "pp. 650-940, 1115-1230",
            questions = listOf(
                Question(
                    id = "med_gbs_neuro_1",
                    subjectId = "medicine",
                    topicId = "med_haem_rheumatology_neuro",
                    topicName = "Neurology",
                    text = "An 18-year-old boy was brought with sudden onset of gradually progressive weakness of both lower limbs for last 20 days with areflexia, without bladder/bowel symptoms or sensory level. Diagnosis, CSF findings (albuminocytological dissociation), monitoring, and treatment.",
                    years = listOf("2025", "2024", "2021 P2", "2019 P2", "2016 P2", "2015 P2", "2011", "2010 P2"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "5 + 5 + 5 = 15 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "1135, 1144, 1168, 1194-1196",
                    highYieldPoints = listOf(
                        "Diagnosis: Guillain-Barré Syndrome (GBS) / Acute Inflammatory Demyelinating Polyradiculoneuropathy (AIDP), typically preceded by Campylobacter jejuni gastroenteritis or viral respiratory infection 1-3 weeks prior.",
                        "Hallmark Clinical Triad: Symmetrical ascending flaccid motor quadriparesis, generalized areflexia (absent deep tendon reflexes), and minimal objective sensory loss (stocking-glove paresthesias).",
                        "Lumbar Puncture / CSF Analysis: Classic Albuminocytological Dissociation (markedly elevated CSF protein >100-200 mg/dL with normal WBC count <10 cells/mm3, typically peaking in 2nd to 3rd week).",
                        "Monitoring in ICU: Hourly assessment of respiratory function: Forced Vital Capacity (FVC, intubate if <15-20 mL/kg), Single Breath Count (<20), Maximum Inspiratory/Expiratory Pressures (MIP/MEP), arterial blood gases, and continuous cardiac monitoring for autonomic instability (labile blood pressure, tachycardia, arrhythmias).",
                        "Disease-Modifying Immunotherapy: 1. IV Immunoglobulin (IVIg 0.4 g/kg/day IV for 5 consecutive days, total dose 2 g/kg); OR 2. Therapeutic Plasma Exchange (Plasmapheresis, 4-5 sessions over 1-2 weeks); Both are equally efficacious; SYSTEMIC CORTICOSTEROIDS ARE INEFFECTIVE AND NOT RECOMMENDED."
                    ),
                    referenceLinks = listOf(ReferenceLink("AAN Guidelines for Guillain-Barré Syndrome", "https://www.aan.com/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "med_haem_leukaemia_1",
                    subjectId = "medicine",
                    topicId = "med_haem_rheumatology_neuro",
                    topicName = "Haematology & Oncology",
                    text = "A 20-year-old lady attends medical OPD with fever for 7 days, gum bleeding, severe pallor, and purpuric spots. Diagnosis, peripheral blood smear, bone marrow examination, and management of acute leukemia (AML/ALL).",
                    years = listOf("2025", "2024", "2021 P1", "2020 P1", "2017 P2", "2016 P2", "2012 P2", "2010 P2"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 4 + 4 = 10 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "725, 745, 769, 773, 777",
                    highYieldPoints = listOf(
                        "Diagnosis: Acute Myeloid Leukemia (AML) or Acute Lymphoblastic Leukemia (ALL) presenting with bone marrow failure (anaemia, neutropenic fever, thrombocytopenic purpura and mucosal gum bleeding).",
                        "Peripheral Blood & Bone Marrow: Hypercellular bone marrow with >=20% blasts (WHO diagnostic criterion for acute leukemia); AML blasts contain Auer rods (fused azurophilic granules, pathognomonic), positive for myeloperoxidase (MPO) and Sudan Black B; Flow cytometry shows CD13, CD33, CD117 positive; Acute Promyelocytic Leukemia (APML / AML M3) has t(15;17) PML-RARA fusion with high risk of fatal DIC.",
                        "Management of AML: 1. Induction Chemotherapy: '7+3 Regimen' (Cytarabine 100-200 mg/m2 continuous IV for 7 days + Daunorubicin 45-60 mg/m2 IV for 3 days); 2. APML M3: All-Trans Retinoic Acid (ATRA) + Arsenic Trioxide (ATO) cures >90% without conventional chemotherapy; 3. Consolidation chemotherapy and Allogeneic Hematopoietic Stem Cell Transplantation (HSCT) for intermediate/high-risk cytogenetics; 4. Supportive care: Platelet transfusions, irradiated packed RBCs, Rasburicase/Allopurinol and aggressive IV hydration to prevent Tumour Lysis Syndrome."
                    ),
                    referenceLinks = listOf(ReferenceLink("NCCN Guidelines for Acute Myeloid Leukemia", "https://www.nccn.org/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "med_rheum_ra_sle_1",
                    subjectId = "medicine",
                    topicId = "med_haem_rheumatology_neuro",
                    topicName = "Rheumatology & Autoimmune Disorders",
                    text = "A 35-year-old female presents with weakness and multiple joint pain with prolonged morning stiffness (>1 hour). ACR/EULAR criteria, serological markers (Anti-CCP, RF), DMARD therapy, and SLE differentiation.",
                    years = listOf("2025", "2023", "2021 P1", "2019 P1", "2017 P1", "2015 P1", "2012 P1", "2010 P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 3 + 5 = 10 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "659, 665, 670, 675, 676, 684",
                    highYieldPoints = listOf(
                        "Diagnosis: Rheumatoid Arthritis (RA) - chronic symmetrical inflammatory erosive polyarthritis affecting small joints of hands and feet (MCP, PIP, wrist; classically sparing DIP joints).",
                        "2010 ACR/EULAR Classification Criteria (Score >=6/10 establishes RA): 1. Joint involvement (up to 5 points); 2. Serology: Rheumatoid Factor (RF) and Anti-Cyclic Citrullinated Peptide (Anti-CCP antibodies - 96% specific, best prognostic indicator for erosive disease, 3 points); 3. Acute-phase reactants: Elevated ESR or CRP (1 point); 4. Duration of symptoms >=6 weeks (1 point).",
                        "Hand Deformities in Advanced RA: Ulnar deviation of fingers at MCP joints, Swan neck deformity (flexion of DIP, hyperextension of PIP), Boutonniere deformity (hyperextension of DIP, flexion of PIP), Z-deformity of thumb, rheumatoid nodules over extensor surfaces.",
                        "Management with DMARDs: Methotrexate (anchor drug, 15-25 mg once weekly orally/subcutaneously with Folic acid 5 mg weekly); Add conventional synthetic DMARDs (Hydroxychloroquine 200-400 mg, Sulfasalazine 2-3 g, Leflunomide); Biologic DMARDs (Anti-TNF agents: Adalimumab, Etanercept; IL-6 inhibitor: Tocilizumab) if inadequate response; Bridging low-dose oral Prednisolone."
                    ),
                    referenceLinks = listOf(ReferenceLink("ACR/EULAR Guidelines for Rheumatoid Arthritis", "https://www.rheumatology.org/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "med_infectious_scrub_malaria",
                    subjectId = "medicine",
                    topicId = "med_haem_rheumatology_neuro",
                    topicName = "Infectious Diseases & Toxicology",
                    text = "Write down clinical features and management of Scrub Typhus (eschar) and Severe Falciparum Malaria (artesunate protocol). Management of rodenticide / yellow phosphorus and organophosphorus poisoning.",
                    years = listOf("2025", "2024", "2021 P1", "2020 P1", "2018 S P1", "2016 P1", "2014 P1", "2012 P1", "2010 P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "15 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "374, 410, 414, 1244, 1246, 1249",
                    highYieldPoints = listOf(
                        "Scrub Typhus: Caused by Orientia tsutsugamushi transmitted by larval trombiculid mites (chiggers); Hallmark sign is Eschar (painless black necrotic crusted lesion with erythematous halo at bite site in groins/axillae/perineum); high fever, hepatosplenomegaly, lymphadenopathy, capillary leak and multi-organ dysfunction (ARDS, acute renal failure, meningoencephalitis); Treatment: Oral/IV Doxycycline (100 mg BD for 7-10 days) or Azithromycin (500 mg daily).",
                        "Severe Falciparum Malaria: Defined by P. falciparum parasitemia plus any WHO severity criterion: Cerebral malaria (coma), severe normocytic anemia (Hb <7 g/dL), acute renal failure, ARDS, hypoglycemia, metabolic acidosis, shock (algid malaria); Treatment: IV Artesunate (2.4 mg/kg IV at 0, 12, and 24 hours, then daily for minimum 3 doses until patient can tolerate oral Artemisinin-based Combination Therapy [ACT: Artemether-Lumefantrine]).",
                        "Rodenticide / Yellow Phosphorus Poisoning: Ingestion of rat killer paste; fulminant hepatic necrosis, acute liver failure, and severe coagulopathy; Treated with early gastric lavage, IV N-Acetylcysteine (NAC) protocol for hepatoprotection, and supportive ICU care.",
                        "Organophosphorus Poisoning: Irreversible inhibition of acetylcholinesterase -> acetylcholine accumulation; Muscarinic signs (SLUDGEM: salivation, lacrimation, urination, defecation, GI upset, emesis, miosis, bronchorrhea and bronchospasm); Nicotinic signs (muscle fasciculations, weakness); Central signs (seizures, coma); Treatment: 1. Atropine (2-4 mg IV bolus, doubling every 5-10 minutes until full atropinization: clear chest on auscultation, HR >80, dry axillae, pupil dilated); 2. Oximes (Pralidoxime - PAM 1-2 g IV slow infusion to reactivate cholinesterase before aging occurs)."
                    ),
                    referenceLinks = listOf(ReferenceLink("WHO Guidelines for Malaria & Toxicology", "https://www.who.int/", "Guideline")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "med_rheum_sle_lupus",
                    subjectId = "medicine",
                    topicId = "med_haem_rheumatology_neuro",
                    topicName = "Connective Tissue Diseases",
                    text = "A 24-year-old female presents with recurrent oral ulcers, non-scarring alopecia, photosensitive malar rash, polyarthralgia, and frothy urine. i) Diagnostic criteria for Systemic Lupus Erythematosus (EULAR/ACR 2019 criteria); ii) Serological autoantibodies (ANA, Anti-dsDNA, Anti-Smith); iii) WHO/ISN classification and management of Lupus Nephritis.",
                    years = listOf("2025", "2023 P1", "2021 P1", "2019 P1", "2016 P1", "2013 P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "4 + 4 + 7 = 15 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "685-702",
                    highYieldPoints = listOf(
                        "Diagnosis: Systemic Lupus Erythematosus (SLE) with Lupus Nephritis.",
                        "EULAR/ACR 2019 Classification Criteria: Entry criterion is ANA positive at a titer of >= 1:80 on HEp-2 cells. If positive, calculate weighted criteria across 7 clinical and 3 immunological domains. A score of >= 10 points classifies SLE.",
                        "- Clinical Domains: Constitutional (fever), Hematologic (leukopenia, thrombocytopenia, autoimmune hemolysis), Neuropsychiatric (delirium, psychosis, seizure), Mucocutaneous (malar rash, discoid lupus, oral ulcers, alopecia), Serosal (pericardial/pleural effusion), Musculoskeletal (synovitis in >=2 joints), Renal (proteinuria >0.5 g/24h or renal biopsy Class II-V).",
                        "- Immunological Domains: Antiphospholipid antibodies (anticardiolipin, anti-beta-2-GPI, lupus anticoagulant), Low complement levels (C3, C4), and SLE-specific antibodies (Anti-dsDNA, Anti-Smith).",
                        "Serological Markers:",
                        "- ANA: Best screening test (sensitivity >98% but poor specificity).",
                        "- Anti-dsDNA: Highly specific for SLE (>95%), correlates strongly with lupus nephritis disease activity and flares.",
                        "- Anti-Smith (Sm): Most specific antibody for SLE (>99%), though present in only ~20-30% of patients.",
                        "ISN/RPS Classification of Lupus Nephritis:",
                        "- Class I: Minimal mesangial lupus nephritis.",
                        "- Class II: Mesangial proliferative lupus nephritis.",
                        "- Class III: Focal proliferative lupus nephritis (<50% of glomeruli).",
                        "- Class IV: Diffuse proliferative lupus nephritis (>=50% of glomeruli - MOST COMMON & MOST SEVERE).",
                        "- Class V: Membranous lupus nephritis (nephrotic-range proteinuria).",
                        "- Class VI: Advanced sclerotic lupus nephritis (>=90% sclerosed glomeruli).",
                        "Management of Proliferative Lupus Nephritis (Class III/IV):",
                        "1. Background Therapy: Hydroxychloroquine (HCQ <=5 mg/kg/day) for all patients unless contraindicated (reduces flares and organ damage).",
                        "2. Induction Therapy: High-dose pulse IV Methylprednisolone (500-1000 mg/day for 3 days) followed by oral Prednisone (0.5-1 mg/kg/day tapering) PLUS EITHER Mycophenolate Mofetil (MMF 2-3 g/day oral) OR low-dose IV Cyclophosphamide (Eurolupus regimen: 500 mg IV every 2 weeks for 6 doses).",
                        "3. Maintenance Therapy: Oral MMF (1-2 g/day) or Azathioprine (2 mg/kg/day) + low-dose steroid for at least 3-5 years."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("EULAR/ACR Classification Criteria for Systemic Lupus Erythematosus", "https://ard.bmj.com/content/78/9/1151", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "med_nephro_ckd_stages",
                    subjectId = "medicine",
                    topicId = "med_haem_rheumatology_neuro",
                    topicName = "Nephrology & Renal Medicine",
                    text = "Define Chronic Kidney Disease (CKD). Outline the KDIGO staging of CKD based on eGFR and Albuminuria. Discuss the pathophysiology of renal osteodystrophy (mineral bone disorder) and medical management of advanced CKD to delay progression.",
                    years = listOf("2025", "2024", "2022 P1", "2020 P1", "2017 P1", "2014 P1", "2011 P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 4 + 4 + 4 = 15 Marks",
                    textbookRef = "Archith Boloor (4th Ed)",
                    pageNumbers = "815-835",
                    highYieldPoints = listOf(
                        "Definition of CKD (KDIGO): Abnormalities of kidney structure or function present for > 3 months with implications for health (eGFR < 60 mL/min/1.73 m2 OR markers of kidney damage: albuminuria AER >= 30 mg/24h or ACR >= 30 mg/g, urinary sediment abnormalities, electrolyte abnormalities from tubular disorders, histology abnormalities, structural abnormalities detected by imaging, or history of kidney transplantation).",
                        "KDIGO Staging by eGFR (G1-G5):",
                        "- G1: Normal or high (>= 90 mL/min/1.73m2 with kidney damage)",
                        "- G2: Mildly decreased (60-89 mL/min/1.73m2 with kidney damage)",
                        "- G3a: Mild to moderately decreased (45-59 mL/min/1.73m2)",
                        "- G3b: Moderately to severely decreased (30-44 mL/min/1.73m2)",
                        "- G4: Severely decreased (15-29 mL/min/1.73m2)",
                        "- G5: Kidney failure / End-stage renal disease (< 15 mL/min/1.73m2)",
                        "Albuminuria Staging (A1-A3): A1: Normal to mildly increased (<30 mg/g); A2: Moderately increased / microalbuminuria (30-300 mg/g); A3: Severely increased / macroalbuminuria (>300 mg/g).",
                        "CKD-Mineral and Bone Disorder (CKD-MBD): Decreased GFR -> Phosphate retention (Hyperphosphatemia) + impaired 1-alpha-hydroxylase activity leading to decreased active 1,25-(OH)2 Vitamin D (Calcitriol) -> hypocalcemia and increased Fibroblast Growth Factor 23 (FGF-23) -> sustained stimulation of parathyroid glands -> Secondary Hyperparathyroidism -> increased bone turnover and resorption (Osteitis fibrosa cystica, Rugger-Jersey spine sign).",
                        "Management to Slow Progression:",
                        "1. Blood Pressure Control: Target BP < 120 mmHg systolic using ACE inhibitors or ARBs (first-line in patients with albuminuria/proteinuria - reduces intraglomerular capillary hypertension).",
                        "2. SGLT2 Inhibitors (Dapagliflozin / Empagliflozin): Proven to significantly reduce CKD progression, cardiovascular death, and hospitalization.",
                        "3. Non-steroidal MRA (Finerenone): Cardiorenal protection in diabetic kidney disease.",
                        "4. Dietary Protein Restriction: 0.6-0.8 g/kg/day.",
                        "5. Management of Complications: Anemia with Erythropoiesis-Stimulating Agents (ESA: Darbepoetin alfa, target Hb 10-11.5 g/dL) + IV Iron; Hyperphosphatemia with dietary restriction and non-calcium phosphate binders (Sevelamer); Metabolic acidosis with oral Sodium Bicarbonate; Dialysis preparation (AV fistula creation) when GFR < 15-20 mL/min."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("KDIGO Clinical Practice Guideline for the Evaluation and Management of Chronic Kidney Disease", "https://kdigo.org/", "Guideline")
                    ),
                    isRepeatQuestion = true
                )
            )
        )
    )
}
