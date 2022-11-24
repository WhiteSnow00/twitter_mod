import java.util.Arrays;
import java.util.List;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class q7b implements u80
{
    public final int F0;
    public Object G0;
    
    public q7b() {
        this.F0 = 2;
    }
    
    public q7b(final gcu g0) {
        this.F0 = 4;
        e0e.f((Object)g0, "twPreferences");
        this.G0 = g0;
    }
    
    public q7b(final Object o) {
        this.F0 = 1;
        this(Collections.singletonList(new zre(o)), 1);
    }
    
    public q7b(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public abstract float a(final Object p0);
    
    public abstract void b(final Object p0, final float p1);
    
    public abstract void c();
    
    public abstract void d();
    
    public final boolean f() {
        final boolean empty = ((List)this.G0).isEmpty();
        final boolean b = false;
        if (!empty) {
            boolean b2 = b;
            if (((List)this.G0).size() != 1) {
                return b2;
            }
            b2 = b;
            if (!((List)this.G0).get(0).c()) {
                return b2;
            }
        }
        return true;
    }
    
    public final List h() {
        return (List)this.G0;
    }
    
    @Override
    public final String toString() {
        switch (this.F0) {
            default: {
                return super.toString();
            }
            case 1: {
                final StringBuilder sb = new StringBuilder();
                if (!((List)this.G0).isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(((List)this.G0).toArray()));
                }
                return sb.toString();
            }
        }
    }
}
