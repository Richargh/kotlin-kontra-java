package de.richargh.ktkonja.sharedj.hidden.nullcheck;

import org.jspecify.annotations.Nullable;

public record Employee(
        EmployeeId employeeId,
        String name,
        @Nullable String nickname
) {
}
