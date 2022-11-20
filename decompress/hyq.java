// 
// Decompiled by Procyon v0.6.0
// 

public final class hyq implements jbx
{
    public final String a;
    public final String b;
    
    public hyq(final String a, final String b) {
        czd.f((Object)a, "title");
        czd.f((Object)b, "subtitle");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hyq)) {
            return false;
        }
        final hyq hyq = (hyq)o;
        return czd.a((Object)this.a, (Object)hyq.a) && czd.a((Object)this.b, (Object)hyq.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return zh8.o("SpacesTabSectionHeaderViewState(title=", this.a, ", subtitle=", this.b, ")");
    }
}
