import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class deq
{
    public static final rlp<deq> i;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List<z6d> e;
    public final String f;
    public final List<oeb> g;
    public final qof h;
    
    static {
        deq.i = (nw6)lw6.b(new glp[] { new glp((Class)deq.class, (rlp)new deq.deq$b()) });
    }
    
    public deq(final deq.deq$a deq$a) {
        this.a = deq$a.a;
        this.b = deq$a.b;
        this.c = deq$a.c;
        this.d = deq$a.d;
        this.e = deq$a.e;
        this.g = deq$a.g;
        this.f = deq$a.f;
        this.h = deq$a.h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && deq.class == o.getClass()) {
            final deq deq = (deq)o;
            if (!c5j.a((Object)this.a, (Object)deq.a) || !c5j.a((Object)this.b, (Object)deq.b) || !c5j.a((Object)this.e, (Object)deq.e) || !c5j.a((Object)this.c, (Object)deq.c) || !c5j.a((Object)this.d, (Object)deq.d) || !c5j.a((Object)this.f, (Object)deq.f) || !c5j.a((Object)this.g, (Object)deq.g) || !c5j.a((Object)this.h, (Object)deq.h)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.l((Object)this.a, (Object)this.b, (Object)this.e, (Object)this.c, (Object)this.d, (Object)this.f, (Object)this.h);
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("Slate{id='");
        toe.j(j, this.a, '\'', ", label='");
        toe.j(j, this.b, '\'', ", title='");
        toe.j(j, this.c, '\'', ", displayName='");
        toe.j(j, this.d, '\'', ", variants=");
        j.append(this.e);
        j.append(", focusRects=");
        j.append(this.g);
        j.append(", tweetId=");
        j.append(this.f);
        j.append(", attribution");
        j.append(this.h);
        j.append('}');
        return j.toString();
    }
}
