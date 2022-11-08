// 
// Decompiled by Procyon v0.6.0
// 

public final class vn7
{
    public final rnj<ch7> a;
    public final rnj<Integer> b;
    public final rnj<String> c;
    
    public vn7() {
        this(null, 7);
    }
    
    public vn7(rnj a, final int n) {
        Object a2 = null;
        Object a3;
        if ((n & 0x1) != 0x0) {
            a3 = rnj$a.a;
        }
        else {
            a3 = null;
        }
        if ((n & 0x2) != 0x0) {
            a2 = rnj$a.a;
        }
        if ((n & 0x4) != 0x0) {
            a = (rnj)rnj$a.a;
        }
        zzd.f(a3, "central_event_options");
        zzd.f(a2, "count");
        zzd.f((Object)a, "cursor");
        this.a = (rnj<ch7>)a3;
        this.b = (rnj<Integer>)a2;
        this.c = (rnj<String>)a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vn7)) {
            return false;
        }
        final vn7 vn7 = (vn7)o;
        return zzd.a((Object)this.a, (Object)vn7.a) && zzd.a((Object)this.b, (Object)vn7.b) && zzd.a((Object)this.c, (Object)vn7.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final rnj<ch7> a = this.a;
        final rnj<Integer> b = this.b;
        final rnj<String> c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("DMEventSliceViewInput(central_event_options=");
        sb.append(a);
        sb.append(", count=");
        sb.append(b);
        sb.append(", cursor=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
