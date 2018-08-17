package au.autogeneral.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import au.autogeneral.api.exception.AGResourceNotFoundException;
import au.autogeneral.api.exception.TodoException;
import au.autogeneral.api.model.Balanced;
import au.autogeneral.api.model.Completed;
import au.autogeneral.api.model.Task;
import au.autogeneral.api.model.Todo;
import au.autogeneral.api.repository.TodoRepository;



//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/")
public class AutoGeneralController {

    @Autowired
    TodoRepository todoRepository;

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
}