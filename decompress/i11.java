// 
// Decompiled by Procyon v0.6.0
// 

public final class i11
{
    public final String a;
    public final String b;
    public final boolean c;
    
    public i11(final String a, final String b, final boolean c) {
        czd.f((Object)a, "name");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i11)) {
            return false;
        }
        final i11 i11 = (i11)o;
        return czd.a((Object)this.a, (Object)i11.a) && czd.a((Object)this.b, (Object)i11.b) && this.c == i11.c;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        return (hashCode * 31 + hashCode2) * 31 + c;
    }
    
    @Override
    public final String toString() {
        return wnj.D(tqf.q("AudioSpaceFeedFilter(name=", this.a, ", icon=", this.b, ", selected="), this.c, ")");
    }
}
