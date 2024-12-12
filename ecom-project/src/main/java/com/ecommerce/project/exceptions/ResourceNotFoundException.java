package com.ecommerce.project.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    String resourceName;
    String field;
    String filedName;
    Long fieldId;

    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String resourceName, String field, String filedName) {
        super(String.format("%s not found with %s: %s", resourceName, field, filedName));
        this.field = field;
        this.filedName = filedName;
    }

    public ResourceNotFoundException(String message, boolean enableSuppression, boolean writableStackTrace, String resourceName, String field, Long fieldId) {
        super(String.format("%s not found with %s: %s", resourceName, field, fieldId));
        this.resourceName = resourceName;
        this.field = field;
        this.fieldId = fieldId;
    }
}
