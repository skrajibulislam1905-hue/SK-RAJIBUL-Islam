package com.example.data.repository

import com.example.data.model.*

object OphthalQuestionsDataProvider {

    fun getTopics(): List<Topic> = listOf(
        Topic(
            id = "oph_anatomy_optics",
            subjectId = "ophthalmology",
            name = "Anatomy of Eye, Optics & Refraction",
            description = "Angle of anterior chamber, extraocular muscles, accommodation, aqueous dynamics, myopia, hypermetropia, astigmatism, and refractive surgeries.",
            textbookChapter = "Chapters 1-3: Anatomy, Physiology & Optics",
            standardPages = "pp. 4-55, 207-209, 318",
            questions = listOf(
                Question(
                    id = "oph_angle_1",
                    subjectId = "ophthalmology",
                    topicId = "oph_anatomy_optics",
                    topicName = "Anatomy of Eye",
                    text = "Name the structures forming the angle of the anterior chamber. Draw a neat, labelled diagram of the angle of the anterior chamber. Name two pathological features at the angle and two abnormal contents of anterior chamber. How do you examine the structures of the angle of anterior chamber?",
                    years = listOf("2023", "2021"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 3 + 2 + 2 = 10 Marks",
                    textbookRef = "AK Khurana (9th Ed)",
                    pageNumbers = "207, 209",
                    highYieldPoints = listOf(
                        "Angle Structures (Anterior to Posterior): 1. Schwalbe's line (prominent termination of Descemet's membrane), 2. Trabecular meshwork (uveal and corneoscleral meshwork + juxtacanalicular tissue), 3. Scleral spur, 4. Ciliary body band, 5. Root of iris.",
                        "Pathological features at the angle: Peripheral anterior synechiae (PAS), neovascularization of angle (rubeosis iridis), angle recession, pigment deposition (Krukenberg spindle / Sampaolesi line).",
                        "Abnormal contents of AC: Hypopyon (pus/leukocytes), Hyphema (blood), Hypolipon (lipid/silicone oil), Pseudoexfoliation material, luxated lens.",
                        "Examination: Gonioscopy (Goldmann 3-mirror, Sussman/Zeiss 4-mirror, Posner indirect goniolenses) and anterior segment OCT (AS-OCT)."
                    ),
                    referenceLinks = listOf(ReferenceLink("AIOS Glaucoma Practice Guidelines", "https://aios.org/", "Guideline")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "oph_muscles_1",
                    subjectId = "ophthalmology",
                    topicId = "oph_anatomy_optics",
                    topicName = "Ocular Muscles & Optics",
                    text = "Name extra & intra ocular muscles with nerve supply. Draw a labelled diagram of eyeball. Discuss accommodation mechanism and aqueous humor formation, circulation & drainage.",
                    years = listOf("2021", "2019", "2016", "2015", "2013"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "10 Marks",
                    textbookRef = "AK Khurana (9th Ed)",
                    pageNumbers = "4, 44, 169, 209, 318",
                    highYieldPoints = listOf(
                        "Extraocular Muscles & Innervation: LR6 (SO4) 3: Lateral rectus by CN VI (Abducens); Superior oblique by CN IV (Trochlear); Medial rectus, Superior rectus, Inferior rectus, Inferior oblique and Levator palpebrae superioris by CN III (Oculomotor).",
                        "Intraocular Muscles: Sphincter pupillae (parasympathetic CN III via ciliary ganglion -> miosis), Dilator pupillae (sympathetics from superior cervical ganglion -> mydriasis), Ciliary muscle (parasympathetic CN III -> accommodation).",
                        "Helmholtz Theory of Accommodation: Ciliary muscle contracts -> relaxes zonules of Zinn -> anterior lens surface becomes steeper and more convex -> increased dioptric power for near vision.",
                        "Aqueous Dynamics: Secreted by non-pigmented ciliary epithelium of ciliary processes (active secretion 80%, ultrafiltration 20%) -> enters posterior chamber -> passes through pupil into anterior chamber -> exits via Trabecular / Conventional outflow (90%, Schlemm's canal -> collector channels -> episcleral veins) and Uveoscleral outflow (10%, ciliary body face -> suprachoroidal space)."
                    ),
                    referenceLinks = listOf(ReferenceLink("AIOS Ocular Anatomy Protocols", "https://aios.org/", "Textbook")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "oph_refraction_1",
                    subjectId = "ophthalmology",
                    topicId = "oph_anatomy_optics",
                    topicName = "Optics & Refraction",
                    text = "What is myopia? Classify myopia. Write down signs and symptoms of pathological myopia. Outline surgical management options.",
                    years = listOf("2023", "2022", "2020", "2019", "2015", "2014"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 3 + 5 = 10 Marks",
                    textbookRef = "AK Khurana (9th Ed)",
                    pageNumbers = "37-38, 40, 51",
                    highYieldPoints = listOf(
                        "Definition: A refractive error where parallel rays of light coming from infinity focus in front of the retina with accommodation at rest.",
                        "Classification: Etiological (Axial, Curvature, Index, Positional); Clinical (Congenital, Simple/Developmental, Pathological/Degenerative > -6.00 D, Acquired).",
                        "Pathological Myopia Signs: Prominent large eyeballs with deep AC; Temporal / Myopic crescent at disc; Posterior staphyloma (pathognomonic ectasia of posterior sclera); Foster-Fuchs spot (pigmented macular scar from choroidal neovascular membrane); Forster's spots and lacquer cracks in Bruch's membrane; peripheral lattice degeneration, retinal holes, and retinal detachment.",
                        "Surgical Options: Corneal refractive surgery (LASIK, PRK, SMILE for up to -8 to -10 D); Phakic Intraocular Lens (ICL - Implantable Collamer Lens) for high myopia > -10 D; Refractive Lens Exchange (Clear lens extraction)."
                    ),
                    referenceLinks = listOf(ReferenceLink("AIOS Refractive Surgery Guidelines", "https://aios.org/", "Guideline")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "oph_optics_sn",
                    subjectId = "ophthalmology",
                    topicId = "oph_anatomy_optics",
                    topicName = "Refractive Notes & Explain Why",
                    text = "Short Notes: 1. Astigmatism; 2. Hypermetropia; 3. Presbyopia; 4. Explain: Uncorrected high ametropia in preschool leads to permanent subnormal vision (amblyopia); 5. Explain: Cycloplegics in paediatric refraction.",
                    years = listOf("2024", "2021", "2019", "2017", "2012"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 Marks each",
                    textbookRef = "AK Khurana (9th Ed)",
                    pageNumbers = "34, 40, 46, 433",
                    highYieldPoints = listOf(
                        "Preschool Ametropia & Amblyopia: In early childhood (critical period of visual development <7-8 years), high uncorrected refractive error blurs the retinal image during neuroplasticity, causing cortical suppression and permanent refractive/anisometropic amblyopia (lazy eye).",
                        "Cycloplegics in Paediatrics: Children possess immense, highly active accommodation tone due to powerful ciliary muscle; refraction without cycloplegia (e.g. Cyclopentolate or Atropine) grossly masks hypermetropia or falsely induces pseudo-myopia.",
                        "Presbyopia: Physiological, age-related loss of accommodation due to sclerosis and progressive loss of elasticity of crystalline lens and ciliary body weakness; corrected with convex plus lenses for reading."
                    ),
                    referenceLinks = listOf(ReferenceLink("Pediatric Ophthalmology Guidelines", "https://aios.org/", "Guideline"))
                )
            )
        ),
        Topic(
            id = "oph_cornea_conjunctiva_uvea",
            subjectId = "ophthalmology",
            name = "Cornea, Conjunctiva, Uvea & Red Eye",
            description = "Bacterial corneal ulcer, hypopyon, keratoplasty, vernal keratoconjunctivitis, pterygium, uveitis, and differential diagnosis of acute red eye.",
            textbookChapter = "Chapters 4-8: Conjunctiva, Cornea, Sclera & Uvea",
            standardPages = "pp. 58-168",
            questions = listOf(
                Question(
                    id = "oph_cornea_1",
                    subjectId = "ophthalmology",
                    topicId = "oph_cornea_conjunctiva_uvea",
                    topicName = "Corneal Ulcers & Keratoplasty",
                    text = "Describe management of a bacterial corneal ulcer. How would you treat a non-healing ulcer? Enumerate complications. Discuss layers of cornea and factors maintaining transparency.",
                    years = listOf("2020", "2017", "2016", "2015", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "5 + 3 + 2 = 10 Marks",
                    textbookRef = "AK Khurana (9th Ed)",
                    pageNumbers = "91, 92, 98, 99, 129, 130",
                    highYieldPoints = listOf(
                        "Layers of Cornea (6): Epithelium (stratified non-keratinized), Bowman's layer (acellular, does not regenerate), Stroma (substantia propria, 90% of thickness, regular lattice arrangement of collagen lamellae), Dua's layer (pre-Descemet's), Descemet's membrane (thick basement membrane), Endothelium (single monolayer of hexagonal pump cells, Na+/K+ ATPase, non-regenerative).",
                        "Corneal Transparency Factors: 1. Anatomical: uniform lattice arrangement of collagen fibrils (Maurice theory); 2. Avascularity; 3. Relative dehydration (deturgescence maintained by endothelial metabolic pump); 4. Intact precorneal tear film; 5. Unmyelinated nerve fibres.",
                        "Management of Bacterial Ulcer: Scraping for Gram stain and KOH mount; fortified broad-spectrum antibiotic drops: Fortified Cefazolin (5%) + Fortified Tobramycin (1.3%) or Moxifloxacin (0.5%) hourly; 1% Atropine drops (relieves ciliary spasm, prevents posterior synechiae).",
                        "Non-healing Ulcer: Identify cause (fungal/Acanthamoeba, lagophthalmos, diabetes, dry eye); cauterization, bandage contact lens, amniotic membrane grafting, or Therapeutic Penetrating Keratoplasty (PKP)."
                    ),
                    referenceLinks = listOf(ReferenceLink("AIOS Corneal Ulcer Protocol", "https://aios.org/", "Guideline")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "oph_uvea_redeye_1",
                    subjectId = "ophthalmology",
                    topicId = "oph_cornea_conjunctiva_uvea",
                    topicName = "Uveitis & Acute Red Eye",
                    text = "What are the causes of red eye? Write in brief about their differential diagnosis with management. Describe clinical features and management of acute anterior uveitis (iridocyclitis).",
                    years = listOf("2024", "2023", "2020", "2014", "2012", "2010"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 4 + 4 = 10 Marks",
                    textbookRef = "AK Khurana (9th Ed)",
                    pageNumbers = "143, 146, 150",
                    highYieldPoints = listOf(
                        "Differential Diagnosis of Acute Red Eye: 1. Acute Conjunctivitis (mild discomfort/itching, superficial conjunctival congestion, mucopurulent discharge, normal pupil, normal IOP, clear cornea); 2. Acute Anterior Uveitis (dull throbbing pain, circumcorneal/ciliary flush, watery discharge, constricted/irregular pupil, normal or low IOP, keratic precipitates on endothelium); 3. Acute Angle-Closure Glaucoma (excruciating brow pain, headache, vomiting, deep dusky ciliary congestion, vertically oval mid-dilated non-reactive pupil, steamy/edematous cornea, markedly elevated rock-hard IOP); 4. Corneal Ulcer (pain, photophobia, foreign body sensation, focal white infiltrate staining with fluorescein).",
                        "Acute Anterior Uveitis Hallmark Signs: Ciliary flush, Keratic Precipitates (KPs in Arlt's triangle on lower 1/3 of cornea due to convection currents of aqueous humor), aqueous flare and cells in AC (Tyndall effect), Koeppe nodules (pupillary border), Busacca nodules (iris stroma), posterior synechiae (festooned pupil).",
                        "Management of Anterior Uveitis: 1. Topical Corticosteroid drops (Prednisolone acetate 1% frequent instillation); 2. Cycloplegic-mydriatic (Atropine 1% eye ointment or Homatropine 2% - puts ciliary muscle at rest, breaks and prevents posterior synechiae); 3. Treat systemic cause (HLA-B27, ankylosing spondylitis, sarcoidosis, tuberculosis)."
                    ),
                    referenceLinks = listOf(ReferenceLink("AIOS Uveitis Clinical Guidelines", "https://aios.org/", "Guideline")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "oph_conjunctiva_sn",
                    subjectId = "ophthalmology",
                    topicId = "oph_cornea_conjunctiva_uvea",
                    topicName = "Conjunctiva & Cornea Notes",
                    text = "Short Notes: 1. Pterygium & why it recurs after simple excision; 2. Vernal keratoconjunctivitis (VKC) / Spring Catarrh; 3. Phlyctenular conjunctivitis; 4. Endophthalmitis vs Panophthalmitis; 5. Hypopyon corneal ulcer.",
                    years = listOf("2024", "2023", "2021", "2020", "2019", "2018", "2017", "2015", "2011"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 Marks each",
                    textbookRef = "AK Khurana (9th Ed)",
                    pageNumbers = "75, 78, 82-83, 97, 161, 163",
                    highYieldPoints = listOf(
                        "Pterygium Recurrence: Simple bare-sclera excision has high recurrence (30-50%) because limbal stem cell deficiency and residual subconjunctival fibroblasts proliferate; prevented by Pterygium excision with Conjunctival Limbal Autograft (CLAG) using fibrin glue (recurrence <2-5%).",
                        "Vernal Keratoconjunctivitis (VKC): Recurrent bilateral allergic IgE/cell-mediated conjunctivitis in young boys in spring/summer; Palpebral form shows giant cobblestone papillae on upper tarsal conjunctiva; Bulbar form shows Horner-Trantas dots (gelatinous limbal dots of eosinophils); treated with topical mast-cell stabilizers (Olopatadine), topical steroids (Fluorometholone), or Cyclosporine.",
                        "Endophthalmitis vs Panophthalmitis: Endophthalmitis is inflammation of inner ocular coats and vitreous/aqueous without involving the sclera or Tenon's capsule (extraocular movements preserved); Panophthalmitis involves all three coats plus sclera, Tenon's capsule and orbit (severe chemosis, proptosis, and complete ophthalmoplegia)."
                    ),
                    referenceLinks = listOf(ReferenceLink("AIOS External Eye Diseases", "https://aios.org/", "Textbook"))
                )
            )
        ),
        Topic(
            id = "oph_lens_cataract_glaucoma",
            subjectId = "ophthalmology",
            name = "Lens, Cataract & Glaucoma",
            description = "Cataract pre-op biometry, SICS, phacoemulsification, acute primary angle closure glaucoma, POAG, and anti-glaucoma drugs.",
            textbookChapter = "Chapters 9 & 10: Diseases of Lens & Glaucoma",
            standardPages = "pp. 175-245",
            questions = listOf(
                Question(
                    id = "oph_glaucoma_1",
                    subjectId = "ophthalmology",
                    topicId = "oph_lens_cataract_glaucoma",
                    topicName = "Glaucoma",
                    text = "A 45-year-old female patient presents to the eye OPD with severe pain right eye along with gross dimness of vision, nausea and vomiting, shortly after watching a movie in a theatre. What may be the possible clinical diagnosis? How will you manage this case? Mention the differential diagnosis of a red eye.",
                    years = listOf("2023", "2022", "2018", "2010"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 6 + 6 = 15 Marks",
                    textbookRef = "AK Khurana (9th Ed)",
                    pageNumbers = "150, 216, 221",
                    highYieldPoints = listOf(
                        "Diagnosis: Acute Primary Angle Closure Glaucoma (PACG) in right eye, triggered by pupillary block during prolonged semi-mydriasis in the dark movie theatre.",
                        "Pathophysiology: Relative pupillary block in an anatomically predisposed eye (shallow AC, hypermetropic small eyeball) -> iris bombé formation -> peripheral iris apposition to trabecular meshwork -> sudden complete mechanical closure of angle -> dramatic surge in IOP (often 50-80 mmHg) -> corneal endothelial decompensation (steamy cornea) and optic nerve ischemia.",
                        "Immediate Medical Emergency Management: 1. IV Mannitol (20%, 1-2 g/kg infused rapidly over 30-45 min) to dehydrate the vitreous; 2. Oral Acetazolamide 500 mg stat followed by 250 mg QID (carbonic anhydrase inhibitor to decrease aqueous secretion); 3. Topical beta-blocker (Timolol maleate 0.5% BD); 4. Topical alpha-2 agonist (Brimonidine 0.2% TDS); 5. Pilocarpine 2% eye drops (started only after IOP <30 mmHg when iris sphincter ischemia has resolved, to pull iris away from angle); 6. Topical steroid (Prednisolone 1%) for inflammation.",
                        "Definitive Surgical Management: Nd:YAG Laser Peripheral Iridotomy (LPI) once cornea is clear; PROPHYLACTIC LPI MUST ALSO BE DONE IN THE FELLOW (OTHER) EYE because of identical anatomical predisposition!"
                    ),
                    referenceLinks = listOf(ReferenceLink("AIOS Angle Closure Management Protocol", "https://aios.org/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "oph_cataract_1",
                    subjectId = "ophthalmology",
                    topicId = "oph_lens_cataract_glaucoma",
                    topicName = "Cataract & Surgery",
                    text = "Write about the Preoperative work-up of a patient planned for cataract surgery. How do you assess Visual prognosis? Enumerate post-operative complications. Explain viscoelastic substances in cataract surgery.",
                    years = listOf("2024", "2023", "2021", "2019", "2017", "2016", "2013"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "7 + 3 = 10 Marks",
                    textbookRef = "AK Khurana (9th Ed)",
                    pageNumbers = "185, 190, 198, 201, 202, 437",
                    highYieldPoints = listOf(
                        "Preoperative Work-up: 1. Local ocular evaluation (visual acuity, slit-lamp exam for cornea/anterior chamber, pupillary reactions, IOP via Goldmann applanation, dilated fundoscopy, lacrimal syringing to rule out dacryocystitis); 2. Biometry (Keratometry + A-scan ultrasound axial length measurement) to calculate IOL power using SRK-T / Barrett formulas (P = A - 2.5L - 0.9K); 3. Systemic evaluation: BP, blood sugar, ECG.",
                        "Visual Prognosis Assessment: Projection of rays in all 4 quadrants (PR), two-light discrimination, pupillary light reflex, laser flare-cell meter, Macular function tests (foveal pinhole, color perception, potential acuity meter, B-scan ultrasound if dense cataract prevents fundus visualization).",
                        "Post-operative Complications: Early: Striate keratopathy, hyphema, iris prolapse, wound leak, acute bacterial endophthalmitis. Late: Posterior capsular opacification (PCO / 'after-cataract' treated with Nd:YAG laser capsulotomy), cystoid macular edema (Irvine-Gass syndrome), pseudophakic bullous keratopathy.",
                        "Viscoelastic Substances (OVDs): Sodium hyaluronate, HPMC, chondroitin sulfate; maintain anterior chamber depth, protect corneal endothelium from mechanical and phaco-ultrasonic trauma, and facilitate capsulorhexis and IOL implantation."
                    ),
                    referenceLinks = listOf(ReferenceLink("AIOS Cataract Surgical Guideline", "https://aios.org/", "Guideline")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "oph_glaucoma_sn",
                    subjectId = "ophthalmology",
                    topicId = "oph_lens_cataract_glaucoma",
                    topicName = "Glaucoma Notes",
                    text = "Short Notes on Glaucoma: 1. Anti-glaucoma drugs classification; 2. Field changes in POAG (Bjerrum scotoma); 3. Buphthalmos (congenital glaucoma); 4. Phacolytic glaucoma; 5. Trabeculectomy.",
                    years = listOf("2021", "2017", "2016", "2015", "2014"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 Marks each",
                    textbookRef = "AK Khurana (9th Ed)",
                    pageNumbers = "212, 217, 221, 231, 236",
                    highYieldPoints = listOf(
                        "Anti-glaucoma Drugs: 1. Prostaglandin analogues (Latanoprost, Bimatoprost - increase uveoscleral outflow, first-line); 2. Beta-blockers (Timolol 0.5% - decrease aqueous production); 3. Alpha-2 agonists (Brimonidine - dual action: decreases production and increases uveoscleral outflow); 4. Carbonic anhydrase inhibitors (Dorzolamide, Brinzolamide, Acetazolamide); 5. Cholinergics/Miotics (Pilocarpine - trabecular outflow).",
                        "Field Changes in POAG: Isopter contraction -> Bare sclera/baring of blind spot -> Seidel's scotoma (paracentral scotoma) -> Bjerrum's arcuate scotoma -> Roenne's nasal step -> Ring/double arcuate scotoma -> Tubular vision with temporal island.",
                        "Buphthalmos (Infantile Glaucoma): Due to trabeculodysgenesis (Barkan's membrane); classic triad of epiphora, photophobia, and blepharospasm; corneal enlargement (>12 mm in infant), Haab's striae (breaks in Descemet's), optic disc cupping; treated surgically with Goniotomy or Trabeculotomy."
                    ),
                    referenceLinks = listOf(ReferenceLink("AIOS Glaucoma Medical Management", "https://aios.org/", "Textbook"))
                )
            )
        ),
        Topic(
            id = "oph_retina_neuro_injuries",
            subjectId = "ophthalmology",
            name = "Retina, Neuro-Ophthalmology, Injuries & Community",
            description = "CRAO, diabetic retinopathy, retinoblastoma, pupillary pathways, squint, eyelid and lacrimal disorders, ocular trauma, and VISION 2020.",
            textbookChapter = "Chapters 11-20: Retina, Neuro, Motility, Adnexa & Community Eye Care",
            standardPages = "pp. 252-470",
            questions = listOf(
                Question(
                    id = "oph_retina_1",
                    subjectId = "ophthalmology",
                    topicId = "oph_retina_neuro_injuries",
                    topicName = "Retina & Vitreous",
                    text = "A 60-year-old gentleman with end stage kidney disease undergoing regular haemodialysis is presented with sudden onset painless loss of vision in right eye with floaters, poorly controlled DM for 20 years. Left eye shows diabetic retinopathy. i) Provisional diagnoses; ii) Diabetic retinopathy classification; iii) Treatment & visual rehabilitation; iv) Extra-posterior segment ocular diabetic complications.",
                    years = listOf("2024", "2021", "2019", "2016", "2011"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "1 + 1 + 10 + 3 = 15 Marks",
                    textbookRef = "AK Khurana (9th Ed)",
                    pageNumbers = "252, 260, 262, 284",
                    highYieldPoints = listOf(
                        "Diagnoses: Right eye: Central Retinal Artery Occlusion (CRAO) / Vitreous Haemorrhage; Left eye: Non-Proliferative or Proliferative Diabetic Retinopathy (NPDR / PDR).",
                        "Diabetic Retinopathy Classification (ETDRS): 1. Non-Proliferative (Mild: microaneurysms only; Moderate: hard exudates, cotton wool spots; Severe 4-2-1 rule: retinal hemorrhages in 4 quadrants, venous beading in 2 quadrants, IRMA in 1 quadrant); 2. Proliferative (PDR: Neovascularization of disc [NVD] or retina [NVE], vitreous/preretinal hemorrhage); 3. Clinically Significant Macular Edema (CSME).",
                        "Treatment: Left eye: Anti-VEGF intravitreal injections (Ranibizumab / Aflibercept), Panretinal Photocoagulation (PRP laser); Right eye (CRAO): Ocular emergency if within 6 hours (ocular massage, anterior chamber paracentesis, sublingual isosorbide dinitrate, hyperbaric oxygen).",
                        "Diabetic Ocular Complications outside Posterior Segment: Ectropion uveae, rubeosis iridis (neovascular glaucoma), snowflake cataract, recurrent styes, external ophthalmoplegia (isolated diabetic CN III palsy with pupil sparing), refractive fluctuations."
                    ),
                    referenceLinks = listOf(ReferenceLink("AIOS Diabetic Retinopathy Guidelines", "https://aios.org/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "oph_retinoblastoma_1",
                    subjectId = "ophthalmology",
                    topicId = "oph_retina_neuro_injuries",
                    topicName = "Retinoblastoma & Genetics",
                    text = "Describe the symptoms, signs, and management of Retinoblastoma. Explain why genetic counselling is important in retinoblastoma.",
                    years = listOf("2023", "2021", "2019", "2016"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 3 + 5 = 10 Marks",
                    textbookRef = "AK Khurana (9th Ed)",
                    pageNumbers = "284, 289",
                    highYieldPoints = listOf(
                        "Clinical Stages: 1. Quiescent stage: Hallmark is Leukocoria (white pupillary reflex / amaurotic cat's eye reflex, 60%) and Strabismus (20%); 2. Glaucomatous stage (secondary glaucoma, buphthalmic eye, pain); 3. Extraocular extension (fungating mass, proptosis); 4. Distant metastasis (intracranial via optic nerve, hematogenous).",
                        "Histopathology: Flexner-Wintersteiner rosettes (pathognomonic), Homer-Wright rosettes, and fleurettes.",
                        "Management: Chemotherapy (Carboplatin, Etoposide, Vincristine - CEV regimen) for chemoreduction; local focal therapies (transpupillary thermotherapy, cryotherapy, brachytherapy plaque); Enucleation indicated in advanced Reese-Ellsworth / IIRC Group E eyes.",
                        "Genetic Counselling: RB1 tumor suppressor gene on chromosome 13q14; Knudson's two-hit hypothesis; 40% are germline hereditary (often bilateral, multifocal, high risk of pinealoblastoma / trilateral retinoblastoma and osteosarcoma in later life); mandatory genetic screening of siblings and offspring."
                    ),
                    referenceLinks = listOf(ReferenceLink("Pediatric Ocular Oncology Consensus", "https://aios.org/", "Guideline")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "oph_adnexa_injuries_1",
                    subjectId = "ophthalmology",
                    topicId = "oph_retina_neuro_injuries",
                    topicName = "Ocular Injuries, Eyelid & Lacrimal",
                    text = "Discuss: 1. Pupillary light reflex pathway & drugs affecting it; 2. Blunt trauma & closed globe injury (farmer hit by tree branch); 3. Chronic dacryocystitis & steps of DCR; 4. Alkali burn of eye management; 5. VISION 2020: RIGHT TO SIGHT INDIA.",
                    years = listOf("2024", "2023", "2022", "2020", "2018", "2016", "2014"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "15 Marks",
                    textbookRef = "AK Khurana (9th Ed)",
                    pageNumbers = "296, 377, 379, 408, 417, 466",
                    highYieldPoints = listOf(
                        "Pupillary Light Reflex Pathway: Retinal photoreceptors -> Optic nerve -> Optic chiasma -> Optic tract -> Pretectal nucleus (midbrain) -> Bilateral Edinger-Westphal nuclei (responsible for direct & consensual light reflex) -> Preganglionic parasympathetics in CN III -> Ciliary ganglion -> Short ciliary nerves -> Sphincter pupillae.",
                        "Closed Globe Trauma / Tree Branch Injury: High suspicion of vegetative matter injury causing fungal keratitis (Aspergillus / Fusarium, feathery margins, satellite lesions, endothelial plaque) or traumatic hyphema and angle recession.",
                        "Dacryocystorhinostomy (DCR): Anastomosis between lacrimal sac and middle meatus of nasal cavity by creating a bony ostium through the lacrimal bone, bypassing nasolacrimal duct obstruction.",
                        "Alkali Burn Management: Ocular emergency! Immediate copius irrigation with sterile saline or water for at least 15-30 minutes until pH neutral (7.2-7.4); topical steroids, vitamin C (ascorbate), topical citrate, doxycycline, and autologous serum drops.",
                        "VISION 2020 India Strategic Plan 2021-2026: Joint initiative of WHO & IAPB to eliminate avoidable blindness by target disease control (cataract, refractive error, childhood blindness, glaucoma, diabetic retinopathy, corneal blindness), human resource development, and primary eye care infrastructure."
                    ),
                    referenceLinks = listOf(ReferenceLink("AIOS Ocular Trauma Protocol", "https://aios.org/", "Guideline")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "oph_retina_diabetic_retinopathy",
                    subjectId = "ophthalmology",
                    topicId = "oph_retina_neuro_injuries",
                    topicName = "Retinal Vascular Diseases",
                    text = "A 55-year-old poorly controlled diabetic presents with progressive painless loss of vision in both eyes. i) Classify Diabetic Retinopathy according to the International Clinical Diabetic Retinopathy (ETDRS) disease severity scale; ii) Clinical signs distinguishing Non-Proliferative (NPDR) and Proliferative (PDR); iii) Definition and optical coherence tomography (OCT) evaluation of Clinically Significant Macular Edema (CSME); iv) Management using Anti-VEGF agents and Panretinal Photocoagulation (PRP).",
                    years = listOf("2025", "2023", "2021", "2018", "2016", "2013", "2010"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "4 + 3 + 3 + 5 = 15 Marks",
                    textbookRef = "AK Khurana (9th Ed)",
                    pageNumbers = "266-278",
                    highYieldPoints = listOf(
                        "Diagnosis: Diabetic Retinopathy (DR) - microangiopathy primarily affecting retinal precapillary arterioles, capillaries, and postcapillary venules due to chronic hyperglycemia causing pericyte loss, basement membrane thickening, and capillary occlusion.",
                        "ETDRS / International Clinical Classification:",
                        "1. No Apparent Retinopathy: No abnormalities.",
                        "2. Mild NPDR: Microaneurysms only (earliest clinically visible sign - tiny red dots around macula).",
                        "3. Moderate NPDR: More than microaneurysms but less than severe NPDR (dot and blot hemorrhages, hard exudates in circinate ring pattern, cotton wool spots / soft exudates representing focal retinal nerve fiber layer ischemia).",
                        "4. Severe NPDR (4-2-1 Rule - any ONE of the following):",
                        "- Severe intraretinal hemorrhages in all 4 quadrants.",
                        "- Definite venous beading in >= 2 quadrants.",
                        "- Prominent Intraretinal Microvascular Abnormalities (IRMA) in >= 1 quadrant.",
                        "5. Very Severe NPDR: Any TWO of the 4-2-1 rule criteria.",
                        "6. Proliferative Diabetic Retinopathy (PDR): Characterized by Neovascularization (hallmark): Neovascularization of the disc (NVD) or Neovascularization elsewhere (NVE); Preretinal / Vitreous hemorrhage; Fibrovascular proliferation predisposing to Tractional Retinal Detachment (TRD).",
                        "High-Risk PDR: NVD >= 1/4 to 1/3 disc area, OR any NVD with vitreous/preretinal hemorrhage, OR NVE >= 1/2 disc area with vitreous hemorrhage (warrants URGENT treatment).",
                        "Diabetic Macular Edema (DME / CSME): Leading cause of moderate visual loss in diabetes. Evaluated by Optical Coherence Tomography (OCT - shows retinal thickening, intraretinal cystoid spaces, and subretinal fluid).",
                        "Management Protocol:",
                        "1. Systemic Control: Strict glycemic control (HbA1c < 7.0%), blood pressure (<130/80 mmHg), and serum lipids.",
                        "2. Anti-VEGF Intravitreal Therapy: First-line therapy for center-involving DME and PDR. Agents: Ranibizumab (0.5 mg), Aflibercept (2.0 mg), or Bevacizumab (1.25 mg monthly).",
                        "3. Panretinal Photocoagulation (PRP): Standard laser therapy for severe NPDR and PDR; 1200-1600 laser burns (500 micron spot size) delivered across peripheral retina outside temporal vascular arcades, sparing macula (destroys ischemic peripheral retina, lowering VEGF drive).",
                        "4. Pars Plana Vitrectomy (PPV): Indicated for non-clearing vitreous hemorrhage (>1-3 months), tractional retinal detachment involving or threatening macula, or combined rhegmatogenous-tractional detachment."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("AIOS Diabetic Retinopathy Guidelines", "https://aios.org/", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "oph_retina_detachment_rrd",
                    subjectId = "ophthalmology",
                    topicId = "oph_retina_neuro_injuries",
                    topicName = "Retinal Detachment",
                    text = "A 50-year-old high myope presents with sudden onset of floaters and photopsia (flashes of light) in right eye followed by a curtain-like dark shadow falling over his field of vision. i) Diagnosis and predisposing risk factors; ii) Differentiate Rhegmatogenous, Tractional, and Exudative retinal detachment; iii) Fundus signs (Shafer's sign, horse-shoe tear); iv) Principles of surgical repair (Pneumatic retinopexy, Scleral buckling, and Pars Plana Vitrectomy).",
                    years = listOf("2024", "2022", "2019", "2017", "2015", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 4 + 3 + 5 = 15 Marks",
                    textbookRef = "AK Khurana (9th Ed)",
                    pageNumbers = "279-288",
                    highYieldPoints = listOf(
                        "Diagnosis: Rhegmatogenous Retinal Detachment (RRD) - separation of the neurosensory retina from the underlying retinal pigment epithelium (RPE) caused by fluid entering through a full-thickness retinal break (hole, tear, or dialysis).",
                        "Predisposing Risk Factors: High myopia (axial length >26 mm with peripheral lattice degeneration), aphakia/pseudophakia (posterior capsulotomy), blunt ocular trauma, family history.",
                        "Prodromal Symptoms:",
                        "- Photopsia: Flashes of light caused by dynamic vitreoretinal traction on the retina.",
                        "- Floaters: Cobwebs / dark spots in visual field due to condensed vitreous fibrils or micro-hemorrhage from ruptured retinal vessels.",
                        "- Curtain-like visual field defect progressing centrally (relative or absolute scotoma corresponding to detached area).",
                        "Types of Retinal Detachment:",
                        "1. Rhegmatogenous (RRD): Retinal break present; mobile undulating corrugated convex retina; subretinal fluid shifts slowly.",
                        "2. Tractional (TRD): No retinal break; vitreoretinal fibrotic bands (diabetic retinopathy, ROP) pull retina into concave immobile peaks.",
                        "3. Exudative / Serous (SRD): No break or traction; transudation/exudation from choroidal/retinal vessels (VKH syndrome, malignant hypertension, choroidal melanoma); smooth convex bullous retina with rapidly shifting fluid dependent on gravity.",
                        "Examination Signs:",
                        "- Shafer's Sign ('Tobacco dust'): Pigment clumps in anterior vitreous on slit-lamp biomicroscopy (liberated RPE cells).",
                        "- Relative Afferent Pupillary Defect (RAPD / Marcus Gunn pupil) if extensive detachment.",
                        "- Indirect Ophthalmoscopy: Detached retina appears grey, translucent, undulating with lost choroidal pattern; dark tortuous blood vessels.",
                        "Surgical Principles (Find and close all breaks):",
                        "- Retinopexy: Cryotherapy or laser photocoagulation around tear edges to create chorioretinal adhesion scar.",
                        "- Scleral Buckling: Explant (silicone sponge/band) sutured to sclera to indent the eye wall, relieving vitreoretinal traction.",
                        "- Pars Plana Vitrectomy (PPV): Removal of vitreous traction, fluid-air exchange, endolaser, and internal tamponade using expansile gas (SF6 / C3F8) or silicone oil."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("AIOS Vitreoretinal Society Guidelines for Retinal Detachment", "https://aios.org/", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                )
            )
        )
    )
}
