package com.example.data.repository

import com.example.data.model.*

object PaediatricsDataProvider {
    val textbook = TextbookInfo(
        title = "Essential Pediatrics",
        authors = "OP Ghai, Paul, Bagga",
        edition = "10th Edition",
        publisher = "CBS Publishers & Distributors",
        primarySubject = "Paediatrics",
        description = "The gold standard undergraduate paediatric textbook for Indian universities, emphasizing clinical protocols, neonatology, IMNCI, and Indian Academy of Pediatrics (IAP) guidelines.",
        referenceUrl = "https://www.iapindia.org/",
        officialGuidelinesUrl = "https://nhm.gov.in/index1.php?lang=1&level=2&sublinkid=1073&lid=342",
        keyChapters = listOf(
            "Neonatology (pp. 121-185)",
            "Normal Growth & Development (pp. 1-38)",
            "Nutrition & Micronutrients (pp. 75-115)",
            "Immunization (pp. 187-217)",
            "Infectious Diseases (pp. 219-286)",
            "Gastrointestinal & Liver (pp. 310-345)",
            "Hematology (pp. 347-375)",
            "Respiratory System (pp. 400-425)",
            "Cardiovascular System (pp. 423-460)",
            "Nephrology & Urinary Tract (pp. 490-520)",
            "Central Nervous System (pp. 570-615)"
        )
    )

    fun getTopics(): List<Topic> = listOf(
        Topic(
            id = "peds_neonato",
            subjectId = "paediatrics",
            name = "Neonatology",
            description = "Care of normal and sick neonates, hypothermia, warm chain, resuscitation, neonatal sepsis, and hyperbilirubinemia.",
            textbookChapter = "Chapter 8: The Newborn Infant",
            standardPages = "pp. 121-185",
            questions = listOf(
                Question(
                    id = "peds_neo_1",
                    subjectId = "paediatrics",
                    topicId = "peds_neonato",
                    topicName = "Neonatology",
                    text = "Describe methods of heat loss in newborn. What are the grades of hypothermia? Mention components of warm chain for prevention of hypothermia in newborn.",
                    years = listOf("2024"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 2 + 5 = 10 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "139-140",
                    highYieldPoints = listOf(
                        "4 Mechanisms of heat loss: Convection, Conduction, Radiation (majority ~60%), and Evaporation (amniotic fluid on skin).",
                        "WHO Hypothermia Grading: Cold stress (36.0-36.4°C), Moderate hypothermia (32.0-35.9°C), Severe hypothermia (<32.0°C).",
                        "Warm Chain 10 Interlinked Steps: Warm delivery room (>25°C), Immediate drying, Skin-to-skin contact, Early breastfeeding within 1 hr, Postponing bath (min 48-72h), Appropriate clothing & bedding, Mother & baby together (rooming-in), Warm resuscitation, Warm transportation, Training & awareness."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("WHO Newborn Thermal Protection Guidelines", "https://www.who.int/publications/i/item/9241561691", "Guideline"),
                        ReferenceLink("IAP Neonatal Resuscitation Program (NRP) India", "https://iapindia.org/", "Textbook")
                    )
                ),
                Question(
                    id = "peds_neo_2",
                    subjectId = "paediatrics",
                    topicId = "peds_neonato",
                    topicName = "Neonatology",
                    text = "Premature babies are more prone for hypothermia than term babies.",
                    years = listOf("2025"),
                    type = QuestionType.SHORT_ANSWER,
                    marksBreakdown = "4 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "139",
                    highYieldPoints = listOf(
                        "Higher surface area to body weight ratio compared to term babies.",
                        "Deficient subcutaneous fat and limited brown adipose tissue (BAT) stores for non-shivering thermogenesis.",
                        "Immature epidermal stratum corneum leading to excessive transepidermal evaporative water and heat loss.",
                        "Poor vasomotor control and lack of flexion posture (hypotonia)."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("Thermoregulation in Preterm Infants - PubMed", "https://pubmed.ncbi.nlm.nih.gov/", "Review")
                    )
                ),
                Question(
                    id = "peds_neo_3",
                    subjectId = "paediatrics",
                    topicId = "peds_neonato",
                    topicName = "Neonatology",
                    text = "Delayed cord clamping in the current practice during birth.",
                    years = listOf("2024"),
                    type = QuestionType.SHORT_ANSWER,
                    marksBreakdown = "4 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "128",
                    highYieldPoints = listOf(
                        "Timing: Clamping delayed for 60 to 180 seconds in vigorous term and preterm infants.",
                        "Benefits: Provides extra 80-100 mL blood volume (placental transfusion), increases ferritin stores for first 6 months.",
                        "Preterm benefits: Decreases intraventricular hemorrhage (IVH), necrotizing enterocolitis (NEC), and need for inotropic support.",
                        "Contraindications: Immediate resuscitation needed, monochorionic twins with TTTS, hydrops fetalis."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("WHO Recommendation on Delayed Umbilical Cord Clamping", "https://www.who.int/publications/i/item/9789241508209", "Guideline")
                    )
                ),
                Question(
                    id = "peds_neo_4",
                    subjectId = "paediatrics",
                    topicId = "peds_neonato",
                    topicName = "Neonatology",
                    text = "Clinical features of sepsis in newborn and Neonatal sepsis screening.",
                    years = listOf("2021", "2020", "2016", "2013", "2011"),
                    type = QuestionType.SHORT_ESSAY,
                    marksBreakdown = "10 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "167",
                    highYieldPoints = listOf(
                        "Clinical presentation is subtle: Refusal to suck (earliest/most common), hypothermia or fever, lethargy, respiratory distress, abdominal distension, sclerema.",
                        "Sepsis Screen (positive if >=2 criteria): TLC <5000/mm3, Absolute Neutrophil Count (ANC) low, Immature to Total neutrophil ratio (I:T ratio) >0.2, Micro-ESR >15 mm in 1st hr, CRP >10 mg/L or positive.",
                        "Gold standard: Blood culture (automated BACTEC) before initiating antibiotics."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("AIIMS Sepsis Protocol for Neonates", "https://www.newbornwhocc.org/", "Guideline")
                    ),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "peds_neo_5",
                    subjectId = "paediatrics",
                    topicId = "peds_neonato",
                    topicName = "Neonatology",
                    text = "Kangaroo Mother Care (KMC): Components, eligibility, and benefits.",
                    years = listOf("2015", "2013", "2011"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "149",
                    highYieldPoints = listOf(
                        "Two core components: Continuous Skin-to-skin contact (frog position) and Exclusive breastfeeding.",
                        "Eligibility: Stable low birth weight (<2500g) infants, breathing spontaneously.",
                        "Benefits: Promotes weight gain, stabilizes heart rate and oxygenation, reduces sepsis/mortality, empowers mother-infant bonding."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("WHO Kangaroo Mother Care Guide", "https://www.who.int/publications/i/item/9241590351", "Guideline")
                    ),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "peds_neo_6",
                    subjectId = "paediatrics",
                    topicId = "peds_neonato",
                    topicName = "Neonatology",
                    text = "Phototherapy in neonates: Mechanism, indications, and side effects.",
                    years = listOf("2015", "2010"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "174",
                    highYieldPoints = listOf(
                        "Mechanism: Blue-green light (wavelength 460-490 nm) converts insoluble unconjugated bilirubin into soluble isomers (lumirubin via structural isomerization, photobilirubin via photoisomerization).",
                        "Lumirubin formation is irreversible and excreted via bile and urine without conjugation.",
                        "Side effects: Bronze baby syndrome (if conjugated bilirubin high), dehydration, loose green stools, rash, hyperthermia. Eye patches and genital covering mandatory."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("AAP Hyperbilirubinemia Management in Neonates", "https://publications.aap.org/pediatrics", "Guideline")
                    )
                )
            )
        ),
        Topic(
            id = "peds_growth",
            subjectId = "paediatrics",
            name = "Normal Growth and Development",
            description = "Milestones across gross motor, fine motor, social, and language domains; growth charts and head circumference.",
            textbookChapter = "Chapter 2 & 3: Growth and Development",
            standardPages = "pp. 1-38",
            questions = listOf(
                Question(
                    id = "peds_growth_1",
                    subjectId = "paediatrics",
                    topicId = "peds_growth",
                    topicName = "Normal Growth and Development",
                    text = "Developmental milestones of a normal child of one year (12 months).",
                    years = listOf("2025", "2017", "2012", "2010"),
                    type = QuestionType.SHORT_ANSWER,
                    marksBreakdown = "5 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "29, 32, 35",
                    highYieldPoints = listOf(
                        "Gross Motor: Walks with one hand held or stands independently for a few seconds.",
                        "Fine Motor: Mature pincer grasp (holds pellet between thumb and index finger tip), releases object voluntarily.",
                        "Language: 1 to 2 words with meaning (e.g., 'Mama', 'Dada'). Responds to name.",
                        "Social/Cognitive: Plays peek-a-boo, waves 'bye-bye', drinks from a cup with assistance."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("CDC Developmental Milestones Chart", "https://www.cdc.gov/ncbddd/actearly/milestones/", "Guideline")
                    ),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "peds_growth_2",
                    subjectId = "paediatrics",
                    topicId = "peds_growth",
                    topicName = "Normal Growth and Development",
                    text = "Motor milestones of a 2-year-old child.",
                    years = listOf("2016", "2013 S"),
                    type = QuestionType.SHORT_ANSWER,
                    marksBreakdown = "5 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "29, 32",
                    highYieldPoints = listOf(
                        "Gross Motor: Runs well without falling, climbs upstairs and downstairs with two feet per step, kicks ball forward without falling.",
                        "Fine Motor: Builds tower of 6 cubes, imitates vertical stroke with crayon, turns door knobs and unscrews lids.",
                        "Language: 2-3 word sentences ('want water'), vocabulary >50 words.",
                        "Social: Parallel play, verbalizes toilet needs."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("IAP Growth Charts & Developmental Milestones", "https://iapindia.org/", "Textbook")
                    )
                ),
                Question(
                    id = "peds_growth_3",
                    subjectId = "paediatrics",
                    topicId = "peds_growth",
                    topicName = "Normal Growth and Development",
                    text = "Utility of growth chart and Head Circumference monitoring.",
                    years = listOf("2013", "2011"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "10, 12",
                    highYieldPoints = listOf(
                        "Utility: Early detection of growth faltering before clinical malnutrition sets in, road-to-health monitoring, objective evaluation of interventions.",
                        "Head circumference: At birth ~35 cm, 3 months 40 cm, 1 year 45-46 cm, adult 54 cm.",
                        "Microcephaly: >2 SD below mean (associated with TORCH, craniosynostosis, hypoxia). Macrocephaly: Hydrocephalus, megalencephaly."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("WHO Child Growth Standards", "https://www.who.int/tools/child-growth-standards", "Guideline")
                    )
                )
            )
        ),
        Topic(
            id = "peds_nutrition",
            subjectId = "paediatrics",
            name = "Nutrition & Deficiency Disorders",
            description = "Xerophthalmia, Vitamin D deficiency & Rickets, Severe Acute Malnutrition (SAM 10 steps), and PEM classifications.",
            textbookChapter = "Chapter 5: Nutrition and Nutritional Disorders",
            standardPages = "pp. 75-115",
            questions = listOf(
                Question(
                    id = "peds_nutr_1",
                    subjectId = "paediatrics",
                    topicId = "peds_nutrition",
                    topicName = "Nutrition",
                    text = "What is the WHO classification of xerophthalmia? Write in brief the national prophylaxis program against nutritional blindness.",
                    years = listOf("2025"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "5 + 5 = 10 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "101",
                    highYieldPoints = listOf(
                        "WHO Xerophthalmia Classification: XN (Night blindness), X1A (Conjunctival xerosis), X1B (Bitot's spots), X2 (Corneal xerosis), X3A (Corneal ulceration/keratomalacia <1/3rd cornea), X3B (Corneal ulceration/keratomalacia >=1/3rd cornea), XS (Corneal scar), XF (Xerophthalmic fundus).",
                        "National Prophylaxis Program (Ministry of Health & Family Welfare): 1st dose: 100,000 IU orally at 9 months with Measles-Rubella vaccine.",
                        "Subsequent doses: 200,000 IU every 6 months from 16-18 months up to 5 years (total 9 doses = 17 lakh IU)."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("National Vitamin A Prophylaxis Guidelines", "https://nhm.gov.in/", "Guideline")
                    )
                ),
                Question(
                    id = "peds_nutr_2",
                    subjectId = "paediatrics",
                    topicId = "peds_nutrition",
                    topicName = "Nutrition",
                    text = "Discuss the process of vitamin D absorption and metabolism. Mention the clinical and radiological features of Vitamin deficient Rickets.",
                    years = listOf("2018", "2016", "2015", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "5 + 5 = 10 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "102, 104, 105",
                    highYieldPoints = listOf(
                        "Synthesis & Metabolism: 7-dehydrocholesterol in skin -> Vitamin D3 (cholecalciferol) by UV-B light. Liver 25-hydroxylase -> 25(OH)D (calcidiol, main storage form). Kidney 1-alpha-hydroxylase (stimulated by PTH) -> 1,25(OH)2D3 (calcitriol, active hormone).",
                        "Clinical Features: Craniotabes (ping-pong ball sensation, earliest), delayed anterior fontanelle closure, rachitic rosary, Harrison sulcus, pigeon chest, wrist widening, genu valgum/varum.",
                        "Radiological Triad: Cupping, Splaying, and Fraying of metaphyseal end of long bones (radius/ulna)."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("Global Consensus on Nutritional Rickets Prevention", "https://pubmed.ncbi.nlm.nih.gov/", "Review")
                    ),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "peds_nutr_3",
                    subjectId = "paediatrics",
                    topicId = "peds_nutrition",
                    topicName = "Nutrition",
                    text = "Define Severe Acute Malnutrition (SAM). Mention its 10 steps of management. How will you treat and prevent Hypoglycaemia and infection in this case?",
                    years = listOf("2018 S", "2010 S"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "1 + 3 + 3 + 3 = 10 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "89-91",
                    highYieldPoints = listOf(
                        "SAM Definition (WHO/IAP): Weight-for-height <-3 SD, OR Mid-Upper Arm Circumference (MUAC) <115 mm (in 6-59 months), OR presence of bilateral nutritional pitting edema.",
                        "10 Management Steps: 1. Hypoglycemia, 2. Hypothermia, 3. Dehydration (use ReSoMal, NOT standard ORS), 4. Electrolytes (potassium & magnesium, NO added sodium), 5. Infection (broad spectrum antibiotics), 6. Micronutrients (Vit A, zinc, folate, withhold iron until phase 2), 7. Initial feeding (F-75 starter diet), 8. Catch-up growth feeding (F-100), 9. Sensory stimulation, 10. Preparation for discharge.",
                        "Hypoglycemia (<54 mg/dL): 10% dextrose 5 mL/kg IV or 50 mL 10% dextrose/sugar water PO/NGT, followed by 2-hourly feeding with F-75."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("WHO Guideline on Management of Severe Acute Malnutrition", "https://www.who.int/publications/i/item/9789241506328", "Guideline")
                    )
                )
            )
        ),
        Topic(
            id = "peds_immunization",
            subjectId = "paediatrics",
            name = "Immunization and Immunodeficiency",
            description = "National Immunization Schedule (UIP), Birth doses, Pentavalent, MR/MMR, IPV, and vaccines in special situations.",
            textbookChapter = "Chapter 9: Immunization",
            standardPages = "pp. 187-217",
            questions = listOf(
                Question(
                    id = "peds_imm_1",
                    subjectId = "paediatrics",
                    topicId = "peds_immunization",
                    topicName = "Immunization",
                    text = "Zero dose (birth dose) of Hep B vaccine should be given to all neonates. Discuss rationale.",
                    years = listOf("2025"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "190",
                    highYieldPoints = listOf(
                        "Timing: Given within 24 hours of birth intramuscularly (anterolateral thigh).",
                        "Rationale: Perinatal vertical transmission from HBsAg+ mother carries a 90% risk of chronic Hepatitis B carrier state and eventual cirrhosis/hepatocellular carcinoma.",
                        "Efficacy: Birth dose alone prevents >80% of mother-to-child transmission; combined with Hepatitis B Immunoglobulin (HBIG) within 12h, efficacy exceeds 95%."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("National Immunization Schedule - MoHFW India", "https://nhm.gov.in/index1.php?lang=1&level=2&sublinkid=824&lid=220", "Guideline")
                    )
                ),
                Question(
                    id = "peds_imm_2",
                    subjectId = "paediatrics",
                    topicId = "peds_immunization",
                    topicName = "Immunization",
                    text = "Vaccination plan for a child with sickle cell disease.",
                    years = listOf("2021"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "215",
                    highYieldPoints = listOf(
                        "Risk: Functional asplenia from micro-infarctions leads to life-threatening infection by encapsulated bacteria (S. pneumoniae, N. meningitidis, H. influenzae type b, Salmonella).",
                        "Vaccine Strategy: 1. Pneumococcal conjugate vaccine (PCV13) followed by 23-valent polysaccharide (PPSV23) after 2 years; 2. Quadrivalent Meningococcal conjugate vaccine (MenACWY); 3. Hib vaccine; 4. Annual influenza; 5. Daily prophylactic oral Penicillin V until at least age 5."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("CDC Sickle Cell Disease Immunization Guidelines", "https://www.cdc.gov/vaccines/", "Guideline")
                    )
                ),
                Question(
                    id = "peds_imm_3",
                    subjectId = "paediatrics",
                    topicId = "peds_immunization",
                    topicName = "Immunization",
                    text = "Enumerate the vaccines that can be given to an unimmunized 2-year-old child.",
                    years = listOf("2014"),
                    type = QuestionType.SHORT_ANSWER,
                    marksBreakdown = "5 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "192-195",
                    highYieldPoints = listOf(
                        "Catch-up immunization schedule for 2yo child:",
                        "1. DPT / Pentavalent (DTP-HepB-Hib) - 3 doses at 1-2 month intervals + 1 booster after 6 months.",
                        "2. Measles-Rubella (MR) or MMR - 2 doses at least 4 weeks apart.",
                        "3. Fractional IPV (fIPV) or bOPV as per national schedule.",
                        "4. Hepatitis B (3 doses: 0, 1, 6 months) if not receiving pentavalent.",
                        "5. Typhoid Conjugate Vaccine (TCV) single dose, Vitamin A syrup 200,000 IU."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("IAP ACVIP Catch-up Immunization Schedule", "https://iapindia.org/acvip-immunization-schedule/", "Guideline")
                    )
                )
            )
        ),
        Topic(
            id = "peds_infections",
            subjectId = "paediatrics",
            name = "Infectious Diseases",
            description = "Severe Dengue, Dengue Shock Syndrome, Rabies dog bite management, Falciparum Malaria, Measles, and Childhood Tuberculosis.",
            textbookChapter = "Chapter 11: Infectious Diseases",
            standardPages = "pp. 219-286",
            questions = listOf(
                Question(
                    id = "peds_inf_1",
                    subjectId = "paediatrics",
                    topicId = "peds_infections",
                    topicName = "Infectious Diseases",
                    text = "What are the Pathophysiological changes in severe Dengue? How will you manage a case of Severe Dengue?",
                    years = listOf("2020", "2016 S"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "5 + 5 = 10 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "242, 244",
                    highYieldPoints = listOf(
                        "Pathophysiology: Secondary infection with heterologous serotype causes Antibody-Dependent Enhancement (ADE) -> massive release of inflammatory cytokines (TNF-alpha, IL-6, IL-8) -> severe vascular endothelial permeability -> plasma leakage (ascites, pleural effusion, hemoconcentration) -> hypovolemic shock (Dengue Shock Syndrome) and coagulopathy.",
                        "Management of Shock: Resuscitate immediately with isotonic crystalloids (Ringer's Lactate / Normal Saline) 10-20 mL/kg over 30-60 minutes.",
                        "If improved, taper fluid gradually (7 mL/kg/h -> 5 -> 3 -> maintain). If refractory shock with rising hematocrit, switch to colloids (Dextran 40 / 6% HES). If falling hematocrit with shock, suspect internal bleeding and transfuse packed RBCs."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("National NVBDCP Dengue Management Guidelines", "https://nvbdcp.gov.in/index4.php?lang=1&level=0&linkid=431&lid=3715", "Guideline")
                    ),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "peds_inf_2",
                    subjectId = "paediatrics",
                    topicId = "peds_infections",
                    topicName = "Infectious Diseases",
                    text = "A 5 years old boy while playing in paddy field had a dog bite over face. How will you approach and protect the boy from Rabies?",
                    years = listOf("2016", "2013"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "8 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "245-247",
                    highYieldPoints = listOf(
                        "Triage: WHO Category III exposure (single/multiple transdermal bites, scratches, saliva contamination on broken skin, or any bite on face/head/neck). Bites on face have very short incubation period due to proximity to CNS.",
                        "Immediate Wound Cleansing (lifesaving): Wash thoroughly under running tap water with soap for minimum 15 minutes. Apply povidone iodine. DO NOT suture immediately.",
                        "Rabies Immunoglobulin (RIG): Infiltrate Equine RIG (40 IU/kg) or Human RIG (20 IU/kg) into and around all wound sites on the face. Excess given IM.",
                        "Anti-Rabies Vaccine (ARV): Intradermal Thai Red Cross regimen (2-site ID on days 0, 3, 7, 28) or intramuscular Essen regimen (days 0, 3, 7, 14, 28). Administer Tetanus toxoid."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("National Rabies Control Program Guidelines India", "https://ncdc.mohfw.gov.in/", "Guideline")
                    ),
                    isClinicalCase = true
                ),
                Question(
                    id = "peds_inf_3",
                    subjectId = "paediatrics",
                    topicId = "peds_infections",
                    topicName = "Infectious Diseases",
                    text = "Evaluation of haematocrit is more important than Platelet count in the management of dengue.",
                    years = listOf("2024"),
                    type = QuestionType.SHORT_ANSWER,
                    marksBreakdown = "4 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "242",
                    highYieldPoints = listOf(
                        "Pathophysiological marker: The primary life-threatening mechanism in severe dengue is plasma leakage, which directly causes hemoconcentration reflected by a rising Hematocrit (>20% increase from baseline).",
                        "Fluid titration: Intravenous fluid infusion rates are titrated dynamically against serial HCT readings. Platelet count does not reflect intravascular fluid status.",
                        "Clinical decisions: A dropping HCT with persistent shock indicates occult hemorrhage requiring blood transfusion; prophylactic platelet transfusion without active bleeding is contraindicated."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("WHO Comprehensive Guidelines for Dengue Management", "https://www.who.int/", "Guideline")
                    )
                )
            )
        ),
        Topic(
            id = "peds_git",
            subjectId = "paediatrics",
            name = "Gastrointestinal and Liver Disorders",
            description = "Neonatal bilirubin metabolism, Acute Gastroenteritis, Low osmolar ORS, and Portal Hypertension.",
            textbookChapter = "Chapter 13: Gastrointestinal System and Liver",
            standardPages = "pp. 310-345",
            questions = listOf(
                Question(
                    id = "peds_git_1",
                    subjectId = "paediatrics",
                    topicId = "peds_git",
                    topicName = "Gastrointestinal and Liver",
                    text = "A child of 2 years presented in emergency room with history of loose motions and vomiting after each feed. How will you diagnose and manage such case? Mention also prevention of diarrhoea.",
                    years = listOf("2019"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 3 + 3 = 8 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "311-314",
                    highYieldPoints = listOf(
                        "Assessment of Dehydration (WHO Plan A, B, or C): Look at sensorium, sunken eyes, thirst (drinks eagerly vs unable to drink), skin pinch retraction time.",
                        "Oral Rehydration Therapy: If Some Dehydration (Plan B) -> Low osmolar ORS 75 mL/kg over 4 hours under observation. Reassess after 4 hours.",
                        "Severe Dehydration (Plan C): IV Ringer's Lactate 100 mL/kg (30 mL/kg in 1 hr, then 70 mL/kg in 5 hrs for age >=1 yr).",
                        "Adjuncts: Zinc supplementation (20 mg/day for 14 days), continue age-appropriate feeding and breastfeeding.",
                        "Prevention: Exclusive breastfeeding for 6 months, clean drinking water, rotavirus vaccination, hand hygiene."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("WHO Oral Rehydration Therapy & Diarrhea Protocol", "https://www.who.int/", "Guideline")
                    ),
                    isClinicalCase = true
                ),
                Question(
                    id = "peds_git_2",
                    subjectId = "paediatrics",
                    topicId = "peds_git",
                    topicName = "Gastrointestinal and Liver",
                    text = "Low osmolar ORS is better than conventional ORS of WHO. Discuss composition and advantages.",
                    years = listOf("2024", "2023"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "311",
                    highYieldPoints = listOf(
                        "Composition (mmol/L): Sodium 75 (vs 90 in old), Glucose 75 (vs 111), Chloride 65, Potassium 20, Citrate 10. Total Osmolarity = 245 mOsm/L (vs 311 in old).",
                        "Advantages: Reduces stool output by ~20%, reduces duration of diarrhoea, reduces vomiting episodes by ~30%, significantly reduces need for unscheduled IV hydration therapy, avoids hypernatremia."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("WHO / UNICEF Revised Oral Rehydration Salts Formula", "https://www.who.int/", "Guideline")
                    ),
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "peds_cns",
            subjectId = "paediatrics",
            name = "Disorders of Central Nervous System",
            description = "Pyogenic meningitis, Febrile convulsions, Status epilepticus, Raised ICP, and Guillain-Barré Syndrome.",
            textbookChapter = "Chapter 19: Neurological Disorders",
            standardPages = "pp. 570-615",
            questions = listOf(
                Question(
                    id = "peds_cns_1",
                    subjectId = "paediatrics",
                    topicId = "peds_cns",
                    topicName = "Central Nervous System",
                    text = "Discuss the etiopathogenesis, clinical features and management of pyogenic meningitis in children.",
                    years = listOf("2025", "2016"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 2 + 5 = 10 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "586",
                    highYieldPoints = listOf(
                        "Etiology: S. pneumoniae (most common overall), N. meningitidis, H. influenzae type b (declining after vaccination). In neonates: GBS, E. coli, Listeria.",
                        "Pathogenesis: Nasopharyngeal mucosal colonization -> bacteremia -> crossing blood-brain barrier at choroid plexus -> subarachnoid space replication -> release of endotoxins/peptidoglycans -> meningeal inflammation and purulent exudate -> raised ICP and cerebral edema.",
                        "Clinical features: High fever, vomiting, altered sensorium, seizures, neck stiffness, Kernig's and Brudzinski's signs positive. Bulging fontanelle in infants.",
                        "Management: Immediate IV Ceftriaxone (100 mg/kg/day) + Vancomycin (60 mg/kg/day). Dexamethasone 0.15 mg/kg IV q6h started before or with 1st antibiotic dose (reduces sensorineural hearing loss). Duration: 10-14 days."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("IAP Guidelines on Pediatric Bacterial Meningitis", "https://iapindia.org/", "Guideline")
                    )
                ),
                Question(
                    id = "peds_cns_2",
                    subjectId = "paediatrics",
                    topicId = "peds_cns",
                    topicName = "Central Nervous System",
                    text = "A 2-year-old male child presented to emergency with fever for 1 day, and an episode of abnormal movement of all 4 limbs with upward rolling of eyeballs lasting 3 minutes. Now playful and febrile. Provisional diagnosis, differential diagnosis, and management.",
                    years = listOf("2024", "2020", "2018", "2011"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "1 + 3 + 3 + 4 + 4 = 15 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "580, 581",
                    highYieldPoints = listOf(
                        "Provisional Diagnosis: Simple Febrile Seizure (generalized tonic-clonic, duration <15 min, only 1 episode in 24 hours, child neurologically normal postictal).",
                        "Differential Diagnosis: Complex febrile seizure, Central nervous system infection (Meningitis / Encephalitis), Shiga toxin / viral enteritis seizure, Electrolyte disturbance (hypocalcemia, hypoglycemia), breakthrough seizure in established epilepsy.",
                        "Investigations: Lumbar puncture if signs of meningeal irritation or incomplete Hib/PCV vaccination or <12 months. Routine EEG and neuroimaging NOT indicated in simple febrile seizures.",
                        "Management: Paracetamol (15 mg/kg/dose) for fever comfort, cold sponging, reassurance to parents. If seizure lasts >5 min: Intranasal Midazolam (0.2 mg/kg) or rectal diazepam. Long-term anti-epileptics NOT recommended."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("AAP Clinical Practice Guideline on Febrile Seizures", "https://publications.aap.org/pediatrics", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "peds_renal",
            subjectId = "paediatrics",
            name = "Disorders of Kidney and Urinary Tract",
            description = "Acute Post-Streptococcal Glomerulonephritis (PSGN), Nephrotic Syndrome (steroid protocols & edema pathogenesis), and AKI.",
            textbookChapter = "Chapter 18: Nephrology",
            standardPages = "pp. 490-520",
            questions = listOf(
                Question(
                    id = "peds_renal_1",
                    subjectId = "paediatrics",
                    topicId = "peds_renal",
                    topicName = "Kidney and Urinary Tract",
                    text = "A 4-year-old girl is brought to ER with 3 days history of cola coloured scanty urine. BP is high. Provisional diagnosis, past history details, etiological agent, complications, lab investigations, and management.",
                    years = listOf("2025"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "1 + 2 + 1 + 3 + 4 + 4 = 15 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "496-497",
                    highYieldPoints = listOf(
                        "Provisional Diagnosis: Acute Post-Streptococcal Glomerulonephritis (PSGN / Acute Nephritic Syndrome).",
                        "Past History: History of sore throat (pharyngitis 1-2 weeks ago) or impetigo / pyoderma skin infection (3-6 weeks ago).",
                        "Etiological Agent: Group A beta-hemolytic Streptococcus (GABS / S. pyogenes), nephritogenic strains (types 12, 4 for pharyngitis; types 49, 55, 57 for pyoderma).",
                        "Complications: Hypertensive encephalopathy (seizures, altered sensorium), Congestive cardiac failure / pulmonary edema due to fluid overload, Acute Kidney Injury / hyperkalemia.",
                        "Lab Investigations: Urine routine (dysmorphic RBCs, RBC casts, proteinuria), Serum C3 level (characteristically reduced, normalizes in 6-8 weeks), ASO titer (high in pharyngitis), Anti-DNase B (high in pyoderma), Serum urea and creatinine.",
                        "Management: Bed rest, salt and water restriction (insensible losses + previous day urine output), Loop diuretics (Furosemide 1-2 mg/kg IV) for hypertension and oliguria, Oral amlodipine/nifedipine if severe hypertension, 10-day course of oral Penicillin V to eradicate streptococcal carriage."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("KDIGO Glomerulonephritis Clinical Guidelines", "https://kdigo.org/", "Guideline")
                    ),
                    isClinicalCase = true
                ),
                Question(
                    id = "peds_renal_2",
                    subjectId = "paediatrics",
                    topicId = "peds_renal",
                    topicName = "Kidney and Urinary Tract",
                    text = "Discuss the Pathogenesis of oedema in Nephrotic Syndrome in a 5-year-old male child. How will you treat and monitor that child admitted in Paediatric ward?",
                    years = listOf("2023", "2020", "2013 S"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "10 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "500, 502, 505",
                    highYieldPoints = listOf(
                        "Pathogenesis of Oedema: 1. Underfill Hypothesis: Podocyte effacement -> massive proteinuria (>40 mg/m2/hr) -> profound hypoalbuminemia (<2.5 g/dL) -> decreased oncotic pressure -> shift of fluid to interstitial space -> intravascular hypovolemia -> secondary hyperaldosteronism & ADH stimulation -> renal Na+ and water retention; 2. Overfill Hypothesis: Primary intrarenal sodium retention via activation of epithelial sodium channels (ENaC) in cortical collecting duct by filtered plasminogen/plasmin.",
                        "Standard Steroid Therapy (ISPN Guideline): Oral Prednisolone 60 mg/m2/day (or 2 mg/kg/day, max 60 mg) as single morning dose for 6 weeks, followed by 40 mg/m2 alternate days for 6 weeks (total 12 weeks).",
                        "Monitoring: Daily morning urine albumin dipstick, daily weight chart, abdominal girth, blood pressure, strict fluid intake/output chart, watch for peritonitis/sepsis."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("Indian Society of Pediatric Nephrology (ISPN) Guidelines", "https://ispn-online.org/", "Guideline")
                    ),
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "peds_hema",
            subjectId = "paediatrics",
            name = "Hematological Disorders",
            description = "Henoch-Schönlein Purpura, Acute Leukemia (ALL), Iron deficiency anemia vs Thalassemia, and ITP.",
            textbookChapter = "Chapter 14: Hematological Disorders",
            standardPages = "pp. 347-375, 660",
            questions = listOf(
                Question(
                    id = "peds_hem_1",
                    subjectId = "paediatrics",
                    topicId = "peds_hema",
                    topicName = "Hematological Disorders",
                    text = "Describe the pathogenesis, clinical manifestations and management of Henoch-Schonlein Purpura (IgA Vasculitis).",
                    years = listOf("2024"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 3 + 4 = 10 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "660",
                    highYieldPoints = listOf(
                        "Pathogenesis: Small-vessel leukocytoclastic vasculitis mediated by tissue deposition of IgA1-dominant immune complexes, typically following an upper respiratory tract infection.",
                        "Classic Tetrad: 1. Palpable non-thrombocytopenic purpura (gravity-dependent over lower extremities and buttocks); 2. Arthralgia/arthritis (knees, ankles without deformity); 3. Gastrointestinal symptoms (colicky abdominal pain, GI bleeding, intussusception); 4. Renal involvement (hematuria, proteinuria, IgA nephropathy).",
                        "Management: Supportive care, NSAIDs/paracetamol for joint symptoms; Systemic corticosteroids (Prednisolone 1-2 mg/kg/day) for severe abdominal pain or severe nephritis; Long-term monitoring of BP and urinalysis for at least 6-12 months."
                    ),
                    referenceLinks = emptyList(),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "peds_hem_2",
                    subjectId = "paediatrics",
                    topicId = "peds_hema",
                    topicName = "Hematological Disorders",
                    text = "A 4-year-old child presented with pallor, fever, gum bleeding and 1.5 cm palpable spleen. Mention diagnostic possibilities and investigations to confirm diagnosis.",
                    years = listOf("2014 S", "2012", "2011"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 5 = 8 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "365, 369",
                    highYieldPoints = listOf(
                        "Diagnostic Possibilities: Acute Lymphoblastic Leukemia (ALL, most common in age 2-5 yrs), Acute Myeloid Leukemia (AML), Aplastic Anemia, Severe Malaria with thrombocytopenia.",
                        "Investigations: 1. Complete Blood Count (anemia, thrombocytopenia, leukocytosis or leukopenia with blast cells); 2. Peripheral Blood Smear (morphology of blast cells, absent platelets); 3. Bone Marrow Aspiration & Biopsy (diagnostic gold standard: >20% lymphoblasts/myeloblasts); 4. Flow cytometry / Immunophenotyping (differentiates B-ALL [CD19, CD10, CD22] from T-ALL [CD3, CD7] and AML); 5. Cytogenetics (hyperdiploidy, t(12;21), t(9;22) Philadelphia chromosome); 6. Coagulation profile and lumbar puncture for CSF blasts."
                    ),
                    referenceLinks = emptyList(),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "peds_hem_3",
                    subjectId = "paediatrics",
                    topicId = "peds_hema",
                    topicName = "Hematological Disorders",
                    text = "Outline the metabolism of iron in the body. Compare the laboratory findings of Iron Deficiency Anaemia and Thalassemia trait.",
                    years = listOf("2010"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "4 + 6 = 10 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "354, 361",
                    highYieldPoints = listOf(
                        "Iron Metabolism: Absorbed as Fe2+ mainly in duodenum through DMT1; regulated by Hepcidin (binds and degrades ferroportin); transported in plasma bound to Transferrin; stored inside Ferritin and Hemosiderin in RE system.",
                        "Comparison: 1. Serum Ferritin: Low (<15 mcg/L) in IDA, Normal or Elevated in Thalassemia; 2. Serum Iron: Low in IDA, Normal/High in Thalassemia; 3. Total Iron Binding Capacity (TIBC): Elevated in IDA, Normal in Thalassemia; 4. Transferrin Saturation: Reduced (<16%) in IDA, Normal (>20%) in Thalassemia; 5. Mentzer Index (MCV/RBC): >13 in IDA, <13 in Thalassemia; 6. Hb HPLC / Electrophoresis: Normal HbA2 (<3.5%) in IDA, Characteristically elevated HbA2 (>3.5%) in Beta-Thalassemia trait."
                    ),
                    referenceLinks = emptyList(),
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "peds_respiratory",
            subjectId = "paediatrics",
            name = "Disorders of Respiratory System",
            description = "Foreign body aspiration, Acute Bronchiolitis, Childhood Tuberculosis (NTEP), and severe pneumonia.",
            textbookChapter = "Chapter 15: Respiratory Disorders",
            standardPages = "pp. 400-425",
            questions = listOf(
                Question(
                    id = "peds_resp_1",
                    subjectId = "paediatrics",
                    topicId = "peds_respiratory",
                    topicName = "Respiratory System",
                    text = "A two-year-old child presented in the emergency room with history of sudden onset of difficulty in breathing. What is the probable diagnosis? How will you diagnose and manage such case?",
                    years = listOf("2024", "2018", "2017"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 6 = 8 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "416",
                    highYieldPoints = listOf(
                        "Probable Diagnosis: Foreign Body Aspiration into airway (peanut/vegetable matter, right main bronchus most common).",
                        "Triad of signs: Sudden paroxysmal choking/coughing, unilateral wheeze, decreased unilateral air entry.",
                        "Investigations: Chest X-ray (inspiratory and expiratory views or lateral decubitus: mediastinal shift away from affected side during expiration due to air trapping/check-valve mechanism, atelectasis/hyperinflation). Note: Most vegetable foreign bodies are radiolucent.",
                        "Management: If conscious and coughing: Encourage coughing, DO NOT perform blind finger sweeps; If choking/obstructed: Back blows and chest thrusts (under 1 yr) or Heimlich maneuver (above 1 yr); Definitive procedure: Rigid Bronchoscopy under general anesthesia for foreign body extraction."
                    ),
                    referenceLinks = emptyList(),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "peds_resp_2",
                    subjectId = "paediatrics",
                    topicId = "peds_respiratory",
                    topicName = "Respiratory System",
                    text = "Clinical presentation and management of Acute Bronchiolitis in infants.",
                    years = listOf("2018", "2010"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "406",
                    highYieldPoints = listOf(
                        "Etiology: Respiratory Syncytial Virus (RSV, >80% cases), commonest lower respiratory tract infection in infants <1 year.",
                        "Clinical Features: Starts with mild coryza and cough -> followed by tachypnea, subcostal and intercostal retractions, expiratory wheeze, fine bilateral crackles, hyperinflated chest.",
                        "Management: Humidified Oxygen therapy to maintain SpO2 >=92%, gentle nasal suctioning, oral or IV fluid maintenance; Hypertonic saline (3%) nebulization may decrease hospital stay. Routine bronchodilators, systemic steroids, and antibiotics are NOT recommended by AAP/IAP."
                    ),
                    referenceLinks = emptyList(),
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "peds_cvs",
            subjectId = "paediatrics",
            name = "Disorders of Cardiovascular System",
            description = "Ventricular Septal Defect (VSD), Congestive Cardiac Failure in infancy, Fetal circulation, and Modified Jones criteria.",
            textbookChapter = "Chapter 16: Cardiovascular Disorders",
            standardPages = "pp. 423-460",
            questions = listOf(
                Question(
                    id = "peds_cvs_1",
                    subjectId = "paediatrics",
                    topicId = "peds_cvs",
                    topicName = "Cardiovascular System",
                    text = "What are the anatomical types of ventricular septal defect (VSD)? Discuss clinical features, hemodynamic changes, natural course, complications, and management of a 2-year-old child with VSD.",
                    years = listOf("2025", "2018", "2013"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 2 + 3 + 2 + 3 + 3 = 15 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "439-442",
                    highYieldPoints = listOf(
                        "Anatomical Types: 1. Perimembranous (most common, ~75%); 2. Muscular (~20%, highest spontaneous closure rate); 3. Subarterial / Infundibular / Supracristal (~5%, risk of aortic regurgitation); 4. Inlet / AV canal type.",
                        "Hemodynamics: Left-to-right shunt -> pulmonary hyperperfusion -> volume overload of left atrium and left ventricle. Over time, pulmonary vascular remodeling can cause Eisenmenger syndrome (irreversible pulmonary hypertension with shunt reversal).",
                        "Auscultation: Harsh pansystolic murmur loudest at left lower sternal border with thrill (Maladie de Roger: smaller defect produces louder murmur).",
                        "Complications: Recurrent chest infections, heart failure, infective endocarditis, Eisenmenger syndrome, aortic regurgitation.",
                        "Management in 2yo: Medical management of CCF (Furosemide + Spironolactone, ACE inhibitors); Surgical patch closure or transcatheter device closure if failure to thrive, persistent cardiomegaly, or Qp:Qs >1.5:1."
                    ),
                    referenceLinks = emptyList(),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "peds_cvs_2",
                    subjectId = "paediatrics",
                    topicId = "peds_cvs",
                    topicName = "Cardiovascular System",
                    text = "Modified Jones criteria for the diagnosis of Acute Rheumatic Fever.",
                    years = listOf("2023", "2020", "2014"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "459",
                    highYieldPoints = listOf(
                        "Prerequisite: Evidence of antecedent Group A Streptococcal infection (high/rising ASO titer, positive rapid antigen test, or throat culture).",
                        "Major Criteria (JONES): J = Joints (Migratory polyarthritis in low risk, or monoarthritis/polyarthralgia in high risk); O = Carditis (Pancarditis, clinical or subclinical on echo); N = Subcutaneous Nodules; E = Erythema marginatum; S = Sydenham's Chorea.",
                        "Minor Criteria (PEACE): P = Previous RF or PR prolongation on ECG; E = Elevated acute phase reactants (ESR >=60 mm/hr, CRP >=3 mg/dL); A = Arthralgia (if not used as major); C = CRP; E = Elevated temperature / Fever (>=38.5°C in low risk, >=38°C in high risk).",
                        "Rule: 2 Major OR 1 Major + 2 Minor criteria with evidence of preceding GABS infection confirms diagnosis."
                    ),
                    referenceLinks = emptyList(),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "peds_cvs_3",
                    subjectId = "paediatrics",
                    topicId = "peds_cvs",
                    topicName = "Cardiovascular System",
                    text = "Management of Cyanotic (Hypoxic) spells in Tetralogy of Fallot.",
                    years = listOf("2017 S", "2012", "2010 S"),
                    type = QuestionType.SHORT_ANSWER,
                    marksBreakdown = "5 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "444, 447",
                    highYieldPoints = listOf(
                        "Mechanism: Spasm of infundibular pulmonary outflow tract -> abrupt increase in right-to-left shunting -> acute severe hypoxemia and acidosis.",
                        "Step 1: Knee-chest position (increases systemic vascular resistance, reduces right-to-left shunt).",
                        "Step 2: 100% High flow humidified oxygen via face mask.",
                        "Step 3: Morphine sulphate (0.1-0.2 mg/kg SC/IM) to suppress respiratory center hyperpnea and relieve infundibular spasm.",
                        "Step 4: IV fluid bolus (Normal Saline 10-20 mL/kg) to expand intravascular volume and promote pulmonary blood flow.",
                        "Step 5: IV Sodium bicarbonate (1-2 mEq/kg) to correct metabolic acidosis.",
                        "Step 6: IV Propranolol (0.1 mg/kg slow IV) or Esmolol for refractory spasm; Vasoconstrictor (Phenylephrine) to increase SVR."
                    ),
                    referenceLinks = emptyList(),
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "peds_endocrine",
            subjectId = "paediatrics",
            name = "Endocrine and Metabolic Disorders",
            description = "Thyroid hormone synthesis, Cretinism, and Congenital Hypothyroidism.",
            textbookChapter = "Chapter 17: Endocrine Disorders",
            standardPages = "pp. 535-550",
            questions = listOf(
                Question(
                    id = "peds_endo_1",
                    subjectId = "paediatrics",
                    topicId = "peds_endocrine",
                    topicName = "Endocrine Disorders",
                    text = "Discuss briefly the synthesis of thyroid hormones. Outline the clinical features and treatment of Cretinism (Congenital Hypothyroidism).",
                    years = listOf("2014 S", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "5 + 3 + 2 = 10 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "538",
                    highYieldPoints = listOf(
                        "Synthesis of Thyroid Hormones: 1. Iodide trapping (NIS pump in basolateral membrane); 2. Oxidation of iodide to iodine by Thyroid Peroxidase (TPO); 3. Organification (iodination of tyrosine residues on thyroglobulin to form MIT and DIT); 4. Coupling (MIT + DIT = T3; DIT + DIT = T4); 5. Storage in colloid and endocytosis/proteolysis for hormone release.",
                        "Clinical Features of Congenital Hypothyroidism: Prolonged physiological neonatal jaundice, lethargy, poor feeding, large protruding tongue (macroglossia), wide open posterior fontanelle (>0.5 cm), umbilical hernia, hypothermia, coarse facies, dry mottled skin, severe irreversible mental retardation if untreated.",
                        "Treatment: Immediate oral Levothyroxine (10-15 mcg/kg/day) initiated as soon as diagnosed (ideally within first 2 weeks of life on newborn screening); regular monitoring of serum Free T4 and TSH to optimize neurocognitive development."
                    ),
                    referenceLinks = emptyList(),
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "peds_sam_malnutrition",
            subjectId = "paediatrics",
            name = "Nutrition & Severe Acute Malnutrition (SAM)",
            description = "WHO 10-step protocol for management of Severe Acute Malnutrition (SAM), F-75 & F-100 diet, Vitamin A prophylaxis, and Kwashiorkor vs Marasmus.",
            textbookChapter = "Chapter 4: Nutrition and Nutritional Disorders",
            standardPages = "pp. 85-115",
            questions = listOf(
                Question(
                    id = "peds_sam_10steps",
                    subjectId = "paediatrics",
                    topicId = "peds_sam_malnutrition",
                    topicName = "Severe Acute Malnutrition",
                    text = "Define Severe Acute Malnutrition (SAM) as per WHO/IAP criteria. Outline the 10 Essential Steps of inpatient management of complicated SAM. What are the compositions and roles of Starter formula (F-75) and Catch-up formula (F-100)?",
                    years = listOf("2025", "2023", "2021", "2018", "2015", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 7 + 5 = 15 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "92-104",
                    highYieldPoints = listOf(
                        "WHO Diagnostic Criteria for SAM in Children (6-59 months): Any ONE of the following:",
                        "1. Weight-for-height / length Z-score < -3 SD (below -3 Z score of WHO child growth standards).",
                        "2. Mid-Upper Arm Circumference (MUAC) < 11.5 cm (115 mm - red zone on Shakir tape).",
                        "3. Presence of Bipedal Pitting Edema of nutritional origin (diagnostic of Kwashiorkor regardless of weight).",
                        "The 10 Essential Steps of Inpatient Facility-Based Management (Mnemonic: Help Prevent Cold Infections, Feed Rebuild Micronutrients, Catch-up Stimulate Discharge):",
                        "Phase 1 - Stabilization (Days 1 to 7):",
                        "1. Treat/Prevent Hypoglycemia: 10% Dextrose 5 mL/kg IV or 50 mL oral 10% sugar solution stat. Feed 2-hourly day and night.",
                        "2. Treat/Prevent Hypothermia: Room temperature 25-30 C; Kangaroo mother care (KMC) skin-to-skin; warm blankets.",
                        "3. Treat/Prevent Dehydration: Use ReSoMal (Rehydration Solution for Malnutrition: low sodium 45 mEq/L, high potassium 40 mEq/L); NEVER use standard WHO-ORS or rapid IV fluids due to high risk of acute heart failure.",
                        "4. Correct Electrolyte Imbalance: Extra Potassium (3-4 mEq/kg/day) and Magnesium (0.4-0.6 mEq/kg/day). DO NOT GIVE EXTRA SODIUM (total body sodium is high despite low serum sodium).",
                        "5. Treat/Prevent Infections: Broad-spectrum empiric antibiotics for all admitted SAM (Ampicillin + Gentamicin or Amoxicillin) even in the absence of fever, because inflammatory response is blunted.",
                        "6. Correct Micronutrient Deficiencies: Vitamin A stat dose on Day 1 (if ocular signs or measles); Folic acid 5 mg on Day 1 then 1 mg/day; Zinc 10-20 mg/day; Copper 0.3 mg/kg/day. CRITICAL: IRON MUST NOT BE GIVEN IN STABILIZATION PHASE (free iron promotes bacterial multiplication and free-radical damage; start iron only in rehabilitation phase once child has regained appetite).",
                        "7. Start Cautious Initial Feeding: Starter F-75 formula (75 kcal and 0.9 g protein per 100 mL) at 100-130 mL/kg/day.",
                        "Phase 2 - Rehabilitation (Weeks 2 to 6):",
                        "8. Achieve Catch-Up Growth: Transition from F-75 to Catch-up F-100 formula (100 kcal and 2.9 g protein per 100 mL) or Ready-to-Use Therapeutic Food (RUTF). Target weight gain: >10 g/kg/day.",
                        "9. Provide Sensory Stimulation and Emotional Support.",
                        "10. Prepare for Discharge and Follow-up: Immunization up to date; counseling mother on balanced feeding."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("WHO Guideline: Updates on the Management of Severe Acute Malnutrition", "https://www.who.int/", "Guideline")
                    ),
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "peds_hematology_thalassemia",
            subjectId = "paediatrics",
            name = "Pediatric Hematology: Thalassemia & Hemolytic Anemia",
            description = "Beta-thalassemia major, iron overload, iron chelation therapies, and packed RBC transfusion guidelines.",
            textbookChapter = "Chapter 13: Hematological Disorders",
            standardPages = "pp. 347-375",
            questions = listOf(
                Question(
                    id = "peds_thalassemia_major_1",
                    subjectId = "paediatrics",
                    topicId = "peds_hematology_thalassemia",
                    topicName = "Hemoglobinopathies",
                    text = "A 10-month-old child presents with progressive pallor, failure to thrive, hepatosplenomegaly, and 'chipmunk facies'. i) What is the most likely diagnosis? ii) Explain the pathophysiology of ineffective erythropoiesis. iii) Confirmative diagnostic investigations. iv) Protocol for hypertransfusion therapy and iron chelation.",
                    years = listOf("2024", "2022", "2020", "2017", "2014", "2011"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 4 + 3 + 6 = 15 Marks",
                    textbookRef = "OP Ghai (10th Ed)",
                    pageNumbers = "358-368",
                    highYieldPoints = listOf(
                        "Diagnosis: Beta Thalassemia Major (Cooley's Anemia).",
                        "Pathophysiology:",
                        "- Homozygous or compound heterozygous mutation in beta-globin gene (chromosome 11) resulting in absent (beta-0) or severely reduced (beta-+) synthesis of beta-globin chains.",
                        "- Excess unbound alpha-globin chains precipitate within developing erythroblasts in bone marrow -> membrane oxidation and premature intramedullary destruction of red cell precursors (Ineffective Erythropoiesis).",
                        "- Marked expansion of erythropoietic marrow causes skeletal deformities ('chipmunk facies': frontal and parietal bossing, prominent maxilla, depressed nasal bridge, malocclusion of teeth; X-ray skull shows 'Hair-on-end' appearance).",
                        "- Extramedullary hematopoiesis in liver and spleen leads to massive hepatosplenomegaly.",
                        "Diagnostic Evaluation:",
                        "- Complete Blood Count (CBC): Severe microcytic hypochromic anemia (Hb 3-6 g/dL), Mentzer index < 13 (MCV / RBC count).",
                        "- Peripheral Blood Smear: Marked anisopoikilocytosis, microcytosis, target cells, basophilic stippling, and numerous nucleated RBCs (normoblasts).",
                        "- High-Performance Liquid Chromatography (HPLC) / Hemoglobin Electrophoresis (GOLD STANDARD): Markedly elevated HbF (>70-95%), normal or variable HbA2, and absent or severely reduced adult HbA.",
                        "Transfusion & Chelation Protocol:",
                        "- Hypertransfusion Regimen: Leukocyte-depleted packed red blood cells (PRBCs) 10-15 mL/kg infused every 2 to 4 weeks to maintain pre-transfusion Hemoglobin >= 9.5 to 10.5 g/dL (suppresses endogenous ineffective erythropoiesis and prevents facial bone deformities).",
                        "- Iron Overload & Chelation Therapy: Each 1 mL of PRBC contains ~1 mg of elemental iron. Iron accumulates in heart (dilated cardiomyopathy/arrhythmias - #1 cause of death), liver (cirrhosis), and endocrine organs (growth failure, hypogonadism, diabetes mellitus).",
                        "- Chelation Initiation: Start chelation when serum ferritin > 1,000 ng/mL or after child has received 10-20 blood transfusions (usually around 2-3 years of age).",
                        "- Oral Iron Chelators: 1. Deferasirox (20-40 mg/kg once daily oral dispersible tablet - first-line drug of choice); 2. Deferiprone (75-100 mg/kg/day in 3 divided doses, superior for cardiac iron removal); 3. Deferoxamine (DFO: 30-50 mg/kg/day subcutaneous infusion over 8-12 hours via portable pump 5 nights/week)."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("IAP Guidelines on Management of Thalassemia", "https://www.iapindia.org/", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                )
            )
        )
    )
}
