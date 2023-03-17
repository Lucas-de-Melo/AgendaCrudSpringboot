package by.lucas.agenda.contatos.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class contato {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(nullable = false)
  private String nome;

  @Column(nullable = false)
  private String telefone;

  @Column(nullable = false)
  private String email;

  private String urlavatar;
  private String teste;
}
