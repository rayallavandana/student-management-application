public abstract class MenuItem {
    private final String menuItemName;

    public MenuItem(String menuItemName) {
        this.menuItemName = menuItemName;
    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public abstract void select();
}

