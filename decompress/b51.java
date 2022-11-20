import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import android.content.ComponentName;
import android.content.pm.PackageManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b51
{
    public final String a;
    public final String b;
    public final PackageManager c;
    public final ComponentName d;
    public ynj<l3j> e;
    public int f;
    public a g;
    public b h;
    public final boolean i;
    
    public b51(final String a, final String b, final PackageManager c, final ComponentName d, final boolean i) {
        this.f = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.i = i;
    }
    
    public static String a(final List<kvj<String, String>> list, final String s) {
        final kvj kvj = new kvj((Object)s, (Object)"");
        final nve c = m2j.c;
        final int a = c5j.a;
        final int binarySearch = Collections.binarySearch(list, kvj, (Comparator<? super kvj>)c);
        if (binarySearch >= 0 && binarySearch < list.size()) {
            final Object a2 = ((m2j)list.get(binarySearch)).a;
            jee.l(a2);
            if (((String)a2).equals(s)) {
                final Object b = ((m2j)list.get(binarySearch)).b;
                jee.l(b);
                return (String)b;
            }
        }
        return null;
    }
    
    public final void b(final b h) {
        cj1.f();
        this.h = h;
        if (h != null) {
            final int f = this.f;
            if (f >= 0) {
                ((bj0)h).X4(f, this.g);
            }
            else {
                final ynj<l3j> e = this.e;
                if (e != null) {
                    ((bj0)h).Y4((l3j)e.h((Object)null));
                }
            }
        }
    }
    
    public static final class a
    {
        public final hev a;
        public final String b;
        public final long c;
        
        public a(final hev a, final String b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public interface b
    {
    }
}
