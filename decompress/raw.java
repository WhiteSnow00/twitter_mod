// 
// Decompiled by Procyon v0.6.0
// 

public final class raw
{
    public final e43 a;
    public final i7 b;
    public final boolean c;
    
    public raw(final e43 a, final i7 b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof raw)) {
            return false;
        }
        final raw raw = (raw)o;
        return e0e.a((Object)this.a, (Object)raw.a) && e0e.a((Object)this.b, (Object)raw.b) && this.c == raw.c;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        return (hashCode2 + hashCode * 31) * 31 + c;
    }
    
    @Override
    public final String toString() {
        final e43 a = this.a;
        final i7 b = this.b;
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("UserCreateAboutModuleParams(venueData=");
        sb.append(a);
        sb.append(", config=");
        sb.append(b);
        sb.append(", visibleOnCreation=");
        return xj0.B(sb, c, ")");
    }
}
