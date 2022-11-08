// 
// Decompiled by Procyon v0.6.0
// 

public final class z62 implements oax
{
    public final boolean a;
    
    public z62() {
        this.a = false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof z62 && this.a == ((z62)o).a);
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
        return mb0.x("BookmarkViewState(subscribed=", this.a, ")");
    }
}
