package com.quiz.constants;

public enum Status {
    ENROLLED(1),
    STARTED(2),
    PAUSED(3),
    FINISHED(4),
    UNKNOWN(5);

    private final int status;

    Status(int take_status) {
        status = take_status;
    }

    public static Status getStatusById(Integer id) {
        switch (id) {
            case 1:
                return ENROLLED;
            case 2:
                return STARTED;
            case 3:
                return PAUSED;
            case 4:
                return FINISHED;
            default:
                return UNKNOWN;
        }
    }

    public static int getStatusByName(String name) {
        switch (name) {
            case "ENROLLED":
                return ENROLLED.status;
            case "STARTED":
                return STARTED.status;
            case "PAUSED":
                return PAUSED.status;
            case "FINISHED":
                return FINISHED.status;
            default:
                return UNKNOWN.status;
        }
    }
}
