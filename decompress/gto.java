import java.util.LinkedHashMap;
import android.util.SizeF;
import android.util.Size;
import android.util.SparseArray;
import java.io.Serializable;
import android.os.Parcelable;
import java.util.ArrayList;
import android.os.Bundle;
import android.os.Binder;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gto
{
    public static final a Companion;
    public static final Class<?>[] f;
    public final Map<String, Object> a;
    public final Map<String, nto.c> b;
    public final Map<String, Object> c;
    public final Map<String, quh<Object>> d;
    public final fto e;
    
    static {
        Companion = new a();
        f = new Class[] { Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class };
    }
    
    public gto() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new fto(this);
    }
    
    public static final class a
    {
    }
}
