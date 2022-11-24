// 
// Decompiled by Procyon v0.6.0
// 

public final class grw extends ybu
{
    public final String a;
    
    public grw(final String a) {
        e0e.f((Object)a, "verbatim");
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof grw && e0e.a((Object)this.a, (Object)((grw)o).a));
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String toString() {
        return qee.s(ehk.f("VerbatimTtsAnnotation(verbatim="), this.a, ')');
    }
}
