package br.com.francisco.libraryapi.api.exceptions;

import br.com.francisco.libraryapi.exception.BusinessException;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApiErrors {

    private final List<String> errors;

    public ApiErrors(BindingResult bindingResult) {
        this.errors = new ArrayList<>();
        bindingResult.getAllErrors().forEach(error -> this.errors.add(error.getDefaultMessage()));
    }

    public ApiErrors(BusinessException ex) {
        this.errors = Collections.singletonList(ex.getMessage());
    }

    public List<String> getErrors() {
        return errors;
    }
}
