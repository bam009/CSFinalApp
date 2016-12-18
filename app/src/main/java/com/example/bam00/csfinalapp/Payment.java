package com.example.bam00.csfinalapp;

public class Payment {
    private Double loanAmount;
    private Double interestRate;
    private Double loanTerm;

    public Payment(Double loanAmount, Double interestRate, Double loanTerm) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanTerm = loanTerm;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setLoanTerm(Double loanTerm) {
        this.loanTerm = loanTerm;
    }

    public Double getLoanTerm() {
        return loanTerm;
    }
}
