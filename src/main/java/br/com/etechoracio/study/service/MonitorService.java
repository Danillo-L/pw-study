package br.com.etechoracio.study.service;

import br.com.etechoracio.study.entity.Disciplina;
import br.com.etechoracio.study.entity.Monitor;
import br.com.etechoracio.study.repository.MonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorService {

    @Autowired
    private MonitorRepository repository;


    public List<Monitor> listar()
    {
        return repository.findAll();
    }


    public Monitor buscarPorId(Long id)
    {
        var existe = repository.findById(id);
        if(existe.isPresent())
            return existe.get();
        return null;
    }

    public Monitor buscarPorEmaiL(String email)
    {
        var existe = repository.findByEmail(email);
        if(existe != null)
        {
            return repository.findByEmail(email);
        }
        return null;
    }

    public Monitor cadastrar(Monitor monitor)
    {
        var achouWhats = repository.findByWhatsapp(monitor.getWhatsapp());
        var achouEmail = repository.findByEmail(monitor.getEmail());
        if(achouWhats == null && achouEmail == null)
            return repository.save(monitor);
        else if(achouWhats != null)
            System.out.println("Whatsapp já cadastrado");
        else
            System.out.println("Email já cadastrado");
        return null;
    }


    public Monitor alterar(Monitor monitor)
    {
        var existe = buscarPorId(monitor.getId());
        if (existe != null)
            return repository.save(monitor);
        else{
            System.out.println("Monitor não encontrado");
            return null;
        }
    }


    public void excluir(Long id)
    {
        var existe = buscarPorId(id);
        if(existe != null)
            repository.deleteById(id);
    }















}
