import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class egg
{
    public final krm a;
    public final Map<wfg, fgg> b;
    public final xfg c;
    
    public egg(final krm a, final xfg$a xfg$a, final Map<wfg, fgg> b) {
        this.a = a;
        this.b = b;
        this.c = xfg$a.b();
    }
    
    public final jsj a(final wfg wfg) {
        final fgg fgg = this.b.get(wfg);
        if (fgg != null) {
            return fgg.a(this.a, this.c);
        }
        return null;
    }
}
