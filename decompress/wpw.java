// 
// Decompiled by Procyon v0.6.0
// 

public final class wpw extends pau
{
    public final String a;
    
    public wpw(final String a) {
        zzd.f((Object)a, "verbatim");
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof wpw && zzd.a((Object)this.a, (Object)((wpw)o).a));
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String toString() {
        return xpa.m(w48.g("VerbatimTtsAnnotation(verbatim="), this.a, ')');
    }
}
