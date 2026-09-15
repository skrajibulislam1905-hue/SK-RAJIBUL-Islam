package com.example.data.repository

import com.example.data.model.*

object MedicineDataProvider {
    val textbook = TextbookInfo(
        title = "Exam Preparatory Manual for Undergraduates - Medicine",
        authors = "Archith Boloor, Ramadas Nayak",
        edition = "4th Edition",
        publisher = "Jaypee Brothers Medical Publishers",
        primarySubject = "Medicine",
        description = "The most widely recommended final year MBBS manual in India, noted for its clinical case presentations, diagnostic tables, criteria (Jones, Light's, Duke's, KDIGO), and updated pharmacotherapy protocols.",
        referenceUrl = "https://www.jaypeebrothers.com/",
        officialGuidelinesUrl = "https://www.apiindia.org/",
        keyChapters = listOf(
            "Cardiovascular System (pp. 1-180)",
            "Respiratory Medicine (pp. 185-350)",
            "Infectious Diseases (pp. 355-485)",
            "Gastrointestinal System (pp. 490-550)",
            "Hepatology (pp. 560-640)",
            "Rheumatology & Bone (pp. 650-720)",
            "Hematology & Transfusion (pp. 725-845)",
            "Nephrology & Acid-Base (pp. 850-940)",
            "Endocrinology & Diabetology (pp. 945-1050)",
            "Neurology (pp. 1115-1230)",
            "Toxicology & Poisoning (pp. 1235-1260)",
            "Psychiatry & Dermatology (pp. 1270-1370)"
        )
    )

    fun getTopics(): List<Topic> =
        MedicinePart1QuestionsDataProvider.getPart1Topics() +
        MedicinePart2QuestionsDataProvider.getPart2Topics() +
        MedicinePart3QuestionsDataProvider.getPart3Topics()
}
