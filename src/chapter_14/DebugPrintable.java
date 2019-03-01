package chapter_14;

interface DebugPrintable {
    enum Type {
        NO_ERROR, FILE_ERROR, MEMORY_ERROR,
    };
    public static final String PREFIX = "ERROR:";
    public abstract void debugPrint();
}
