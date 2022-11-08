import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j90<S> implements wyt$b<S>
{
    public final wyt<S> a;
    public dx b;
    public final cwj c;
    public final Map<S, q7r<iud>> d;
    public q7r<iud> e;
    
    public j90(final wyt<S> a, final dx b, final tve tve) {
        zzd.f((Object)a, "transition");
        zzd.f((Object)b, "contentAlignment");
        zzd.f((Object)tve, "layoutDirection");
        this.a = a;
        this.b = b;
        Objects.requireNonNull(iud.Companion);
        this.c = (cwj)nkz.r((Object)new iud(0L));
        this.d = new LinkedHashMap();
    }
    
    public final S a() {
        return (S)this.a.d().a();
    }
    
    public final S b() {
        return (S)this.a.d().b();
    }
}
