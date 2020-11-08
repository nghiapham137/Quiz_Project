package com.quiz.constants;

public enum User_Role {
    ROLE_USER(1),
    ROLE_ADMIN(2),
    UNKNOWN(3);

    private final int user_role;

    User_Role(int role) {
        user_role = role;
    }

    public static User_Role getUserRoleById(Integer id) {
        if (id == null) {
            return UNKNOWN;
        }
        switch (id) {
            case 1:
                return ROLE_USER;
            case 2:
                return ROLE_ADMIN;
            default:
                return UNKNOWN;
        }

    }

    public static int getRoleByName(String name) {
        if (name == null) {
            return UNKNOWN.user_role;
        }

        switch (name) {
            case "ROLE_USER":
                return ROLE_USER.user_role;
            case "ROLE_ADMIN":
                return ROLE_ADMIN.user_role;
            default:
                return UNKNOWN.user_role;
        }
    }
}


