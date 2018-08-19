package au.autogeneral.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "task")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {""},
        allowGetters = true)
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String task;
    
    @NotBlank
    private boolean isBalanced;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setIsBalanced(boolean balance) {
        this.isBalanced = balance;
    }
    public boolean getIsBalanced() {
        return this.isBalanced;
    }

    public void setTask(String task) {
        this.task = task;
    }

	@Override
	public String toString() {
		return "Task [task=" + task + ", isBalanced=" + isBalanced + "]";
	}


}
