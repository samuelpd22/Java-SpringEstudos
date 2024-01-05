package br.com.samuel.projeto.entity;

import br.com.samuel.projeto.dto.PerfilDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.BeanUtils;

@Entity
@Table(name = "SAM_USUARIO")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(  of = "id")
public class PerfilEntity {

    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String descricao;

    public PerfilEntity(PerfilDTO perfil){
        BeanUtils.copyProperties(perfil, this);
    }
}
