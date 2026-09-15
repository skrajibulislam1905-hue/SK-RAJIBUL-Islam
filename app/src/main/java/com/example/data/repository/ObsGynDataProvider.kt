package com.example.data.repository

import com.example.data.model.*

object ObsGynDataProvider {
    val textbookObs = TextbookInfo(
        title = "DC Dutta's Textbook of Obstetrics",
        authors = "Hiralal Konar",
        edition = "10th Edition",
        publisher = "Jaypee Brothers Medical Publishers",
        primarySubject = "Obstetrics",
        description = "The gold standard obstetrics textbook across medical colleges in India, covering antenatal care, normal & abnormal labour, obstetric emergencies, maternal mortality, and newborn resuscitation.",
        referenceUrl = "https://www.jaypeebrothers.com/",
        officialGuidelinesUrl = "https://www.fogsi.org/",
        keyChapters = listOf(
            "Physiological Changes in Pregnancy (pp. 45-60)",
            "Antenatal Care & Fetal Wellbeing (pp. 85-105)",
            "Normal Labour & Partograph / ALSG (pp. 107-140)",
            "Hypertensive Disorders of Pregnancy (pp. 209-228)",
            "Antepartum Haemorrhage (pp. 230-245)",
            "Medical Disorders in Pregnancy (pp. 246-275)",
            "Complications of Third Stage & PPH (pp. 386-402)",
            "Operative Obstetrics & Caesarean (pp. 540-565)"
        )
    )

    val textbookGyn = TextbookInfo(
        title = "DC Dutta's Textbook of Gynaecology",
        authors = "Hiralal Konar",
        edition = "9th Edition",
        publisher = "Jaypee Brothers Medical Publishers",
        primarySubject = "Gynaecology",
        description = "The essential undergraduate gynaecology authority, providing clinical algorithms for abnormal uterine bleeding, pelvic masses, gynaecological oncology, pelvic organ prolapse, and infertility.",
        referenceUrl = "https://www.jaypeebrothers.com/",
        officialGuidelinesUrl = "https://www.fogsi.org/",
        keyChapters = listOf(
            "Anatomy & Mullerian Anomalies (pp. 1-45)",
            "Menstrual Disorders & AUB (pp. 50-80)",
            "Infertility & Ovulation Induction (pp. 212-235)",
            "Pelvic Organ Prolapse & Urogynaecology (pp. 185-205)",
            "Benign Lesions - Fibroids & Endometriosis (pp. 250-295)",
            "Gynaecological Cancers - Cervix, Ovary, Endometrium (pp. 305-365)",
            "Contraception & MTP (pp. 445-475)"
        )
    )

    fun getTopics(): List<Topic> =
        ObsQuestionsDataProvider.getTopics() + GynQuestionsDataProvider.getTopics()
}

