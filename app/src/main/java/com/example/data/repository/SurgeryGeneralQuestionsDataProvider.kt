package com.example.data.repository

import com.example.data.model.*

object SurgeryGeneralQuestionsDataProvider {

    fun getGeneralTopics(): List<Topic> = listOf(
        Topic(
            id = "surg_wounds_burns_vascular",
            subjectId = "surgery",
            name = "General Surgery, Wounds, Burns & Vascular",
            description = "Varicose veins, venous ulcers, burns & Parkland formula, surgical site infections (SSI), burst abdomen, shock, haemorrhage, and blood transfusion.",
            textbookChapter = "Chapters 1-15: General Surgery, Wounds & Vascular Disorders",
            standardPages = "pp. 15-270",
            questions = listOf(
                Question(
                    id = "surg_gen_varicose_1",
                    subjectId = "surgery",
                    topicId = "surg_wounds_burns_vascular",
                    topicName = "Venous Disorders",
                    text = "A 50 year old gentleman, a bus conductor by profession, complained of pain and swelling in his left lower limb which was aggravated specially in the evening. On examination, there is a swelling in the course of great saphenous vein of the left lower limb with a 3 X 4 cm ulcer near the region of medial malleolus. i) Provisional diagnosis with reasons. ii) Course of great saphenous vein with tributaries in groin, thigh and leg. iii) Investigation to confirm diagnosis. iv) Principles of management of varicose veins and venous ulcer. v) Minimally invasive procedure.",
                    years = listOf("2025 P2", "2020 P2", "2019 P2", "2015 S P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 4 + 2 + 6 + 1 = 15 Marks",
                    textbookRef = "SRB (7th Ed)",
                    pageNumbers = "246, 257, 264, 266",
                    highYieldPoints = listOf(
                        "Diagnosis: Primary Varicose Veins of left lower limb with Venous (Stasis) Ulcer over medial malleolus (gaiter zone).",
                        "Great Saphenous Vein (GSV) Course: Originates from medial end of dorsal venous arch of foot -> ascends 2.5 cm anterior to medial malleolus -> medial border of tibia -> posterior to medial condyle of femur -> anteromedial thigh -> pierces cribriform fascia at saphenous opening (fossa ovalis, 4 cm inferolateral to pubic tubercle) to join femoral vein at Saphenofemoral Junction (SFJ).",
                        "Tributaries at Groin: Superficial circumflex iliac, Superficial epigastric, Superficial external pudendal, Deep external pudendal, Anterolateral vein of thigh, Posteromedial vein of thigh.",
                        "Investigation: Venous Duplex Doppler Ultrasound (assesses SFJ and SPJ competence, deep venous thrombosis/patency, and incompetence of perforators: Hunterian, Dodd, Boyd, Cockett).",
                        "Management: Conservative: 4-layer compression bandage (30-40 mmHg), limb elevation above heart level, unna boot, pentoxifylline; Surgery: Trendelenburg procedure (high saphenofemoral ligation and flush division of all tributaries) + stripping of GSV down to knee level; Perforator ligation (SEPS).",
                        "Minimally Invasive: Endovenous Laser Ablation (EVLA), Radiofrequency Ablation (RFA), Ultrasound-guided Foam Sclerotherapy (UGFS)."
                    ),
                    referenceLinks = listOf(ReferenceLink("NICE Varicose Veins Guideline (CG168)", "https://www.nice.org.uk/guidance/cg168", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "surg_gen_burns_1",
                    subjectId = "surgery",
                    topicId = "surg_wounds_burns_vascular",
                    topicName = "Burns & Resuscitation",
                    text = "Discuss the management of burns involving 25% BSA in a 50-year-old lady whose body weight is 55kg. Describe estimation of extent and depth of burns. Explain Parkland formula and dose distribution.",
                    years = listOf("2024", "2021 P1", "2019 S P1", "2017 S P1", "2015 S P1", "2013 P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "10 Marks",
                    textbookRef = "SRB (7th Ed)",
                    pageNumbers = "122, 123, 126, 127",
                    highYieldPoints = listOf(
                        "Assessment of Extent: Wallace's Rule of Nines: Head & Neck 9%, Each Upper Limb 9% (x2=18%), Anterior Trunk 18%, Posterior Trunk 18%, Each Lower Limb 18% (x2=36%), Perineum 1%; Lund and Browder chart in children; Patient's palm = 1% BSA.",
                        "Parkland (Baxter) Formula: Total IV Fluid in first 24 hours = 4 mL x Body Weight (kg) x % TBSA burned = 4 x 55 x 25 = 5,500 mL of Ringer's Lactate.",
                        "Dose Distribution: First half (2,750 mL) administered in the first 8 hours calculated from the TIME OF INJURY (not time of admission); Remaining half (2,750 mL) infused evenly over the next 16 hours.",
                        "Resuscitation Endpoint: Foley catheter hourly urine output monitoring (aim for 0.5 - 1.0 mL/kg/hr in adults, ~30-50 mL/h; 1 mL/kg/hr in children).",
                        "Wound Care: Topical Silver Sulfadiazine (1%) or Silver Nano cream, closed dressings, tetanus prophylaxis, analgesia, early enteral nutrition."
                    ),
                    referenceLinks = listOf(ReferenceLink("British Burn Association Resuscitation Protocol", "https://www.britishburnassociation.org/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "surg_gen_ssi_burst",
                    subjectId = "surgery",
                    topicId = "surg_wounds_burns_vascular",
                    topicName = "Surgical Infections & Abdominal Wall",
                    text = "Write down causes and management of Surgical Site Infection (SSI). Discuss management of burst abdomen. Define HAI, SIRS and bacteremia.",
                    years = listOf("2025 P1", "2020 P1", "2012 P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "5 + 5 = 10 Marks",
                    textbookRef = "SRB (7th Ed)",
                    pageNumbers = "76, 79, 796",
                    highYieldPoints = listOf(
                        "CDC Classification of SSI: 1. Superficial incisional (skin and subcutaneous tissue); 2. Deep incisional (fascia and muscle layers); 3. Organ/space (e.g. subphrenic abscess, pelvic abscess). Occurs within 30 days of surgery (or 90 days if implant placed).",
                        "Etiology & Risk Factors: Patient factors (diabetes, malnutrition, obesity, smoking, steroids, advanced age); Operative factors (prolonged surgery >2 hours, emergency surgery, contaminated/dirty wounds, poor surgical technique, hematoma/dead space).",
                        "Burst Abdomen (Wound Dehiscence): Separation of all layers of abdominal wound with evisceration of bowel contents; typically occurs on post-op day 6-8 preceded by serosanguinous 'salmon-pink' discharge on dressing.",
                        "Immediate Management of Burst Abdomen: Calm the patient, cover protruding viscera with sterile warm saline-soaked gauze (never attempt forceful manual reduction in the ward), IV analgesia and resuscitation, broad-spectrum antibiotics, nasogastric decompression.",
                        "Definitive Emergency Surgery: Emergency laparotomy under GA, peritoneal lavage, inspecting bowel viability, tension-free closure using mass closure technique (Jenkins rule: suture length 4x wound length, bites 1 cm from edge, 1 cm apart using continuous non-absorbable No. 1 Prolene/Polyamide) or deep tension nylon sutures with silicone bolsters."
                    ),
                    referenceLinks = listOf(ReferenceLink("WHO Global Guidelines for Prevention of SSI", "https://www.who.int/", "Guideline")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "surg_gen_shock_transfusion",
                    subjectId = "surgery",
                    topicId = "surg_wounds_burns_vascular",
                    topicName = "Shock & Transfusion Medicine",
                    text = "Define shock. Etiological classification of shock. Pathogenesis and management of septic shock. Complications of massive blood transfusion.",
                    years = listOf("2023 P1", "2021 P1", "2019 P1", "2016 P1", "2014 P1", "2014 S P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "5 + 5 + 5 = 15 Marks",
                    textbookRef = "SRB (7th Ed)",
                    pageNumbers = "83, 86-87, 97-99",
                    highYieldPoints = listOf(
                        "Definition: A state of systemic tissue hypoperfusion resulting in end-organ cellular hypoxia and cellular dysoxia.",
                        "Classification: Hypovolemic (hemorrhagic, burns, dehydration), Cardiogenic (MI, arrhythmias), Distributive (septic, anaphylactic, neurogenic), Obstructive (tension pneumothorax, cardiac tamponade, massive PE).",
                        "Septic Shock: Sepsis with persistent hypotension requiring vasopressors to maintain MAP >= 65 mmHg and serum lactate > 2 mmol/L despite adequate fluid resuscitation.",
                        "Surviving Sepsis Hour-1 Bundle: 1. Measure blood lactate level; 2. Obtain blood cultures prior to antibiotics; 3. Administer broad-spectrum empiric IV antibiotics; 4. Rapid infusion of 30 mL/kg crystalloid for hypotension or lactate >= 4 mmol/L; 5. Apply vasopressors (Norepinephrine first choice) if hypotensive during or after fluid resuscitation to maintain MAP >= 65 mmHg.",
                        "Massive Blood Transfusion: Transfusion of >=10 units of packed RBCs in 24 hours (or replacement of patient's total blood volume in 24 hours); Complications: Hypothermia, hyperkalemia (leakage from stored RBCs), hypocalcemia and hypomagnesemia (citrate toxicity), coagulopathy (dilution of platelets and factors V & VIII), metabolic acidosis, TRALI, TACO."
                    ),
                    referenceLinks = listOf(ReferenceLink("Surviving Sepsis Campaign Guidelines", "https://www.sccm.org/", "Guideline")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "surg_gen_arterial_1",
                    subjectId = "surgery",
                    topicId = "surg_wounds_burns_vascular",
                    topicName = "Arterial Disorders & Gangrene",
                    text = "Define intermittent claudication and its Fontaine/Rutherford grading. Discuss diagnosis and management of Buerger's disease (TAO) with dry gangrene of great toe.",
                    years = listOf("2021 P2", "2019 S P2", "2018 P1", "2016 S P1", "2010 S P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 5 + 8 = 15 Marks",
                    textbookRef = "SRB (7th Ed)",
                    pageNumbers = "193, 205, 231, 232",
                    highYieldPoints = listOf(
                        "Intermittent Claudication: Cramping pain, ache, or fatigue in a muscle group of the limb induced by exercise/walking and relieved within minutes of rest, caused by arterial insufficiency.",
                        "Fontaine Classification: Stage I: Asymptomatic; Stage II: Intermittent claudication (IIa: claudication distance >200 m, IIb: <200 m); Stage III: Rest pain (night pain in foot relieved by hanging foot off the bed); Stage IV: Tissue loss, ulceration, or gangrene.",
                        "Buerger's Disease (Thromboangiitis Obliterans - TAO): Non-atherosclerotic segmental panarteritis and thrombophlebitis of small and medium-sized vessels of extremities in young male heavy smokers (<45 years).",
                        "Management: 1. MANDATORY, IMMEDIATE COMPLETE CESSATION OF ALL TOBACCO/SMOKING (single most effective therapy to stop disease progression); 2. Prostaglandin analogues (IV Iloprost infusion) to improve microcirculation; 3. Lumbar sympathectomy (L2-L4 ganglionectomy) to relieve vasospastic rest pain and heal superficial ulcers; 4. Auto-amputation or conservative surgical debridement of well-demarcated dry gangrene of toe."
                    ),
                    referenceLinks = listOf(ReferenceLink("ESVS Peripheral Arterial Disease Guidelines", "https://www.esvs.org/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "surg_gen_short_notes",
                    subjectId = "surgery",
                    topicId = "surg_wounds_burns_vascular",
                    topicName = "General Surgery Short Notes",
                    text = "High-Yield Short Notes: 1. Mismatched blood transfusion; 2. Ankle Brachial Pressure Index (ABPI); 3. Marjolin's ulcer; 4. Keloid vs Hypertrophic scar; 5. FAST; 6. Axonotmesis; 7. Split-thickness skin graft; 8. Diabetic foot.",
                    years = listOf("2025 P1", "2025 P2", "2024", "2023", "2021", "2019", "2016", "2013"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 Marks each",
                    textbookRef = "SRB (7th Ed)",
                    pageNumbers = "24, 26, 28, 41, 98, 145, 194, 292, 323, 358",
                    highYieldPoints = listOf(
                        "Mismatched Transfusion: ABO incompatibility causes immediate intravascular hemolysis; under GA, presenting signs are unexplained hypotension, oozing from surgical field, and dark 'burgundy/coca-cola' colored urine in catheter bag; stop transfusion immediately, push fluids and furosemide, alkalinize urine with sodium bicarbonate.",
                        "ABPI: Ratio of systolic BP in ankle (dorsalis pedis/posterior tibial) to systolic BP in brachial artery; Normal: 0.9 - 1.2; Claudication: 0.5 - 0.9; Critical limb ischemia: <0.5; In diabetic patients, values >1.3 indicate falsely elevated readings due to Mönckeberg's medial calcific sclerosis.",
                        "Marjolin's Ulcer: Squamous cell carcinoma arising in long-standing, chronic, non-healing scars (especially post-burn contractures, chronic osteomyelitis sinus, or venous stasis ulcers); characterized by everted margins, foul discharge, lack of pain (destruction of cutaneous nerve endings), and slow lymphatic spread due to scar obliteration of lymphatics.",
                        "Keloid vs Hypertrophic Scar: Keloid extends beyond boundaries of original wound, rarely regresses, predilection for sternum/earlobe/dark skins, collagen type I/III disorganized thick whorls; Hypertrophic scar stays within wound margins, improves over time, occurs in flexor creases across Langer's lines."
                    ),
                    referenceLinks = listOf(ReferenceLink("SRB Manual of Surgery Online", "https://asiindia.org/", "Textbook"))
                )
            )
        )
    )
}
