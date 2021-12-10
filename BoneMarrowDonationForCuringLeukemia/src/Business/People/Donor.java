/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.People;

import Business.HLA.HLA_Person;
import java.util.Date;

/**
 *
 * @author balumullamuri
 */
public class Donor {
    
     private String donorID;
    private String name;
    private Date dob;
    private int age;
    private String gender;
    private HLA_Person hla;
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private long contact;
    private String emailID;
    private String status;
    private Date  lastDonationDate;
    private boolean brainInjury;
    private boolean diabitiesBP;       //Currently you do NOT have any diabitiesBP? 
    private boolean breathingProb;
    private String imagePath; 
    private byte[] dP;
    private Date cancerDiagnosedDate;
    
}
