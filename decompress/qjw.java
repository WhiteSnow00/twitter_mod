// 
// Decompiled by Procyon v0.6.0
// 

public final class qjw
{
    public final String a;
    public final u33 b;
    public final k7 c;
    
    public qjw(final String a, final u33 b, final k7 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof qjw)) {
            return false;
        }
        final qjw qjw = (qjw)o;
        return zzd.a((Object)this.a, (Object)qjw.a) && zzd.a((Object)this.b, (Object)qjw.b) && zzd.a((Object)this.c, (Object)qjw.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final u33 b = this.b;
        final k7 c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("UserUpdateAboutModuleParams(moduleId=");
        sb.append(a);
        sb.append(", venueData=");
        sb.append(b);
        sb.append(", config=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
