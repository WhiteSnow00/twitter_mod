// 
// Decompiled by Procyon v0.6.0
// 

public final class kkw
{
    public final String a;
    public final l33 b;
    public final j7 c;
    
    public kkw(final String a, final l33 b, final j7 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof kkw)) {
            return false;
        }
        final kkw kkw = (kkw)o;
        return czd.a((Object)this.a, (Object)kkw.a) && czd.a((Object)this.b, (Object)kkw.b) && czd.a((Object)this.c, (Object)kkw.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final l33 b = this.b;
        final j7 c = this.c;
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
