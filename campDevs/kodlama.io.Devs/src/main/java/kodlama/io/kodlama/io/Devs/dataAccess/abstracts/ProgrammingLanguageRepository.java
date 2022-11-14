package kodlama.io.kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {

	void addProgrammingLanguage(ProgrammingLanguage programmingLanguage);

	void deleteProgrammingLanguage(ProgrammingLanguage programmingLanguage);

	void updateProgrammingLanguage(ProgrammingLanguage programmingLanguage);

	ProgrammingLanguage callById(int id);

	List<ProgrammingLanguage> getAll();

}
