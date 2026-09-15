package com.example.data.repository

import com.example.data.model.*

object OrthopaedicsDataProvider {
    val textbook = TextbookInfo(
        title = "Essential Orthopaedics",
        authors = "J. Maheswari, Vikram A. Mhaskar",
        edition = "7th Edition",
        publisher = "Jaypee Brothers Medical Publishers",
        primarySubject = "Orthopaedics",
        description = "The definitive benchmark undergraduate orthopaedic textbook in India, celebrated for its clear anatomical illustrations, fracture management classifications, and clinical exam steps.",
        referenceUrl = "https://www.jaypeebrothers.com/",
        officialGuidelinesUrl = "https://ioaindia.org/",
        keyChapters = listOf(
            "Fractures & Dislocations (pp. 1-150)",
            "Bone Infections - Osteomyelitis & TB (pp. 165-200)",
            "Congenital Deformities & Paediatric Ortho (pp. 205-230)",
            "Bone Tumours (pp. 232-255)",
            "Spine & Spinal Cord Injuries (pp. 265-290)",
            "Soft Tissue & Peripheral Nerve Injuries (pp. 292-320)",
            "Joint Diseases & Arthroplasty (pp. 322-370)"
        )
    )

    fun getTopics(): List<Topic> = listOf(
        Topic(
            id = "ortho_fractures",
            subjectId = "orthopaedics",
            name = "Fractures & Dislocations",
            description = "Fracture neck of femur, supracondylar fracture humerus, Colles' fracture, and shoulder dislocation.",
            textbookChapter = "Chapters 3-12: Traumatology & Fractures",
            standardPages = "pp. 15-140",
            questions = listOf(
                Question(
                    id = "ortho_frac_1",
                    subjectId = "orthopaedics",
                    topicId = "ortho_fractures",
                    topicName = "Fractures & Dislocations",
                    text = "A 70-year-old female presents with inability to bear weight on the right lower limb after a trivial fall at home. On examination, the right lower limb is externally rotated and shortened. i) What is your provisional diagnosis? ii) Classify this fracture based on Garden's classification. iii) Explain the blood supply of the femoral head and why avascular necrosis occurs. iv) Outline the management for this patient.",
                    years = listOf("2024", "2022", "2019", "2016"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 3 + 3 + 2 = 10 Marks",
                    textbookRef = "Maheswari & Mhaskar (7th Ed)",
                    pageNumbers = "86-94",
                    highYieldPoints = listOf(
                        "Diagnosis: Intracapsular Fracture Neck of Right Femur.",
                        "Garden's Classification: Stage I: Incomplete/impacted fracture with valgus alignment; Stage II: Complete fracture without displacement; Stage III: Complete fracture with partial displacement; Stage IV: Complete fracture with total displacement (trabeculae parallel again).",
                        "Blood Supply: 1. Medial femoral circumflex artery (ascending cervical branches / retinacular vessels - primary supply), 2. Lateral femoral circumflex artery, 3. Ligamentum teres artery (insignificant in elderly). Intracapsular fracture tears retinacular vessels causing avascular necrosis (AVN) in up to 30% and non-union in 15%.",
                        "Management in Elderly (70 yrs): Arthroplasty is treatment of choice: Hemiarthroplasty (Austin Moore or Bipolar prosthesis) or Total Hip Arthroplasty (THA) for active elderly to allow immediate postoperative weight bearing and avoid prolonged recumbency."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("OrthoBullets: Femoral Neck Fractures", "https://www.orthobullets.com/trauma/1037/femoral-neck-fractures", "Review")
                    ),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "ortho_frac_2",
                    subjectId = "orthopaedics",
                    topicId = "ortho_fractures",
                    topicName = "Fractures & Dislocations",
                    text = "Describe the mechanism of injury, clinical features, Gartland classification, and management of Supracondylar Fracture of Humerus in children. Mention the clinical signs and prevention of Volkmann's Ischemic Contracture (VIC).",
                    years = listOf("2025", "2023", "2020", "2017"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 2 + 2 + 4 = 10 Marks",
                    textbookRef = "Maheswari & Mhaskar (7th Ed)",
                    pageNumbers = "68-76",
                    highYieldPoints = listOf(
                        "Mechanism: Fall on an outstretched hand with hyperextended elbow (Extension type - 95% of cases).",
                        "Gartland Classification: Type I: Undisplaced; Type II: Displaced with intact posterior cortex (hinge); Type III: Completely displaced with no cortical contact; Type IV: Multi-directionally unstable.",
                        "Three-point bony relationship: Medial epicondyle, lateral epicondyle, and olecranon tip form an isosceles triangle when flexed and straight line when extended (preserved in supracondylar fracture, disturbed in elbow dislocation).",
                        "Management: Type I: Above-elbow posterior slab at 90° flexion; Type II & III: Closed reduction and percutaneous K-wire fixation (C-arm guided lateral or crossed pins) within emergency window.",
                        "Volkmann's Ischemia: Pain disproportionate to injury on passive finger extension (earliest sign), Pallor, Paresthesia, Pulselessness, Paralysis. Prevention: Avoid tight circular casts and acute elbow flexion; perform immediate emergent fasciotomy if compartment pressure >30 mmHg."
                    ),
                    referenceLinks = emptyList(),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "ortho_frac_3",
                    subjectId = "orthopaedics",
                    topicId = "ortho_fractures",
                    topicName = "Fractures & Dislocations",
                    text = "A 60-year-old postmenopausal lady tripped and fell on her outstretched hand resulting in wrist deformity. i) Mention the characteristic deformity in Colles' fracture. ii) What are the 6 classical displacements? iii) Describe the reduction maneuver (Charnley's method) and immobilization.",
                    years = listOf("2024", "2021", "2018"),
                    type = QuestionType.SHORT_ESSAY,
                    marksBreakdown = "2 + 3 + 3 = 8 Marks",
                    textbookRef = "Maheswari & Mhaskar (7th Ed)",
                    pageNumbers = "78-83",
                    highYieldPoints = listOf(
                        "Deformity: 'Dinner-fork deformity' (dorsal prominence with volar fullness).",
                        "6 Displacements: 1. Dorsal displacement, 2. Dorsal tilt (loss of normal 11° volar tilt), 3. Radial displacement, 4. Radial tilt (loss of normal 23° radial inclination), 5. Supination, 6. Impaction / axial shortening.",
                        "Reduction Steps: Disimpaction by traction -> Volar translation -> Palmar flexion and ulnar deviation.",
                        "Immobilization: Below-elbow Colles' cast in slight palmar flexion and ulnar deviation ('cotton-loader position') for 4-6 weeks."
                    ),
                    referenceLinks = emptyList()
                )
            )
        ),
        Topic(
            id = "ortho_infections",
            subjectId = "orthopaedics",
            name = "Bone Infections & Tuberculosis",
            description = "Acute hematogenous osteomyelitis, chronic osteomyelitis, Brodie's abscess, and Pott's spine.",
            textbookChapter = "Chapters 16-18: Bone & Joint Infections",
            standardPages = "pp. 165-200",
            questions = listOf(
                Question(
                    id = "ortho_inf_1",
                    subjectId = "orthopaedics",
                    topicId = "ortho_infections",
                    topicName = "Bone Infections & Tuberculosis",
                    text = "Define Chronic Osteomyelitis. Explain the terms: Sequestrum, Involucrum, and Cloaca. Describe the surgical principles of Saucerization.",
                    years = listOf("2024", "2022", "2019", "2015"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 3 + 5 = 10 Marks",
                    textbookRef = "Maheswari & Mhaskar (7th Ed)",
                    pageNumbers = "172-178",
                    highYieldPoints = listOf(
                        "Chronic Osteomyelitis: Long-standing, deep bone infection with necrotic bone fragments, persistent discharging sinuses, and recurrent acute flare-ups, typically caused by Staphylococcus aureus.",
                        "Sequestrum: A piece of dead, devitalized bone separated from sound living bone due to thrombosis of haversian vessels; appears sclerotic, dense, and ivory-white on X-ray.",
                        "Involucrum: A sheath of new periosteal living bone formed around the sequestrum.",
                        "Cloaca: An opening in the involucrum through which pus and sequestra escape into soft tissues.",
                        "Saucerization: Surgical removal of the superficial wall of the bone cavity (unroofing the cavity) to convert a deep rigid cave into a shallow saucer-like crater, enabling soft tissues to collapse into and obliterate the dead space."
                    ),
                    referenceLinks = emptyList(),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "ortho_inf_2",
                    subjectId = "orthopaedics",
                    topicId = "ortho_infections",
                    topicName = "Bone Infections & Tuberculosis",
                    text = "Write short notes on: Tuberculosis of Spine (Pott's Disease) - Cold abscess and Pott's paraplegia.",
                    years = listOf("2025", "2023", "2020", "2017"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 Marks",
                    textbookRef = "Maheswari & Mhaskar (7th Ed)",
                    pageNumbers = "188-195",
                    highYieldPoints = listOf(
                        "Paradiscal type is most common: affects adjacent subchondral margins of two contiguous vertebrae and destroys the intervening intervertebral disc.",
                        "Cold Abscess: Chronic collection of liquefied caseous material without classical signs of acute inflammation (no warmth, redness, or severe throbbing pain). Retropharyngeal abscess in cervical, psoas abscess in lumbar.",
                        "Pott's Paraplegia: Paraplegia of early onset (due to mechanical compression by abscess, caseous debris, or inflammatory granulation) vs Late onset (due to sharp internal bony kyphotic ridge or pachymeningitis).",
                        "Treatment: Anti-tubercular therapy (ATT) for 9-12 months. Indications for surgery: Paraplegia failing medical therapy after 3-4 weeks, progressive neurological deficit, or severe spinal instability."
                    ),
                    referenceLinks = emptyList(),
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "ortho_pediatric",
            subjectId = "orthopaedics",
            name = "Congenital Deformities",
            description = "Congenital Talipes Equinovarus (CTEV / Clubfoot) and Developmental Dysplasia of the Hip (DDH).",
            textbookChapter = "Chapter 20: Congenital Anomalies",
            standardPages = "pp. 205-230",
            questions = listOf(
                Question(
                    id = "ortho_ped_1",
                    subjectId = "orthopaedics",
                    topicId = "ortho_pediatric",
                    topicName = "Congenital Deformities",
                    text = "A newborn is brought with bilateral inward and downward turning of feet. i) What are the 4 classical deformities of CTEV (Clubfoot)? ii) Describe the Pirani scoring system. iii) Explain the Ponseti method of serial casting and the role of percutaneous Achilles tenotomy.",
                    years = listOf("2024", "2021", "2018", "2016"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 3 + 5 = 10 Marks",
                    textbookRef = "Maheswari & Mhaskar (7th Ed)",
                    pageNumbers = "206-214",
                    highYieldPoints = listOf(
                        "4 Components (CAVE mnemonic in sequence of correction): 1. Cavus (exaggerated longitudinal medial arch), 2. Adductus (forefoot adduction at midtarsal joints), 3. Varus (hindfoot inversion at subtalar joint), 4. Equinus (ankle plantarflexion at tibiotalar joint).",
                        "Pirani Score: Midfoot score (0-3: Curvature of lateral border, Medial crease, Talar head coverage) + Hindfoot score (0-3: Posterior crease, Empty heel, Rigid equinus); maximum total score = 6.",
                        "Ponseti Method: Weekly gentle manipulation and above-knee plaster casting: Step 1: Correct Cavus by supinating forefoot; Step 2: Correct Adductus and Varus simultaneously by abducting foot using lateral head of talus as fulcrum (NEVER pronate foot); Step 3: Correct Equinus (only after hindfoot varus is fully corrected).",
                        "Percutaneous Tenotomy: Required in >85% of cases for residual equinus; performed under local anesthesia, followed by final cast for 3 weeks.",
                        "Maintenance: Steenbeek / Dennis Brown splint in 70° external rotation for 23 hours/day for 3 months, then during night/naps until 4 years."
                    ),
                    referenceLinks = emptyList(),
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "ortho_tumours",
            subjectId = "orthopaedics",
            name = "Bone Tumours",
            description = "Giant Cell Tumour (GCT), Osteosarcoma, Ewing's sarcoma, and classification of bone neoplasms.",
            textbookChapter = "Chapter 28: Bone Tumours",
            standardPages = "pp. 232-255",
            questions = listOf(
                Question(
                    id = "ortho_tum_1",
                    subjectId = "orthopaedics",
                    topicId = "ortho_tumours",
                    topicName = "Bone Tumours",
                    text = "Classify bone tumours. Write in brief the clinical features, investigations and treatment of giant cell tumour of lower end of radius.",
                    years = listOf("2025 P2", "2024", "2023", "2018", "2016 P1"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "4 + 3 + 3 = 10 Marks",
                    textbookRef = "Maheswari & Mhaskar (7th Ed)",
                    pageNumbers = "232, 234",
                    highYieldPoints = listOf(
                        "Classification (WHO): 1. Bone-forming: Benign (Osteoid osteoma, Osteoblastoma), Malignant (Osteosarcoma); 2. Cartilage-forming: Benign (Enchondroma, Osteochondroma), Malignant (Chondrosarcoma); 3. Giant cell lesions: Giant Cell Tumour (Osteoclastoma); 4. Round cell tumours: Ewing's sarcoma, Multiple Myeloma, Lymphoma.",
                        "GCT Characteristics: Age 20-40 years (after epiphyseal fusion), female predominance. Typical site: Epiphysis extending into metaphysis of long bones (lower end of radius is 3rd most common site after lower femur and upper tibia).",
                        "X-ray Findings: Eccentric, expansile, lytic lesion in the epiphysis reaching the subchondral articular plate with 'Soap-bubble appearance' and cortical thinning. No periosteal reaction.",
                        "Treatment of GCT Lower End of Radius: Extended intralesional curettage with chemical burring (phenol / liquid nitrogen) and bone grafting or bone cement (PMMA) for Campanacci Grade I/II. For Grade III (extensive cortical breakthrough): Wide en-bloc resection with wrist arthrodesis or reconstruction using vascularized fibular graft."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("OrthoBullets: Giant Cell Tumor", "https://www.orthobullets.com/pathology/8024/giant-cell-tumor", "Review")
                    ),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "ortho_tum_2",
                    subjectId = "orthopaedics",
                    topicId = "ortho_tumours",
                    topicName = "Bone Tumours",
                    text = "Giant cell tumour of bone has the highest chance of recurrence.",
                    years = listOf("2024"),
                    type = QuestionType.SHORT_NOTE,
                    marksBreakdown = "5 Marks",
                    textbookRef = "Maheswari & Mhaskar (7th Ed)",
                    pageNumbers = "234",
                    highYieldPoints = listOf(
                        "Local Recurrence Rate: Up to 15-30% after simple curettage due to microscopic tumor fingers in surrounding trabecular bone crevices.",
                        "High recurrence factors: Location in distal radius or proximal femur, Campanacci Grade III lesions with cortical disruption, and inadequate mechanical/chemical adjuvant clearance."
                    ),
                    referenceLinks = emptyList()
                ),
                Question(
                    id = "ortho_tum_3",
                    subjectId = "orthopaedics",
                    topicId = "ortho_tumours",
                    topicName = "Bone Tumours",
                    text = "Describe the clinical presentation, characteristic radiological signs, and multi-modality management of Osteosarcoma in a 16-year-old boy.",
                    years = listOf("2024", "2021", "2017"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 3 + 5 = 10 Marks",
                    textbookRef = "Maheswari & Mhaskar (7th Ed)",
                    pageNumbers = "236-242",
                    highYieldPoints = listOf(
                        "Clinical: Second decade (10-20 years), bimodal peak in elderly (secondary to Paget's); most common site is metaphysis around knee (distal femur > proximal tibia); dull aching pain at rest and night, warm firm swelling with dilated veins.",
                        "Radiology: Metaphyseal mixed lytic and blastic lesion with cortical destruction; Classical periosteal reactions: 1. 'Codman's triangle' (subperiosteal reactive bone at the elevated periosteal margin), 2. 'Sunburst / Sunray spiculation' (calcified osteoid along perpendicular periosteal vessels).",
                        "Multi-modality Management: 1. Neoadjuvant (preoperative) chemotherapy (MAP regimen: High-dose Methotrexate, Adriamycin/Doxorubicin, Cisplatin) for 3 cycles to shrink tumor and eliminate micrometastases; 2. Limb-salvage surgery (wide local excision with modular endoprosthetic mega-prosthesis reconstruction) in >90% of cases; 3. Adjuvant postoperative chemotherapy."
                    ),
                    referenceLinks = emptyList(),
                    isRepeatQuestion = true
                ),
                Question(
                    id = "ortho_tum_4",
                    subjectId = "orthopaedics",
                    topicId = "ortho_tumours",
                    topicName = "Bone Tumours",
                    text = "A 12-year-old boy presents with pain, swelling, and intermittent fever over the mid-shaft of the right femur. X-ray shows an 'onion-peel' periosteal reaction. i) Provisional diagnosis; ii) Characteristic histological and cytogenetic findings; iii) Management protocol.",
                    years = listOf("2025", "2023", "2019", "2015"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "2 + 4 + 4 = 10 Marks",
                    textbookRef = "Maheswari & Mhaskar (7th Ed)",
                    pageNumbers = "243-247",
                    highYieldPoints = listOf(
                        "Diagnosis: Ewing's Sarcoma of right femur diaphysis.",
                        "Etiopathogenesis & Cytogenetics: Highly malignant neuroectodermal round cell tumour; characteristic balanced reciprocal chromosomal translocation t(11;22)(q24;q12) creating the EWS-FLI1 fusion transcript in >90% of cases.",
                        "Radiological Signs: Permeative, 'moth-eaten' osteolytic destruction in the diaphysis or metadiaphysis of a long tubular bone with concentric, multi-layered, laminated subperiosteal bone formation producing the classical 'onion-peel' appearance; may show Codman's triangle or hair-on-end sunburst spicules.",
                        "Histology: Sheets of uniform, small, round blue cells with round nuclei, finely dispersed chromatin, scanty clear cytoplasm containing abundant glycogen (Periodic acid-Schiff / PAS positive), with Homer-Wright pseudorosettes; Strong positivity for CD99 (MIC2).",
                        "Multimodal Treatment: 1. Neoadjuvant (induction) multi-agent chemotherapy: VDC-IE regimen (Vincristine, Doxorubicin, Cyclophosphamide alternating with Ifosfamide, Etoposide); 2. Local control: Wide surgical resection (limb-sparing en-bloc resection with reconstruction) preferred over radiotherapy; 3. Radiosensitivity: Ewing's is exceptionally radiosensitive (unlike osteosarcoma) and radiotherapy is used if tumour is in an inoperable location (spine/pelvis) or margins are positive; 4. Adjuvant consolidation chemotherapy."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("OrthoBullets: Ewing Sarcoma", "https://www.orthobullets.com/pathology/8026/ewing-sarcoma", "Review")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "ortho_dislocations_emergencies",
            subjectId = "orthopaedics",
            name = "Dislocations & Orthopaedic Emergencies",
            description = "Anterior shoulder dislocation, posterior hip dislocation, acute compartment syndrome, and fat embolism syndrome.",
            textbookChapter = "Chapters 5, 8 & 14: Maheswari & Mhaskar (7th Ed)",
            standardPages = "pp. 52-64, 98-112, 142-155",
            questions = listOf(
                Question(
                    id = "ortho_disloc_shoulder_1",
                    subjectId = "orthopaedics",
                    topicId = "ortho_dislocations_emergencies",
                    topicName = "Joint Dislocations",
                    text = "A 25-year-old rugby player fell with arm in abduction and external rotation. He presents with severe shoulder pain and holds the injured arm with the opposite hand. i) Diagnosis and clinical tests; ii) Associated anatomical lesions (Bankart and Hill-Sachs); iii) Closed reduction methods (Kocher's and Hippocratic); iv) Management of recurrent anterior dislocation.",
                    years = listOf("2025", "2023", "2021", "2018", "2015", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 3 + 4 + 5 = 15 Marks",
                    textbookRef = "Maheswari & Mhaskar (7th Ed)",
                    pageNumbers = "52-62",
                    highYieldPoints = listOf(
                        "Diagnosis: Acute Anterior (Subcoracoid) Dislocation of Right Shoulder (most common joint dislocation, accounting for >95% of shoulder dislocations).",
                        "Clinical Examination Signs:",
                        "1. Loss of normal round shoulder contour -> 'Flat shoulder' / 'Epaulette deformity' with prominent acromion.",
                        "2. Hamilton's Ruler Test: A straight ruler placed on the lateral aspect of the arm touches both the lateral epicondyle and the acromion tip simultaneously (impossible in normal shoulder due to deltoid fullness).",
                        "3. Dugas' Test: Inability to touch the opposite shoulder with the hand of the injured arm while keeping the elbow against the chest.",
                        "4. Callaway's Test: Increased vertical circumference of the axillary fold on the dislocated side.",
                        "5. Must test Axillary Nerve sensation over the regimental badge area (lateral shoulder).",
                        "Pathological Lesions:",
                        "- Bankart Lesion: Avulsion / detachment of the anterior-inferior glenoid labrum with the inferior glenohumeral ligament (IGHL) from the glenoid rim.",
                        "- Hill-Sachs Lesion: Compression fracture / impaction cortical depression on the posterolateral aspect of the humeral head caused by impaction against the hard anterior glenoid rim during dislocation.",
                        "Closed Reduction Techniques:",
                        "1. Kocher's Method (Mnemonic: TEAM): Traction in line of humerus -> External rotation (until forearm points laterally) -> Adduction (elbow brought across chest) -> Medial / Internal rotation (hand placed on opposite shoulder).",
                        "2. Hippocratic Method: Foot in axilla acting as a counter-traction fulcrum while gentle continuous longitudinal arm traction is applied.",
                        "3. Milch Technique / Stimson's hanging arm gravity method.",
                        "Recurrent Dislocation Management: Bankart repair (arthroscopic labral re-attachment with suture anchors) or Latarjet procedure (coracoid process osteotomy and transfer to anterior glenoid rim creating a bone block and conjoint tendon sling) for significant glenoid bone loss (>20-25%)."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("OrthoBullets: Shoulder Dislocation", "https://www.orthobullets.com/shoulder-and-elbow/3048/anterior-shoulder-instability", "Review")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "ortho_compartment_fes",
                    subjectId = "orthopaedics",
                    topicId = "ortho_dislocations_emergencies",
                    topicName = "Orthopaedic Emergencies",
                    text = "Describe the pathophysiology, clinical diagnosis, and emergency surgical decompression of Acute Compartment Syndrome of the leg. Outline Gurd's criteria and management of Fat Embolism Syndrome (FES).",
                    years = listOf("2024", "2022", "2020", "2017", "2014"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 4 + 4 + 4 = 15 Marks",
                    textbookRef = "Maheswari & Mhaskar (7th Ed)",
                    pageNumbers = "142-152",
                    highYieldPoints = listOf(
                        "Pathophysiology of Compartment Syndrome: Elevated intracompartmental tissue pressure within an inelastic osteofascial envelope exceeds capillary perfusion pressure, leading to microvascular compromise, muscle and nerve ischemia, and irreversible necrosis within 6-8 hours.",
                        "Clinical Diagnosis (The 6 Ps):",
                        "1. Pain out of proportion to injury (earliest and most reliable clinical indicator).",
                        "2. Pain on passive stretch of muscles in that compartment (cardinal diagnostic sign).",
                        "3. Paresthesia along cutaneous nerve distribution.",
                        "4. Pallor and coldness.",
                        "5. Poikilothermia.",
                        "6. Pulselessness and Paralysis (ominous late signs indicating established muscle necrosis).",
                        "Delta Pressure: Diastolic BP - Intracompartmental Pressure. If Delta P <= 30 mmHg (or absolute compartment pressure >30 mmHg), emergency fasciotomy is mandatory.",
                        "Emergency Surgical Decompression: Dual-incision four-compartment fasciotomy of the leg (anterolateral incision for anterior and lateral compartments; posteromedial incision for superficial and deep posterior compartments). Complete release of skin and deep investing fascia. Leave wound open, cover with sterile dressings, and perform delayed secondary closure or split-thickness skin graft after 5-7 days.",
                        "Fat Embolism Syndrome (FES): Release of marrow fat globules into venous circulation following long bone fractures (femur/tibia) or pelvic fractures, typically presenting 24-72 hours post-injury with triad of: Hypoxemia (respiratory failure/ARDS), Neurological abnormalities (confusion, drowsiness, coma), and Petechial rash (conjunctiva, axilla, chest, and neck).",
                        "Gurd's Diagnostic Criteria: Diagnosis requires 1 Major + 4 Minor criteria, OR 2 Major criteria:",
                        "- Major: 1. Respiratory distress / PaO2 <60 mmHg; 2. Cerebral signs unrelated to head injury; 3. Petechial rash.",
                        "- Minor: Tachycardia (>110 bpm), Pyrexia (>38.5 C), Retinal fat droplets/petechiae, Fat in urine, Sudden unexplained fall in Hb/platelets, Elevated ESR.",
                        "Management of FES: Early rigid surgical fixation of long bone fractures (prevents further embolization); Supportive intensive care: High-flow oxygen and mechanical ventilation with PEEP for ARDS; Hemodynamic monitoring; Systemic corticosteroids (IV methylprednisolone) may reduce pulmonary inflammation."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("OrthoBullets: Compartment Syndrome", "https://www.orthobullets.com/trauma/1004/compartment-syndrome", "Review")
                    ),
                    isRepeatQuestion = true
                )
            )
        ),
        Topic(
            id = "ortho_nerves_pediatric_hip",
            subjectId = "orthopaedics",
            name = "Peripheral Nerve Injuries & Paediatric Hip",
            description = "Radial nerve palsy, ulnar nerve injury, carpal tunnel syndrome, Developmental Dysplasia of Hip (DDH), and Perthes disease.",
            textbookChapter = "Chapters 19, 21 & 24: Maheswari & Mhaskar (7th Ed)",
            standardPages = "pp. 215-228, 292-315",
            questions = listOf(
                Question(
                    id = "ortho_radial_nerve_palsy",
                    subjectId = "orthopaedics",
                    topicId = "ortho_nerves_pediatric_hip",
                    topicName = "Peripheral Nerve Injuries",
                    text = "A 30-year-old male sustains a closed mid-shaft fracture of the right humerus and cannot dorsiflex his wrist and fingers. i) Which nerve is injured and what is Holstein-Lewis fracture? ii) Clinical signs and deformities; iii) Conservative vs surgical exploration indications; iv) Tendon transfer protocol for permanent irreversible palsy.",
                    years = listOf("2025", "2022", "2019", "2016", "2013"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "3 + 3 + 4 + 5 = 15 Marks",
                    textbookRef = "Maheswari & Mhaskar (7th Ed)",
                    pageNumbers = "294-302",
                    highYieldPoints = listOf(
                        "Nerve Injured: Radial Nerve (courses along spiral / radial groove on the posterior surface of humerus, piercing the lateral intermuscular septum).",
                        "Holstein-Lewis Fracture: Spiral fracture of the distal third of the humeral shaft where the radial nerve is particularly vulnerable to entrapment or laceration as it passes from the posterior to the anterior compartment.",
                        "Clinical Features of Radial Nerve Palsy:",
                        "1. Motor: Complete Wrist Drop, Finger Drop (inability to extend metacarpophalangeal joints), and Thumb Drop (inability to abduct and extend thumb). Note: Interphalangeal extension of fingers is preserved due to intrinsic lumbricals and interossei innervated by ulnar and median nerves.",
                        "2. Sensory: Sensory loss over the first dorsal web space (anatomical snuffbox).",
                        "Management in Closed Fracture: Most (>90%) are neuropraxia or axonotmesis. Conservative observation for 12-16 weeks with dynamic cock-up splint, passive physiotherapy, and serial electromyography (EMG/NCV) at 6 weeks.",
                        "Indications for Early Surgical Exploration: Open fracture with nerve deficit, secondary nerve palsy developing after closed manipulation (nerve entrapment in fracture gap), Holstein-Lewis fracture, penetrating trauma, or failure of recovery after 12-16 weeks.",
                        "Tendon Transfers for Irreversible Palsy (Triple Transfer):",
                        "- Pronator Teres (PT) transferred to Extensor Carpi Radialis Brevis (ECRB) -> Restores Wrist Extension.",
                        "- Flexor Carpi Radialis (FCR) or Flexor Carpi Ulnaris (FCU) transferred to Extensor Digitorum Communis (EDC) -> Restores Finger Extension.",
                        "- Palmaris Longus (PL) transferred to Extensor Pollicis Longus (EPL) -> Restores Thumb Extension / Abduction."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("OrthoBullets: Radial Nerve Palsy", "https://www.orthobullets.com/trauma/1012/humeral-shaft-fractures", "Review")
                    ),
                    isClinicalCase = true,
                    isRepeatQuestion = true
                ),
                Question(
                    id = "ortho_ddh_perthes",
                    subjectId = "orthopaedics",
                    topicId = "ortho_nerves_pediatric_hip",
                    topicName = "Paediatric Hip Disorders",
                    text = "Differentiate Developmental Dysplasia of the Hip (DDH) and Perthes' Disease. Describe clinical tests in a newborn with DDH (Barlow, Ortolani, Galeazzi). Outline the age-dependent treatment of DDH.",
                    years = listOf("2024", "2021", "2018", "2015", "2012"),
                    type = QuestionType.LONG_ESSAY,
                    marksBreakdown = "4 + 5 + 6 = 15 Marks",
                    textbookRef = "Maheswari & Mhaskar (7th Ed)",
                    pageNumbers = "215-226",
                    highYieldPoints = listOf(
                        "Clinical Screening Tests for DDH in Newborns:",
                        "1. Ortolani Test (Test of Reduction): Hips flexed at 90 degrees and gently abducted while applying gentle forward pressure on the greater trochanter with fingers. A palpable 'clunk' of reduction indicates the dislocated femoral head has entered the acetabulum.",
                        "2. Barlow Test (Test of Dislocatability): Hips flexed at 90 degrees and adducted while applying gentle backward pressure on the knee. A palpable clunk indicates the femoral head is being pushed out of the acetabulum.",
                        "3. Galeazzi (Allis) Sign: With child supine, hips and knees flexed and feet flat on bed, one knee appears lower than the other due to posterior/superior displacement of the dislocated hip.",
                        "4. Telescoping / Piston Sign: Up-and-down mobility of the femur when traction and push are applied along the long axis.",
                        "5. Asymmetric thigh and gluteal skin folds; limited hip abduction (<60 degrees).",
                        "Ultrasound (Graf Method): Imaging of choice in infants <6 months before ossification of femoral head.",
                        "Age-Dependent Management Protocol:",
                        "- 0 to 6 Months: Pavlik Harness (dynamic abduction-flexion splint maintaining hips in 90-100 degrees flexion and 45-60 degrees abduction). Success rate >90%.",
                        "- 6 to 18 Months: Closed reduction under general anesthesia + Hip Spica cast for 3-4 months. If closed reduction fails -> Open reduction.",
                        "- 18 Months to 4 Years: Open reduction + Femoral shortening/derotation osteotomy + Acetabuloplasty (Salter or Pemberton pelvic osteotomy).",
                        "- Perthes' Disease (Legg-Calve-Perthes): Idiopathic avascular necrosis of the femoral head in boys aged 4-8 years; Waldenström radiographic stages: 1. Initial / Sclerotic stage, 2. Fragmentation stage, 3. Re-ossification stage, 4. Healed stage. Catterall and Herring lateral pillar classifications determine prognosis."
                    ),
                    referenceLinks = listOf(
                        ReferenceLink("AAOS Clinical Practice Guideline on Detection and Management of DDH", "https://www.aaos.org/", "Guideline")
                    ),
                    isRepeatQuestion = true
                )
            )
        )
    )
}
