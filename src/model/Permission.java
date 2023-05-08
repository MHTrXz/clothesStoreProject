package model;

import controller.PermissionController;

public class Permission extends Model {

    private static final String file = "permission.txt";

    public static PermissionController getPermission(String id) {
        String[] data = getById(id, file);
        if (data != null) {
            String[] permission = new String[data.length-3];
            return new PermissionController(id, data[1], permission);
        } else {
            return null;
        }
    }

    public static boolean updatePermission(PermissionController Permission) {
        return update(Permission.getId(), Permission.toString(), file);
    }

}
