// 
// Decompiled by Procyon v0.6.0
// 

public final class tt7 extends lk1
{
    public static final nmp<tt7> d;
    public final st7 c;
    
    static {
        tt7.d = new tt7.tt7$b();
    }
    
    public tt7(final tt7.tt7$a tt7$a) {
        super((lk1.a)tt7$a);
        final st7 b = tt7$a.b;
        vmw.g((Object)b);
        this.c = b;
    }
    
    public final void a() {
    }
    
    public final boolean equals(final Object o) {
        return super.equals(o) && (this == o || (o instanceof tt7 && o5j.a((Object)this.c, (Object)((tt7)o).c)));
    }
    
    public final int hashCode() {
        return o5j.g((Object)super.hashCode(), (Object)this.c);
    }
}
