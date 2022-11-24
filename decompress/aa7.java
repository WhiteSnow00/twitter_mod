// 
// Decompiled by Procyon v0.6.0
// 

public final class aa7
{
    public static final k5j<aa7> c;
    public final String a;
    public final String b;
    
    static {
        aa7.c = new aa7.aa7$a();
    }
    
    public aa7(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && aa7.class == o.getClass()) {
            final aa7 aa7 = (aa7)o;
            return o5j.a((Object)this.a, (Object)aa7.a) && o5j.a((Object)this.b, (Object)aa7.b);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.g((Object)this.a, (Object)this.b);
    }
}
