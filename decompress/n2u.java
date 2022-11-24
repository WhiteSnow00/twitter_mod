// 
// Decompiled by Procyon v0.6.0
// 

public final class n2u extends ort
{
    public final ult a;
    public boolean b;
    public int c;
    
    public n2u(final ult a, final int c) {
        this.a = a;
        this.c = c;
        this.b = false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && n2u.class == o.getClass()) {
            final n2u n2u = (n2u)o;
            if (!o5j.a((Object)this.a, (Object)n2u.a) || !o5j.a((Object)this.c, (Object)n2u.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.g((Object)this.a, (Object)this.c);
    }
}
