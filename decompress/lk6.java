// 
// Decompiled by Procyon v0.6.0
// 

public final class lk6
{
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    
    public lk6(final String a, final boolean b, final boolean c, final boolean d, final boolean e) {
        zzd.f((Object)a, "broadcastId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lk6)) {
            return false;
        }
        final lk6 lk6 = (lk6)o;
        return zzd.a((Object)this.a, (Object)lk6.a) && this.b == lk6.b && this.c == lk6.c && this.d == lk6.d && this.e == lk6.e;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b ? 1 : 0;
        int n = 1;
        int n2 = b;
        if (b != 0) {
            n2 = 1;
        }
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        final int e = this.e ? 1 : 0;
        if (e == 0) {
            n = e;
        }
        return (((hashCode * 31 + n2) * 31 + c) * 31 + d) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final boolean d = this.d;
        final boolean e = this.e;
        final StringBuilder y = rb0.y("ConsumptionPreviewArgs(broadcastId=", a, ", bypassPreview=", b, ", fromSpacesTab=");
        lo0.z(y, c, ", isEntity=", d, ", isCommunitySpace=");
        return bd.y(y, e, ")");
    }
}
