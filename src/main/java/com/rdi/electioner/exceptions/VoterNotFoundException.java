package com.rdi.electioner.exceptions;

public class VoterNotFoundException extends ElectionerException {
    public VoterNotFoundException(String message) {
        super(message);
    }
}
