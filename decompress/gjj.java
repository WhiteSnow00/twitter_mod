import androidx.fragment.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjj extends oob
{
    public final Fragment F0;
    
    public gjj(final Fragment f0) {
        e0e.f((Object)f0, "fragment");
        this.F0 = f0;
    }
    
    public final Fragment a() {
        return this.F0;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof gjj && e0e.a((Object)this.F0, (Object)((gjj)o).F0));
    }
    
    public final int hashCode() {
        return this.F0.hashCode();
    }
    
    public final String toString() {
        return rk0.C("OnFragmentStarted(fragment=", this.F0, ")");
    }
}
