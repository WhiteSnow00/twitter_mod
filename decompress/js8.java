import android.util.Pair;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class js8
{
    static {
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        final Integer value = 4;
        hashMap.put(Pair.create((Object)value, (Object)value), "layout_constraintBottom_toBottomOf");
        final Integer value2 = 3;
        hashMap.put(Pair.create((Object)value, (Object)value2), "layout_constraintBottom_toTopOf");
        hashMap.put(Pair.create((Object)value2, (Object)value), "layout_constraintTop_toBottomOf");
        hashMap.put(Pair.create((Object)value2, (Object)value2), "layout_constraintTop_toTopOf");
        final Integer value3 = 6;
        hashMap.put(Pair.create((Object)value3, (Object)value3), "layout_constraintStart_toStartOf");
        final Integer value4 = 7;
        hashMap.put(Pair.create((Object)value3, (Object)value4), "layout_constraintStart_toEndOf");
        hashMap.put(Pair.create((Object)value4, (Object)value3), "layout_constraintEnd_toStartOf");
        hashMap.put(Pair.create((Object)value4, (Object)value4), "layout_constraintEnd_toEndOf");
        final Integer value5 = 1;
        hashMap.put(Pair.create((Object)value5, (Object)value5), "layout_constraintLeft_toLeftOf");
        final Integer value6 = 2;
        hashMap.put(Pair.create((Object)value5, (Object)value6), "layout_constraintLeft_toRightOf");
        hashMap.put(Pair.create((Object)value6, (Object)value6), "layout_constraintRight_toRightOf");
        hashMap.put(Pair.create((Object)value6, (Object)value5), "layout_constraintRight_toLeftOf");
        final Integer value7 = 5;
        hashMap.put(Pair.create((Object)value7, (Object)value7), "layout_constraintBaseline_toBaselineOf");
        hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }
}
