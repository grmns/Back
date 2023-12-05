package com.sandoval.back.service;

import com.sandoval.back.model.Report;
import com.sandoval.back.repository.ReportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReportService {

    private final ReportRepo reportRepo;

    @Autowired
    public ReportService(ReportRepo reportRepo) {
        this.reportRepo = reportRepo;
    }

    public List<Report> getAllReports() {
        return reportRepo.findAll();
    }

    // Puedes agregar más métodos según sea necesario
}
