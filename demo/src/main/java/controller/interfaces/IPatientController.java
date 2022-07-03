package controller.interfaces;

import model.Patient;

public interface IPatientController {

    //crear nuevo paciente
    public Patient addNewPatient(Patient patient);

    //crear la informacion del paciente
    public void updateAnyPatientInformation(Integer patientId, Patient patient);

}