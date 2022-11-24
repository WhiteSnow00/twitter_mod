// 
// Decompiled by Procyon v0.6.0
// 

public final class l50 implements ppk
{
    public final int a;
    
    public l50() {
        this.a = 1008;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        Class<?> class1;
        if (o != null) {
            class1 = o.getClass();
        }
        else {
            class1 = null;
        }
        if (!e0e.a((Object)l50.class, (Object)class1)) {
            return false;
        }
        e0e.d(o, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.a == ((l50)o).a;
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        return gwl.x(ehk.f("AndroidPointerIcon(type="), this.a, ')');
    }
}
