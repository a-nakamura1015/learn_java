package chapter_14.kadai;

import java.awt.*;

public interface IconInfo {
    // 引数はint型で仮引数の名前はiconType、戻り値の型はImage型で、名前がgetIconであるメソッド。
    public abstract Image getIcon(int iconType);
    // 型はintで名前はICON_16x16、値は1であるフィールド。
    public final int ICON_16x16 = 1;
    // 型はintで名前はICON_32x32、値は2であるフィールド
    public final int ICON_32x_32 = 2;
}
