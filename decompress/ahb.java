// 
// Decompiled by Procyon v0.6.0
// 

public final class ahb implements oax
{
    public final boolean a;
    
    public ahb() {
        this.a = false;
    }
    
    public ahb(final boolean b, final int n, final hg8 hg8) {
        this.a = false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ahb && this.a == ((ahb)o).a);
    }
    
    @Override
    public final int hashCode() {
        int a;
        if ((a = (this.a ? 1 : 0)) != 0) {
            a = 1;
        }
        return a;
    }
    
    @Override
    public final String toString() {
        return mb0.x("FolderEmptyViewState(isEnabled=", this.a, ")");
    }
}
