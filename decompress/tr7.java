import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tr7 extends ek1
{
    public static final Set<String> i;
    public final wtg g;
    public final boolean h;
    
    static {
        i = aop.t((Object)"photo", (Object[])new String[] { "video", "animated_gif" });
    }
    
    public tr7(final tr7.tr7$a tr7$a) {
        super((ek1$a)tr7$a);
        this.h = ita.b().b("dm_voice_rendering_enabled", false);
        this.g = tr7$a.f;
    }
    
    public final rg7 a() {
        final int ordinal = ((Enum)this.g.V0).ordinal();
        if (ordinal == 1) {
            return rg7.H0;
        }
        if (ordinal == 2) {
            return rg7.J0;
        }
        if (ordinal != 3) {
            return rg7.F0;
        }
        if (this.g.o1 && this.h) {
            return rg7.O0;
        }
        return rg7.I0;
    }
    
    public final String d() {
        if (this.g.U0.b()) {
            return this.g.U0.a;
        }
        return this.g.T0;
    }
    
    public final beq e() {
        if (this.g.U0.b()) {
            return this.g.U0.b;
        }
        return this.g.W0;
    }
    
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof tr7)) {
                return b2;
            }
            final tr7 tr7 = (tr7)o;
            final boolean b3 = super.equals((Object)tr7) && this.g.m(tr7.g);
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    public final int hashCode() {
        return o5j.g((Object)super.hashCode(), (Object)this.g);
    }
}
