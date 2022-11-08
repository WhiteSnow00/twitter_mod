// 
// Decompiled by Procyon v0.6.0
// 

public final class k7
{
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    
    public k7(final Boolean a, final Boolean b, final Boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k7)) {
            return false;
        }
        final k7 k7 = (k7)o;
        return zzd.a((Object)this.a, (Object)k7.a) && zzd.a((Object)this.b, (Object)k7.b) && zzd.a((Object)this.c, (Object)k7.c);
    }
    
    @Override
    public final int hashCode() {
        final Boolean a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Boolean b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Boolean c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final Boolean a = this.a;
        final Boolean b = this.b;
        final Boolean c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("AboutModuleConfigInputSimplifiedInput(enableSms=");
        sb.append(a);
        sb.append(", enableCall=");
        sb.append(b);
        sb.append(", enableLocationMap=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
