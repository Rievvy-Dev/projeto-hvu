package br.ufape.lmts.hvu.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufape.lmts.hvu.model.*;
import br.ufape.lmts.hvu.service.*;

@Service
public class Facade {
	//Tutor--------------------------------------------------------------
	@Autowired
	private TutorService  tutorService;
		
	public Tutor saveTutor(Tutor newInstance) {
		return tutorService.saveTutor(newInstance);
	}

	public Tutor updateTutor(Tutor transientObject) {
		return tutorService.updateTutor(transientObject);
	}

	public Tutor findTutorById(long id) {
		return tutorService.findTutorById(id);
	}

	public List<Tutor> getAllTutor() {
		return tutorService.getAllTutor();
	}

	public void deleteTutor(Tutor persistentObject) {
		tutorService.deleteTutor(persistentObject);
	}

	public void deleteTutor(long id) {
		tutorService.deleteTutor(id);
	}
	

	//Parecer--------------------------------------------------------------
	@Autowired
	private ParecerService  parecerService;
		
	public Parecer saveParecer(Parecer newInstance) {
		return parecerService.saveParecer(newInstance);
	}

	public Parecer updateParecer(Parecer transientObject) {
		return parecerService.updateParecer(transientObject);
	}

	public Parecer findParecerById(long id) {
		return parecerService.findParecerById(id);
	}

	public List<Parecer> getAllParecer() {
		return parecerService.getAllParecer();
	}

	public void deleteParecer(Parecer persistentObject) {
		parecerService.deleteParecer(persistentObject);
	}

	public void deleteParecer(long id) {
		parecerService.deleteParecer(id);
	}
	

	//Vacina--------------------------------------------------------------
	@Autowired
	private VacinaService  vacinaService;
		
	public Vacina saveVacina(Vacina newInstance) {
		return vacinaService.saveVacina(newInstance);
	}

	public Vacina updateVacina(Vacina transientObject) {
		return vacinaService.updateVacina(transientObject);
	}

	public Vacina findVacinaById(long id) {
		return vacinaService.findVacinaById(id);
	}

	public List<Vacina> getAllVacina() {
		return vacinaService.getAllVacina();
	}

	public void deleteVacina(Vacina persistentObject) {
		vacinaService.deleteVacina(persistentObject);
	}

	public void deleteVacina(long id) {
		vacinaService.deleteVacina(id);
	}
	

	//Usuario--------------------------------------------------------------
	@Autowired
	private UsuarioService  usuarioService;
		
	public Usuario saveUsuario(Usuario newInstance) {
		return usuarioService.saveUsuario(newInstance);
	}

	public Usuario updateUsuario(Usuario transientObject) {
		return usuarioService.updateUsuario(transientObject);
	}

	public Usuario findUsuarioById(long id) {
		return usuarioService.findUsuarioById(id);
	}

	public List<Usuario> getAllUsuario() {
		return usuarioService.getAllUsuario();
	}

	public void deleteUsuario(Usuario persistentObject) {
		usuarioService.deleteUsuario(persistentObject);
	}

	public void deleteUsuario(long id) {
		usuarioService.deleteUsuario(id);
	}
	

	//Especialidade--------------------------------------------------------------
	@Autowired
	private EspecialidadeService  especialidadeService;
		
	public Especialidade saveEspecialidade(Especialidade newInstance) {
		return especialidadeService.saveEspecialidade(newInstance);
	}

	public Especialidade updateEspecialidade(Especialidade transientObject) {
		return especialidadeService.updateEspecialidade(transientObject);
	}

	public Especialidade findEspecialidadeById(long id) {
		return especialidadeService.findEspecialidadeById(id);
	}

	public List<Especialidade> getAllEspecialidade() {
		return especialidadeService.getAllEspecialidade();
	}

	public void deleteEspecialidade(Especialidade persistentObject) {
		especialidadeService.deleteEspecialidade(persistentObject);
	}

	public void deleteEspecialidade(long id) {
		especialidadeService.deleteEspecialidade(id);
	}
	

	//Cronograma--------------------------------------------------------------
	@Autowired
	private CronogramaService  cronogramaService;
		
	public Cronograma saveCronograma(Cronograma newInstance) {
		return cronogramaService.saveCronograma(newInstance);
	}

	public Cronograma updateCronograma(Cronograma transientObject) {
		return cronogramaService.updateCronograma(transientObject);
	}

	public Cronograma findCronogramaById(long id) {
		return cronogramaService.findCronogramaById(id);
	}

	public List<Cronograma> getAllCronograma() {
		return cronogramaService.getAllCronograma();
	}

	public void deleteCronograma(Cronograma persistentObject) {
		cronogramaService.deleteCronograma(persistentObject);
	}

	public void deleteCronograma(long id) {
		cronogramaService.deleteCronograma(id);
	}
	

	//Medico--------------------------------------------------------------
	@Autowired
	private MedicoService  medicoService;
		
	public Medico saveMedico(Medico newInstance) {
		return medicoService.saveMedico(newInstance);
	}

	public Medico updateMedico(Medico transientObject) {
		return medicoService.updateMedico(transientObject);
	}

	public Medico findMedicoById(long id) {
		return medicoService.findMedicoById(id);
	}

	public List<Medico> getAllMedico() {
		return medicoService.getAllMedico();
	}

	public void deleteMedico(Medico persistentObject) {
		medicoService.deleteMedico(persistentObject);
	}

	public void deleteMedico(long id) {
		medicoService.deleteMedico(id);
	}
	

	//TipoExame--------------------------------------------------------------
	@Autowired
	private TipoExameService  tipoExameService;
		
	public TipoExame saveTipoExame(TipoExame newInstance) {
		return tipoExameService.saveTipoExame(newInstance);
	}

	public TipoExame updateTipoExame(TipoExame transientObject) {
		return tipoExameService.updateTipoExame(transientObject);
	}

	public TipoExame findTipoExameById(long id) {
		return tipoExameService.findTipoExameById(id);
	}

	public List<TipoExame> getAllTipoExame() {
		return tipoExameService.getAllTipoExame();
	}

	public void deleteTipoExame(TipoExame persistentObject) {
		tipoExameService.deleteTipoExame(persistentObject);
	}

	public void deleteTipoExame(long id) {
		tipoExameService.deleteTipoExame(id);
	}
	

	//Raca--------------------------------------------------------------
	@Autowired
	private RacaService  racaService;
		
	public Raca saveRaca(Raca newInstance) {
		return racaService.saveRaca(newInstance);
	}

	public Raca updateRaca(Raca transientObject) {
		return racaService.updateRaca(transientObject);
	}

	public Raca findRacaById(long id) {
		return racaService.findRacaById(id);
	}

	public List<Raca> getAllRaca() {
		return racaService.getAllRaca();
	}

	public void deleteRaca(Raca persistentObject) {
		racaService.deleteRaca(persistentObject);
	}

	public void deleteRaca(long id) {
		racaService.deleteRaca(id);
	}
	

	//Vaga--------------------------------------------------------------
	@Autowired
	private VagaService  vagaService;
		
	public Vaga saveVaga(Vaga newInstance) {
		return vagaService.saveVaga(newInstance);
	}

	public Vaga updateVaga(Vaga transientObject) {
		return vagaService.updateVaga(transientObject);
	}

	public Vaga findVagaById(long id) {
		return vagaService.findVagaById(id);
	}

	public List<Vaga> getAllVaga() {
		return vagaService.getAllVaga();
	}

	public void deleteVaga(Vaga persistentObject) {
		vagaService.deleteVaga(persistentObject);
	}

	public void deleteVaga(long id) {
		vagaService.deleteVaga(id);
	}
	

	//Endereco--------------------------------------------------------------
	@Autowired
	private EnderecoService  enderecoService;
		
	public Endereco saveEndereco(Endereco newInstance) {
		return enderecoService.saveEndereco(newInstance);
	}

	public Endereco updateEndereco(Endereco transientObject) {
		return enderecoService.updateEndereco(transientObject);
	}

	public Endereco findEnderecoById(long id) {
		return enderecoService.findEnderecoById(id);
	}

	public List<Endereco> getAllEndereco() {
		return enderecoService.getAllEndereco();
	}

	public void deleteEndereco(Endereco persistentObject) {
		enderecoService.deleteEndereco(persistentObject);
	}

	public void deleteEndereco(long id) {
		enderecoService.deleteEndereco(id);
	}
	

	//Medicamento--------------------------------------------------------------
	@Autowired
	private MedicamentoService  medicamentoService;
		
	public Medicamento saveMedicamento(Medicamento newInstance) {
		return medicamentoService.saveMedicamento(newInstance);
	}

	public Medicamento updateMedicamento(Medicamento transientObject) {
		return medicamentoService.updateMedicamento(transientObject);
	}

	public Medicamento findMedicamentoById(long id) {
		return medicamentoService.findMedicamentoById(id);
	}

	public List<Medicamento> getAllMedicamento() {
		return medicamentoService.getAllMedicamento();
	}

	public void deleteMedicamento(Medicamento persistentObject) {
		medicamentoService.deleteMedicamento(persistentObject);
	}

	public void deleteMedicamento(long id) {
		medicamentoService.deleteMedicamento(id);
	}
	

	//Prescricao--------------------------------------------------------------
	@Autowired
	private PrescricaoService  prescricaoService;
		
	public Prescricao savePrescricao(Prescricao newInstance) {
		return prescricaoService.savePrescricao(newInstance);
	}

	public Prescricao updatePrescricao(Prescricao transientObject) {
		return prescricaoService.updatePrescricao(transientObject);
	}

	public Prescricao findPrescricaoById(long id) {
		return prescricaoService.findPrescricaoById(id);
	}

	public List<Prescricao> getAllPrescricao() {
		return prescricaoService.getAllPrescricao();
	}

	public void deletePrescricao(Prescricao persistentObject) {
		prescricaoService.deletePrescricao(persistentObject);
	}

	public void deletePrescricao(long id) {
		prescricaoService.deletePrescricao(id);
	}
	

	//Estagiario--------------------------------------------------------------
	@Autowired
	private EstagiarioService  estagiarioService;
		
	public Estagiario saveEstagiario(Estagiario newInstance) {
		return estagiarioService.saveEstagiario(newInstance);
	}

	public Estagiario updateEstagiario(Estagiario transientObject) {
		return estagiarioService.updateEstagiario(transientObject);
	}

	public Estagiario findEstagiarioById(long id) {
		return estagiarioService.findEstagiarioById(id);
	}

	public List<Estagiario> getAllEstagiario() {
		return estagiarioService.getAllEstagiario();
	}

	public void deleteEstagiario(Estagiario persistentObject) {
		estagiarioService.deleteEstagiario(persistentObject);
	}

	public void deleteEstagiario(long id) {
		estagiarioService.deleteEstagiario(id);
	}
	

	//Secretario--------------------------------------------------------------
	@Autowired
	private SecretarioService  secretarioService;
		
	public Secretario saveSecretario(Secretario newInstance) {
		return secretarioService.saveSecretario(newInstance);
	}

	public Secretario updateSecretario(Secretario transientObject) {
		return secretarioService.updateSecretario(transientObject);
	}

	public Secretario findSecretarioById(long id) {
		return secretarioService.findSecretarioById(id);
	}

	public List<Secretario> getAllSecretario() {
		return secretarioService.getAllSecretario();
	}

	public void deleteSecretario(Secretario persistentObject) {
		secretarioService.deleteSecretario(persistentObject);
	}

	public void deleteSecretario(long id) {
		secretarioService.deleteSecretario(id);
	}
	

	//ExameFisicoGeral--------------------------------------------------------------
	@Autowired
	private ExameFisicoGeralService  exameFisicoGeralService;
		
	public ExameFisicoGeral saveExameFisicoGeral(ExameFisicoGeral newInstance) {
		return exameFisicoGeralService.saveExameFisicoGeral(newInstance);
	}

	public ExameFisicoGeral updateExameFisicoGeral(ExameFisicoGeral transientObject) {
		return exameFisicoGeralService.updateExameFisicoGeral(transientObject);
	}

	public ExameFisicoGeral findExameFisicoGeralById(long id) {
		return exameFisicoGeralService.findExameFisicoGeralById(id);
	}

	public List<ExameFisicoGeral> getAllExameFisicoGeral() {
		return exameFisicoGeralService.getAllExameFisicoGeral();
	}

	public void deleteExameFisicoGeral(ExameFisicoGeral persistentObject) {
		exameFisicoGeralService.deleteExameFisicoGeral(persistentObject);
	}

	public void deleteExameFisicoGeral(long id) {
		exameFisicoGeralService.deleteExameFisicoGeral(id);
	}
	

	//Diretor--------------------------------------------------------------
	@Autowired
	private DiretorService  diretorService;
		
	public Diretor saveDiretor(Diretor newInstance) {
		return diretorService.saveDiretor(newInstance);
	}

	public Diretor updateDiretor(Diretor transientObject) {
		return diretorService.updateDiretor(transientObject);
	}

	public Diretor findDiretorById(long id) {
		return diretorService.findDiretorById(id);
	}

	public List<Diretor> getAllDiretor() {
		return diretorService.getAllDiretor();
	}

	public void deleteDiretor(Diretor persistentObject) {
		diretorService.deleteDiretor(persistentObject);
	}

	public void deleteDiretor(long id) {
		diretorService.deleteDiretor(id);
	}
	

	//Animal--------------------------------------------------------------
	@Autowired
	private AnimalService  animalService;
		
	public Animal saveAnimal(Animal newInstance) {
		return animalService.saveAnimal(newInstance);
	}

	public Animal updateAnimal(Animal transientObject) {
		return animalService.updateAnimal(transientObject);
	}

	public Animal findAnimalById(long id) {
		return animalService.findAnimalById(id);
	}

	public List<Animal> getAllAnimal() {
		return animalService.getAllAnimal();
	}

	public void deleteAnimal(Animal persistentObject) {
		animalService.deleteAnimal(persistentObject);
	}

	public void deleteAnimal(long id) {
		animalService.deleteAnimal(id);
	}
	

	//Consulta--------------------------------------------------------------
	@Autowired
	private ConsultaService  consultaService;
		
	public Consulta saveConsulta(Consulta newInstance) {
		return consultaService.saveConsulta(newInstance);
	}

	public Consulta updateConsulta(Consulta transientObject) {
		return consultaService.updateConsulta(transientObject);
	}

	public Consulta findConsultaById(long id) {
		return consultaService.findConsultaById(id);
	}

	public List<Consulta> getAllConsulta() {
		return consultaService.getAllConsulta();
	}

	public void deleteConsulta(Consulta persistentObject) {
		consultaService.deleteConsulta(persistentObject);
	}

	public void deleteConsulta(long id) {
		consultaService.deleteConsulta(id);
	}
	

	//Especie--------------------------------------------------------------
	@Autowired
	private EspecieService  especieService;
		
	public Especie saveEspecie(Especie newInstance) {
		return especieService.saveEspecie(newInstance);
	}

	public Especie updateEspecie(Especie transientObject) {
		return especieService.updateEspecie(transientObject);
	}

	public Especie findEspecieById(long id) {
		return especieService.findEspecieById(id);
	}

	public List<Especie> getAllEspecie() {
		return especieService.getAllEspecie();
	}

	public void deleteEspecie(Especie persistentObject) {
		especieService.deleteEspecie(persistentObject);
	}

	public void deleteEspecie(long id) {
		especieService.deleteEspecie(id);
	}
	

	//HistoricoMedicoPregresso--------------------------------------------------------------
	@Autowired
	private HistoricoMedicoPregressoService  historicoMedicoPregressoService;
		
	public HistoricoMedicoPregresso saveHistoricoMedicoPregresso(HistoricoMedicoPregresso newInstance) {
		return historicoMedicoPregressoService.saveHistoricoMedicoPregresso(newInstance);
	}

	public HistoricoMedicoPregresso updateHistoricoMedicoPregresso(HistoricoMedicoPregresso transientObject) {
		return historicoMedicoPregressoService.updateHistoricoMedicoPregresso(transientObject);
	}

	public HistoricoMedicoPregresso findHistoricoMedicoPregressoById(long id) {
		return historicoMedicoPregressoService.findHistoricoMedicoPregressoById(id);
	}

	public List<HistoricoMedicoPregresso> getAllHistoricoMedicoPregresso() {
		return historicoMedicoPregressoService.getAllHistoricoMedicoPregresso();
	}

	public void deleteHistoricoMedicoPregresso(HistoricoMedicoPregresso persistentObject) {
		historicoMedicoPregressoService.deleteHistoricoMedicoPregresso(persistentObject);
	}

	public void deleteHistoricoMedicoPregresso(long id) {
		historicoMedicoPregressoService.deleteHistoricoMedicoPregresso(id);
	}
	

	//ExameComplementar--------------------------------------------------------------
	@Autowired
	private ExameComplementarService  exameComplementarService;
		
	public ExameComplementar saveExameComplementar(ExameComplementar newInstance) {
		return exameComplementarService.saveExameComplementar(newInstance);
	}

	public ExameComplementar updateExameComplementar(ExameComplementar transientObject) {
		return exameComplementarService.updateExameComplementar(transientObject);
	}

	public ExameComplementar findExameComplementarById(long id) {
		return exameComplementarService.findExameComplementarById(id);
	}

	public List<ExameComplementar> getAllExameComplementar() {
		return exameComplementarService.getAllExameComplementar();
	}

	public void deleteExameComplementar(ExameComplementar persistentObject) {
		exameComplementarService.deleteExameComplementar(persistentObject);
	}

	public void deleteExameComplementar(long id) {
		exameComplementarService.deleteExameComplementar(id);
	}
	

	//ExameFisicoEspecial--------------------------------------------------------------
	@Autowired
	private ExameFisicoEspecialService  exameFisicoEspecialService;
		
	public ExameFisicoEspecial saveExameFisicoEspecial(ExameFisicoEspecial newInstance) {
		return exameFisicoEspecialService.saveExameFisicoEspecial(newInstance);
	}

	public ExameFisicoEspecial updateExameFisicoEspecial(ExameFisicoEspecial transientObject) {
		return exameFisicoEspecialService.updateExameFisicoEspecial(transientObject);
	}

	public ExameFisicoEspecial findExameFisicoEspecialById(long id) {
		return exameFisicoEspecialService.findExameFisicoEspecialById(id);
	}

	public List<ExameFisicoEspecial> getAllExameFisicoEspecial() {
		return exameFisicoEspecialService.getAllExameFisicoEspecial();
	}

	public void deleteExameFisicoEspecial(ExameFisicoEspecial persistentObject) {
		exameFisicoEspecialService.deleteExameFisicoEspecial(persistentObject);
	}

	public void deleteExameFisicoEspecial(long id) {
		exameFisicoEspecialService.deleteExameFisicoEspecial(id);
	}
	

}