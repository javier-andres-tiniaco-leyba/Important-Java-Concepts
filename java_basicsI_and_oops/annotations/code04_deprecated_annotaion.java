
// When @Deprecated annotation is used, the documentation should
// reflect why the element is deprecated and what to use instead.

interface House {
    /**
     * @deprecated use of open is discouraged, use
     * openFrontDoor or openBackDoor instead.
     */
     @Deprecated
     public void open();
     public void openFrontDoor();
     public void openBackDoor();
}
