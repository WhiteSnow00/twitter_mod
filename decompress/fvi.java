import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fvi
{
    public static final a Companion;
    public final String a;
    public final gvi b;
    public final double c;
    
    static {
        Companion = new a();
    }
    
    public fvi(final String a, final gvi b, final double c) {
        czd.f((Object)a, "notificationAction");
        czd.f((Object)b, "actionDetails");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fvi)) {
            return false;
        }
        final fvi fvi = (fvi)o;
        return czd.a((Object)this.a, (Object)fvi.a) && czd.a((Object)this.b, (Object)fvi.b) && Double.compare(this.c, fvi.c) == 0;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final long doubleToLongBits = Double.doubleToLongBits(this.c);
        return (hashCode2 + hashCode * 31) * 31 + (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final gvi b = this.b;
        final double c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("NotificationSmartAction(notificationAction=");
        sb.append(a);
        sb.append(", actionDetails=");
        sb.append(b);
        sb.append(", score=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
    
    public static final class b extends y4j<fvi>
    {
        public static final b b;
        
        static {
            b = new b();
        }
        
        public final Object d(final vlp vlp, final int n) {
            czd.f((Object)vlp, "input");
            final String a = vlp.A();
            czd.e((Object)a, "input.readNotNullString()");
            Objects.requireNonNull(gvi.Companion);
            final Object a2 = ((y4j)gvi.b.b).a(vlp);
            jee.l(a2);
            czd.e(a2, "input.readNotNullObject(\u2026ActionDetails.SERIALIZER)");
            return new fvi(a, (gvi)a2, vlp.v());
        }
        
        public final void f(final wlp wlp, final Object o) {
            final fvi fvi = (fvi)o;
            czd.f((Object)wlp, "output");
            czd.f((Object)fvi, "smartAction");
            final wlp e = wlp.E(fvi.a);
            final gvi b = fvi.b;
            Objects.requireNonNull(gvi.Companion);
            final gvi$a companion = gvi.Companion;
            final gvi.b b2 = gvi.b.b;
            Objects.requireNonNull(e);
            ((y4j)b2).c(e, (Object)b);
            final int a = c5j.a;
            e.v(fvi.c);
        }
    }
}
