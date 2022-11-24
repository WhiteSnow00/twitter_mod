// 
// Decompiled by Procyon v0.6.0
// 

public final class fo7
{
    public final moj<lh7> a;
    public final moj<Integer> b;
    public final moj<String> c;
    
    public fo7() {
        this(null, 7);
    }
    
    public fo7(moj a, final int n) {
        Object a2 = null;
        Object a3;
        if ((n & 0x1) != 0x0) {
            a3 = moj$a.a;
        }
        else {
            a3 = null;
        }
        if ((n & 0x2) != 0x0) {
            a2 = moj$a.a;
        }
        if ((n & 0x4) != 0x0) {
            a = (moj)moj$a.a;
        }
        e0e.f(a3, "central_event_options");
        e0e.f(a2, "count");
        e0e.f((Object)a, "cursor");
        this.a = (moj<lh7>)a3;
        this.b = (moj<Integer>)a2;
        this.c = (moj<String>)a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fo7)) {
            return false;
        }
        final fo7 fo7 = (fo7)o;
        return e0e.a((Object)this.a, (Object)fo7.a) && e0e.a((Object)this.b, (Object)fo7.b) && e0e.a((Object)this.c, (Object)fo7.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final moj<lh7> a = this.a;
        final moj<Integer> b = this.b;
        final moj<String> c = this.c;
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
