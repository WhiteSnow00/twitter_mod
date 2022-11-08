import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fpp implements oax
{
    public final String a;
    public final List<w9p> b;
    public final boolean c;
    public final boolean d;
    
    public fpp() {
        this(null, null, false, false, 15, null);
    }
    
    public fpp(final String a, final List<w9p> b, final boolean c, final boolean d) {
        zzd.f((Object)a, "query");
        zzd.f((Object)b, "results");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fpp)) {
            return false;
        }
        final fpp fpp = (fpp)o;
        return zzd.a((Object)this.a, (Object)fpp.a) && zzd.a((Object)this.b, (Object)fpp.b) && this.c == fpp.c && this.d == fpp.d;
    }
    
    @Override
    public final int hashCode() {
        final int m = hy8.m((List)this.b, this.a.hashCode() * 31, 31);
        final int c = this.c ? 1 : 0;
        int n = 1;
        int n2 = c;
        if (c != 0) {
            n2 = 1;
        }
        final int d = this.d ? 1 : 0;
        if (d == 0) {
            n = d;
        }
        return (m + n2) * 31 + n;
    }
    
    @Override
    public final String toString() {
        return mag.k(gp.B("SettingsSearchResultsViewState(query=", this.a, ", results=", (List)this.b, ", isEmpty="), this.c, ", isNoResults=", this.d, ")");
    }
}
