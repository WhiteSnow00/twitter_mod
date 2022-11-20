// 
// Decompiled by Procyon v0.6.0
// 

public final class fmo
{
    public final String a;
    public final hmo b;
    public final String c;
    public final String d;
    
    public fmo(final String a, final hmo b, final String c, final String d) {
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
        if (!(o instanceof fmo)) {
            return false;
        }
        final fmo fmo = (fmo)o;
        return czd.a((Object)this.a, (Object)fmo.a) && czd.a((Object)this.b, (Object)fmo.b) && czd.a((Object)this.c, (Object)fmo.c) && czd.a((Object)this.d, (Object)fmo.d);
    }
    
    @Override
    public final int hashCode() {
        return this.d.hashCode() + hmg.f(this.c, (this.b.hashCode() + this.a.hashCode() * 31) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final hmo b = this.b;
        final String c = this.c;
        final String d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("RuleDetail(header=");
        sb.append(a);
        sb.append(", ruleSummary=");
        sb.append(b);
        sb.append(", ruleLink=");
        return mb0.C(sb, c, ", exampleTweetText=", d, ")");
    }
}
