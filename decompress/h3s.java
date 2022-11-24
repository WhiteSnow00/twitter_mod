import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h3s implements zwv
{
    public final List<v2s> b;
    public final ls8 c;
    public final mba d;
    public final h5s e;
    public final h5s f;
    public final h5s g;
    public final h5s h;
    public final h5s i;
    
    public h3s(final List b, final ls8 c) {
        final mba q0 = mba.Q0;
        this.b = b;
        this.c = c;
        this.d = q0;
        this.e = (h5s)jty.N((ptb)new m3s(this));
        this.f = (h5s)jty.N((ptb)new k3s(this));
        this.g = (h5s)jty.N((ptb)new l3s(this));
        this.h = (h5s)jty.N((ptb)new i3s(this));
        this.i = (h5s)jty.N((ptb)new j3s(this));
    }
    
    public final ls8 a() {
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
        if (!(o instanceof h3s)) {
            return false;
        }
        final h3s h3s = (h3s)o;
        return e0e.a((Object)this.b, (Object)h3s.b) && e0e.a((Object)this.c, (Object)h3s.c) && this.d == h3s.d;
    }
    
    public final mba getName() {
        return this.d;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.b.hashCode();
        final ls8 c = this.c;
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
        final List<v2s> b = this.b;
        final ls8 c = this.c;
        final mba d = this.d;
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
    
    public static final class a extends zwv$a<h3s, a>
    {
        public List<v2s> b;
        
        public a() {
            super((ls8)null, 1, (wg8)null);
            this.b = null;
        }
        
        public a(final List list, final int n, final wg8 wg8) {
            super((ls8)null, 1, (wg8)null);
            this.b = null;
        }
        
        public final Object i() {
            final List<v2s> b = this.b;
            e0e.c((Object)b);
            return new h3s(b, super.a);
        }
        
        public final boolean k() {
            return !kr4.t((Collection)this.b);
        }
    }
}
