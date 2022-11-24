// 
// Decompiled by Procyon v0.6.0
// 

public final class p4d
{
    public static final a Companion;
    public static final b c;
    public final dqv a;
    public final fym<kgs> b;
    
    static {
        Companion = new a();
        c = new b();
    }
    
    public p4d(final dqv a, final fym<kgs> b) {
        e0e.f((Object)a, "icon");
        e0e.f((Object)b, "text");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof p4d)) {
            return false;
        }
        final p4d p4d = (p4d)o;
        return this.a == p4d.a && e0e.a((Object)this.b, (Object)p4d.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final dqv a = this.a;
        final fym<kgs> b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("IconLabel(icon=");
        sb.append(a);
        sb.append(", text=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
    
    public static final class b extends k5j<p4d>
    {
        public final Object d(final rmp rmp, final int n) {
            e0e.f((Object)rmp, "input");
            final dqv a = dqv.Companion.a(rmp.C());
            final Object b = rmp.B((nmp)fym.I0);
            e0e.e(b, "input.readNotNullObject(\u2026hText.DEFAULT_SERIALIZER)");
            return new p4d(a, (fym<kgs>)b);
        }
        
        public final void f(final smp smp, final Object o) {
            final p4d p4d = (p4d)o;
            e0e.f((Object)smp, "output");
            e0e.f((Object)p4d, "label");
            smp.G(p4d.a.name());
            smp.C((Object)p4d.b, (nmp)fym.I0);
        }
    }
}
