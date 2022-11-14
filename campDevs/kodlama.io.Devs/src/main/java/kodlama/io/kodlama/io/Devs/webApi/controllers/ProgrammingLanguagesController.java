package kodlama.io.kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	public ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		super();
		this.programmingLanguageService = programmingLanguageService;
	}

	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageService.getAll();

	}

	@GetMapping("/callbyid")
	public ProgrammingLanguage callByid(int id) {
		return programmingLanguageService.callByIs(id);

	}

	@PostMapping
	public List<ProgrammingLanguage> addLanguages(ProgrammingLanguage programmingLanguage) {
		return programmingLanguageService.addProgrammingLanguage(programmingLanguage);
	}

	@DeleteMapping
	public List<ProgrammingLanguage> delProgrammingLanguagesé(ProgrammingLanguage programmingLanguage) {
		return programmingLanguageService.deleteProgrammingLanguage(programmingLanguage);
	}

	@PutMapping
	public List<ProgrammingLanguage> upProgrammingLanguages(ProgrammingLanguage programmingLanguage) {
		return programmingLanguageService.updateProgrammingLanguage(programmingLanguage);
	}
}
