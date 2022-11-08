import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kpi
{
    public static final a Companion;
    public final int a;
    public final int b;
    
    static {
        Companion = new a();
    }
    
    public kpi(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final tfe tfe) throws IOException {
        tfe.r0();
        tfe.T("ntab", this.a);
        tfe.T("launcher", this.b);
        tfe.h();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof kpi)) {
            return false;
        }
        final kpi kpi = (kpi)o;
        return this.a == kpi.a && this.b == kpi.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        return k1b.f("NotificationBadgeCountScribeDetails(ntabCount=", this.a, ", launcherCount=", this.b, ")");
    }
    
    public static final class a
    {
    }
}
