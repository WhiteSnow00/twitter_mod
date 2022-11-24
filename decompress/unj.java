// 
// Decompiled by Procyon v0.6.0
// 

public final class unj
{
    public final String a;
    public final pnj b;
    public final Long c;
    public final ynj d;
    public final rnj e;
    public final tnj f;
    
    public unj(final String a, final pnj b, final Long c, final ynj d, final rnj e, final tnj f) {
        e0e.f((Object)a, "messageId");
        e0e.f((Object)f, "limits");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof unj)) {
            return false;
        }
        final unj unj = (unj)o;
        return e0e.a((Object)this.a, (Object)unj.a) && e0e.a((Object)this.b, (Object)unj.b) && e0e.a((Object)this.c, (Object)unj.c) && e0e.a((Object)this.d, (Object)unj.d) && e0e.a((Object)this.e, (Object)unj.e) && e0e.a((Object)this.f, (Object)unj.f);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final pnj b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Long c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return this.f.hashCode() + (this.e.hashCode() + (this.d.hashCode() + ((hashCode * 31 + hashCode3) * 31 + hashCode2) * 31) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final pnj b = this.b;
        final Long c = this.c;
        final ynj d = this.d;
        final rnj e = this.e;
        final tnj f = this.f;
        final StringBuilder sb = new StringBuilder();
        sb.append("OpenbackMessage(messageId=");
        sb.append(a);
        sb.append(", dates=");
        sb.append(b);
        sb.append(", delayAfterTrigger=");
        sb.append(c);
        sb.append(", openbackSignals=");
        sb.append(d);
        sb.append(", expiration=");
        sb.append(e);
        sb.append(", limits=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }
}
