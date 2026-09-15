package com.example.data.repository

import com.example.data.model.*

object SurgeryDataProvider {
    val textbook = TextbookInfo(
        title = "SRB's Manual of Surgery",
        authors = "Sriram Bhat M",
        edition = "7th Edition",
        publisher = "Jaypee Brothers Medical Publishers",
        primarySubject = "Surgery",
        description = "The premier comprehensive undergraduate surgical text for Indian universities, featuring clinical examination methods, surgical pathology, operative steps, and management algorithms.",
        referenceUrl = "https://www.jaypeebrothers.com/",
        officialGuidelinesUrl = "https://asiindia.org/",
        keyChapters = listOf(
            "General Surgery & Wounds (pp. 1-150)",
            "Arterial & Venous Disorders (pp. 190-270)",
            "Oral Cavity & Salivary Glands (pp. 380-485)",
            "Thyroid, Parathyroid & Adrenals (pp. 490-555)",
            "Breast (pp. 558-612)",
            "Liver, Gallbladder & Pancreas (pp. 640-770)",
            "Abdominal Wall, Umbilicus & Hernias (pp. 780-840)",
            "Stomach & Intestines (pp. 880-995)",
            "Urology (pp. 1040-1150)",
            "Neurosurgery & Trauma (pp. 1152-1170)",
            "Thorax (pp. 1172-1200)"
        )
    )

    fun getTopics(): List<Topic> =
        SurgeryGeneralQuestionsDataProvider.getGeneralTopics() +
        SurgerySystemicQuestionsDataProvider.getSystemicTopics()
}
