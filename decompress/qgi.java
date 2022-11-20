// 
// Decompiled by Procyon v0.6.0
// 

public final class qgi
{
    public final String a;
    public final String b;
    public final String c;
    
    public qgi(final String a, final String b, final String c) {
        czd.f((Object)a, "title");
        czd.f((Object)b, "description");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof qgi)) {
            return false;
        }
        final qgi qgi = (qgi)o;
        return czd.a((Object)this.a, (Object)qgi.a) && czd.a((Object)this.b, (Object)qgi.b) && czd.a((Object)this.c, (Object)qgi.c);
    }
    
    @Override
    public final int hashCode() {
        final int f = hmg.f(this.b, this.a.hashCode() * 31, 31);
        final String c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return f + hashCode;
    }
    
    @Override
    public final String toString() {
        return ed.B(tqf.q("NewsletterInfo(title=", this.a, ", description=", this.b, ", author="), this.c, ")");
    }
}
