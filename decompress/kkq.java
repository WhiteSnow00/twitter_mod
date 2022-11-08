import j$.util.Map$_EL;
import java.util.Objects;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kkq implements jkq
{
    public static final d Companion;
    public static final gxe<List<tbu>> a;
    public static final gxe<Map<tbu, tbu>> b;
    public static final gxe<Map<tbu, tbu>> c;
    
    static {
        Companion = new d();
        kkq.a = (u3s)rp2.z0((otb)kkq$a.C0);
        kkq.b = (u3s)rp2.z0((otb)kkq$b.C0);
        kkq.c = (u3s)rp2.z0((otb)kkq$c.C0);
    }
    
    public final ckq a(final tbu tbu) {
        zzd.f((Object)tbu, "gatedTweetAction");
        Objects.requireNonNull(fkq.Companion);
        return ((fkq)Map$_EL.getOrDefault((Map)fkq.G0.getValue(), (Object)tbu, (Object)fkq.H0)).E0;
    }
    
    public final boolean b(final tbu tbu) {
        zzd.f((Object)tbu, "action");
        Objects.requireNonNull(kkq.Companion);
        return ((List)kkq.a.getValue()).contains(tbu) ^ true;
    }
    
    public final tbu c(final tbu tbu) {
        zzd.f((Object)tbu, "action");
        Objects.requireNonNull(kkq.Companion);
        return (tbu)Map$_EL.getOrDefault((Map)kkq.c.getValue(), (Object)tbu, (Object)fkq.H0.D0);
    }
    
    public static final class d
    {
    }
}
