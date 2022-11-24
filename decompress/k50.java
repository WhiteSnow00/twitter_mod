// 
// Decompiled by Procyon v0.6.0
// 

public final class k50 implements ppk
{
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
        if (!e0e.a((Object)k50.class, (Object)class1)) {
            return false;
        }
        e0e.d(o, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        final k50 k50 = (k50)o;
        return e0e.a((Object)null, (Object)null);
    }
    
    @Override
    public final int hashCode() {
        throw null;
    }
    
    @Override
    public final String toString() {
        return "AndroidPointerIcon(pointerIcon=null)";
    }
}
