// 
// Decompiled by Procyon v0.6.0
// 

public final class fvo implements oax
{
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    
    public fvo(final String a, final String b, final String c, final boolean d) {
        zzd.f((Object)a, "roomId");
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
        if (!(o instanceof fvo)) {
            return false;
        }
        final fvo fvo = (fvo)o;
        return zzd.a((Object)this.a, (Object)fvo.a) && zzd.a((Object)this.b, (Object)fvo.b) && zzd.a((Object)this.c, (Object)fvo.c) && this.d == fvo.d;
    }
    
    @Override
    public final int hashCode() {
        final int a = l7k.a(this.c, l7k.a(this.b, this.a.hashCode() * 31, 31), 31);
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        return a + d;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final boolean d = this.d;
        final StringBuilder y = mb0.y("ScheduledSpaceItemViewState(roomId=", a, ", title=", b, ", scheduledStartTime=");
        y.append(c);
        y.append(", isPastScheduledTime=");
        y.append(d);
        y.append(")");
        return y.toString();
    }
}
