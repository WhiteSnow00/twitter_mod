import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u1s implements tvv
{
    public final List<i1s> b;
    public final wr8 c;
    public final waa d;
    public final u3s e;
    public final u3s f;
    public final u3s g;
    public final u3s h;
    public final u3s i;
    
    public u1s(final List b, final wr8 c) {
        final waa n0 = waa.N0;
        this.b = b;
        this.c = c;
        this.d = n0;
        this.e = (u3s)rp2.z0((otb)new z1s(this));
        this.f = (u3s)rp2.z0((otb)new x1s(this));
        this.g = (u3s)rp2.z0((otb)new y1s(this));
        this.h = (u3s)rp2.z0((otb)new v1s(this));
        this.i = (u3s)rp2.z0((otb)new w1s(this));
    }
    
    public final wr8 a() {
        return this.c;
    }
    
    public final boolean b() {
        return (boolean)this.g.getValue();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof u1s)) {
            return false;
        }
        final u1s u1s = (u1s)o;
        return zzd.a((Object)this.b, (Object)u1s.b) && zzd.a((Object)this.c, (Object)u1s.c) && this.d == u1s.d;
    }
    
    public final waa getName() {
        return this.d;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.b.hashCode();
        final wr8 c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        return this.d.hashCode() + (hashCode * 31 + hashCode2) * 31;
    }
    
    @Override
    public final String toString() {
        final List<i1s> b = this.b;
        final wr8 c = this.c;
        final waa d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("SwipeableMediaComponent(mediaList=");
        sb.append(b);
        sb.append(", destination=");
        sb.append(c);
        sb.append(", name=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a extends tvv.a<u1s, a>
    {
        public List<i1s> b;
        
        public a() {
            super(null, 1, null);
            this.b = null;
        }
        
        public a(final List list, final int n, final hg8 hg8) {
            super(null, 1, null);
            this.b = null;
        }
        
        public final Object i() {
            final List<i1s> b = this.b;
            zzd.c((Object)b);
            return new u1s(b, super.a);
        }
        
        public final boolean l() {
            return !hr4.t((Collection)this.b);
        }
    }
}
