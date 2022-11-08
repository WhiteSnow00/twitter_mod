// 
// Decompiled by Procyon v0.6.0
// 

public final class qpi
{
    public final String a;
    public final String b;
    public final String c;
    
    public qpi(final String a, final String b, final String c) {
        zzd.f((Object)a, "id");
        zzd.f((Object)b, "name");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof qpi)) {
            return false;
        }
        final qpi qpi = (qpi)o;
        return zzd.a((Object)this.a, (Object)qpi.a) && zzd.a((Object)this.b, (Object)qpi.b) && zzd.a((Object)this.c, (Object)qpi.c);
    }
    
    @Override
    public final int hashCode() {
        final int a = l7k.a(this.b, this.a.hashCode() * 31, 31);
        final String c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return a + hashCode;
    }
    
    @Override
    public final String toString() {
        return hi.I(mb0.y("NotificationChannelGroup(id=", this.a, ", name=", this.b, ", description="), this.c, ")");
    }
}
