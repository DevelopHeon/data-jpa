package study.datajpa.entity;

import lombok.*;
import study.datajpa.common.entity.BaseEntity;

import javax.persistence.*;

/**
 * @since       2023.01.06
 * @author      sony
 * @description member
 **********************************************************************************************************************/
@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = { "id", "name", "age"})
@NamedQuery(
        name = "Member.findByName",
        query = "select m from Member m where m.name = :name"
)
@NamedEntityGraph(name = "Member.all", attributeNodes = @NamedAttributeNode("team"))
public class Member extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String name;
    private int age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID")
    private Team team;


    public Member(String name) {
        this.name = name;
    }

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Member(String name, int age, Team team) {
        this.name = name;
        this.age = age;
        if (team != null) {
            changeTeam(team);
        }
    }

    public void changeTeam(Team team) {
        this.team = team;
        team.getMembers().add(this);
    }

}