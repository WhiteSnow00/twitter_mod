// 
// Decompiled by Procyon v0.6.0
// 

public final class c62 implements jbx
{
    public final f62$d a;
    
    public c62() {
        final f62$d$f a = new f62$d$f();
        this.a = (f62$d)a;
    }
    
    public c62(final f62$d a) {
        this.a = a;
    }
    
    public c62(final f62$d f62$d, final int n, final rf8 rf8) {
        final f62$d$f a = new f62$d$f();
        this.a = (f62$d)a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof c62 && czd.a((Object)this.a, (Object)((c62)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final f62$d a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("BookmarkFolderViewState(shownView=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
