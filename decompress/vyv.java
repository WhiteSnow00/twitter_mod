import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vyv implements ukp
{
    public final Map<ijl, List<ijl>> a;
    public final String b;
    public ijl c;
    
    public vyv() {
        final ijl e1 = ijl.E1;
        final yaa a = yaa.a;
        this.a = mlg.S(new awj[] { new awj((Object)e1, (Object)yaa.e), new awj((Object)ijl.M1, (Object)yaa.f), new awj((Object)ijl.L1, (Object)yaa.g), new awj((Object)ijl.K1, (Object)yaa.h), new awj((Object)ijl.O1, (Object)yaa.i), new awj((Object)ijl.N1, (Object)yaa.j) });
        this.b = "Unified Card Webview Sequence";
    }
    
    public final boolean a(final sp9 sp9) {
        e0e.f((Object)sp9, "log");
        final String a = sp9.a;
        if (this.c == null) {
            final ijl value = ijl.valueOf(a);
            final ijl e1 = ijl.E1;
            if (value == e1) {
                this.c = e1;
                return true;
            }
        }
        final ijl c = this.c;
        if (c != null) {
            Object f0;
            if ((f0 = this.a.get(c)) == null) {
                f0 = h3a.F0;
            }
            boolean b = false;
            Label_0140: {
                if (!((Collection)f0).isEmpty()) {
                    final Iterator iterator = ((Iterable)f0).iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next() == ijl.valueOf(a)) {
                            b = true;
                            break Label_0140;
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
                this.c = ijl.valueOf(a);
                return true;
            }
        }
        return false;
    }
    
    public final String b() {
        return this.b;
    }
    
    public final ijl c() {
        return this.c;
    }
}
