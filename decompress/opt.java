import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class opt
{
    public static final nmp<opt> c;
    public final List<qgv> a;
    public final c9t b;
    
    static {
        opt.c = new opt.opt$b();
    }
    
    public opt(final opt.opt$a opt$a) {
        final List a = opt$a.a;
        vmw.g((Object)a);
        this.a = a;
        this.b = opt$a.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && opt.class == o.getClass()) {
            final opt opt = (opt)o;
            if (!o5j.a((Object)this.a, (Object)opt.a) || !o5j.a((Object)this.b, (Object)opt.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.g((Object)this.a, (Object)this.b);
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("TopicPageHeaderFacepile{users=");
        f.append(this.a);
        f.append(", facepileUrl=");
        f.append(this.b);
        f.append('}');
        return f.toString();
    }
}
