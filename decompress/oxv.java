import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oxv implements hjp
{
    public final Map<jil, List<jil>> a;
    public final String b;
    public jil c;
    
    public oxv() {
        final jil b1 = jil.B1;
        final kaa a = kaa.a;
        this.a = vkg.k1(new gvj[] { new gvj((Object)b1, (Object)kaa.e), new gvj((Object)jil.J1, (Object)kaa.f), new gvj((Object)jil.I1, (Object)kaa.g), new gvj((Object)jil.H1, (Object)kaa.h), new gvj((Object)jil.L1, (Object)kaa.i), new gvj((Object)jil.K1, (Object)kaa.j) });
        this.b = "Unified Card Webview Sequence";
    }
    
    @Override
    public final boolean a(final hp9 hp9) {
        zzd.f((Object)hp9, "log");
        final String a = hp9.a;
        if (this.c == null) {
            final jil value = jil.valueOf(a);
            final jil b1 = jil.B1;
            if (value == b1) {
                this.c = b1;
                return true;
            }
        }
        final jil c = this.c;
        if (c != null) {
            Object c2;
            if ((c2 = this.a.get(c)) == null) {
                c2 = v2a.C0;
            }
            boolean b2 = false;
            Label_0136: {
                if (!((Collection)c2).isEmpty()) {
                    final Iterator iterator = ((Iterable)c2).iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next() == jil.valueOf(a)) {
                            b2 = true;
                            break Label_0136;
                        }
                    }
                }
                b2 = false;
            }
            Boolean value2 = b2;
            if (!value2) {
                value2 = null;
            }
            if (value2 != null) {
                value2.booleanValue();
                this.c = jil.valueOf(a);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final String b() {
        return this.b;
    }
    
    @Override
    public final jil c() {
        return this.c;
    }
}
