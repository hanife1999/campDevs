package kodlama.io.kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguage implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> programmingLanguages;

	public InMemoryProgrammingLanguage() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1, "Java"));
		programmingLanguages.add(new ProgrammingLanguage(2, "Python"));
		programmingLanguages.add(new ProgrammingLanguage(3, "C#"));

	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage callById(int id) {
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if (programmingLanguage.getId() == id) {
				return programmingLanguage;

			}
		}
		return null;
	}

	@Override
	public void addProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);

	}

	@Override
	public void deleteProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);

	}

	@Override
	public void updateProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
		var item = callById(programmingLanguage.getId());
		item.setName(programmingLanguage.getName());

	}

}
