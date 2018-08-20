package au.autogeneral.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import au.autogeneral.api.exception.AGResourceNotFoundException;
import au.autogeneral.api.exception.TaskException;
import au.autogeneral.api.exception.TodoException;
import au.autogeneral.api.model.Balanced;
import au.autogeneral.api.model.Task;
import au.autogeneral.api.model.Todo;
import au.autogeneral.api.repository.TodoRepository;



//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600) //Allow connection origin Angular CLI
@RestController
@RequestMapping("/")
public class AutoGeneralController {

    @Autowired
    TodoRepository todoRepository;
    
    @PostMapping("/task/")
    public Todo createTask() throws TaskException{
    	 throw new TaskException("NOTFOUNDERROR");
         
    }
    @GetMapping("/task/")
    public Todo getTask() throws TaskException{
    	 throw new TaskException("NOTFOUNDERROR");
         
    }
    @GetMapping("/tasks/validateBrackets/{str}")
    public Task isValidateBrackets(@PathVariable(value = "str") String taskStr) throws TodoException {
    	if(taskStr.length() > 50) throw new TodoException("ValidationError");
        Task t = new Task();
        t.setTask(taskStr);
        t.setIsBalanced(Balanced.isBalancedEfficient(taskStr));
        return t;
    }
    
    @GetMapping("/todo/{id}")
    public Todo isCompleted(@PathVariable(value = "id") Long todoId) throws Exception {
    	return  todoRepository.findById(todoId)
    			.orElseThrow(() -> new Exception("NotFoundError"));
        
    }
    @PostMapping("/todo/{str}")
    public Todo createTodo(@PathVariable(value = "str") String inputStr) throws TodoException{
    	if(inputStr.isEmpty() || inputStr.length()==0) throw new TodoException("ValidationError");
    	Todo todo = new Todo();
    	todo.setTitle(inputStr);
        return todoRepository.save(todo);	
    }
    
    @PutMapping("/todo/")
    public Todo updateTodo(@PathVariable(value = "id") Long todoId,
                                           @Valid @RequestBody Todo todoDetails) throws Exception {

    	Todo todo = todoRepository.findById(todoId)
                .orElseThrow(() -> new Exception("NotFoundError"));

    	todo.setTitle(todoDetails.getText());
        todo.setIsCompleted(todoDetails.getIsCompleted());

        Todo updatedTodo = todoRepository.save(todo);
        return updatedTodo;
    }

    @DeleteMapping("/todo/{id}")
    public ResponseEntity<?> deleteTodo(@PathVariable(value = "id") Long todoId) throws Exception {
        Todo todo = todoRepository.findById(todoId)
                .orElseThrow(() -> new Exception("NotFoundError"));

        todoRepository.delete(todo);

        return ResponseEntity.ok().build();
    }
}
