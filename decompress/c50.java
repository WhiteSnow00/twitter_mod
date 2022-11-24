import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Style;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c50
{
    public static final int[] a;
    public static final int[] b;
    
    static {
        (new int[Paint$Style.values().length])[((Enum)Paint$Style.STROKE).ordinal()] = 1;
        final int[] a2 = new int[Paint$Cap.values().length];
        a2[((Enum)Paint$Cap.BUTT).ordinal()] = 1;
        a2[((Enum)Paint$Cap.ROUND).ordinal()] = 2;
        a2[((Enum)Paint$Cap.SQUARE).ordinal()] = 3;
        a = a2;
        final int[] b2 = new int[Paint$Join.values().length];
        b2[((Enum)Paint$Join.MITER).ordinal()] = 1;
        b2[((Enum)Paint$Join.BEVEL).ordinal()] = 2;
        b2[((Enum)Paint$Join.ROUND).ordinal()] = 3;
        b = b2;
    }
}
