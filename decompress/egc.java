import java.util.Locale;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class egc extends tnm<Long, List<ufc>, pnm<List<ufc>, zbv>>
{
    public final v5f G0;
    
    public egc(final v5f g0) {
        this.G0 = g0;
    }
    
    @Override
    public final osc c(final Object o) {
        final Long n = (Long)o;
        Object o2;
        if (ita.b().b("android_hashflags_service_api_enabled", false)) {
            o2 = new egc.egc$b(((a6d)cgw.a().c((Class)a6d.class)).k());
        }
        else {
            final v5f g0 = this.G0;
            final long longValue = n;
            Objects.requireNonNull(g0);
            o2 = new egc.egc$c(String.format(Locale.ENGLISH, "https://pbs.twimg.com/hashflag/config-%s.json", v5f.a.format(longValue)));
        }
        return (osc)o2;
    }
    
    @Override
    public final Object d(final osc osc) {
        return ((egc.egc$a)osc).D();
    }
}
