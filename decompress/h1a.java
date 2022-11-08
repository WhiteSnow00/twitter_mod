import android.text.Editable;
import android.annotation.SuppressLint;
import android.text.Editable$Factory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h1a extends Editable$Factory
{
    public static final Object a;
    public static volatile h1a b;
    public static Class<?> c;
    
    static {
        a = new Object();
    }
    
    @SuppressLint({ "PrivateApi" })
    public h1a() {
        try {
            h1a.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, h1a.class.getClassLoader());
        }
        finally {}
    }
    
    public final Editable newEditable(final CharSequence charSequence) {
        final Class<?> c = h1a.c;
        if (c != null) {
            return (Editable)new rzq((Class)c, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
