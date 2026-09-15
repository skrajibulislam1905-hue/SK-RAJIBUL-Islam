package com.example.data.repository

import com.example.data.model.*

object EntOphthalDataProvider {
    val textbookEnt = TextbookInfo(
        title = "Diseases of Ear, Nose and Throat & Head and Neck Surgery",
        authors = "P. L. Dhingra, Shruti Dhingra",
        edition = "8th Edition",
        publisher = "Elsevier India",
        primarySubject = "Otorhinolaryngology (ENT)",
        description = "The standard national textbook for undergraduate otorhinolaryngology, renowned for its color operative photographs, anatomical schematics, and clinical algorithms.",
        referenceUrl = "https://www.elsevier.com/",
        officialGuidelinesUrl = "https://aoiindia.org/",
        keyChapters = listOf(
            "Anatomy & Physiology of Ear (pp. 1-20)",
            "Hearing Loss & Otosclerosis (pp. 95-107)",
            "Middle Ear & Cholesteatoma (pp. 70-94)",
            "Facial Nerve Disorders (pp. 108-118)",
            "Anatomy of Nose & Little's Area (pp. 155-175)",
            "Nasal Polyps & FESS (pp. 195-204, 494-498)",
            "Epistaxis & JNA (pp. 205-212, 290-296)",
            "Pharynx, Tonsils & Quinsy (pp. 280-315)",
            "Larynx, Stridor & Vocal Cord (pp. 330-365)",
            "Tracheostomy & Airway (pp. 367-375)"
        )
    )

    val textbookOphthal = TextbookInfo(
        title = "Comprehensive Ophthalmology",
        authors = "A. K. Khurana",
        edition = "9th Edition",
        publisher = "Jaypee Brothers Medical Publishers",
        primarySubject = "Ophthalmology",
        description = "The quintessential undergraduate text on ocular diseases, surgical procedures, refraction optics, community eye health, and practical clinical examination.",
        referenceUrl = "https://www.jaypeebrothers.com/",
        officialGuidelinesUrl = "https://aios.org/",
        keyChapters = listOf(
            "Anatomy and Physiology of Eye (pp. 1-25)",
            "Optics and Refraction (pp. 30-55)",
            "Diseases of Conjunctiva (pp. 65-90)",
            "Diseases of Cornea & Keratoplasty (pp. 91-135)",
            "Diseases of Uvea & Red Eye (pp. 140-168)",
            "Diseases of Lens & Cataract (pp. 175-210)",
            "Glaucoma (pp. 215-245)",
            "Diseases of Retina & Vitreous (pp. 250-295)",
            "Ocular Injuries (pp. 405-420)",
            "Community Ophthalmology (pp. 445-470)"
        )
    )

    fun getEntTopics(): List<Topic> = EntQuestionsDataProvider.getTopics()

    fun getOphthalTopics(): List<Topic> = OphthalQuestionsDataProvider.getTopics()
}
