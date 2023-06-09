package com.volodia.OnlinePharmacyAPI.config;

import com.volodia.OnlinePharmacyAPI.entities.Medication;
import com.volodia.OnlinePharmacyAPI.repositories.MedicationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
@Slf4j
public class DevelopmentConfig {

    @Bean
    public CommandLineRunner dataLoader(MedicationRepository medicationRepository) {
        return (args) -> {

            medicationRepository.save(new Medication(
                    UUID.randomUUID().toString(),
                    "Aspirin",
                    "For the heart",
                    "Anti-inflammatory, analgesic, and antipyretic medication",
                    "Acetylsalicylic acid",
                    "Bayer",
                    5));
            medicationRepository.save(new Medication(
                    UUID.randomUUID().toString(),
                    "Clopidogrel",
                    "For the heart",
                    "Platelet aggregation inhibitor for the prevention of thrombosis and myocardial infarction",
                    "Clopidogrel",
                    "Teva",
                    10));
            medicationRepository.save(new Medication(
                    UUID.randomUUID().toString(),
                    "Bisoprolol",
                    "For the heart",
                    "Beta-adrenergic blocker for the treatment of hypertension and heart failure",
                    "Bisoprolol",
                    "Teva",
                    3));
            medicationRepository.save(new Medication(
                    UUID.randomUUID().toString(),
                    "Enalapril",
                    "For the heart",
                    "Angiotensin-converting enzyme (ACE) inhibitor for the treatment of hypertension and heart failure",
                    "Enalapril",
                    "Teva",
                    10));
            medicationRepository.save(new Medication(
                    UUID.randomUUID().toString(),
                    "Atorvastatin",
                    "For the heart",
                    "Statins that lower cholesterol and low-density lipoproteins levels in the body",
                    "Atorvastatin",
                    "Teva",
                    10));
            medicationRepository.save(new Medication(
                    UUID.randomUUID().toString(),
                    "Paracetamol",
                    "for the head",
                    "Analgesic and antipyretic medication",
                    "Paracetamol",
                    "Darnitsa",
                    2));
            medicationRepository.save(new Medication(
                    UUID.randomUUID().toString(),
                    "Nurofen",
                    "for the head",
                    "Anti-inflammatory, analgesic, and antipyretic medication",
                    "Ibuprofen",
                    "Reckitt Benckiser Healthcare",
                    5));
            medicationRepository.save(new Medication(
                    UUID.randomUUID().toString(),
                    "Citramon",
                    "for the head",
                    "Nonsteroidal anti-inflammatory drug, analgesic, and antipyretic medication",
                    "Naproxen",
                    "Ilan Farm",
                    5));
            medicationRepository.save(new Medication(
                    UUID.randomUUID().toString(),
                    "Amigren",
                    "for the head",
                    "Antimigraine medication for the treatment of migraines and severe headaches",
                    "Sumatriptan",
                    "Astrapharm",
                    10));
            medicationRepository.save(new Medication(
                    UUID.randomUUID().toString(),
                    "Elptan",
                    "for the head",
                    "Medication for the treatment of headaches, including migraines",
                    "Eletriptan",
                    "Rafarm",
                    10));
            medicationRepository.save(new Medication(
                    UUID.randomUUID().toString(),
                    "Omeprazole",
                    "for the stomach",
                    "Medication for the treatment of stomach ulcers, acid reflux, and other gastrointestinal disorders",
                    "Omeprazole",
                    "Arterium",
                    5));
            medicationRepository.save(new Medication(
                    UUID.randomUUID().toString(),
                    "Ranitidine",
                    "for the stomach",
                    "Medication for the treatment of stomach ulcers and acid reflux",
                    "Ranitidine",
                    "Darnitsa",
                    2));
            medicationRepository.save(new Medication(
                    UUID.randomUUID().toString(),
                    "Domperidone",
                    "for the stomach",
                    "Medication to improve digestion and reduce nausea and vomiting",
                    "Domperidone",
                    "Stoma",
                    2));
            medicationRepository.save(new Medication(
                    UUID.randomUUID().toString(),
                    "Pantoprazole",
                    "for the stomach",
                    "Medication for the treatment of stomach ulcers, acid reflux, and other gastrointestinal disorders",
                    "Pantoprazole",
                    "Teva",
                    7));
            medicationRepository.save(new Medication(
                    UUID.randomUUID().toString(),
                    "Phosphalugel",
                    "for the stomach",
                    "antacid drug that is used quite commonly to help improve and relieve symptoms including " +
                            "pain and burning caused by acid in diseases of the stomach - duodenum or reflux.",
                    "Aluminium phosphate",
                    "Yamanouchi Europe",
                    10));

            log.info("All medications are loaded");
        };
    }
}
