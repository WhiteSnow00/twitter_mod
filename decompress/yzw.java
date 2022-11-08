import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yzw implements hjp
{
    public final Map<jil, List<jil>> a;
    public final String b;
    public jil c;
    
    public yzw() {
        final jil d0 = jil.D0;
        final kaa a = kaa.a;
        this.a = vkg.k1(new gvj[] { new gvj((Object)d0, (Object)kaa.m), new gvj((Object)jil.M1, (Object)kaa.n), new gvj((Object)jil.N1, (Object)kaa.o), new gvj((Object)jil.v1, (Object)kaa.p) });
        this.b = "Video Impression Sequence";
    }
    
    @Override
    public final boolean a(final hp9 hp9) {
        zzd.f((Object)hp9, "log");
        final String a = hp9.a;
        if (this.c == null) {
            final jil value = jil.valueOf(a);
            final jil d0 = jil.D0;
            if (value == d0) {
                this.c = d0;
                return true;
            }
        }
        final jil c = this.c;
        if (c != null) {
            Object c2;
            if ((c2 = this.a.get(c)) == null) {
                c2 = v2a.C0;
            }
            boolean b = false;
            Label_0136: {
                if (!((Collection)c2).isEmpty()) {
                    final Iterator iterator = ((Iterable)c2).iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next() == jil.valueOf(a)) {
                            b = true;
                            break Label_0136;
                        }
                    }
                }
                b = false;
            }
            Boolean value2 = b;
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
