package com.example.data.repository

import com.example.data.model.*

object ObsQuestionsDataProvider {

    fun getTopics(): List<Topic> = listOf(
        Topic(
            id = "obg_obs_emergencies",
            subjectId = "obs_gyn",
            name = "Obstetric Emergencies, Labour & Delivery",
            description = "Postpartum haemorrhage (PPH), AMTSL, pre-eclampsia & eclampsia (Pritchard regimen), antepartum haemorrhage (Placenta previa vs Abruptio), uterine scar rupture, breech & ECV, normal labour, WHO partograph, and multiple gestation.",
            textbookChapter = "Chapters 12-28: DC Dutta Obstetrics (10th Ed)",
            standardPages = "pp. 107-425",
            questions = listOf(
                Question(
                    id = "obg_obs_pph_amtsl",
                    subjectId = "obs_gyn",
                    topicId = "obg_obs_emergencies",
                    topicName = "Obstetric Emergencies",
                    text = "Define Post-Partum Haemorrhage (PPH). What are the causes of primary PPH? Discuss the active management of third stage of labour (AMTSL) and step-ladder management of atonic PPH.",
                    years = listOf("2025", "2024", "2022", "2020 P1", "2018 P1", "2014 S P1", "2012 S P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 4 + 4 + 5 = 15 Marks",
                    textbookRef = "DC Dutta Obs (10th Ed)",
                    pageNumbers = "132, 386, 390-394",
                    highYieldPoints = listOf(
                        "Definition of PPH: Blood loss >=500 mL following vaginal delivery or >=1000 mL following caesarean section, or any blood loss causing hemodynamic instability within 24 hours (Primary PPH). Secondary PPH occurs after 24 hours up to 6-12 weeks postpartum.",
                        "Causes (The 4 T's): 1. Tone (Uterine atony - accounts for 70-80% of cases); 2. Trauma (cervical, vaginal, perineal lacerations, uterine rupture); 3. Tissue (retained cotyledons, placenta accreta spectrum, succenturiate lobe); 4. Thrombin (coagulopathies, DIC, severe abruption).",
                        "Active Management of Third Stage of Labour (AMTSL - WHO 3 Steps): 1. Prophylactic uterotonic: Oxytocin 10 IU IM within 1 minute of fetal delivery; 2. Controlled Cord Traction (CCT / Brandt-Andrews technique) with counter-traction directed cephalad on anterior abdominal wall; 3. Uterine fundal massage immediately after placental expulsion and repeated every 15 min for 2 hours.",
                        "Step-Ladder Management of Atonic PPH:",
                        "1. Bedside Resuscitation: Two wide-bore (14-16G) IV cannulae, crystalloid infusion, cross-match 4 units PRBCs, empty bladder with Foley catheter, bimanual uterine compression (Hamilton manoeuvre).",
                        "2. Pharmacotherapy: IV Oxytocin (20-40 IU in 1L NS at 250 mL/hr) -> Methergine 0.2 mg IM (STRICTLY CONTRAINDICATED IN HYPERTENSION/PRE-ECLAMPSIA) -> Carboprost (PGF2-alpha 250 mcg IM q15min max 8 doses; CONTRAINDICATED IN ASTHMA) -> Misoprostol 800 mcg sublingual/rectal.",
                        "3. Mechanical / Tamponade: Bakri intrauterine balloon tamponade (instill 300-500 mL sterile warm saline; tamponade test positive if bleeding ceases) or Condom balloon catheter.",
                        "4. Surgical Interventions: B-Lynch compressive uterine brace suture (or Hayman suture); Bilateral uterine artery ligation (O'Leary); Bilateral internal iliac (hypogastric) artery ligation; Emergency Peripartum Hysterectomy (life-saving measure of last resort)."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("WHO Recommendations on Prevention and Treatment of PPH", "https://www.who.int/", "Guideline")
                    ),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_obs_eclampsia_pritchard",
                    subjectId = "obs_gyn",
                    topicId = "obg_obs_emergencies",
                    topicName = "Hypertensive Disorders of Pregnancy",
                    text = "A 22-year-old primigravida at 36 weeks gestation is brought to the labour ward with generalized tonic-clonic convulsions and BP 165/112 mmHg. Provisional diagnosis, complications, management protocol, and detailed Pritchard Magnesium Sulphate (MgSO4) regimen.",
                    years = listOf("2025", "2024", "2021 P1", "2018 P1", "2017 P1", "2015 S P1", "2012 P1", "2010 P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 3 + 5 + 5 = 15 Marks",
                    textbookRef = "DC Dutta Obs (10th Ed)",
                    pageNumbers = "213, 221-224",
                    highYieldPoints = listOf(
                        "Diagnosis: Eclampsia (new-onset generalized convulsions in a woman with pre-eclampsia, unrelated to other cerebral conditions).",
                        "Maternal & Fetal Complications: Maternal: Intracranial hemorrhage (leading cause of death), pulmonary edema, acute kidney injury, HELLP syndrome (Hemolysis, Elevated Liver enzymes, Low Platelets), retinal detachment, abruptio placentae; Fetal: Prematurity, severe IUGR, fetal hypoxia, intrauterine demise.",
                        "Pritchard Regimen of Magnesium Sulphate (MgSO4):",
                        "Loading Dose (Total 14 g): 4 g IV (as 20% solution) slowly over 5-10 minutes + 10 g IM (5 g of 50% solution injected deeply into each buttock with 1 mL of 2% lignocaine).",
                        "Maintenance Dose: 5 g IM (50% solution) into alternate buttocks every 4 hours, continued until 24 hours after delivery or 24 hours after the last convulsion, whichever is later.",
                        "Mandatory Pre-requisite Clinical Checks before EVERY maintenance dose: 1. Patellar / Knee jerk reflex MUST be present; 2. Respiratory rate MUST be >= 16 breaths/minute; 3. Hourly urine output MUST be >= 30 mL/hour (or >=100 mL in preceding 4 hours).",
                        "Antidote for MgSO4 Toxicity (Respiratory depression / loss of reflexes): 10 mL of 10% Calcium Gluconate IV slowly over 10 minutes.",
                        "Antihypertensive Control: Oral Labetalol (100-200 mg) or IV Labetalol (20 mg bolus, doubling every 10 min to max 220 mg) or oral Nifedipine (10 mg tablet swallowed, not sublingual) to maintain systolic BP 140-150 mmHg and diastolic 90-100 mmHg.",
                        "Definitive Cure: DELIVERY OF THE BABY AND PLACENTA regardless of gestational age once maternal stabilization is achieved."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("FOGSI Recommendations on Management of Eclampsia", "https://www.fogsi.org/", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_obs_aph_previa_abruptio",
                    subjectId = "obs_gyn",
                    topicId = "obg_obs_emergencies",
                    topicName = "Antepartum Haemorrhage",
                    text = "Define Antepartum Haemorrhage (APH). Differentiate clinically between Placenta Previa and Abruptio Placentae. Outline the management of Type III/IV Placenta Previa presenting at 34 weeks of gestation.",
                    years = listOf("2025", "2024", "2022", "2019", "2017", "2015", "2013", "2011"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 5 + 8 = 15 Marks",
                    textbookRef = "DC Dutta Obs (10th Ed)",
                    pageNumbers = "230-244",
                    highYieldPoints = listOf(
                        "Definition: Bleeding from or into the genital tract after 28 weeks of gestation (the period of fetal viability) up to the birth of the baby.",
                        "Clinical Differentiation Table:",
                        "Placenta Previa: Bleeding is painless, causeless, recurrent, and bright red; general condition corresponds strictly to visible blood loss; uterus is soft, relaxed, and non-tender; fetal parts easily palpable; fetal heart rate (FHR) usually normal; malpresentations (breech/transverse) very common; high presenting part.",
                        "Abruptio Placentae: Bleeding is painful, associated with pre-eclampsia or trauma, dark port-wine coloured (may be concealed); general condition disproportionately worse than visible bleeding (shock out of proportion); uterus is tense, tender, 'woody hard' with board-like rigidity; fetal parts difficult to palpate; FHR distressed or absent.",
                        "CARDINAL GOLDEN RULE: DIGITAL VAGINAL EXAMINATION IS STRICTLY FORBIDDEN IN ANY CASE OF ANTEPARTUM HAEMORRHAGE (can cause torrential, fatal exsanguination). Speculum examination done only in OT under double set-up after placenta previa is ruled out on USG.",
                        "Management of Placenta Previa at 34 weeks (MacAfee & Johnson Expectant Regimen):",
                        "Criteria: Patient hemodynamically stable, active bleeding has ceased, fetus alive and premature (<37 weeks).",
                        "Protocol: Strict bed rest, cross-matched packed RBCs ready, Antenatal Corticosteroids (IM Dexamethasone 6 mg 12-hourly x 4 doses) to promote fetal lung surfactant production; weekly USG monitoring; elective Caesarean section at 37 completed weeks.",
                        "Emergency Indication: If profuse/uncontrolled bleeding occurs or patient goes into active labour -> immediate emergency Caesarean delivery irrespective of maturity."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("RCOG Green-top Guideline No. 27: Placenta Praevia and Placenta Accreta", "https://www.rcog.org.uk/", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_obs_scar_rupture_vbac",
                    subjectId = "obs_gyn",
                    topicId = "obg_obs_emergencies",
                    topicName = "Previous Caesarean & Scar Integrity",
                    text = "A 28-year-old G2P1L1 with a previous Lower Segment Caesarean Section (LSCS) presents at 38 weeks with labour pains. i) Admission protocol; ii) Differentiate lower segment vs upper segment scar; iii) What is scar dehiscence vs true rupture? iv) Clinical signs of impending uterine rupture; v) Selection criteria for VBAC / TOLAC.",
                    years = listOf("2025", "2022", "2020 P1", "2018 P1", "2016", "2013"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 3 + 3 + 4 + 3 = 15 Marks",
                    textbookRef = "DC Dutta Obs (10th Ed)",
                    pageNumbers = "315, 402-404, 558",
                    highYieldPoints = listOf(
                        "Admission Protocol: Immediate admission to labour room, baseline bloods (CBC, blood grouping, cross-matching 2 units PRBCs), continuous electronic fetal monitoring (CTG), IV access with 16G cannula, avoid prolonged active phase (>12 hours).",
                        "Lower vs Upper Segment Scar: Lower Segment Transverse (Kerr): Low rupture risk (0.5-0.7%), rupture occurs during labour, blood loss minimal, healing is by fibrous tissue in non-contractile zone. Classical Upper Segment Vertical: High rupture risk (4-9%), can rupture catastrophically before labour (32-34 weeks), severe intraperitoneal haemorrhage with high maternal-fetal mortality.",
                        "Scar Dehiscence vs Rupture: Dehiscence (occult/incomplete): Separation of myometrium while the overlying visceral peritoneum remains intact; fetus and placenta remain inside; usually asymptomatic. True Uterine Rupture: Disruption of all uterine layers including serosa, communication with peritoneal cavity, extrusion of fetus/placenta into abdomen, massive hemoperitoneum.",
                        "Signs of Impending / Actual Rupture: 1. Constant severe localized pain and tenderness over lower uterine segment; 2. Bandl's pathological retraction ring; 3. Fetal heart rate abnormalities (severe prolonged bradycardia is the single most reliable sign); 4. Cessation of uterine contractions; 5. Loss of fetal station (receding of presenting part on vaginal examination); 6. Maternal tachycardia, hypotension, and hematuria (involvement of bladder base).",
                        "Selection Criteria for Trial of Labour After Caesarean (TOLAC/VBAC): Single previous low transverse LSCS, non-recurrent previous indication (e.g. breech, fetal distress), singleton pregnancy with cephalic presentation, clinically adequate pelvis, 24-hour facility for immediate emergency LSCS within 15-30 minutes."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("ACOG Practice Bulletin No. 205: Vaginal Birth After Cesarean Delivery", "https://www.acog.org/", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_obs_breech_ecv",
                    subjectId = "obs_gyn",
                    topicId = "obg_obs_emergencies",
                    topicName = "Malpresentation & Version",
                    text = "Classify breech presentation. What is External Cephalic Version (ECV)? Mention timing, prerequisites, contraindications, and steps. Detail the Mauriceau-Smellie-Veit and Løvset's manoeuvres for assisted breech delivery.",
                    years = listOf("2025", "2021", "2018", "2015", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 5 + 4 + 4 = 15 Marks",
                    textbookRef = "DC Dutta Obs (10th Ed)",
                    pageNumbers = "354, 359-360, 364, 543",
                    highYieldPoints = listOf(
                        "Classification of Breech: 1. Frank (extended) breech (thighs flexed, legs extended over anterior trunk - 65-70%); 2. Complete (flexed) breech (both thighs and knees flexed - 25-30%); 3. Incomplete / Footling breech (one or both feet/knees presenting below buttocks).",
                        "External Cephalic Version (ECV): Transabdominal manipulation of the fetus from breech to cephalic presentation. Timing: 36 weeks in nullipara, 37 weeks in multipara. Prerequisites: Singleton, reactive non-stress test, normal liquor volume (AFI >8-10 cm), facilities for immediate emergency LSCS. Tocolysis: SC Terbutaline 0.25 mg 15 min prior. Rh-negative mothers must receive Anti-D.",
                        "Absolute Contraindications: Antepartum haemorrhage, oligohydramnios, previous classical caesarean, multiple pregnancy, ruptured membranes, severe pre-eclampsia, non-reassuring fetal status.",
                        "Løvset's Manoeuvre (for Extended / Arrested Arms): Grasp baby's pelvis with thumbs on sacrum and rotate the fetal trunk through 180 degrees keeping back uppermost; the posterior shoulder rotates anteriorly and appears beneath the pubic arch, allowing delivered arm to be swept across chest.",
                        "Mauriceau-Smellie-Veit (MSV) Manoeuvre (for Delivery of Aftercoming Head): Fetus rests prone along operator's forearm; middle finger of that hand placed in fetal mouth (or index & middle fingers on maxillae) to maintain flexion of the head; index and ring fingers of other hand placed over fetal shoulders (suboccipital region) to exert gentle downward traction until occiput pivots under pubic symphysis, followed by upward traction to deliver face over perineum."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("RCOG Green-top Guideline No. 20a: External Cephalic Version", "https://www.rcog.org.uk/", "Guideline")
                    ),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_obs_partograph_labour",
                    subjectId = "obs_gyn",
                    topicId = "obg_obs_emergencies",
                    topicName = "Normal Labour & Partograph",
                    text = "Define stages of normal labour. Describe the components of the Modified WHO Partograph and explain Alert and Action lines. What is the updated WHO Labour Care Guide (LCG)?",
                    years = listOf("2025", "2024", "2022", "2019", "2017", "2014"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 5 + 4 + 3 = 15 Marks",
                    textbookRef = "DC Dutta Obs (10th Ed)",
                    pageNumbers = "107, 110, 114, 478-482",
                    highYieldPoints = listOf(
                        "Four Stages of Labour: 1st Stage (Cervical dilatation): From onset of true labour pains to full dilatation of cervix (10 cm); avg 12 hours in nullipara, 6 hours in multipara; 2nd Stage (Fetal expulsion): From full cervical dilatation to expulsion of fetus (1-2 hours); 3rd Stage (Placental delivery): From birth of baby to delivery of placenta and membranes (15-30 min); 4th Stage (Observation): First 1 hour post-delivery for maternal monitoring.",
                        "Modified WHO Partograph Components:",
                        "1. Fetal Condition: Fetal heart rate (every 30 min, normal 110-160 bpm), status of amniotic membranes & liquor (I = intact, C = clear, M = meconium, B = blood), and degree of moulding (0, +, ++, +++).",
                        "2. Labour Progress (Cervicograph): Cervical dilatation plotted with 'X' and fetal head descent plotted with 'O'. Alert Line: Begins at 4 cm dilatation and ascends at 1 cm/hour to 10 cm. Action Line: Drawn 4 hours to the right of and parallel to the Alert Line.",
                        "Significance: If cervical dilation crosses to the right of the Alert Line -> warning of prolonged latent/active phase; if it touches or crosses the Action Line -> abnormal progress requiring active intervention (augmentation with oxytocin, ARM, or Caesarean section for cephalopelvic disproportion).",
                        "3. Maternal Condition: Pulse (every 30 min), BP and temperature (every 4 hours), urine output, protein, acetone, and oxytocin drops/min.",
                        "WHO Labour Care Guide (LCG): Replaced the 4 cm threshold with 5 cm as the start of active first stage; emphasizes shared decision-making, supportive companionship, and non-pharmacological pain relief."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("WHO Labour Care Guide: User's Manual", "https://www.who.int/", "Guideline")
                    ),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_obs_twins_multi",
                    subjectId = "obs_gyn",
                    topicId = "obg_obs_emergencies",
                    topicName = "Multiple Gestation",
                    text = "A 26-year-old primigravida presents with uterine size much larger than dates at 28 weeks. Diagnosis of twin pregnancy, differentiation of chorionicity, Twin-to-Twin Transfusion Syndrome (TTTS), maternal-fetal complications, and delivery protocol.",
                    years = listOf("2025", "2023", "2020", "2017", "2014", "2011"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 3 + 4 + 3 + 3 = 15 Marks",
                    textbookRef = "DC Dutta Obs (10th Ed)",
                    pageNumbers = "188, 192-198, 204",
                    highYieldPoints = listOf(
                        "Diagnosis: Twin Pregnancy (Multiple Gestation). Clinical signs: Fundal height > gestational age, two fetal poles and multiple fetal parts palpated, two distinct fetal heart sounds heard with a difference of >10 bpm by two observers.",
                        "Chorionicity Ultrasound Signs (best at 11-14 weeks): Dichorionic Diamniotic (DCDA): 'Lambda sign' / 'Twin-peak sign' (thick intervening membrane >2 mm); Monochorionic Diamniotic (MCDA): 'T-sign' (thin intervening membrane <2 mm); Monochorionic Monoamniotic (MCMA): No intervening membrane.",
                        "Twin-to-Twin Transfusion Syndrome (TTTS in MCDA twins): Caused by deep unbalanced arteriovenous anastomoses in shared placenta. Donor Twin: Hypovolemic, oliguric, severe oligohydramnios ('stuck twin'), IUGR, anemia. Recipient Twin: Hypervolemic, polyuric, polyhydramnios, polycythemia, cardiomegaly, hydrops fetalis. Treatment: Fetoscopic Laser Photocoagulation of anastomotic vessels (gold standard).",
                        "Maternal & Fetal Complications: Maternal: Hyperemesis, severe pre-eclampsia (3x higher), GDM, severe anemia, hydramnios, APH, atonic PPH. Fetal: Prematurity (leading cause of mortality), IUGR, discordance, congenital malformations, cord entanglement (in MCMA twins).",
                        "Delivery Protocol: Vertex-Vertex (40%): Vaginal delivery in OT with continuous electronic monitoring. After 1st baby born, clamp cord immediately to avoid exsanguination in monochorionic twin; lie of 2nd baby checked -> if longitudinal, perform ARM with contraction; deliver 2nd twin within 15-30 min. Vertex-Non-vertex: External or internal podalic version of 2nd twin or LSCS. Non-vertex presenting 1st twin: Elective LSCS (avoids interlocking of twins)."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("ISUOG Practice Guidelines: Role of Ultrasound in Twin Pregnancy", "https://www.isuog.org/", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_obs_obstructed_labour",
                    subjectId = "obs_gyn",
                    topicId = "obg_obs_emergencies",
                    topicName = "Dystocia & Obstructed Labour",
                    text = "What is obstructed labour? Mention causes. Describe clinical features, Bandl's pathological retraction ring, complications (VVF), and immediate management.",
                    years = listOf("2024", "2021", "2018", "2015", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 3 + 5 + 2 + 3 = 15 Marks",
                    textbookRef = "DC Dutta Obs (10th Ed)",
                    pageNumbers = "345-352, 400",
                    highYieldPoints = listOf(
                        "Definition: Labour where despite good, strong uterine contractions, there is no advance of the presenting part down the birth canal due to mechanical obstruction.",
                        "Causes: Maternal: Cephalopelvic disproportion (contracted pelvis), pelvic tumours (fibroid in lower uterine segment), cervical stenosis; Fetal: Deep transverse arrest, persistent occipitoposterior, brow/face presentation with mentoposterior, hydrocephalus, fetal ascites, conjoined twins.",
                        "Pathognomonic Sign - Bandl's Retraction Ring: An exaggerated, prominent physiological retraction ring between the upper active contracting segment and lower thinned-out distended passive segment; visible and palpable as an oblique ridge rising up towards the umbilicus, tender to touch, accompanied by ballooned lower segment.",
                        "Clinical Features: Exhausted dehydrated mother with high pulse, dry tongue, ketoacidosis; uterus tightly applied around fetus with frequent colicky contractions; Caput succedaneum large with severe skull bone moulding (+++); vulval edema; dark foul-smelling liquor; bloody urine.",
                        "Complications: Maternal: Rupture of uterus, septic peritonitis, septic shock, Vesicovaginal Fistula (VVF) due to prolonged ischemic necrosis of bladder base between fetal head and pubic bone; Fetal: Severe birth asphyxia, intracranial hemorrhage, stillbirth.",
                        "Management: Immediate aggressive IV crystalloid resuscitation, broad-spectrum IV antibiotics (Ceftriaxone + Metronidazole), Foley catheter drainage (relieves bladder and checks hematuria), and EMERGENCY CAESAREAN SECTION. Instrument delivery (forceps/vacuum) is STRICTLY CONTRAINDICATED."
                    ),
                    referenceLinks = emptyList(),
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "obg_obs_medical_disorders",
            subjectId = "obs_gyn",
            name = "Antenatal Care & Medical Disorders in Pregnancy",
            description = "Gestational Diabetes Mellitus (DIPSI), severe anaemia in pregnancy & iron sucrose, cardiac disease in pregnancy, Rh isoimmunisation, Bishop score, and obstetric short notes.",
            textbookChapter = "Chapters 19-23: DC Dutta Obstetrics (10th Ed)",
            standardPages = "pp. 246-330",
            questions = listOf(
                Question(
                    id = "obg_obs_gdm_dipsi",
                    subjectId = "obs_gyn",
                    topicId = "obg_obs_medical_disorders",
                    topicName = "Metabolic Disorders in Pregnancy",
                    text = "A 28-year-old 2nd gravida with a history of delivering a 4.2 kg baby attends ANC at 24 weeks. i) Diagnostic criteria for Gestational Diabetes Mellitus (GDM) using DIPSI guidelines; ii) Maternal and fetal complications; iii) Antenatal, intrapartum, and postpartum management.",
                    years = listOf("2025", "2024", "2023", "2020", "2018", "2015", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 5 + 7 = 15 Marks",
                    textbookRef = "DC Dutta Obs (10th Ed)",
                    pageNumbers = "258-266",
                    highYieldPoints = listOf(
                        "DIPSI (Diabetes in Pregnancy Study Group India) Criteria: Single-step, non-fasting test. Pregnant woman is given 75 g anhydrous oral glucose in 200-300 mL water regardless of the time of her last meal. A 2-hour venous plasma glucose >= 140 mg/dL (7.8 mmol/L) is diagnostic of GDM.",
                        "Maternal Complications: Pre-eclampsia (increased 2-4 fold), polyhydramnios (osmotic diuresis from fetal hyperglycemia), candidal vulvovaginitis, operative delivery / LSCS, atonic PPH, future risk of overt Type 2 DM (50% in 10 years).",
                        "Fetal & Neonatal Complications: Macrosomia (birth weight >4 kg, causing shoulder dystocia and brachial plexus injury), asymmetric septal cardiomyopathy, fetal demise (sudden intrauterine death due to fetal lactic acidosis and hyperinsulinism), Neonatal: Hypoglycemia (blood glucose <40 mg/dL due to persistent beta-cell hyperplasia after cord clamping), respiratory distress syndrome (fetal hyperinsulinism inhibits surfactant production by type II pneumocytes), hyperbilirubinemia, polycythemia, hypocalcemia.",
                        "Management Protocol:",
                        "1. Medical Nutrition Therapy (MNT): 1800-2200 kcal/day (50% complex carbs, 20% protein, 30% fat), moderate physical activity.",
                        "2. Glycemic Targets: Fasting blood glucose <95 mg/dL, 1-hour post-meal <140 mg/dL, 2-hour post-meal <120 mg/dL.",
                        "3. Pharmacotherapy: If targets not met with MNT in 2 weeks -> Insulin (Regular + NPH or Lispro/Aspart/Glargine) or Metformin.",
                        "4. Delivery: Elective delivery at 38-39 weeks; during labour, glucose-insulin-potassium (GIK) infusion keeping blood glucose between 80-110 mg/dL.",
                        "5. Postpartum: Stop insulin immediately after placental delivery; perform 75g OGTT at 6-12 weeks postpartum."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("DIPSI Guidelines for Gestational Diabetes Mellitus", "https://www.dipsi.in/", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_obs_anaemia_iron",
                    subjectId = "obs_gyn",
                    topicId = "obg_obs_medical_disorders",
                    topicName = "Hematological Disorders in Pregnancy",
                    text = "A 20-year-old primigravida at 34 weeks of gestation presents with extreme lethargy and pallor. Hemoglobin is 6.2 g/dL with microcytic hypochromic indices. i) Classification of anaemia in pregnancy; ii) Ganzoni formula for parenteral iron sucrose calculation; iii) Management of severe anaemia at 36 weeks near term.",
                    years = listOf("2025", "2024", "2021", "2019", "2016", "2014", "2010"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 4 + 8 = 15 Marks",
                    textbookRef = "DC Dutta Obs (10th Ed)",
                    pageNumbers = "246-256",
                    highYieldPoints = listOf(
                        "WHO Classification of Anaemia in Pregnancy: Normal: Hb >= 11 g/dL; Mild: 10.0 - 10.9 g/dL; Moderate: 7.0 - 9.9 g/dL; Severe: 4.0 - 6.9 g/dL; Very Severe: < 4.0 g/dL (congestive heart failure risk).",
                        "Ganzoni Formula for Total Iron Deficit (mg):",
                        "Total Iron Deficit (mg) = Body Weight (kg) x [Target Hb (11 g/dL) - Actual Hb (g/dL)] x 2.4 + Iron Stores (500 mg).",
                        "Example: 50 kg woman with Hb 6.2 g/dL -> 50 x (11 - 6.2) x 2.4 + 500 = 50 x 4.8 x 2.4 + 500 = 576 + 500 = 1076 mg (~1100 mg of elemental iron, administered as IV Iron Sucrose 200 mg in 200 mL NS over 30 min on alternate days, or Ferric Carboxymaltose 1000 mg single infusion).",
                        "Management of Severe Anaemia Near Term (at 36 weeks):",
                        "Iron therapy takes 3-4 weeks to raise Hb substantially; at 36 weeks, time is insufficient. Packed Red Blood Cell (PRBC) Transfusion is indicated under diuretic cover (IV Furosemide 20 mg with each unit) to avoid circulatory overload and pulmonary edema.",
                        "Intrapartum Protocol: Strict bed rest, propped-up position, oxygen mask, cut short second stage of labour using prophylactic low forceps or vacuum delivery, active management of third stage (AMTSL) with Oxytocin to prevent any blood loss (Methergine avoided in cardiac strain)."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("Anemia Mukt Bharat Guidelines for Pregnancy", "https://anemiamuktbharat.info/", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_obs_heart_disease",
                    subjectId = "obs_gyn",
                    topicId = "obg_obs_medical_disorders",
                    topicName = "Cardiovascular Disease in Pregnancy",
                    text = "Discuss the hemodynamic changes during pregnancy in a patient with Rheumatic Heart Disease (Mitral Stenosis). Mention NYHA classification, high-risk cardiac conditions, and management of labour in a cardiac patient.",
                    years = listOf("2024", "2022", "2019", "2017", "2013", "2010"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "4 + 3 + 3 + 5 = 15 Marks",
                    textbookRef = "DC Dutta Obs (10th Ed)",
                    pageNumbers = "268-278",
                    highYieldPoints = listOf(
                        "Hemodynamic Burden in Pregnancy: Cardiac output increases by 40-50% (peaks at 28-32 weeks), heart rate increases by 10-15 bpm, plasma volume increases by 50%; in 2nd stage of labour, uterine contractions push 300-500 mL blood into systemic circulation; immediate postpartum auto-transfusion causes acute right/left heart strain and pulmonary edema.",
                        "Mitral Stenosis (MS): Most common rheumatic heart lesion. Tachycardia reduces diastolic filling time, leading to acute rise in left atrial pressure, pulmonary venous hypertension, and acute pulmonary edema.",
                        "NYHA Classification: Class I: Uncompromised (no limitation of physical activity); Class II: Slight limitation (comfortable at rest, ordinary activity causes fatigue/dyspnea); Class III: Marked limitation (comfortable at rest, less than ordinary activity causes dyspnea); Class IV: Inability to perform any activity, dyspnea at rest.",
                        "High-Risk Cardiac Lesions (Mortality 30-50% - Pregnancy Strongly Discouraged): 1. Pulmonary Arterial Hypertension (PAH / Eisenmenger syndrome); 2. Severe systemic ventricular dysfunction (LVEF <30%); 3. Severe symptomatic aortic stenosis; 4. Vascular Ehlers-Danlos / Marfan syndrome with aortic root >45 mm.",
                        "Management of Labour: Semi-recumbent left lateral position, high-flow oxygen, continuous pulse oximetry and ECG monitoring, adequate pain relief via Epidural Analgesia (reduces cardiac work), antibiotic prophylaxis against infective endocarditis if high-risk, cut short second stage with instrumental delivery (vacuum/forceps).",
                        "CRITICAL CONTRAINDICATION: METHERGINE IS STRICTLY FORBIDDEN IN CARDIAC PATIENTS (causes intense peripheral vasoconstriction and acute pulmonary edema). Use Oxytocin 10 IU IM slowly or infusion instead."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("ESC Guidelines on the Management of Cardiovascular Diseases during Pregnancy", "https://www.escardio.org/", "Guideline")
                    ),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_obs_rh_isoimmunisation",
                    subjectId = "obs_gyn",
                    topicId = "obg_obs_medical_disorders",
                    topicName = "Fetal Medicine & Blood Group Incompatibility",
                    text = "Describe the etiopathogenesis of Rh isoimmunisation. How will you evaluate and monitor an Rh-negative pregnant woman? Mention non-invasive fetal anemia monitoring and Anti-D immunoglobulin prophylaxis protocol.",
                    years = listOf("2025", "2023", "2021", "2018", "2015", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 4 + 4 + 4 = 15 Marks",
                    textbookRef = "DC Dutta Obs (10th Ed)",
                    pageNumbers = "318-327",
                    highYieldPoints = listOf(
                        "Pathogenesis: An Rh-negative (D-negative) mother carrying an Rh-positive fetus experiences feto-maternal hemorrhage during delivery, abortion, ectopic pregnancy, or amniocentesis. Fetal D-antigen triggers maternal IgM then IgG antibodies. In subsequent Rh-positive pregnancies, maternal anti-D IgG crosses placenta, coating fetal RBCs and destroying them in the fetal reticuloendothelial system (extravascular hemolysis), leading to erythroblastosis fetalis, severe anemia, hyperbilirubinemia, and hydrops fetalis (generalized edema, ascites, pleural effusion, heart failure).",
                        "Evaluation: Maternal blood group, Rh status, and Indirect Coombs Test (ICT) at booking visit; if ICT negative, repeat at 28 weeks.",
                        "Monitoring Sensitized Mother (ICT Positive): Serial anti-D antibody titers; critical titer is usually 1:16 or 1:32.",
                        "Non-Invasive Fetal Anemia Monitoring: Doppler measurement of Middle Cerebral Artery Peak Systolic Velocity (MCA-PSV). Value > 1.5 Multiples of Median (MoM) indicates moderate-to-severe fetal anemia -> warrants cordocentesis and Intrauterine Fetal Blood Transfusion (IUT) with O-negative irradiated packed RBCs.",
                        "Anti-D Immunoglobulin Prophylaxis (for Unsensitized Rh-Negative Women):",
                        "1. Routine antenatal prophylaxis: 300 mcg (1500 IU) IM at 28 weeks of gestation (or two doses of 100 mcg at 28 and 34 weeks).",
                        "2. Postnatal prophylaxis: 300 mcg IM within 72 hours of delivery if baby is Rh-positive and Direct Coombs Test (DCT) of cord blood is negative.",
                        "3. Sensitizing events: 150 mcg IM after 1st trimester miscarriage/MTP/ectopic; 300 mcg after 2nd trimester abortion, amniocentesis, trauma, or ECV. Kleihauer-Betke acid elution test used to calculate feto-maternal hemorrhage volume (>30 mL blood requires additional Anti-D)."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("ACOG Practice Bulletin No. 181: Prevention of Rh D Alloimmunization", "https://www.acog.org/", "Guideline")
                    ),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_obs_short_notes",
                    subjectId = "obs_gyn",
                    topicId = "obg_obs_medical_disorders",
                    topicName = "Obstetric Short Notes",
                    text = "High-Yield Obstetrics Short Notes: 1. Bishop's pre-induction cervical score; 2. Indications and complications of Episiotomy; 3. Emergency management of Umbilical Cord Prolapse; 4. Lochia and its clinical significance; 5. Vacuum (Ventouse) vs Forceps delivery.",
                    years = listOf("2025", "2024", "2023", "2022", "2020", "2018", "2016", "2013", "2010"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 Marks each",
                    textbookRef = "DC Dutta Obs (10th Ed)",
                    pageNumbers = "136, 142, 381, 510, 518, 526",
                    highYieldPoints = listOf(
                        "Bishop's Score (5 parameters scored 0-3): Dilatation (cm), Effacement (%), Station of fetal head (-3 to +2), Consistency of cervix (firm, medium, soft), and Position of cervix (posterior, mid, anterior). Maximum score = 13. Score >=8 indicates ripe/favourable cervix (high induction success); Score <=5 indicates unripe cervix requiring ripening (PGE2 Dinoprostone intracervical gel 0.5 mg, Misoprostol 25 mcg vaginal tablet, or Foley transcervical bulb catheter).",
                        "Episiotomy: Surgical enlargement of the vaginal introitus by cutting the perineum during the crowning of the fetal head. Types: Mediolateral (most common, from midpoint of fourchette at 45 degrees towards ischial tuberosity; protects anal sphincter) vs Median. Complications: Perineal tears (3rd/4th degree involving anal sphincter and rectal mucosa), hematoma, wound infection, dyspareunia.",
                        "Cord Prolapse Emergency Protocol: Umbilical cord lies alongside or below presenting part with ruptured membranes. Immediate management: Call for help, elevate presenting part manually per vaginam to relieve funic compression; place mother in exaggerated Sim's, Trendelenburg, or knee-chest position; instill 500 mL warm saline into urinary bladder via Foley catheter to lift head off cord; administer oxygen; perform IMMEDIATE EMERGENCY CAESAREAN SECTION (unless cervix fully dilated and head engaged where assisted vaginal delivery is feasible).",
                        "Lochia: Vaginal discharge for first 2-3 weeks postpartum. 1. Lochia rubra (days 1-4, red, consists of blood, decidua, vernix); 2. Lochia serosa (days 5-9, pinkish-brown, leucocytes, mucus, serum); 3. Lochia alba (days 10-15, yellowish-white, decidual cells, epithelial cells, bacteria). Clinical significance: Foul smell indicates puerperal sepsis; persistent lochia rubra indicates subinvolution of uterus or retained placental bits."
                    ),
                    referenceLinks = emptyList()
                )
            )
        )
    )
}
