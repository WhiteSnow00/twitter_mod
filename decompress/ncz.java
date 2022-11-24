import java.io.IOException;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ncz implements b5j<mmz>
{
    public static final ncz a;
    public static final lxa b;
    public static final lxa c;
    public static final lxa d;
    
    static {
        final vry f0 = vry.F0;
        a = new ncz();
        final cry cry = new cry(3, f0);
        final HashMap hashMap = new HashMap();
        hashMap.put(cry.annotationType(), cry);
        b = new lxa("languageOption", wa0.A(hashMap), null);
        final cry cry2 = new cry(4, f0);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put(cry2.annotationType(), cry2);
        c = new lxa("isUsingLegacyApi", wa0.A(hashMap2), null);
        final cry cry3 = new cry(5, f0);
        final HashMap hashMap3 = new HashMap();
        hashMap3.put(cry3.annotationType(), cry3);
        d = new lxa("sdkVersion", wa0.A(hashMap3), null);
    }
    
    public final void a(final Object o, final Object o2) throws IOException {
        final mmz mmz = (mmz)o;
        final c5j c5j = (c5j)o2;
        c5j.a(ncz.b, mmz.a);
        c5j.a(ncz.c, null);
        c5j.a(ncz.d, null);
    }
}
