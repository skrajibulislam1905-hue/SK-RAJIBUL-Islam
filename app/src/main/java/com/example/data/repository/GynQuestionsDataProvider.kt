package com.example.data.repository

import com.example.data.model.*

object GynQuestionsDataProvider {

    fun getTopics(): List<Topic> = listOf(
        Topic(
            id = "obg_gyn_oncology_pathology",
            subjectId = "obs_gyn",
            name = "Gynaecological Cancers & Structural Pathology",
            description = "Carcinoma cervix (FIGO 2018 staging & Wertheim's hysterectomy), postmenopausal bleeding & carcinoma endometrium, ovarian tumours & staging laparotomy, uterine fibroids (myomectomy), pelvic organ prolapse (Ward-Mayo vs Fothergill), and endometriosis.",
            textbookChapter = "Chapters 14-23: DC Dutta Gynaecology (9th Ed)",
            standardPages = "pp. 185-365",
            questions = listOf(
                Question(
                    id = "obg_gyn_ca_cervix_figo",
                    subjectId = "obs_gyn",
                    topicId = "obg_gyn_oncology_pathology",
                    topicName = "Gynaecological Oncology",
                    text = "Describe the updated FIGO (2018) staging of Carcinoma of the Cervix. Outline the management of Carcinoma Cervix Stage IIA. Discuss cervical cancer screening guidelines (Pap smear, HPV DNA testing) and HPV vaccination.",
                    years = listOf("2025", "2023 P2", "2019 S P2", "2018 S P2", "2012 S P2"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "6 + 4 + 5 = 15 Marks",
                    textbookRef = "DC Dutta Gyn (9th Ed)",
                    pageNumbers = "324-332",
                    highYieldPoints = listOf(
                        "FIGO 2018 Staging of Carcinoma Cervix:",
                        "Stage I: Carcinoma strictly confined to the cervix uteri.",
                        "- IA: Invasive carcinoma diagnosed only by microscopy (maximum depth of invasion <= 5 mm). IA1: <= 3 mm depth; IA2: > 3 mm and <= 5 mm depth.",
                        "- IB: Clinically visible lesion or microscopic lesion > 5 mm depth. IB1: >= 5 mm depth and < 2 cm in greatest dimension; IB2: 2 cm to < 4 cm; IB3: >= 4 cm in greatest dimension.",
                        "Stage II: Extends beyond the uterus, but has not extended onto the lower third of the vagina or to the pelvic wall.",
                        "- IIA: Involvement of upper two-thirds of the vagina without parametrial invasion. IIA1: < 4 cm in size; IIA2: >= 4 cm in size ('bulky' IIA).",
                        "- IIB: With obvious parametrial invasion, but not onto the pelvic wall.",
                        "Stage III: Involves the lower third of the vagina, extends to the pelvic wall, causes hydronephrosis/non-functioning kidney, and/or involves pelvic and/or para-aortic lymph nodes (IIIC1: pelvic lymph node metastasis; IIIC2: para-aortic lymph node metastasis).",
                        "Stage IV: Extends beyond true pelvis or involves bladder/rectal mucosa (IVA) or distant metastases (IVB, e.g. lung, bone, liver).",
                        "Management of Stage IIA:",
                        "- Stage IIA1 (<4 cm): Radical Hysterectomy (Wertheim's / Piver-Rutledge Type III) with Bilateral Pelvic Lymphadenectomy; OR Concurrent Chemoradiotherapy (CCRT). Both modalities show equivalent 5-year survival (~80-85%). In young patients, surgery preserves ovarian and sexual function.",
                        "- Stage IIA2 (>=4 cm) & Stage IIB-IVA: Definitive Concurrent Chemoradiotherapy (CCRT) - External Beam Radiation Therapy (EBRT) 45-50 Gy + Intracavitary Brachytherapy (ICBT) with weekly Cisplatin (40 mg/m2).",
                        "Screening & Prevention: Pap smear cytology (Bethesda system) starting at age 21 or 25; Primary High-Risk HPV DNA testing (detects HPV 16, 18) every 5 years from age 30 to 65. HPV Vaccination: Nonavalent vaccine (Gardasil-9 against types 6, 11, 16, 18, 31, 33, 45, 52, 58) administered at 9-14 years (2 doses at 0 and 6 months) or 15-26 years (3 doses at 0, 1-2, and 6 months)."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("FIGO Cervical Cancer Staging & Guidelines", "https://www.figo.org/", "Guideline")
                    ),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_gyn_pmb_endometrial",
                    subjectId = "obs_gyn",
                    topicId = "obg_gyn_oncology_pathology",
                    topicName = "Uterine Malignancy & Menopause",
                    text = "A 56-year-old post-menopausal female presents with irregular bleeding per vaginam for the last two weeks. Define menopause, list causes of postmenopausal bleeding (PMB), clinical diagnostic approach, and surgical management of Carcinoma Endometrium Stage I.",
                    years = listOf("2025", "2023", "2019 P2", "2017 P2", "2015 P2", "2010 S P2"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 3 + 5 + 5 = 15 Marks",
                    textbookRef = "DC Dutta Gyn (9th Ed)",
                    pageNumbers = "54, 59, 339-348",
                    highYieldPoints = listOf(
                        "Definition of Menopause: Permanent cessation of menstruation resulting from loss of ovarian follicular activity, diagnosed retrospectively after 12 consecutive months of amenorrhea.",
                        "Cardinal Rule: Any bleeding per vaginam occurring 1 year or more after menopause is Postmenopausal Bleeding (PMB) and MUST BE REGARDED AS MALIGNANT UNTIL PROVEN OTHERWISE.",
                        "Causes of PMB: 1. Endometrial atrophy / senile endometritis (60-70%, most common benign cause); 2. Endometrial carcinoma (10-15%); 3. Endometrial hyperplasia / polyps; 4. Exogenous hormone therapy / HRT; 5. Cervical carcinoma; 6. Atrophic vaginitis; 7. Granulosa cell tumor of ovary (estrogen-producing).",
                        "Diagnostic Workup:",
                        "1. Transvaginal Ultrasound (TVS): Measure Endometrial Thickness (ET). If ET <= 4 mm and homogeneous in a postmenopausal woman, risk of malignancy is <1%; if ET > 4 mm or irregular, tissue sampling is mandatory.",
                        "2. Endometrial Biopsy (Gold Standard): Pipelle aspiration curettage (outpatient) or Hysteroscopy with directed biopsy / Fractional curettage.",
                        "3. Cervical Pap smear and pelvic MRI (to assess myometrial invasion and lymph nodes).",
                        "Surgical Management of Carcinoma Endometrium Stage I:",
                        "Stage I: Confined to uterine corpus (IA: <50% myometrial invasion; IB: >=50% myometrial invasion).",
                        "Definitive Surgery: Total Extrafascial Hysterectomy with Bilateral Salpingo-Oophorectomy (BSO) + Pelvic & Para-aortic lymphadenectomy or Sentinel Lymph Node (SLN) mapping, along with peritoneal washing for cytology.",
                        "Adjuvant Therapy: Stage IA Grade 1-2 requires observation alone; Stage IB or Grade 3 warrants vaginal cuff brachytherapy or pelvic radiotherapy."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("ESGO/ESTRO/ESP Guidelines on Endometrial Carcinoma", "https://www.esgo.org/", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_gyn_ovarian_tumours",
                    subjectId = "obs_gyn",
                    topicId = "obg_gyn_oncology_pathology",
                    topicName = "Ovarian Tumours",
                    text = "Classify ovarian tumours. Describe the clinical presentation, tumor markers, Risk of Malignancy Index (RMI), and surgical staging laparotomy steps for Epithelial Ovarian Carcinoma.",
                    years = listOf("2025", "2024", "2022", "2020", "2016", "2013", "2011"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 3 + 3 + 6 = 15 Marks",
                    textbookRef = "DC Dutta Gyn (9th Ed)",
                    pageNumbers = "270-295, 349-365",
                    highYieldPoints = listOf(
                        "WHO Classification of Ovarian Tumours:",
                        "1. Surface Epithelial-Stromal Tumours (65-70%): Serous (most common), Mucinous, Endometrioid, Clear cell, Brenner tumour.",
                        "2. Germ Cell Tumours (15-20%): Mature cystic teratoma (Dermoid cyst - most common benign ovarian tumour in young women), Dysgerminoma, Yolk sac tumour (Endodermal sinus tumour with Schiller-Duval bodies), Choriocarcinoma, Embryonal carcinoma.",
                        "3. Sex Cord-Stromal Tumours (5-10%): Granulosa-Theca cell tumours (Call-Exner bodies, produces estrogen -> endometrial hyperplasia/bleeding), Sertoli-Leydig cell tumours (arrhenoblastoma, virilizing), Fibroma (associated with Meigs syndrome: benign ovarian fibroma, ascites, and right pleural effusion).",
                        "Tumor Markers: CA-125 (Epithelial serous), CEA and CA 19-9 (Mucinous), AFP (Yolk sac tumour), beta-hCG (Choriocarcinoma), LDH (Dysgerminoma), Inhibin (Granulosa cell tumour).",
                        "Risk of Malignancy Index (RMI = Ultrasound score x Menopausal score x Serum CA-125): Value > 200 has high sensitivity/specificity for malignancy.",
                        "Surgical Staging Laparotomy for Epithelial Ovarian Carcinoma:",
                        "1. Vertical midline or paramedian abdominal incision extending above umbilicus.",
                        "2. Collection of peritoneal fluid / washings from pelvis and paracolic gutters for cytology.",
                        "3. Thorough inspection and palpation of peritoneal surfaces, liver, spleen, subdiaphragmatic space, intestines, and mesentery.",
                        "4. Total Abdominal Hysterectomy with Bilateral Salpingo-Oophorectomy (TAH + BSO).",
                        "5. Infracolic omentectomy and selective/systematic pelvic and para-aortic lymphadenectomy.",
                        "6. Peritoneal biopsies from pouch of Douglas, bladder peritoneum, and paracolic gutters.",
                        "7. Primary Cytoreductive Surgery (Debulking): Aim is optimal debulking with residual disease < 1 cm (ideally complete cytoreduction with no macroscopic disease), followed by adjuvant chemotherapy (Paclitaxel + Carboplatin x 6 cycles)."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("ESMO Clinical Practice Guidelines: Epithelial Ovarian Cancer", "https://www.esmo.org/", "Guideline")
                    ),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_gyn_fibroid_leiomyoma",
                    subjectId = "obs_gyn",
                    topicId = "obg_gyn_oncology_pathology",
                    topicName = "Benign Uterine Lesions",
                    text = "Classify Leiomyoma (Fibroid Uterus) using FIGO system. Describe secondary degenerative changes (including red degeneration in pregnancy). Outline management options for a 30-year-old nulliparous lady with symptomatic intramural fibroid wishing future fertility.",
                    years = listOf("2025", "2024", "2021", "2018", "2014", "2011"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 4 + 8 = 15 Marks",
                    textbookRef = "DC Dutta Gyn (9th Ed)",
                    pageNumbers = "250-264",
                    highYieldPoints = listOf(
                        "FIGO Subclassification System (Types 0 to 8):",
                        "- Submucosal: Type 0 (Pedunculated intracavitary), Type 1 (<50% intramural), Type 2 (>=50% intramural).",
                        "- Other: Type 3 (100% intramural, contacts endometrium), Type 4 (intramural entirely, no contact with endometrium or serosa), Type 5 (subserosal >=50% intramural), Type 6 (subserosal <50% intramural), Type 7 (pedunculated subserosal), Type 8 (cervical, broad ligament, parasitic), Hybrid: Type 2-5 (straddles endometrium to serosa).",
                        "Secondary Degenerative Changes:",
                        "1. Hyaline degeneration: Most common (65%), glass-like eosinophilic change due to impaired vascularity.",
                        "2. Cystic degeneration: Liquefaction of hyalinized tissue producing fluid-filled spaces.",
                        "3. Calcification: 'Womb stones', commonly in postmenopausal elderly women.",
                        "4. Red Degeneration (Carneous / Necrobiosis): Occurs during pregnancy (typically 2nd trimester) and puerperium; rapid estrogen-driven growth outstrips blood supply, causing venous thrombosis, hemorrhagic infarction, and autolysis of tissue. Features: Acute severe lower abdominal pain, tenderness localized over fibroid, low-grade fever, leukocytosis. Management is STRICTLY CONSERVATIVE: Bed rest, IV hydration, analgesics (Paracetamol), tocolytics if contractions arise (surgery contraindicated during pregnancy due to catastrophic bleeding).",
                        "5. Sarcomatous degeneration (Leiomyosarcoma): <0.5%, suspected in rapid enlargement of fibroid in postmenopausal woman.",
                        "Management in a 30-year-old Nulliparous Woman Desiring Fertility:",
                        "Medical Pre-treatment: GnRH agonist (Leuprolide 3.75 mg depot IM monthly x 3 months) to shrink fibroid volume by 30-50%, reduce intraoperative blood loss, and allow correction of anemia.",
                        "Fertility-Sparing Surgery: Myomectomy (Abdominal or Laparoscopic). Intraoperative blood-sparing: Vasopressin (Pitressin 20 units in 100 mL saline) injected into myometrial bed, tourniquet around lower uterine segment, careful anatomical repair in multiple layers to restore uterine integrity."
                    ),
                    referenceLinks = emptyList(),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_gyn_pelvic_organ_prolapse",
                    subjectId = "obs_gyn",
                    topicId = "obg_gyn_oncology_pathology",
                    topicName = "Pelvic Organ Prolapse",
                    text = "Describe the supports of the uterus. Classify pelvic organ prolapse. Detail the clinical features, management of decubitus ulcer, and surgical choices (Ward-Mayo vs Manchester/Fothergill operation).",
                    years = listOf("2024", "2021", "2018", "2016", "2013", "2010"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "4 + 3 + 3 + 5 = 15 Marks",
                    textbookRef = "DC Dutta Gyn (9th Ed)",
                    pageNumbers = "185-205",
                    highYieldPoints = listOf(
                        "Supports of the Uterus:",
                        "1. Primary / Active Support (Muscular Pelvic Diaphragm): Levator ani muscles (pubococcygeus, puborectalis, iliococcygeus) and Perineal body.",
                        "2. Primary / Passive Support (Endopelvic Fascial Ligaments): Mackenrodt's ligaments (Cardinal / Transverse cervical ligaments - the strongest support), Uterosacral ligaments, Pubocervical fascia.",
                        "3. Secondary Supports: Round ligaments (maintains anteversion), Broad ligaments, Uterovesical and rectovaginal folds.",
                        "Degrees of Prolapse: 1st Degree: Cervix descends into vagina but does not reach introitus; 2nd Degree: Cervix reaches or protrudes through introitus on straining; 3rd Degree: Entire cervix and part of corpus lie outside the introitus; 4th Degree (Procidentia): Entire uterus and inverted vaginal walls lie completely outside the vulva.",
                        "Decubitus Ulcer: Trophic ischemic ulcer on dependent protruding cervix/vagina due to venous stasis and friction. Management: Bed rest, reduction of prolapse, application of warm saline / 10% glycerine acriflavine packing or local estrogen cream to promote re-epithelialization before surgery.",
                        "Surgical Options:",
                        "1. Ward-Mayo Operation (Vaginal Hysterectomy with Pelvic Floor Repair - Colpoperineorrhaphy): Operation of choice for 3rd/4th degree prolapse in postmenopausal or elderly multiparous women who have completed their family.",
                        "2. Fothergill's / Manchester Operation: Indicated in younger women with uterine prolapse wishing to retain their uterus (especially with elongated cervix). Components: Amputation of elongated cervix + plication of cardinal ligaments anterior to cervix + anterior colporrhaphy + posterior colpoperineorrhaphy.",
                        "3. Purandare's / Shirodkar's Sling Surgery: For nulliparous or young prolapse desiring future childbearing (uses fascia lata or synthetic tape to suspend uterus to anterior abdominal wall or sacrum)."
                    ),
                    referenceLinks = emptyList(),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_gyn_endometriosis",
                    subjectId = "obs_gyn",
                    topicId = "obg_gyn_oncology_pathology",
                    topicName = "Endometriosis & Adenomyosis",
                    text = "Define Endometriosis. Discuss Sampson's theory of pathogenesis. Describe the clinical features, physical findings, laparoscopic findings, and medical vs surgical management of chocolate cyst of the ovary.",
                    years = listOf("2025", "2022", "2019", "2017", "2014", "2011"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 3 + 3 + 3 + 4 = 15 Marks",
                    textbookRef = "DC Dutta Gyn (9th Ed)",
                    pageNumbers = "280-295",
                    highYieldPoints = listOf(
                        "Definition: Presence of functioning endometrial glands and stroma outside the uterine cavity, most commonly involving ovaries, uterosacral ligaments, pouch of Douglas, and pelvic peritoneum.",
                        "Pathogenesis (Sampson's Theory): Retrograde menstruation through the fallopian tubes into the peritoneal cavity with subsequent implantation and proliferation of viable endometrial tissue under estrogen stimulation.",
                        "Classic Clinical Triad: 1. Progressive secondary dysmenorrhea (starts 1-2 days prior to menses and lasts throughout period); 2. Deep dyspareunia; 3. Infertility. Other features: Chronic pelvic pain, dyschezia (painful defecation), menorrhagia.",
                        "Bimanual Findings: Fixed, tender, retroverted uterus; nodularity and tenderness in pouch of Douglas and uterosacral ligaments; tender, cystic, fixed adnexal mass (endometrioma).",
                        "Laparoscopy (Gold Standard for Diagnosis): Visualizes characteristic lesions: early red flame lesions, black 'powder-burn' / 'matchstick' spots, blue-domed cysts, puckered white scar fibrosis, dense adhesions oblitering pouch of Douglas ('frozen pelvis').",
                        "Management of Endometrioma / Chocolate Cyst:",
                        "Medical: First-line: Dienogest (2 mg oral daily - suppresses estrogen, causes decidualization and atrophy of ectopic endometrium); Continuous Combined Oral Contraceptives; Levonorgestrel-releasing intrauterine system (LNG-IUS); GnRH agonists (Leuprolide) with add-back estrogen/progestin therapy.",
                        "Surgical (Laparoscopy): Laparoscopic cystectomy (excision of the cyst wall with preservation of normal ovarian cortex - superior to aspiration/coagulation for pain relief and pregnancy rates); adhesiolysis and fulguration of peritoneal implants."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("ESHRE Guideline: Endometriosis", "https://www.eshre.eu/", "Guideline")
                    ),
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "obg_gyn_endocrine_contraception",
            subjectId = "obs_gyn",
            name = "Reproductive Endocrinology, Infertility & Contraception",
            description = "Primary amenorrhoea & MRKH syndrome, infertility workup (semen analysis WHO 2021, HSG, ovulation induction), PCOS (Rotterdam criteria), abnormal uterine bleeding (PALM-COEIN, LNG-IUS), and contraception & MTP Act 2021 amendments.",
            textbookChapter = "Chapters 4, 6, 17, 24: DC Dutta Gynaecology (9th Ed)",
            standardPages = "pp. 38-80, 212-248, 445-475",
            questions = listOf(
                Question(
                    id = "obg_gyn_primary_amenorrhea_mrkh",
                    subjectId = "obs_gyn",
                    topicId = "obg_gyn_endocrine_contraception",
                    topicName = "Primary Amenorrhoea",
                    text = "A 17-year-old girl is brought by her mother because she has never menstruated. On examination, secondary sexual characteristics are well developed, but per speculum examination reveals a blind vaginal pouch. Differential diagnosis, investigations, and management of Mayer-Rokitansky-Kuster-Hauser (MRKH) syndrome.",
                    years = listOf("2025", "2019 S P2", "2016", "2013"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 4 + 4 + 5 = 15 Marks",
                    textbookRef = "DC Dutta Gyn (9th Ed)",
                    pageNumbers = "38, 39, 43",
                    highYieldPoints = listOf(
                        "Clinical Diagnosis: Primary Amenorrhoea with Blind Vaginal Pouch and Normal Breast Development (Thelarche).",
                        "Differential Diagnosis:",
                        "1. Mayer-Rokitansky-Kuster-Hauser (MRKH) Syndrome / Mullerian Agenesis: Karyotype 46,XX; ovaries are normal and functional; Mullerian derivatives (uterus, cervix, upper 2/3 of vagina) are congenitally absent; normal female pubic and axillary hair (normal adrenarche); serum testosterone is in the normal female range.",
                        "2. Complete Androgen Insensitivity Syndrome (CAIS / Testicular Feminization): Karyotype 46,XY; gonads are cryptorchid undescended testes (in abdomen or inguinal canal); peripheral androgen receptor defect; sparse or absent pubic and axillary hair; serum testosterone in adult male range; malignant potential of gonads after puberty (gonadectomy indicated).",
                        "3. Imperforate Hymen / Transverse Vaginal Septum: 46,XX; functioning uterus present; cyclic lower abdominal pain with hematocolpos / hematometra (cryptomenorrhoea).",
                        "Investigations for MRKH: 1. Pelvic USG and MRI: Confirms absent uterus and presence of normal bilateral ovaries; 2. Karyotyping: 46,XX; 3. Serum FSH, LH, and Total Testosterone (normal female levels); 4. Renal USG (30-40% have solitary kidney, pelvic ectopic kidney, or duplex system); 5. Skeletal radiography (10-12% have vertebral segmentation anomalies like Klippel-Feil).",
                        "Management of MRKH:",
                        "Psychological counselling regarding sexual function and reproduction.",
                        "Creation of Neovagina: Non-surgical progressive dilation: Frank's method (graduated glass/plastic dilators applied to vaginal dimple 20-30 min daily for 3-6 months; 85-90% success rate); Surgical: McIndoe vaginoplasty (dissection of rectovesical space, split-thickness skin graft from thigh over a mould, continuous wear for 3-6 months) or Davydov laparoscopic peritoneal vaginoplasty.",
                        "Reproduction: Patient can achieve genetic offspring via In Vitro Fertilization (IVF) using her own oocytes and partner's sperm, followed by Gestational Surrogacy."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("ACOG Committee Opinion No. 728: Mullerian Agenesis", "https://www.acog.org/", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_gyn_infertility_workup",
                    subjectId = "obs_gyn",
                    topicId = "obg_gyn_endocrine_contraception",
                    topicName = "Infertility & Assisted Reproduction",
                    text = "Define Infertility. Outline the systematic diagnostic workup of an infertile couple. List the WHO (2021) normal semen analysis parameters, tubal patency tests, and step-ladder ovulation induction protocols.",
                    years = listOf("2025", "2023", "2020", "2018", "2015", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 4 + 3 + 3 + 3 = 15 Marks",
                    textbookRef = "DC Dutta Gyn (9th Ed)",
                    pageNumbers = "212-235",
                    highYieldPoints = listOf(
                        "Definition of Infertility: Inability of a couple of reproductive age to achieve a clinical pregnancy after 12 months or more of regular, unprotected sexual intercourse (reduced to 6 months if female partner is >=35 years).",
                        "Systematic Evaluation:",
                        "Male Factor Evaluation (30-40% of cases): Semen Analysis after 2-7 days of sexual abstinence. WHO (2021 - 6th Edition) Lower Reference Limits: Ejaculate Volume: >= 1.4 mL; Total Sperm Count: >= 39 million per ejaculate; Sperm Concentration: >= 16 million/mL; Total Motility (PR + NP): >= 42% (Progressive motility >= 30%); Vitality: >= 54% live; Normal Morphology: >= 4% (Kruger strict criteria).",
                        "Female Ovulation Testing: Mid-luteal serum progesterone (measured on Day 21 in 28-day cycle; value > 3 ng/mL confirms ovulation, >10 ng/mL ideal); Transvaginal sonography (serial follicular monitoring until dominant follicle reaches 18-20 mm followed by collapse).",
                        "Ovarian Reserve Testing: Anti-Mullerian Hormone (AMH: 1.5 - 4.0 ng/mL normal, <1.0 indicates diminished reserve), Day 2-3 serum FSH (<10 IU/L), and Antral Follicle Count (AFC: 10-20 follicles on USG).",
                        "Tubal Patency Assessment: Hysterosalpingography (HSG - fluoroscopic water-soluble radiopaque dye injection on Day 7-10 of cycle; checks uterine cavity outline and bilateral peritoneal spill); Diagnostic Laparoscopy with Chromopertubation (injecting dilute methylene blue dye; GOLD STANDARD as it also diagnoses endometriosis and pelvic adhesions).",
                        "Ovulation Induction Protocols:",
                        "1. Letrozole (Aromatase Inhibitor): 2.5 - 5.0 mg orally once daily from cycle day 3 to 7. First-line agent in PCOS (superior live birth rates and lower multiple pregnancy risk compared to clomiphene).",
                        "2. Clomiphene Citrate (SERM): 50 - 150 mg daily for 5 days (days 2-6 or 3-7).",
                        "3. Gonadotropins (rFSH / hMG): Low-dose step-up protocol for resistant anovulation.",
                        "4. Ovulation Trigger: Recombinant hCG (5000-10000 IU) when lead follicle reaches 18-20 mm, followed 36 hours later by Timed Intercourse or Intrauterine Insemination (IUI)."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("WHO Laboratory Manual for the Examination and Processing of Human Semen (6th Edition)", "https://www.who.int/", "Guideline")
                    ),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_gyn_pcos_rotterdam",
                    subjectId = "obs_gyn",
                    topicId = "obg_gyn_endocrine_contraception",
                    topicName = "Polycystic Ovarian Syndrome",
                    text = "A 24-year-old unmarried female presents with oligomenorrhoea, excessive facial hair, and weight gain. Rotterdam diagnostic criteria, pathophysiology of insulin resistance and hyperandrogenism, long-term health risks, and management strategies.",
                    years = listOf("2025", "2024", "2022", "2019", "2017", "2014"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 4 + 3 + 5 = 15 Marks",
                    textbookRef = "DC Dutta Gyn (9th Ed)",
                    pageNumbers = "236-248",
                    highYieldPoints = listOf(
                        "Rotterdam Diagnostic Criteria (2 out of 3 features required):",
                        "1. Oligo- or Anovulation (menstrual cycles > 35 days or < 8 cycles per year).",
                        "2. Clinical and/or Biochemical Signs of Hyperandrogenism (hirsutism assessed by modified Ferriman-Gallwey score >= 8, severe acne, androgenic alopecia; or elevated serum total/free testosterone, DHEAS).",
                        "3. Polycystic Ovarian Morphology on Ultrasound: Presence of >= 20 follicles measuring 2-9 mm in diameter in either ovary, and/or increased ovarian volume >= 10 mL ('necklace' or 'string of pearls' sign around dense hyperechoic stroma).",
                        "Pathophysiology: Primary defect involves peripheral insulin resistance leading to compensatory hyperinsulinemia. Hyperinsulinemia acts synergistically with elevated pulsatile LH to stimulate ovarian theca cells to overproduce androgens. Insulin also suppresses hepatic synthesis of Sex Hormone-Binding Globulin (SHBG), resulting in higher free circulating testosterone. Increased androgens undergo peripheral aromatization in adipose tissue to estrone, which exerts unopposed positive feedback on LH and negative feedback on FSH (high LH:FSH ratio > 2:1), preventing follicular maturation and causing follicular arrest.",
                        "Long-Term Risks: Metabolic syndrome, impaired glucose tolerance, Type 2 Diabetes Mellitus (5-10 fold risk), hypertension, dyslipidemia, non-alcoholic fatty liver disease (NAFLD), and Endometrial Hyperplasia / Carcinoma (due to chronic unopposed estrogen exposure).",
                        "Management:",
                        "1. Lifestyle Modification: Weight loss of 5-10% of body weight restores regular menstrual cycles and spontaneous ovulation in >50% of overweight patients.",
                        "2. Menstrual Regulation & Hyperandrogenism: Combined Oral Contraceptive Pills (COCPs) containing anti-androgenic progestins (Drospirenone or Cyproterone acetate); Spironolactone (androgen receptor blocker 50-100 mg daily).",
                        "3. Insulin Sensitizer: Metformin (500-1500 mg daily) improves insulin sensitivity, lowers circulating androgens, and aids weight reduction.",
                        "4. Infertility: Letrozole (2.5 mg daily for 5 days) is first-line drug of choice; Laparoscopic Ovarian Drilling (LOD: 4-5 punctures per ovary with diathermy) reserved for clomiphene/letrozole-resistant cases."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("International Evidence-based Guideline for PCOS Assessment and Management", "https://www.monash.edu/medicine/mchri/pcos", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_gyn_aub_palm_coein",
                    subjectId = "obs_gyn",
                    topicId = "obg_gyn_endocrine_contraception",
                    topicName = "Abnormal Uterine Bleeding",
                    text = "Define Abnormal Uterine Bleeding (AUB). Discuss the FIGO PALM-COEIN classification. Outline the medical management of AUB-O (Ovulatory dysfunction) including the Levonorgestrel Intrauterine System (LNG-IUS / Mirena).",
                    years = listOf("2025", "2023", "2021", "2018", "2015"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 5 + 8 = 15 Marks",
                    textbookRef = "DC Dutta Gyn (9th Ed)",
                    pageNumbers = "60-75",
                    highYieldPoints = listOf(
                        "Definition of AUB: Any uterine bleeding that is abnormal in regularity, volume, frequency, or duration in non-pregnant women of reproductive age.",
                        "FIGO PALM-COEIN Classification (Structural vs Non-Structural):",
                        "Structural Causes (PALM - visually/histopathologically identified):",
                        "- P: Polyp (endometrial or endocervical)",
                        "- A: Adenomyosis",
                        "- L: Leiomyoma (Submucosal vs Other intramural/subserosal)",
                        "- M: Malignancy and Hyperplasia (endometrial hyperplasia with/without atypia, endometrial carcinoma)",
                        "Non-Structural Causes (COEIN - functional/systemic disorders):",
                        "- C: Coagulopathy (von Willebrand disease, immune thrombocytopenia)",
                        "- O: Ovulatory dysfunction (PCOS, thyroid disorders, hyperprolactinemia, perimenopause)",
                        "- E: Endometrial primary disorders (defective local hemostasis/endothelin-1/prostaglandins)",
                        "- I: Iatrogenic (anticoagulants, copper-IUD, systemic medications)",
                        "- N: Not yet classified (arteriovenous malformations, myometrial hypertrophy)",
                        "Medical Management of AUB-O (First-Line Medical Therapy):",
                        "1. Levonorgestrel Intrauterine System (LNG-IUS / Mirena): Releases 20 mcg of levonorgestrel directly into uterine cavity per 24 hours (effective for 5-8 years). Causes profound endometrial glandular atrophy, stroma pseudodecidualization, and down-regulation of estrogen receptors. Reduces menstrual blood loss by up to 90% at 6 months; first-line non-surgical treatment.",
                        "2. Tranexamic Acid (Antifibrinolytic): 1 g orally three times daily during heavy menstrual days; competitively inhibits plasminogen activation and reduces blood loss by 40-50%.",
                        "3. Non-Steroidal Anti-Inflammatory Drugs (NSAIDs): Mefenamic acid (500 mg TDS) during menses, inhibits endometrial cyclooxygenase and prostaglandin synthesis.",
                        "4. Oral Progestins: Medroxyprogesterone acetate (10 mg daily) or Dydrogesterone (10-20 mg daily) taken for 21 days of each cycle (days 5-25) to prevent endometrial hyperplasia.",
                        "5. Combined Oral Contraceptive Pills (COCP): Regulates cycle and reduces flow by 50%."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("FIGO Classification System for Abnormal Uterine Bleeding", "https://www.figo.org/", "Guideline")
                    ),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "obg_gyn_contraception_mtp",
                    subjectId = "obs_gyn",
                    topicId = "obg_gyn_endocrine_contraception",
                    topicName = "Family Welfare, Contraception & MTP",
                    text = "Classify Intrauterine Contraceptive Devices (IUCD). Discuss mechanisms, side effects, and timing of insertion of Cu-T 380A. Outline the key provisions of the Medical Termination of Pregnancy (MTP) Amendment Act 2021 and medical abortion regimens.",
                    years = listOf("2025", "2024", "2022", "2020", "2018", "2016", "2014", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 4 + 4 + 4 = 15 Marks",
                    textbookRef = "DC Dutta Gyn (9th Ed)",
                    pageNumbers = "445-475",
                    highYieldPoints = listOf(
                        "Classification of IUCDs: 1st Generation: Inert / Non-medicated (Lippes loop); 2nd Generation: Copper-bearing (Cu-T 380A, Nova-T, Multiload 375); 3rd Generation: Hormone-releasing (LNG-IUS / Mirena releasing 20 mcg/day, Progestasert).",
                        "Cu-T 380A Profile: 380 mm2 surface area of copper on polyethylene T-frame with barium sulphate core. Approved lifespan: 10 years. Failure rate: 0.6-0.8 per 100 woman-years.",
                        "Mechanism of Action: Copper ions exert direct toxic effect on spermatozoa (impairs motility, capacitation, and acrosomal reaction) and generate a sterile foreign-body inflammatory reaction in endometrium with cytokine/macrophage release that prevents blastocyst implantation.",
                        "Timing of Insertion: Interval insertion (within 5-7 days of onset of menses); Post-placental / PPIUCD (within 10-15 minutes of placental expulsion or during caesarean delivery); Postpartum (up to 48 hours before discharge, or delayed until 6 weeks puerperium); Emergency post-coital contraception (within 5 days / 120 hours of unprotected intercourse - 99% efficacy).",
                        "Key Provisions of the MTP (Amendment) Act 2021 (India):",
                        "- Gestational Age Limit: Increased to 24 weeks (from 20 weeks) for special categories of vulnerable women (survivors of sexual assault/rape/incest, minors, physical/mental disability, fetal abnormalities).",
                        "- Medical Opinions Required: Up to 20 weeks: Opinion of ONE Registered Medical Practitioner (RMP); From 20 to 24 weeks: Opinion of TWO RMPs; Beyond 24 weeks: In cases of substantial fetal abnormalities diagnosed by a 4-member State-level Medical Board.",
                        "- Inclusivity: Failure of contraception clause extended to 'ANY woman or her partner' (married or unmarried).",
                        "- Confidentiality: Name and particulars of woman shall not be revealed (punishable by fine and imprisonment).",
                        "Medical Abortion Regimen (Approved up to 9 weeks / 63 days of gestation):",
                        "Day 1: Oral Mifepristone 200 mg single dose (progesterone receptor antagonist - causes decidual necrosis and cervical softening).",
                        "Day 2-3 (24 to 48 hours later): Misoprostol 800 mcg buccally, sublingually, or vaginally (PGE1 analog - stimulates strong myometrial contractions and cervical dilation).",
                        "Day 14: Follow-up clinic visit to verify complete abortion by clinical exam or USG."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("Ministry of Health & Family Welfare (MoHFW) MTP Amendment Act", "https://mohfw.gov.in/", "Guideline")
                    ),
                    isRepeatQuestion = true
                )
            )
        )
    )
}
