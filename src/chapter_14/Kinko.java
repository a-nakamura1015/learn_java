package chapter_14;

class Kinko implements Lockable {
    @Override
    public boolean lock() {
        // lockの処理
        return true;
    }
    @Override
    public boolean unlock() {
        // unlockの処理
        return false;
    }
}
