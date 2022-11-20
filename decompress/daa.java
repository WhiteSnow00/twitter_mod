// 
// Decompiled by Procyon v0.6.0
// 

public final class daa implements baa
{
    public final String f;
    public final String g;
    public final String h;
    
    public daa(final String f, final String g, final String h) {
        caa.h(f, "page", g, "section", h, "component");
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final String a() {
        return this.h;
    }
    
    public final String b() {
        return this.f;
    }
    
    public final String d() {
        return this.g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof daa)) {
            return false;
        }
        final daa daa = (daa)o;
        return czd.a((Object)this.f, (Object)daa.f) && czd.a((Object)this.g, (Object)daa.g) && czd.a((Object)this.h, (Object)daa.h);
    }
    
    @Override
    public final int hashCode() {
        return this.h.hashCode() + hmg.f(this.g, this.f.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        return ed.B(tqf.q("EventComponentPrefixImpl(page=", this.f, ", section=", this.g, ", component="), this.h, ")");
    }
}
