import android.text.TextPaint;
import java.util.Iterator;
import android.text.style.LocaleSpan;
import android.os.LocaleList;
import java.util.Arrays;
import java.util.Locale;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v5g
{
    public static final v5g a;
    
    static {
        a = new v5g();
    }
    
    public final Object a(final s5g s5g) {
        e0e.f((Object)s5g, "localeList");
        final ArrayList list = new ArrayList(nr4.d1((Iterable)s5g, 10));
        final Iterator<Object> iterator = ((Iterable<Object>)s5g).iterator();
        while (iterator.hasNext()) {
            list.add(tpz.V(iterator.next()));
        }
        final Object[] array = list.toArray(new Locale[0]);
        e0e.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final Locale[] array2 = (Locale[])array;
        return new LocaleSpan(new LocaleList((Locale[])Arrays.copyOf(array2, array2.length)));
    }
    
    public final void b(final y60 y60, final s5g s5g) {
        e0e.f((Object)y60, "textPaint");
        e0e.f((Object)s5g, "localeList");
        final ArrayList list = new ArrayList(nr4.d1((Iterable)s5g, 10));
        final Iterator<Object> iterator = ((Iterable<Object>)s5g).iterator();
        while (iterator.hasNext()) {
            list.add(tpz.V(iterator.next()));
        }
        final Object[] array = list.toArray(new Locale[0]);
        e0e.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final Locale[] array2 = (Locale[])array;
        ((TextPaint)y60).setTextLocales(new LocaleList((Locale[])Arrays.copyOf(array2, array2.length)));
    }
}
