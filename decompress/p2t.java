// 
// Decompiled by Procyon v0.6.0
// 

public final class p2t
{
    public static final a c;
    public final String a;
    public final String b;
    
    static {
        c = new a();
    }
    
    public p2t(final String a, final String b) {
        e0e.f((Object)a, "timelineKey");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof p2t)) {
            return false;
        }
        final p2t p2t = (p2t)o;
        return e0e.a((Object)this.a, (Object)p2t.a) && e0e.a((Object)this.b, (Object)p2t.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        return dvc.d("TimelineQuery(timelineKey=", this.a, ", timelineContext=", this.b, ")");
    }
    
    public static final class a extends k5j<p2t>
    {
        public final Object d(final rmp rmp, final int n) {
            e0e.f((Object)rmp, "input");
            final String c = rmp.C();
            e0e.e((Object)c, "input.readNotNullString()");
            return new p2t(c, rmp.I());
        }
        
        public final void f(final smp smp, final Object o) {
            final p2t p2t = (p2t)o;
            e0e.f((Object)smp, "output");
            e0e.f((Object)p2t, "timelineQuery");
            smp.G(p2t.a);
            smp.G(p2t.b);
        }
    }
}
