package de.richargh.ktkonja.sharedj.hidden.nullcheck;

import java.util.UUID;

public record EmployeeId(String rawValue) {
    static EmployeeId random(){
        return new EmployeeId(UUID.randomUUID().toString());
    }
}
