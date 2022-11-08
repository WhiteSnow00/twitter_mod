import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lwm
{
    public static final a Companion;
    public final ift a;
    public final b22 b;
    public final hft c;
    public final glg d;
    public final ug3 e;
    
    static {
        Companion = new a();
    }
    
    public lwm(final ift a, final b22 b, final hft c, final glg d, final ug3 e) {
        zzd.f((Object)a, "toggleMuteListItemHydrator");
        zzd.f((Object)b, "blockUserItemHydrator");
        zzd.f((Object)c, "toggleFollowTopicItemHydrator");
        zzd.f((Object)d, "markNotInterestedItemHydrator");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final iva a(final iva iva) {
        final nwm k = iva.k;
        iva iva2;
        if (k instanceof vwm) {
            final ift a = this.a;
            Objects.requireNonNull(a);
            iva2 = eta.c((mwm)a, iva, k);
        }
        else if (k instanceof owm) {
            final b22 b = this.b;
            Objects.requireNonNull(b);
            iva2 = eta.c((mwm)b, iva, k);
        }
        else if (k instanceof twm) {
            final hft c = this.c;
            Objects.requireNonNull(c);
            iva2 = eta.c((mwm)c, iva, k);
        }
        else if (k instanceof pwm) {
            final glg d = this.d;
            Objects.requireNonNull(d);
            iva2 = eta.c((mwm)d, iva, k);
        }
        else {
            iva2 = iva;
            if (k instanceof rwm) {
                final ug3 e = this.e;
                Objects.requireNonNull(e);
                iva2 = eta.c((mwm)e, iva, k);
            }
        }
        return iva2;
    }
    
    public static final class a
    {
    }
}
