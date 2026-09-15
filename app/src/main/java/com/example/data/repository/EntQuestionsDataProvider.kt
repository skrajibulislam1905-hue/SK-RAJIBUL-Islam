package com.example.data.repository

import com.example.data.model.*

object EntQuestionsDataProvider {

    fun getTopics(): List<Topic> = listOf(
        Topic(
            id = "ent_ear_anatomy_physio",
            subjectId = "ent",
            name = "Ear: Anatomy, Hearing & Vestibular Functions",
            description = "Middle ear cleft anatomy, facial nerve relation, Organ of Corti, audiometry, ABC test, and vestibular testing (Dix-Hallpike, caloric, fistula test).",
            textbookChapter = "Chapters 1-6: Anatomy & Physiology of Ear & Hearing Assessment",
            standardPages = "pp. 5-49, 471",
            questions = listOf(
                Question(
                    id = "ent_ear_1",
                    subjectId = "ent",
                    topicId = "ent_ear_anatomy_physio",
                    topicName = "Ear Anatomy & Physiology",
                    text = "Describe the anatomy of medial and posterior wall of middle ear. Describe the relation with facial nerve in medial & posterior wall.",
                    years = listOf("2011"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "10 Marks",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "6-7",
                    highYieldPoints = listOf(
                        "Medial wall features: Promontory (formed by basal turn of cochlea), Oval window (fenestra vestibuli with stapes footplate), Round window (fenestra cochleae closed by secondary tympanic membrane), Prominence of facial canal (running horizontally above oval window), Prominence of lateral semicircular canal (running above and posterior to facial canal).",
                        "Posterior wall features: Aditus ad antrum (communicates with mastoid antrum), Fossa incudis (lodges short process of incus), Pyramidal eminence (transmits stapedius tendon), Facial recess (suprapyramidal recess bounded by fossa incudis, chorda tympani, and vertical facial nerve), Sinus tympani (deep depression medial to pyramid).",
                        "Facial nerve relations: Runs horizontally along medial wall above oval window and below lateral semicircular canal, turns downwards at second genu on posterior wall (pyramidal turn) to descend vertically in mastoid segment to exit stylomastoid foramen."
                    ),
                    referenceLinks = listOf(ReferenceLink("AOI India Temporal Bone Anatomy", "https://aoiindia.org/", "Textbook"))
                ),
                Question(
                    id = "ent_ear_2",
                    subjectId = "ent",
                    topicId = "ent_ear_anatomy_physio",
                    topicName = "Ear Anatomy & Physiology",
                    text = "Describe auditory pathway up to cerebral cortex. Draw a labelled diagram of Organ of Corti.",
                    years = listOf("2020"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "10 Marks",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "16, 17",
                    highYieldPoints = listOf(
                        "Organ of Corti: Rests on basilar membrane in scala media; consists of inner hair cells (single row, 3500, primary sensory transducers) and outer hair cells (3-4 rows, 12,000, mechanical amplifiers/electromotility), tectorial membrane, rods of Corti, Deiters and Hensen cells.",
                        "Auditory Pathway Mnemonic (SLIM C): Spiral ganglion (1st order) -> Cochlear nuclei (ventral & dorsal in medulla) -> Superior Olivary complex (in pons, sound localization) -> Lateral Lemniscus -> Inferior Colliculus (midbrain) -> Medial Geniculate body (thalamus) -> Auditory Cortex (Heschl's transverse gyrus, Brodmann areas 41 & 42 in superior temporal gyrus)."
                    ),
                    referenceLinks = listOf(ReferenceLink("Auditory Physiology Guidelines", "https://aoiindia.org/", "Textbook"))
                ),
                Question(
                    id = "ent_ear_3",
                    subjectId = "ent",
                    topicId = "ent_ear_anatomy_physio",
                    topicName = "Ear Anatomy & Physiology",
                    text = "What is middle ear cleft? Describe the anatomy of medial wall of middle ear with relevant diagram. Mention applied importance of facial recess.",
                    years = listOf("2021"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "10 Marks",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "7",
                    highYieldPoints = listOf(
                        "Middle Ear Cleft includes: Eustachian tube, tympanic cavity (middle ear proper), aditus ad antrum, mastoid antrum, and all communicating mastoid air cells.",
                        "Facial Recess (Posterior Tympanotomy): Boundaries: Medially by vertical descending mastoid segment of facial nerve, Laterally by chorda tympani nerve and tympanic annulus, Superiorly by fossa incudis (short process of incus).",
                        "Applied Importance: Surgical corridor for posterior tympanotomy in cochlear implantation (drilling through facial recess to access round window without disturbing ossicular chain or external canal), and for clearing disease from sinus tympani in cholesteatoma."
                    ),
                    referenceLinks = listOf(ReferenceLink("Cochlear Implant Surgical Approach", "https://aoiindia.org/", "Guideline"))
                ),
                Question(
                    id = "ent_ear_4",
                    subjectId = "ent",
                    topicId = "ent_ear_anatomy_physio",
                    topicName = "Ear Anatomy & Hearing",
                    text = "Enumerate the ENT causes of giddiness. Describe Dix-Hallpike test. Describe the treatment of Benign Paroxysmal Positional Vertigo (BPPV).",
                    years = listOf("2024"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 3 + 4 = 10 Marks",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "48, 49",
                    highYieldPoints = listOf(
                        "ENT causes of giddiness: BPPV, Meniere's disease, vestibular neuritis, labyrinthitis, acoustic neuroma, perilymph fistula, ototoxic drug vestibulopathy.",
                        "Dix-Hallpike Test: Patient seated on couch -> head turned 45 degrees toward test ear -> quickly laid flat with head extending 20 degrees over table edge. Positive in posterior canal BPPV: Latency of 2-20 sec, geotropic rotatory nystagmus beating towards undermost ear, crescendo-decrescendo duration (<60 sec), fatigability on repetition.",
                        "Treatment: Particle repositioning maneuver (Epley's Maneuver) or Semont maneuver to migrate canaliths back into the utricle. Vestibular rehabilitation exercises (Brandt-Daroff)."
                    ),
                    referenceLinks = listOf(ReferenceLink("AAO-HNS BPPV Guidelines", "https://www.entnet.org/", "Guideline"))
                ),
                Question(
                    id = "ent_ear_5",
                    subjectId = "ent",
                    topicId = "ent_ear_anatomy_physio",
                    topicName = "Ear Anatomy & Hearing",
                    text = "Short Notes on Ear Investigations: 1. Pure tone audiometry; 2. Absolute bone conduction (ABC) test; 3. Tympanostomy; 4. Fistula test; 5. Caloric test.",
                    years = listOf("2023", "2022", "2015", "2014", "2012"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 x 3 = 15 Marks",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "26, 27, 47, 49, 471",
                    highYieldPoints = listOf(
                        "Pure Tone Audiometry (PTA): Evaluates hearing thresholds (air conduction and bone conduction) from 125 Hz to 8000 Hz; calculates air-bone gap (ABG) for conductive vs sensorineural hearing loss.",
                        "Absolute Bone Conduction (ABC) Test: Bone conduction tested with external auditory meatus occluded; reduced in sensorineural hearing loss, normal in conductive hearing loss.",
                        "Tympanostomy (Grommet insertion): Radial incision in anteroinferior quadrant of tympanic membrane for ventilation of middle ear in otitis media with effusion (OME / glue ear).",
                        "Fistula Test: Alternating positive and negative pressure applied to EAC with Siegle's speculum; positive (vertigo and nystagmus) indicates erosion of lateral semicircular canal (usually by cholesteatoma).",
                        "Caloric Test (Fitzgerald-Hallpike): Irrigating ears with water at 30 deg C (cold) and 44 deg C (warm); mnemonic COWS (Cold Opposite, Warm Same) identifies canal paresis."
                    ),
                    referenceLinks = listOf(ReferenceLink("Clinical Audiometry Manual", "https://aoiindia.org/", "Textbook"))
                ),
                Question(
                    id = "ent_ear_6",
                    subjectId = "ent",
                    topicId = "ent_ear_anatomy_physio",
                    topicName = "External Ear",
                    text = "Short Notes: 1. Malignant otitis externa; 2. Otomycosis; 3. McEwen's triangle; 4. Foreign body of ear; 5. Circumscribed otitis externa.",
                    years = listOf("2022", "2015", "2013", "2012", "2011", "2010"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 Marks each",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "5, 7, 61, 63",
                    highYieldPoints = listOf(
                        "Malignant Otitis Externa: Invasive skull base osteomyelitis caused by Pseudomonas aeruginosa in elderly uncontrolled diabetics; hallmark is granulations in EAC at bone-cartilage junction; treated with IV Ciprofloxacin/Ceftazidime and strict glycemic control.",
                        "Otomycosis: Fungal infection of EAC (Aspergillus niger black spores or Candida albicans white curdy debris); severe pruritus and ear fullness; treated by suction clearance and topical clotrimazole.",
                        "McEwen's Triangle (Suprameatal triangle): Surgical landmark on mastoid cortex for locating mastoid antrum; bounded by supramastoid crest superiorly, posterosuperior margin of bony EAC anteroinferiorly, and vertical tangent to posterior EAC wall posteriorly."
                    ),
                    referenceLinks = listOf(ReferenceLink("AOI Skull Base Infections", "https://aoiindia.org/", "Textbook"))
                )
            )
        ),
        Topic(
            id = "ent_middle_ear_mastoid",
            subjectId = "ent",
            name = "Middle Ear, CSOM, Otosclerosis & Facial Nerve",
            description = "Chronic suppurative otitis media (mucosal vs squamous), cholesteatoma, ASOM, otosclerosis, and Bell's palsy.",
            textbookChapter = "Chapters 7-14: Middle Ear, Mastoid & Facial Nerve",
            standardPages = "pp. 73-118, 470",
            questions = listOf(
                Question(
                    id = "ent_com_1",
                    subjectId = "ent",
                    topicId = "ent_middle_ear_mastoid",
                    topicName = "CSOM & Cholesteatoma",
                    text = "A 20-year-old male attends the OPD with complaint of profuse sticky discharge from both the ears after an episode of common cold 7 days back. He suffers from recurrent episodes of discharge from the ears for the last 5 years. i) Most probable diagnosis? ii) What other symptoms may be present? iii) How can you relate the disease process for development of symptoms? iv) Otoscopic findings and disease staging? v) How will you treat the patient?",
                    years = listOf("2023", "2022", "2019", "2018", "2015", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 2 + 5 + 2 + 4 = 15 Marks",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "73-75, 81-85",
                    highYieldPoints = listOf(
                        "Diagnosis: Chronic Suppurative Otitis Media (CSOM) - Tubotympanic (Mucosal / Safe) type in active stage.",
                        "Symptoms: Profuse, painless, non-offensive, mucoid or mucopurulent ear discharge precipitated by upper respiratory infection or water entering the ear; conductive hearing loss; absence of vertigo or deep pain.",
                        "Pathology: Permanent central perforation in pars tensa allows direct environmental and Eustachian bacterial entry -> mucosal edema and hypersecretion of goblet cells -> active mucopurulent discharge.",
                        "Otoscopy: Central perforation of pars tensa (kidney-shaped, anterior, or inferior) with surrounding rim of tympanic membrane intact, pink velvety swollen middle ear mucosa without cholesteatoma flakes or granulations.",
                        "Staging: Active (currently discharging) vs Inactive (dry perforation) vs Quiescent (healed with thin neomembrane).",
                        "Treatment: Aural toilet (gentle suctioning), topical antibiotic-steroid ear drops (Ciprofloxacin + Dexamethasone), oral antibiotics if severe; keep ear strictly dry; Definitive surgery: Type 1 Tympanoplasty (Myringoplasty) using temporalis fascia graft once the ear is dry for at least 6 weeks."
                    ),
                    referenceLinks = listOf(ReferenceLink("AOI CSOM Guidelines", "https://aoiindia.org/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "ent_com_2",
                    subjectId = "ent",
                    topicId = "ent_middle_ear_mastoid",
                    topicName = "Cholesteatoma",
                    text = "Define Cholesteatoma. Describe the pathogenesis, clinical features, and management of CSOM with cholesteatoma.",
                    years = listOf("2024", "2017", "2015", "2014"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 3 + 5 = 10 Marks",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "78, 79, 85-87",
                    highYieldPoints = listOf(
                        "Definition: A non-neoplastic destructive lesion of the temporal bone lined by keratinizing stratified squamous epithelium containing desquamated keratin flakes ('skin in the wrong place').",
                        "Pathogenesis Theories: 1. Invagination theory (Bezold/Wittmaack) - negative middle ear pressure pulls retraction pocket in pars flaccida; 2. Basal cell hyperplasia (Ruedi); 3. Epithelial invasion/migration through marginal perforation (Habermann); 4. Metaplasia of middle ear mucosa (Sade); 5. Congenital embryonic cell rests.",
                        "Clinical Features: Scanty, persistently foul-smelling (bone erosion / anaerobic), blood-stained discharge; attic or posterosuperior marginal perforation; pearly white keratin flakes; conductive or mixed hearing loss; high risk of intracranial complications.",
                        "Management: High-resolution CT (HRCT) of temporal bone; definitive surgery: Canal Wall Down (Modified Radical Mastoidectomy) or Canal Wall Up (Cortical Mastoidectomy + Posterior Tympanotomy) with ossiculoplasty."
                    ),
                    referenceLinks = listOf(ReferenceLink("Cholesteatoma Surgical Consensus", "https://aoiindia.org/", "Textbook")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "ent_otoscl_1",
                    subjectId = "ent",
                    topicId = "ent_middle_ear_mastoid",
                    topicName = "Otosclerosis",
                    text = "Describe pathogenesis, clinical features, and management of otosclerosis. Explain Schwartze sign and Carhart's notch.",
                    years = listOf("2024", "2023", "2016"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 3 + 4 = 10 Marks",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "104, 105",
                    highYieldPoints = listOf(
                        "Pathogenesis: Autosomal dominant primary localized disease of otic capsule characterized by replacement of mature lamellar bone with spongy, hypervascular woven bone, classically involving the fissula ante fenestram anterior to oval window.",
                        "Clinical Presentation: Young adult (female:male 2:1, age 20-40, aggravated by pregnancy), bilateral progressive painless conductive hearing loss with normal intact tympanic membrane, Paracusis Willisii (patient hears better in noisy surroundings due to raised conversational voice of others).",
                        "Schwartze Sign: Flamingo pink blush over promontory seen through tympanic membrane indicating active vascular otospongiotic phase.",
                        "Carhart's Notch: Classical pseudo-sensorineural dip in bone conduction threshold maximum at 2 kHz (15 dB dip) due to loss of inertial bone conduction component when stapes is fixated; disappears after successful stapedotomy.",
                        "Management: Stapedotomy with Teflon piston insertion (0.6 mm fenestra in footplate); hearing aids for patients unwilling or unfit for surgery; Sodium fluoride in active vascular phase."
                    ),
                    referenceLinks = listOf(ReferenceLink("Otosclerosis Clinical Management", "https://aoiindia.org/", "Guideline")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "ent_facial_1",
                    subjectId = "ent",
                    topicId = "ent_middle_ear_mastoid",
                    topicName = "Facial Nerve Disorders",
                    text = "Outline the intratemporal course of the facial nerve with diagram. Write down clinical features and management of Bell's palsy.",
                    years = listOf("2022", "2018", "2010"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "5 + 5 = 10 Marks",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "108, 112-113",
                    highYieldPoints = listOf(
                        "Intratemporal Course: Total length ~30 mm in 4 segments: 1. Meatal (in internal acoustic meatus, 8-10 mm); 2. Labyrinthine (shortest, 3-4 mm, narrowest segment <0.7 mm, extends to geniculate ganglion giving greater superficial petrosal nerve); 3. Tympanic / Horizontal (10-11 mm, runs along medial wall above oval window); 4. Mastoid / Vertical (12-13 mm, from second genu to stylomastoid foramen, gives nerve to stapedius and chorda tympani).",
                        "Bell's Palsy: Acute idiopathic lower motor neuron facial paralysis (herpes simplex virus reactivation proposed); sudden onset unilateral facial weakness, loss of forehead wrinkles, Bell's phenomenon (eyeball rolls upward and outward on attempted eye closure), loss of nasolabial fold, mouth angle deviation to normal side, hyperacusis, loss of taste on anterior 2/3 of tongue.",
                        "Management: Oral Prednisolone (1 mg/kg/day for 7-10 days, tapered) started within 72 hours; add oral Acyclovir/Valacyclovir; eye care (lubricating eye drops, night eye taping) to prevent exposure keratitis."
                    ),
                    referenceLinks = listOf(ReferenceLink("AAO-HNS Bell's Palsy Guideline", "https://www.entnet.org/", "Guideline")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "ent_mastoid_sn",
                    subjectId = "ent",
                    topicId = "ent_middle_ear_mastoid",
                    topicName = "Middle Ear Complications",
                    text = "Short Notes on Middle Ear Complications: 1. Sigmoid Sinus Thrombosis; 2. Acute Mastoiditis; 3. Lateral sinus thrombosis; 4. Myringoplasty vs Myringotomy; 5. Ears should always be clinically assessed in enlarged adenoids.",
                    years = listOf("2024", "2022", "2021", "2018", "2011", "2010"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 Marks each",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "91, 100, 470, 471",
                    highYieldPoints = listOf(
                        "Sigmoid (Lateral) Sinus Thrombosis: Periphlebitis -> mural thrombus -> occlusive thrombus; characterized by 'picket-fence' hectic fever with chills/rigors, Griesinger's sign (edema over mastoid emissary vein), and positive Tobey-Ayer test.",
                        "Acute Mastoiditis: Suppuration extending into mastoid air cell trabeculae with osteitis; ironed-out mastoid surface, reservoir sign on aural toilet, and pinna pushed downwards and forwards.",
                        "Myringoplasty vs Myringotomy: Myringotomy is incision in tympanic membrane to drain middle ear fluid (e.g. ASOM or serous otitis); Myringoplasty is surgical reconstruction/closure of tympanic membrane perforation without ossicular exploration.",
                        "Adenoids & Ears: Hypertrophied adenoids block Eustachian tube orifice in nasopharynx and harbor biofilm bacteria, directly leading to Eustachian tube dysfunction, negative middle ear pressure, and Otitis Media with Effusion (glue ear)."
                    ),
                    referenceLinks = listOf(ReferenceLink("AOI Complications of Otitis Media", "https://aoiindia.org/", "Textbook"))
                )
            )
        ),
        Topic(
            id = "ent_nose_sinus",
            subjectId = "ent",
            name = "Nose, Paranasal Sinuses, Epistaxis & Polyps",
            description = "Little's area, epistaxis management, FESS, Antrochoanal vs Ethmoidal polyps, foreign body, and acute sinusitis.",
            textbookChapter = "Chapters 15-26: Nose and Paranasal Sinuses",
            standardPages = "pp. 156-230, 482-496",
            questions = listOf(
                Question(
                    id = "ent_epistaxis_1",
                    subjectId = "ent",
                    topicId = "ent_nose_sinus",
                    topicName = "Epistaxis",
                    text = "How will you manage a 60 yrs male known hypertensive at emergency room with spontaneous epistaxis? What are the causes of bilateral nasal blockage? Describe Little's area and Kiesselbach's plexus.",
                    years = listOf("2022", "2020", "2016", "2015", "2010"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "7 + 3 = 10 Marks",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "170, 201, 204, 205-209",
                    highYieldPoints = listOf(
                        "Little's Area / Kiesselbach's Plexus: Located in anteroinferior part of nasal septum; site of 90% anterior epistaxis; confluence of 4 arteries: 1. Anterior ethmoidal (ophthalmic -> ICA), 2. Septal branch of superior labial (facial -> ECA), 3. Sphenopalatine branch (maxillary -> ECA), 4. Greater palatine artery (maxillary -> ECA).",
                        "Woodruff's Plexus: Venous/arterial confluence below posterior end of inferior turbinate; common site of posterior hypertensive epistaxis in elderly.",
                        "Emergency Management of Hypertensive Epistaxis: 1. Trotter's Method (sit upright, pinch soft part of nose for 10-15 min, breathe through mouth); 2. Hemodynamic stabilization and IV access; 3. Gentle suctioning to clear clots; 4. Anterior nasal packing (ribbon gauze with liquid paraffin or Merocel packs); 5. If bleeding continues posteriorly: Foley catheter (No. 12-14) or posterior nasal pack; 6. Endoscopic bipolar cautery or sphenopalatine artery (SPA) ligation; 7. Blood pressure control.",
                        "Causes of Bilateral Nasal Blockage: Bilateral deviated nasal septum (S-shaped), bilateral nasal polyposis, hypertrophied inferior turbinates, adenoid hypertrophy, atrophic rhinitis, rhinitis medicamentosa."
                    ),
                    referenceLinks = listOf(ReferenceLink("AAO-HNS Epistaxis Clinical Guideline", "https://www.entnet.org/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "ent_polyp_fess",
                    subjectId = "ent",
                    topicId = "ent_nose_sinus",
                    topicName = "Nasal Polyps & FESS",
                    text = "Enumerate the indications of Functional Endoscopic Sinus Surgery (FESS). Describe the steps of FESS. Enumerate the complications of FESS. Differentiate Antrochoanal from Ethmoidal polyp.",
                    years = listOf("2024", "2020", "2018", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "10 Marks",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "200, 201, 494-496",
                    highYieldPoints = listOf(
                        "Antrochoanal vs Ethmoidal Polyp: Antrochoanal arises from maxillary antrum, solitary, unilateral, grows backward towards choana/nasopharynx, common in children/young adults, non-allergic. Ethmoidal polyps arise from ethmoidal sinuses/middle meatus, multiple, bilateral, grow forward, common in adults, strongly allergic/eosinophilic.",
                        "Indications for FESS: Chronic rhinosinusitis refractory to medical therapy, antrochoanal polyp, sinonasal polyposis, recurrent acute rhinosinusitis, fungal sinusitis, orbital decompression, CSF leak repair, pituitary tumour access.",
                        "Steps of FESS (Messerklinger technique): 1. Uncinectomy (removal of uncinate process); 2. Middle meatal antrostomy (widening maxillary ostium); 3. Anterior ethmoidectomy (opening bulla ethmoidalis); 4. Posterior ethmoidectomy (if diseased); 5. Sphenoidotomy; 6. Frontal sinusotomy (Draf I/II).",
                        "Complications of FESS: Minor: adhesion/synchiae, epistaxis, periorbital ecchymosis. Major: CSF leak/meningitis (cribriform plate breach), orbital hematoma/blindness (anterior ethmoidal artery retraction or optic nerve trauma), internal carotid artery laceration."
                    ),
                    referenceLinks = listOf(ReferenceLink("FESS Operative Technique", "https://aoiindia.org/", "Textbook")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "ent_nose_misc",
                    subjectId = "ent",
                    topicId = "ent_nose_sinus",
                    topicName = "Nasal Cavity Disorders",
                    text = "Short Notes on Nasal Diseases: 1. Unilateral foul-smelling nasal discharge in a 5-year-old child; 2. Rhinolith; 3. CSF Rhinorrhoea; 4. Dangerous area of nose; 5. Atrophic Rhinitis; 6. Septoplasty vs SMR; 7. Acute maxillary sinusitis.",
                    years = listOf("2024", "2022", "2021", "2019", "2018", "2017", "2014", "2011"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 Marks each",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "170, 178, 185, 188, 189, 191, 223, 490",
                    highYieldPoints = listOf(
                        "Unilateral foul-smelling discharge in child: Hallmarked presentation of impacted nasal foreign body until proven otherwise (button battery, pea, bead); requires careful endoscopic extraction.",
                        "Dangerous Area of Nose: Lower third of external nose and upper lip; veins lack valves and communicate with cavernous sinus via facial vein, angular vein, and superior ophthalmic vein, predisposing to Cavernous Sinus Thrombosis from furuncles.",
                        "CSF Rhinorrhoea: Clear, watery discharge from nose, sweet taste (contains glucose >30 mg/dL), beta-2 transferrin positive; does not stiffen handkerchief, increases on bending forward (reservoir sign).",
                        "Atrophic Rhinitis (Ozaena): Chronic nasal disease with progressive atrophy of nasal mucosa and turbinates; spacious nasal cavity filled with foul-smelling greenish crusts, mercaptan odor, yet patient has anosmia (merciful anosmia); Klebsiella ozaenae implicated."
                    ),
                    referenceLinks = listOf(ReferenceLink("AOI Rhinology Compendium", "https://aoiindia.org/", "Textbook"))
                )
            )
        ),
        Topic(
            id = "ent_throat_larynx",
            subjectId = "ent",
            name = "Pharynx, Larynx, Tonsils, Voice & Tracheostomy",
            description = "Juvenile Nasopharyngeal Angiofibroma, tonsillitis, Quinsy, retropharyngeal abscess, vocal nodules, hoarseness, and tracheostomy.",
            textbookChapter = "Chapters 27-40: Oral Cavity, Pharynx & Larynx",
            standardPages = "pp. 281-375, 503-506",
            questions = listOf(
                Question(
                    id = "ent_jna_1",
                    subjectId = "ent",
                    topicId = "ent_throat_larynx",
                    topicName = "Tumours of Nasopharynx",
                    text = "A 15-year-old boy attended the emergency with profuse spontaneous epistaxis. He gives the history of repeated similar episodes in the last one year. a) What is the most probable diagnosis? b) Differential diagnosis? c) What other symptoms may the patient present with? d) Clinical and radiological findings? e) Treatment protocol.",
                    years = listOf("2024", "2017", "2010"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "1 + 2 + 3 + 4 + 5 = 15 Marks",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "292-293",
                    highYieldPoints = listOf(
                        "Diagnosis: Juvenile Nasopharyngeal Angiofibroma (JNA) - histologically benign, locally aggressive, vascular tumour occurring almost exclusively in adolescent males (testosterone-dependent).",
                        "Differential Diagnosis: Antrochoanal polyp, rhinosporidiosis, nasopharyngeal carcinoma, inverted papilloma, severe bleeding diathesis.",
                        "Presentation: Triad of recurrent unprovoked profuse painless epistaxis, progressive unilateral nasal obstruction, and a smooth lobulated pink-purple mass in nasopharynx.",
                        "Radiology: Contrast CECT / MRI shows Holman-Miller sign (anterior bowing of posterior wall of maxillary antrum) with expansion of sphenopalatine foramen; Digital Subtraction Angiography (DSA) demonstrates tumor blush typically fed by internal maxillary artery.",
                        "Golden Rule: BIOPSY IS STRICTLY CONTRAINDICATED in the clinic or OPD due to torrential life-threatening hemorrhage!",
                        "Treatment: Preoperative transarterial embolization (24-48 hours prior) followed by complete surgical resection via endoscopic transnasal or open transmaxillary / midfacial degloving approach."
                    ),
                    referenceLinks = listOf(ReferenceLink("AOI Head & Neck Oncology Guidelines", "https://aoiindia.org/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "ent_tonsil_space_1",
                    subjectId = "ent",
                    topicId = "ent_throat_larynx",
                    topicName = "Tonsillitis & Deep Neck Infections",
                    text = "Discuss aetiology, clinical features, and management of: 1. Acute peritonsillar abscess (Quinsy); 2. Acute retropharyngeal abscess; 3. Acute tonsillitis and patches over tonsil; 4. Secondary post-tonsillectomy hemorrhage.",
                    years = listOf("2023", "2022", "2018", "2017", "2016", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "10 Marks",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "305-306, 311, 313, 506",
                    highYieldPoints = listOf(
                        "Quinsy (Peritonsillar Abscess): Pus collection in peritonsillar space between tonsillar capsule and superior constrictor muscle; severe unilateral odynophagia, 'hot potato voice', trismus (spasm of internal pterygoid), medial displacement of tonsil with uvula pushed to opposite side; Treatment: needle aspiration or incisional drainage at point of maximum bulge, IV Co-Amoxiclav, interval tonsillectomy after 6 weeks.",
                        "Acute Retropharyngeal Abscess: Suppuration in retropharyngeal space of Gilette; common in children <5 years secondary to suppurating retropharyngeal lymph nodes; presents with dysphagia, dyspnea, neck hyperextension, posterior pharyngeal wall bulge; lateral neck X-ray shows widened prevertebral soft tissue shadow; drainage performed in Trendelenburg position.",
                        "Patches over Tonsil DD: Diphtheria (grey adherent pseudomembrane, bleeds on removal), Vincent's angina (punched out ulcer), infectious mononucleosis (generalized lymphadenopathy, atypical lymphocytes), candidiasis, agranulocytosis.",
                        "Secondary Tonsillectomy Bleeding (5-10 days post-op): Caused by infection and premature sloughing of fibrin clot from tonsillar fossa; treated with IV antibiotics, hydrogen peroxide gargles, and surgical ligation under GA if persistent."
                    ),
                    referenceLinks = listOf(ReferenceLink("AOI Throat & Pharynx Practice Guidelines", "https://aoiindia.org/", "Textbook")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "ent_larynx_hoarse_1",
                    subjectId = "ent",
                    topicId = "ent_throat_larynx",
                    topicName = "Larynx & Hoarseness",
                    text = "A teacher consults you for his hoarse voice. The voice becomes worse towards the end of the day after the classes. i) Name clinical condition; ii) Two other differential diagnoses; iii) Clinical examination and investigations; iv) Findings; v) Treatment protocol.",
                    years = listOf("2023", "2019", "2014", "2009"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "1 + 2 + 2 + 2 + 5 + 3 = 15 Marks",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "352",
                    highYieldPoints = listOf(
                        "Diagnosis: Vocal Nodules (Singer's / Teacher's Nodes) - bilateral, symmetrical, small fibrous nodules at the junction of anterior 1/3 and posterior 2/3 of true vocal cords (point of maximal mechanical impact/vibration).",
                        "Differential Diagnosis: Vocal cord polyp (usually unilateral, gelatinous, pedunculated), Reinke's edema (diffuse polypoid degeneration from heavy smoking), contact granuloma, early laryngeal carcinoma.",
                        "Examination: 70/90 degree rigid video-laryngoscopy or flexible nasopharyngolaryngoscopy, stroboscopy (shows mucosal wave disruption and hour-glass glottic closure).",
                        "Treatment: Primary and gold-standard treatment is conservative voice therapy / speech pathology (voice rest, vocal hygiene, eliminating vocal abuse and throat clearing); Microlaryngeal surgery (MLS) with cold instruments only if large, fibrous, or refractory to speech therapy."
                    ),
                    referenceLinks = listOf(ReferenceLink("Voice Disorders Clinical Review", "https://aoiindia.org/", "Guideline")),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "ent_tracheostomy_1",
                    subjectId = "ent",
                    topicId = "ent_throat_larynx",
                    topicName = "Tracheostomy & Airway",
                    text = "Describe indications, steps, functions, and complications of Tracheostomy. Why may cancer of left lung present with hoarseness?",
                    years = listOf("2024", "2019", "2017", "2015", "2013", "2011"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "10 Marks",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "369, 372",
                    highYieldPoints = listOf(
                        "Indications: Upper airway obstruction (tumours, foreign bodies, Ludwig's angina, laryngeal edema), prolonged mechanical ventilation (>7-14 days), tracheobronchial pulmonary toilet (impaired cough/secretions in coma/GBS).",
                        "Steps: Extension of neck with shoulder roll -> horizontal collar or vertical incision halfway between cricoid and sternal notch -> divide investing layer -> divide thyroid isthmus -> vertical or Bjork flap incision through 2nd and 3rd tracheal rings (never 1st ring to prevent subglottic stenosis) -> insert cuffed tracheostomy tube.",
                        "Immediate Complications: Hemorrhage, apnoea, pneumothorax, surgical emphysema. Late: Tracheal stenosis, tracheoesophageal fistula, decannulation difficulty.",
                        "Left Lung Cancer & Hoarseness: Left recurrent laryngeal nerve hooks around the aortic arch in close proximity to the left pulmonary hilum and mediastinal lymph nodes; direct mediastinal tumor infiltration causes vocal cord palsy and hoarseness (Ortner-like syndrome)."
                    ),
                    referenceLinks = listOf(ReferenceLink("AOI Tracheostomy Care Protocols", "https://aoiindia.org/", "Guideline")),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "ent_throat_sn",
                    subjectId = "ent",
                    topicId = "ent_throat_larynx",
                    topicName = "Pharynx & Larynx Notes",
                    text = "Short Notes: 1. Safety muscle of larynx (posterior cricoarytenoid); 2. Obstructive sleep apnoea (OSA); 3. Laryngomalacia; 4. Waldeyer's ring; 5. Plummer-Vinson syndrome; 6. Nerve supply of larynx; 7. Acute epiglottitis.",
                    years = listOf("2024", "2021", "2020", "2019", "2018", "2016", "2014", "2013", "2010"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 Marks each",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "281, 326, 332, 334, 338, 344, 401",
                    highYieldPoints = listOf(
                        "Safety Muscle of Larynx: Posterior Cricoarytenoid (PCA) is the only abductor of the vocal cords; bilateral paralysis leads to life-threatening glottic closure and stridor requiring emergency tracheostomy.",
                        "Laryngomalacia: Most common congenital laryngeal anomaly causing inspiratory stridor in neonates/infants; flaccid omega-shaped (epiglottis) collapses on inspiration; self-limiting by 18-24 months.",
                        "Waldeyer's Ring: Subepithelial lymphoid ring guarding entry to digestive and respiratory tracts (nasopharyngeal tonsil/adenoids, tubal tonsils, palatine tonsils, lingual tonsils).",
                        "Plummer-Vinson (Patterson-Kelly) Syndrome: Triad of post-cricoid dysphagia, iron deficiency anaemia, and upper oesophageal web; premalignant for post-cricoid carcinoma in middle-aged females."
                    ),
                    referenceLinks = listOf(ReferenceLink("Pediatric Airway Manual", "https://aoiindia.org/", "Textbook"))
                ),
                Question(
                    id = "ent_ear_otosclerosis",
                    subjectId = "ent",
                    topicId = "ent_throat_larynx",
                    topicName = "Otology: Otosclerosis",
                    text = "A 28-year-old female presents with bilateral progressive conductive hearing loss which worsens during pregnancy. She reports hearing better in noisy environments (Paracusis Willisii). i) Provisional diagnosis and etiopathology; ii) Otoscopic and pure-tone audiometric findings (Schwartze sign, Carhart notch); iii) Medical vs surgical management (Small-fenestra Stapedotomy).",
                    years = listOf("2025", "2023", "2021", "2018", "2016", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 5 + 7 = 15 Marks",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "88-95",
                    highYieldPoints = listOf(
                        "Diagnosis: Otosclerosis (Otospongiosis) - primary localized hereditary disease of the otic capsule characterized by alternating resorption of normal enchondral bone and replacement by vascular spongy immature bone, subsequently undergoing remineralization and sclerosis.",
                        "Predilection Site: Fissula ante fenestram (anterior to the oval window), leading to ankylosis and fixation of the stapes footplate.",
                        "Clinical Features: Young adult female (female:male = 2:1), bilateral progressive conductive deafness, tinnitus, accelerated by pregnancy and lactation, Paracusis Willisii (ability to hear better in a noisy surrounding like a train or market due to background low-frequency noise causing speakers to raise their voices).",
                        "Otoscopic Examination: Normal tympanic membrane in most cases; in active/early vascular phase: Schwartze's sign (Flamingo-pink blush over the promontory visible through an intact translucent tympanic membrane).",
                        "Audiological Tests:",
                        "- Tuning Fork Tests: Rinne test negative (BC > AC), Weber test lateralizes to the more affected ear, Absolute Bone Conduction (ABC) normal.",
                        "- Pure-Tone Audiometry (PTA): Conductive hearing loss with an air-bone gap; Carhart's Notch: A characteristic dip in bone conduction thresholds centered at 2,000 Hz (2 kHz) due to mechanical artifact of stapes fixation (disappears after successful stapes surgery).",
                        "- Tympanometry: As-type tympanogram (normal peak pressure with decreased compliance due to ossicular chain stiffness); Absent acoustic stapedial reflexes.",
                        "Management:",
                        "- Medical: Sodium Fluoride (20-40 mg daily) accelerates maturation of active otospongiotic focus into sclerotic bone; Hearing aids for patients unfit for or declining surgery.",
                        "- Surgical (TREATMENT OF CHOICE): Small-fenestra Stapedotomy: Under local anesthesia, elevation of tympanomeatal flap -> separate incudostapedial joint -> divide stapedius tendon -> fracture and remove stapes suprastructure -> micro-drill or CO2 laser 0.6 mm fenestra in the center of stapes footplate -> insert Teflon-piston or titanium prosthesis crimped securely over the long process of incus. Excellent hearing improvement in >95% of cases."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("AOI India Consensus Guidelines on Stapedotomy", "https://aoiindia.org/", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "ent_ear_meniere_vertigo",
                    subjectId = "ent",
                    topicId = "ent_throat_larynx",
                    topicName = "Otology & Neuro-Otology",
                    text = "A 42-year-old male presents with recurrent episodes of severe rotatory vertigo lasting 2-4 hours, associated with fluctuating low-frequency hearing loss, roaring tinnitus, and a sense of fullness in the right ear. i) Diagnosis and underlying pathophysiology; ii) Diagnostic audiometry and electrocochleography; iii) Acute attack management and long-term prophylactic lifestyle/medical therapy.",
                    years = listOf("2024", "2022", "2020", "2017", "2014", "2010"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 4 + 8 = 15 Marks",
                    textbookRef = "PL Dhingra (8th Ed)",
                    pageNumbers = "105-114",
                    highYieldPoints = listOf(
                        "Diagnosis: Meniere's Disease (Endolymphatic Hydrops).",
                        "Pathophysiology: Distension of the endolymphatic system (scala media and saccule) due to either overproduction of endolymph or impaired resorption by the endolymphatic sac -> episodic micro-ruptures of Reissner's membrane allow mixing of potassium-rich endolymph with sodium-rich perilymph, depolarizing and intoxicating vestibular and cochlear nerve fibers -> acute vertigo and hearing loss.",
                        "Classic Symptom Tetrad: 1. Episodic spontaneous spinning vertigo (lasting 20 minutes to several hours); 2. Fluctuating sensorineural hearing loss; 3. Tinnitus (low-pitched roaring / ocean wave character); 4. Aural fullness / pressure in the affected ear.",
                        "Diagnostic Investigations:",
                        "- Pure-Tone Audiometry: Low-frequency sensorineural hearing loss in early stages; becomes flat across all frequencies in late stages.",
                        "- Electrocochleography (ECochG): Elevated Summating Potential to Action Potential ratio (SP/AP ratio > 0.45 indicates endolymphatic hydrops).",
                        "- Caloric Testing: Canal paresis / reduced vestibular response on the affected side.",
                        "- Glycerol Dehydration Test: Ingestion of glycerol (1.2 mL/kg) leads to temporary osmotic reduction of endolymph and temporary improvement in hearing threshold (>10 dB in two frequencies).",
                        "Management Protocol:",
                        "1. Acute Attack: Vestibular sedatives (IV/oral Diazepam 5-10 mg or Promethazine); Antiemetics (Ondansetron 4 mg IV); Bed rest in quiet darkened room.",
                        "2. Chronic Prophylaxis & Maintenance:",
                        "- Lifestyle: Low-salt diet (<1.5-2 g sodium/day), restrict caffeine, alcohol, and nicotine, avoid stress.",
                        "- Pharmacotherapy: Betahistine (16-24 mg TDS - increases microvascular blood flow in stria vascularis); Diuretics (Hydrochlorothiazide 25 mg daily or Acetazolamide) to reduce endolymphatic volume.",
                        "3. Chemical Labyrinthectomy: Intratympanic Gentamicin injections for medically intractable unremitting vertigo (ablates vestibular neuroepithelium with low risk of hearing loss).",
                        "4. Surgical: Endolymphatic sac decompression/shunt surgery, vestibular nerve section, or surgical labyrinthectomy."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("AAO-HNS Clinical Practice Guideline: Meniere's Disease", "https://www.entnet.org/", "Guideline")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                )
            )
        )
    )
}
