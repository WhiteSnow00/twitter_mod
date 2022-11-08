import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ah0
{
    public final String a;
    public final List<Integer> b;
    public final String c;
    public final String d;
    
    public ah0(final String a, final List<Integer> b, final String c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ah0)) {
            return false;
        }
        final ah0 ah0 = (ah0)o;
        return zzd.a((Object)this.a, (Object)ah0.a) && zzd.a((Object)this.b, (Object)ah0.b) && zzd.a((Object)this.c, (Object)ah0.c) && zzd.a((Object)this.d, (Object)ah0.d);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final List<Integer> b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        return hi.J(gp.B("ApiMentionEntity(id_str=", this.a, ", indices=", (List)this.b, ", name="), this.c, ", screen_name=", this.d, ")");
    }
}
